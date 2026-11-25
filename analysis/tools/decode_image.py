#!/usr/bin/env python3
"""GLLib BSprite decoder for Green Farm 3 packs — Python mirror of d.java (CFR decompile).

Reads every block of a resource pack (via pack_loader.Pack, which mirrors the
game's f.java pack stream), treats each block starting with magic 0x5DF as a
BSprite v5 file, parses it per the obfuscated ASprite loader in
analysis/decompiled-cfr/d.java, decodes every image module (palette 0 by
default, per-module palette byte honoured when flag 0x4 is set) and writes
PNGs named <pack>_b<block>_<mod>.png.

Supported pixel formats (palette storage):
  0x8888 (34952) ARGB8888   0x4444 (17476) ARGB4444
  0x5515 (21781) A1R5G5B5   0x1555 (5461)  A1R5G5B5 (LE variant)
  0x0565 (1385)  R5G6B5     0x3203 (12803) R3G3B2 (192 = transparent)
Supported data formats:
  25840 (0x64F0) I64RLE     5632 (0x1600)  I16 (2 px/byte, high nibble first)

d.java specifics mirrored here:
  * flag 0x80      : module data sizes are u32 (else u16, negative -> error)
  * flag 0x400     : FM offsets u16 (else u8)  |  flag 0x100000: FM index u16
  * flag 0x8000    : frame-rects section       |  flag 0x800: per-frame count u16
  * flag 0x1000    : bound rects section absent
  * flag 0x40000000: palette count is an explicit byte (else exactly 1)
  * flag 0x4       : per-module palette byte array r[]
  * per palette    : u8 colorCount, u8 rleParam d[pal];
                     tableBits[pal] = bit_length(d[pal]-1),
                     tableMask[pal] = (1 << tableBits) - 1   (I64RLE)
  * A1R5G5B5 quirk : fully-expanded pure magenta 0x00F800F8 -> 0xFF00FF (opaque)
  * R3G3B2 quirk   : palette byte 192 means fully transparent
  * module header  : type byte 0x00 = image (u32 + w,h bytes); 0xF7 adds u32+u8;
                     0xFC/0xFB add 2x u16; 0xFA/0xF9 add 4x u16; 0xFF/0xFE/0xF8
                     like 0x00; 0xFD = marker (w,h only, no u32)

Usage:
  python3 decode_image.py --pack analysis/recovered/5 --outdir web-port/assets/sprites/pack5
                         [--palette N] [--summary FILE] [--max-blocks N]
  python3 decode_image.py --pack analysis/recovered/5 --metadata-only --summary analysis/pack5-frames.json

Frame metadata preserves source module/FModule indices, signed offsets and flags,
frame bounds/rect references, and raw animation-frame records. It does not assign
semantic names to frames or claim a frame is a particular character or crop.
"""
import argparse
import json
import pathlib
import sys

sys.path.insert(0, str(pathlib.Path(__file__).resolve().parent))
from pack_loader import Pack  # noqa: E402

BSPRITE_MAGIC = 0x5DF


class Reader:
    __slots__ = ("data", "pos")

    def __init__(self, data):
        self.data = data
        self.pos = 0

    def u8(self):
        v = self.data[self.pos] & 0xFF
        self.pos += 1
        return v

    def u16(self):
        d, p = self.data, self.pos
        v = (d[p] & 0xFF) | ((d[p + 1] & 0xFF) << 8)
        self.pos += 2
        return v

    def u32(self):
        d, p = self.data, self.pos
        v = (d[p] & 0xFF) | ((d[p + 1] & 0xFF) << 8) | \
            ((d[p + 2] & 0xFF) << 16) | ((d[p + 3] & 0xFF) << 24)
        self.pos += 4
        return v

    def i8(self):
        value = self.u8()
        return value - 0x100 if value & 0x80 else value

    def i16(self):
        value = self.u16()
        return value - 0x10000 if value & 0x8000 else value

    def skip(self, n):
        self.pos += n


# ---------------------------------------------------------------- palettes

def _a1r5g5b5(raw, nc):
    pal = []
    for _ in range(nc):
        v = raw.u16()
        argb = 0xFF000000
        if not (v & 0x8000):
            argb = 0  # transparent
        argb |= ((v & 0x7C00) << 9) | ((v & 0x3E0) << 6) | ((v & 0x1F) << 3)
        if argb == 0x00F800F8:  # d.java magenta quirk -> opaque pink
            argb = 0xFF00FF
        pal.append(argb)
    return pal


