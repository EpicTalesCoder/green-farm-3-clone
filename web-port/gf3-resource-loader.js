/** Source-indexed Green Farm 3 readers for original Gameloft resource packs. */
import { loadSplitPack, readPackBlock } from './bsprite-loader.js';

function checkedByte(data, offset, label) {
  if (!Number.isInteger(offset) || offset < 0 || offset >= data.length) {
    throw new RangeError(`Truncated ${label} at ${offset}`);
  }
  return data[offset];
}

function checkedU16(data, offset, label) {
  if (offset < 0 || offset + 2 > data.length) throw new RangeError(`Truncated ${label} at ${offset}`);
  return new DataView(data.buffer, data.byteOffset + offset, 2).getUint16(0, true);
}

function checkedI16(data, offset, label) {
  if (offset < 0 || offset + 2 > data.length) throw new RangeError(`Truncated ${label} at ${offset}`);
  return new DataView(data.buffer, data.byteOffset + offset, 2).getInt16(0, true);
}

function checkedI32(data, offset, label) {
  if (offset < 0 || offset + 4 > data.length) throw new RangeError(`Truncated ${label} at ${offset}`);
  return new DataView(data.buffer, data.byteOffset + offset, 4).getInt32(0, true);
}

// Port of g.java:15-58 (table header, widths, and signed Java cells).
export function decodeConfigTable(data) {
  const rowCount = checkedI32(data, 0, 'table row count');
  const columnCount = checkedI32(data, 4, 'table column count');
  if (rowCount < 0 || columnCount < 0 || rowCount > 100000 || columnCount > 4096) {
    throw new RangeError(`Invalid config table dimensions ${rowCount}x${columnCount}`);
  }
  let offset = 8;
  const widths = Array.from({ length: columnCount }, (_, column) => checkedByte(data, offset++, `table column ${column} width`));
  if (widths.some((width) => width !== 1 && width !== 2 && width !== 4)) {
    throw new RangeError(`Unsupported config widths: ${widths.join(',')}`);
  }
  const rows = [];
  for (let rowIndex = 0; rowIndex < rowCount; rowIndex += 1) {
    const row = [];
    for (const width of widths) {
      if (offset + width > data.length) throw new RangeError(`Truncated config cell at ${offset}`);
      if (width === 1) row.push((data[offset] << 24) >> 24);
      else if (width === 2) row.push(checkedI16(data, offset, `table row ${rowIndex} cell`));
      else row.push(checkedI32(data, offset, `table row ${rowIndex} cell`));
      offset += width;
    }
    rows.push(row);
  }
  if (offset !== data.length) throw new RangeError(`Config table has ${data.length - offset} unexplained trailing bytes`);
  return { rowCount, columnCount, widths, rows };
}

const SCRIPT_ARGUMENT_WIDTHS = new Map([
  [11, [2, 2]], [12, [2, 2]], [21, [2, 2]], [22, [1, 1]],
  [102, [2]], [103, [2, 2, 2, 2]], [104, [2, 2, 2, 2]],
  [105, [2, 2, 2, 2]], [106, [2, 2]], [107, [2]],
  [108, [2, 2, 2, 2]], [109, [2, 2, 2, 2]], [110, [2, 2, 2]],
  [111, [2, 2]], [112, [2, 2]], [113, []], [114, [2, 2]],
  [115, [2, 2]], [116, []],
]);

