/**
 * Source-driven Green Farm 3 game state & /9-/10 farm simulation engine.
 * All crop/animal/quest definitions, unlock levels, costs, and Vietnamese text
 * are decoded directly from original /9, /10, and EN.* packs.
 */
export const SCREEN_W = 240;
export const SCREEN_H = 320;

// Port of f.java:107-127 and f.java:319-333 (MIDP keypad bindings).
export const KEY = Object.freeze({
  UP: -1, DOWN: -2, LEFT: -3, RIGHT: -4,
  FIRE: -5, SK_LEFT: -6, SK_RIGHT: -7,
});

export function mapKeyCode(code, key) {
  switch (code) {
    case 'ArrowUp': case 'KeyW': return KEY.UP;
    case 'ArrowDown': case 'KeyS': return KEY.DOWN;
    case 'ArrowLeft': case 'KeyA': return KEY.LEFT;
    case 'ArrowRight': case 'KeyD': return KEY.RIGHT;
    case 'Enter': case 'Space': return KEY.FIRE;
    case 'KeyQ': return KEY.SK_LEFT;
    case 'KeyE': case 'Escape': case 'Backspace': return KEY.SK_RIGHT;
    default:
      if (/^Digit[0-9]$/.test(code || '')) return Number(code.slice(5));
      if (key === '5') return 5;
      return null;
  }
}

export const SOURCE_VIEW = Object.freeze({
  OPENING_SCRIPT: 'opening-script-evidence',
  WORLD_LAYER: 'world-layer-evidence',
  SHOP: 'farm-shop',
  BARN: 'farm-barn',
  QUESTS: 'farm-quests',
  SEED_PICKER: 'farm-seed-picker',
  KITCHEN: 'farm-kitchen',
  FEED_MILL: 'farm-feed-mill',
  MANOR: 'farm-manor',
  COOP: 'farm-coop',
  MAILBOX: 'farm-mailbox',
  COLLECTIONS: 'farm-collections',
  LAND: 'farm-land',
  FISHING: 'farm-fishing',
  NEIGHBORS: 'farm-neighbors',
});

export const LAND_ZONES = Object.freeze([
  { id: 'center', name: 'Khu Trung Tâm (Trang trại chính)', minX: 780, maxX: 1340, minY: 310, maxY: 745, cost: 0, unlockLevel: 1, signX: 1044, signY: 500, desc: 'Trang trại gia đình khởi đầu.' },
  { id: 'west', name: 'Mẫu Yên Tĩnh (Phía Tây)', minX: 300, maxX: 780, minY: 310, maxY: 660, cost: 250, unlockLevel: 1, signX: 650, signY: 480, desc: 'Mở rộng đồng cỏ phía Tây để cày ruộng & trồng cây!' },
  { id: 'south', name: 'Mẫu Êm Dịu (Phía Nam)', minX: 780, maxX: 1340, minY: 745, maxY: 980, cost: 400, unlockLevel: 2, signX: 1050, signY: 850, desc: 'Mở rộng bãi chăn nuôi phía Nam (+không gian thả thú)!' },
  { id: 'east', name: 'Mẫu Rực Rỡ (Phía Đông)', minX: 1340, maxX: 1860, minY: 310, maxY: 660, cost: 650, unlockLevel: 3, signX: 1470, signY: 490, desc: 'Mở rộng vườn cây ăn quả phía Đông & Tháp chứa!' },
  { id: 'far_west', name: 'Mẫu Phì Nhiêu (Tây Nam)', minX: 300, maxX: 780, minY: 660, maxY: 980, cost: 1000, unlockLevel: 5, signX: 610, signY: 790, desc: 'Khai phá thung lũng Tây Nam màu mỡ!' },
  { id: 'far_east', name: 'Mẫu Huyền Ảo (Đông Nam)', minX: 1340, maxX: 1860, minY: 660, maxY: 980, cost: 1500, unlockLevel: 7, signX: 1490, signY: 780, desc: 'Chinh phục vùng đất Đông Nam rộng lớn!' },
]);

// Port of f.paint(Graphics): elapsed time is clamped to [0,1000] ms.
export function sourceFrame(previousAt, now) {
  const elapsedMs = Math.max(0, Math.min(1000, (now - previousAt) | 0));
  return { now, elapsedMs };
}

// Port of a.java:17322-17548, 17555-17589 (/10 block 15 opening script opcode 110).
export function newEvidenceSession(worldResources) {
  const group = worldResources?.openingScript?.scripts?.[0]?.groups
    ?.find((item) => item.groupType === 0 && item.context === 0);
  const dialogue = group?.records.flatMap((record) => record.commands
    .filter((command) => command.opcode === 110)
    .map((command) => ({ eventKey: record.eventKey, textId: command.args[0] }))) ?? [];
  return {
    view: SOURCE_VIEW.OPENING_SCRIPT,
    dialogue,
    dialogueIndex: 0,
    selectedTile: null,
    frame: 0,
    lastFrameAt: null,
  };
}

// Port of a.java:16078-16088.
export function sourceTileAt(tileMap, screenX, screenY, cameraX = 0, cameraY = 0) {
  if (!tileMap || !Number.isFinite(screenX) || !Number.isFinite(screenY)) return null;
  const column = Math.floor((screenX + cameraX) / tileMap.tileWidth);
  const row = Math.floor((screenY + cameraY) / tileMap.tileHeight);
  if (column < 0 || column >= tileMap.width || row < 0 || row >= tileMap.height) return null;
  const index = row * tileMap.width + column;
  return {
    row,
    column,
    tileId: tileMap.tileIds[index],
    attributes: tileMap.attributes[index],
    sourceCellIndex: index,
  };
}

export function advanceEvidenceView(session, key) {
  if (!session) return session;
  if (session.view === SOURCE_VIEW.OPENING_SCRIPT) {
    if (key !== KEY.FIRE && key !== 5 && key !== KEY.SK_RIGHT) return session;
    if (session.dialogueIndex + 1 < session.dialogue.length) {
      return { ...session, dialogueIndex: session.dialogueIndex + 1 };
    }
    return { ...session, view: SOURCE_VIEW.WORLD_LAYER };
  }
  return session;
}

// Port of f.java:1085-1098 (group = id >> 10, index = id & 0x3ff).
export function sourceText(textData, globalTextId) {
  if (!textData || !Number.isInteger(globalTextId) || globalTextId < 0) return '';
  const page = globalTextId >>> 10;
  const index = globalTextId & 0x3ff;
  return textData[`page_${page}`]?.[String(index)] ?? '';
}

// Port of a.java:16117-16131: exact Green Farm 3 isometric 18x9 diamond lattice around (1044, 108).
export function worldToIso(wx, wy) {
  const n = Math.trunc(((wx - 1044) << 8) / 18);
  const n2 = Math.trunc(((wy - 108) << 8) / 9);
  return { ix: (n + n2) >> 8, iy: (n2 - n) >> 8 };
}

export function isoToWorld(ix, iy) {
  const n = ((ix - iy) << 8) >> 1;
  const n2 = (iy << 8) + n;
  return {
    wx: ((n * 18) >> 8) + 1044,
    wy: ((n2 * 9) >> 8) + 108,
  };
}

export function snapPlotToIso4x4(wx, wy) {
  const iso = worldToIso(wx, wy);
  const ix4 = Math.round(iso.ix / 4) * 4;
  const iy4 = Math.round(iso.iy / 4) * 4;
  return isoToWorld(ix4, iy4);
}

// Port of e.java:1117-1130 + horizontal/vertical fix so pure Left/Right never turns Farmer's back.
export function pickFarmerWalkAnim(dx, dy) {
  if (Math.abs(dy) < 0.001) {
    return dx >= 0 ? { anim: 0, hFlip: true } : { anim: 0, hFlip: false };
  }
  if (Math.abs(dx) < 0.001) {
    return dy > 0 ? { anim: 0, hFlip: false } : { anim: 1, hFlip: false };
  }
  if (dx > 0) {
    return dy > 0 ? { anim: 0, hFlip: true } : { anim: 1, hFlip: false };
  }
  return dy > 0 ? { anim: 0, hFlip: false } : { anim: 1, hFlip: true };
}

// Port of a.java:16133-16150: static building & Pond footprints on the farm map
export function isBuildingBlocked(wx, wy) {
  // Pond (cat 50 entityId=17 at 1044, 603) oval water + rock rim
  if (((wx - 1044) / 52) ** 2 + ((wy - 601) / 38) ** 2 < 1) return true;
  // Manor house + protruding front stone doorway steps (entityId=18/19 at 1215, 378)
  if ((wx >= 1165 && wx <= 1275 && wy >= 332 && wy <= 426)
    || (wx >= 1180 && wx <= 1248 && wy >= 424 && wy <= 448)
    || Math.hypot(wx - 1215, wy - 388) < 50) return true;
  // Barn (Kho thóc, entityId=10 at 905, 419)
  if ((wx >= 870 && wx <= 940 && wy >= 384 && wy <= 442) || Math.hypot(wx - 905, wy - 414) < 40) return true;
  // Chicken coop (Chuồng gà, entityId=11 at 873, 696)
  if (Math.hypot(wx - 873, wy - 696) < 36) return true;
  // Livestock shed (Chuồng thú, entityId=12 at 1253, 712)
  if (Math.hypot(wx - 1253, wy - 712) < 38) return true;
  // Silos (entityId=13)
  if (Math.hypot(wx - 800, wy - 374) < 26 || Math.hypot(wx - 1485, wy - 351) < 26) return true;
  // Mailbox post (entityId=15 at 1175, 461)
  if (Math.hypot(wx - 1175, wy - 461) < 12) return true;
  // Feed Mill (Máy xay, entityId=14 at 993, 401 — clear of plot 1008,432)
  if (Math.hypot(wx - 993, wy - 388) < 24) return true;
  return false;
}

const PLOT_FOOTPRINT_OFFSETS = [
  [0, 0], [-28, 0], [28, 0], [0, -14], [0, 14], [-14, -7], [14, -7], [-14, 7], [14, 7],
];

export function isPlotFootprintBlocked(wx, wy, tileMap = null) {
  return PLOT_FOOTPRINT_OFFSETS.some(([ox, oy]) => isWalkBlocked(wx + ox, wy + oy, tileMap));
}

// Port of a.java:16133-16150: prevent Farmer from walking into Pond, Manor core/steps, Barns, Coops, or water/void
export function isWalkBlocked(wx, wy, tileMap = null) {
  if (wx < 48 || wx > 2040 || wy < 306 || wy > 1012) return true;
  if (isBuildingBlocked(wx, wy)) return true;
  if (tileMap) {
    const col = Math.floor(wx / (tileMap.tileWidth || 36));
    const row = Math.floor(wy / (tileMap.tileHeight || 18));
    if (col < 0 || col >= tileMap.width || row < 16 || row >= tileMap.height) return true;
    const tid = tileMap.tileIds[row * tileMap.width + col];
    if (tid === 0xff) return true;
  }
  return false;
}

export function queueSfx(session, kind) {
  if (!session) return;
  if (!session.sfxQueue) session.sfxQueue = [];
  if (session.sfxQueue.length < 8) session.sfxQueue.push(kind);
}

export function addPopup(session, wx, wy, text, color = '#ffd84d') {
  if (!session.popups) session.popups = [];
  session.popups.push({ x: wx, y: wy, text, color, lifeMs: 1100, maxLifeMs: 1100 });
}

