#!/usr/bin/env python3
"""Gameloft J2ME resource-pack reader — Python mirror of f.java:460-560 (CFR decompile).

Virtual stream layout (verified against Green Farm 3 jar):
  <pack>        = index file: u16 LE block-count, then count x u32 LE offsets.
  <pack>.<n>    = data chunks (n = 1..), each 10000 bytes except the last.
  Virtual byte at offset o lives in chunk floor logic of f.a(int):
      while (pos > CHUNK): pos -= CHUNK; chunk_index++
  chunk_index 0 = the base <pack> file itself, 1.. = <pack>.<n>.
  Block n spans [offsets[n], offsets[n+1] - 1).

Usage:
  python3 pack_loader.py --pack <path/to/base> --list           # table of blocks
  python3 pack_loader.py --pack <path/to/base> --dump N OUTFILE # write block N
  python3 pack_loader.py --pack <path/to/base> --virtual OUT    # write whole virtual stream
"""
import pathlib
import struct
import sys

CHUNK = 10000  # f.i — inputStream.available() of the base file at open time


class Pack:
    def __init__(self, base_path: pathlib.Path):
        self.base = base_path
        data = base_path.read_bytes()
        (count,) = struct.unpack_from("<H", data, 0)
        self.count = count
        self.offsets = list(struct.unpack_from(f"<{count}I", data, 2))
        self.header_len = 2 + 4 * count
        # virtual stream: base file, then <base>.1, <base>.2 ... (f.a(String,int,...))
        parts = [data]
        n = 1
        while True:
            p = base_path.parent / f"{base_path.name}.{n}"
            if not p.exists():
                break
            parts.append(p.read_bytes())
            n += 1
        self.virtual = b"".join(parts)
        self.first = self.offsets[0]  # f.k
        assert self.first == self.header_len or self.first == 0, (
            f"first offset {self.first} != header len {self.header_len}"
        )

    def block_len(self, n: int) -> int:
        # f.a(int): length = offsets[n+1] - offsets[n] - 1
        return self.offsets[n + 1] - self.offsets[n] - 1

    def block(self, n: int) -> bytes:
        # f.a(int) does skip(n2 - k); read(); k = n2 + 1 -> the FIRST byte of
        # each block region is discarded. Block n content therefore starts at
        # offsets[n] + 1 and runs to offsets[n+1] (exclusive); the last block
        # runs to the end of the virtual stream.
        start = self.offsets[n] + 1
        if n >= len(self.offsets) - 1:
            return self.virtual[start:]
        return self.virtual[start:self.offsets[n + 1]]

    @property
    def nblocks(self) -> int:
        return len(self.offsets) - 1  # last offset marks end of final block


def main():
    import argparse

    ap = argparse.ArgumentParser()
    ap.add_argument("--pack", required=True, type=pathlib.Path)
    ap.add_argument("--list", action="store_true")
    ap.add_argument("--dump", nargs=2, metavar=("N", "OUTFILE"))
    ap.add_argument("--virtual", metavar="OUTFILE")
    args = ap.parse_args()

    pk = Pack(args.pack)
    print(f"pack={args.pack.name} count={pk.count} header={pk.header_len}B "
          f"chunks={len(pk.virtual)//CHUNK + (1 if len(pk.virtual) % CHUNK else 0)} "
          f"virtual={len(pk.virtual)}B")

    if args.list:
        for i in range(pk.nblocks):
            blk = pk.block(i)
            print(f"  [{i:3d}] off={pk.offsets[i]:7d} len={len(blk):7d} "
                  f"magic={blk[:8].hex(' ')}")
    if args.dump:
        n, out = int(args.dump[0]), args.dump[1]
        pathlib.Path(out).write_bytes(pk.block(n))
        print(f"wrote block {n} -> {out} ({len(pk.block(n))}B)")
    if args.virtual:
        pathlib.Path(args.virtual).write_bytes(pk.virtual)
        print(f"wrote virtual stream -> {args.virtual} ({len(pk.virtual)}B)")


if __name__ == "__main__":
    main()