// Port of a.java:17322-17548 and bytecode a.javap.txt:70632+ for /10 scripts.
export function decodeWorldScript(data) {
  let offset = 0;
  const take = (size, label) => {
    if (offset + size > data.length) throw new RangeError(`Truncated ${label} at ${offset}`);
    const start = offset;
    offset += size;
    return start;
  };
  const u8 = (label) => data[take(1, label)];
  const u16 = (label) => checkedI16(data, take(2, label), label);
  const scripts = [];
  const outerCount = u8('outer script count');
  for (let scriptIndex = 0; scriptIndex < outerCount; scriptIndex += 1) {
    take(2, 'outer script header');
    const groupCount = u8('script group count');
    const groups = [];
    for (let groupIndex = 0; groupIndex < groupCount; groupIndex += 1) {
      const groupType = u8('script group type');
      let context;
      if (groupType === 0 || groupType === 1) context = u8('script byte context');
      else if (groupType === 2) { take(1, 'script context marker'); context = u16('script word context'); }
      else throw new RangeError(`Unsupported source script group type ${groupType}`);
      const recordCount = u16('script record count');
      const records = [];
      for (let recordIndex = 0; recordIndex < recordCount; recordIndex += 1) {
        const eventKey = u16('script event key');
        const commands = [];
        const commandCount = u8('script command count');
        for (let commandIndex = 0; commandIndex < commandCount; commandIndex += 1) {
          const sourceOffset = offset;
          const opcode = u8('script opcode');
          const widths = SCRIPT_ARGUMENT_WIDTHS.get(opcode);
          if (!widths) throw new RangeError(`Unknown source script opcode ${opcode} at ${sourceOffset}`);
          const args = widths.map((width) => width === 1
            ? (u8('script byte argument') << 24) >> 24
            : u16('script word argument'));
          commands.push({ opcode, args, sourceOffset });
        }
        records.push({ eventKey, commands });
      }
      groups.push({ groupType, context, records });
    }
    scripts.push({ groups });
  }
  if (offset !== data.length) throw new RangeError(`/10 script leaves ${data.length - offset} unparsed bytes`);
  return { outerCount, scripts };
}

// Port of a.java:x(): /10 blocks 2, 0 and 1 are respectively dimensions,
// per-cell tile IDs and per-cell attributes (delegated to i.a at i.java:315-350).
// Port of i.java:315-350: setup consumes the first two shorts of /10 block 2,
// stores block 0 and block 1 as byte planes, and uses source dimensions for bounds.
export function decodeTileMap(dimensions, tileIds, attributes) {
  if (dimensions.length < 4) throw new RangeError('Truncated /10 tile-map dimensions');
  const width = checkedI16(dimensions, 0, '/10 tile-map width');
  const height = checkedI16(dimensions, 2, '/10 tile-map height');
  if (width <= 0 || height <= 0) throw new RangeError(`Invalid source tile-map dimensions ${width}x${height}`);
  const cellCount = width * height;
  if (tileIds.length !== cellCount || attributes.length !== cellCount) {
    throw new RangeError(`Source /10 tile planes must each contain ${cellCount} cells`);
  }
  return {
    width,
    height,
    tileWidth: 36,
    tileHeight: 18,
    tileIds: Uint8Array.from(tileIds),
    attributes: Uint8Array.from(attributes),
    tileIdSemantics: 'numeric source tile indices; frame registry mapping unresolved',
    attributeSemantics: 'numeric source per-cell attribute byte',
  };
}

// Port of a.java:u(int), a.java:1881-2005, and javap a.javap.txt:12016-12431.
// The source scans byte markers; a type-50 branch consumes 12 bytes total,
// so each following marker probe begins at the preceding record's byte 12.
// Preserve offsets/unknown bytes instead of inventing a semantic struct.
export function decodeWorldEntities(data) {
  const records = [];
  let offset = 0;
  while (offset < data.length) {
    const start = offset;
    const recordType = checkedByte(data, offset++, 'world record type');
    if (recordType === 50) {
      const opaqueKey = checkedI16(data, offset, 'entity short field'); offset += 2;
      const x = checkedI16(data, offset, 'entity x field'); offset += 2;
      const y = checkedI16(data, offset, 'entity y field'); offset += 2;
      offset += 1; // source skips byte +7 before reading category at +8
      const categoryOffset = offset;
      const category = checkedByte(data, offset++, 'entity category');
      const entityIdOffset = offset;
      const entityId = (checkedByte(data, offset++, 'entity id') << 24) >> 24;
      const skippedBytes = [...data.slice(offset, offset + 2)];
      offset += 2;
      records.push({ recordType, sourceOffset: start, opaqueKey, x, y, category, categoryOffset, entityId, entityIdOffset, skippedBytes });
      continue;
    }
    if (recordType === 54) {
      const flagsMask = checkedI16(data, offset, 'entity flags mask'); offset += 2;
      const threshold = (checkedByte(data, offset++, 'entity threshold') << 24) >> 24;
      records.push({ recordType, sourceOffset: start, flagsMask, threshold, identity: 'unresolved type-54 world record' });
      continue;
    }
    // Unknown marker: mirrors the parser's single-byte loop increment.
    records.push({ recordType, sourceOffset: start, identity: 'unknown source byte marker' });
  }
  return records;
}