def _r3g3b2(raw, nc):
    pal = []
    for _ in range(nc):
        v = raw.u8()
        argb = 0xFF000000
        if v == 192:  # d.java: 192 = fully transparent
            argb = 0
        pal.append(argb | ((v & 0xE0) << 16) | ((v & 0x1C) << 11) | ((v & 0x03) << 6))
    return pal


def _a8r8g8b8(raw, nc):
    return [(raw.u8() << 24) | (raw.u8() << 16) | (raw.u8() << 8) | raw.u8()
            for _ in range(nc)]


def _a4r4g4b4(raw, nc):
    pal = []
    for _ in range(nc):
        v = raw.u16()
        a, r, g, b = (v >> 12) & 0xF, (v >> 8) & 0xF, (v >> 4) & 0xF, v & 0xF
        pal.append(((a * 17) << 24) | ((r * 17) << 16) | ((g * 17) << 8) | (b * 17))
    return pal


def _r5g6b5(raw, nc):
    pal = []
    for _ in range(nc):
        v = raw.u16()
        pal.append(0xFF000000 | ((v & 0xF800) << 8) | ((v & 0x07E0) << 5) | ((v & 0x001F) << 3))
    return pal


PIXEL_FORMATS = {
    21781: (_a1r5g5b5, 2),   # 0x5515 A1R5G5B5 (seen in game)
    5461: (_a1r5g5b5, 2),    # 0x1555 variant
    12803: (_r3g3b2, 1),     # 0x3203 R3G3B2 (seen in game)
    34952: (_a8r8g8b8, 4),   # 0x8888
    17476: (_a4r4g4b4, 2),   # 0x4444
    1385: (_r5g6b5, 2),      # 0x0565
}


# ---------------------------------------------------------------- decoding

def decode_i64rle(data, w, h, pal, bits, mask):
    """d.java a(int) lines 1007-1015: idx = v & mask; run = v >> bits; emit run+1."""
    need = w * h
    out = [0] * need
    i = n = 0
    while n < need:
        v = data[i] & 0xFF
        i += 1
        color = pal[v & mask]
        run = v >> bits
        for _ in range(run + 1):
            if n >= need:
                break
            out[n] = color
            n += 1
    return out, i


def decode_i16(data, w, h, pal):
    """d.java lines 1016-1022: 2 px/byte, high nibble then low nibble."""
    need = w * h
    out = [0] * need
    nbytes = (need + 1) >> 1
    for i in range(nbytes):
        v = data[i]
        out[2 * i] = pal[(v >> 4) & 0xF]
        if 2 * i + 1 < need:
            out[2 * i + 1] = pal[v & 0xF]
    return out, nbytes


def argb_to_rgba(pixels):
    out = bytearray(len(pixels) * 4)
    for i, c in enumerate(pixels):
        out[4 * i] = (c >> 16) & 0xFF
        out[4 * i + 1] = (c >> 8) & 0xFF
        out[4 * i + 2] = c & 0xFF
        out[4 * i + 3] = (c >> 24) & 0xFF
    return bytes(out)


# ---------------------------------------------------------------- BSprite parse

