# Green Farm 3 (`Green Farm 3`) — Standalone Clone

- **Vendor**: Gameloft
- **Resolution**: `240×320`
- **Genre**: Mô phỏng nông trại

- PLAYABLE: trồng → tưới → chờ cây lớn (thời gian thật) → gặt → bán ở Quầy hàng
- 4 cây từ bản gốc: Lúa mì, Xà lách, Chanh vàng, Cây táo (text VI decode từ JAR)
- Save localStorage tự động — reload giữ nguyên nông trại
- Menu + GIỚI THIỆU + TRỢ GIÚP tiếng Việt · nhạc MP3 gốc + SFX
- 2.884 sprite PNG + 55 audio decode từ GLLib BSprite

## Project Layout

- `original/` — Original untouched J2ME `.jar`
- `analysis/` — Decompiled Java sources, `javap` bytecode dumps, and decoded binary tables/assets
- `web-port/` — HTML5 Canvas/WebGL + ES Modules web port & Node unit tests
- `api/mp.mjs` — Same-origin multiplayer relay (`/api/mp`) for Vercel & Discord Activity
- `tools/build-dist.py` — Packages `web-port/` to `dist/` with cache-busting `?v=<timestamp>`
- `tools/verify-port-parity.py` — Runs syntax, unit tests, and decompilation parity checks


## Run, Test & Deploy

```bash
# Run unit tests
npm test

# Run parity checks
python3 tools/verify-port-parity.py

# Build dist/ and preview locally
npm run build
npm start
```