export function clampWorldCamera(session, tileMap) {
  const tw = tileMap?.tileWidth || 36;
  const th = tileMap?.tileHeight || 18;
  const mapW = (tileMap?.width || 58) * tw;
  const mapH = (tileMap?.height || 58) * th;
  const zoom = session.worldZoom || 1;
  const viewW = SCREEN_W / zoom;
  const viewH = SCREEN_H / zoom;
  session.cameraX = Math.max(0, Math.min(Math.max(0, mapW - viewW), Math.round(session.cameraX)));
  session.cameraY = Math.max(288, Math.min(Math.max(288, mapH - viewH), Math.round(session.cameraY)));
}

export function setFarmerWalkTarget(session, wx, wy, pendingAction = null) {
  const f = session.farmer;
  if (!f) return;
  const clampedX = Math.max(36, Math.min(2052, Math.round(wx)));
  const clampedY = Math.max(306, Math.min(1026, Math.round(wy)));
  f.targetX = clampedX;
  f.targetY = clampedY;
  f.pendingAction = pendingAction;
  const dx = clampedX - f.x;
  const dy = clampedY - f.y;
  if (Math.hypot(dx, dy) <= 4) {
    f.x = clampedX;
    f.y = clampedY;
    if (pendingAction) executePendingFarmerAction(session);
    else {
      f.state = 'idle';
      f.anim = 2;
    }
    return;
  }
  const dir = pickFarmerWalkAnim(dx, dy);
  f.anim = dir.anim;
  f.hFlip = dir.hFlip;
  f.state = 'walk';
}

export function moveFarmerByVector(session, vx, vy, dtMs, tileMap = null) {
  const f = session.farmer;
  if (!f) return false;
  if (vx === 0 && vy === 0) {
    if (f.state === 'walk' && f.directControl) {
      f.directControl = false;
      f.state = 'idle';
      f.anim = 2;
      f.targetX = f.x;
      f.targetY = f.y;
    }
    return false;
  }
  const len = Math.hypot(vx, vy) || 1;
  const step = (f.speed * dtMs) / 1000;
  const dx = (vx / len) * step;
  const dy = (vy / len) * step;
  const nextX = Math.max(48, Math.min(2040, f.x + dx));
  const nextY = Math.max(306, Math.min(1012, f.y + dy));
  if (!isWalkBlocked(nextX, nextY, tileMap)) {
    f.x = nextX;
    f.y = nextY;
  } else if (!isWalkBlocked(nextX, f.y, tileMap)) {
    f.x = nextX;
  } else if (!isWalkBlocked(f.x, nextY, tileMap)) {
    f.y = nextY;
  }
  f.targetX = f.x;
  f.targetY = f.y;
  f.pendingAction = null;
  f.directControl = true;
  const dir = pickFarmerWalkAnim(vx, vy);
  f.anim = dir.anim;
  f.hFlip = dir.hFlip;
  f.state = 'walk';
  const tw = tileMap?.tileWidth || 36;
  const th = tileMap?.tileHeight || 18;
  session.cursorCol = Math.max(0, Math.min((tileMap?.width || 58) - 1, Math.floor(f.x / tw)));
  session.cursorRow = Math.max(16, Math.min((tileMap?.height || 58) - 1, Math.floor(f.y / th)));
  // Port of a.java:1725-1728: camera smoothly tracks Farmer
  const zoom = session.worldZoom || 1;
  const viewW = SCREEN_W / zoom;
  const viewH = SCREEN_H / zoom;
  session.cameraX = f.x - viewW / 2;
  session.cameraY = f.y - viewH / 2;
  clampWorldCamera(session, tileMap);
  return true;
}

function executePendingFarmerAction(session) {
  const f = session.farmer;
  const act = f?.pendingAction;
  if (!f || !act) return;
  f.pendingAction = null;
  let actionAnim = 3;
  if (act.type === 'tile') {
    const plotBefore = session.plots.get(`${act.row},${act.col}`);
    if (plotBefore && plotBefore.stage === 'tilled' && act.openSeedPicker) {
      // Port of a.java:3804-3936: open the on-world bottom Seed Carousel (/6[1] widgets 73..83)
      // right over the live farm world instead of leaving for a modal list!
      const fieldCrops = (session.catalog?.crops || []).filter(c => c.id !== 3000 && !c.isTree);
      const curIdx = Math.max(0, fieldCrops.findIndex(c => c.id === session.selectedCropId));
      session.seedCarousel = {
        row: act.row,
        col: act.col,
        worldX: act.worldX,
        worldY: act.worldY,
        index: curIdx,
      };
      f.state = 'idle';
      f.anim = 2;
      return;
    }
    if (!plotBefore || plotBefore.stage === 'tilled') actionAnim = 4;
    else if (plotBefore.stage === 'growing') actionAnim = 6;
    else actionAnim = 3;
    const res = interactAtFarmTile(session, act.row, act.col, act.worldX, act.worldY);
    if (res?.ok) {
      addPopup(session, f.x, f.y - 24, res.popup || '✓', res.popupColor || '#9cff7b');
    }
  } else if (act.type === 'plant_seed') {
    actionAnim = 4;
    const res = plantCropOnPlot(session, act.row, act.col, act.cropId);
    if (res?.ok) {
      advanceQuests(session, 'plant', 1);
      addPopup(session, f.x, f.y - 24, `🌱 ${res.crop?.name || ''}`, '#9cff7b');
    }
  } else if (act.type === 'building') {
    f.state = 'idle';
    f.anim = 2;
    openBuildingMenu(session, act.entityId);
    return;
  } else if (act.type === 'debris') {
    actionAnim = 4;
    clearDebris(session, act.opaqueKey, act.worldX, act.worldY);
  } else if (act.type === 'place') {
    actionAnim = 4;
    const item = act.item;
    if (item?.kind === 'tree') plantFruitTree(session, item.spec.id, act.worldX, act.worldY);
    else if (item?.kind === 'animal') {
      buyAnimal(session, item.spec.id, act.row, act.col);
      const last = session.animals[session.animals.length - 1];
      if (last) { last.worldX = act.worldX; last.worldY = act.worldY; }
    } else if (item?.kind === 'decor') {
      placeDecoration(session, item.spec.id, act.worldX, act.worldY);
    }
    session.activeTool = 'auto';
    session.placementItem = null;
  } else if (act.type === 'tree') {
    actionAnim = 3;
    const res = harvestFruitTree(session, act.uid);
    if (res?.ok) {
      addPopup(session, f.x, f.y - 24, `🍎 ${res.name}`, '#ffd84d');
    }
  } else if (act.type === 'neighbor_help') {
    actionAnim = 3;
    const res = helpNeighborEntity(session, act.opaqueKey, act.worldX, act.worldY);
    if (res?.ok) {
      addPopup(session, f.x, f.y - 24, '+20 Xu +8 XP', '#9cff7b');
    }
  } else if (act.type === 'animal') {
    actionAnim = 3;
    const res = collectOrFeedAnimal(session, act.uid);
    if (res?.ok) {
      addPopup(session, f.x, f.y - 24, res.action === 'collected' ? `${res.prodEmoji || '🥚'} ${res.prodName || '+XP'}` : '🌿 Đã cho ăn', '#ffd84d');
    }
  }
  f.state = 'action';
  f.anim = actionAnim;
  f.actionMs = 460;
}

export function harvestFruitTree(session, uid) {
  const tree = session.fruitTrees?.find(t => t.uid === uid);
  if (!tree || !tree.ready) return { ok: false };
  const crop = session.catalog?.crops?.find(c => c.id === tree.cropId);
  const name = crop?.name || 'Trái cây';
  const sellPrice = crop?.sellPrice ?? 35;
  const xp = crop?.xp ?? 5;
  const iconBlock = crop?.harvestIconBlock ?? 23;
  const iconFrame = crop?.harvestIconFrame ?? 0;
  const existing = session.inventory.get(tree.cropId) || { id: tree.cropId, name, qty: 0, sellPrice, iconBlock, iconFrame };
  existing.qty += 1;
  existing.iconBlock = iconBlock;
  existing.iconFrame = iconFrame;
  session.inventory.set(tree.cropId, existing);
  tree.ready = false;
  tree.progressMs = 0;
  awardFarmXp(session, xp);
  advanceQuests(session, 'harvest', 1);
  queueSfx(session, 'harvest');
  session.toast = `🍎 Thu hoạch ${name} (+${xp} XP)`;
  session.toastMs = 2000;
  return { ok: true, name };
}

