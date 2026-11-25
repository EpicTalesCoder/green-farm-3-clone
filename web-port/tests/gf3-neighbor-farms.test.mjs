import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { loadOriginalWorldResources } from '../gf3-resource-loader.js';
import { createFarmSession, visitNeighborFarm, helpNeighborEntity, returnHomeFarm } from '../gf-core.js';

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

test('all 10 neighbor farms (pack10[5..14]) load cleanly, cap helps at 5/day, and return home', async () => {
  const world = await loadOriginalWorldResources({ baseUrl, fetcher: localFetcher, textData });
  assert.equal(world.catalog.neighbors.length, 10);

  const s = createFarmSession(world, textData);
  const homeX = s.farmer.x;
  const homeY = s.farmer.y;

  for (let i = 0; i < 10; i += 1) {
    const res = visitNeighborFarm(s, i, world);
    assert.equal(res.ok, true);
    assert.ok(s.visitingNeighbor.entities.length >= 40);
    // Verify neighbor host character exists and static cat 42 (-1) is identifiable for filtering
    const hostChars = s.visitingNeighbor.entities.filter(e => e.category === 42 && e.entityId >= 0);
    assert.ok(hostChars.length >= 1, `Neighbor #${i} should have a host character`);
  }

  // Help 5 distinct targets on Harold's farm (index 0) and confirm 6th is rejected
  visitNeighborFarm(s, 0, world);
  const targets = s.visitingNeighbor.entities.filter(e => e.category === 49 || e.category === 52 || e.category === 54);
  assert.ok(targets.length >= 6);
  const startCoins = s.coins;
  for (let k = 0; k < 5; k += 1) {
    assert.equal(helpNeighborEntity(s, targets[k].opaqueKey, targets[k].x, targets[k].y).ok, true);
  }
  assert.equal(s.coins, startCoins + 100);
  assert.equal(helpNeighborEntity(s, targets[5].opaqueKey, targets[5].x, targets[5].y).reason, 'max_helps');

  // Return home restores original Farmer coordinates
  assert.equal(returnHomeFarm(s, world.tileMap).ok, true);
  assert.equal(s.visitingNeighbor, null);
  assert.equal(s.farmer.x, homeX);
  assert.equal(s.farmer.y, homeY);
});
