import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { loadOriginalWorldResources } from '../gf3-resource-loader.js';
import {
  SOURCE_VIEW, createFarmSession, stepFarmSession,
  pickFarmerWalkAnim, snapPlotToIso4x4, isWalkBlocked, isPlotFootprintBlocked,
  moveFarmerByVector, setFarmerWalkTarget, plowPlot,
} from '../gf-core.js';

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

test('farmer directional animations, 80ms clock, pond/manor collision & 4x4 non-overlapping plots', async () => {
  const world = await loadOriginalWorldResources({ baseUrl, fetcher: localFetcher, textData });
  const s = createFarmSession(world, textData);
  s.view = SOURCE_VIEW.WORLD_LAYER;

  // Pure Left/Right always uses front-walk anim 0 (never turns back)
  assert.deepEqual(pickFarmerWalkAnim(1, 0), { anim: 0, hFlip: true });
  assert.deepEqual(pickFarmerWalkAnim(-1, 0), { anim: 0, hFlip: false });
  assert.deepEqual(pickFarmerWalkAnim(0, -1), { anim: 1, hFlip: false });
  assert.deepEqual(pickFarmerWalkAnim(0, 1), { anim: 0, hFlip: false });

  // Collision blocks Pond oval (1044, 603 / 1044, 627 / 1000, 603) and Manor core/steps (1215, 384..444)
  assert.equal(isWalkBlocked(1044, 603, world.tileMap), true);
  assert.equal(isWalkBlocked(1044, 627, world.tileMap), true);
  assert.equal(isWalkBlocked(1000, 603, world.tileMap), true);
  assert.equal(isWalkBlocked(1215, 384, world.tileMap), true);
  assert.equal(isWalkBlocked(1215, 444, world.tileMap), true);
  assert.equal(isWalkBlocked(1089, 428, world.tileMap), false);
  assert.equal(plowPlot(s, 23, 33, 1215, 415).reason, 'blocked');
  assert.equal(plowPlot(s, 24, 33, 1215, 450).reason, 'blocked'); // 72x36 diamond reaches Manor steps
  assert.equal(plowPlot(s, 35, 29, 1044, 648).reason, 'blocked'); // 72x36 diamond reaches Pond rim
  assert.equal(isPlotFootprintBlocked(1008, 468, world.tileMap), false);

  // Farmer movement advances position and 80ms animation clock
  const startX = s.farmer.x;
  moveFarmerByVector(s, -1, 0, 100, world.tileMap);
  assert.ok(s.farmer.x < startX);
  stepFarmSession(s, 160, world.tileMap);
  assert.equal(s.animTimeMs, 160);

  // Autonomous click-to-walk must stop cleanly outside Pond & Manor boundaries
  s.farmer.x = 1044;
  s.farmer.y = 665;
  setFarmerWalkTarget(s, 1044, 603, null);
  for (let i = 0; i < 40; i += 1) stepFarmSession(s, 50, world.tileMap);
  assert.equal(isWalkBlocked(s.farmer.x, s.farmer.y, world.tileMap), false);
  assert.ok(s.farmer.y >= 638);

  s.farmer.x = 1215;
  s.farmer.y = 480;
  setFarmerWalkTarget(s, 1215, 380, null);
  for (let i = 0; i < 40; i += 1) stepFarmSession(s, 50, world.tileMap);
  assert.equal(isWalkBlocked(s.farmer.x, s.farmer.y, world.tileMap), false);
  assert.ok(s.farmer.y >= 448);

  // 4x4 plot snapping prevents overlapping plots
  const snapped = snapPlotToIso4x4(900, 520);
  const first = plowPlot(s, 29, 25, snapped.wx, snapped.wy);
  assert.equal(first.ok, true);
  const overlap = plowPlot(s, 29, 26, snapped.wx + 5, snapped.wy + 3);
  assert.equal(overlap.ok, false);
  assert.equal(overlap.reason, 'overlap');
});
