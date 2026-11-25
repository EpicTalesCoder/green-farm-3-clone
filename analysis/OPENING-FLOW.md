# Green Farm 3 opening-flow evidence

This records facts joined from the original decompiled source, world/config data,
and decoded BSprite frame metadata. Sprite IDs are only assigned to entities
where the original world record and config row provide a direct mapping. Textures
are not relabelled as Cindy/wheat without an independent semantic source.

## Verified startup path

- `a.java:25744-25750` starts the new-world path with `ao(15)`.
- `a.java:17314-17320` selects world `bN=15` and queues transition 35.
- `a.java:1283-1294` transition 35 prepares `/5` and calls `hu()`/`hv()`.
- `a.java:17342-17348` parses `/10` block 15 as the initial world event script.
- `a.java:17542-17548` loads `/10` block 16 as world entity records.
- `e.java:2732-3046` creates entities from their numeric type and config fields;
  its type-32 case reads registry index `E` and frame index `F` at `e.java:2981-2997`.
- The startup transition runs from the active game loop at `a.java:18406-18408`.

## Verified original opening story

The first-world `/10` block-15 type-0/context-0 script has opcode 110 on event
keys 5 and 7, referencing text IDs 0 and 1 respectively. `a.java:17586-17589`
proves opcode 110 resolves the text ID and displays that string at the event's
coordinates. `tests/green-farm-3-world.test.mjs` checks this byte-data-to-text join
against decoded `page_0`. The actual event-key timing depends on the game's
runtime trigger path.

`page_0` IDs 0 and 1 are the recovered opening-story lines in Vietnamese. Cindy
Lou's greeting (ID 3) and tutorial prompts (IDs 4, 6, 7) are also present in the
text pack, but the source path currently traced here does not link those IDs to a
specific first-world event. Do not splice them into the browser opening by
assumption.

## Original world entity → config → sprite provenance

`decode_world.py` exports `/10` blocks 15 and 16, `/9` config table 15, and
joins those numeric records to `/5` block/frame metadata. The verified category-
15/type-32 mapping is:

| world record entity ID | initial position | config row | pack 5 block | frame field | composition status |
|---:|---:|---:|---:|---:|---|
| 1 | (16,152) | 1 | 81 | 0 | 8 FModules, all image modules; exact source frame exported |
| 0 | (23,279) | 0 | 101 | -1 | dynamic frame selector, single frame not applicable |
| 2 | (23,279) | 2 | 100 | 0 | 17 image FModules; exact source frame exported |
| 3 | (23,279) | 3 | 97 | 0 | has shape/marker modules; compositor refuses partial image-only output |

These numeric mappings are source-derived from `/10`, `/9`,
`a.java:1979-1985`, `a.java:2160-2180`, `a.java:18029-18082`, and
`e.java:2981-2997`. The code proves block/frame use, not the semantic name of each
entity. `render_frame.py` composes supported image-only frames as SVG references
to the original PNG module bytes; source block 100/frame 0 composes to a
full-viewport farm illustration. This visual content strongly suggests an
intro/hero illustration but no named source row has yet tied it to “Cindy Lou”.
Frame 81/frame 0 is a separate logo-like composition. Neither frame is asserted
to be the tutorial's live character or wheat crop without a data/code join.

A browser may draw only these verified compositions at source-derived layout
positions once runtime world coordinates are understood. The block-16 record parser sees four 13-byte records beginning with type marker
50. The decompiled cursor has an apparent overlapping offset around the final
sentinel byte, so the record schema remains provisional until bytecode
verification. The `/9` row to pack-5 registry/frame link is independently
confirmed by the category-15 factory.

## Still unresolved

- The semantic names for world entity IDs 0–3 and pack 5 blocks 81, 101, 100 and
  97 are not identified in named source data yet. They cannot yet be called Cindy,
  wheat, a farm plot, or a UI asset solely from appearance.
- The `/10` block-16 parser in `a.java:u(int)` has a decompiler cursor/overload
  ambiguity. Raw bytes remain retained until its exact record schema is confirmed;
  the table join above uses the explicit type-32 registry path and numeric IDs.
- No local Java runtime/J2ME emulator is installed, so screen-level visual parity
  with the original MIDlet has not been checked.

Until those gaps close, do not claim the port is pixel-identical or that the
Cindy/wheat opening tutorial has been restored. Keep SMS/IAP, network accounts,
social and remote-server operations disabled.