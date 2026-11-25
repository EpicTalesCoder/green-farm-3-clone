#!/usr/bin/env python3
"""Export source-indexed Green Farm 3 world and config records.

The local decoders mirror recovered source formats. They preserve numeric IDs;
semantic names are not guessed.
"""
import argparse
import json
import pathlib
import sys

sys.path.insert(0, str(pathlib.Path(__file__).resolve().parent))
from pack_loader import Pack  # noqa: E402


class Cursor:
    def __init__(self, data, pos=0):
        self.data = data
        self.pos = pos

    def take(self, size, label):
        end = self.pos + size
        if end > len(self.data):
            raise ValueError(f"truncated {label} at byte {self.pos}: need {size} bytes")
        value = self.data[self.pos:end]
        self.pos = end
        return value

    def u8(self, label):
        return self.take(1, label)[0]

    def u16(self, label):
        return int.from_bytes(self.take(2, label), "little")

    def skip(self, size, label):
        self.take(size, label)


WORLD_COMMAND_WIDTHS = {
    11: (2, 2),
    12: (2, 2),
    21: (2, 2),
    22: (1, 1),
    102: (2,),
    103: (2, 2, 2, 2),
    104: (2, 2, 2, 2),
    105: (2, 2, 2, 2),
    106: (2, 2),
    107: (2,),
    108: (2, 2, 2, 2),
    109: (2, 2, 2, 2),
    110: (2, 2, 2),
    111: (2, 2),
    112: (2, 2),
    113: (),
    114: (2, 2),
    115: (2, 2),
    116: (),
}


def decode_script(data):
    cursor = Cursor(data)
    outer_count = cursor.u8("outer script count")
    scripts = []
    for _ in range(outer_count):
        cursor.skip(2, "outer script header")
        group_count = cursor.u8("script group count")
        groups = []
        for _ in range(group_count):
            group_type = cursor.u8("script group type")
            context = None
            if group_type in (0, 1):
                context = cursor.u8("script group context")
            elif group_type == 2:
                cursor.skip(1, "type-2 script context marker")
                context = cursor.u16("type-2 script context")
            else:
                raise ValueError(f"unsupported script group type {group_type}")

            records = []
            for _ in range(cursor.u16("script record count")):
                event_key = cursor.u16("script event key")
                commands = []
                for _ in range(cursor.u8("script command count")):
                    source_offset = cursor.pos
                    opcode = cursor.u8("script command opcode")
                    widths = WORLD_COMMAND_WIDTHS.get(opcode)
                    if widths is None:
                        raise ValueError(f"unsupported script opcode {opcode} at {source_offset}")
                    args = [
                        cursor.u16("script command word") if width == 2
                        else cursor.u8("script command byte")
                        for width in widths
                    ]
                    commands.append({"opcode": opcode, "args": args, "source_offset": source_offset})
                records.append({"event_key": event_key, "commands": commands, "source_offset": cursor.pos})
            groups.append({"group_type": group_type, "context": context, "records": records, "source_offset": cursor.pos})
        scripts.append({"groups": groups, "source_offset": cursor.pos})

    if cursor.pos != len(data):
        raise ValueError(f"world script ended at {cursor.pos}, block is {len(data)} bytes")
    return {"outer_count": outer_count, "scripts": scripts}


def decode_entity_records(data):
    """Decode the observed 13-byte type-50 records without naming opaque data.

    The parser's complete semantic schema remains unresolved; the numeric
    offsets and apparent final byte are retained for evidence review only.
    """
    record_size = 13
    if len(data) % record_size:
        raise ValueError(f"entity block length {len(data)} is not divisible by {record_size}")
    records = []
    for offset in range(0, len(data), record_size):
        raw = data[offset:offset + record_size]
        if raw[0] != 50:
            raise ValueError(f"unexpected entity marker {raw[0]} at byte {offset}")
        records.append({
            "record_type": raw[0],
            "source_offset": offset,
            "opaque_key": int.from_bytes(raw[1:3], "little", signed=True),
            "x": int.from_bytes(raw[3:5], "little", signed=True),
            "y": int.from_bytes(raw[5:7], "little", signed=True),
            "unknown_byte": raw[7],
            "entity_category": raw[8],
            "entity_id": raw[9],
            "unknown_bytes": raw[10:12].hex(),
            "unresolved_trailing_byte": raw[12],
        })
    return {"record_size": record_size, "length": len(data), "records": records}