// Port of a.java:1881-2005, g.java:15-122 and e.java:2981-2997.
// Registry/config columns are numeric source facts, not semantic asset labels.
export function joinCategory32Entities(records, configTable) {
  return records.filter((record) => record.recordType === 50 && record.category === 32).map((record) => {
    const config = configTable.rows[record.entityId];
    if (!config) throw new RangeError(`Entity config row ${record.entityId} is absent`);
    return {
      sourceEntityId: record.entityId,
      identity: 'unresolved numeric source entity',
      worldPosition: { x: record.x, y: record.y },
      configTableId: 15,
      configRow: record.entityId,
      config,
      spriteRegistryIndex: config[1],
      frameIndex: config[2],
      animationIndex: config[5],
    };
  });
}

// Port of a.java:18088-18129 & g.java:15-58: decode Crops (/9[2]), Goods (/9[1]),
// Animals (/9[0]), Quests (/9[25]), and Level XP thresholds (/9[26]) using en.json strings.
export function decodeFarmCatalog(pack9, textData = {}) {
  const txt = (id) => {
    if (!Number.isInteger(id) || id < 0) return '';
    return textData[`page_${id >>> 10}`]?.[String(id & 0x3ff)] ?? '';
  };
  const t0 = decodeConfigTable(readPackBlock(pack9, 0));
  const t1 = decodeConfigTable(readPackBlock(pack9, 1));
  const t2 = decodeConfigTable(readPackBlock(pack9, 2));
  const t3 = decodeConfigTable(readPackBlock(pack9, 3));
  const t4 = decodeConfigTable(readPackBlock(pack9, 4));
  const t7 = decodeConfigTable(readPackBlock(pack9, 7));
  const t8 = decodeConfigTable(readPackBlock(pack9, 8));
  const t16 = decodeConfigTable(readPackBlock(pack9, 16));
  const t19 = decodeConfigTable(readPackBlock(pack9, 19));
  const t22 = decodeConfigTable(readPackBlock(pack9, 22));
  const t25 = decodeConfigTable(readPackBlock(pack9, 25));
  const t26 = decodeConfigTable(readPackBlock(pack9, 26));
  const t33 = decodeConfigTable(readPackBlock(pack9, 33));

  const goods = t1.rows.map((r, idx) => ({
    index: idx,
    id: r[1],
    name: txt(r[2]) || `Vật phẩm #${r[1]}`,
    iconBlock: r[3],
    iconFrame: Math.max(0, r[4] || 0),
    buyPrice: Math.max(0, r[5] || 0),
    sellPrice: Math.max(8, r[7] || r[6] || 18),
  }));
  const findGoodByName = (name) => {
    const clean = String(name || '').replace(/^Cây\s+/i, '').trim().toLowerCase();
    return goods.find(g => g.name.toLowerCase() === clean)
      || goods.find(g => clean && g.name.toLowerCase().includes(clean))
      || null;
  };

  const crops = t2.rows.map((r, idx) => {
    const name = txt(r[2]) || `Cây #${r[1]}`;
    const isTree = idx >= 12;
    const good = findGoodByName(name);
    const buyPrice = Math.max(isTree ? 150 : 10, r[6] || (isTree ? 250 : 15));
    return {
      index: idx,
      id: r[1],
      name,
      isTree,
      unlockLevel: Math.max(1, r[8] || 1),
      buyPrice,
      growSec: Math.max(8, Math.round((r[11] || 90) / 10)),
      rawGrowSec: r[11] || 90,
      yieldScore: Math.max(5, r[16] || 12),
      sellPrice: good?.sellPrice ?? Math.max(15, Math.round(buyPrice * 1.8) + 6),
      xp: Math.max(2, Math.round((r[16] || 10) / 3)),
      harvestGoodId: good?.id ?? r[1],
      harvestIconBlock: good?.iconBlock ?? (isTree ? 23 : 9),
      harvestIconFrame: good?.iconFrame ?? Math.max(0, r[4] >= 12 ? r[4] - 12 : r[4]),
      // Port of a.java:13125-13134 & e.java:1625: col 9 is the /5 world BSprite block
      worldBlock: r[9],
      iconBlock: r[3],
      iconFrame: r[4],
    };
  });

  const allAnimals = t0.rows
    .filter((r) => txt(r[2]))
    .map((r) => {
      const name = txt(r[2]);
      const low = name.toLowerCase();
      const prodKind = r[9];
      let prodGood = goods[1];
      let customProdName = null;
      if (prodKind === 0 || low.includes('gà')) prodGood = goods[1];
      else if (prodKind === 1 || low.includes('bò') || low.includes('bê')) prodGood = goods[2];
      else if (prodKind === 2 || low.includes('heo') || low.includes('lợn')) {
        prodGood = goods[110] || goods[5];
        customProdName = 'Nấm cục';
      } else if (prodKind === 3 || low.includes('dê')) {
        prodGood = goods[2];
        customProdName = 'Sữa dê';
      } else if (prodKind === 4 || low.includes('cừu')) {
        prodGood = goods[3];
      } else if (low.includes('ngựa')) {
        prodGood = goods[110] || goods[3];
        customProdName = 'Nông sản quý';
      }
      const kind = (prodKind === 0 || low.includes('gà')) ? 'chicken' : 'livestock';
      const rawPrice = r[6] || 0;
      const buyPrice = rawPrice > 0 ? Math.max(100, rawPrice) : Math.max(100, r[9] > 0 ? r[9] * 150 : 200);
      return {
        id: r[1],
        name,
        kind,
        isPurchasable: rawPrice > 0,
        buyPrice,
        prodSec: Math.max(12, Math.round((r[11] || 180) / 10)),
        sellPrice: Math.max(prodGood?.sellPrice || 0, Math.round(buyPrice * 0.18), 28),
        productGoodId: prodKind === 3 ? (r[1] + 2000) : (prodGood?.id ?? (r[1] + 2000)),
        productName: customProdName ?? prodGood?.name ?? `Nông sản ${name}`,
        productIconBlock: prodGood?.iconBlock ?? 2,
        productIconFrame: prodGood?.iconFrame ?? 0,
        xp: Math.max(5, Math.round(buyPrice / 40)),
        // Port of a.java:13457-13508: col 31 = /5 BSprite block, col 32 = palette, col 33 = idle frame
        worldBlock: r[31],
        paletteIndex: Math.max(0, r[32] || 0),
        idleFrame: Math.max(0, r[33] || 0),
        iconFrame: Math.max(0, r[4] || 0),
      };
    });
  const animals = allAnimals.filter(a => a.isPurchasable);

  const buildings = t3.rows.map((r, idx) => ({
    entityId: idx,
    id: r[1],
    name: txt(r[2]) || `Công trình #${idx}`,
    isManorRoom: idx <= 8,
    repairCost: Math.max(0, r[6] || 0),
    worldBlock: r[25],
    frame: Math.max(0, r[26] || 0),
  }));

  const decorations = t4.rows
    .filter((r) => txt(r[2]) && r[12] >= 0 && r[12] < 160)
    .map((r, idx) => ({
      index: idx,
      id: r[1],
      name: txt(r[2]),
      buyPrice: Math.max(25, r[6] || 50),
      unlockLevel: Math.max(1, r[8] || 1),
      worldBlock: r[12],
      paletteIndex: Math.max(0, r[13] || 0),
      frame: Math.max(0, r[11] || 0),
    }));

  const recipes = t7.rows.map((r, idx) => {
    const name = txt(r[2]) || `Món #${idx + 1}`;
    const ingList = [];
    const g1 = goods[r[6]];
    if (g1 && r[7] > 0) {
      ingList.push({ goodId: g1.id, name: g1.name, qty: r[7], iconBlock: g1.iconBlock, iconFrame: g1.iconFrame });
    }
    const g2 = goods[r[9]];
    if (g2 && r[10] > 0) {
      if (r[9] === r[6] && ingList.length > 0) ingList[0].qty += r[10];
      else ingList.push({ goodId: g2.id, name: g2.name, qty: r[10], iconBlock: g2.iconBlock, iconFrame: g2.iconFrame });
    }
    const outGood = (r[18] >= 0 && r[18] < goods.length) ? goods[r[18]] : findGoodByName(name);
    const isBakery = /bánh|bột|bơ|tart|kem|kẹo|caramen|nướng|kếp|vỏ/i.test(name);
    return {
      index: idx,
      id: r[1],
      name,
      category: isBakery ? 'bakery' : 'cooking',
      unlockLevel: Math.max(1, r[3] || 1),
      cookSec: Math.max(6, (r[5] || 5) * 2),
      ingredients: ingList,
      outputGoodId: outGood?.id ?? r[1],
      iconBlock: outGood?.iconBlock ?? 50,
      iconFrame: outGood?.iconFrame ?? 0,
      sellPrice: outGood?.sellPrice ?? Math.max(35, (idx + 2) * 18),
      xp: Math.max(5, r[16] || Math.round((r[5] || 5) * 1.5)),
    };
  });

  // Port of a.java:22914-22959 & 23112-23151: /9[22] Máy xay (Animal Feed Mill recipes)
  const feedRecipes = t22.rows.map((r, idx) => {
    const ingList = [];
    const g1 = goods[r[5]];
    if (g1 && r[6] > 0) {
      ingList.push({ goodId: g1.id, name: g1.name, qty: r[6], iconBlock: g1.iconBlock, iconFrame: g1.iconFrame });
    }
    const g2 = goods[r[8]];
    if (g2 && r[9] > 0) {
      if (r[8] === r[5] && ingList.length > 0) ingList[0].qty += r[9];
      else ingList.push({ goodId: g2.id, name: g2.name, qty: r[9], iconBlock: g2.iconBlock, iconFrame: g2.iconFrame });
    }
    const outGood = (r[15] >= 0 && r[15] < goods.length) ? goods[r[15]] : goods[111 + idx];
    const name = txt(r[2]) || outGood?.name || `Thức ăn #${idx + 1}`;
    const targetKind = /bò/i.test(name) ? 'cow'
      : /gà/i.test(name) ? 'chicken'
      : /heo|lợn/i.test(name) ? 'pig'
      : /dê/i.test(name) ? 'goat'
      : /cừu/i.test(name) ? 'sheep'
      : 'super';
    return {
      index: idx,
      id: r[1],
      name,
      targetKind,
      unlockLevel: Math.max(1, r[4] || 1),
      millSec: Math.max(4, Math.min(20, r[11] || 4)),
      outputQty: Math.max(1, r[13] || 3),
      outputGoodId: outGood?.id ?? (4111 + idx),
      iconBlock: outGood?.iconBlock ?? 34,
      iconFrame: outGood?.iconFrame ?? idx,
      sellPrice: outGood?.sellPrice ?? 30,
      xp: Math.max(4, r[14] || 5),
      ingredients: ingList,
    };
  });

  // Port of a.java:32619-32779: /9[19] Pond Fishing loot pool & /9[33] rod fees
  const fishingLoot = t19.rows.map((r, idx) => ({
    index: idx,
    itemId: r[3],
    kind: r[4],
    qty: Math.max(1, r[5] || 1),
    weightFree: Math.max(0, r[6] || 0),
    weightCash: Math.max(0, r[7] || 0),
    weightCoin: Math.max(0, r[8] || 0),
  }));
  const fishingConfig = {
    freeCooldownMs: 60000, // Friendly 60s web-port cooldown (first daily cast is ready immediately)
    sourceCooldownSec: t33.rows[0]?.[1] || 86400,
    cashCost: 5,
    coinCost: t33.rows[1]?.[3] || 50,
  };

  const neighbors = t8.rows.map((r, idx) => ({
    index: idx,
    id: r[1],
    name: txt(r[2]) || `Hàng xóm #${idx + 1}`,
    worldBlock: r[3],
    pack10Block: 5 + idx,
  }));

  const collectibles = t16.rows.map((r, idx) => ({
    index: idx,
    id: r[1],
    name: txt(r[2]) || `Cổ vật #${idx + 1}`,
    minLevel: Math.max(1, r[4] || 1),
    sellPrice: Math.max(30, r[5] || 50),
    rewardCoins: Math.max(50, r[6] || 100),
  }));

  const quests = t25.rows.map((r, idx) => ({
    id: r[0],
    title: txt(r[3]) || `Nhiệm vụ #${idx + 1}`,
    description: txt(r[6]) || '',
    targetCount: Math.max(1, r[8] || 1),
    rewardCoins: Math.max(60, (idx + 1) * 55),
    rewardXp: Math.max(15, (idx + 1) * 14),
  }));

  const levelXp = t26.rows.map((r) => Math.max(20, (r[1] || 30) * 2));

  return {
    crops, goods, animals, allAnimals, buildings, decorations, recipes, feedRecipes,
    fishingLoot, fishingConfig, neighbors, collectibles, quests, levelXp,
  };
}

