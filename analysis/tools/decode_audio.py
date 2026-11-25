#!/usr/bin/env python3
"""Extract audio (MIDI / MP3 / WAV) blocks from Green Farm 3 Gameloft packs.

Pack 3 holds the full audio library: blocks are raw 'MThd' MIDI files or
MPEG frame-sync MP3 streams, located via the standard pack offset table
(mirror of f.java:460-560). Empty blocks (consecutive offsets) are skipped
by the game itself — they are exported as nothing.

Usage:
  python3 decode_audio.py --pack analysis/recovered/3 --outdir web-port/assets/audio
"""
import argparse
import pathlib
import sys

sys.path.insert(0, str(pathlib.Path(__file__).parent))
from pack_loader import Pack

MAGIC = {
    b"MThd": ".mid",
    b"RIFF": ".wav",
}


def sniff(data: bytes) -> str:
    if data[:4] in MAGIC:
        return MAGIC[data[:4]]
    if len(data) > 2 and data[0] == 0xFF and (data[1] & 0xE0) == 0xE0:
        return ".mp3"  # MPEG audio frame sync
    if data[:3] == b"ID3":
        return ".mp3"
    return ""


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--pack", required=True, type=pathlib.Path)
    ap.add_argument("--outdir", required=True, type=pathlib.Path)
    ap.add_argument("--prefix", default="audio")
    args = ap.parse_args()

    pk = Pack(args.pack)
    args.outdir.mkdir(parents=True, exist_ok=True)

    written, skipped, empty = 0, [], 0
    end = len(pk.virtual)
    for i in range(pk.nblocks):
        off = pk.offsets[i] + 1  # loader discards the byte at offsets[i]
        nxt = pk.offsets[i + 1] if i + 1 < len(pk.offsets) else end
        blk = pk.virtual[pk.offsets[i]:nxt]
        for shift, data in (("+1", pk.virtual[off:nxt]), ("+0", blk)):
            ext = sniff(data)
            if not ext:
                continue
            if len(data) < 32:
                break
            out = args.outdir / f"{args.prefix}_b{i:03d}{ext}"
            out.write_bytes(data)
            print(f"[{i:3d}] {ext:5s} {len(data):7d}B -> {out.name} "
                  f"(shift {shift})")
            written += 1
            break
        else:
            if len(blk) == 0:
                empty += 1
            else:
                skipped.append(i)

    print(f"\npack={args.pack.name}: {written} audio files, "
          f"{empty} empty blocks, skipped={skipped}")


if __name__ == "__main__":
    main()
