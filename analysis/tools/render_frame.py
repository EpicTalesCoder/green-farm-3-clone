#!/usr/bin/env python3
"""Compose one evidence-mapped image-only BSprite frame to SVG.

The output references the original decoded PNG modules; it does not rasterize
or alter source texture pixels. Unsupported module transforms and non-image
modules fail closed instead of emitting an incomplete composition.
"""
import argparse
import base64
import html
import json
import pathlib
import sys


def main():
    parser = argparse.ArgumentParser(description="Compose an original BSprite frame to SVG")
    parser.add_argument("--metadata", required=True, type=pathlib.Path)
    parser.add_argument("--pack", type=int, required=True)
    parser.add_argument("--block", type=int, required=True)
    parser.add_argument("--frame", type=int, required=True)
    parser.add_argument("--sprites", required=True, type=pathlib.Path)
    parser.add_argument("--output", required=True, type=pathlib.Path)
    args = parser.parse_args()

    data = json.loads(args.metadata.read_text())
    block = next((item for item in data["frames_by_block"] if item["block"] == args.block), None)
    if block is None:
        raise SystemExit(f"no exported pack-{args.pack} block {args.block}")
    if args.frame < 0 or args.frame >= len(block["frames"]):
        raise SystemExit(f"frame {args.frame} outside block frame table")

    frame = block["frames"][args.frame]
    fms = block["frame_modules"][
        frame["first_frame_module"]:frame["first_frame_module"] + frame["frame_module_count"]
    ]
    placements = []
    for fmodule in fms:
        module_index = fmodule["module_index"]
        module = block["modules"][module_index]
        if module["type"] != 0:
            raise SystemExit(
                f"frame uses non-image module {module_index} type 0x{module['type']:02x}; refusing partial composition"
            )
        flags = fmodule["flags"]
        if flags & ~0x10:
            raise SystemExit(
                f"unsupported FModule transform flags 0x{flags:02x}; refusing approximate composition"
            )
        path = args.sprites / f"{args.pack}_b{args.block:03d}_m{module_index:02d}.png"
        if not path.is_file():
            raise SystemExit(f"missing decoded module PNG: {path}")
        uri = "data:image/png;base64," + base64.b64encode(path.read_bytes()).decode("ascii")
        placements.append((uri, fmodule["offset_x"], fmodule["offset_y"], module["w"], module["h"]))

    bounds = block["frame_bounds"][args.frame] if block["frame_bounds"] else None
    if not placements:
        raise SystemExit("frame has no image modules")
    x = min(item[1] for item in placements)
    y = min(item[2] for item in placements)
    right = max(item[1] + item[3] for item in placements)
    bottom = max(item[2] + item[4] for item in placements)
    width, height = right - x, bottom - y
    if bounds and bounds["width"] > 0 and bounds["height"] > 0:
        if bounds["width"] != width or bounds["height"] != height:
            raise SystemExit(
                f"frame image extent {width}x{height} disagrees with source bounds "
                f"{bounds['width']}x{bounds['height']}"
            )
    if width <= 0 or height <= 0:
        raise SystemExit("frame has invalid image extents")

    images = "\n".join(
        f'<image href="{uri}" x="{px}" y="{py}" width="{pw}" height="{ph}" '
        f'image-rendering="pixelated" />'
        for uri, px, py, pw, ph in placements
    )
    svg = (
        f'<svg xmlns="http://www.w3.org/2000/svg" width="{width}" height="{height}" '
        f'viewBox="{x} {y} {width} {height}">\n'
        f"{images}\n"
        f"</svg>\n"
    )
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(svg)
    print(json.dumps({
        "pack": args.pack,
        "block": args.block,
        "frame": args.frame,
        "source_bounds": bounds,
        "module_count": len(placements),
        "output": str(args.output),
    }, sort_keys=True))


if __name__ == "__main__":
    main()