// Port of a.java:18088-18129, a.java:1725-1728, a.java:1881-1991 & e.java:2732-3046:
// create full playable farm state directly from decoded /9 & /10 starting farm world.
export function createFarmSession(worldResources, textData = {}) {
  const base = newEvidenceSession(worldResources);
  const catalog = worldResources?.catalog || { crops: [], goods: [], animals: [], quests: [], levelXp: [60, 120, 200] };
  const tm = worldResources?.tileMap;
  const tw = tm?.tileWidth || 36;
  const th = tm?.tileHeight || 18;
  const wheat = catalog.crops.find(c => c.id === 3004) || catalog.crops[1] || catalog.crops[0];
  const tomato = catalog.crops.find(c => c.id === 3001) || catalog.crops[1] || wheat;

  const farmEntities = worldResources?.farmEntities || [];
  const rawPlots = farmEntities.filter(e => e.category === 49);
  const rawAnimals = farmEntities.filter(e => e.category === 54);
  const rawTrees = farmEntities.filter(e => e.category === 52);
  const farmerEnt = farmEntities.find(e => e.category === 42 && e.entityId === -1);

  const plots = new Map();
  let firstReadyPlot = null;
  if (rawPlots.length > 0) {
    for (const rp of rawPlots) {
      const col = Math.floor(rp.x / tw);
      const row = Math.floor(rp.y / th);
      const crop = rp.cropId ? (catalog.crops.find(c => c.id === rp.cropId) || wheat) : null;
      const plotObj = {
        row,
        col,
        worldX: rp.x,
        worldY: rp.y,
        cropId: crop?.id ?? null,
        cropName: crop?.name ?? '',
        stage: crop ? 'ready' : 'tilled',
        watered: false,
        progressMs: crop ? (crop.growSec || 9) * 1000 : 0,
        growMs: (crop?.growSec || 10) * 1000,
      };
      plots.set(`${row},${col}`, plotObj);
      if (plotObj.stage === 'ready' && !firstReadyPlot) firstReadyPlot = plotObj;
    }
  } else {
    const seedPlots = [
      { row: 24, col: 28, crop: wheat, stage: 'ready', progressMs: (wheat?.growSec || 9) * 1000 },
      { row: 24, col: 29, crop: wheat, stage: 'ready', progressMs: (wheat?.growSec || 9) * 1000 },
      { row: 25, col: 28, crop: tomato, stage: 'growing', progressMs: Math.floor(((tomato?.growSec || 15) * 1000) / 2) },
      { row: 25, col: 29, crop: null, stage: 'tilled', progressMs: 0 },
    ];
    for (const sp of seedPlots) {
      const plotObj = {
        row: sp.row,
        col: sp.col,
        worldX: sp.col * tw + (tw >> 1),
        worldY: sp.row * th + (th >> 1),
        cropId: sp.crop?.id ?? null,
        cropName: sp.crop?.name ?? '',
        stage: sp.stage,
        watered: sp.stage === 'growing',
        progressMs: sp.progressMs,
        growMs: (sp.crop?.growSec || 10) * 1000,
      };
      plots.set(`${sp.row},${sp.col}`, plotObj);
      if (plotObj.stage === 'ready' && !firstReadyPlot) firstReadyPlot = plotObj;
    }
  }

  let nextAnimalUid = 1;
  const farmAnimals = [];
  const animalLookup = catalog.allAnimals || catalog.animals || [];
  if (rawAnimals.length > 0) {
    for (const ra of rawAnimals) {
      const spec = animalLookup.find(a => a.id === ra.animalId)
        || animalLookup.find(a => a.worldBlock === ra.block && a.paletteIndex === (ra.paletteIndex || 0))
        || animalLookup[0];
      farmAnimals.push({
        uid: nextAnimalUid++,
        animalId: ra.animalId || spec?.id || 2004,
        name: spec?.name || 'Vật nuôi',
        row: Math.floor(ra.y / th),
        col: Math.floor(ra.x / tw),
        worldX: ra.x,
        worldY: ra.y,
        worldBlock: ra.block,
        paletteIndex: ra.paletteIndex || 0,
        idleFrame: ra.frame || 0,
        fed: true,
        ready: false,
        progressMs: 0,
        prodMs: (spec?.prodSec || 15) * 1000,
        sellPrice: spec?.sellPrice || 36,
        xp: spec?.xp || 5,
      });
    }
  } else {
    const starterAnimal = catalog.animals[0] || { id: 2004, name: 'Gà con Delaware', buyPrice: 200, prodSec: 15, sellPrice: 36, xp: 5, worldBlock: 8, paletteIndex: 0, idleFrame: 24 };
    farmAnimals.push({
      uid: nextAnimalUid++,
      animalId: starterAnimal.id,
      name: starterAnimal.name,
      row: 26,
      col: 29,
      worldX: 29 * tw + (tw >> 1),
      worldY: 26 * th + (th >> 1),
      worldBlock: starterAnimal.worldBlock ?? 8,
      paletteIndex: starterAnimal.paletteIndex ?? 0,
      idleFrame: starterAnimal.idleFrame ?? 0,
      fed: true,
      ready: false,
      progressMs: 0,
      prodMs: (starterAnimal.prodSec || 15) * 1000,
      sellPrice: starterAnimal.sellPrice,
      xp: starterAnimal.xp,
    });
  }

  const quests = (catalog.quests || []).slice(0, 12).map((q, i) => ({
    ...q,
    progress: 0,
    completed: false,
    claimed: false,
    trackKind: ['harvest', 'sell', 'cook', 'plant', 'clear', 'help'][i % 6],
  }));

  const neighborMail = (catalog.neighbors || []).slice(0, 5).map((nb, idx) => ({
    id: `mail-${nb.id}`,
    from: nb.name,
    subject: idx === 0
      ? 'Chào mừng cháu tiếp quản trang trại! Nhận quà khởi nghiệp nhé!'
      : `Đơn đặt hàng của ${nb.name}: giao 2 nông sản nhận thưởng!`,
    giftCoins: idx === 0 ? 100 : (80 + idx * 45),
    giftXp: 15 + idx * 8,
    claimed: false,
    kind: idx === 0 ? 'gift' : 'order',
    needQty: idx === 0 ? 0 : 2,
  }));

  const fruitTrees = rawTrees.map((rt, idx) => {
    const spec = catalog.crops.find(c => c.worldBlock === rt.block) || catalog.crops[12] || wheat;
    return {
      uid: idx + 1,
      cropId: spec?.id || 3012,
      name: spec?.name || 'Cây ăn quả',
      worldX: rt.x,
      worldY: rt.y,
      worldBlock: rt.block,
      ready: true,
      progressMs: (spec?.growSec || 18) * 1000,
      growMs: (spec?.growSec || 18) * 1000,
    };
  });

  // Port of a.java:1725-1728 & e.java:2897-2910: live controllable Farmer (speed ak = 150 px/s)
  const startFarmerX = farmerEnt ? farmerEnt.x : (firstReadyPlot ? firstReadyPlot.worldX + 24 : 1089);
  const startFarmerY = farmerEnt ? farmerEnt.y : (firstReadyPlot ? firstReadyPlot.worldY + 6 : 428);
  const farmerState = {
    x: startFarmerX,
    y: startFarmerY,
    targetX: startFarmerX,
    targetY: startFarmerY,
    speed: 150,
    state: 'idle',
    anim: 2,
    hFlip: false,
    actionMs: 0,
    directControl: false,
    pendingAction: null,
  };

  const mapW = (tm?.width || 58) * tw;
  const mapH = (tm?.height || 58) * th;
  const viewH = SCREEN_H - 54;
  const cameraX = Math.max(0, Math.min(mapW - SCREEN_W, Math.round(startFarmerX - SCREEN_W / 2)));
  const cameraY = Math.max(288, Math.min(mapH - viewH, Math.round(startFarmerY - viewH / 2)));

  return {
    ...base,
    view: base.dialogue.length > 0 ? SOURCE_VIEW.OPENING_SCRIPT : SOURCE_VIEW.WORLD_LAYER,
    coins: 350,
    cash: 15,
    xp: 0,
    level: 1,
    energy: 30,
    maxEnergy: 30,
    energyRegenMs: 0,
    animTimeMs: 0,
    worldZoom: 1.0, // Exact 1:1 integer pixel rendering (zero tile seams); user can toggle 75% <-> 100%
    visitingNeighbor: null, // null = own farm (N=0), or { index, id, name, entities, helpedKeys, helpsToday, maxHelps }
    homeFarmerPos: null,
    barnCapacity: 40,
    siloLevel: 1,
    coopCapacity: 6,
    shedCapacity: 6,
    cameraX,
    cameraY,
    cursorRow: firstReadyPlot ? firstReadyPlot.row : 24,
    cursorCol: firstReadyPlot ? firstReadyPlot.col : 28,
    selectedCropId: wheat?.id ?? 3004,
    activeTool: 'auto', // 'auto' | 'plow' | 'clear' | 'place'
    placementItem: null, // { kind: 'tree'|'animal'|'decor', spec }
    seedPickerTarget: null,
    seedCarousel: null, // Port of a.java:3804-3936: { row, col, worldX, worldY, index } on-world bottom carousel!
    parentView: null,
    shopTab: 'crops', // 'crops' | 'trees' | 'animals' | 'land' | 'decor'
    kitchenTab: 'recipes', // 'recipes' | 'stoves'
    kitchenCategory: 'all', // 'all' | 'bakery' | 'cooking'
    millTab: 'recipes', // 'recipes' | 'queue' | 'silo'
    barnTab: 'goods', // 'goods' | 'upgrade'
    selectedLandZoneId: 'west',
    shopCursor: 0,
    panelCursor: 0,
    coopFilter: 'chicken',
    questCursor: 0,
    barnCursor: 0,
    farmer: farmerState,
    fruitTrees,
    placedDecor: [],
    clearedDebris: [],
    unlockedZones: ['center'],
    unlockedRooms: { 2: true }, // Nhà bếp sẵn sàng nấu ăn & làm bánh; 8 phòng Dinh thự còn lại sửa chữa dần
    kitchenQueue: [],
    millQueue: [],
    nextCookUid: 1,
    nextMillUid: 1,
    nextTreeUid: fruitTrees.length + 1,
    nextDecorUid: 1,
    collections: {},
    neighborMail,
    helpedNeighbors: {},
    popups: [],
    sfxQueue: [],
    plots,
    animals: farmAnimals,
    nextAnimalUid,
    inventory: new Map(),
    feedStock: new Map([
      [4111, { id: 4111, name: 'Thức ăn bò', qty: 3, iconBlock: 34, iconFrame: 0 }],
      [4112, { id: 4112, name: 'Thức ăn gà', qty: 3, iconBlock: 34, iconFrame: 1 }],
      [4115, { id: 4115, name: 'Thức ăn cừu', qty: 3, iconBlock: 34, iconFrame: 4 }],
    ]),
    fishing: {
      mode: 'menu', // 'menu' | 'playing' | 'result'
      rodType: 0, // 0=Free, 1=Cash, 2=Coins
      freeCooldownUntil: 0,
      castsLeft: 5,
      catches: [],
      bubbles: [],
      spawnMs: 0,
    },
    inventory: new Map(),
    quests,
    toast: (() => {
      const rawT = sourceText(textData, 4);
      if (!rawT || /bấm\s*5/i.test(rawT)) return 'Chạm vào Lúa mì chín để thu hoạch!';
      return rawT;
    })(),
    toastMs: 3500,
    catalog,
  };
}

export function xpForNextLevel(session) {
  const table = session.catalog?.levelXp || [];
  return table[Math.min(table.length - 1, Math.max(0, (session.level || 1) - 1))] || (session.level * 50);
}

export function awardFarmXp(session, amount) {
  if (!amount || amount <= 0) return false;
  session.xp += amount;
  let leveled = false;
  while (session.xp >= xpForNextLevel(session)) {
    session.xp -= xpForNextLevel(session);
    session.level += 1;
    session.maxEnergy += 2;
    session.energy = session.maxEnergy;
    session.coins += 50;
    leveled = true;
    queueSfx(session, 'level');
    session.toast = `🎉 Lên Cấp ${session.level}! (+50 Xu & đầy Năng lượng)`;
    session.toastMs = 3000;
  }
  return leveled;
}