def resolve_category_15_entities(records, table, pack5_metadata):
    """Join type-32 records to numeric config and source sprite/frame IDs."""
    rows = table["rows"]
    instances = []
    for record in records["records"]:
        if record["entity_category"] != 32:
            continue
        entity_id = record["entity_id"]
        if entity_id >= len(rows):
            raise ValueError(f"category-15 entity ID {entity_id} has no config row")
        config = rows[entity_id]
        registry_index = config[1]
        frame_index = config[2]
        sprite_block = next(
            (block for block in pack5_metadata["frames_by_block"] if block["block"] == registry_index),
            None,
        )
        source_frame = None
        if sprite_block is not None and 0 <= frame_index < len(sprite_block["frames"]):
            frame = sprite_block["frames"][frame_index]
            first_fmodule = frame["first_frame_module"]
            last_fmodule = first_fmodule + frame["frame_module_count"]
            source_frame = {
                "block": registry_index,
                "frame": frame_index,
                **frame,
                "frame_bounds": sprite_block["frame_bounds"][frame_index]
                if sprite_block["frame_bounds"] else None,
                "frame_modules": [
                    {
                        **fmodule,
                        "module": sprite_block["modules"][fmodule["module_index"]],
                        "module_png": (
                            "5_b%03d_m%02d.png" % (registry_index, fmodule["module_index"])
                            if sprite_block["modules"][fmodule["module_index"]]["type"] == 0
                            else None
                        ),
                    }
                    for fmodule in sprite_block["frame_modules"][first_fmodule:last_fmodule]
                ],
                "module_pngs": sorted({
                    "5_b%03d_m%02d.png" % (registry_index, fmodule["module_index"])
                    for fmodule in sprite_block["frame_modules"][first_fmodule:last_fmodule]
                    if sprite_block["modules"][fmodule["module_index"]]["type"] == 0
                }),
            }
        instances.append({
            "world_record_offset": record["source_offset"],
            "entity_id": entity_id,
            "identity": "unresolved numeric world entity",
            "position": {"x": record["x"], "y": record["y"]},
            "config_table_id": 15,
            "config_row": entity_id,
            "config": config,
            "sprite_registry_index": registry_index,
            "frame_index": frame_index,
            "sprite_registry": {
                "registry_index": registry_index,
                "resource_group": "pack5",
                "resource_block": registry_index,
                "frame_index": frame_index,
                "source_frame": source_frame,
            },
            "animation_index": config[5],
            "entity_type": 32,
        })
    return instances


def decode_config_table(data):
    cursor = Cursor(data)
    row_count = int.from_bytes(cursor.take(4, "config row count"), "little")
    column_count = int.from_bytes(cursor.take(4, "config column count"), "little")
    widths = list(cursor.take(column_count, "config column widths"))
    if any(width not in (1, 2, 4) for width in widths):
        raise ValueError(f"unsupported config column widths: {widths}")
    rows = []
    for _ in range(row_count):
        row = []
        for width in widths:
            raw = cursor.take(width, "config cell")
            row.append(int.from_bytes(raw, "little", signed=True))
        rows.append(row)
    if cursor.pos != len(data):
        raise ValueError(f"config table ended at {cursor.pos}, block is {len(data)} bytes")
    return {"row_count": row_count, "column_count": column_count, "widths": widths, "rows": rows}


def main():
    parser = argparse.ArgumentParser(description="Decode Green Farm 3 world and config data")
    parser.add_argument("--pack", required=True, type=pathlib.Path, help="recovered /10 pack")
    parser.add_argument("--config-pack", required=True, type=pathlib.Path, help="recovered /9 pack")
    parser.add_argument("--script-block", type=int, default=15)
    parser.add_argument("--entity-block", type=int, default=16)
    parser.add_argument("--entity-config-table", type=int, default=15, help="/9 table loaded by g.a(tableId)")
    parser.add_argument("--pack5-frames", required=True, type=pathlib.Path, help="frame metadata JSON from decode_image.py")
    parser.add_argument("--output", required=True, type=pathlib.Path)
    args = parser.parse_args()

    pack = Pack(args.pack)
    config_pack = Pack(args.config_pack)
    entity_records = decode_entity_records(pack.block(args.entity_block))
    entity_config = decode_config_table(config_pack.block(args.entity_config_table))
    pack5_frames = json.loads(args.pack5_frames.read_text())
    entity_instances = resolve_category_15_entities(entity_records, entity_config, pack5_frames)
    result = {
        "source_pack": args.pack.name,
        "config_pack": args.config_pack.name,
        "script_block": args.script_block,
        "entity_block": args.entity_block,
        "entity_config_table": args.entity_config_table,
        "provenance": {
            "world_script_parser": "decompiled-cfr/a.java:17322-17548",
            "world_block_parser": "decompiled-cfr/a.java:1881-2005; structure unresolved",
            "entity_config_table": "decompiled-cfr/g.java:24-58, a.java:13431-13564",
            "sprite_registry": "decompiled-cfr/a.java:18029-18082; category-15 entity uses pack-5 registry",
            "world_block_access": "decompiled-cfr/f.java:526-545,593-595",
            "semantic_names": "not inferred; numeric IDs are retained as unknown source identifiers",
        },
        "world_script": decode_script(pack.block(args.script_block)),
        "entity_records": entity_records,
        "entity_config": entity_config,
        "category_15_instances": entity_instances,
    }
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(result, ensure_ascii=False, indent=2) + "\n")


if __name__ == "__main__":
    main()
