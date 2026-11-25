import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { loadOriginalWorldResources } from '../gf3-resource-loader.js';
import {
  SOURCE_VIEW, createFarmSession, stepFarmSession,
  startKitchenRecipe, collectKitchenDish, startFeedMillRecipe, collectFeedMillBatch,
  upgradeBarn, upgradeCoop, sellGood,
  collectOrFeedAnimal, serializeFarmSession, restoreFarmSession,
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

test('kitchen 4-stove cap, ingredient validation, cooking completion, barn sell & upgrade', async () => {
  const world = await loadOriginalWorldResources({ baseUrl, fetcher: localFetcher, textData });
  const s = createFarmSession(world, textData);
  s.view = SOURCE_VIEW.WORLD_LAYER;
  s.level = 10;
  s.coins = 1000;

  const flour = world.catalog.recipes.find(r => r.id === 6001);
  assert.ok(flour);
  assert.equal(flour.iconBlock, 51);
  assert.equal(flour.ingredients[0].qty, 4);

  // Starting farm animals must retain real names from /9[0] (never fall back to Gà con Delaware)
  const animalNames = s.animals.map(a => a.name);
  assert.ok(animalNames.includes('Bò siêu hạng'));
  assert.ok(animalNames.includes('Cừu Cheviot'));

  // Missing ingredient rejected cleanly
  assert.equal(startKitchenRecipe(s, flour.id).reason, 'missing_ingredient');

  // Stock ingredients for 5 batches -> 4 stoves succeed, 5th hits 'full'
  for (const ing of flour.ingredients) {
    s.inventory.set(ing.goodId, { id: ing.goodId, name: ing.name, qty: ing.qty * 5, sellPrice: 20 });
  }
  for (let i = 0; i < 4; i += 1) {
    assert.equal(startKitchenRecipe(s, flour.id).ok, true);
  }
  assert.equal(startKitchenRecipe(s, flour.id).reason, 'full');

  // Step timer -> collect all 4 dishes -> verify inventory iconBlock & sell -> upgrade Barn & Coops
  stepFarmSession(s, flour.cookSec * 1000 + 200);
  while (s.kitchenQueue.length > 0) {
    assert.equal(collectKitchenDish(s, s.kitchenQueue[0].uid).ok, true);
  }
  assert.equal(s.inventory.get(flour.outputGoodId).qty, 4);
  assert.equal(s.inventory.get(flour.outputGoodId).iconBlock, 51);

  const coinsBefore = s.coins;
  assert.equal(sellGood(s, flour.outputGoodId, 4).ok, true);
  assert.ok(s.coins > coinsBefore);

  const capBefore = s.barnCapacity;
  assert.equal(upgradeBarn(s).ok, true);
  assert.equal(s.barnCapacity, capBefore + 20);

  const coopBefore = s.coopCapacity;
  assert.equal(upgradeCoop(s, 'chicken').ok, true);
  assert.equal(s.coopCapacity, coopBefore + 4);

  // Milk harvest from Cow uses milk emoji (not egg), and restore heals stale "Sản phẩm Gà con Delaware" & blocked Manor-step plots
  const cow = s.animals.find(a => /bò/i.test(a.name));
  assert.ok(cow);
  cow.ready = true;
  const milkRes = collectOrFeedAnimal(s, cow.uid);
  assert.equal(milkRes.ok, true);
  assert.equal(milkRes.prodName, 'Sữa');
  assert.match(s.toast, /^🥛 /);

  const rawSave = JSON.parse(serializeFarmSession(s));
  rawSave.inventory.push(
    { id: 4001, name: 'Sản phẩm Gà con Delaware', qty: 2, sellPrice: 12, iconBlock: 2, iconFrame: 0 },
    { id: 4047, name: 'Sản phẩm Gà con Delaware', qty: 1, sellPrice: 20, iconBlock: 2, iconFrame: 3 },
  );
  rawSave.plots.push({ row: 24, col: 33, worldX: 1206, worldY: 441, cropId: 3004, stage: 'ready', progressMs: 9000, growMs: 9000 });
  const healed = restoreFarmSession(JSON.stringify(rawSave), world, textData);
  assert.equal(healed.inventory.get(4001)?.name, 'Trứng');
  assert.equal(healed.inventory.get(4003)?.name, 'Len');
  assert.equal(healed.plots.has('24,33'), false);

  // Feed Mill (/9[22]) crafts Cow feed and feeds Cow from feedStock (rejects when feedStock depleted)
  assert.equal(world.catalog.feedRecipes.length, 6);
  assert.ok(world.farmEntities.some(e => e.category === 50 && e.entityId === 14));
  assert.ok(world.catalog.recipes.some(r => r.category === 'bakery' && /Bột|Bơ|Bánh/i.test(r.name)));
  const cowFeedRecipe = world.catalog.feedRecipes[0];
  s.inventory.set(cowFeedRecipe.ingredients[0].goodId, { id: cowFeedRecipe.ingredients[0].goodId, name: cowFeedRecipe.ingredients[0].name, qty: 4, sellPrice: 12 });
  assert.equal(startFeedMillRecipe(s, cowFeedRecipe.id).ok, true);
  stepFarmSession(s, cowFeedRecipe.millSec * 1000 + 200);
  const feedBefore = s.feedStock.get(4111)?.qty || 0;
  assert.equal(collectFeedMillBatch(s, s.millQueue[0].uid).ok, true);
  assert.equal(s.feedStock.get(4111).qty, feedBefore + cowFeedRecipe.outputQty);
  assert.equal(collectOrFeedAnimal(s, cow.uid).action, 'fed');
  cow.fed = false;
  s.feedStock.clear();
  assert.equal(collectOrFeedAnimal(s, cow.uid).reason, 'no_feed');
});