export function stepFarmSession(session, dtMs, tileMap = null) {
  if (!session || session.view === SOURCE_VIEW.OPENING_SCRIPT) return false;
  let changed = false;
  session.animTimeMs = (session.animTimeMs || 0) + dtMs;
  if (session.toastMs > 0) {
    session.toastMs = Math.max(0, session.toastMs - dtMs);
    if (session.toastMs === 0) session.toast = '';
  }

  // Port of e.java:132-160 & e.java:3106-3122 (N()): Farmer autonomous walk to target & action completion
  const f = session.farmer;
  if (f) {
    if (f.state === 'action') {
      f.actionMs -= dtMs;
      if (f.actionMs <= 0) {
        f.actionMs = 0;
        f.state = 'idle';
        f.anim = 2;
      }
      changed = true;
    } else if (f.state === 'walk' && !f.directControl) {
      const dx = f.targetX - f.x;
      const dy = f.targetY - f.y;
      const dist = Math.hypot(dx, dy);
      const step = (f.speed * dtMs) / 1000;
      if (dist <= step || dist <= 2) {
        if (!isWalkBlocked(f.targetX, f.targetY, tileMap)) {
          f.x = f.targetX;
          f.y = f.targetY;
        }
        if (f.pendingAction) {
          executePendingFarmerAction(session);
        } else {
          f.state = 'idle';
          f.anim = 2;
        }
      } else {
        const nextX = f.x + (dx / dist) * step;
        const nextY = f.y + (dy / dist) * step;
        const dir = pickFarmerWalkAnim(dx, dy);
        f.anim = dir.anim;
        f.hFlip = dir.hFlip;
        if (!isWalkBlocked(nextX, nextY, tileMap)) {
          f.x = nextX;
          f.y = nextY;
        } else if (!isWalkBlocked(nextX, f.y, tileMap) && Math.hypot(nextX - f.targetX, f.y - f.targetY) < dist - 0.5) {
          f.x = nextX;
        } else if (!isWalkBlocked(f.x, nextY, tileMap) && Math.hypot(f.x - f.targetX, nextY - f.targetY) < dist - 0.5) {
          f.y = nextY;
        } else {
          if (f.pendingAction) {
            executePendingFarmerAction(session);
          } else {
            f.targetX = f.x;
            f.targetY = f.y;
            f.state = 'idle';
            f.anim = 2;
          }
        }
      }
      // Smoothly follow Farmer while walking (zoom-aware viewport center)
      if (tileMap) {
        const zoom = session.worldZoom || 1;
        const viewW = SCREEN_W / zoom;
        const viewH = SCREEN_H / zoom;
        session.cameraX += (f.x - viewW / 2 - session.cameraX) * 0.25;
        session.cameraY += (f.y - viewH / 2 - session.cameraY) * 0.25;
        clampWorldCamera(session, tileMap);
      }
      changed = true;
    }
  }

  // Step floating popups
  if (session.popups?.length) {
    for (let i = session.popups.length - 1; i >= 0; i -= 1) {
      const p = session.popups[i];
      p.lifeMs -= dtMs;
      p.y -= (dtMs * 18) / 1000;
      if (p.lifeMs <= 0) session.popups.splice(i, 1);
    }
    changed = true;
  }

  for (const plot of session.plots.values()) {
    if (plot.stage === 'growing') {
      const rate = plot.watered ? 1.6 : 1.0;
      plot.progressMs += dtMs * rate;
      if (plot.progressMs >= plot.growMs) {
        plot.progressMs = plot.growMs;
        plot.stage = 'ready';
        changed = true;
      }
    }
  }
  for (const tree of session.fruitTrees || []) {
    if (!tree.ready) {
      tree.progressMs += dtMs;
      if (tree.progressMs >= tree.growMs) {
        tree.progressMs = tree.growMs;
        tree.ready = true;
        changed = true;
      }
    }
  }
  for (const animal of session.animals) {
    if (animal.fed && !animal.ready) {
      animal.progressMs += dtMs;
      if (animal.progressMs >= animal.prodMs) {
        animal.progressMs = animal.prodMs;
        animal.ready = true;
        changed = true;
      }
    }
    // Port of e.java:2330-2365: gentle pasture roaming around home coordinates
    if (animal.worldX != null && animal.worldY != null) {
      if (animal.homeX == null) { animal.homeX = animal.worldX; animal.homeY = animal.worldY; animal.roamWaitMs = 1500 + (animal.uid * 733) % 2500; }
      if (animal.roamWaitMs > 0) {
        animal.roamWaitMs -= dtMs;
        animal.walking = false;
        if (animal.roamWaitMs <= 0) {
          const angle = ((session.animTimeMs + animal.uid * 137) % 360) * (Math.PI / 180);
          const dist = 16 + ((animal.uid * 19 + Math.floor(session.animTimeMs / 100)) % 22);
          animal.targetX = Math.max(80, Math.min(1980, animal.homeX + Math.cos(angle) * dist));
          animal.targetY = Math.max(330, Math.min(980, animal.homeY + Math.sin(angle) * (dist * 0.5)));
          animal.walking = true;
        }
      } else if (animal.walking && animal.targetX != null) {
        const dx = animal.targetX - animal.worldX;
        const dy = animal.targetY - animal.worldY;
        const d = Math.hypot(dx, dy);
        const step = (24 * dtMs) / 1000;
        if (d <= step || d <= 2) {
          animal.worldX = animal.targetX;
          animal.worldY = animal.targetY;
          animal.walking = false;
          animal.roamWaitMs = 2200 + ((animal.uid * 571 + session.animTimeMs) % 2600);
        } else {
          animal.worldX += (dx / d) * step;
          animal.worldY += (dy / d) * step;
          animal.hFlip = dx > 0;
        }
        changed = true;
      }
    }
  }
  // Tick Kitchen cooking queue (table9[7])
  for (const job of session.kitchenQueue || []) {
    if (!job.ready) {
      job.progressMs += dtMs;
      if (job.progressMs >= job.cookMs) {
        job.progressMs = job.cookMs;
        job.ready = true;
        session.toast = `🍳 Món ${job.name} đã nấu xong trong Nhà bếp!`;
        session.toastMs = 2600;
        changed = true;
      }
    }
  }
  // Tick Feed Mill queue (table9[22] — Máy xay thức ăn cho động vật)
  for (const job of session.millQueue || []) {
    if (!job.ready) {
      job.progressMs += dtMs;
      if (job.progressMs >= job.millMs) {
        job.progressMs = job.millMs;
        job.ready = true;
        session.toast = `⚙️ ${job.name} đã xay xong trong Máy xay!`;
        session.toastMs = 2600;
        changed = true;
      }
    }
  }
  // Tick Fishing bubble spawns while Pond minigame is active
  if (session.view === SOURCE_VIEW.FISHING && session.fishing?.mode === 'playing') {
    session.fishing.spawnMs = (session.fishing.spawnMs || 0) + dtMs;
    if (session.fishing.spawnMs >= 2200 || !(session.fishing.bubbles?.length)) {
      session.fishing.spawnMs = 0;
      session.fishing.bubbles = createFishingBubbles();
      changed = true;
    }
  }
  // Energy regeneration (+1 every 20s)
  if (session.energy < session.maxEnergy) {
    session.energyRegenMs = (session.energyRegenMs || 0) + dtMs;
    if (session.energyRegenMs >= 20000) {
      session.energyRegenMs -= 20000;
      session.energy = Math.min(session.maxEnergy, session.energy + 1);
      changed = true;
    }
  }
  return changed;
}

function advanceQuests(session, kind, delta = 1) {
  for (const q of session.quests || []) {
    if (q.completed) continue;
    if (q.trackKind === kind) {
      q.progress = Math.min(q.targetCount, q.progress + delta);
      if (q.progress >= q.targetCount) {
        q.completed = true;
        session.toast = `✅ Hoàn thành nhiệm vụ: ${q.title}!`;
        session.toastMs = 2800;
      }
    }
  }
}

export function plowPlot(session, row, col, worldX = null, worldY = null) {
  const key = `${row},${col}`;
  if (session.plots.has(key)) return { ok: false, reason: 'occupied' };
  const plotCost = session.catalog?.crops?.find(c => c.id === 3000)?.buyPrice ?? 10;
  if (session.coins < plotCost) {
    session.toast = `Cần ${plotCost} Xu để cày ô đất mới!`;
    session.toastMs = 2000;
    return { ok: false, reason: 'no_coins' };
  }
  let wx = worldX ?? (col * 36 + 18);
  let wy = worldY ?? (row * 18 + 9);
  if (worldX != null && worldY != null) {
    const snapped = snapPlotToIso4x4(worldX, worldY);
    wx = snapped.wx;
    wy = snapped.wy;
    if (isPlotFootprintBlocked(wx, wy)) {
      session.toast = 'Không thể cày đất lên công trình hoặc ao nước!';
      session.toastMs = 1800;
      return { ok: false, reason: 'blocked' };
    }
    if (!isPointInUnlockedLand(session, wx, wy)) {
      const lockedZone = findLandZoneAtPoint(wx, wy);
      session.toast = `Ô đất thuộc ${lockedZone?.name || 'khu đất khóa'} — chạm để mua đất!`;
      session.toastMs = 2000;
      return { ok: false, reason: 'land_locked', zone: lockedZone };
    }
    // Prevent overlapping an existing 4x4 (72x36) soil plot!
    for (const p of session.plots.values()) {
      if (Math.hypot((p.worldX ?? p.col * 36 + 18) - wx, (p.worldY ?? p.row * 18 + 9) - wy) < 34) {
        session.toast = 'Ô đất đã có sẵn ở đây!';
        session.toastMs = 1600;
        return { ok: false, reason: 'overlap' };
      }
    }
  }
  session.coins -= plotCost;
  session.plots.set(key, {
    row,
    col,
    worldX: wx,
    worldY: wy,
    cropId: null,
    cropName: '',
    stage: 'tilled',
    watered: false,
    progressMs: 0,
    growMs: 0,
  });
  awardFarmXp(session, 2);
  queueSfx(session, 'plow');
  session.toast = `Đã cày ô đất mới (-${plotCost} Xu)`;
  session.toastMs = 1800;
  return { ok: true, popup: `-${plotCost} Xu`, popupColor: '#ffd84d' };
}

export function plantCropOnPlot(session, row, col, cropId = session.selectedCropId) {
  const plot = session.plots.get(`${row},${col}`);
  if (!plot || plot.stage !== 'tilled') return { ok: false, reason: 'not_tilled' };
  const crop = session.catalog?.crops?.find(c => c.id === cropId && c.id !== 3000) || session.catalog?.crops?.[1];
  if (!crop) return { ok: false, reason: 'no_crop' };
  if (session.level < crop.unlockLevel) {
    session.toast = `${crop.name} mở khóa ở Cấp ${crop.unlockLevel}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'locked' };
  }
  if (session.coins < crop.buyPrice) {
    session.toast = `Không đủ ${crop.buyPrice} Xu mua giống ${crop.name}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'no_coins' };
  }
  session.coins -= crop.buyPrice;
  plot.cropId = crop.id;
  plot.cropName = crop.name;
  plot.stage = 'growing';
  plot.watered = false;
  plot.progressMs = 0;
  plot.growMs = crop.growSec * 1000;
  queueSfx(session, 'plant');
  session.toast = `🌱 Đã trồng ${crop.name} (-${crop.buyPrice} Xu)`;
  session.toastMs = 1800;
  return { ok: true, crop };
}

export function waterPlot(session, row, col) {
  const plot = session.plots.get(`${row},${col}`);
  if (!plot || plot.stage !== 'growing' || plot.watered) return { ok: false };
  plot.watered = true;
  awardFarmXp(session, 1);
  queueSfx(session, 'water');
  session.toast = `💧 Đã tưới ${plot.cropName} (lớn nhanh 1.6×)`;
  session.toastMs = 1600;
  return { ok: true };
}

export function harvestPlot(session, row, col) {
  const plot = session.plots.get(`${row},${col}`);
  if (!plot || plot.stage !== 'ready') return { ok: false };
  const crop = session.catalog?.crops?.find(c => c.id === plot.cropId);
  const itemId = crop?.harvestGoodId ?? plot.cropId;
  const itemName = plot.cropName || crop?.name || 'Nông sản';
  const sellPrice = crop?.sellPrice ?? 20;
  const xp = crop?.xp ?? 3;
  const iconBlock = crop?.harvestIconBlock ?? 9;
  const iconFrame = crop?.harvestIconFrame ?? 4;

  const existing = session.inventory.get(itemId) || { id: itemId, name: itemName, qty: 0, sellPrice, iconBlock, iconFrame };
  existing.qty += 1;
  existing.iconBlock = iconBlock;
  existing.iconFrame = iconFrame;
  session.inventory.set(itemId, existing);

  plot.cropId = null;
  plot.cropName = '';
  plot.stage = 'tilled';
  plot.watered = false;
  plot.progressMs = 0;
  plot.growMs = 0;

  awardFarmXp(session, xp);
  advanceQuests(session, 'harvest', 1);
  queueSfx(session, 'harvest');
  // 15% chance to discover a rare collectible (table9[16]) for Phòng sưu tập!
  const coll = session.catalog?.collectibles || [];
  if (coll.length > 0 && ((session.xp + row + col) % 7 === 0)) {
    const found = coll[(session.xp + row) % Math.min(coll.length, Math.max(3, session.level + 2))];
    session.collections[found.id] = (session.collections[found.id] || 0) + 1;
    session.toast = `🌾 Thu ${itemName} (+${xp} XP) & nhặt được cổ vật ${found.name}!`;
  } else {
    session.toast = `🌾 Thu hoạch ${itemName} (+${xp} XP)`;
  }
  session.toastMs = 2200;
  return { ok: true, itemId, itemName, popup: `🌾 +${xp} XP`, popupColor: '#ffd84d' };
}

