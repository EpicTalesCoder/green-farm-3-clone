#!/usr/bin/env python3
"""GLLib text-pack decoder — Python mirror of f.java text module (CFR decompile).

STRUCTURE (byte-level, verified against Green Farm 3 "EN" pack, 12 pages):
  Pack container (see pack_loader.py):
    <pack>       index: u16 LE block-count, then count x u32 LE absolute offsets.
    <pack>.<n>   data chunks, each 10000 B except the last.
    Block n      = virtual[offsets[n]+1 : offsets[n+1]]
                   (f.a(int) seek: skip(offsets[n]); read() DISCARDS one byte;
                    byte length = offsets[n+1]-offsets[n]-1).

  Page block (f.d(InputStream), f.java:1049):
    [u8  pageID]                       (read() in d(); must equal block index)
    [u32 LE stringCount]               capped at 1024 (e[n] > 1024 -> 1024)
    [stringCount x u32 LE end-offsets] b[1..count]; b[0] = 0 implicit
    [data: b[count] bytes]

  String i (f.b(int), f.java:1079):
    bytes data[b[i] : b[i+1]], charset d = "UTF-8" (f.java:1926).
    NOTE the quirk: string 0 = data[0 : b[1]] (the first stored offset is the
    END of string 0, not its start). Global text id = (page << 10) | idx,
    i.e. f.b(int n): page = n >> 10, idx = n & 0x3FF (max 1024 strings/page,
    32 pages). Pages are opened as pack "/" + langCode (f.a(0): 0=EN 1=DE 2=FR
    3=IT 4=ES 5=BR 6=PT ... 16=VI) and loaded via f.a(pack, page).

  CAVEAT: the pack recovered as "EN" from this jar actually contains the
  VIETNAMESE localization (the "bo lac thoi tiet su" clone shipped VI text
  under the EN filename). Decoding is exact UTF-8; strings are real game text.

  IAP_texts: NOT a pack. Plain UTF-8 (BOM) text file read by l.b(String)
  (l.java:1411): split on '\n', each line "ID;TEXT" (l.java:1230-1240).

Usage:
  python3 decode_text.py [repo_root]   # default: parent of analysis/
Outputs:
  web-port/assets/text/en.json   {"page_<n>": {"<idx>": text}, "iap": {"<ID>": text}}
  analysis/TEXT-MAP.md           structure doc + decode report
"""
import json
import pathlib
import struct
import sys

sys.path.insert(0, str(pathlib.Path(__file__).parent))
from pack_loader import Pack

MAX_STRINGS_PER_PAGE = 1024  # f.d(): e[n] capped at 1024


def decode_page(blk: bytes) -> list[str]:
    """Parse one page block exactly as f.d(InputStream) + f.b(int) do."""
    page_id = blk[0]  # f.a(inputStream)
    (count,) = struct.unpack_from("<I", blk, 1)  # f.c(inputStream)
    count = min(count, MAX_STRINGS_PER_PAGE)
    offs = struct.unpack_from(f"<{count}I", blk, 5)  # b[1..count]
    data = blk[5 + 4 * count : 5 + 4 * count + offs[-1]]  # a[n]
    bnds = [0] + list(offs)  # b[0] = 0 implicit
    return [data[bnds[i] : bnds[i + 1]].decode("utf-8") for i in range(count)]


def decode_iap_texts(path: pathlib.Path) -> dict[str, str]:
    """l.b(String) + l.b(): UTF-8 (BOM tolerated), newline-split, 'ID;TEXT'."""
    raw = path.read_bytes().decode("utf-8-sig")
    out = {}
    for line in raw.split("\n"):
        i = line.find(";")
        if i != -1:
            out[line[:i]] = line[i + 1 :]
    return out


def main() -> None:
    root = pathlib.Path(sys.argv[1]) if len(sys.argv) > 1 else pathlib.Path(__file__).resolve().parents[2]
    an = root / "analysis"
    rec = an / "recovered"
    pk = Pack(rec / "EN")

    pages = {}
    report = [f"# TEXT-MAP — GLLib text packs ({root.name})\n"]
    report.append("Decoded by `analysis/tools/decode_text.py`; structure mirror of "
                  "f.java text module (see its docstring).\n")
    total = 0
    for n in range(pk.nblocks):
        blk = pk.block(n)
        page_id, count = blk[0], struct.unpack_from("<I", blk, 1)[0]
        strs = decode_page(blk)
        pages[f"page_{n}"] = {str(i): s for i, s in enumerate(strs)}
        total += len(strs)
        report.append(f"- page {n}: pageID={page_id}, strings={len(strs)} (header count {count}), "
                      f"block={len(blk)}B")
        assert page_id == n, f"page id mismatch: {page_id} != {n}"

    iap = decode_iap_texts(rec / "IAP_texts")
    pages["iap"] = iap
    report.append(f"- IAP_texts: plain UTF-8 'ID;TEXT' lines, {len(iap)} entries (l.java:1411)\n")

    out_json = root / "web-port" / "assets" / "text" / "en.json"
    out_json.parent.mkdir(parents=True, exist_ok=True)
    out_json.write_text(json.dumps(pages, ensure_ascii=False, indent=1), encoding="utf-8")

    report.insert(1, f"\nRESULT: {pk.nblocks} pages, {total} strings + {len(iap)} IAP entries -> "
                     f"`web-port/assets/text/en.json`. Text id = (page<<10)|idx; f.b(id) returns it.\n"
                     f"WARNING: pack named 'EN' actually holds the VIETNAMESE localization "
                     f"(clone shipped VI text under the EN filename; UTF-8 charset per f.java:1926).\n")
    sample = []
    for p in ("page_0", "page_8", "page_11"):
        d = pages[p]
        sample += [d["2"], d["3"], d["100"]]
    report.append("\nSample strings (idx 2,3,100 of pages 0/8/11):\n" +
                  "\n".join(f"- {s!r}" for s in sample))
    (an / "TEXT-MAP.md").write_text("\n".join(report), encoding="utf-8")
    print(f"pages={pk.nblocks} strings={total} iap={len(iap)} -> {out_json}")


if __name__ == "__main__":
    main()