/**
 * Decode farm world entities from /10 blocks (default [3, 4] for player's own farm;
 * [3, 5..14] for the 10 neighbor farms per a.java:1712-1719) and join to /5 BSprites via /9.
 * Port of a.java:1881-1991 (u(int)) and a.java:13431-13564 (a(int, int)).
 */
export function decodeFarmWorldEntities(pack9, pack10, pack10Blocks = [3, 4]) {
  const t0 = decodeConfigTable(readPackBlock(pack9, 0));
  const t2 = decodeConfigTable(readPackBlock(pack9, 2));
  const t3 = decodeConfigTable(readPackBlock(pack9, 3));
  const t4 = decodeConfigTable(readPackBlock(pack9, 4));
  const t8 = decodeConfigTable(readPackBlock(pack9, 8));
  const t9 = decodeConfigTable(readPackBlock(pack9, 9));
  const t11 = decodeConfigTable(readPackBlock(pack9, 11));

  const entities = [];
  for (const pack10Block of pack10Blocks) {
    const rawList = decodeWorldEntities(readPackBlock(pack10, pack10Block));
    for (const raw of rawList) {
      if (raw.recordType !== 50) continue;
      const { category, entityId, x, y, opaqueKey } = raw;
      const base = { pack10Block, opaqueKey, category, entityId, x, y, layer: 12, block: -1, frame: 0, paletteIndex: 0, useAnim: false };

      if (category === 50 && t3.rows[entityId]) {
        // Buildings (Manor, Barn, Silo, Workshops) — a.java:13510-13517
        const r = t3.rows[entityId];
        base.block = r[25];
        base.frame = Math.max(0, r[26] || 0);
        base.layer = entityId === 1 ? 14 : 12;
      } else if (category === 20 && t4.rows[entityId]) {
        // Animated props, windmills, fences, trees — a.java:13519-13525
        const r = t4.rows[entityId];
        base.block = r[12];
        base.paletteIndex = Math.max(0, r[13] || 0);
        base.frame = Math.max(0, r[11] || 0);
        base.layer = r[15] || 11;
        base.useAnim = true;
      } else if (category === 48 && t11.rows[entityId] && (entityId < 4 || entityId > 50)) {
        // Decor / bushes / rocks — a.java:13538-13557
        const r = t11.rows[entityId];
        base.block = r[7];
        base.frame = Math.max(0, r[8] || 0);
        base.paletteIndex = Math.max(0, r[9] || 0);
      } else if (category === 42) {
        // Player Farmer (entityId === -1 -> /5 block 2) or neighbor character — a.java:1919-1931
        base.block = entityId === -1 ? 2 : (t8.rows[entityId]?.[3] ?? 2);
        base.useAnim = true;
      } else if (category === 49) {
        // Starting tilled soil plot (/5 block 6) + optional starting crop — a.java:1933-1944
        base.block = 6;
        base.frame = 0;
        base.layer = 11;
        if (entityId >= 0 && t2.rows[entityId]) {
          base.cropBlock = t2.rows[entityId][9];
          base.cropId = t2.rows[entityId][1];
        }
      } else if (category === 52 && t2.rows[entityId]) {
        // Starting fruit trees — a.java:1945-1951 & e.java:1815 (g(3) -> frame 1)
        const r = t2.rows[entityId];
        base.block = r[9];
        base.frame = 1;
      } else if (category === 54 && t0.rows[entityId]) {
        // Starting farm animals — a.java:1952-1960 & a.java:13457-13508
        const r = t0.rows[entityId];
        base.block = r[31];
        base.paletteIndex = Math.max(0, r[32] || 0);
        base.frame = Math.max(0, r[33] || 0);
        base.animalId = r[1];
        base.useAnim = true;
      } else if (category === 51 && t9.rows[entityId]) {
        // NPCs — a.java:13526-13530
        const r = t9.rows[entityId];
        base.block = r[1];
        base.useAnim = true;
      }

      if (base.block >= 0 && base.block < 160) {
        entities.push(base);
      }
    }
  }
  return entities;
}

