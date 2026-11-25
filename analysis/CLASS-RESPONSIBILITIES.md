# Green Farm 3 — class responsibilities and source-derived port plan

Scope: evidence for the original `green-farm-3-240x320.jar`. Class roles and
numeric identifiers below are source-derived; obfuscated classes are not given
invented semantic names. CFR 0.152 is available, and the refreshed `javap -c -p
-v` output covers all 24 recovered classes. Vineflower is not installed in this
checkout, so no second-decompiler comparison is claimed. The original JAR is
read-only.

## Four gated stages

1. **Stage 1 — Analysis (this document; no `web-port/` edits in this stage).**
   Record class ownership, observed state/transition behavior, resource formats,
   formulas, and unresolved facts with source line references. Status: analysis
   is documented below; the source itself still contains known ambiguities.
2. **Stage 2 — Decode and render source data.** Build readers from the recovered
   original pack bytes, retain numeric IDs and provenance, and implement
   source-evidenced BSprite/FModule drawing with MIDP anchors, transforms and
   clipping. Do not assign a human name to a frame or world entity without a
   source join. Status: existing Python decoders/metadata cover verified pack and
   frame facts. The browser now reads split pack 5 at runtime, decodes the
   source BSprite block/frame, and composes the verified numeric opening frame
   with clipping and MIDP region helpers. This restores one source-linked image
   composition only; the complete original `paint`/screen composition,
   non-zero FModule transforms, other screens, and visual comparison against a
   FreeJ2ME capture remain outstanding.
3. **Stage 3 — Gameplay.** Port only behavior supported by decompiled Java and
   corroborating bytecode; retain unknown behavior as unknown. Status: the
   current `gf-core.js` farming/economy simulation is explicitly a prototype,
   not a port of original gameplay. It must not be represented as parity.
4. **Stage 4 — Hard gate and build.** Run `python3 tools/verify-port-parity.py
   green-farm-3` and require `RESULT: PASS`, then run
   `python3 tools/build-portal.py` and visually inspect the built game on
   localhost with no Console errors. Status: not passed; no original FreeJ2ME
   reference capture is present and screen-level parity is not established.

A stage is not considered complete just because its files exist. Do not claim
completion or promote the port to source-faithful/playable parity while any hard
gate or visual verification remains outstanding.

## Class responsibility map

| Class | Source-derived responsibility | Evidence and limits |
|---|---|---|
| `GloftGF2M` | MIDlet lifecycle; constructs `a`, starts its runtime, pauses and tears it down. | `GloftGF2M.java:14-60`; javap: `GloftGF2M.javap.txt`. |
| `f` | MIDP `Canvas` + `Runnable` runtime: canvas sizing, repaint loop, frame callback, keypad translation, resource pack stream, text strings, graphics helpers and RMS wrappers. | `f.java:31-33,100-149,194-268,282-308,457-595,617-674,1068-1098,1233-1284`; javap methods `run`, `paint`, `keyPressed`, `keyReleased` in `f.javap.txt`. It does not establish a 120 ms game tick: the loop sleeps using a configured field. |
| `a` | Main game Canvas subclass; numeric state/event dispatch, world/resource setup, gameplay orchestration, input and save data. | `a.java:22-23,879-945,999-1397,1881-2005,30816-31023`; javap: `a.javap.txt` methods `a(int)`, `u(int)`, `e()`. CFR reports an incompletely structured `e()` and some methods; check its bytecode before translating those paths. |
| `d` | GLLib BSprite structure and module renderer: modules, FModules, frame/animation tables, palettes, compressed pixels, bounds and composition. | `d.java:126-198,372-499,979-1033,1763-1855`; bytecode `d.javap.txt`. Custom FModule flip/rotation flags are not themselves the numeric MIDP `Sprite.TRANS_*` enum. |
| `g` | `/9` table reader. Reads row count, column count, per-column widths (1/2/4 bytes), then rows. | `g.java:15-122`; `a.java:18088-18129,1881-1889`. Table column meaning is consumer-specific; retain numeric columns until joined at a proven caller. |
| `e` | Runtime entity model and entity-type factories/update logic. | `e.java:7-115,119-140,2732-3046`; category-15/type-32 reads sprite registry/frame config at `e.java:2981-2997`. Numeric categories/types are not semantic display names. |
| `i` | BSprite/animation instance helper; binds a `d` sprite, chooses frames/animations and maintains instance playback/position state. | `i.java:12-107,109-171`; verify ambiguous overloaded fields against `i.javap.txt` before porting detailed timing. |
| `j` | Image/pixel-buffer wrapper used by `d` module rendering and cache. | `j.java` and `d.java` call sites; keep the role broad because the class is small and obfuscated. |
| `l` | Text/locale or UI resource support, including resource loading and local state. | `l.java:381` and resource call sites; detailed UI ownership is not asserted without a full call-site trace. |
| `k` | Platform/network/IGP integration. | Source strings and call sites; remote effects are outside this local-only port and must remain disabled. |
| `b`, `c`, `h` | Small utility/thread/task helpers; exact domain roles are not sufficiently cohesive to rename. | Their decompiled sources and class index. |
| `wfree.*`, `WapTai.COM.WapTai` | Embedded WMA/WapTai compatibility or integration classes, separate from the core game logic. | Package names and class sources. Do not enable outbound messaging or billing effects. |

