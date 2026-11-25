import assert from 'node:assert/strict';
import fs from 'node:fs';
import { fileURLToPath, pathToFileURL } from 'node:url';
import test from 'node:test';
import { loadOriginalWorldResources } from '../gf3-resource-loader.js';
import {
  createFarmSession,
  stepFarmSession,
  plowPlot,
  plantCropOnPlot,
  waterPlot,
  harvestPlot,
  buyAnimal,
  collectOrFeedAnimal,
  sellAllGoods,
  serializeFarmSession,
  restoreFarmSession,
} from '../gf-core.js';

const basePacksUrl = new URL('../assets/packs/', import.meta.url).href;
const textData = JSON.parse(fs.readFileSync(new URL('../assets/text/en.json', import.meta.url), 'utf8'));
const localFetcher = async (url) => {
  const fp = fileURLToPath(url);
  return {
    ok: true,
    status: 200,
    arrayBuffer: async () => fs.readFileSync(fp),
    json: async () => JSON.parse(fs.readFileSync(fp, 'utf8')),
  };
};

test('decodeFarmCatalog loads real crops, animals, and quests from /9 and en.json', async () => {
  const world = await loadOriginalWorldResources({ baseUrl: basePacksUrl, fetcher: localFetcher, textData });
  assert.ok(world.catalog.crops.length >= 20);
  assert.ok(world.catalog.animals.length >= 10);
  assert.ok(world.catalog.quests.length >= 15);
  const wheat = world.catalog.crops.find(c => c.id === 3004);
  assert.equal(wheat.name, 'Lúa mì');
  assert.equal(wheat.buyPrice, 10);
});

test('farm loop: plow -> plant -> water -> grow -> harvest -> sell -> save/restore', async () => {
  const world = await loadOriginalWorldResources({ baseUrl: basePacksUrl, fetcher: localFetcher, textData });
  const s = createFarmSession(world, textData);
  s.view = 'world-layer-evidence';
  const startCoins = s.coins;

  assert.equal(plowPlot(s, 8, 8).ok, true);
  assert.equal(plantCropOnPlot(s, 8, 8, 3004).ok, true);
  assert.equal(waterPlot(s, 8, 8).ok, true);
  assert.ok(s.coins < startCoins);

  stepFarmSession(s, 15000);
  assert.equal(s.plots.get('8,8').stage, 'ready');

  const hv = harvestPlot(s, 8, 8);
  assert.equal(hv.ok, true);
  assert.equal(s.inventory.get(hv.itemId).qty, 1);

  const sold = sellAllGoods(s);
  assert.equal(sold.ok, true);
  assert.ok(sold.earned > 0);
  assert.equal(s.inventory.size, 0);

  const bought = buyAnimal(s, s.catalog.animals[0].id, 10, 10);
  assert.equal(bought.ok, true);
  stepFarmSession(s, 30000);
  assert.equal(collectOrFeedAnimal(s, bought.animal.uid).action, 'collected');

  const raw = serializeFarmSession(s);
  const restored = restoreFarmSession(raw, world, textData);
  assert.equal(restored.coins, s.coins);
  assert.equal(restored.animals.length, s.animals.length);
});