export function buyAnimal(session, animalId, row, col) {
  const spec = session.catalog?.animals?.find(a => a.id === animalId) || session.catalog?.animals?.[0];
  if (!spec) return { ok: false };
  if (session.coins < spec.buyPrice) {
    session.toast = `Cần ${spec.buyPrice} Xu để mua ${spec.name}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'no_coins' };
  }
  session.coins -= spec.buyPrice;
  const animal = {
    uid: session.nextAnimalUid++,
    animalId: spec.id,
    name: spec.name,
    row,
    col,
    worldX: col * 36 + 18,
    worldY: row * 18 + 9,
    worldBlock: spec.worldBlock ?? 8,
    paletteIndex: spec.paletteIndex ?? 0,
    idleFrame: spec.idleFrame ?? 0,
    fed: true,
    ready: false,
    progressMs: 0,
    prodMs: spec.prodSec * 1000,
    sellPrice: spec.sellPrice,
    xp: spec.xp,
  };
  session.animals.push(animal);
  session.toast = `🐄 Đã mua ${spec.name} (-${spec.buyPrice} Xu)`;
  session.toastMs = 2200;
  return { ok: true, animal };
}

export function collectOrFeedAnimal(session, animalUid) {
  const animal = session.animals.find(a => a.uid === animalUid);
  if (!animal) return { ok: false };
  if (animal.ready) {
    const lookup = session.catalog?.allAnimals || session.catalog?.animals || [];
    const spec = lookup.find(s => s.id === animal.animalId)
      || lookup.find(s => s.worldBlock === animal.worldBlock && s.paletteIndex === (animal.paletteIndex || 0));
    const prodId = spec?.productGoodId ?? (animal.animalId + 2000);
    const fallbackProd = /bò|cow/i.test(animal.name) ? 'Sữa'
      : /gà|chicken|hen/i.test(animal.name) ? 'Trứng'
      : /cừu|sheep/i.test(animal.name) ? 'Len'
      : /lợn|heo|pig/i.test(animal.name) ? 'Nấm cục'
      : /dê|goat/i.test(animal.name) ? 'Sữa dê'
      : `Nông sản ${animal.name}`;
    const prodName = spec?.productName ?? fallbackProd;
    const iconBlock = spec?.productIconBlock ?? 2;
    const iconFrame = spec?.productIconFrame ?? (/bò|dê/i.test(animal.name) ? 1 : /cừu/i.test(animal.name) ? 3 : 0);
    const existing = session.inventory.get(prodId) || { id: prodId, name: prodName, qty: 0, sellPrice: animal.sellPrice, iconBlock, iconFrame };
    existing.qty += 1;
    existing.iconBlock = iconBlock;
    existing.iconFrame = iconFrame;
    session.inventory.set(prodId, existing);
    animal.ready = false;
    animal.fed = false;
    animal.progressMs = 0;
    awardFarmXp(session, animal.xp);
    advanceQuests(session, 'harvest', 1);
    queueSfx(session, 'harvest');
    const prodEmoji = /sữa/i.test(prodName) ? '🥛'
      : /len/i.test(prodName) ? '🧶'
      : /nấm/i.test(prodName) ? '🍄'
      : /ngựa|quý/i.test(prodName) ? '🌟'
      : '🥚';
    session.toast = `${prodEmoji} Thu ${prodName} từ ${animal.name} (+${animal.xp} XP)`;
    session.toastMs = 2000;
    return { ok: true, action: 'collected', prodId, prodName, prodEmoji };
  }
  if (!animal.fed) {
    if (!session.feedStock) session.feedStock = new Map();
    const prefId = /gà/i.test(animal.name) ? 4112
      : /cừu/i.test(animal.name) ? 4115
      : /heo|lợn/i.test(animal.name) ? 4113
      : /dê/i.test(animal.name) ? 4114
      : 4111;
    let feedEntry = session.feedStock.get(prefId);
    let feedKey = prefId;
    if (!feedEntry || feedEntry.qty <= 0) {
      feedEntry = session.feedStock.get(4116) || session.feedStock.get(4004);
      feedKey = feedEntry?.id ?? prefId;
    }
    if (!feedEntry || feedEntry.qty <= 0) {
      const needSpec = session.catalog?.feedRecipes?.find(r => r.outputGoodId === prefId)
        || session.catalog?.goods?.find(g => g.id === prefId);
      const neededName = needSpec?.name || 'Thức ăn';
      queueSfx(session, 'error');
      session.toast = `🌾 Hết ${neededName}! Hãy chế biến tại Máy xay!`;
      session.toastMs = 2400;
      return { ok: false, reason: 'no_feed', neededFeedId: prefId, neededFeedName: neededName };
    }
    feedEntry.qty -= 1;
    const leftQty = feedEntry.qty;
    if (leftQty <= 0) session.feedStock.delete(feedKey);
    animal.fed = true;
    animal.progressMs = 0;
    queueSfx(session, 'plant');
    session.toast = `🌿 Cho ${animal.name} ăn ${feedEntry.name} (còn ${leftQty})`;
    session.toastMs = 1800;
    return { ok: true, action: 'fed', feedName: feedEntry.name, leftQty };
  }
  return { ok: false };
}

export function sellGood(session, itemId, qty = 1) {
  const entry = session.inventory.get(itemId);
  if (!entry || entry.qty <= 0) return { ok: false };
  const count = Math.min(entry.qty, qty);
  const earned = count * entry.sellPrice;
  entry.qty -= count;
  if (entry.qty <= 0) session.inventory.delete(itemId);
  session.coins += earned;
  advanceQuests(session, 'sell', count);
  queueSfx(session, 'coin');
  session.toast = `💰 Đã bán ${count}× ${entry.name} (+${earned} Xu)`;
  session.toastMs = 2000;
  return { ok: true, earned };
}

export function sellAllGoods(session) {
  let total = 0;
  let count = 0;
  for (const entry of session.inventory.values()) {
    total += entry.qty * entry.sellPrice;
    count += entry.qty;
  }
  if (count === 0) return { ok: false, earned: 0 };
  session.inventory.clear();
  session.coins += total;
  advanceQuests(session, 'sell', count);
  queueSfx(session, 'coin');
  session.toast = `💰 Đã bán toàn bộ kho (${count} món) +${total} Xu!`;
  session.toastMs = 2200;
  return { ok: true, earned: total };
}

export function claimQuestReward(session, questId) {
  const q = session.quests?.find(item => item.id === questId);
  if (!q || !q.completed || q.claimed) return { ok: false };
  q.claimed = true;
  session.coins += q.rewardCoins;
  awardFarmXp(session, q.rewardXp);
  queueSfx(session, 'coin');
  session.toast = `🏆 Nhận thưởng ${q.title}: +${q.rewardCoins} Xu, +${q.rewardXp} XP!`;
  session.toastMs = 2400;
  return { ok: true };
}

export function interactAtFarmTile(session, row, col, worldX = null, worldY = null) {
  const animal = session.animals.find(a => a.row === row && a.col === col);
  if (animal) return collectOrFeedAnimal(session, animal.uid);

  const plot = session.plots.get(`${row},${col}`);
  if (!plot) return plowPlot(session, row, col, worldX, worldY);
  if (plot.stage === 'ready') return harvestPlot(session, row, col);
  if (plot.stage === 'growing') return waterPlot(session, row, col);
  if (plot.stage === 'tilled') return plantCropOnPlot(session, row, col, session.selectedCropId);
  return { ok: false };
}

export function findLandZoneAtPoint(wx, wy) {
  return LAND_ZONES.find(z => wx >= z.minX && wx <= z.maxX && wy >= z.minY && wy <= z.maxY) || null;
}

export function isPointInUnlockedLand(session, wx, wy) {
  const unlocked = session.unlockedZones || ['center'];
  return LAND_ZONES.some(z => unlocked.includes(z.id) && wx >= z.minX && wx <= z.maxX && wy >= z.minY && wy <= z.maxY);
}

export function buyLandZone(session, zoneId) {
  const zone = LAND_ZONES.find(z => z.id === zoneId);
  if (!zone) return { ok: false };
  if (session.unlockedZones.includes(zoneId)) return { ok: false, reason: 'owned' };
  if (session.level < zone.unlockLevel) {
    session.toast = `${zone.name} mở khóa ở Cấp ${zone.unlockLevel}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'locked' };
  }
  if (session.coins < zone.cost) {
    session.toast = `Cần ${zone.cost} Xu để mua ${zone.name}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'no_coins' };
  }
  session.coins -= zone.cost;
  session.unlockedZones.push(zoneId);
  awardFarmXp(session, 25);
  session.toast = `🗺️ Đã mở rộng ${zone.name}! (+25 XP)`;
  session.toastMs = 2600;
  return { ok: true, zone };
}

export function plantFruitTree(session, cropId, wx, wy) {
  const spec = session.catalog?.crops?.find(c => c.id === cropId && c.isTree);
  if (!spec) return { ok: false, reason: 'not_tree' };
  if (session.level < spec.unlockLevel) {
    session.toast = `${spec.name} mở khóa ở Cấp ${spec.unlockLevel}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'locked' };
  }
  if (session.coins < spec.buyPrice) {
    session.toast = `Cần ${spec.buyPrice} Xu để trồng ${spec.name}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'no_coins' };
  }
  const iso = worldToIso(wx, wy);
  const snapped = isoToWorld(iso.ix, iso.iy);
  session.coins -= spec.buyPrice;
  const tree = {
    uid: session.nextTreeUid++,
    cropId: spec.id,
    name: spec.name,
    worldX: snapped.wx,
    worldY: snapped.wy,
    worldBlock: spec.worldBlock,
    ready: false,
    progressMs: 0,
    growMs: spec.growSec * 1000,
  };
  session.fruitTrees.push(tree);
  awardFarmXp(session, 6);
  advanceQuests(session, 'plant', 1);
  session.toast = `🌳 Đã trồng ${spec.name} (-${spec.buyPrice} Xu)`;
  session.toastMs = 2200;
  return { ok: true, tree };
}

export function placeDecoration(session, decorId, wx, wy) {
  const spec = session.catalog?.decorations?.find(d => d.id === decorId);
  if (!spec) return { ok: false };
  if (session.level < spec.unlockLevel) {
    session.toast = `${spec.name} mở khóa ở Cấp ${spec.unlockLevel}!`;
    session.toastMs = 2000;
    return { ok: false, reason: 'locked' };
  }
  if (session.coins < spec.buyPrice) {
    session.toast = `Cần ${spec.buyPrice} Xu để đặt ${spec.name}!`;
    session.toastMs = 2000;
    return { ok: false, reason: 'no_coins' };
  }
  const iso = worldToIso(wx, wy);
  const snapped = isoToWorld(iso.ix, iso.iy);
  session.coins -= spec.buyPrice;
  const item = {
    uid: session.nextDecorUid++,
    decorId: spec.id,
    name: spec.name,
    worldX: snapped.wx,
    worldY: snapped.wy,
    worldBlock: spec.worldBlock,
    paletteIndex: spec.paletteIndex,
    frame: spec.frame,
  };
  session.placedDecor.push(item);
  awardFarmXp(session, 5);
  session.toast = `🏡 Đã đặt ${spec.name} (-${spec.buyPrice} Xu)`;
  session.toastMs = 2000;
  return { ok: true, item };
}

export function clearDebris(session, opaqueKey, wx, wy) {
  if (session.clearedDebris.includes(opaqueKey)) return { ok: false };
  if (session.energy < 2) {
    session.toast = 'Hết năng lượng (cần 2 ⚡ để dọn dẹp)!';
    session.toastMs = 2000;
    return { ok: false, reason: 'no_energy' };
  }
  session.energy -= 2;
  session.clearedDebris.push(opaqueKey);
  session.coins += 15;
  awardFarmXp(session, 5);
  advanceQuests(session, 'clear', 1);
  // Chance to find a collectible when clearing bushes/rocks
  const coll = session.catalog?.collectibles || [];
  queueSfx(session, 'clear');
  if (coll.length > 0) {
    const found = coll[opaqueKey % Math.min(coll.length, Math.max(4, session.level + 2))];
    session.collections[found.id] = (session.collections[found.id] || 0) + 1;
    addPopup(session, wx, wy - 20, `+15 Xu & ${found.name}!`, '#9cff7b');
    session.toast = `🪓 Đã dọn đất (+15 Xu, +5 XP, nhặt ${found.name})!`;
  } else {
    addPopup(session, wx, wy - 20, '+15 Xu +5 XP', '#9cff7b');
    session.toast = '🪓 Đã dọn chướng ngại (+15 Xu, +5 XP)!';
  }
  session.toastMs = 2200;
  return { ok: true };
}

function consumeRecipeIngredients(session, recipe) {
  for (const ing of recipe.ingredients || []) {
    const have = session.inventory.get(ing.goodId)?.qty || 0;
    if (have < ing.qty) {
      session.toast = `Thiếu nguyên liệu: cần ${ing.qty}× ${ing.name} (có ${have})!`;
      session.toastMs = 2400;
      return false;
    }
  }
  for (const ing of recipe.ingredients || []) {
    const entry = session.inventory.get(ing.goodId);
    entry.qty -= ing.qty;
    if (entry.qty <= 0) session.inventory.delete(ing.goodId);
  }
  return true;
}

export function startKitchenRecipe(session, recipeId) {
  const recipe = session.catalog?.recipes?.find(r => r.id === recipeId);
  if (!recipe) return { ok: false };
  if (session.level < recipe.unlockLevel) {
    session.toast = `${recipe.name} mở khóa ở Cấp ${recipe.unlockLevel}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'locked' };
  }
  if ((session.kitchenQueue?.length || 0) >= 4) {
    session.toast = 'Bếp đang đầy (tối đa 4 món cùng lúc)!';
    session.toastMs = 2000;
    return { ok: false, reason: 'full' };
  }
  if (!consumeRecipeIngredients(session, recipe)) {
    return { ok: false, reason: 'missing_ingredient' };
  }
  const job = {
    uid: session.nextCookUid++,
    recipeId: recipe.id,
    name: recipe.name,
    outputGoodId: recipe.outputGoodId,
    iconBlock: recipe.iconBlock ?? 50,
    iconFrame: recipe.iconFrame ?? 0,
    sellPrice: recipe.sellPrice,
    xp: recipe.xp,
    progressMs: 0,
    cookMs: recipe.cookSec * 1000,
    ready: false,
  };
  session.kitchenQueue.push(job);
  queueSfx(session, 'cook');
  session.toast = `🍳 Đang nấu ${recipe.name} (${recipe.cookSec}s)...`;
  session.toastMs = 2000;
  return { ok: true, job };
}