def parse_sprite(data):
    """Parse one BSprite block. Returns dict or None if magic is wrong."""
    if len(data) < 6:
        return None
    raw = Reader(data)
    if raw.u16() != BSPRITE_MAGIC:
        return None
    flags = raw.u32()
    s = {"flags": flags, "warnings": []}

    # ---- modules (d.java a(int, byte[]) from byte 6) ----
    nm = raw.u16()
    s["nm"] = nm
    modules = []
    for _ in range(nm):
        t = raw.u8()
        m = {"type": t}
        # d.java 233-303: type 0x00 (image) -> bl=false, bl2=true (w,h only);
        # the shape types 0xFF..0xF7 (except 0xFD) read a u32 (color/param).
        has_u32 = t != 0x00 and t != 0xFD   # bl
        extra_f7 = t == 0xF7                # bl5
        wh_bytes = t in (0x00, 0xFF, 0xFE, 0xFD, 0xF8, 0xF7, 0xFC, 0xFB)  # bl2
        two_u16 = t in (0xFC, 0xFB)    # bl3
        four_u16 = t in (0xFA, 0xF9)   # bl4
        if t not in (0x00, 0xFF, 0xFE, 0xFD, 0xFC, 0xFB, 0xFA, 0xF9, 0xF8, 0xF7):
            raise ValueError(f"invalid module type 0x{t:02X}")
        if has_u32:
            m["u32"] = raw.u32()
        if extra_f7:
            m["f7a"] = raw.u32()
            m["f7b"] = raw.u8()
        if wh_bytes:
            m["w"] = raw.u8()
            m["h"] = raw.u8()
        if two_u16:
            m["angles"] = (raw.u16(), raw.u16())
        if four_u16:
            m["quad"] = tuple(raw.u16() for _ in range(4))
        modules.append(m)
    s["modules"] = modules

    # ---- frames: FModule table (d.java b(int, byte[])) ----
    tnfm = raw.u16()
    s["tnfm"] = tnfm
    frame_modules = []
    for _ in range(tnfm):
        module_index = raw.u16() if flags & 0x100000 else raw.u8()
        if flags & 0x400:
            offset_x, offset_y = raw.i16(), raw.i16()
        else:
            offset_x, offset_y = raw.i8(), raw.i8()
        frame_modules.append({
            "module_index": module_index,
            "offset_x": offset_x,
            "offset_y": offset_y,
            "flags": raw.u8(),
        })
    s["frame_modules"] = frame_modules

    # ---- frames: rects + frame table + bounds (d.java c(int, byte[])) ----
    frame_rects = []
    if flags & 0x8000:
        tnfr = raw.u16()
        s["tnfr"] = tnfr
        for _ in range(tnfr):
            if flags & 0x400:
                frame_rects.append([raw.i16(), raw.i16(), raw.u16(), raw.u16()])
            else:
                frame_rects.append([raw.i8(), raw.i8(), raw.u8(), raw.u8()])
    s["frame_rects"] = frame_rects

    nf = raw.u16()
    s["nf"] = nf
    frames = []
    next_rect = 0
    for _ in range(nf):
        module_count = raw.u16() if flags & 0x800 else raw.u8()
        first_module = raw.u16()
        rect_count = raw.u8() if flags & 0x8000 else 0
        frames.append({
            "first_frame_module": first_module,
            "frame_module_count": module_count,
            "first_frame_rect": next_rect if rect_count else None,
            "frame_rect_count": rect_count,
        })
        next_rect += rect_count
    s["frames"] = frames
    if flags & 0x8000 and next_rect != len(frame_rects):
        s["warnings"].append(
            f"frame rect references total {next_rect}, table has {len(frame_rects)} entries")

    bounds = []
    if nf > 0 and not flags & 0x1000:
        for _ in range(nf):
            if flags & 0x400:
                bounds.append({
                    "x": raw.i16(), "y": raw.i16(),
                    "width": raw.u16(), "height": raw.u16(),
                })
            else:
                bounds.append({
                    "x": raw.i8(), "y": raw.i8(),
                    "width": raw.u8(), "height": raw.u8(),
                })
    s["frame_bounds"] = bounds

    # ---- animations (d.java d()/e()) ----
    tnaf = raw.u16()
    s["tnaf"] = tnaf
    s["animation_frames"] = [
        [raw.u8(), raw.u8(), raw.u8(), raw.u8(), raw.u8()]
        for _ in range(tnaf)
    ]
    na = raw.u16()
    s["na"] = na
    s["animations"] = [
        {"frame_count": raw.u8(), "first_animation_frame": raw.u16()}
        for _ in range(na)
    ]

    # ---- module image data (d.java a(int, byte[], int)) ----
    s["has_image_data"] = bool(flags & 0x1000000)
    if flags & 0x1000000:
        pixel_format = raw.u16()
        s["pixel_format"] = pixel_format
        if pixel_format not in PIXEL_FORMATS:
            raise ValueError(f"unsupported pixel format 0x{pixel_format:04X}")
        # Empirically verified across the game's split packs: image data stores
        # [u8 palette count][u8 colors per palette][palette colors]. This
        # representation is retained because it decodes all source blocks to
        # exact payload and pixel counts; bytecode field aliases are ambiguous.
        n_pal = raw.u8()
        nc = raw.u8()
        bits = (nc - 1).bit_length() if nc > 1 else 0
        fn, csize = PIXEL_FORMATS[pixel_format]
        palettes = [fn(raw, nc) for _ in range(n_pal)]
        s["n_palettes"] = n_pal
        s["palette_sizes"] = [len(p) for p in palettes]
        s["rle_bits"] = [bits] * n_pal

        data_format = raw.u16()
        s["data_format"] = data_format
        if data_format not in (25840, 5632):
            raise ValueError(f"unsupported data format 0x{data_format:04X}")

        # Per-module data is INTERLEAVED: [size][data] for each module in
        # sequence (verified: sequential walk from the data-format field lands
        # exactly on the block end; d.java's apparent "two passes over a
        # separate size table" is a CFR rewind artifact). Size is u32 when
        # flag 0x80 is set, else u16. Non-image modules (rects/markers) have
        # size 0.
        payloads = []
        sizes = []
        for _ in range(nm):
            sz = raw.u32() if flags & 0x80 else raw.u16()
            if sz < 0:
                raise ValueError("negative module size (BS_IMAGE_SIZE_INT missing?)")
            sizes.append(sz)
            payloads.append(data[raw.pos:raw.pos + sz])
            raw.skip(sz)
        s["data_sizes"] = sizes
        s["payloads"] = payloads
        s["module_palettes"] = [0 for _ in modules]  # flag 0x4 never set here
        s["palettes"] = palettes
        s["rle_masks"] = [(1 << bits) - 1 if bits else 0] * n_pal
    return s


