import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { loadSplitPack, readPackBlock, decodeBSpriteBlock } from '../bsprite-loader.js';
import { loadOriginalWorldResources } from '../gf3-resource-loader.js';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const webPortDir = path.resolve(__dirname, '..');
const textData = JSON.parse(fs.readFileSync(path.join(webPortDir, 'assets/text/en.json'), 'utf8'));
const baseUrl = new URL('../assets/packs/', import.meta.url).href;

function localFetcher(url) {
  const filePath = fileURLToPath(url);
  if (!fs.existsSync(filePath)) return Promise.resolve({ ok: false, status: 404 });
  const buf = fs.readFileSync(filePath);
  return Promise.resolve({
    ok: true,
    arrayBuffer: async () => buf.buffer.slice(buf.byteOffset, buf.byteOffset + buf.byteLength),
    json: async () => JSON.parse(buf.toString('utf8')),
  });
}

test('all 28 /6 UI screens decode cleanly and /7 UI icons + IAP "+" filter work', async () => {
  const world = await loadOriginalWorldResources({ baseUrl, fetcher: localFetcher, textData });
  assert.ok(world.packs[6], 'Pack /6 should be loaded');

  for (let i = 0; i < 28; i += 1) {
    const widgets = world.uiScreen(i);
    assert.ok(Array.isArray(widgets) && widgets.length > 0, `UI screen /6[${i}] should decode non-empty widgets`);
  }

  // Verify /6[1] HUD identifies the two IAP '+' buttons (spr 41 frm 3) and star badges (spr 20 frm 183)
  const hud = world.uiScreen(1);
  const iapPlus = hud.filter(w => w.type === 205 && w.spriteId === 41 && w.frameIndex === 3);
  const iapStars = hud.filter(w => w.type === 205 && w.spriteId === 20 && w.frameIndex === 183);
  assert.equal(iapPlus.length, 2);
  assert.equal(iapStars.length, 2);

  // Verify key /7 UI BSprite blocks (crop icons 9, portrait 7, softkeys 12, parchment frame 22) decode cleanly
  const pack7 = await loadSplitPack(new URL('7/7', baseUrl).href, localFetcher);
  for (const blk of [2, 7, 9, 12, 20, 22, 33, 41]) {
    const sp = decodeBSpriteBlock(readPackBlock(pack7, blk));
    assert.ok(sp.frames.length > 0, `pack7[${blk}] should decode frames`);
  }
});