export function startFeedMillRecipe(session, recipeId) {
  const recipe = session.catalog?.feedRecipes?.find(r => r.id === recipeId);
  if (!recipe) return { ok: false };
  if (session.level < recipe.unlockLevel) {
    session.toast = `${recipe.name} mở khóa ở Cấp ${recipe.unlockLevel}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'locked' };
  }
  if ((session.millQueue?.length || 0) >= 4) {
    session.toast = 'Máy xay đang đầy (tối đa 4 ô chờ)!';
    session.toastMs = 2000;
    return { ok: false, reason: 'full' };
  }
  if (!consumeRecipeIngredients(session, recipe)) {
    return { ok: false, reason: 'missing_ingredient' };
  }
  if (!session.millQueue) session.millQueue = [];
  const job = {
    uid: session.nextMillUid++,
    recipeId: recipe.id,
    name: recipe.name,
    outputGoodId: recipe.outputGoodId,
    outputQty: recipe.outputQty || 3,
    iconBlock: recipe.iconBlock ?? 34,
    iconFrame: recipe.iconFrame ?? 0,
    xp: recipe.xp || 5,
    progressMs: 0,
    millMs: (recipe.millSec || 4) * 1000,
    ready: false,
  };
  session.millQueue.push(job);
  queueSfx(session, 'cook');
  session.toast = `⚙️ Đang xay ${recipe.name} (+${job.outputQty}, ${recipe.millSec}s)...`;
  session.toastMs = 2000;
  return { ok: true, job };
}

export function collectFeedMillBatch(session, jobUid) {
  const idx = (session.millQueue || []).findIndex(j => j.uid === jobUid && j.ready);
  if (idx < 0) return { ok: false };
  const [job] = session.millQueue.splice(idx, 1);
  if (!session.feedStock) session.feedStock = new Map();
  const existing = session.feedStock.get(job.outputGoodId) || {
    id: job.outputGoodId, name: job.name, qty: 0,
    iconBlock: job.iconBlock ?? 34, iconFrame: job.iconFrame ?? 0,
  };
  existing.qty += job.outputQty || 3;
  session.feedStock.set(job.outputGoodId, existing);
  awardFarmXp(session, job.xp || 5);
  advanceQuests(session, 'cook', 1);
  queueSfx(session, 'harvest');
  session.toast = `🌾 Nhận +${job.outputQty} ${job.name} vào Tháp chứa!`;
  session.toastMs = 2200;
  return { ok: true, job, totalFeed: existing.qty };
}

// Port of a.java:32333-32349: 3 floating numbered fish bubbles (1..9) on the Pond
export function createFishingBubbles() {
  const pool = [1, 2, 3, 4, 5, 6, 7, 8, 9];
  for (let i = pool.length - 1; i > 0; i -= 1) {
    const j = Math.floor(Math.random() * (i + 1));
    [pool[i], pool[j]] = [pool[j], pool[i]];
  }
  const slots = [
    { x: 56 + Math.round(Math.random() * 22), y: 122 + Math.round(Math.random() * 24) },
    { x: 108 + Math.round(Math.random() * 24), y: 158 + Math.round(Math.random() * 26) },
    { x: 162 + Math.round(Math.random() * 24), y: 118 + Math.round(Math.random() * 28) },
  ];
  return slots.map((pos, i) => ({ num: pool[i], x: pos.x, y: pos.y }));
}

function grantFishingReward(session, row) {
  const cat = session.catalog || {};
  if (row.kind === 2) {
    const coins = Math.min(2500, Math.max(50, row.qty <= 500 ? row.qty : Math.round(row.qty / 20)));
    session.coins += coins;
    return { kind: 'coins', name: `${coins} Xu`, qty: coins, uiBlock: 1, uiFrame: 9 };
  }
  if (row.kind === 3) {
    const xp = Math.min(80, Math.max(15, row.qty <= 100 ? row.qty : Math.round(row.qty / 200)));
    awardFarmXp(session, xp);
    return { kind: 'xp', name: `${xp} XP`, qty: xp, uiBlock: 1, uiFrame: 10 };
  }
  if (row.kind === 7) {
    const tree = cat.crops?.find(c => c.id === row.itemId && c.isTree);
    if (tree) {
      session.fruitTrees.push({
        uid: session.nextTreeUid++,
        cropId: tree.id,
        name: tree.name,
        worldX: 1120 + (session.fruitTrees.length % 4) * 32,
        worldY: 560 + Math.floor(session.fruitTrees.length / 4) * 20,
        worldBlock: tree.worldBlock,
        ready: true,
        progressMs: tree.growSec * 1000,
        growMs: tree.growSec * 1000,
      });
      return { kind: 'tree', name: tree.name, qty: 1, spriteBlock: tree.worldBlock, spriteFrame: 1 };
    }
  }
  if (row.kind === 6) {
    const animal = (cat.allAnimals || cat.animals || []).find(a => a.id === row.itemId);
    if (animal) {
      session.animals.push({
        uid: session.nextAnimalUid++,
        animalId: animal.id,
        name: animal.name,
        row: 38,
        col: 28,
        worldX: 1000 + (session.animals.length % 4) * 24,
        worldY: 668 + Math.floor(session.animals.length / 4) * 16,
        worldBlock: animal.worldBlock ?? 8,
        paletteIndex: animal.paletteIndex ?? 0,
        idleFrame: animal.idleFrame ?? 0,
        fed: true,
        ready: false,
        progressMs: 0,
        prodMs: animal.prodSec * 1000,
        sellPrice: animal.sellPrice,
        xp: animal.xp,
      });
      return { kind: 'animal', name: animal.name, qty: 1, spriteBlock: animal.worldBlock, spriteFrame: animal.idleFrame || 0, paletteIndex: animal.paletteIndex || 0 };
    }
  }
  if (row.kind === 5) {
    const dec = cat.decorations?.find(d => d.id === row.itemId);
    if (dec) {
      session.placedDecor.push({
        uid: session.nextDecorUid++,
        decorId: dec.id,
        name: dec.name,
        worldX: 980 + (session.placedDecor.length % 4) * 26,
        worldY: 540,
        worldBlock: dec.worldBlock,
        paletteIndex: dec.paletteIndex || 0,
        frame: dec.frame || 0,
      });
      return { kind: 'decor', name: dec.name, qty: 1, spriteBlock: dec.worldBlock, spriteFrame: dec.frame || 0 };
    }
  }
  const good = cat.goods?.find(g => g.id === row.itemId) || cat.goods?.[1];
  const qty = Math.min(6, Math.max(1, row.qty || 1));
  if (good) {
    const existing = session.inventory.get(good.id) || {
      id: good.id, name: good.name, qty: 0, sellPrice: good.sellPrice,
      iconBlock: good.iconBlock ?? 2, iconFrame: good.iconFrame ?? 0,
    };
    existing.qty += qty;
    session.inventory.set(good.id, existing);
    return { kind: 'good', name: `${qty}× ${good.name}`, qty, iconBlock: good.iconBlock ?? 2, iconFrame: good.iconFrame ?? 0 };
  }
  session.coins += 100;
  return { kind: 'coins', name: '100 Xu', qty: 100, uiBlock: 1, uiFrame: 9 };
}

export function startFishingRound(session, rodType = 0, now = Date.now()) {
  const f = session.fishing || (session.fishing = { mode: 'menu', rodType: 0, freeCooldownUntil: 0, castsLeft: 5, catches: [], bubbles: [], spawnMs: 0 });
  const cfg = session.catalog?.fishingConfig || { freeCooldownMs: 60000, cashCost: 5, coinCost: 50 };
  let totalInv = 0;
  for (const it of session.inventory.values()) totalInv += it.qty || 0;
  if (totalInv + 3 > (session.barnCapacity || 40)) {
    session.toast = 'Kho thóc gần đầy! Hãy bán bớt đồ trước khi câu cá!';
    session.toastMs = 2200;
    return { ok: false, reason: 'barn_full' };
  }
  if (rodType === 0) {
    if (now < (f.freeCooldownUntil || 0)) {
      const rem = Math.ceil((f.freeCooldownUntil - now) / 1000);
      session.toast = `Cần miễn phí hồi lại sau ${rem}s (hoặc dùng Cần 50 Xu)!`;
      session.toastMs = 2000;
      return { ok: false, reason: 'cooldown', remainSec: rem };
    }
    f.freeCooldownUntil = now + (cfg.freeCooldownMs || 60000);
  } else if (rodType === 2) {
    const cost = cfg.coinCost || 50;
    if (session.coins < cost) {
      session.toast = `Cần ${cost} Xu để dùng Cần Xu!`;
      session.toastMs = 2000;
      return { ok: false, reason: 'no_coins' };
    }
    session.coins -= cost;
  } else if (rodType === 1) {
    const cost = cfg.cashCost || 5;
    if (session.cash < cost) {
      session.toast = `Cần ${cost} Tiền mặt để dùng Cần Vàng!`;
      session.toastMs = 2000;
      return { ok: false, reason: 'no_cash' };
    }
    session.cash -= cost;
  }
  f.mode = 'playing';
  f.rodType = rodType;
  f.castsLeft = 5;
  f.catches = [];
  f.spawnMs = 0;
  f.bubbles = createFishingBubbles();
  queueSfx(session, 'click');
  session.toast = '🎣 Chạm bóng cá (hoặc bấm phím 1-9) để quăng cần!';
  session.toastMs = 2400;
  return { ok: true };
}

export function castFishingLine(session, pickedNum) {
  const f = session.fishing;
  if (!f || f.mode !== 'playing' || f.castsLeft <= 0) return { ok: false };
  const hitBubble = (f.bubbles || []).find(b => b.num === pickedNum);
  f.castsLeft -= 1;
  if (!hitBubble) {
    queueSfx(session, 'error');
    session.toast = `💧 Số ${pickedNum} không có cá! Chạm đúng số trên mặt ao!`;
    session.toastMs = 1600;
    if (f.castsLeft <= 0) f.mode = 'result';
    return { ok: false, reason: 'miss' };
  }
  const pool = session.catalog?.fishingLoot || [];
  const weightKey = f.rodType === 1 ? 'weightCash' : f.rodType === 2 ? 'weightCoin' : 'weightFree';
  const eligible = pool.filter(r => r[weightKey] > 0);
  const chosenPool = eligible.length > 0 ? eligible : pool;
  let reward = null;
  if (chosenPool.length > 0) {
    const totalW = chosenPool.reduce((acc, r) => acc + Math.max(1, r[weightKey] || 100), 0);
    let roll = Math.random() * totalW;
    let picked = chosenPool[0];
    for (const r of chosenPool) {
      roll -= Math.max(1, r[weightKey] || 100);
      if (roll <= 0) { picked = r; break; }
    }
    reward = grantFishingReward(session, picked);
  } else {
    session.coins += 100;
    reward = { kind: 'coins', name: '100 Xu', qty: 100, uiBlock: 1, uiFrame: 9 };
  }
  f.catches.push(reward);
  f.bubbles = createFishingBubbles();
  f.spawnMs = 0;
  advanceQuests(session, 'harvest', 1);
  queueSfx(session, 'harvest');
  session.toast = `🐟 Câu hay lắm! Trúng: ${reward.name}!`;
  session.toastMs = 2000;
  if (f.catches.length >= 3 || f.castsLeft <= 0) {
    f.mode = 'result';
    queueSfx(session, 'coin');
  }
  return { ok: true, reward, finished: f.mode === 'result' };
}

export function scoopPondWater(session) {
  session.energy = Math.min(session.maxEnergy, session.energy + 5);
  queueSfx(session, 'water');
  session.toast = '💧 Múc nước Ao mát lành (+5 ⚡ Năng lượng)!';
  session.toastMs = 2000;
  return { ok: true, energy: session.energy };
}

export function collectKitchenDish(session, jobUid) {
  const idx = (session.kitchenQueue || []).findIndex(j => j.uid === jobUid && j.ready);
  if (idx < 0) return { ok: false };
  const [job] = session.kitchenQueue.splice(idx, 1);
  const existing = session.inventory.get(job.outputGoodId) || {
    id: job.outputGoodId, name: job.name, qty: 0, sellPrice: job.sellPrice,
    iconBlock: job.iconBlock ?? 50, iconFrame: job.iconFrame ?? 0,
  };
  existing.qty += 1;
  existing.iconBlock = job.iconBlock ?? existing.iconBlock ?? 50;
  existing.iconFrame = job.iconFrame ?? existing.iconFrame ?? 0;
  session.inventory.set(job.outputGoodId, existing);
  awardFarmXp(session, job.xp);
  advanceQuests(session, 'cook', 1);
  queueSfx(session, 'harvest');
  session.toast = `🍽️ Đã nhận ${job.name} vào Kho (+${job.xp} XP)!`;
  session.toastMs = 2200;
  return { ok: true, job };
}

export function repairManorRoom(session, entityId) {
  const room = session.catalog?.buildings?.find(b => b.entityId === entityId && b.isManorRoom);
  if (!room) return { ok: false };
  if (session.unlockedRooms[entityId]) return { ok: false, reason: 'repaired' };
  const cost = Math.max(150, Math.min(5000, room.repairCost || 300));
  if (session.coins < cost) {
    session.toast = `Cần ${cost} Xu để sửa ${room.name}!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'no_coins' };
  }
  session.coins -= cost;
  session.unlockedRooms[entityId] = true;
  awardFarmXp(session, 30);
  session.toast = `🏛️ Đã sửa xong ${room.name}! (+30 XP)`;
  session.toastMs = 2600;
  return { ok: true, room };
}