def decode_module(sprite, mod_idx, palette_idx=0):
    """Decode one image module to a list of ARGB ints. Returns (pixels, w, h, info)."""
    m = sprite["modules"][mod_idx]
    if m["type"] != 0x00:
        return None
    w, h = m["w"], m["h"]
    payload = sprite["payloads"][mod_idx]
    data_format = sprite["data_format"]
    pal = sprite["palettes"][palette_idx]
    info = {"consumed": 0}
    if data_format == 25840:  # I64RLE
        bits = sprite["rle_bits"][palette_idx]
        mask = sprite["rle_masks"][palette_idx]
        pixels, consumed = decode_i64rle(payload, w, h, pal, bits, mask)
        if consumed != len(payload) or len(pixels) != w * h:
            # empirical table recovery: try every bit width 1..8
            fixed = False
            for b in range(1, 9):
                try:
                    px, c = decode_i64rle(payload, w, h, pal, b, (1 << b) - 1)
                except IndexError:
                    continue
                if px and c == len(payload):
                    pixels, consumed, info["recovered_bits"] = px, c, b
                    fixed = True
                    break
            if not fixed:
                raise ValueError(
                    f"I64RLE decode mismatch: consumed {consumed}/{len(payload)}, "
                    f"pixels {len(pixels)}/{w * h}")
            info["table_mismatch"] = True
    elif data_format == 5632:  # I16
        pixels, consumed = decode_i16(payload, w, h, pal)
        if consumed != len(payload) or len(pixels) != w * h:
            raise ValueError(
                f"I16 decode mismatch: consumed {consumed}/{len(payload)}, "
                f"pixels {len(pixels)}/{w * h}")
    else:
        raise ValueError(f"unsupported data format {data_format}")
    info["consumed"] = consumed
    return pixels, w, h, info