/**
 * Decode an original Green Farm 3 UI screen layout block from pack /6.
 * Port of a.java:9271-9551 (widget types 201..209 and 8-byte common header).
 */
export function decodeUIScreen(bytes) {
  const SIZES = { 201: 9, 202: 10, 203: 14, 204: 19, 205: 23, 206: 12, 207: 13, 208: 1, 209: 7 };
  const i16 = (off) => {
    const v = bytes[off] | (bytes[off + 1] << 8);
    return v > 0x7fff ? v - 0x10000 : v;
  };
  const widgets = [];
  let o = 0;
  let index = 0;
  while (o < bytes.length) {
    const type = bytes[o] & 0xff;
    const payloadSize = SIZES[type];
    if (payloadSize === undefined) break;
    const id = i16(o + 1);
    const x = i16(o + 3);
    const y = i16(o + 5);
    const headerFlag = bytes[o + 7] & 0xff;
    const w = { index, type, id, x, y, headerFlag };
    const p = o + 8;
    if (type === 201) {
      w.w = i16(p); w.h = i16(p + 2);
      w.r = bytes[p + 4]; w.g = bytes[p + 5]; w.b = bytes[p + 6];
      w.visible = bytes[p + 7] === 1;
    } else if (type === 202) {
      w.w = i16(p); w.h = i16(p + 2);
      w.alpha = bytes[p + 4]; w.r = bytes[p + 5]; w.g = bytes[p + 6]; w.b = bytes[p + 7];
      w.visible = bytes[p + 8] === 1;
    } else if (type === 204) {
      w.w = i16(p); w.h = i16(p + 2);
      w.alignH = bytes[p + 6]; w.alignV = bytes[p + 7];
      w.textId = i16(p + 10);
      w.visible = bytes[p + 16] === 1;
    } else if (type === 205) {
      // Port of a.java:9440-9464 & a.java:9881-9908:
      // sArray[5]=spriteId(u8), [6]=frame(u8), [7]=transform(u8), [8]=palette(u8), [9]=usePalette(u8), [10]=visible(u8)
      w.spriteId = bytes[p] & 0xff;
      w.frameIndex = bytes[p + 1] & 0xff;
      w.transform = bytes[p + 2] & 0xff;
      w.paletteIndex = bytes[p + 3] & 0xff;
      w.usePalette = bytes[p + 4] === 1;
      w.visible = bytes[p + 5] === 1;
      w.animIndex = i16(p + 16);
    }
    widgets.push(w);
    o += 8 + payloadSize;
    index += 1;
  }
  return widgets;
}