## Original state and startup facts

- `a.a(int)` requests a numeric state transition; the current state is returned
  by `a.a()` and dispatch is in `a.d(int,int)` (`a.java:889-945,975-979,
  999-1397`). State IDs are numeric; many individual names remain unknown. Do
  not replace this with an assumed Splash → Menu → Farm state list.
- The source-supported first-world path is `ao(15)` → set `bN=15` and enqueue
  transition 35 (`a.java:17314-17320`). Transition 35 loads world records and
  invokes `hu()`/`hv()` (`a.java:1283-1317`). `hu()` reads `/10` block 15 and
  initializes resources from `/5` (`a.java:17322-17548`); `hv()` executes the
  decoded event script (`a.java:17555-17589`).
- The first-world `/10` block-15 script has opcode 110, event keys 5 and 7,
  carrying text IDs 0 and 1. `a.java:17586-17589` looks up the ID and displays
  the resolved string. Text bytes are decoded by the string-pack reader in
  `f.java:1049-1098`. Timing of those event keys is not inferred here.
- `/10` block 16 contains records beginning with marker 50. The decompiler's
  parser is `a.java:1881-2005`; bytecode `a.javap.txt`, method `u(int)`, confirms
  the sequence of byte/short reads and entity-type dispatch. Preserve the raw
  bytes and numeric fields: the exact full record schema/sentinel relationship
  remains unresolved, so do not treat a guessed record layout as verified.
- An independently decoded numeric join associates category 32 records with
  `/9` table 15 and pack-5 registry/frame values. Source call sites prove the
  registry/frame lookup (`a.java:1979-1985,18029-18082`; `e.java:2981-2997`).
  The current join yields IDs `1→(81,0)`, `0→(101,-1)`, `2→(100,0)`,
  `3→(97,0)` but does not establish human names (see `OPENING-FLOW.md`).
- World coordinates are converted by the fixed-point transforms at
  `a.java:16117-16130`; keep Java's signed shifts and integer truncation when
  porting them. These transforms alone do not define a complete camera or draw
  layout.
- `a.e()` updates pending state changes, entity state and elapsed-time fields
  (`a.java:30816-31023`); `f.paint()` calls the subclass callback
  (`f.java:219-268`). `f.run()` schedules repaints and uses configured delay
  (`f.java:194-217`). Do not assume a 120 ms cadence without tracing the field's
  initialization and use.

## Binary formats and draw semantics

### Split resource packs

- `f` opens a resource group, reads a little-endian `u16` block count and
  `u32` little-endian offsets, and maps logical block reads over split resource
  chunks (`f.java:457-545`). For a block it skips to the offset, consumes one
  byte, then returns `offset[n+1] - offset[n] - 1` bytes (`f.java:526-545`).
  The local `pack_loader.py` mirrors this behavior. Never concatenate chunks in
  lexical order (`5.10` is not before `5.2`).
- `/5`, `/2`, `/7`, `/8`, and `/11` include BSprite v5 blocks; `/9` is the
  width-tagged numeric table pack; `/10` contains world/script data rather than
  BSprite blocks; `EN.*` is the indexed language/string pack. Numeric pack and
  block IDs are preserved as evidence, not asset names.

### BSprite / palette / frame data