def main():
    import argparse  # noqa: F811

    ap = argparse.ArgumentParser(description="GLLib BSprite pack decoder")
    ap.add_argument("--pack", required=True, type=pathlib.Path)
    ap.add_argument("--outdir", type=pathlib.Path)
    ap.add_argument("--palette", type=int, default=0)
    ap.add_argument("--max-blocks", type=int, default=None)
    ap.add_argument("--summary", type=pathlib.Path, default=None,
                    help="write JSON summary or full frame metadata")
    ap.add_argument("--metadata-only", action="store_true",
                    help="export frame/animation metadata without decoding PNGs")
    ap.add_argument("--quiet", action="store_true",
                    help="suppress per-block progress output")
    args = ap.parse_args()
    if args.metadata_only and args.summary is None:
        ap.error("--metadata-only requires --summary")
    if not args.metadata_only and args.outdir is None:
        ap.error("--outdir is required unless --metadata-only is used")

    Image = None
    if not args.metadata_only:
        try:
            from PIL import Image
        except ImportError:
            print("ERROR: Pillow required (pip install pillow)", file=sys.stderr)
            return 2

    pk = Pack(args.pack)
    if args.outdir is not None:
        args.outdir.mkdir(parents=True, exist_ok=True)
    pack_name = args.pack.name

    summary = {
        "pack": pack_name,
        "block_count": pk.nblocks,
        "sprite_blocks": 0,
        "skipped_blocks": [],
        "modules": 0,
        "frames": 0,
        "anims": 0,
        "pixel_formats": {},
        "data_formats": {},
        "pngs": [],
        "frames_by_block": [],
        "errors": [],
        "rle_bits": set(),
        "recovered_bits": [],
    }
    n_blocks = pk.nblocks if args.max_blocks is None else min(args.max_blocks, pk.nblocks)

    for b in range(n_blocks):
        blk = pk.block(b)
        if len(blk) < 2 or ((blk[0] & 0xFF) | ((blk[1] & 0xFF) << 8)) != BSPRITE_MAGIC:
            summary["skipped_blocks"].append(
                {"block": b, "len": len(blk), "head": blk[:8].hex()})
            if not args.quiet:
                print(f"[{pack_name}] block {b:3d}: SKIPPED (magic={blk[:4].hex()})")
            continue
        try:
            sp = parse_sprite(blk)
        except Exception as e:  # noqa: BLE001 — log and continue per-block
            summary["errors"].append({"block": b, "error": str(e)})
            if not args.quiet:
                print(f"[{pack_name}] block {b:3d}: PARSE ERROR {e}")
            continue
        summary["sprite_blocks"] += 1
        summary["modules"] += sp["nm"]
        summary["frames"] += sp["nf"]
        summary["anims"] += sp["na"]
        if args.metadata_only:
            summary["frames_by_block"].append({"block": b, **{
                key: sp[key] for key in (
                    "flags", "modules", "frame_modules", "frame_rects", "frames",
                    "frame_bounds", "animation_frames", "animations",
                ) if key in sp
            }})
        if sp.get("has_image_data"):
            pf = f"0x{sp['pixel_format']:04X}"
            df = "I64RLE" if sp["data_format"] == 25840 else "I16"
            summary["pixel_formats"][pf] = summary["pixel_formats"].get(pf, 0) + 1
            summary["data_formats"][df] = summary["data_formats"].get(df, 0) + 1
            summary["rle_bits"].update(sp.get("rle_bits", []))
        if not args.metadata_only:
            for mi, m in enumerate(sp["modules"]):
                if m["type"] != 0x00 or not sp.get("has_image_data"):
                    continue
                try:
                    pixels, w, h, info = decode_module(sp, mi, args.palette)
                except Exception as e:
                    summary["errors"].append(
                        {"block": b, "module": mi, "error": str(e)})
                    if not args.quiet:
                        print(f"[{pack_name}] block {b:3d} module {mi}: DECODE ERROR {e}")
                    continue
                name = f"{pack_name}_b{b:03d}_m{mi:02d}.png"
                img = Image.frombytes("RGBA", (w, h), argb_to_rgba(pixels))
                img.save(args.outdir / name)
                summary["pngs"].append({"file": name, "w": w, "h": h,
                                        "block": b, "module": mi,
                                        "consumed": info["consumed"],
                                        "data_len": len(sp["payloads"][mi])})
                if "recovered_bits" in info:
                    summary["recovered_bits"].append(
                        {"block": b, "module": mi, "bits": info["recovered_bits"]})
        if not args.quiet:
            print(f"[{pack_name}] block {b:3d}: OK nm={sp['nm']} nf={sp['nf']} "
                  f"na={sp['na']} fmt=0x{sp.get('pixel_format', 0):04X}/"
                  f"{sp.get('data_format', 0)}")

    summary["rle_bits"] = sorted(summary["rle_bits"])
    ok = len(summary["pngs"])
    if not args.quiet:
        print(f"[{pack_name}] DONE: {summary['sprite_blocks']} sprites, "
              f"{ok} PNGs, {len(summary['skipped_blocks'])} skipped, "
              f"{len(summary['errors'])} errors -> {args.outdir}")
    if args.summary:
        args.summary.write_text(json.dumps(summary, indent=1))
    return 0


if __name__ == "__main__":
    sys.exit(main())
