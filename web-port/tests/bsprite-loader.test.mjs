import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import { fileURLToPath } from 'node:url';
import path from 'node:path';
import { loadSplitPack, readPackBlock, decodeBSpriteBlock } from '../bsprite-loader.js';
import { drawRegionMIDP, withMIDPClip } from '../render-original.js';

const ANALYSIS = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '../../analysis');
const PACK = path.join(ANALYSIS, 'recovered', '5');
const CHUNK_COUNT = 39;
const SOURCE_METADATA = JSON.parse(readFileSync(path.join(ANALYSIS, 'frames', 'pack5.json'), 'utf8'));

async function readOriginalPack() {
  const fetcher = async (url) => {
    const file = fileURLToPath(url);
    try {
      const bytes = readFileSync(file);
      return new Response(bytes, { status: 200 });
    } catch {
      return new Response(null, { status: 404 });
    }
  };
  const pack = await loadSplitPack(new URL(`file://${PACK}`).href, fetcher, CHUNK_COUNT);
  return pack;
}

test('browser pack reader retains split-pack boundaries and original offset discard', async () => {
  const pack = await readOriginalPack();
  assert.equal(pack.offsets.length, 161);
  assert.equal(pack.chunkLengths.length, 40);
  assert.equal(pack.virtual.length, 10000 * 39 + 7326);
  for (const blockIndex of [0, 1, 50, 100, 159]) {
    const bytes = readPackBlock(pack, blockIndex);
    assert.ok(bytes.byteLength > 0, `source block ${blockIndex} is non-empty`);
    assert.equal(bytes[0] | (bytes[1] << 8), 0x05df, `pack-5 block ${blockIndex} BSprite magic`);
  }
});

test('MIDP drawRegion helper handles anchor, all eight transforms, and clipping', () => {
  const calls = [];
  const ctx = {
    imageSmoothingEnabled: true,
    save() { calls.push(['save']); },
    restore() { calls.push(['restore']); },
    translate(...args) { calls.push(['translate', ...args]); },
    scale(...args) { calls.push(['scale', ...args]); },
    rotate(...args) { calls.push(['rotate', ...args]); },
    drawImage(...args) { calls.push(['drawImage', ...args]); },
    beginPath() { calls.push(['beginPath']); },
    rect(...args) { calls.push(['rect', ...args]); },
    clip() { calls.push(['clip']); },
  };
  for (let transform = 0; transform < 8; transform += 1) {
    calls.length = 0;
    const result = drawRegionMIDP(ctx, {}, 1, 2, 8, 6, transform, 40, 50, 20);
    assert.equal(result.x, 40);
    assert.equal(result.y, 50);
    assert.equal(ctx.imageSmoothingEnabled, false);
    assert.ok(calls.some(([name]) => name === 'drawImage'));
  }
  assert.throws(() => drawRegionMIDP(ctx, {}, 0, 0, 1, 1, 8, 0, 0), RangeError);
  let clipped = false;
  withMIDPClip(ctx, 1, 2, 3, 4, () => { clipped = true; });
  assert.equal(clipped, true);
  assert.deepEqual(calls.filter(([name]) => ['beginPath', 'rect', 'clip'].includes(name)).map(([name]) => name), ['beginPath', 'rect', 'clip']);
});

test('browser BSprite parser preserves source metadata and fully decodes original modules', async () => {
  const pack = await readOriginalPack();
  for (const blockIndex of [0, 1, 10, 50, 100, 159]) {
    const source = SOURCE_METADATA.frames_by_block.find((block) => block.block === blockIndex);
    const decoded = decodeBSpriteBlock(readPackBlock(pack, blockIndex));
    assert.equal(decoded.modules.length, source.modules.length, `pack-5 block ${blockIndex} module count`);
    assert.equal(decoded.fmodules.length, source.frame_modules.length, `pack-5 block ${blockIndex} FModule count`);
    assert.equal(decoded.frames.length, source.frames.length, `pack-5 block ${blockIndex} frame count`);
    assert.equal(decoded.animations.length, source.animations.length, `pack-5 block ${blockIndex} animation count`);
    assert.equal(decoded.moduleImages.filter(Boolean).length, source.modules.filter((module) => module.type === 0).length);
    assert.deepEqual(decoded.frames.map((frame) => [frame.firstFmodule, frame.fmoduleCount]),
      source.frames.map((frame) => [frame.first_frame_module, frame.frame_module_count]));
  }
});
