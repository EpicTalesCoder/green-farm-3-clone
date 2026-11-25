import test from 'node:test';
import assert from 'node:assert/strict';
import { readFileSync } from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import {
  decodeConfigTable,
  decodeWorldEntities,
  decodeWorldScript,
  decodeTileMap,
  joinCategory32Entities,
} from '../gf3-resource-loader.js';
import { loadSplitPack, readPackBlock } from '../bsprite-loader.js';

const ROOT = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '../..');
const RECOVERED = path.join(ROOT, 'analysis/recovered');

function nodeFileFetcher() {
  return async (url) => {
    try { return new Response(readFileSync(fileURLToPath(url)), { status: 200 }); }
    catch { return new Response(null, { status: 404 }); }
  };
}

async function readOriginalPack(id) {
  return loadSplitPack(new URL(`file://${path.join(RECOVERED, String(id))}`).href, nodeFileFetcher());
}

test('original /9 table 15 decodes exact widths and category-32 numeric joins', async () => {
  const configPack = await readOriginalPack(9);
  const table = decodeConfigTable(readPackBlock(configPack, 15));
  assert.equal(table.rowCount, 28);
  assert.equal(table.columnCount, 8);
  assert.deepEqual(table.widths, [4, 2, 2, 2, 2, 2, 2, 2]);

  const worldPack = await readOriginalPack(10);
  const records = decodeWorldEntities(readPackBlock(worldPack, 16));
  const joined = joinCategory32Entities(records, table);
  assert.deepEqual(records.filter((record) => record.recordType === 50).map((record) => [record.sourceOffset, record.categoryOffset, record.entityIdOffset]), [
    [0, 8, 9], [13, 21, 22], [26, 34, 35], [39, 47, 48],
  ]);
  assert.deepEqual(joined.map((entity) => [entity.sourceEntityId, entity.worldPosition.x, entity.worldPosition.y, entity.spriteRegistryIndex, entity.frameIndex]), [
    [1, 16, 152, 81, 0],
    [0, 23, 279, 101, -1],
    [2, 23, 279, 100, 0],
    [3, 23, 279, 97, 0],
  ]);
  assert.ok(joined.every((entity) => entity.identity === 'unresolved numeric source entity'));
});

test('original /10 block 15 script opcode 110 and text IDs come from source bytes', async () => {
  const pack = await readOriginalPack(10);
  const script = decodeWorldScript(readPackBlock(pack, 15));
  const group = script.scripts[0].groups.find((item) => item.groupType === 0 && item.context === 0);
  assert.ok(group);
  assert.deepEqual(group.records.filter((record) => [5, 7].includes(record.eventKey)).map((record) => [record.eventKey, record.commands[0].opcode, record.commands[0].args[0]]), [
    [5, 110, 0],
    [7, 110, 1],
  ]);
});

test('config parser rejects malformed widths, truncation, and trailing data', () => {
  assert.throws(() => decodeConfigTable(new Uint8Array(9)), /unexplained trailing bytes/);
  const badWidth = new Uint8Array(8 + 1);
  new DataView(badWidth.buffer).setInt32(0, 0, true);
  new DataView(badWidth.buffer).setInt32(4, 1, true);
  badWidth[8] = 3;
  assert.throws(() => decodeConfigTable(badWidth), /Unsupported config widths/);
});
