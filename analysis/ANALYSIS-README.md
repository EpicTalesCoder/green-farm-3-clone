# Green Farm 3 (Gameloft, 240×320) — Phân tích & Reverse Engineering

- **JAR gốc:** `original/green-farm-3-240x320.jar` (SHA-256 `b51cd43f4d9a25778311f3c1fd6dc6695b4c1d238f4799814d44a1ab6914fc04`, MIDP-2.0 / CLDC-1.1, v1.0.3)
- **MIDlet chính:** `GloftGF2M` (MIDlet-1), icon `/icon.png`
- **Trạng thái port:** `in-progress` — đã decompile toàn bộ; web-port hiện là prototype gameplay, chưa phải bản khôi phục đủ game gốc

## Kết cấu class (decompiled bằng CFR 0.152 → `decompiled-cfr/`)

| Class | Dòng (CFR) | Vai trò |
|-------|-----------|---------|
| `a` | 31,623 | **Class game chính** — extends `f` (Canvas), chứa game loop, state machine, render |
| `f` | 1,933 | Canvas trừu tượng gốc — nền tảng vẽ MIDP 2.0 |
| `e` | 3,260 | Logic phụ trợ của `a` (farm/level data) |
| `d` | 2,275 | Logic dữ liệu/đối tượng trong game |
| `l` | 1,941 | Logic UI/menu |
| `i`, `k`, `c` | ~3,300 | `Runnable` — thread tải tài nguyên, timer, network |
| `b` | 100 | Thread helper |
| `g`, `h`, `j` | nhỏ | Utilities |
| `WapTai.COM.WapTai`, `wfree/*` | — | Phần nhúng của waptai (WMA stub), không thuộc game gốc |

Tổng **44,307 dòng** Java decompiled; bytecode evidence (`javap -p -c`) cho 8 class chính nằm trong `bytecode-evidence/`.

## Tài nguyên (`recovered/`)

- Game dùng **resource pack nhị phân đánh số** (`0`, `2`–`11.*`, `EN.1`–`EN.9`, `IAP_texts`) chứ không lưu PNG lẻ:
  - `/0`: bảng MIME của pack (midi, mpeg, x-wav → nhạc MIDI/MP3 nhúng)
  - `/5`, `/10`: bảng offset (int32 LE) trỏ vào khối ảnh/nén bên trong pack
  - `EN.*`: gói text/ngôn ngữ (không phải ASCII thuần — cần decoder riêng)
- Ảnh duy nhất dạng PNG lẻ: `icon.png` (48×48) — đã copy sang `web-port/assets/`
- Toàn bộ hash đối chiếu: `ASSETS-SHA256.txt`

## Tình trạng khôi phục

1. **Nguồn texture:** đã giải mã 2.884 PNG module gốc từ packs 2/5/7/8/11, format BSprite v5 và I64RLE. Decoder hiện xuất thêm FModule/frame/bounds/animation metadata vào `frames/pack*.json`; xem `PACK-MAP.md` và `FRAMES-README.md`. Chưa có semantic map nối entity thế giới (Cindy/cây trồng/công cụ) tới frame cụ thể; không tự gán bằng đoán ảnh.
2. **Web-port hiện tại chưa phải gameplay gốc:** `gf-core.js` vẫn có state machine menu + farming 4×4 tự dựng, timing/kinh tế tự cân bằng; `game.js` render cây bằng khối màu và có vài sprite trang trí chưa được đối chiếu ngữ nghĩa. Không dùng phần này làm bằng chứng parity.
3. **Text gốc:** pack `EN.*` chứa tiếng Việt, đã decode thành `web-port/assets/text/en.json` (12 trang, 3.834 chuỗi). `TEXT-MAP.md` ghi provenance.
4. **Audio gốc:** đã trích 55 file (15 MIDI + 40 MP3) vào `web-port/assets/audio/`; tên file không chứng minh nhạc nào thuộc cảnh cụ thể.

## Các bước khôi phục tiếp theo

1. Trace `/10` world-data entry `bN=15` → entity IDs → sprite registry/block/frame, xác nhận first-run scene, Cindy và cây Lúa mì từ source/bytecode; trạng thái trace hiện có được ghi ở `OPENING-FLOW.md`, block-16 entity layout/semantic map vẫn chưa giải được.
2. Tái hiện renderer BSprite frame/animation đúng `d.java`, giữ asset manifest có provenance và đối chiếu với JAR chạy trong emulator.
3. Khôi phục boot/story/tutorial theo state machine `K`, sau đó thay prototype economy/farm/actions bằng subsystem gốc theo data/code và kiểm thử từng milestone.
4. Giữ mọi luồng IAP/SMS, network account và server-side social không hoạt động trong local port, trừ khi có phạm vi riêng được duyệt.