export function upgradeBarn(session) {
  const cost = 150 + Math.floor((session.barnCapacity - 40) * 10);
  if (session.coins < cost) {
    session.toast = `Cần ${cost} Xu để nâng cấp Kho thóc (+20 sức chứa)!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'no_coins' };
  }
  session.coins -= cost;
  session.barnCapacity += 20;
  awardFarmXp(session, 15);
  queueSfx(session, 'coin');
  session.toast = `🏚️ Đã nâng cấp Kho thóc lên ${session.barnCapacity} chỗ!`;
  session.toastMs = 2200;
  return { ok: true };
}

export function upgradeCoop(session, kind = 'chicken') {
  const isChicken = kind === 'chicken';
  const curCap = isChicken ? (session.coopCapacity || 6) : (session.shedCapacity || 6);
  const cost = 200 + Math.floor((curCap - 6) * 40);
  if (session.coins < cost) {
    session.toast = `Cần ${cost} Xu để mở rộng ${isChicken ? 'Chuồng gà' : 'Chuồng thú'} (+4 chỗ)!`;
    session.toastMs = 2200;
    return { ok: false, reason: 'no_coins' };
  }
  session.coins -= cost;
  if (isChicken) session.coopCapacity = curCap + 4;
  else session.shedCapacity = curCap + 4;
  awardFarmXp(session, 18);
  queueSfx(session, 'coin');
  session.toast = `🏠 Đã mở rộng ${isChicken ? 'Chuồng gà' : 'Chuồng thú'} lên ${curCap + 4} chỗ!`;
  session.toastMs = 2200;
  return { ok: true };
}

export function claimMail(session, mailId) {
  const m = (session.neighborMail || []).find(item => item.id === mailId && !item.claimed);
  if (!m) return { ok: false };
  if (m.kind === 'order') {
    let totalItems = 0;
    for (const it of session.inventory.values()) totalItems += it.qty;
    if (totalItems < m.needQty) {
      session.toast = `Cần có ít nhất ${m.needQty} nông sản trong Kho để giao đơn cho ${m.from}!`;
      session.toastMs = 2400;
      return { ok: false, reason: 'need_goods' };
    }
    let remain = m.needQty;
    for (const [id, it] of session.inventory.entries()) {
      const take = Math.min(it.qty, remain);
      it.qty -= take;
      remain -= take;
      if (it.qty <= 0) session.inventory.delete(id);
      if (remain <= 0) break;
    }
  }
  m.claimed = true;
  session.coins += m.giftCoins;
  awardFarmXp(session, m.giftXp);
  advanceQuests(session, 'sell', 1);
  session.toast = `✉️ Nhận thưởng từ ${m.from}: +${m.giftCoins} Xu, +${m.giftXp} XP!`;
  session.toastMs = 2400;
  return { ok: true };
}

export function helpNeighbor(session, neighborId) {
  const nb = session.catalog?.neighbors?.find(n => n.id === neighborId);
  if (!nb) return { ok: false };
  if (session.helpedNeighbors[neighborId]) {
    session.toast = `Bạn đã giúp trang trại ${nb.name} hôm nay rồi!`;
    session.toastMs = 1800;
    return { ok: false, reason: 'already_helped' };
  }
  if (session.energy < 2) {
    session.toast = 'Cần 2 ⚡ Năng lượng để giúp hàng xóm!';
    session.toastMs = 2000;
    return { ok: false, reason: 'no_energy' };
  }
  session.energy -= 2;
  session.helpedNeighbors[neighborId] = true;
  session.coins += 45;
  awardFarmXp(session, 12);
  advanceQuests(session, 'help', 1);
  session.toast = `🤝 Đã giúp ${nb.name} tưới vườn! (+45 Xu, +12 XP)`;
  session.toastMs = 2400;
  return { ok: true };
}

/**
 * Port of a.java:1710-1728 (case 47: a.u(4 + N)):
 * Actually travel to any of the 10 real neighbor farms stored in pack10[5..14]!
 */
export function visitNeighborFarm(session, neighborIndex, worldResources) {
  const nb = session.catalog?.neighbors?.[neighborIndex];
  if (!nb || !worldResources?.neighborFarmEntities) return { ok: false };
  const entities = worldResources.neighborFarmEntities(neighborIndex);
  if (!session.visitingNeighbor && session.farmer) {
    session.homeFarmerPos = { x: session.farmer.x, y: session.farmer.y, cameraX: session.cameraX, cameraY: session.cameraY };
  }
  const hostChar = entities.find(e => e.category === 42) || entities.find(e => e.category === 49) || entities[0];
  const startX = hostChar ? Math.max(120, Math.min(1900, hostChar.x - 36)) : 1044;
  const startY = hostChar ? Math.max(340, Math.min(920, hostChar.y + 24)) : 460;
  session.visitingNeighbor = {
    index: neighborIndex,
    id: nb.id,
    name: nb.name,
    pack10Block: 5 + neighborIndex,
    entities,
    helpedKeys: [],
    helpsToday: session.helpedNeighbors[nb.id] ? 5 : 0,
    maxHelps: 5,
  };
  if (session.farmer) {
    session.farmer.x = startX;
    session.farmer.y = startY;
    session.farmer.targetX = startX;
    session.farmer.targetY = startY;
    session.farmer.state = 'idle';
    session.farmer.anim = 2;
    session.farmer.pendingAction = null;
  }
  const zoom = session.worldZoom || 1;
  session.cameraX = startX - (SCREEN_W / zoom) / 2;
  session.cameraY = startY - (SCREEN_H / zoom) / 2;
  clampWorldCamera(session, worldResources.tileMap);
  session.view = SOURCE_VIEW.WORLD_LAYER;
  session.toast = `🏡 Đang thăm trang trại ${nb.name}! Chạm cây/thú để giúp (0/5)`;
  session.toastMs = 3000;
  return { ok: true, neighbor: nb, entityCount: entities.length };
}

export function helpNeighborEntity(session, opaqueKey, wx, wy) {
  const vn = session.visitingNeighbor;
  if (!vn) return { ok: false };
  if (vn.helpsToday >= vn.maxHelps) {
    session.toast = `Bạn đã giúp đủ 5 việc cho ${vn.name} hôm nay!`;
    session.toastMs = 2000;
    return { ok: false, reason: 'max_helps' };
  }
  if (vn.helpedKeys.includes(opaqueKey)) {
    session.toast = 'Chỗ này bạn đã giúp rồi!';
    session.toastMs = 1500;
    return { ok: false, reason: 'already_done' };
  }
  if (session.energy < 1) {
    session.toast = 'Cần 1 ⚡ Năng lượng để giúp hàng xóm!';
    session.toastMs = 2000;
    return { ok: false, reason: 'no_energy' };
  }
  session.energy -= 1;
  vn.helpedKeys.push(opaqueKey);
  vn.helpsToday += 1;
  if (vn.helpsToday >= vn.maxHelps) session.helpedNeighbors[vn.id] = true;
  session.coins += 20;
  awardFarmXp(session, 8);
  advanceQuests(session, 'help', 1);
  queueSfx(session, 'help');
  session.toast = `❤️ Đã giúp ${vn.name} (${vn.helpsToday}/${vn.maxHelps}) +20 Xu, +8 XP!`;
  session.toastMs = 2200;
  return { ok: true, helpsToday: vn.helpsToday };
}

export function returnHomeFarm(session, tileMap = null) {
  if (!session.visitingNeighbor) return { ok: false };
  session.visitingNeighbor = null;
  if (session.homeFarmerPos && session.farmer) {
    session.farmer.x = session.homeFarmerPos.x;
    session.farmer.y = session.homeFarmerPos.y;
    session.farmer.targetX = session.homeFarmerPos.x;
    session.farmer.targetY = session.homeFarmerPos.y;
    session.farmer.state = 'idle';
    session.farmer.anim = 2;
    session.farmer.pendingAction = null;
    session.cameraX = session.homeFarmerPos.cameraX;
    session.cameraY = session.homeFarmerPos.cameraY;
    clampWorldCamera(session, tileMap);
  }
  session.view = SOURCE_VIEW.WORLD_LAYER;
  session.toast = '🏠 Đã quay về trang trại của bạn!';
  session.toastMs = 2000;
  return { ok: true };
}

export function sellCollectible(session, collectibleId) {
  const count = session.collections?.[collectibleId] || 0;
  if (count <= 0) return { ok: false };
  const spec = session.catalog?.collectibles?.find(c => c.id === collectibleId);
  const reward = spec?.sellPrice || 50;
  session.collections[collectibleId] = count - 1;
  session.coins += reward;
  awardFarmXp(session, 8);
  queueSfx(session, 'coin');
  session.toast = `🏺 Đã bán cổ vật ${spec?.name || ''} (+${reward} Xu)!`;
  session.toastMs = 2000;
  return { ok: true };
}

// Port of a.java:22482-22650: dispatch building click to its authentic Green Farm 3 UI screen
export function openBuildingMenu(session, entityId) {
  session.panelCursor = 0;
  session.parentView = null;
  if (entityId === 2) {
    session.view = SOURCE_VIEW.KITCHEN;
    return 'kitchen';
  }
  if (entityId === 14 || entityId === 13) {
    session.view = SOURCE_VIEW.FEED_MILL;
    return 'feed_mill';
  }
  if (entityId === 0) {
    session.view = SOURCE_VIEW.COLLECTIONS;
    return 'collections';
  }
  if (entityId >= 1 && entityId <= 8) {
    session.view = SOURCE_VIEW.MANOR;
    return 'manor';
  }
  if (entityId === 10 || entityId === 9) {
    session.view = SOURCE_VIEW.BARN;
    return 'barn';
  }
  if (entityId === 11) {
    session.coopFilter = 'chicken';
    session.view = SOURCE_VIEW.COOP;
    return 'coop';
  }
  if (entityId === 12) {
    session.coopFilter = 'livestock';
    session.view = SOURCE_VIEW.COOP;
    return 'coop';
  }
  if (entityId === 15) {
    session.view = SOURCE_VIEW.MAILBOX;
    return 'mailbox';
  }
  if (entityId === 17) {
    if (!session.fishing) {
      session.fishing = { mode: 'menu', rodType: 0, freeCooldownUntil: 0, castsLeft: 5, catches: [], bubbles: [], spawnMs: 0 };
    } else {
      session.fishing.mode = 'menu';
    }
    session.view = SOURCE_VIEW.FISHING;
    return 'fishing';
  }
  session.view = SOURCE_VIEW.MANOR;
  return 'manor';
}

export function serializeFarmSession(session) {
  return JSON.stringify({
    coins: session.coins,
    cash: session.cash,
    xp: session.xp,
    level: session.level,
    energy: session.energy,
    maxEnergy: session.maxEnergy,
    barnCapacity: session.barnCapacity,
    siloLevel: session.siloLevel,
    selectedCropId: session.selectedCropId,
    plots: [...session.plots.values()],
    fruitTrees: session.fruitTrees,
    placedDecor: session.placedDecor,
    clearedDebris: session.clearedDebris,
    unlockedZones: session.unlockedZones,
    unlockedRooms: session.unlockedRooms,
    kitchenQueue: session.kitchenQueue,
    millQueue: session.millQueue,
    collections: session.collections,
    neighborMail: session.neighborMail,
    helpedNeighbors: session.helpedNeighbors,
    animals: session.animals,
    nextAnimalUid: session.nextAnimalUid,
    nextTreeUid: session.nextTreeUid,
    nextDecorUid: session.nextDecorUid,
    nextCookUid: session.nextCookUid,
    nextMillUid: session.nextMillUid,
    inventory: [...session.inventory.values()],
    feedStock: [...(session.feedStock?.values() || [])],
    fishingFreeCooldownUntil: session.fishing?.freeCooldownUntil || 0,
    quests: session.quests,
  });
}

export function restoreFarmSession(raw, worldResources, textData = {}) {
  const session = createFarmSession(worldResources, textData);
  try {
    const data = JSON.parse(raw);
    if (!data || typeof data !== 'object') return session;
    if (typeof data.coins === 'number') session.coins = data.coins;
    if (typeof data.cash === 'number') session.cash = data.cash;
    if (typeof data.xp === 'number') session.xp = data.xp;
    if (typeof data.level === 'number') session.level = data.level;
    if (typeof data.energy === 'number') session.energy = data.energy;
    if (typeof data.maxEnergy === 'number') session.maxEnergy = data.maxEnergy;
    if (typeof data.barnCapacity === 'number') session.barnCapacity = data.barnCapacity;
    if (typeof data.siloLevel === 'number') session.siloLevel = data.siloLevel;
    if (data.selectedCropId) session.selectedCropId = data.selectedCropId;
    if (Array.isArray(data.plots)) {
      session.plots = new Map(
        data.plots
          .filter((p) => {
            const px = p.worldX ?? (p.col * 36 + 18);
            const py = p.worldY ?? (p.row * 18 + 9);
            return !PLOT_FOOTPRINT_OFFSETS.some(([ox, oy]) => isBuildingBlocked(px + ox, py + oy));
          })
          .map(p => [`${p.row},${p.col}`, p]),
      );
    }
    if (Array.isArray(data.fruitTrees)) session.fruitTrees = data.fruitTrees;
    if (Array.isArray(data.placedDecor)) session.placedDecor = data.placedDecor;
    if (Array.isArray(data.clearedDebris)) session.clearedDebris = data.clearedDebris;
    if (Array.isArray(data.unlockedZones)) session.unlockedZones = data.unlockedZones;
    if (data.unlockedRooms && typeof data.unlockedRooms === 'object') session.unlockedRooms = data.unlockedRooms;
    if (Array.isArray(data.kitchenQueue)) session.kitchenQueue = data.kitchenQueue;
    if (Array.isArray(data.millQueue)) session.millQueue = data.millQueue;
    if (typeof data.nextMillUid === 'number') session.nextMillUid = data.nextMillUid;
    if (Array.isArray(data.feedStock)) {
      session.feedStock = new Map(data.feedStock.map(it => [it.id, it]));
    }
    if (typeof data.fishingFreeCooldownUntil === 'number' && session.fishing) {
      session.fishing.freeCooldownUntil = data.fishingFreeCooldownUntil;
    }
    if (data.collections && typeof data.collections === 'object') session.collections = data.collections;
    if (Array.isArray(data.neighborMail)) session.neighborMail = data.neighborMail;
    if (data.helpedNeighbors && typeof data.helpedNeighbors === 'object') session.helpedNeighbors = data.helpedNeighbors;
    if (Array.isArray(data.animals)) {
      const lookup = session.catalog?.allAnimals || session.catalog?.animals || [];
      session.animals = data.animals.map((a) => {
        const byId = lookup.find(x => x.id === a.animalId);
        const byVisual = lookup.find(x => x.worldBlock === a.worldBlock && x.paletteIndex === (a.paletteIndex || 0));
        const spec = byId || byVisual;
        if (spec && (a.name === 'Gà con Delaware' && a.animalId !== 2004)) {
          return { ...a, name: spec.name, sellPrice: a.sellPrice || spec.sellPrice };
        }
        return a;
      });
    }
    if (typeof data.nextAnimalUid === 'number') session.nextAnimalUid = data.nextAnimalUid;
    if (typeof data.nextTreeUid === 'number') session.nextTreeUid = data.nextTreeUid;
    if (typeof data.nextDecorUid === 'number') session.nextDecorUid = data.nextDecorUid;
    if (typeof data.nextCookUid === 'number') session.nextCookUid = data.nextCookUid;
    if (Array.isArray(data.inventory)) {
      const goods = session.catalog?.goods || [];
      const crops = session.catalog?.crops || [];
      const recipes = session.catalog?.recipes || [];
      session.inventory = new Map();
      for (const it of data.inventory) {
        let targetId = it.id;
        let g = goods.find(x => x.id === targetId);
        const c = crops.find(x => x.id === targetId || x.harvestGoodId === targetId);
        const r = recipes.find(x => x.outputGoodId === targetId || x.id === targetId);
        let healedName = it.name || g?.name || c?.name || r?.name || '';
        if (/^(Sản phẩm|Nông sản)\s/i.test(healedName) && targetId !== 4110) {
          if (![4001, 4002, 4003].includes(targetId)) {
            if (/cừu|len/i.test(healedName) || it.iconFrame === 3) targetId = 4003;
            else if (/bò|dê|sữa/i.test(healedName) || it.iconFrame === 1) targetId = 4002;
            else targetId = 4001;
          }
          g = goods.find(x => x.id === targetId) || g;
          healedName = g?.name || (targetId === 4001 ? 'Trứng' : targetId === 4002 ? 'Sữa' : targetId === 4003 ? 'Len' : healedName);
        }
        const iconBlock = g?.iconBlock ?? r?.iconBlock ?? c?.harvestIconBlock ?? it.iconBlock ?? 2;
        const iconFrame = g?.iconFrame ?? r?.iconFrame ?? c?.harvestIconFrame ?? it.iconFrame ?? 0;
        const prev = session.inventory.get(targetId);
        if (prev) {
          prev.qty += (it.qty || 0);
        } else {
          session.inventory.set(targetId, { ...it, id: targetId, name: healedName, iconBlock, iconFrame });
        }
      }
    }
    if (Array.isArray(data.quests)) session.quests = data.quests;
    if (session.level > 1 || session.xp > 0 || session.plots.size > 6) {
      session.toast = '';
      session.toastMs = 0;
    }
    session.view = SOURCE_VIEW.WORLD_LAYER;
    return session;
  } catch {
    return session;
  }
}