export async function loadOriginalWorldResources({ baseUrl = new URL('assets/packs/', import.meta.url).href, fetcher = fetch, textData = {} } = {}) {
  const pack9 = await loadSplitPack(new URL('9/9', baseUrl).href, fetcher);
  const pack10 = await loadSplitPack(new URL('10/10', baseUrl).href, fetcher);
  let pack6 = null;
  try {
    pack6 = await loadSplitPack(new URL('6/6', baseUrl).href, fetcher);
  } catch {
    pack6 = null;
  }
  const table9 = (index) => decodeConfigTable(readPackBlock(pack9, index));
  const uiScreen = (index) => (pack6 ? decodeUIScreen(readPackBlock(pack6, index)) : []);
  const config15 = table9(15);
  const openingEntities = decodeWorldEntities(readPackBlock(pack10, 16));
  const tileMap = decodeTileMap(
    readPackBlock(pack10, 2),
    readPackBlock(pack10, 0),
    readPackBlock(pack10, 1),
  );
  const catalog = decodeFarmCatalog(pack9, textData);
  const farmEntities = decodeFarmWorldEntities(pack9, pack10, [3, 4]);
  // Port of a.java:16278 & pack10[18]: place Harold's Feed Mill (Máy xay, entityId 14) on the farm
  try {
    const millEnt = decodeFarmWorldEntities(pack9, pack10, [18]).find(e => e.category === 50 && e.entityId === 14);
    if (millEnt && !farmEntities.some(e => e.category === 50 && e.entityId === 14)) {
      farmEntities.push(millEnt);
    }
  } catch { /* optional pack10[18] */ }
  const neighborFarmEntities = (neighborIndex) => {
    const idx = Math.max(0, Math.min(9, neighborIndex | 0));
    return decodeFarmWorldEntities(pack9, pack10, [3, 5 + idx]);
  };
  return {
    packs: { 6: pack6, 9: pack9, 10: pack10 },
    config15,
    openingScript: decodeWorldScript(readPackBlock(pack10, 15)),
    openingEntities,
    joinedEntities: joinCategory32Entities(openingEntities, config15),
    tileMap,
    catalog,
    farmEntities,
    neighborFarmEntities,
    table9,
    uiScreen,
  };
}