- `d.a(byte[],int)` checks magic `0x05DF`, reads flags, then module, FModule,
  frame-rect, frame, frame-bound, animation-frame, animation, palette and image
  sections (`d.java:126-198` and `d.javap.txt`). Module payload widths depend on
  flags; image modules and procedural/marker module types are distinct.
  Palette parsing's per-palette color-count/RLE-parameter fields in CFR conflict
  with the exact-fit interpretation used by the existing Python decoder. The
  current working decoder behavior is empirically verified against pack bytes;
  these bytecode field aliases remain unresolved rather than being relabeled as
  proven source semantics.
- FModule records retain module index, offsets and flags. Frame entries point
  into the FModule table; AFrame and animation entries retain numeric source
  links (`d.java:372-499`). The local exported `analysis/frames/pack*.json`
  preserves these relationships.
- Pixel codecs proven in the game include A1R5G5B5 (0x5515) with the source
  magenta transparency/color quirk, and I64RLE (0x64F0) plus I16 (0x1600)
  image data (`d.java:979-1033`; `PACK-MAP.md`). Palette and RLE code length
  must be read from each original block; never hand-type palette or frame data.
- Composition iterates frame FModules, applies the source flag-based horizontal,
  vertical and rotation transforms, offsets, and draws image or shape modules
  (`d.java:1763-1855`). The source wrapper uses MIDP anchor 20 for `drawImage`
  and `drawRegion` (`f.java:647-674`). Preserve `setClip`/clip intersections
  (`f.java:617-626,1317-1359`), pixelated rendering, and the eight MIDP region
  transforms where the original call uses `Graphics.drawRegion`.

### Text and saves

- `f` decodes text-group indexes and string byte ranges from resource packs
  (`f.java:1049-1098`). Text IDs are packed as page/group plus a 10-bit index;
  the source performs `group = id >> 10`, `index = id & 0x3ff` (`f.java:1085-1098`).
- RMS wrapper methods open, read, write and close records (`f.java:1233-1284`).
  The game has `RMSHeader`, `save_farm` and `save_gameplay` records in source,
  but this does not justify reusing the prototype's unrelated save schema as
  source parity.

## Source-backed formulas and data joins

- Pack block byte length is `offset[n+1] - offset[n] - 1`, with the first
  offset byte consumed before the payload (`f.java:526-545`).
- For the two world/screen conversion helpers, with `x,y` as `a.java` inputs:
  `u = (x - 1044) << 8 / 18`, `v = (y - 108) << 8 / 9`, then tile outputs are
  `((u+v)>>8, (v-u)>>8)` (`a.java:16117-16121`). The inverse helper computes
  `u = ((tileX-tileY)<<8)>>1`, `v=(tileY<<8)+u`, then screen outputs
  `((u*18)>>8)+1044, ((v*9)>>8)+108` (`a.java:16124-16130`). Preserve Java
  operator precedence and arithmetic shifts exactly.
- BSprite I64RLE reads byte `v`, emits palette index `v & mask` for
  `(v >>> tableBits) + 1` pixels; I16 reads high nibble then low nibble
  (`d.java:1007-1022`). Keep bounds and consumed-byte validation from the
  existing decoder.
- The `/9` table row/column layout is `rowCount:int32 LE`,
  `columnCount:int32 LE`, `columnCount` width bytes, then each cell in the
  declared 1/2/4-byte width (`g.java:24-58`). Actual row semantics are only
  known where an original caller indexes them; do not publish guessed unit or
  crop statistics.

## Explicitly unresolved (stop rather than guess)

1. Full names/meaning for most numeric UI/game states in `a.java` and exact
   runtime screen composition/paint call graph.
2. Exact full schema of `/10` block-16 type-50 records, despite bytecode evidence
   for the cursor increments and entity factory branches.
3. Semantic mapping from world entity/config/frame numbers to named characters,
   crops, buildings or tools; appearance alone is insufficient.
4. Detailed timing and animation semantics for `i` fields/overloaded methods
   until each gameplay path is cross-checked against bytecode.
5. Original reference screenshots/emulator verification. No local FreeJ2ME
   runtime or original-game capture has been established.
6. Full title/menu/tutorial/gameplay/economy/save behavior and the exact original
   use of procedural BSprite module types.

The unresolved items above block claims of complete 1:1 restoration. Existing
prototype farming prices/timers, visual placeholders, menu model and story
sequencing are not source-derived original behavior.
