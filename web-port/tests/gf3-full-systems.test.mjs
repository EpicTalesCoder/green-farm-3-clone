import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { loadOriginalWorldResources } from '../gf3-resource-loader.js';
import {
  SOURCE_VIEW, createFarmSession, stepFarmSession,
  plantFruitTree, placeDecoration, clearDebris, buyLandZone,
  findLandZoneAtPoint, isPointInUnlockedLand, plowPlot,
  startKitchenRecipe, collectKitchenDish, repairManorRoom,
  upgradeBarn, claimMail, helpNeighbor, openBuildingMenu,
  startFishingRound, castFishingLine, scoopPondWater,
  visitNeighborFarm, helpNeighborEntity, returnHomeFarm, isWalkBlocked,
  serializeFarmSession, restoreFarmSession,
} from '../gf-core.js';

const __dirname = path.dirname(fileURLToPath(import.meta.url));
const webPortDir = path.resolve(__dirname, '..');

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

test('full /9 catalog & all building/kitchen/tree/land/neighbor/mail systems work end-to-end', async () => {
  const textData = JSON.parse(fs.readFileSync(path.join(webPortDir, 'assets/text/en.json'), 'utf8'));
  const baseUrl = new URL('../assets/packs/', import.meta.url).href;
  const world = await loadOriginalWorldResources({ baseUrl, fetcher: localFetcher, textData });

  assert.equal(world.catalog.buildings.length, 20);
  assert.equal(world.catalog.recipes.length, 83);
  assert.equal(world.catalog.neighbors.length, 10);
  assert.equal(world.catalog.collectibles.length, 15);
  assert.ok(world.catalog.decorations.length >= 40);
  assert.equal(world.catalog.crops.filter(c => c.isTree).length, 10);

  const s = createFarmSession(world, textData);
  s.view = SOURCE_VIEW.WORLD_LAYER;
  s.coins = 5000;
  s.level = 10;

  // 1. Kitchen cooking: give 4 Wheat (4009) -> cook Bột (6001) -> step -> collect
  const flour = world.catalog.recipes.find(r => r.id === 6001);
  assert.ok(flour);
  for (const ing of flour.ingredients) {
    s.inventory.set(ing.goodId, { id: ing.goodId, name: ing.name, qty: 10, sellPrice: 20 });
  }
  const cookStart = startKitchenRecipe(s, flour.id);
  assert.equal(cookStart.ok, true);
  stepFarmSession(s, flour.cookSec * 1000 + 500);
  assert.equal(s.kitchenQueue[0].ready, true);
  const cooked = collectKitchenDish(s, s.kitchenQueue[0].uid);
  assert.equal(cooked.ok, true);
  assert.ok((s.inventory.get(flour.outputGoodId)?.qty || 0) >= 1);

  // 2. Locked land detection, direct parcel plow guard, Expansion, Trees, Decor, Debris clearing
  assert.equal(findLandZoneAtPoint(650, 480)?.id, 'west');
  assert.equal(isPointInUnlockedLand(s, 650, 480), false);
  assert.equal(plowPlot(s, 27, 18, 650, 480).reason, 'land_locked');
  assert.equal(buyLandZone(s, 'west').ok, true);
  assert.ok(s.unlockedZones.includes('west'));
  assert.equal(isPointInUnlockedLand(s, 650, 480), true);

  const appleTree = world.catalog.crops.find(c => c.id === 3012);
  const prevTrees = s.fruitTrees.length;
  assert.equal(plantFruitTree(s, appleTree.id, 1060, 460).ok, true);
  assert.equal(s.fruitTrees.length, prevTrees + 1);

  const signDecor = world.catalog.decorations[0];
  assert.equal(placeDecoration(s, signDecor.id, 1020, 480).ok, true);
  assert.equal(s.placedDecor.length, 1);

  assert.equal(clearDebris(s, 78, 1341, 360).ok, true);
  assert.ok(s.clearedDebris.includes(78));

  // 3. Manor room repair, Barn upgrade, Mail claim, Neighbor help, Building dispatch
  assert.equal(repairManorRoom(s, 0).ok, true);
  assert.equal(s.unlockedRooms[0], true);

  const prevCap = s.barnCapacity;
  assert.equal(upgradeBarn(s).ok, true);
  assert.equal(s.barnCapacity, prevCap + 20);

  assert.equal(claimMail(s, s.neighborMail[0].id).ok, true);
  assert.equal(helpNeighbor(s, world.catalog.neighbors[0].id).ok, true);
  assert.equal(openBuildingMenu(s, 2), 'kitchen');
  assert.equal(s.view, SOURCE_VIEW.KITCHEN);
  assert.equal(openBuildingMenu(s, 10), 'barn');
  assert.equal(s.view, SOURCE_VIEW.BARN);
  assert.equal(openBuildingMenu(s, 14), 'feed_mill');
  assert.equal(s.view, SOURCE_VIEW.FEED_MILL);
  assert.equal(openBuildingMenu(s, 17), 'fishing');
  assert.equal(s.view, SOURCE_VIEW.FISHING);

  // 3b. Pond Fishing Minigame (/9[19] loot table) & scoop water energy refill
  assert.equal(startFishingRound(s, 0, 100000).ok, true);
  assert.equal(s.fishing.mode, 'playing');
  const firstFish = s.fishing.bubbles[0].num;
  const castRes = castFishingLine(s, firstFish);
  assert.equal(castRes.ok, true);
  assert.ok(castRes.reward?.name);
  s.energy = 10;
  assert.equal(scoopPondWater(s).energy, 15);

  // 4. Visiting all 10 real neighbor farms (pack10[5..14]) + helping + returning home + collision
  for (let n = 0; n < 10; n += 1) {
    const ents = world.neighborFarmEntities(n);
    assert.ok(ents.length >= 40, `Neighbor #${n} should decode real pack10[${5 + n}] entities`);
  }
  const visit = visitNeighborFarm(s, 1, world);
  assert.equal(visit.ok, true);
  assert.equal(s.visitingNeighbor.name, 'Edwina');
  const target = s.visitingNeighbor.entities.find(e => e.category === 49 || e.category === 52 || e.category === 54);
  assert.ok(target);
  assert.equal(helpNeighborEntity(s, target.opaqueKey, target.x, target.y).ok, true);
  assert.equal(s.visitingNeighbor.helpsToday, 1);
  assert.equal(returnHomeFarm(s, world.tileMap).ok, true);
  assert.equal(s.visitingNeighbor, null);
  assert.equal(isWalkBlocked(1044, 603, world.tileMap), true); // Pond blocked

  // 5. Serialize & Restore preserves all new systems
  const raw = serializeFarmSession(s);
  const restored = restoreFarmSession(raw, world, textData);
  assert.ok(restored.unlockedZones.includes('west'));
  assert.equal(restored.placedDecor.length, 1);
  assert.equal(restored.barnCapacity, prevCap + 20);
  assert.equal(restored.unlockedRooms[0], true);
});
