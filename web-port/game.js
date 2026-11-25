/**
 * Green Farm 3 1:1 web port powered by decoded /5 world BSprites, /6 UI layouts,
 * /7 UI BSprites, /9 config tables, /10 58x58 world map + 10 neighbor farms, and EN text packs.
 */
import { mountPhaserRuntime } from './phaser-engine.js';
import { decodeBSpriteBlock, loadSplitPack, moduleToCanvasImage, readPackBlock } from './bsprite-loader.js';
import {
  drawBSpriteBlockAnim, drawBSpriteBlockFrame, drawBSpriteBlockFrameScaled,
  drawBSpriteFrame, drawBSpriteTileMap, drawOriginalUIScreen, withMIDPClip,
} from './render-original.js';
import { loadOriginalWorldResources } from './gf3-resource-loader.js';
import {
  SCREEN_W, SCREEN_H, KEY, SOURCE_VIEW, LAND_ZONES, advanceEvidenceView, mapKeyCode,
  createFarmSession, stepFarmSession, sellGood,
  sellAllGoods, claimQuestReward, serializeFarmSession, restoreFarmSession,
  xpForNextLevel, sourceFrame, sourceText, sourceTileAt,
  setFarmerWalkTarget, moveFarmerByVector, clampWorldCamera, snapPlotToIso4x4, isWalkBlocked,
  findLandZoneAtPoint, isPointInUnlockedLand,
  buyLandZone, startKitchenRecipe, collectKitchenDish, startFeedMillRecipe, collectFeedMillBatch,
  repairManorRoom, upgradeBarn, upgradeCoop, claimMail, sellCollectible, collectOrFeedAnimal,
  visitNeighborFarm, returnHomeFarm, startFishingRound, castFishingLine, scoopPondWater,
} from './gf-core.js';

const BUILDING_INTERACT_SPECS = {
  10: { cyOff: -12, tapRx: 40, tapRy: 36, keyRx: 44, keyRy: 46, approachDy: 46 }, // Barn
  11: { cyOff: -14, tapRx: 38, tapRy: 36, keyRx: 44, keyRy: 44, approachDy: 42 }, // Chicken coop
  12: { cyOff: -14, tapRx: 38, tapRy: 36, keyRx: 44, keyRy: 44, approachDy: 42 }, // Livestock shed
  13: { cyOff: -14, tapRx: 32, tapRy: 32, keyRx: 38, keyRy: 38, approachDy: 32 }, // Silos (Tháp chứa / Máy xay)
  14: { cyOff: -18, tapRx: 30, tapRy: 38, keyRx: 38, keyRy: 46, approachDy: 16 }, // Feed Mill (Máy xay)
  15: { cyOff: -10, tapRx: 20, tapRy: 20, keyRx: 26, keyRy: 26, approachDy: 20 }, // Mailbox
  17: { cyOff: -2, tapRx: 52, tapRy: 38, keyRx: 58, keyRy: 48, approachDy: 44 },  // Pond (Ao cá)
  18: { cyOff: 12, tapRx: 56, tapRy: 58, keyRx: 56, keyRy: 76, approachDy: 78 },  // Manor
  19: { cyOff: 12, tapRx: 56, tapRy: 58, keyRx: 56, keyRy: 76, approachDy: 78 },  // Manor
};

function findTargetBuilding(entities, wx, wy, mode = 'tap') {
  let best = null;
  let bestSpec = null;
  let bestScore = Infinity;
  for (const e of entities || []) {
    if (e.category !== 50 || (e.entityId >= 0 && e.entityId <= 8) || e.entityId === 16) continue;
    const spec = BUILDING_INTERACT_SPECS[e.entityId] || { cyOff: -14, tapRx: 36, tapRy: 36, keyRx: 44, keyRy: 44, approachDy: 40 };
    const rx = mode === 'key' ? spec.keyRx : spec.tapRx;
    const ry = mode === 'key' ? spec.keyRy : spec.tapRy;
    const score = Math.hypot((wx - e.x) / rx, (wy - (e.y + spec.cyOff)) / ry);
    if (score <= 1 && score < bestScore) {
      bestScore = score;
      best = e;
      bestSpec = spec;
    }
  }
  return best ? { entity: best, spec: bestSpec } : null;
}

const SAVE_KEY = 'gf3-farm-save-v5';
const canvasEl = typeof document !== 'undefined' ? document.getElementById('game') : null;
const IMG = {};
const SPRITES = { icon: 'assets/icon.png' };
let sourceWorld = null;
let sourcePack5 = null;
let sourcePack7 = null;
let sourceTileSprite = null;
let sourceTileImages = null;
let sourceOpeningFrame = null;
let textData = null;
let app = null;
let audioElement = null;
let previousFrameAt = 0;
const spriteBlockCache = new Map();
const uiSpriteCache = new Map();
const uiScreenCache = new Map();
const PAUSE_BADGE_SKIP = new Set([190]);
let worldCanvas = null;
let worldCtx = null;

const SFX_FILES = Object.freeze({
  click: 'assets/audio/gf3_b055.mp3',
  harvest: 'assets/audio/gf3_b056.mp3',
  plow: 'assets/audio/gf3_b057.mp3',
  clear: 'assets/audio/gf3_b057.mp3',
  plant: 'assets/audio/gf3_b059.mp3',
  water: 'assets/audio/gf3_b059.mp3',
  coin: 'assets/audio/gf3_b060.mp3',
  cook: 'assets/audio/gf3_b048.mp3',
  level: 'assets/audio/gf3_b049.mp3',
  help: 'assets/audio/gf3_b063.mp3',
});
const sfxAudioPool = new Map();

function playSfx(kind) {
  if (!app?.audioEnabled || typeof Audio === 'undefined') return;
  const rel = SFX_FILES[kind];
  if (!rel) return;
  try {
    let base = sfxAudioPool.get(kind);
    if (!base) {
      base = new Audio(new URL(rel, import.meta.url).href);
      base.volume = 0.45;
      sfxAudioPool.set(kind, base);
    }
    const inst = base.cloneNode();
    inst.volume = 0.45;
    inst.play().catch(() => {});
  } catch { /* ignore */ }
}

function flushSfxQueue(session) {
  if (!session?.sfxQueue?.length) return;
  while (session.sfxQueue.length > 0) {
    playSfx(session.sfxQueue.shift());
  }
}

function drawRoundedPill(ctx, x, y, w, h, r, fill, stroke = null, lineWidth = 1) {
  ctx.beginPath();
  ctx.roundRect(x + 0.5, y + 0.5, w - 1, h - 1, r);
  if (fill) {
    ctx.fillStyle = fill;
    ctx.fill();
  }
  if (stroke) {
    ctx.strokeStyle = stroke;
    ctx.lineWidth = lineWidth;
    ctx.stroke();
    ctx.lineWidth = 1;
  }
}

function drawCleanArrowButton(ctx, cx, cy, dir) {
  const r = 10;
  ctx.save();
  ctx.beginPath();
  if (dir === 'left') {
    ctx.moveTo(cx - r, cy);
    ctx.lineTo(cx + r - 3, cy - r);
    ctx.lineTo(cx + r - 3, cy + r);
  } else {
    ctx.moveTo(cx + r, cy);
    ctx.lineTo(cx - r + 3, cy - r);
    ctx.lineTo(cx - r + 3, cy + r);
  }
  ctx.closePath();
  ctx.fillStyle = '#2588eb';
  ctx.fill();
  ctx.strokeStyle = '#ffffff';
  ctx.lineWidth = 2;
  ctx.stroke();
  ctx.restore();
}

function getSpriteBlock(blockId, paletteIndex = 0) {
  if (!sourcePack5 || !Number.isInteger(blockId) || blockId < 0 || blockId >= 160) return null;
  const pal = Math.max(0, paletteIndex | 0);
  const key = `${blockId}:${pal}`;
  if (spriteBlockCache.has(key)) return spriteBlockCache.get(key);
  let entry = null;
  try {
    const raw = readPackBlock(sourcePack5, blockId);
    let sprite;
    try { sprite = decodeBSpriteBlock(raw, { paletteIndex: pal }); }
    catch { sprite = decodeBSpriteBlock(raw, { paletteIndex: 0 }); }
    entry = { sprite, moduleImages: sprite.moduleImages.map(moduleToCanvasImage) };
  } catch { entry = null; }
  spriteBlockCache.set(key, entry);
  return entry;
}

function getUiSpriteBlock(blockId, paletteIndex = 0) {
  if (!sourcePack7 || !Number.isInteger(blockId) || blockId < 0 || blockId >= 123) return null;
  const pal = Math.max(0, paletteIndex | 0);
  const key = `${blockId}:${pal}`;
  if (uiSpriteCache.has(key)) return uiSpriteCache.get(key);
  let entry = null;
  try {
    const raw = readPackBlock(sourcePack7, blockId);
    let sprite;
    try { sprite = decodeBSpriteBlock(raw, { paletteIndex: pal }); }
    catch { sprite = decodeBSpriteBlock(raw, { paletteIndex: 0 }); }
    entry = { sprite, moduleImages: sprite.moduleImages.map(moduleToCanvasImage) };
  } catch { entry = null; }
  uiSpriteCache.set(key, entry);
  return entry;
}

// Port of a.java:9894: s < 1000 -> pack /7 (UI), s >= 1000 -> pack /5 (world)
function getAnySpriteBlock(spriteId, paletteIndex = 0) {
  if (spriteId < 1000) return getUiSpriteBlock(spriteId, paletteIndex);
  return getSpriteBlock(spriteId - 1000, paletteIndex);
}

function getUIScreen(screenId) {
  if (uiScreenCache.has(screenId)) return uiScreenCache.get(screenId);
  const widgets = sourceWorld?.uiScreen ? sourceWorld.uiScreen(screenId) : [];
  uiScreenCache.set(screenId, widgets);
  return widgets;
}

function loadImage(name, source) {
  return new Promise((resolve) => {
    const image = new Image();
    image.onload = () => resolve([name, image]);
    image.onerror = () => resolve([name, null]);
    image.src = source;
  });
}

// Port of a.java:1853-1865, a.java:1979-1985, a.java:2144-2169, e.java:2981-2997.
async function loadOriginalResources() {
  sourceWorld = await loadOriginalWorldResources({ textData });
  sourcePack5 = await loadSplitPack(new URL('assets/packs/5/5', import.meta.url).href);
  try { sourcePack7 = await loadSplitPack(new URL('assets/packs/7/7', import.meta.url).href); }
  catch { sourcePack7 = null; }
  sourceTileSprite = decodeBSpriteBlock(readPackBlock(sourcePack5, 0));
  sourceTileImages = sourceTileSprite.moduleImages.map(moduleToCanvasImage);

  const openingPackSprite = decodeBSpriteBlock(readPackBlock(sourcePack5, 100));
  const openingRecord = JSON.parse(await (await fetch(
    new URL('assets/sprites/source-frames/pack5-b100-f0.json', import.meta.url),
  )).text());
  if (openingRecord.block !== 100 || openingRecord.frame !== 0) {
    throw new Error('Opening frame manifest has an unexpected numeric source ID');
  }
  const frame = openingPackSprite.frames[openingRecord.frame];
  const frameModules = openingPackSprite.fmodules.slice(frame.firstFmodule, frame.firstFmodule + frame.fmoduleCount);
  if (frameModules.length !== openingRecord.frame_module_count) {
    throw new Error('Opening /10-/9-/5 join disagrees with decoded source frame');
  }
  const moduleImages = new Map();
  openingPackSprite.moduleImages.forEach((image, index) => {
    if (image) moduleImages.set(`5_b100_m${String(index).padStart(2, '0')}.png`, moduleToCanvasImage(image));
  });
  sourceOpeningFrame = {
    frame_modules: frameModules.map((part) => ({
      module_png: `5_b100_m${String(part.moduleIndex).padStart(2, '0')}.png`,
      flags: part.flags,
      offset_x: part.offsetX,
      offset_y: part.offsetY,
      module: {
        type: openingPackSprite.modules[part.moduleIndex].type,
        w: openingPackSprite.modules[part.moduleIndex].width,
        h: openingPackSprite.modules[part.moduleIndex].height,
      },
    })),
    frame_bounds: openingPackSprite.bounds[0],
  };
  return moduleImages;
}

async function bootAssets() {
  const images = await Promise.all(Object.entries(SPRITES).map(([name, source]) => loadImage(name, source)));
  for (const [name, image] of images) IMG[name] = image;
  const response = await fetch(new URL('assets/text/en.json', import.meta.url));
  if (!response.ok) throw new Error(`Cannot load recovered EN text (${response.status})`);
  textData = await response.json();
  IMG.openingModules = await loadOriginalResources();
}

function drawText(ctx, value, x, y, { align = 'left', size = 8, color = '#ffffff', bold = false, maxWidth } = {}) {
  ctx.fillStyle = color;
  ctx.textAlign = align;
  ctx.font = `${bold ? 'bold ' : ''}${size}px sans-serif`;
  if (maxWidth) ctx.fillText(String(value ?? ''), x, y, maxWidth);
  else ctx.fillText(String(value ?? ''), x, y);
}

function wrapLines(text, maxChars) {
  const words = String(text || '').split(' ');
  const lines = [];
  let line = '';
  for (const w of words) {
    const test = line ? `${line} ${w}` : w;
    if (test.length > maxChars && line) { lines.push(line); line = w; }
    else line = test;
  }
  if (line) lines.push(line);
  return lines;
}

function saveSession() {
  if (!app?.session) return;
  try { localStorage.setItem(SAVE_KEY, serializeFarmSession(app.session)); }
  catch { /* ignore */ }
}

// Port of a.java:17555-17589 (opening story dialogue from /10 block 15)
function renderOpeningEvidence(ctx) {
  ctx.fillStyle = '#0e160d';
  ctx.fillRect(0, 0, SCREEN_W, SCREEN_H);
  drawBSpriteFrame(ctx, sourceOpeningFrame, IMG.openingModules, 0, 0);
  const event = app.session.dialogue[app.session.dialogueIndex];
  const copy = event ? sourceText(textData, event.textId) : '';
  ctx.fillStyle = 'rgba(46, 26, 9, 0.9)';
  ctx.fillRect(6, 246, SCREEN_W - 12, 68);
  ctx.strokeStyle = '#e8c47a';
  ctx.strokeRect(6.5, 246.5, SCREEN_W - 13, 67);
  wrapLines(copy, 36).slice(0, 4).forEach((ln, i) => {
    drawText(ctx, ln, 12, 260 + i * 13, { size: 9, color: '#fff7e0' });
  });
  drawText(ctx, 'Chạm hoặc Enter để tiếp tục ▶', SCREEN_W - 12, 309, { align: 'right', size: 8, color: '#ffd84d', bold: true });
}

// Port of a.java:1853-1865, a.java:1881-1991, a.java:9553-9621 (a.M(1)), e.java:468-595
function renderFarmWorld(ctx) {
  ctx.fillStyle = '#70e038';
  ctx.fillRect(0, 0, SCREEN_W, SCREEN_H);
  const s = app.session;
  const tm = sourceWorld?.tileMap;
  const zoom = s.worldZoom || 1;
  const viewW = Math.ceil(SCREEN_W / zoom);
  const viewH = Math.ceil(SCREEN_H / zoom);
  const animTick = Math.floor((s.animTimeMs || 0) / 80); // Exact 12.5 FPS J2ME animation cadence!
  const vn = s.visitingNeighbor;

  if (typeof document !== 'undefined') {
    if (!worldCanvas) {
      worldCanvas = document.createElement('canvas');
      worldCtx = worldCanvas.getContext('2d');
    }
    if (worldCanvas.width !== viewW || worldCanvas.height !== viewH) {
      worldCanvas.width = viewW;
      worldCanvas.height = viewH;
    }
  }
  const wctx = worldCtx || ctx;
  wctx.imageSmoothingEnabled = false;
  wctx.fillStyle = '#70e038';
  wctx.fillRect(0, 0, viewW, viewH);

  const camX = Math.round(s.cameraX);
  const camY = Math.round(s.cameraY);
  if (tm && sourceTileSprite && sourceTileImages) {
    drawBSpriteTileMap(wctx, tm, sourceTileSprite, sourceTileImages, {
      x: 0,
      y: 0,
      width: viewW,
      height: viewH,
      cameraX: camX,
      cameraY: camY,
    });
  }

  const tw = tm?.tileWidth || 36;
  const th = tm?.tileHeight || 18;
  const ox = -camX;
  const oy = -camY;

  withMIDPClip(wctx, 0, 0, viewW, viewH, () => {
    const soilEntry = getSpriteBlock(6, 0);
    const drawList = [];

    if (vn) {
      // --- VISITING NEIGHBOR'S REAL FARM (pack10[5..14]) ---
      const helpedSet = new Set(vn.helpedKeys || []);
      for (const ent of vn.entities || []) {
        // Hide interior cutaway rooms (0..8) overlapping exterior Manor roof (18/19)
        if (ent.category === 50 && ent.entityId >= 0 && ent.entityId <= 8) continue;
        // Skip static player-spawn marker (cat 42, entityId === -1) so we don't draw a duplicate clone of our Farmer!
        if (ent.category === 42 && ent.entityId === -1) continue;
        const sx = ent.x + ox;
        const sy = ent.y + oy;
        if (sx < -140 || sy < -140 || sx > viewW + 140 || sy > viewH + 140) continue;

        if (ent.category === 49) {
          if (soilEntry) drawBSpriteBlockFrame(wctx, soilEntry.sprite, soilEntry.moduleImages, 0, sx, sy, 0);
          if (ent.cropBlock >= 0) {
            const helped = helpedSet.has(ent.opaqueKey);
            drawList.push({
              sortY: ent.y + 1,
              draw: () => {
                const ce = getSpriteBlock(ent.cropBlock, 0);
                if (ce) drawBSpriteBlockFrame(wctx, ce.sprite, ce.moduleImages, helped ? 1 : 2, sx, sy, 0);
                if (!helped && vn.helpsToday < vn.maxHelps) {
                  drawText(wctx, '★', sx + 10, sy - 10, { size: 9, color: '#9cff7b', bold: true });
                }
              },
            });
          }
          continue;
        }
        drawList.push({
          sortY: ent.y + (ent.layer >= 14 ? 40 : ent.category === 48 ? 4 : 2),
          draw: () => {
            const entry = getSpriteBlock(ent.block, ent.paletteIndex);
            if (!entry) return;
            if (ent.category === 42 && ent.entityId >= 0) {
              // Neighbor host character stands calmly in idle animation (anim 2 — e.java:1113), never wobbling!
              const idleAnim = entry.sprite.animations?.length > 2 ? 2 : 0;
              if (entry.sprite.animations?.length > 0) {
                drawBSpriteBlockAnim(wctx, entry.sprite, entry.moduleImages, idleAnim, Math.floor(animTick * 0.35), sx, sy, 0);
              } else {
                drawBSpriteBlockFrame(wctx, entry.sprite, entry.moduleImages, 0, sx, sy, 0);
              }
            } else if (ent.useAnim && entry.sprite.animations?.length > 0) {
              drawBSpriteBlockAnim(wctx, entry.sprite, entry.moduleImages, 0, animTick, sx, sy, 0);
            } else {
              drawBSpriteBlockFrame(wctx, entry.sprite, entry.moduleImages, ent.frame, sx, sy, 0);
            }
            if ((ent.category === 52 || ent.category === 54) && !helpedSet.has(ent.opaqueKey) && vn.helpsToday < vn.maxHelps) {
              drawText(wctx, '★', sx + 10, sy - 16, { size: 9, color: '#9cff7b', bold: true });
            }
          },
        });
      }
    } else {
      // --- PLAYER'S OWN FARM (pack10[4]) ---
      const clearedSet = new Set(s.clearedDebris || []);
      // Pass 1: Original tilled soil plots (/5 block 6)
      for (const plot of s.plots.values()) {
        const wx = plot.worldX ?? (plot.col * tw + (tw >> 1));
        const wy = plot.worldY ?? (plot.row * th + (th >> 1));
        const sx = wx + ox;
        const sy = wy + oy;
        if (sx < -80 || sy < -60 || sx > viewW + 80 || sy > viewH + 60) continue;
        if (soilEntry) drawBSpriteBlockFrame(wctx, soilEntry.sprite, soilEntry.moduleImages, 0, sx, sy, 0);
      }

      // Pass 1b: Visual boundary & clickable Lock signposts on unowned expansion parcels
      const ownedSet = new Set(s.unlockedZones || ['center']);
      const lockIconSp = getUiSpriteBlock(20);
      for (const z of LAND_ZONES) {
        if (ownedSet.has(z.id)) continue;
        const zx = z.minX + ox;
        const zy = z.minY + oy;
        const zw = z.maxX - z.minX;
        const zh = z.maxY - z.minY;
        if (zx + zw < -20 || zy + zh < -20 || zx > viewW + 20 || zy > viewH + 20) continue;
        wctx.fillStyle = 'rgba(18, 42, 12, 0.14)';
        wctx.fillRect(zx, zy, zw, zh);
        wctx.save();
        wctx.strokeStyle = 'rgba(255, 224, 110, 0.78)';
        wctx.lineWidth = 1.5;
        wctx.setLineDash([5, 4]);
        wctx.strokeRect(zx + 1, zy + 1, zw - 2, zh - 2);
        wctx.restore();
        const badgeAnchor = {
          west: [740, 495],
          south: [1044, 772],
          east: [1382, 495],
          far_west: [740, 705],
          far_east: [1382, 705],
        }[z.id] || [z.signX, z.signY];
        const bx = badgeAnchor[0] + ox;
        const by = badgeAnchor[1] + oy;
        if (bx >= -40 && by >= -20 && bx <= viewW + 40 && by <= viewH + 20) {
          drawList.push({
            sortY: badgeAnchor[1] + 10,
            draw: () => {
              drawRoundedPill(wctx, bx - 38, by - 13, 76, 22, 6, 'rgba(68, 37, 13, 0.92)', '#ffd84d', 1.2);
              if (lockIconSp) drawBSpriteBlockFrameScaled(wctx, lockIconSp.sprite, lockIconSp.moduleImages, 123, bx - 25, by - 2, 13, 15);
              drawText(wctx, `MUA ĐẤT`, bx + 7, by - 4, { align: 'center', size: 6, color: '#fff7c2', bold: true });
              drawText(wctx, `${z.cost} Xu`, bx + 7, by + 5, { align: 'center', size: 6, color: '#9cff7b', bold: true });
            },
          });
        }
      }

      // Pass 2a: World structures, props, fences, bushes (skip interior Manor cutaways 0..8 overlapping exterior Manor!)
      for (const ent of sourceWorld?.farmEntities || []) {
        if (ent.category === 49 || ent.category === 54 || ent.category === 52) continue;
        if (ent.category === 42 && ent.entityId === -1) continue;
        if (ent.category === 48 && clearedSet.has(ent.opaqueKey)) continue;
        if (ent.category === 50 && ent.entityId >= 0 && ent.entityId <= 8) continue;
        const sx = ent.x + ox;
        const sy = ent.y + oy;
        if (sx < -140 || sy < -140 || sx > viewW + 140 || sy > viewH + 140) continue;
        drawList.push({
          sortY: ent.y + (ent.layer >= 14 ? 40 : ent.category === 48 ? 4 : ent.category === 50 ? 6 : 2),
          draw: () => {
            const entry = getSpriteBlock(ent.block, ent.paletteIndex);
            if (!entry) return;
            if (ent.useAnim && entry.sprite.animations?.length > 0) {
              drawBSpriteBlockAnim(wctx, entry.sprite, entry.moduleImages, 0, animTick, sx, sy, 0);
            } else {
              drawBSpriteBlockFrame(wctx, entry.sprite, entry.moduleImages, ent.frame, sx, sy, 0);
            }
            // Only show clean Gameloft alert bubbles when Kitchen dish, Feed Mill batch, or Mailbox has unread mail
            if (ent.category === 50 && ent.entityId === 18 && (s.kitchenQueue || []).some(j => j.ready)) {
              const ui1 = getUiSpriteBlock(1);
              if (ui1) drawBSpriteBlockFrame(wctx, ui1.sprite, ui1.moduleImages, 34, sx, sy - 42, 0);
            } else if (ent.category === 50 && ent.entityId === 14 && (s.millQueue || []).some(j => j.ready)) {
              const ui1 = getUiSpriteBlock(1);
              if (ui1) drawBSpriteBlockFrame(wctx, ui1.sprite, ui1.moduleImages, 34, sx, sy - 38, 0);
            } else if (ent.category === 50 && ent.entityId === 15 && (s.neighborMail || []).some(m => !m.claimed)) {
              const ui1 = getUiSpriteBlock(1);
              if (ui1) drawBSpriteBlockFrame(wctx, ui1.sprite, ui1.moduleImages, 8, sx, sy - 24, 0);
            }
          },
        });
      }

      // Pass 2b: Player-placed Decorations (/9[4])
      for (const dec of s.placedDecor || []) {
        const sx = dec.worldX + ox;
        const sy = dec.worldY + oy;
        if (sx < -80 || sy < -80 || sx > viewW + 80 || sy > viewH + 80) continue;
        drawList.push({
          sortY: dec.worldY + 2,
          draw: () => {
            const entry = getSpriteBlock(dec.worldBlock, dec.paletteIndex || 0);
            if (entry) drawBSpriteBlockFrame(wctx, entry.sprite, entry.moduleImages, dec.frame || 0, sx, sy, 0);
          },
        });
      }

      // Pass 2c: Live Fruit Trees (cat 52)
      for (const tree of s.fruitTrees || []) {
        const sx = tree.worldX + ox;
        const sy = tree.worldY + oy;
        if (sx < -100 || sy < -100 || sx > viewW + 100 || sy > viewH + 100) continue;
        drawList.push({
          sortY: tree.worldY + 2,
          draw: () => {
            const entry = getSpriteBlock(tree.worldBlock, 0);
            if (entry) drawBSpriteBlockFrame(wctx, entry.sprite, entry.moduleImages, tree.ready ? 1 : 0, sx, sy, 0);
            if (tree.ready) drawText(wctx, '★', sx + 10, sy - 22, { size: 9, color: '#ffd84d', bold: true });
          },
        });
      }

      // Pass 2d: Live Growing & Ready Crops (/5[crop.worldBlock])
      for (const plot of s.plots.values()) {
        if (!plot.cropId || plot.stage === 'tilled') continue;
        const wx = plot.worldX ?? (plot.col * tw + (tw >> 1));
        const wy = plot.worldY ?? (plot.row * th + (th >> 1));
        const sx = wx + ox;
        const sy = wy + oy;
        if (sx < -80 || sy < -80 || sx > viewW + 80 || sy > viewH + 80) continue;
        const crop = s.catalog?.crops?.find(c => c.id === plot.cropId);
        const cropBlock = crop?.worldBlock ?? 76;
        const ratio = plot.growMs > 0 ? (plot.progressMs / plot.growMs) : 1;
        const frameIdx = plot.stage === 'ready' ? 2 : (ratio >= 0.5 ? 1 : 0);
        drawList.push({
          sortY: wy + 1,
          draw: () => {
            const entry = getSpriteBlock(cropBlock, 0);
            if (entry) drawBSpriteBlockFrame(wctx, entry.sprite, entry.moduleImages, frameIdx, sx, sy, 0);
            if (plot.stage === 'ready') drawText(wctx, '★', sx + 14, sy - 12, { size: 9, color: '#ffd84d', bold: true });
          },
        });
      }

      // Pass 2e: Live Roaming Farm Animals (/5[animal.worldBlock] with exact paletteIndex & walking anim!)
      for (const a of s.animals) {
        const wx = a.worldX ?? (a.col * tw + (tw >> 1));
        const wy = a.worldY ?? (a.row * th + (th >> 1));
        const sx = wx + ox;
        const sy = wy + oy;
        if (sx < -80 || sy < -80 || sx > viewW + 80 || sy > viewH + 80) continue;
        const spec = (s.catalog?.allAnimals || s.catalog?.animals)?.find(item => item.id === a.animalId);
        const animalBlock = a.worldBlock ?? spec?.worldBlock ?? 8;
        const animalPal = a.paletteIndex ?? spec?.paletteIndex ?? 0;
        const idleFrame = a.idleFrame ?? spec?.idleFrame ?? 0;
        drawList.push({
          sortY: wy + 2,
          draw: () => {
            const entry = getSpriteBlock(animalBlock, animalPal);
            if (entry) {
              const flip = a.hFlip ? 1 : 0;
              if (entry.sprite.animations?.length > 0) {
                const animId = a.walking && entry.sprite.animations.length > 3 ? 3 : 0;
                drawBSpriteBlockAnim(wctx, entry.sprite, entry.moduleImages, animId, animTick + a.uid * 5, sx, sy, flip);
              } else {
                drawBSpriteBlockFrame(wctx, entry.sprite, entry.moduleImages, idleFrame, sx, sy, flip);
              }
            }
            if (a.ready) drawText(wctx, '★', sx + 12, sy - 18, { size: 9, color: '#ffd84d', bold: true });
            else if (!a.fed) drawText(wctx, '!', sx + 12, sy - 18, { size: 9, color: '#ff6b6b', bold: true });
          },
        });
      }
    }

    // Live Player Farmer (/5 block 2 — 80ms/tick authentic animation cadence & centered hFlip!)
    if (s.farmer) {
      const fx = s.farmer.x + ox;
      const fy = s.farmer.y + oy;
      drawList.push({
        sortY: s.farmer.y,
        draw: () => {
          const entry = getSpriteBlock(2, 0);
          if (!entry) return;
          const flipFlag = s.farmer.hFlip ? 1 : 0;
          const pivotAdjust = flipFlag ? 5 : 0; // Compensate asymmetric bounds.x=-11,w=27 so flip stays centered
          const fTick = s.farmer.state === 'idle' ? Math.floor(animTick * 0.45) : animTick;
          drawBSpriteBlockAnim(wctx, entry.sprite, entry.moduleImages, s.farmer.anim, fTick, fx + pivotAdjust, fy, flipFlag);
        },
      });
    }

    drawList.sort((a, b) => a.sortY - b.sortY);
    for (const item of drawList) item.draw();

    // Floating feedback popups
    for (const p of s.popups || []) {
      drawText(wctx, p.text, p.x + ox, p.y + oy, { align: 'center', size: 9, color: p.color || '#ffd84d', bold: true });
    }

    // Authentic /5[14] frame 16 (72x36 4x4 plot cursor — e.java:573) when plowing or placing
    if (!vn && (s.activeTool === 'plow' || s.activeTool === 'place')) {
      const curSnapped = snapPlotToIso4x4(s.cursorCol * tw + (tw >> 1), s.cursorRow * th + (th >> 1));
      const cursorSpr = getSpriteBlock(14, 0);
      if (cursorSpr) {
        drawBSpriteBlockFrame(wctx, cursorSpr.sprite, cursorSpr.moduleImages, 16, curSnapped.wx + ox, curSnapped.wy + oy, 0);
      }
    }
  });

  if (worldCanvas && wctx !== ctx) {
    ctx.imageSmoothingEnabled = false;
    ctx.drawImage(worldCanvas, 0, 0, viewW, viewH, 0, 0, SCREEN_W, SCREEN_H);
  }

  // --- 1:1 ORIGINAL GAMELOFT /6[1] HUD (CLEAN XP BAR, NO STRAY SLIVERS, NO '0' PAUSE BADGE) ---
  const xpNeed = xpForNextLevel(s);
  const xpRatio = Math.max(0, Math.min(1, s.xp / Math.max(1, xpNeed)));
  // Authentic recessed XP bar behind the top-left Star icon (x=28..171, y=7..21)
  drawRoundedPill(ctx, 29, 7, 143, 15, 7, 'rgba(20, 44, 16, 0.85)', '#f7f7f6', 1.5);
  const xpFillW = Math.round(139 * xpRatio);
  if (xpFillW > 0) {
    drawRoundedPill(ctx, 31, 9, Math.max(6, xpFillW), 11, 5, '#48a4ff', null);
  }

  // Clean dark-green Cash pill behind the Cash amount (x=134..188, y=34..48)
  drawRoundedPill(ctx, 134, 34, 54, 14, 7, '#1d5622', '#f7f7f5', 1.2);

  const hudWidgets = getUIScreen(1);
  const carouselOpen = !!s.seedCarousel && !vn;
  drawOriginalUIScreen(ctx, hudWidgets, getAnySpriteBlock, {
    filterWidget: (w) => {
      if (w.type !== 205) return false;
      if (w.index === 23 || w.index === 18 || w.index === 41) return false;
      if (w.spriteId === 41 && w.frameIndex === 3) return false;
      if (w.spriteId === 20 && w.frameIndex === 183) return false;
      if (w.y < 60 && w.spriteId !== 31) return true;
      // When Seed Carousel is open on an empty tilled plot, hide bottom softkeys (a.java:3816)
      if (carouselOpen) return false;
      if (vn && w.index === 67) return false;
      return w.index === 52 || w.index === 63 || w.index === 67;
    },
  });

  // Clean Pause || button at (207, 8) skipping baked notification '0' circle (module 190)
  const spr20Hud = getUiSpriteBlock(20);
  if (spr20Hud) {
    drawBSpriteBlockFrame(ctx, spr20Hud.sprite, spr20Hud.moduleImages, 102, 207, 8, 0, PAUSE_BADGE_SKIP);
  }

  // --- 1:1 ON-WORLD SEED CAROUSEL (/6[1] widgets 73, 75..78, 82 — a.java:3804-3936) ---
  if (carouselOpen) {
    const fieldCrops = (s.catalog?.crops || []).filter(c => c.id !== 3000 && !c.isTree);
    const count = fieldCrops.length;
    if (count > 0) {
      const idx = ((s.seedCarousel.index % count) + count) % count;
      const prevIdx = (idx - 1 + count) % count;
      const nextIdx = (idx + 1) % count;

      // Widget [75]: Original Gameloft curved carousel tray (x=45, y=260, spr=20, frm=105)
      const spr20 = getUiSpriteBlock(20);
      if (spr20) drawBSpriteBlockFrame(ctx, spr20.sprite, spr20.moduleImages, 105, 45, 260, 0);

      // Clean blue navigation arrows (no J2ME '4'/'6' keypad digits)
      drawCleanArrowButton(ctx, 56, 283, 'left');
      drawCleanArrowButton(ctx, 184, 283, 'right');

      // Widgets [76], [77], [78]: Left (80,281), Center (124,281), Right (170,282) crop seed icons
      const slots = [
        { crop: fieldCrops[prevIdx], x: 82, y: 281 },
        { crop: fieldCrops[idx], x: 124, y: 281 },
        { crop: fieldCrops[nextIdx], x: 166, y: 282 },
      ];
      const spr9 = getUiSpriteBlock(9);
      for (const sl of slots) {
        const unlocked = s.level >= (sl.crop.unlockLevel || 1);
        if (unlocked && spr9) {
          const seedFrm = Math.max(0, Math.min(spr9.sprite.frames.length - 1, (sl.crop.iconFrame ?? 12) - 12));
          drawBSpriteBlockFrameScaled(ctx, spr9.sprite, spr9.moduleImages, seedFrm, sl.x, sl.y, 26, 26);
        } else if (spr20) {
          drawBSpriteBlockFrameScaled(ctx, spr20.sprite, spr20.moduleImages, 123, sl.x, sl.y, 22, 22);
        }
      }

      // Widget [82]: Center selection highlight ring (x=123, y=283, spr=20, frm=174)
      if (spr20) drawBSpriteBlockFrame(ctx, spr20.sprite, spr20.moduleImages, 174, 123, 283, 0);

      // Widget [73]: Back / Cancel button (x=211, y=291, spr=12, frm=0)
      const spr12 = getUiSpriteBlock(12);
      if (spr12) drawBSpriteBlockFrame(ctx, spr12.sprite, spr12.moduleImages, 0, 211, 291, 0);

      // Selected crop name & cost pill right above the carousel tray
      const cur = fieldCrops[idx];
      const locked = s.level < (cur.unlockLevel || 1);
      ctx.fillStyle = 'rgba(59, 34, 13, 0.9)';
      ctx.fillRect(36, 238, 168, 18);
      ctx.strokeStyle = '#e8c47a';
      ctx.strokeRect(36.5, 238.5, 167, 17);
      const label = locked
        ? `${cur.name} (Mở ở Cấp ${cur.unlockLevel})`
        : `${cur.name} · ${cur.buyPrice} Xu · ${cur.growSec}s`;
      drawText(ctx, label, 120, 250, { align: 'center', size: 8, color: locked ? '#ffb09c' : '#fff7c2', bold: true });
    }
  }

  const drawHudNum = (val, x, y, color, shadow = '#2b1505') => {
    drawText(ctx, val, x + 1, y + 1, { align: 'center', size: 8, color: shadow, bold: true });
    drawText(ctx, val, x, y, { align: 'center', size: 8, color, bold: true });
  };
  drawHudNum(`${s.level}`, 25, 19, '#fff8c8');
  drawHudNum(`${s.xp}/${xpNeed} XP`, 103, 17, '#ffffff');
  // Crisp dark-brown numbers on Coins pill & high-contrast green Cash pill
  drawText(ctx, `${s.coins}`, 57, 44, { align: 'center', size: 8, color: '#4a2508', bold: true });
  drawHudNum(`${s.cash}`, 161, 44, '#eaffed');

  ctx.fillStyle = 'rgba(46, 26, 9, 0.82)';
  ctx.fillRect(10, 51, 56, 13);
  ctx.strokeStyle = '#e8c47a';
  ctx.strokeRect(10.5, 51.5, 55, 12);
  drawText(ctx, `⚡${s.energy}/${s.maxEnergy}`, 14, 60, { size: 8, color: '#ffe97d', bold: true });

  // Compact zoom badge at top-right below Pause icon
  ctx.fillStyle = 'rgba(46, 26, 9, 0.72)';
  ctx.fillRect(202, 42, 34, 14);
  ctx.strokeStyle = '#d4a259';
  ctx.strokeRect(202.5, 42.5, 33, 13);
  drawText(ctx, `${Math.round(zoom * 100)}%`, 219, 52, { align: 'center', size: 7, color: '#fff4cc', bold: true });

  // Visiting Neighbor top banner + Return Home button
  if (vn) {
    ctx.fillStyle = 'rgba(46, 26, 9, 0.9)';
    ctx.fillRect(24, 64, SCREEN_W - 48, 18);
    ctx.strokeStyle = '#e8c47a';
    ctx.strokeRect(24.5, 64.5, SCREEN_W - 49, 17);
    drawText(ctx, `Trang trại ${vn.name} · Giúp ${vn.helpsToday}/${vn.maxHelps}`, SCREEN_W / 2, 76, { align: 'center', size: 8, color: '#fff7c2', bold: true });

    ctx.fillStyle = 'rgba(139, 68, 22, 0.94)';
    ctx.fillRect(156, SCREEN_H - 36, 78, 22);
    ctx.strokeStyle = '#ffd84d';
    ctx.strokeRect(156.5, SCREEN_H - 35.5, 77, 21);
    drawText(ctx, 'VỀ NHÀ', 195, SCREEN_H - 22, { align: 'center', size: 9, color: '#fff7d1', bold: true });
  } else if (s.activeTool !== 'auto') {
    const cropSpec = s.selectedCropId ? s.catalog?.crops?.find(c => c.id === s.selectedCropId) : null;
    const toolNames = {
      plow: 'Cuốc đất: Chạm bãi cỏ để cày (Esc hủy)',
      clear: 'Dọn cỏ/đá: Chạm bụi cây/đá (Esc hủy)',
      place: `Đặt ${s.placementItem?.spec?.name || ''}: Chạm bãi cỏ (Esc hủy)`,
      plant: `Gieo ${cropSpec?.name || 'hạt giống'}: Chạm ô đất trống (Esc hủy)`,
    };
    ctx.fillStyle = 'rgba(59, 34, 13, 0.88)';
    ctx.fillRect(12, 64, SCREEN_W - 24, 16);
    ctx.strokeStyle = '#e8c47a';
    ctx.strokeRect(12.5, 64.5, SCREEN_W - 25, 15);
    drawText(ctx, toolNames[s.activeTool] || '', SCREEN_W / 2, 75, { align: 'center', size: 8, color: '#fff4c2', bold: true });
  }

  if (s.toast && !carouselOpen) {
    ctx.fillStyle = 'rgba(59, 34, 13, 0.9)';
    ctx.fillRect(8, SCREEN_H - 56, SCREEN_W - 16, 16);
    ctx.strokeStyle = '#e8c47a';
    ctx.strokeRect(8.5, SCREEN_H - 55.5, SCREEN_W - 17, 15);
    drawText(ctx, s.toast, SCREEN_W / 2, SCREEN_H - 45, { align: 'center', size: 8, color: '#fff7c2', maxWidth: SCREEN_W - 22 });
  }
}

// --- SHARED ORIGINAL /6 + /7 WOOD & PARCHMENT WINDOW SHELL ---
function drawOriginalWindowShell(ctx, screenId, title, subtitle, { showConfirm = true } = {}) {
  ctx.fillStyle = '#3c2512';
  ctx.fillRect(0, 0, SCREEN_W, SCREEN_H);
  // Draw /7[22] parchment window frame & /7[33] header ribbon
  const screenWidgets = getUIScreen(screenId);
  drawOriginalUIScreen(ctx, screenWidgets, getAnySpriteBlock, {
    filterWidget: (w) => w.type === 205 && (w.spriteId === 22 || w.spriteId === 33),
  });
  // Top wooden title bar strictly inside x=16..224
  ctx.fillStyle = '#5c3314';
  ctx.fillRect(16, 6, 208, 28);
  ctx.strokeStyle = '#d4a259';
  ctx.strokeRect(16.5, 6.5, 207, 27);
  drawText(ctx, title, SCREEN_W / 2, 18, { align: 'center', size: 9, color: '#fff7d1', bold: true });
  drawText(ctx, subtitle, SCREEN_W / 2, 30, { align: 'center', size: 7, color: '#ffe49e', maxWidth: 200 });

  // Authentic /7[12] softkey buttons: Confirm (✔) at bottom-left, Back (⬅) at bottom-right
  const softkeys = getUiSpriteBlock(12);
  if (softkeys) {
    if (showConfirm) drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 2, 4, 289, 0);
    drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 0, 208, 289, 0);
  }
}

function getShopItems(s) {
  if (s.shopTab === 'crops') return s.catalog.crops.filter(c => c.id !== 3000 && !c.isTree);
  if (s.shopTab === 'trees') return s.catalog.crops.filter(c => c.isTree);
  if (s.shopTab === 'animals') return s.catalog.animals;
  if (s.shopTab === 'land') return LAND_ZONES;
  return s.catalog.decorations || [];
}

// --- SCREEN A: 1:1 ORIGINAL GAMELOFT /6[2] SHOP (5 TABS WITH MATCHING ICONS + 2x2 CARDS!) ---
function renderShop(ctx) {
  const s = app.session;
  ctx.fillStyle = '#3c2512';
  ctx.fillRect(0, 0, SCREEN_W, SCREEN_H);

  // Render authentic /6[2] Shop backdrop (without raw 9-slice sliver tabs or bare pill endcaps)
  const w2 = getUIScreen(2);
  drawOriginalUIScreen(ctx, w2, getAnySpriteBlock, {
    filterWidget: (w) => {
      if (w.type !== 205) return false;
      if (w.spriteId === 22 || w.spriteId === 33) return true;
      return false;
    },
  });

  // Clean Coins & Cash top pills (matching /6[2] x=30..114, x=126..210)
  drawRoundedPill(ctx, 29, 25, 86, 18, 8, '#f7f7f5', '#c79b55', 1);
  drawRoundedPill(ctx, 125, 25, 86, 18, 8, '#f7f7f5', '#c79b55', 1);
  const spr20 = getUiSpriteBlock(20);
  if (spr20) {
    drawBSpriteBlockFrame(ctx, spr20.sprite, spr20.moduleImages, 104, 24, 25, 0);
    drawBSpriteBlockFrame(ctx, spr20.sprite, spr20.moduleImages, 103, 118, 24, 0);
  }
  drawText(ctx, `${s.coins}`, 74, 37, { align: 'center', size: 8, color: '#4a2508', bold: true });
  drawText(ctx, `${s.cash}`, 170, 37, { align: 'center', size: 8, color: '#1c6b1c', bold: true });

  // 5 matching category tabs evenly inside x=24..216
  const tabDefs = [
    { id: 'crops', block: 4, frame: 0 },
    { id: 'trees', block: 23, frame: 0 },
    { id: 'animals', block: 4, frame: 1 },
    { id: 'land', block: 4, frame: 2 },
    { id: 'decor', block: 4, frame: 3 },
  ];
  tabDefs.forEach((td, i) => {
    const tx = 24 + i * 39;
    const active = s.shopTab === td.id;
    drawRoundedPill(ctx, tx, 49, 36, 30, 5, active ? '#ffffff' : '#f4dfa8', active ? '#ffd84d' : '#9c6e3b', active ? 2 : 1);
    const sp = getUiSpriteBlock(td.block);
    if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, td.frame, tx + 18, 64, 24, 24);
  });

  // 4 live items mapped 1:1 onto /6[2]'s exact 2x2 card coordinates
  const list = getShopItems(s);
  const perPage = 4;
  const page = Math.floor(s.shopCursor / perPage);
  const totalPages = Math.max(1, Math.ceil(list.length / perPage));
  const start = page * perPage;
  const cardCoords = [
    { x: 31, y: 85, ix: 75, iy: 125, px: 75, py: 167 },
    { x: 126, y: 85, ix: 170, iy: 125, px: 170, py: 167 },
    { x: 31, y: 182, ix: 75, iy: 222, px: 75, py: 264 },
    { x: 126, y: 182, ix: 170, iy: 222, px: 170, py: 264 },
  ];

  for (let i = 0; i < perPage && start + i < list.length; i += 1) {
    const idx = start + i;
    const item = list[idx];
    const c = cardCoords[i];
    const selected = idx === s.shopCursor;
    const owned = s.shopTab === 'land' && (s.unlockedZones || []).includes(item.id);
    const locked = !owned && ((item.unlockLevel || 1) > s.level);
    const price = s.shopTab === 'land' ? item.cost : item.buyPrice;

    ctx.fillStyle = selected ? '#fff1b8' : '#f7e6c0';
    ctx.fillRect(c.x, c.y, 88, 92);
    ctx.strokeStyle = selected ? '#c46210' : '#9c6e3b';
    ctx.lineWidth = selected ? 2 : 1;
    ctx.strokeRect(c.x + 0.5, c.y + 0.5, 87, 91);
    ctx.lineWidth = 1;
    // Price pill strip at bottom of card
    ctx.fillStyle = '#e5c687';
    ctx.fillRect(c.x + 6, c.y + 72, 76, 15);
    ctx.strokeStyle = '#9c6e3b';
    ctx.strokeRect(c.x + 6.5, c.y + 72.5, 75, 14);

    if (s.shopTab === 'crops') {
      const ui9 = getAnySpriteBlock(item.iconBlock ?? 9);
      if (ui9 && item.iconFrame >= 0 && item.iconFrame < ui9.sprite.frames.length) {
        drawBSpriteBlockFrameScaled(ctx, ui9.sprite, ui9.moduleImages, item.iconFrame, c.ix, c.iy, 38, 34);
      }
    } else if (s.shopTab === 'trees') {
      const treeSp = getAnySpriteBlock(item.iconBlock) || getSpriteBlock(item.worldBlock, 0);
      if (treeSp) {
        const frm = Math.max(0, Math.min(treeSp.sprite.frames.length - 1, item.iconFrame ?? 2));
        drawBSpriteBlockFrameScaled(ctx, treeSp.sprite, treeSp.moduleImages, frm, c.ix, c.iy, 42, 38);
      }
    } else if (s.shopTab === 'animals' || s.shopTab === 'decor') {
      const sp = getSpriteBlock(item.worldBlock, item.paletteIndex || 0);
      if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, item.idleFrame ?? item.frame ?? 0, c.ix, c.iy, 40, 34);
    } else {
      const sp6 = getSpriteBlock(6, 0);
      if (sp6) drawBSpriteBlockFrameScaled(ctx, sp6.sprite, sp6.moduleImages, 0, c.ix, c.iy, 44, 30);
    }

    drawText(ctx, item.name, c.x + 44, c.y + 13, { align: 'center', size: 7, color: '#3a1f08', bold: true, maxWidth: 82 });
    const rightTxt = owned ? 'ĐÃ MUA' : locked ? `Lv.${item.unlockLevel}` : `${price} Xu`;
    drawText(ctx, rightTxt, c.px, c.py, { align: 'center', size: 7, color: owned ? '#1c6b1c' : locked ? '#7a5c3d' : '#4a2508', bold: true, maxWidth: 72 });
  }

  // Bottom softkeys (/7[12]) & Land/Page bar
  const softkeys = getUiSpriteBlock(12);
  if (softkeys) {
    drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 2, 4, 289, 0);
    drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 0, 208, 289, 0);
  }
  drawText(ctx, `◀ Trang ${page + 1}/${totalPages} ▶`, SCREEN_W / 2, 306, { align: 'center', size: 8, color: '#4a2508', bold: true });
}

function getKitchenRecipes(s) {
  const all = s.catalog?.recipes || [];
  const cat = s.kitchenCategory || 'all';
  if (cat === 'bakery') return all.filter(r => r.category === 'bakery');
  if (cat === 'cooking') return all.filter(r => r.category === 'cooking');
  return all;
}

// --- SCREEN B: 1:1 ORIGINAL GAMELOFT /6[3] KITCHEN & BAKERY (ALL / BAKERY / COOKING + ACTIVE STOVES) ---
function renderKitchen(ctx) {
  const s = app.session;
  const tab = s.kitchenTab || 'recipes';
  const cat = s.kitchenCategory || 'all';
  ctx.fillStyle = '#3c2512';
  ctx.fillRect(0, 0, SCREEN_W, SCREEN_H);

  // Render authentic /6[3] Kitchen backdrop without stray 9-slice sliver tabs
  const w3 = getUIScreen(3);
  drawOriginalUIScreen(ctx, w3, getAnySpriteBlock, {
    filterWidget: (w) => {
      if (w.type !== 205) return false;
      return w.spriteId === 22 || w.spriteId === 33;
    },
  });

  // Clean header ribbon for title & active stove status
  ctx.fillStyle = '#5c3314';
  ctx.fillRect(16, 6, 208, 34);
  ctx.strokeStyle = '#d4a259';
  ctx.strokeRect(16.5, 6.5, 207, 33);
  drawText(ctx, `NHÀ BẾP & LÒ BÁNH · Bếp ${s.kitchenQueue?.length || 0}/4`, SCREEN_W / 2, 19, { align: 'center', size: 8, color: '#fff7d1', bold: true });
  const readyJob = (s.kitchenQueue || []).find(j => j.ready);
  const cookingJob = (s.kitchenQueue || []).find(j => !j.ready);
  const stoveHint = readyJob
    ? `Xong: ${readyJob.name} (Chạm đây nhận!)`
    : cookingJob
      ? `Đang nướng: ${cookingJob.name} (${Math.ceil((cookingJob.cookMs - cookingJob.progressMs) / 1000)}s)`
      : 'Chạm thẻ bên dưới để làm bánh / nấu ăn';
  drawText(ctx, stoveHint, SCREEN_W / 2, 33, { align: 'center', size: 7, color: readyJob ? '#9cff7b' : '#ffe49e', bold: true });

  // Clean 4 sub-tabs: Tất cả, Làm bánh, Món nấu, Bếp (x/4)
  const kTabs = [
    { id: 'all', label: 'Tất cả', active: tab === 'recipes' && cat === 'all' },
    { id: 'bakery', label: 'Làm bánh', active: tab === 'recipes' && cat === 'bakery' },
    { id: 'cooking', label: 'Món nấu', active: tab === 'recipes' && cat === 'cooking' },
    { id: 'stoves', label: `Bếp (${s.kitchenQueue?.length || 0}/4)`, active: tab === 'stoves' },
  ];
  kTabs.forEach((t, i) => {
    const tx = 18 + i * 52;
    drawRoundedPill(ctx, tx, 46, 48, 22, 5, t.active ? '#8c4b18' : '#f4dfa8', t.active ? '#ffd84d' : '#9c6e3b', t.active ? 1.5 : 1);
    drawText(ctx, t.label, tx + 24, 60, { align: 'center', size: 6.5, color: t.active ? '#fff7d1' : '#4a2508', bold: true, maxWidth: 46 });
  });
  // Shortcut button to Feed Mill (Máy xay thức ăn động vật)
  drawRoundedPill(ctx, 18, 72, 204, 15, 4, '#ead19c', '#9c6e3b', 1);
  drawText(ctx, '⚙️ Cần xay thức ăn cho thú? Chạm đây mở MÁY XAY ▶', SCREEN_W / 2, 82, { align: 'center', size: 6.5, color: '#5c3314', bold: true });

  if (tab === 'stoves') {
    const slots = s.kitchenQueue || [];
    for (let i = 0; i < 4; i += 1) {
      const col = i % 2;
      const row = Math.floor(i / 2);
      const cx = 24 + col * 98;
      const cy = 92 + row * 90;
      const job = slots[i];
      ctx.fillStyle = job?.ready ? '#fff1b8' : '#f7e6c0';
      ctx.fillRect(cx, cy, 92, 82);
      ctx.strokeStyle = job?.ready ? '#2e7d32' : '#9c6e3b';
      ctx.lineWidth = job?.ready ? 2 : 1;
      ctx.strokeRect(cx + 0.5, cy + 0.5, 91, 81);
      ctx.lineWidth = 1;
      if (!job) {
        drawText(ctx, `Bếp #${i + 1}`, cx + 46, cy + 28, { align: 'center', size: 8, color: '#7a5c3d', bold: true });
        drawText(ctx, 'Đang trống', cx + 46, cy + 48, { align: 'center', size: 7, color: '#9c6e3b' });
      } else {
        drawText(ctx, job.name, cx + 46, cy + 13, { align: 'center', size: 7, color: '#3a1f08', bold: true, maxWidth: 84 });
        const dishSp = getAnySpriteBlock(job.iconBlock ?? 50);
        if (dishSp) drawBSpriteBlockFrameScaled(ctx, dishSp.sprite, dishSp.moduleImages, job.iconFrame ?? 0, cx + 46, cy + 36, 30, 26);
        ctx.fillStyle = job.ready ? '#2e7d32' : '#d6be8a';
        ctx.fillRect(cx + 8, cy + 58, 76, 17);
        const remain = Math.max(0, Math.ceil((job.cookMs - job.progressMs) / 1000));
        drawText(ctx, job.ready ? 'NHẬN MÓN' : `Còn ${remain}s`, cx + 46, cy + 69, {
          align: 'center', size: 7, color: job.ready ? '#ffffff' : '#4a2508', bold: true,
        });
      }
    }
    const softkeys = getUiSpriteBlock(12);
    if (softkeys) {
      drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 2, 4, 289, 0);
      drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 0, 208, 289, 0);
    }
    drawText(ctx, 'Chạm món xong để thu vào Kho', SCREEN_W / 2, 306, { align: 'center', size: 7, color: '#4a2508', bold: true });
    return;
  }

  // 6 live recipes per page mapped 1:1 onto /6[3]'s 3x2 card coordinates (x = 20, 88, 155; y = 92, 182)
  const recipes = getKitchenRecipes(s);
  const perPage = 6;
  const cursor = Math.min(s.panelCursor, Math.max(0, recipes.length - 1));
  const page = Math.floor(cursor / perPage);
  const totalPages = Math.max(1, Math.ceil(recipes.length / perPage));
  const start = page * perPage;
  const colsX = [20, 88, 155];
  const rowsY = [92, 182];

  for (let i = 0; i < perPage && start + i < recipes.length; i += 1) {
    const idx = start + i;
    const r = recipes[idx];
    const cx = colsX[i % 3];
    const cy = rowsY[Math.floor(i / 3)];
    const sel = idx === cursor;
    const canCook = s.level >= r.unlockLevel && r.ingredients.every(ing => (s.inventory.get(ing.goodId)?.qty || 0) >= ing.qty);

    ctx.fillStyle = sel ? '#fff1b8' : '#f7e6c0';
    ctx.fillRect(cx, cy, 62, 78);
    ctx.strokeStyle = sel ? '#c46210' : '#9c6e3b';
    ctx.lineWidth = sel ? 2 : 1;
    ctx.strokeRect(cx + 0.5, cy + 0.5, 61, 77);
    ctx.lineWidth = 1;
    drawText(ctx, r.name, cx + 31, cy + 12, { align: 'center', size: 7, color: '#3a1f08', bold: true, maxWidth: 56 });
    const dishSp = getAnySpriteBlock(r.iconBlock ?? 50);
    if (dishSp) {
      drawBSpriteBlockFrameScaled(ctx, dishSp.sprite, dishSp.moduleImages, r.iconFrame ?? 0, cx + 31, cy + 29, 26, 22);
    }
    const ing0 = r.ingredients[0];
    if (ing0) {
      const have = s.inventory.get(ing0.goodId)?.qty || 0;
      const missingOther = r.ingredients.slice(1).some(ig => (s.inventory.get(ig.goodId)?.qty || 0) < ig.qty);
      const ingColor = (have >= ing0.qty && !missingOther) ? '#1c6b1c' : '#9c2c1c';
      drawText(ctx, `${ing0.name} ${have}/${ing0.qty}`, cx + 31, cy + 50, {
        align: 'center', size: 6, color: ingColor, bold: true, maxWidth: 56,
      });
    }
    ctx.fillStyle = canCook ? '#2e7d32' : '#d6be8a';
    ctx.fillRect(cx + 6, cy + 58, 50, 15);
    const st = s.level < r.unlockLevel ? `Lv.${r.unlockLevel}` : canCook ? 'NẤU' : 'Thiếu';
    drawText(ctx, st, cx + 31, cy + 68, { align: 'center', size: 7, color: canCook ? '#ffffff' : '#5c3314', bold: true });
  }

  const softkeys = getUiSpriteBlock(12);
  if (softkeys) {
    drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 2, 4, 289, 0);
    drawBSpriteBlockFrame(ctx, softkeys.sprite, softkeys.moduleImages, 0, 208, 289, 0);
  }
  drawText(ctx, `◀ Trang ${page + 1}/${totalPages} ▶`, SCREEN_W / 2, 306, { align: 'center', size: 8, color: '#4a2508', bold: true });
}

// --- SCREEN B2: 1:1 ORIGINAL GAMELOFT /6[22] + /6[6] FEED MILL (MÁY XAY THỨC ĂN THÚ) ---
function renderFeedMill(ctx) {
  const s = app.session;
  const tab = s.millTab || 'recipes';
  const totalFeed = [...(s.feedStock?.values() || [])].reduce((acc, it) => acc + (it.qty || 0), 0);
  drawOriginalWindowShell(ctx, 22, `MÁY XAY THỨC ĂN · Xay ${s.millQueue?.length || 0}/4`, `Thức ăn trong Tháp chứa: ${totalFeed} phần`);

  const tabs = [
    { id: 'recipes', label: 'CHẾ BIẾN (6)' },
    { id: 'queue', label: `XAY (${s.millQueue?.length || 0}/4)` },
    { id: 'silo', label: `THÁP (${totalFeed})` },
  ];
  tabs.forEach((t, i) => {
    const tx = 18 + i * 69;
    const active = tab === t.id;
    drawRoundedPill(ctx, tx, 38, 65, 17, 5, active ? '#8c4b18' : '#e6ca94', active ? '#ffd84d' : '#8b5a2b', active ? 1.5 : 1);
    drawText(ctx, t.label, tx + 32.5, 49, { align: 'center', size: 6.5, color: active ? '#fff7d1' : '#4a2508', bold: true });
  });

  if (tab === 'queue') {
    const slots = s.millQueue || [];
    for (let i = 0; i < 4; i += 1) {
      const cx = 24 + (i % 2) * 98;
      const cy = 66 + Math.floor(i / 2) * 102;
      const job = slots[i];
      ctx.fillStyle = job?.ready ? '#fff1b8' : '#f7e6c0';
      ctx.fillRect(cx, cy, 92, 92);
      ctx.strokeStyle = job?.ready ? '#2e7d32' : '#9c6e3b';
      ctx.lineWidth = job?.ready ? 2 : 1;
      ctx.strokeRect(cx + 0.5, cy + 0.5, 91, 91);
      ctx.lineWidth = 1;
      if (!job) {
        drawText(ctx, `Cối xay #${i + 1}`, cx + 46, cy + 36, { align: 'center', size: 8, color: '#7a5c3d', bold: true });
        drawText(ctx, 'Đang trống', cx + 46, cy + 54, { align: 'center', size: 7, color: '#9c6e3b' });
      } else {
        drawText(ctx, `${job.name} (+${job.outputQty})`, cx + 46, cy + 14, { align: 'center', size: 6.5, color: '#3a1f08', bold: true, maxWidth: 84 });
        const feedSp = getAnySpriteBlock(job.iconBlock ?? 34);
        if (feedSp) drawBSpriteBlockFrameScaled(ctx, feedSp.sprite, feedSp.moduleImages, job.iconFrame ?? 0, cx + 46, cy + 42, 30, 28);
        ctx.fillStyle = job.ready ? '#2e7d32' : '#d6be8a';
        ctx.fillRect(cx + 8, cy + 68, 76, 17);
        const rem = Math.max(0, Math.ceil((job.millMs - job.progressMs) / 1000));
        drawText(ctx, job.ready ? `NHẬN +${job.outputQty}` : `Còn ${rem}s`, cx + 46, cy + 79, {
          align: 'center', size: 7, color: job.ready ? '#ffffff' : '#4a2508', bold: true,
        });
      }
    }
    drawText(ctx, 'Chạm cối xay hoàn thành để nhận vào Tháp chứa', SCREEN_W / 2, 306, { align: 'center', size: 6.5, color: '#4a2508', bold: true });
    return;
  }

  if (tab === 'silo') {
    const feedItems = [...(s.feedStock?.values() || [])];
    if (feedItems.length === 0) {
      drawText(ctx, 'Tháp chứa đang trống!', SCREEN_W / 2, 130, { align: 'center', size: 9, color: '#7a3f10', bold: true });
      drawText(ctx, 'Chuyển sang tab CHẾ BIẾN để xay nguyên liệu cho thú.', SCREEN_W / 2, 150, { align: 'center', size: 7, color: '#5c3314' });
    } else {
      for (let i = 0; i < Math.min(6, feedItems.length); i += 1) {
        const it = feedItems[i];
        const cx = 20 + (i % 3) * 68;
        const cy = 66 + Math.floor(i / 3) * 98;
        ctx.fillStyle = '#f7e6c0';
        ctx.fillRect(cx, cy, 62, 88);
        ctx.strokeStyle = '#9c6e3b';
        ctx.strokeRect(cx + 0.5, cy + 0.5, 61, 87);
        const sp = getAnySpriteBlock(it.iconBlock ?? 34);
        if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, it.iconFrame ?? 0, cx + 31, cy + 32, 32, 32);
        drawText(ctx, it.name, cx + 31, cy + 60, { align: 'center', size: 6.5, color: '#3a1f08', bold: true, maxWidth: 56 });
        drawText(ctx, `Có: ${it.qty} phần`, cx + 31, cy + 76, { align: 'center', size: 7, color: '#1c6b1c', bold: true });
      }
    }
    drawText(ctx, 'Dùng để cho Bò, Gà, Cừu, Heo, Dê ăn mỗi ngày', SCREEN_W / 2, 306, { align: 'center', size: 6.5, color: '#4a2508', bold: true });
    return;
  }

  // Tab 'recipes': All 6 /9[22] Feed Mill recipes in 3x2 grid
  const recipes = s.catalog?.feedRecipes || [];
  const colsX = [18, 86, 154];
  const rowsY = [64, 174];
  for (let i = 0; i < Math.min(6, recipes.length); i += 1) {
    const r = recipes[i];
    const cx = colsX[i % 3];
    const cy = rowsY[Math.floor(i / 3)];
    const sel = i === s.panelCursor;
    const canMill = s.level >= r.unlockLevel && r.ingredients.every(ing => (s.inventory.get(ing.goodId)?.qty || 0) >= ing.qty);
    const haveStock = s.feedStock?.get(r.outputGoodId)?.qty || 0;

    ctx.fillStyle = sel ? '#fff1b8' : '#f7e6c0';
    ctx.fillRect(cx, cy, 64, 102);
    ctx.strokeStyle = sel ? '#c46210' : '#9c6e3b';
    ctx.lineWidth = sel ? 2 : 1;
    ctx.strokeRect(cx + 0.5, cy + 0.5, 63, 101);
    ctx.lineWidth = 1;
    drawText(ctx, r.name, cx + 32, cy + 11, { align: 'center', size: 6.5, color: '#3a1f08', bold: true, maxWidth: 58 });
    const sp = getAnySpriteBlock(r.iconBlock ?? 34);
    if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, r.iconFrame ?? 0, cx + 32, cy + 31, 26, 26);

    r.ingredients.slice(0, 2).forEach((ing, j) => {
      const have = s.inventory.get(ing.goodId)?.qty || 0;
      const ok = have >= ing.qty;
      drawText(ctx, `${ing.name} ${have}/${ing.qty}`, cx + 32, cy + 54 + j * 10, {
        align: 'center', size: 5.8, color: ok ? '#1c6b1c' : '#9c2c1c', bold: true, maxWidth: 58,
      });
    });
    drawText(ctx, `Kho: ${haveStock}`, cx + 32, cy + 77, { align: 'center', size: 6, color: '#6b3e14', bold: true });
    ctx.fillStyle = canMill ? '#2e7d32' : '#d6be8a';
    ctx.fillRect(cx + 5, cy + 82, 54, 15);
    const lbl = s.level < r.unlockLevel ? `Lv.${r.unlockLevel}` : canMill ? `XAY +${r.outputQty}` : 'Thiếu NL';
    drawText(ctx, lbl, cx + 32, cy + 92, { align: 'center', size: 6.5, color: canMill ? '#ffffff' : '#5c3314', bold: true });
  }
  drawText(ctx, 'Chế biến Lúa mì, Cà chua, Bắp thành Thức ăn thú', SCREEN_W / 2, 306, { align: 'center', size: 6.5, color: '#4a2508', bold: true });
}

// --- SCREEN C: AUTHENTIC QUESTS WITH CINDY LOU PORTRAIT (/6[9] + /7[7]) & 10 NEIGHBORS ---
function renderQuestsOrNeighbors(ctx) {
  const s = app.session;
  const isNb = s.view === SOURCE_VIEW.NEIGHBORS;
  drawOriginalWindowShell(ctx, isNb ? 15 : 9, isNb ? 'THĂM 10 HÀNG XÓM' : 'NHIỆM VỤ TRANG TRẠI', isNb ? 'Chạm hàng xóm để sang thăm trang trại!' : `Xu: ${s.coins}  ·  Cấp: ${s.level}`);

  // Top 2 Tabs inside x=18..222
  const tabs = [{ id: 'quests', label: 'NHIỆM VỤ', active: !isNb }, { id: 'neighbors', label: '10 HÀNG XÓM', active: isNb }];
  tabs.forEach((t, i) => {
    const tx = 18 + i * 102;
    ctx.fillStyle = t.active ? '#8c4b18' : '#e6ca94';
    ctx.fillRect(tx, 38, 100, 16);
    ctx.strokeStyle = t.active ? '#ffd84d' : '#8b5a2b';
    ctx.strokeRect(tx + 0.5, 38.5, 99, 15);
    drawText(ctx, t.label, tx + 50, 49, { align: 'center', size: 8, color: t.active ? '#fff8d4' : '#4a290c', bold: true });
  });

  if (isNb) {
    const list = s.catalog.neighbors || [];
    const maxV = 8;
    const start = Math.max(0, Math.min(Math.max(0, list.length - maxV), s.panelCursor - 3));
    for (let i = 0; i < maxV && start + i < list.length; i += 1) {
      const idx = start + i;
      const nb = list[idx];
      const y = 58 + i * 27;
      const sel = idx === s.panelCursor;
      const done = !!s.helpedNeighbors?.[nb.id];
      ctx.fillStyle = sel ? '#fff1b8' : '#f7e6c0';
      ctx.fillRect(18, y, 204, 24);
      ctx.strokeStyle = sel ? '#c46210' : '#9c6e3b';
      ctx.strokeRect(18.5, y + 0.5, 203, 23);
      const sp = getSpriteBlock(nb.worldBlock, 0);
      if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, 0, 32, y + 12, 22, 20);
      drawText(ctx, `Trang trại ${nb.name}`, 48, y + 15, { size: 8, color: '#3a1f08', bold: sel, maxWidth: 112 });
      drawText(ctx, done ? 'ĐÃ GIÚP' : 'SANG THĂM ▶', 216, y + 15, { align: 'right', size: 8, color: done ? '#8a7356' : '#1c6b1c', bold: true });
    }
    drawText(ctx, `↑↓ Xem ${start + 1}-${Math.min(list.length, start + maxV)}/${list.length} · Chạm để thăm`, SCREEN_W / 2, 306, { align: 'center', size: 8, color: '#4a2508', bold: true });
    return;
  }

  // Quest Detail Card with REAL Cindy Lou / Character Portrait from /7[7]!
  const quests = s.quests || [];
  const qSel = quests[Math.max(0, Math.min(quests.length - 1, s.questCursor))];
  ctx.fillStyle = '#faebc8';
  ctx.fillRect(18, 58, 204, 78);
  ctx.strokeStyle = '#9c6e3b';
  ctx.strokeRect(18.5, 58.5, 203, 77);

  const portrait = getUiSpriteBlock(7);
  if (portrait) {
    drawBSpriteBlockFrameScaled(ctx, portrait.sprite, portrait.moduleImages, 0, 46, 97, 50, 70);
  }
  if (qSel) {
    drawText(ctx, qSel.title, 76, 72, { size: 8, color: '#5c3314', bold: true, maxWidth: 140 });
    wrapLines(qSel.description || 'Hoàn thành công việc trang trại để nhận thưởng!', 28).slice(0, 2).forEach((ln, i) => {
      drawText(ctx, ln, 76, 85 + i * 11, { size: 7, color: '#3a1f08', maxWidth: 142 });
    });
    drawText(ctx, `Tiến độ: ${qSel.progress}/${qSel.targetCount}`, 76, 112, { size: 8, color: '#8c4b18', bold: true });
    drawText(ctx, `Thưởng: +${qSel.rewardCoins} Xu, +${qSel.rewardXp} XP`, 76, 125, { size: 8, color: '#1c6b1c', bold: true });
  }

  // Scrollable Quest List (5 rows cleanly inside y = 142..276)
  const visible = 5;
  const start = Math.max(0, Math.min(Math.max(0, quests.length - visible), s.questCursor - 2));
  for (let i = 0; i < visible && start + i < quests.length; i += 1) {
    const idx = start + i;
    const q = quests[idx];
    const y = 142 + i * 26;
    const sel = idx === s.questCursor;
    ctx.fillStyle = sel ? '#fff1b8' : '#f7e6c0';
    ctx.fillRect(18, y, 204, 23);
    ctx.strokeStyle = sel ? '#c46210' : '#9c6e3b';
    ctx.strokeRect(18.5, y + 0.5, 203, 22);
    drawText(ctx, q.title, 24, y + 14, { size: 8, color: '#3a1f08', bold: sel, maxWidth: 132 });
    const statusTxt = q.claimed ? 'XONG' : q.completed ? `NHẬN +${q.rewardCoins} Xu` : `${q.progress}/${q.targetCount}`;
    drawText(ctx, statusTxt, 216, y + 14, { align: 'right', size: 8, color: q.completed && !q.claimed ? '#1c6b1c' : '#8c4b18', bold: true });
  }
  drawText(ctx, 'Chạm NV xong để nhận', SCREEN_W / 2, 306, { align: 'center', size: 8, color: '#4a2508', bold: true });
}

// --- SCREEN D: CLEAN PARCHMENT LIST INSIDE /7[22] SAFE BOUNDS (x=18..222, y=42..276) ---
function renderCleanParchmentList(ctx, screenId, title, subtitle, rows, cursorIdx, footer) {
  drawOriginalWindowShell(ctx, screenId, title, subtitle);
  const maxVisible = 9;
  const rowH = 26;
  const start = Math.max(0, Math.min(Math.max(0, rows.length - maxVisible), cursorIdx - 4));
  for (let i = 0; i < maxVisible && start + i < rows.length; i += 1) {
    const idx = start + i;
    const item = rows[idx];
    const y = 40 + i * rowH;
    const sel = idx === cursorIdx;
    ctx.fillStyle = sel ? '#fff1b8' : '#f7e6c0';
    ctx.fillRect(18, y, 204, rowH - 3);
    ctx.strokeStyle = sel ? '#c46210' : '#9c6e3b';
    ctx.strokeRect(18.5, y + 0.5, 203, rowH - 4);
    let textX = 24;
    if (item.uiBlock != null) {
      const ui = getUiSpriteBlock(item.uiBlock);
      if (ui) {
        drawBSpriteBlockFrameScaled(ctx, ui.sprite, ui.moduleImages, item.uiFrame ?? 0, 31, y + 11, 20, 19);
        textX = 45;
      }
    } else if (item.spriteBlock != null) {
      const sp = getSpriteBlock(item.spriteBlock, item.paletteIndex || 0);
      if (sp) {
        drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, item.spriteFrame ?? 0, 31, y + 11, 20, 19);
        textX = 45;
      }
    }
    drawText(ctx, item.left, textX, y + 14, { size: 8, color: item.locked ? '#8a7356' : '#3a1f08', bold: sel, maxWidth: 160 - textX });
    const col = item.rightColor === 'red' ? '#b3281d' : item.rightColor === 'green' ? '#1c6b1c' : '#8c4b18';
    drawText(ctx, item.right, 216, y + 14, { align: 'right', size: 8, color: col, bold: true });
  }
  drawText(ctx, footer, SCREEN_W / 2, 306, { align: 'center', size: 8, color: '#4a2508', bold: true });
}

function renderSeedPicker(ctx) {
  const s = app.session;
  const crops = s.catalog.crops.filter(c => c.id !== 3000 && !c.isTree);
  const rows = crops.map((c) => ({
    left: `${c.name} (${c.growSec}s · Lv.${c.unlockLevel})`,
    right: `${c.buyPrice} Xu`,
    locked: s.level < c.unlockLevel,
    rightColor: s.coins >= c.buyPrice ? 'green' : 'red',
    uiBlock: c.iconBlock ?? 9,
    uiFrame: c.iconFrame ?? 12,
  }));
  renderCleanParchmentList(ctx, 22, 'CHỌN HẠT GIỐNG', `Xu: ${s.coins}  ·  Cấp: ${s.level}`, rows, s.panelCursor, 'Chạm hạt giống để gieo');
}

// --- 1:1 ORIGINAL GAMELOFT /6[8] BARN (TOP TABS + 3x2 ITEM GRID + CLEAN ARROWS!) ---
function renderBarn(ctx) {
  const s = app.session;
  const tab = s.barnTab || 'goods';
  ctx.fillStyle = '#3c2512';
  ctx.fillRect(0, 0, SCREEN_W, SCREEN_H);

  // Filter out 20[11] bare endcaps and 20[163,164] J2ME '4'/'6' arrows so we draw crisp equivalents
  const w8 = getUIScreen(8);
  drawOriginalUIScreen(ctx, w8, getAnySpriteBlock, {
    filterWidget: (w) => {
      if (w.type !== 205) return false;
      if (w.spriteId === 20 && (w.frameIndex === 11 || w.frameIndex === 163 || w.frameIndex === 164)) return false;
      return true;
    },
  });

  // Clean Coins & Cash top pills (matching /6[8] x=138, y=27 & y=57)
  drawRoundedPill(ctx, 136, 26, 86, 19, 8, '#f7f7f5', '#c79b55', 1);
  drawRoundedPill(ctx, 136, 56, 86, 19, 8, '#f7f7f5', '#c79b55', 1);
  const spr20 = getUiSpriteBlock(20);
  if (spr20) {
    drawBSpriteBlockFrame(ctx, spr20.sprite, spr20.moduleImages, 104, 131, 28, 0);
    drawBSpriteBlockFrame(ctx, spr20.sprite, spr20.moduleImages, 103, 130, 57, 0);
  }
  drawText(ctx, `${s.coins}`, 181, 38, { align: 'center', size: 8, color: '#4a2508', bold: true });
  drawText(ctx, `${s.cash}`, 181, 68, { align: 'center', size: 8, color: '#1c6b1c', bold: true });

  // Highlight active Barn tab (Goods vs Upgrades)
  ctx.strokeStyle = tab === 'goods' ? '#ffd84d' : '#9c6e3b';
  ctx.lineWidth = tab === 'goods' ? 2 : 1;
  ctx.strokeRect(15.5, 50.5, 52, 41);
  ctx.strokeStyle = tab === 'upgrade' ? '#ffd84d' : '#9c6e3b';
  ctx.lineWidth = tab === 'upgrade' ? 2 : 1;
  ctx.strokeRect(69.5, 50.5, 52, 41);
  ctx.lineWidth = 1;

  const items = [...s.inventory.values()];
  const totalQty = items.reduce((a, b) => a + b.qty, 0);
  const upCost = 150 + Math.floor((s.barnCapacity - 40) * 10);
  ctx.fillStyle = '#5c3314';
  ctx.fillRect(14, 10, 108, 18);
  ctx.strokeStyle = '#d4a259';
  ctx.strokeRect(14.5, 10.5, 107, 17);
  drawText(ctx, `KHO THÓC ${totalQty}/${s.barnCapacity}`, 68, 22, { align: 'center', size: 8, color: '#fff7d1', bold: true });

  if (tab === 'upgrade') {
    const coopCost = 200 + Math.floor(((s.coopCapacity || 6) - 6) * 40);
    const shedCost = 200 + Math.floor(((s.shedCapacity || 6) - 6) * 40);
    const cards = [
      { title: '+20 Chỗ Kho thóc', sub: `Hiện tại: ${s.barnCapacity}`, btn: `${upCost} Xu`, blk: 82, frm: 0 },
      { title: '+4 Chỗ Chuồng gà', sub: `Hiện tại: ${s.coopCapacity}`, btn: `${coopCost} Xu`, blk: 149, frm: 0 },
      { title: '+4 Chỗ Chuồng thú', sub: `Hiện tại: ${s.shedCapacity}`, btn: `${shedCost} Xu`, blk: 103, frm: 0 },
      { title: 'Bán hết nông sản', sub: `${totalQty} món trong kho`, btn: 'BÁN HẾT', blk: 4, frm: 1 },
    ];
    cards.forEach((cd, i) => {
      const col = i % 2;
      const row = Math.floor(i / 2);
      const cx = 30 + col * 92;
      const cy = 112 + row * 78;
      ctx.fillStyle = i === (s.barnCursor % 4) ? '#fff1b8' : '#f7e6c0';
      ctx.fillRect(cx, cy, 86, 70);
      ctx.strokeStyle = i === (s.barnCursor % 4) ? '#c46210' : '#9c6e3b';
      ctx.strokeRect(cx + 0.5, cy + 0.5, 85, 69);
      const sp = getSpriteBlock(cd.blk, 0);
      if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, cd.frm, cx + 43, cy + 23, 34, 28);
      drawText(ctx, cd.title, cx + 43, cy + 44, { align: 'center', size: 7, color: '#3a1f08', bold: true, maxWidth: 80 });
      drawText(ctx, cd.btn, cx + 43, cy + 59, { align: 'center', size: 7, color: '#1c6b1c', bold: true });
    });
    drawText(ctx, 'Chạm thẻ để nâng cấp hoặc bán hết', SCREEN_W / 2, 306, { align: 'center', size: 7, color: '#4a2508', bold: true });
    return;
  }

  const allSlots = [
    { isUpgrade: true, name: '+20 Chỗ Kho', qty: 0, price: upCost },
    ...items.map(it => ({
      isUpgrade: false,
      id: it.id,
      name: it.name,
      qty: it.qty,
      price: it.sellPrice * it.qty,
      iconBlock: it.iconBlock ?? 2,
      iconFrame: it.iconFrame ?? 0,
    })),
  ];
  const perPage = 6;
  const page = Math.floor(s.barnCursor / perPage);
  const start = page * perPage;

  // Clean left/right arrows without J2ME '4'/'6' keypad digits
  drawCleanArrowButton(ctx, 16, 189, 'left');
  drawCleanArrowButton(ctx, 224, 189, 'right');

  // 3x2 grid cleanly centered inside /6[8]'s lower parchment panel
  for (let i = 0; i < perPage && start + i < allSlots.length; i += 1) {
    const idx = start + i;
    const it = allSlots[idx];
    const col = i % 3;
    const row = Math.floor(i / 3);
    const cx = 30 + col * 60;
    const cy = 112 + row * 78;
    const sel = idx === s.barnCursor;
    ctx.fillStyle = sel ? '#fff1b8' : '#f7e6c0';
    ctx.fillRect(cx, cy, 56, 70);
    ctx.strokeStyle = sel ? '#c46210' : '#9c6e3b';
    ctx.lineWidth = sel ? 2 : 1;
    ctx.strokeRect(cx + 0.5, cy + 0.5, 55, 69);
    ctx.lineWidth = 1;

    if (it.isUpgrade) {
      const sp82 = getSpriteBlock(82, 0);
      if (sp82) drawBSpriteBlockFrameScaled(ctx, sp82.sprite, sp82.moduleImages, 0, cx + 28, cy + 24, 34, 30);
    } else {
      const itemSp = getAnySpriteBlock(it.iconBlock);
      if (itemSp) {
        const frm = Math.max(0, Math.min(itemSp.sprite.frames.length - 1, it.iconFrame));
        drawBSpriteBlockFrameScaled(ctx, itemSp.sprite, itemSp.moduleImages, frm, cx + 28, cy + 24, 30, 28);
      }
    }
    drawText(ctx, it.name, cx + 28, cy + 50, { align: 'center', size: 6, color: '#3a1f08', bold: true, maxWidth: 52 });
    drawText(ctx, it.isUpgrade ? `${it.price} Xu` : `x${it.qty} · +${it.price} Xu`, cx + 28, cy + 63, {
      align: 'center', size: 6, color: it.isUpgrade ? '#8c4b18' : '#1c6b1c', bold: true, maxWidth: 52,
    });
  }
  drawText(ctx, 'Chạm ✔ Bán hết · Chạm ô để bán', SCREEN_W / 2, 306, { align: 'center', size: 7, color: '#4a2508', bold: true });
}

function getManorCards(s) {
  const rooms = (s.catalog.buildings || []).filter(b => b.isManorRoom);
  return [
    { kind: 'open_kitchen', title: 'Lò bánh & Nhà bếp (83 món)', desc: 'Vào bếp xay bột, làm bánh kếp, bánh bí đỏ & món nấu giá cao!', btn: 'VÀO LÀM BÁNH', spriteBlock: 132, frame: 0 },
    { kind: 'open_feed_mill', title: 'Máy xay thức ăn thú', desc: 'Xay Lúa mì, Cà chua, Bắp thành thức ăn cho Bò, Gà, Cừu.', btn: 'MỞ MÁY XAY', spriteBlock: 15, frame: 0 },
    { kind: 'tool_plow', title: 'Cuốc cày đất', desc: 'Chạm bãi cỏ để cày ô đất trồng cây mới (10 Xu/ô).', btn: s.activeTool === 'plow' ? 'TẮT CUỐC' : 'DÙNG CUỐC', spriteBlock: 6, frame: 0 },
    { kind: 'tool_clear', title: 'Rìu dọn cỏ & đá', desc: 'Dọn bụi cây & đá lấy đất trống (+15 Xu).', btn: s.activeTool === 'clear' ? 'TẮT RÌU' : 'DÙNG RÌU', spriteBlock: 139, frame: 0 },
    { kind: 'open_barn', title: 'Kho thóc', desc: `Lưu trữ & bán nông sản (Sức chứa: ${s.barnCapacity} chỗ).`, btn: 'MỞ KHO', spriteBlock: 82, frame: 0 },
    { kind: 'open_neighbors', title: '10 Hàng xóm', desc: 'Sang thăm trực tiếp 10 trang trại bạn bè và giúp việc.', btn: 'ĐI THĂM', spriteBlock: 86, frame: 0 },
    { kind: 'open_collections', title: 'Phòng sưu tập', desc: 'Trưng bày & bán 15 cổ vật quý tìm được khi làm vườn.', btn: 'XEM TỦ ĐỒ', spriteBlock: 129, frame: 0 },
    { kind: 'open_mailbox', title: 'Hòm thư', desc: 'Nhận quà khởi nghiệp & giao đơn hàng cho hàng xóm.', btn: 'ĐỌC THƯ', spriteBlock: 83, frame: 0 },
    { kind: 'open_land', title: 'Mở rộng đất', desc: `Đã mở ${s.unlockedZones?.length || 1}/6 khu đất trang trại.`, btn: 'MUA ĐẤT', uiBlock: 4, uiFrame: 2 },
    { kind: 'toggle_audio', title: 'Nhạc & Âm thanh', desc: 'Bật hoặc tắt nhạc nền và hiệu ứng âm thanh.', btn: app.audioEnabled ? 'ĐANG BẬT (TẮT)' : 'ĐANG TẮT (BẬT)', uiBlock: 20, uiFrame: 109 },
    ...rooms.map((r) => {
      const done = !!s.unlockedRooms?.[r.entityId];
      const isKitchenRoom = r.entityId === 2;
      const cost = Math.max(150, Math.min(5000, r.repairCost || 300));
      return {
        kind: isKitchenRoom && done ? 'open_kitchen' : 'repair_room',
        entityId: r.entityId,
        title: `Phòng: ${r.name}`,
        desc: isKitchenRoom ? 'Nhà bếp của Thái ấp: Chế biến bột & làm bánh ngay!' : (done ? 'Phòng này đã được sửa chữa hoàn chỉnh!' : 'Sửa chữa để khôi phục Dinh thự chú để lại.'),
        btn: isKitchenRoom ? 'VÀO LÀM BÁNH' : (done ? 'ĐÃ SỬA' : `SỬA ${cost} Xu`),
        spriteBlock: r.worldBlock,
        frame: r.frame || 0,
      };
    }),
  ];
}

// --- 1:1 ORIGINAL GAMELOFT /6[14] MANOR & PAUSE MENU SCREEN ---
function renderManor(ctx) {
  const s = app.session;
  ctx.fillStyle = '#3c2512';
  ctx.fillRect(0, 0, SCREEN_W, SCREEN_H);

  // Render clean structural /6[14] widgets (skip oversized clipped portrait 15 — draw it cleanly below header!)
  const w14 = getUIScreen(14);
  drawOriginalUIScreen(ctx, w14, getAnySpriteBlock, {
    filterWidget: (w) => w.type === 205 && (w.spriteId === 22 || w.spriteId === 33 || w.spriteId === 12),
  });

  const cards = getManorCards(s);
  const idx = ((s.panelCursor % cards.length) + cards.length) % cards.length;
  const cur = cards[idx];

  // Clean wooden title plate
  ctx.fillStyle = '#5c3314';
  ctx.fillRect(16, 6, 208, 24);
  ctx.strokeStyle = '#d4a259';
  ctx.strokeRect(16.5, 6.5, 207, 23);
  drawText(ctx, `MENU & DINH THỰ (${idx + 1}/${cards.length})`, SCREEN_W / 2, 21, { align: 'center', size: 8, color: '#fff7d1', bold: true });

  // Direct House Navigation Tabs so entering Manor immediately gives Bakery & Feed Mill access
  const mTabs = [
    { label: 'THÁI ẤP', active: true },
    { label: 'LÀM BÁNH', active: false },
    { label: 'MÁY XAY', active: false },
  ];
  mTabs.forEach((t, i) => {
    const tx = 18 + i * 69;
    drawRoundedPill(ctx, tx, 33, 65, 16, 4, t.active ? '#8c4b18' : '#e6ca94', t.active ? '#ffd84d' : '#8b5a2b', 1);
    drawText(ctx, t.label, tx + 32.5, 44, { align: 'center', size: 6.5, color: t.active ? '#fff7d1' : '#4a2508', bold: true });
  });

  // Farmer/Uncle portrait cleanly positioned BELOW tabs bar so hat & head are never clipped
  const uncle = getUiSpriteBlock(15);
  if (uncle) {
    drawBSpriteBlockFrameScaled(ctx, uncle.sprite, uncle.moduleImages, 1, 44, 72, 40, 46);
  }
  drawText(ctx, `Cấp ${s.level} · ${s.coins} Xu`, 138, 67, { align: 'center', size: 8, color: '#4a2508', bold: true });
  drawText(ctx, `Năng lượng: ${s.energy}/${s.maxEnergy}`, 138, 80, { align: 'center', size: 7, color: '#6b3e14', bold: true });

  // Clean parchment showcase card strictly inside x=24..216, y=94..256
  ctx.fillStyle = '#faebc8';
  ctx.fillRect(24, 94, 192, 162);
  ctx.strokeStyle = '#9c6e3b';
  ctx.lineWidth = 2;
  ctx.strokeRect(24.5, 94.5, 191, 161);
  ctx.lineWidth = 1;

  drawText(ctx, cur.title, 120, 114, { align: 'center', size: 10, color: '#3a1f08', bold: true, maxWidth: 165 });

  // Original BSprite centered cleanly in showcase frame
  if (cur.uiBlock != null) {
    const uisp = getUiSpriteBlock(cur.uiBlock);
    if (uisp) drawBSpriteBlockFrameScaled(ctx, uisp.sprite, uisp.moduleImages, cur.uiFrame ?? 0, 120, 152, 64, 48);
  } else {
    const sp = getSpriteBlock(cur.spriteBlock, 0);
    if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, cur.frame, 120, 152, 72, 52);
  }

  wrapLines(cur.desc, 28).slice(0, 2).forEach((ln, i) => {
    drawText(ctx, ln, 120, 192 + i * 11, { align: 'center', size: 7, color: '#4a290c', bold: true });
  });

  // Clean wooden Action / Repair button at (66, 218, 108x26)
  ctx.fillStyle = '#2e7d32';
  ctx.fillRect(66, 218, 108, 26);
  ctx.strokeStyle = '#ffd84d';
  ctx.strokeRect(66.5, 218.5, 107, 25);
  drawText(ctx, cur.btn, 120, 234, { align: 'center', size: 8, color: '#fff7d1', bold: true });

  // Left / Right switcher arrows on the sides of the card
  drawText(ctx, '◀', 36, 158, { align: 'center', size: 14, color: '#8c4b18', bold: true });
  drawText(ctx, '▶', 204, 158, { align: 'center', size: 14, color: '#8c4b18', bold: true });
  drawText(ctx, '◀ ▶ Đổi mục · Chạm nút mở', SCREEN_W / 2, 306, { align: 'center', size: 7, color: '#4a2508', bold: true });
}

function renderCoop(ctx) {
  const s = app.session;
  const isChicken = s.coopFilter === 'chicken';
  const lookup = s.catalog.allAnimals || s.catalog.animals || [];
  const animals = s.animals.filter(a => {
    const spec = lookup.find(sp => sp.id === a.animalId);
    return isChicken ? (spec?.kind === 'chicken' || a.worldBlock === 8) : (spec?.kind !== 'chicken' && a.worldBlock !== 8);
  });
  const feedTotal = [...(s.feedStock?.values() || [])].reduce((acc, it) => acc + (it.qty || 0), 0);
  const rows = [
    { left: `Mua thêm ${isChicken ? 'Gà' : 'Vật nuôi'} tại Chợ`, right: 'MỞ CHỢ', rightColor: 'green', spriteBlock: isChicken ? 8 : 17, spriteFrame: 0 },
    { left: `Thức ăn trong Tháp: ${feedTotal} phần`, right: 'MÁY XAY', rightColor: 'gold', spriteBlock: 15, spriteFrame: 0 },
    ...animals.map(a => ({
      left: a.name,
      right: a.ready ? 'THU HOẠCH' : a.fed ? 'ĐANG LỚN' : 'CHO ĂN',
      rightColor: a.ready ? 'green' : !a.fed ? 'red' : 'gold',
      spriteBlock: a.worldBlock,
      paletteIndex: a.paletteIndex,
      spriteFrame: a.idleFrame || 0,
    })),
  ];
  renderCleanParchmentList(ctx, 22, isChicken ? 'CHUỒNG GÀ' : 'CHUỒNG THÚ', `Số lượng: ${animals.length}/${isChicken ? s.coopCapacity : s.shedCapacity} · Thức ăn: ${feedTotal}`, rows, s.panelCursor, 'Chạm thú để thu / cho ăn');
}

function renderMailbox(ctx) {
  const s = app.session;
  const rows = (s.neighborMail || []).map(m => ({
    left: m.kind === 'gift' ? `${m.from}: Quà khởi nghiệp` : `${m.from}: Giao ${m.needQty} nông sản`,
    right: m.claimed ? 'ĐÃ NHẬN' : m.kind === 'gift' ? `+${m.giftCoins} Xu` : `GIAO +${m.giftCoins} Xu`,
    rightColor: m.claimed ? 'gold' : 'green',
    spriteBlock: 83,
    spriteFrame: 0,
  }));
  renderCleanParchmentList(ctx, 15, 'HÒM THƯ & ĐƠN HÀNG', `Xu: ${s.coins}  ·  Quà & đơn đặt hàng`, rows, s.panelCursor, 'Chạm thư để nhận / giao');
}

function renderCollections(ctx) {
  const s = app.session;
  const rows = (s.catalog.collectibles || []).map(c => {
    const qty = s.collections?.[c.id] || 0;
    return {
      left: `${c.name} (Có: ${qty})`,
      right: qty > 0 ? `Bán +${c.sellPrice} Xu` : `Lv.${c.minLevel}`,
      locked: qty === 0,
      rightColor: qty > 0 ? 'green' : 'gold',
    };
  });
  renderCleanParchmentList(ctx, 9, 'PHÒNG SƯU TẬP CỔ VẬT', 'Tìm 15 cổ vật khi thu hoạch & dọn đất', rows, s.panelCursor, 'Chạm cổ vật để bán');
}

// --- DIRECT LAND EXPANSION PROMPT (/6[11] — clicking empty outer parcel on farm map!) ---
function renderLandPurchase(ctx) {
  const s = app.session;
  const expandable = LAND_ZONES.filter(z => z.id !== 'center');
  const zone = expandable.find(z => z.id === s.selectedLandZoneId) || expandable[0];
  const owned = (s.unlockedZones || []).includes(zone.id);
  const canBuy = !owned && s.level >= zone.unlockLevel && s.coins >= zone.cost;
  drawOriginalWindowShell(ctx, 11, 'MỞ RỘNG MẪU ĐẤT MỚI', `Cấp ${s.level} · Hiện có ${s.coins} Xu`, { showConfirm: true });

  ctx.fillStyle = '#faebc8';
  ctx.fillRect(22, 48, 196, 224);
  ctx.strokeStyle = '#9c6e3b';
  ctx.lineWidth = 2;
  ctx.strokeRect(22.5, 48.5, 195, 223);
  ctx.lineWidth = 1;

  drawText(ctx, zone.name, 120, 70, { align: 'center', size: 9, color: '#3a1f08', bold: true, maxWidth: 164 });
  const sp4 = getUiSpriteBlock(4);
  if (sp4) drawBSpriteBlockFrameScaled(ctx, sp4.sprite, sp4.moduleImages, 2, 120, 114, 56, 56);

  wrapLines(zone.desc || 'Mở rộng khu đất trang trại để cày thêm ruộng & trồng cây!', 30).slice(0, 2).forEach((ln, i) => {
    drawText(ctx, ln, 120, 152 + i * 12, { align: 'center', size: 7, color: '#4a290c', bold: true });
  });

  drawText(ctx, `Yêu cầu: Cấp ${zone.unlockLevel} · Giá: ${zone.cost} Xu`, 120, 186, {
    align: 'center', size: 7.5, color: s.level >= zone.unlockLevel ? '#1c6b1c' : '#9c2c1c', bold: true,
  });

  ctx.fillStyle = owned ? '#8c4b18' : canBuy ? '#2e7d32' : '#c7ab7a';
  ctx.fillRect(46, 200, 148, 28);
  ctx.strokeStyle = '#ffd84d';
  ctx.strokeRect(46.5, 200.5, 147, 27);
  const btnText = owned ? 'ĐÃ SỞ HỮU' : s.level < zone.unlockLevel ? `CẦN CẤP ${zone.unlockLevel}` : `MUA ĐẤT (${zone.cost} Xu)`;
  drawText(ctx, btnText, 120, 217, { align: 'center', size: 8, color: owned || canBuy ? '#fff7d1' : '#5c3314', bold: true });

  drawRoundedPill(ctx, 56, 236, 128, 22, 5, '#e6ca94', '#8b5a2b', 1);
  drawText(ctx, 'XEM BẢN ĐỒ ĐẤT', 120, 250, { align: 'center', size: 7, color: '#4a2508', bold: true });

  drawText(ctx, '◀', 34, 118, { align: 'center', size: 13, color: '#8c4b18', bold: true });
  drawText(ctx, '▶', 206, 118, { align: 'center', size: 13, color: '#8c4b18', bold: true });
  drawText(ctx, '◀ ▶ Chọn mảnh đất khác · Chạm MUA ĐẤT', SCREEN_W / 2, 306, { align: 'center', size: 6.5, color: '#4a2508', bold: true });
}

// --- POND FISHING MINIGAME (/6[24], /6[20], /7[32], /9[19] — a.java:32210-32850!) ---
function renderFishing(ctx) {
  const s = app.session;
  const f = s.fishing || { mode: 'menu', rodType: 0, freeCooldownUntil: 0, castsLeft: 5, catches: [], bubbles: [] };
  const cfg = s.catalog?.fishingConfig || { cashCost: 5, coinCost: 50 };
  const animTick = Math.floor((s.animTimeMs || 0) / 110);

  drawOriginalWindowShell(ctx, 22, 'HỒ CÂU CÁ AO TRANG TRẠI', `Xu: ${s.coins} · Tiền mặt: ${s.cash} · ⚡${s.energy}/${s.maxEnergy}`, { showConfirm: f.mode === 'result' });

  // Draw real farm Pond building sprite (entityId 17) centered cleanly inside Pond frame
  const pondEnt = sourceWorld?.farmEntities?.find(e => e.category === 50 && e.entityId === 17);
  const pondSp = pondEnt ? getSpriteBlock(pondEnt.block, pondEnt.paletteIndex) : null;
  const sp32 = getUiSpriteBlock(32);
  const boxH = f.mode === 'playing' ? 194 : 108;
  ctx.save();
  ctx.beginPath();
  ctx.rect(18, 42, 204, boxH);
  ctx.clip();
  ctx.fillStyle = '#6bd41a';
  ctx.fillRect(18, 42, 204, boxH);
  if (pondSp) {
    const fIdx = pondEnt.useAnim && pondSp.sprite.animations?.length > 0
      ? (pondSp.sprite.animations[0][animTick % pondSp.sprite.animations[0].length]?.frame ?? pondEnt.frame ?? 0)
      : (pondEnt.frame ?? 0);
    const b = pondSp.sprite.bounds?.[fIdx];
    const bw = Math.max(1, b?.width || 96);
    const bh = Math.max(1, b?.height || 64);
    const bx = b?.x ?? -(bw >> 1);
    const by = b?.y ?? -(bh >> 1);
    const scratch = renderFishing._pondScratch || (renderFishing._pondScratch = document.createElement('canvas'));
    if (scratch.width !== bw || scratch.height !== bh) {
      scratch.width = bw;
      scratch.height = bh;
    }
    const pctx = scratch.getContext('2d');
    pctx.clearRect(0, 0, bw, bh);
    pctx.imageSmoothingEnabled = false;
    drawBSpriteBlockFrame(pctx, pondSp.sprite, pondSp.moduleImages, fIdx, -bx, -by, 0);
    const zoom = Math.max(1.35, Math.min(204 / bw, boxH / bh) * (f.mode === 'playing' ? 1.18 : 1.05));
    const dw = Math.round(bw * zoom);
    const dh = Math.round(bh * zoom);
    const dx = Math.round(120 - dw / 2);
    const dy = Math.round(42 + boxH / 2 + (f.mode === 'playing' ? 8 : 2) - dh / 2);
    ctx.imageSmoothingEnabled = false;
    ctx.drawImage(scratch, 0, 0, bw, bh, dx, dy, dw, dh);
  } else {
    ctx.fillStyle = '#1b85b8';
    ctx.fillRect(18, 42, 204, boxH);
  }
  ctx.restore();
  ctx.strokeStyle = '#8b5a2b';
  ctx.strokeRect(18.5, 42.5, 203, boxH - 1);

  if (f.mode === 'menu') {
    const now = Date.now();
    const freeRem = Math.max(0, Math.ceil(((f.freeCooldownUntil || 0) - now) / 1000));
    ctx.fillStyle = '#faebc8';
    ctx.fillRect(18, 154, 204, 126);
    ctx.strokeStyle = '#9c6e3b';
    ctx.strokeRect(18.5, 154.5, 203, 125);
    drawText(ctx, 'Chọn loại cần câu (tối đa 3 thưởng / lượt)', SCREEN_W / 2, 165, { align: 'center', size: 7, color: '#3a1f08', bold: true });
    const rods = [
      { label: 'CÂU MIỄN PHÍ', sub: freeRem === 0 ? 'Sẵn sàng!' : `Đợi ${freeRem}s`, color: freeRem === 0 ? '#2e7d32' : '#c7ab7a', text: freeRem === 0 ? '#ffffff' : '#5c3314' },
      { label: `CẦN CÂU XU (${cfg.coinCost} Xu)`, sub: 'Thưởng Xu, Cây, Bánh ngon', color: s.coins >= cfg.coinCost ? '#2e7d32' : '#c7ab7a', text: s.coins >= cfg.coinCost ? '#ffffff' : '#5c3314' },
      { label: `CẦN VÀNG (${cfg.cashCost} Cash)`, sub: 'Vật phẩm hiếm & Ngựa/Bò quý!', color: s.cash >= cfg.cashCost ? '#8c4b18' : '#c7ab7a', text: s.cash >= cfg.cashCost ? '#fff7d1' : '#5c3314' },
    ];
    rods.forEach((r, i) => {
      const ry = 172 + i * 27;
      ctx.fillStyle = r.color;
      ctx.fillRect(28, ry, 184, 23);
      ctx.strokeStyle = '#ffd84d';
      ctx.strokeRect(28.5, ry + 0.5, 183, 22);
      drawText(ctx, `${r.label} · ${r.sub}`, 120, ry + 14, { align: 'center', size: 7, color: r.text, bold: true });
    });
    drawRoundedPill(ctx, 42, 255, 156, 20, 5, '#e6ca94', '#8b5a2b', 1);
    drawText(ctx, '💧 Múc nước Ao (+5 ⚡ Năng lượng)', 120, 268, { align: 'center', size: 6.8, color: '#1b5e8a', bold: true });
    drawText(ctx, 'Chạm loại cần để bắt đầu câu cá!', SCREEN_W / 2, 306, { align: 'center', size: 7, color: '#4a2508', bold: true });
    return;
  }

  if (f.mode === 'playing') {
    const rodName = f.rodType === 1 ? 'Cần Vàng' : f.rodType === 2 ? 'Cần Xu' : 'Miễn phí';
    drawRoundedPill(ctx, 24, 46, 192, 16, 4, 'rgba(36, 20, 8, 0.88)', '#e8c47a', 1);
    drawText(ctx, `${rodName} · Lượt quăng: ${f.castsLeft}/5 · Đã câu: ${f.catches.length}/3`, 120, 57, { align: 'center', size: 7, color: '#fff7d1', bold: true });

    // Animated bobbing numbered fish targets (1..9) on the Pond
    for (const b of f.bubbles || []) {
      const bobY = b.y + Math.round(Math.sin((animTick + b.num) * 0.45) * 3);
      if (sp32 && sp32.sprite.animations?.length > 0) {
        drawBSpriteBlockAnim(ctx, sp32.sprite, sp32.moduleImages, 0, animTick + b.num, b.x, bobY, 0);
      }
      ctx.fillStyle = 'rgba(255, 246, 186, 0.96)';
      ctx.beginPath();
      ctx.arc(b.x, bobY - 4, 13, 0, Math.PI * 2);
      ctx.fill();
      ctx.lineWidth = 2;
      ctx.strokeStyle = '#c46210';
      ctx.stroke();
      ctx.lineWidth = 1;
      drawText(ctx, `${b.num}`, b.x, bobY, { align: 'center', size: 10, color: '#3a1f08', bold: true });
    }
    ctx.fillStyle = '#faebc8';
    ctx.fillRect(18, 242, 204, 38);
    ctx.strokeStyle = '#9c6e3b';
    ctx.strokeRect(18.5, 242.5, 203, 37);
    drawText(ctx, 'Chạm bóng cá hoặc bấm phím số 1-9!', SCREEN_W / 2, 256, { align: 'center', size: 7.5, color: '#3a1f08', bold: true });
    drawText(ctx, `Đã trúng: ${f.catches.map(c => c.name).join(', ') || 'Chưa có'}`, SCREEN_W / 2, 272, { align: 'center', size: 6.8, color: '#1c6b1c', bold: true, maxWidth: 196 });
    drawText(ctx, 'Chạm số để giật cần câu', SCREEN_W / 2, 306, { align: 'center', size: 7, color: '#4a2508', bold: true });
    return;
  }

  // f.mode === 'result' (/6[20] reward summary!)
  ctx.fillStyle = '#faebc8';
  ctx.fillRect(18, 154, 204, 126);
  ctx.strokeStyle = '#9c6e3b';
  ctx.strokeRect(18.5, 154.5, 203, 125);
  drawText(ctx, '🎉 CÂU HAY LẮM! PHẦN THƯỞNG:', SCREEN_W / 2, 168, { align: 'center', size: 8, color: '#2e7d32', bold: true });
  if (f.catches.length === 0) {
    drawText(ctx, 'Chưa câu trúng cá nào lần này — thử lại nhé!', SCREEN_W / 2, 206, { align: 'center', size: 7, color: '#7a3f10' });
  } else {
    f.catches.slice(0, 3).forEach((rw, i) => {
      const cx = 24 + i * 66;
      const cy = 178;
      ctx.fillStyle = '#fff1b8';
      ctx.fillRect(cx, cy, 60, 60);
      ctx.strokeStyle = '#9c6e3b';
      ctx.strokeRect(cx + 0.5, cy + 0.5, 59, 59);
      const sp = rw.spriteBlock != null ? getSpriteBlock(rw.spriteBlock, rw.paletteIndex || 0)
        : rw.iconBlock != null ? getAnySpriteBlock(rw.iconBlock)
        : rw.uiBlock != null ? getUiSpriteBlock(rw.uiBlock)
        : null;
      if (sp) drawBSpriteBlockFrameScaled(ctx, sp.sprite, sp.moduleImages, rw.spriteFrame ?? rw.iconFrame ?? rw.uiFrame ?? 0, cx + 30, cy + 24, 28, 26);
      drawText(ctx, rw.name, cx + 30, cy + 50, { align: 'center', size: 6, color: '#3a1f08', bold: true, maxWidth: 56 });
    });
  }
  ctx.fillStyle = '#2e7d32';
  ctx.fillRect(54, 248, 132, 24);
  ctx.strokeStyle = '#ffd84d';
  ctx.strokeRect(54.5, 248.5, 131, 23);
  drawText(ctx, 'CÂU TIẾP', 120, 263, { align: 'center', size: 8, color: '#ffffff', bold: true });
  drawText(ctx, 'Chạm CÂU TIẾP hoặc ⬅ Về trang trại', SCREEN_W / 2, 306, { align: 'center', size: 6.8, color: '#4a2508', bold: true });
}

function renderFrame(ctx, now) {
  const timing = sourceFrame(previousFrameAt, now);
  previousFrameAt = timing.now;
  app.session.frame += 1;
  app.session.lastFrameAt = timing.now;
  flushSfxQueue(app.session);
  const v = app.session.view;
  if (v === SOURCE_VIEW.OPENING_SCRIPT) renderOpeningEvidence(ctx);
  else if (v === SOURCE_VIEW.SHOP) renderShop(ctx);
  else if (v === SOURCE_VIEW.SEED_PICKER) renderSeedPicker(ctx);
  else if (v === SOURCE_VIEW.BARN) renderBarn(ctx);
  else if (v === SOURCE_VIEW.KITCHEN) renderKitchen(ctx);
  else if (v === SOURCE_VIEW.FEED_MILL) renderFeedMill(ctx);
  else if (v === SOURCE_VIEW.MANOR) renderManor(ctx);
  else if (v === SOURCE_VIEW.COOP) renderCoop(ctx);
  else if (v === SOURCE_VIEW.MAILBOX) renderMailbox(ctx);
  else if (v === SOURCE_VIEW.COLLECTIONS) renderCollections(ctx);
  else if (v === SOURCE_VIEW.LAND) renderLandPurchase(ctx);
  else if (v === SOURCE_VIEW.FISHING) renderFishing(ctx);
  else if (v === SOURCE_VIEW.QUESTS || v === SOURCE_VIEW.NEIGHBORS) renderQuestsOrNeighbors(ctx);
  else renderFarmWorld(ctx);
}

let dragState = null;

function screenToWorld(s, sx, sy) {
  const zoom = s.worldZoom || 1;
  return { wx: sx / zoom + s.cameraX, wy: sy / zoom + s.cameraY };
}

function onPointerDown(event) {
  if (!app?.session) return;
  const rect = canvasEl.getBoundingClientRect();
  const x = (event.clientX - rect.left) * (SCREEN_W / rect.width);
  const y = (event.clientY - rect.top) * (SCREEN_H / rect.height);
  const s = app.session;
  if (s.view === SOURCE_VIEW.WORLD_LAYER) {
    const onSeedCarousel = !!s.seedCarousel && y >= 236;
    const onHudTop = (x >= 198 && y <= 58);
    const onBottomLeft = (x <= 68 && y >= 274);
    const onBottomRight = (x >= 152 && y >= 274);
    if (!onSeedCarousel && !onHudTop && !onBottomLeft && !onBottomRight && y >= 48) {
      dragState = { pointerId: event.pointerId, startX: x, startY: y, camX: s.cameraX, camY: s.cameraY, dragged: false };
      try { canvasEl.setPointerCapture(event.pointerId); } catch { /* ignore */ }
      event.preventDefault();
      return;
    }
  }
  handleTap(x, y, event);
}

function onPointerMove(event) {
  if (!dragState || !app?.session || event.pointerId !== dragState.pointerId) return;
  const rect = canvasEl.getBoundingClientRect();
  const x = (event.clientX - rect.left) * (SCREEN_W / rect.width);
  const y = (event.clientY - rect.top) * (SCREEN_H / rect.height);
  const dx = x - dragState.startX;
  const dy = y - dragState.startY;
  if (Math.abs(dx) > 5 || Math.abs(dy) > 5) dragState.dragged = true;
  if (dragState.dragged) {
    const zoom = app.session.worldZoom || 1;
    app.session.cameraX = dragState.camX - dx / zoom;
    app.session.cameraY = dragState.camY - dy / zoom;
    clampWorldCamera(app.session, sourceWorld?.tileMap);
  }
}

function onPointerUp(event) {
  if (!dragState || event.pointerId !== dragState.pointerId) return;
  const wasDragged = dragState.dragged;
  const sx = dragState.startX;
  const sy = dragState.startY;
  dragState = null;
  if (!wasDragged) handleTap(sx, sy, event);
}

function handlePanelAction(s, idx) {
  playSfx('click');
  const v = s.view;
  if (v === SOURCE_VIEW.SHOP) {
    const list = getShopItems(s);
    const item = list[idx];
    if (!item) return;
    if (s.shopTab === 'land') {
      buyLandZone(s, item.id);
      saveSession();
    } else if (s.shopTab === 'crops') {
      if (s.level >= item.unlockLevel) {
        s.selectedCropId = item.id;
        s.activeTool = 'plant';
        s.placementItem = null;
        s.toast = `Đã chọn giống ${item.name} — chạm ô đất để gieo (Esc hủy)!`;
        s.toastMs = 2600;
        s.view = SOURCE_VIEW.WORLD_LAYER;
      } else {
        s.toast = `${item.name} mở khóa ở Cấp ${item.unlockLevel}!`;
        s.toastMs = 2000;
      }
    } else {
      if ((item.unlockLevel || 1) > s.level) {
        s.toast = `${item.name} mở khóa ở Cấp ${item.unlockLevel}!`;
        s.toastMs = 2000;
        return;
      }
      if (s.coins < item.buyPrice) {
        s.toast = `Cần ${item.buyPrice} Xu để mua ${item.name}!`;
        s.toastMs = 2000;
        return;
      }
      const kind = s.shopTab === 'trees' ? 'tree' : s.shopTab === 'animals' ? 'animal' : 'decor';
      s.activeTool = 'place';
      s.placementItem = { kind, spec: item };
      s.view = SOURCE_VIEW.WORLD_LAYER;
      s.toast = `Chạm bãi cỏ để đặt ${item.name}!`;
      s.toastMs = 2600;
    }
  } else if (v === SOURCE_VIEW.SEED_PICKER) {
    const crops = s.catalog.crops.filter(c => c.id !== 3000 && !c.isTree);
    const crop = crops[idx];
    const target = s.seedPickerTarget;
    if (crop && target) {
      s.selectedCropId = crop.id;
      s.seedPickerTarget = null;
      s.view = SOURCE_VIEW.WORLD_LAYER;
      setFarmerWalkTarget(s, target.worldX, target.worldY + 4, {
        type: 'plant_seed', row: target.row, col: target.col, cropId: crop.id,
      });
      saveSession();
    }
  } else if (v === SOURCE_VIEW.BARN) {
    if (s.barnTab === 'upgrade') {
      if (idx === 0) upgradeBarn(s);
      else if (idx === 1) upgradeCoop(s, 'chicken');
      else if (idx === 2) upgradeCoop(s, 'livestock');
      else if (idx === 3) sellAllGoods(s);
      saveSession();
    } else if (idx === 0) {
      upgradeBarn(s);
      saveSession();
    } else {
      const item = [...s.inventory.values()][idx - 1];
      if (item) { sellGood(s, item.id, item.qty); saveSession(); }
    }
  } else if (v === SOURCE_VIEW.KITCHEN) {
    if (s.kitchenTab === 'stoves') {
      const job = (s.kitchenQueue || [])[idx];
      if (job?.ready) { collectKitchenDish(s, job.uid); saveSession(); }
      else if (job) {
        const rem = Math.max(0, Math.ceil((job.cookMs - job.progressMs) / 1000));
        s.toast = `${job.name} đang nấu (còn ${rem}s)...`;
        s.toastMs = 1500;
      }
    } else {
      const recipe = getKitchenRecipes(s)[idx];
      if (recipe) { startKitchenRecipe(s, recipe.id); saveSession(); }
    }
  } else if (v === SOURCE_VIEW.FEED_MILL) {
    if (s.millTab === 'queue') {
      const job = (s.millQueue || [])[idx];
      if (job?.ready) { collectFeedMillBatch(s, job.uid); saveSession(); }
      else if (job) {
        const rem = Math.max(0, Math.ceil((job.millMs - job.progressMs) / 1000));
        s.toast = `${job.name} đang xay (còn ${rem}s)...`;
        s.toastMs = 1500;
      }
    } else if (s.millTab === 'recipes') {
      const recipe = (s.catalog.feedRecipes || [])[idx];
      if (recipe) { startFeedMillRecipe(s, recipe.id); saveSession(); }
    }
  } else if (v === SOURCE_VIEW.LAND) {
    const expandable = LAND_ZONES.filter(z => z.id !== 'center');
    const zone = expandable.find(z => z.id === s.selectedLandZoneId) || expandable[0];
    if (zone) {
      const res = buyLandZone(s, zone.id);
      saveSession();
      if (res.ok) s.view = SOURCE_VIEW.WORLD_LAYER;
    }
  } else if (v === SOURCE_VIEW.FISHING) {
    const f = s.fishing;
    if (f?.mode === 'result') { f.mode = 'menu'; saveSession(); }
    else if (f?.mode === 'menu') { startFishingRound(s, idx % 3); saveSession(); }
  } else if (v === SOURCE_VIEW.MANOR) {
    const cards = getManorCards(s);
    const cur = cards[((idx % cards.length) + cards.length) % cards.length];
    if (!cur) return;
    if (cur.kind === 'tool_plow') {
      s.activeTool = s.activeTool === 'plow' ? 'auto' : 'plow';
      s.placementItem = null;
      s.view = SOURCE_VIEW.WORLD_LAYER;
    } else if (cur.kind === 'tool_clear') {
      s.activeTool = s.activeTool === 'clear' ? 'auto' : 'clear';
      s.placementItem = null;
      s.view = SOURCE_VIEW.WORLD_LAYER;
    } else if (cur.kind === 'open_barn') { s.parentView = SOURCE_VIEW.MANOR; s.barnTab = 'goods'; s.barnCursor = 0; s.view = SOURCE_VIEW.BARN; }
    else if (cur.kind === 'open_kitchen') { s.parentView = SOURCE_VIEW.MANOR; s.kitchenTab = 'recipes'; s.kitchenCategory = 'bakery'; s.panelCursor = 0; s.view = SOURCE_VIEW.KITCHEN; }
    else if (cur.kind === 'open_feed_mill') { s.parentView = SOURCE_VIEW.MANOR; s.millTab = 'recipes'; s.panelCursor = 0; s.view = SOURCE_VIEW.FEED_MILL; }
    else if (cur.kind === 'open_collections') { s.parentView = SOURCE_VIEW.MANOR; s.panelCursor = 0; s.view = SOURCE_VIEW.COLLECTIONS; }
    else if (cur.kind === 'open_mailbox') { s.parentView = SOURCE_VIEW.MANOR; s.panelCursor = 0; s.view = SOURCE_VIEW.MAILBOX; }
    else if (cur.kind === 'open_neighbors') { s.parentView = SOURCE_VIEW.MANOR; s.panelCursor = 0; s.view = SOURCE_VIEW.NEIGHBORS; }
    else if (cur.kind === 'open_land') { s.parentView = SOURCE_VIEW.MANOR; s.shopTab = 'land'; s.shopCursor = 0; s.view = SOURCE_VIEW.SHOP; }
    else if (cur.kind === 'toggle_audio') {
      app.audioEnabled = !app.audioEnabled;
      setAudioEnabled(app.audioEnabled);
      s.toast = app.audioEnabled ? '🔊 Đã bật âm thanh & nhạc!' : '🔇 Đã tắt âm thanh!';
      s.toastMs = 1600;
    }
    else if (cur.kind === 'repair_room') { repairManorRoom(s, cur.entityId); saveSession(); }
  } else if (v === SOURCE_VIEW.COOP) {
    if (idx === 0) { s.parentView = SOURCE_VIEW.COOP; s.shopTab = 'animals'; s.shopCursor = 0; s.view = SOURCE_VIEW.SHOP; }
    else if (idx === 1) { s.parentView = SOURCE_VIEW.COOP; s.millTab = 'recipes'; s.panelCursor = 0; s.view = SOURCE_VIEW.FEED_MILL; }
    else {
      const isChicken = s.coopFilter === 'chicken';
      const lookup = s.catalog.allAnimals || s.catalog.animals || [];
      const list = s.animals.filter(a => {
        const spec = lookup.find(sp => sp.id === a.animalId);
        return isChicken ? (spec?.kind === 'chicken' || a.worldBlock === 8) : (spec?.kind !== 'chicken' && a.worldBlock !== 8);
      });
      const animal = list[idx - 2];
      if (animal) {
        const res = collectOrFeedAnimal(s, animal.uid);
        saveSession();
        if (res.reason === 'no_feed') {
          s.parentView = SOURCE_VIEW.COOP;
          s.millTab = 'recipes';
          s.panelCursor = 0;
          s.view = SOURCE_VIEW.FEED_MILL;
        }
      }
    }
  } else if (v === SOURCE_VIEW.MAILBOX) {
    const m = s.neighborMail?.[idx];
    if (m) { claimMail(s, m.id); saveSession(); }
  } else if (v === SOURCE_VIEW.COLLECTIONS) {
    const c = s.catalog.collectibles?.[idx];
    if (c) { sellCollectible(s, c.id); saveSession(); }
  } else if (v === SOURCE_VIEW.QUESTS) {
    const q = s.quests?.[idx];
    if (q) { claimQuestReward(s, q.id); saveSession(); }
  } else if (v === SOURCE_VIEW.NEIGHBORS) {
    // ACTUALLY TRAVEL TO THE NEIGHBOR'S REAL FARM (pack10[5..14])!
    s.parentView = null;
    visitNeighborFarm(s, idx, sourceWorld);
    saveSession();
  }
}

function handleTap(x, y, event) {
  const s = app.session;
  if (s.view === SOURCE_VIEW.OPENING_SCRIPT) {
    app.session = advanceEvidenceView(s, KEY.FIRE);
    event.preventDefault();
    return;
  }

  // --- MODAL UI SCREENS ---
  if (s.view !== SOURCE_VIEW.WORLD_LAYER) {
    // Bottom-right original ⬅ Back button (x >= 196, y >= 282)
    if (x >= 196 && y >= 282) {
      playSfx('click');
      const nextView = s.parentView || SOURCE_VIEW.WORLD_LAYER;
      s.parentView = null;
      s.view = nextView;
      event.preventDefault();
      return;
    }
    // Bottom-left original ✔ Confirm button (x <= 44, y >= 282)
    if (x <= 44 && y >= 282) {
      if (s.view === SOURCE_VIEW.BARN && s.barnTab !== 'upgrade') {
        sellAllGoods(s);
        saveSession();
      } else {
        const idx = s.view === SOURCE_VIEW.SHOP ? s.shopCursor
          : s.view === SOURCE_VIEW.BARN ? s.barnCursor
          : s.view === SOURCE_VIEW.QUESTS ? s.questCursor
          : s.panelCursor;
        handlePanelAction(s, idx);
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.SHOP) {
      // 5 clean Shop Tabs (x=24..216; y=48..80)
      if (y >= 46 && y <= 84 && x >= 20 && x <= 220) {
        const tabIds = ['crops', 'trees', 'animals', 'land', 'decor'];
        const tIdx = Math.max(0, Math.min(4, Math.floor((x - 22) / 39)));
        s.shopTab = tabIds[tIdx];
        s.shopCursor = 0;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (y >= 278 && x > 44 && x < 196) {
        const list = getShopItems(s);
        const pages = Math.max(1, Math.ceil(list.length / 4));
        const curPage = Math.floor(s.shopCursor / 4);
        const nextPage = x < SCREEN_W / 2 ? (curPage - 1 + pages) % pages : (curPage + 1) % pages;
        s.shopCursor = nextPage * 4;
        playSfx('click');
        event.preventDefault();
        return;
      }
      // 2x2 real /6[2] Card Grid click ((31,85), (126,85), (31,182), (126,182))
      if (y >= 84 && y <= 276 && x >= 24 && x <= 220) {
        const col = x < 122 ? 0 : 1;
        const row = y < 180 ? 0 : 1;
        const page = Math.floor(s.shopCursor / 4);
        const targetIdx = page * 4 + row * 2 + col;
        if (targetIdx < getShopItems(s).length) {
          s.shopCursor = targetIdx;
          handlePanelAction(s, targetIdx);
        }
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.KITCHEN) {
      // Tap top header to collect any ready dish!
      if (y <= 42) {
        const readyJob = (s.kitchenQueue || []).find(j => j.ready);
        if (readyJob) { collectKitchenDish(s, readyJob.uid); saveSession(); }
        event.preventDefault();
        return;
      }
      // 4 Kitchen tabs: Tất cả, Làm bánh, Món nấu, Bếp
      if (y >= 44 && y <= 69 && x >= 16 && x <= 224) {
        const tIdx = Math.max(0, Math.min(3, Math.floor((x - 18) / 52)));
        if (tIdx === 3) s.kitchenTab = 'stoves';
        else {
          s.kitchenTab = 'recipes';
          s.kitchenCategory = ['all', 'bakery', 'cooking'][tIdx];
        }
        s.panelCursor = 0;
        playSfx('click');
        event.preventDefault();
        return;
      }
      // Shortcut banner to open Máy xay (Feed Mill)
      if (y >= 70 && y <= 88 && x >= 18 && x <= 222) {
        s.parentView = SOURCE_VIEW.KITCHEN;
        s.millTab = 'recipes';
        s.panelCursor = 0;
        s.view = SOURCE_VIEW.FEED_MILL;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (s.kitchenTab === 'stoves') {
        if (y >= 88 && y <= 272 && x >= 20 && x <= 220) {
          const col = x < 120 ? 0 : 1;
          const row = y < 178 ? 0 : 1;
          handlePanelAction(s, row * 2 + col);
        }
        event.preventDefault();
        return;
      }
      if (y >= 278 && x > 44 && x < 196) {
        const recipes = getKitchenRecipes(s);
        const pages = Math.max(1, Math.ceil(recipes.length / 6));
        const curPage = Math.floor(Math.min(s.panelCursor, Math.max(0, recipes.length - 1)) / 6);
        const nextPage = x < SCREEN_W / 2 ? (curPage - 1 + pages) % pages : (curPage + 1) % pages;
        s.panelCursor = nextPage * 6;
        playSfx('click');
        event.preventDefault();
        return;
      }
      // 3x2 real /6[3] Kitchen Card Grid (x = 20, 88, 155; y = 92, 182)
      if (y >= 88 && y <= 272 && x >= 16 && x <= 224) {
        const col = Math.max(0, Math.min(2, Math.floor((x - 16) / 68)));
        const row = y < 178 ? 0 : 1;
        const recipes = getKitchenRecipes(s);
        const page = Math.floor(Math.min(s.panelCursor, Math.max(0, recipes.length - 1)) / 6);
        const targetIdx = page * 6 + row * 3 + col;
        if (targetIdx < recipes.length) {
          s.panelCursor = targetIdx;
          handlePanelAction(s, targetIdx);
        }
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.FEED_MILL) {
      if (y >= 36 && y <= 58 && x >= 16 && x <= 224) {
        const tIdx = Math.max(0, Math.min(2, Math.floor((x - 18) / 69)));
        s.millTab = ['recipes', 'queue', 'silo'][tIdx];
        s.panelCursor = 0;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (s.millTab === 'queue' && y >= 64 && y <= 264 && x >= 20 && x <= 220) {
        const col = x < 120 ? 0 : 1;
        const row = y < 164 ? 0 : 1;
        handlePanelAction(s, row * 2 + col);
      } else if (s.millTab === 'recipes' && y >= 62 && y <= 278 && x >= 16 && x <= 224) {
        const col = Math.max(0, Math.min(2, Math.floor((x - 16) / 68)));
        const row = y < 170 ? 0 : 1;
        const idx = row * 3 + col;
        if (idx < (s.catalog?.feedRecipes?.length || 0)) {
          s.panelCursor = idx;
          handlePanelAction(s, idx);
        }
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.LAND) {
      const expandable = LAND_ZONES.filter(z => z.id !== 'center');
      const curIdx = Math.max(0, expandable.findIndex(z => z.id === s.selectedLandZoneId));
      if (y >= 90 && y <= 150 && x <= 52) {
        s.selectedLandZoneId = expandable[(curIdx - 1 + expandable.length) % expandable.length].id;
        playSfx('click');
      } else if (y >= 90 && y <= 150 && x >= 188) {
        s.selectedLandZoneId = expandable[(curIdx + 1) % expandable.length].id;
        playSfx('click');
      } else if (y >= 198 && y <= 232 && x >= 44 && x <= 196) {
        handlePanelAction(s, curIdx);
      } else if (y >= 234 && y <= 260 && x >= 52 && x <= 188) {
        s.shopTab = 'land';
        s.shopCursor = 0;
        s.view = SOURCE_VIEW.SHOP;
        playSfx('click');
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.FISHING) {
      const f = s.fishing;
      if (f?.mode === 'menu') {
        if (y >= 170 && y <= 248 && x >= 26 && x <= 214) {
          const rodIdx = Math.min(2, Math.floor((y - 172) / 27));
          const rodTypeMap = [0, 2, 1]; // [Free, Coins, Cash]
          startFishingRound(s, rodTypeMap[rodIdx]);
          saveSession();
        } else if (y >= 252 && y <= 278 && x >= 40 && x <= 200) {
          scoopPondWater(s);
          saveSession();
        }
      } else if (f?.mode === 'playing') {
        const hitBubble = (f.bubbles || []).find(b => Math.hypot(b.x - x, b.y - y) <= 24);
        if (hitBubble) {
          castFishingLine(s, hitBubble.num);
          saveSession();
        }
      } else if (f?.mode === 'result') {
        if (y >= 244 && y <= 276 && x >= 50 && x <= 190) {
          f.mode = 'menu';
          playSfx('click');
        }
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.BARN) {
      // 2 Barn tabs (Goods vs Upgrades)
      if (y >= 48 && y <= 94 && x >= 12 && x <= 124) {
        s.barnTab = x < 68 ? 'goods' : 'upgrade';
        s.barnCursor = 0;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (s.barnTab === 'upgrade') {
        if (y >= 110 && y <= 268 && x >= 26 && x <= 214) {
          const col = x < 120 ? 0 : 1;
          const row = y < 188 ? 0 : 1;
          const idx = row * 2 + col;
          s.barnCursor = idx;
          handlePanelAction(s, idx);
        }
        event.preventDefault();
        return;
      }
      const totalItems = s.inventory.size + 1;
      const pages = Math.max(1, Math.ceil(totalItems / 6));
      const curPage = Math.floor(s.barnCursor / 6);
      if (y >= 140 && y <= 220 && x <= 30) {
        s.barnCursor = ((curPage - 1 + pages) % pages) * 6;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (y >= 140 && y <= 220 && x >= 208) {
        s.barnCursor = ((curPage + 1) % pages) * 6;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (y >= 110 && y <= 268 && x >= 28 && x <= 210) {
        const col = Math.max(0, Math.min(2, Math.floor((x - 30) / 60)));
        const row = y < 188 ? 0 : 1;
        const targetIdx = curPage * 6 + row * 3 + col;
        if (targetIdx < totalItems) {
          s.barnCursor = targetIdx;
          handlePanelAction(s, targetIdx);
        }
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.MANOR) {
      if (y >= 32 && y <= 50 && x >= 16 && x <= 224) {
        const tIdx = Math.max(0, Math.min(2, Math.floor((x - 18) / 69)));
        if (tIdx === 1) {
          s.parentView = SOURCE_VIEW.MANOR;
          s.kitchenTab = 'recipes';
          s.kitchenCategory = 'bakery';
          s.panelCursor = 0;
          s.view = SOURCE_VIEW.KITCHEN;
        } else if (tIdx === 2) {
          s.parentView = SOURCE_VIEW.MANOR;
          s.millTab = 'recipes';
          s.panelCursor = 0;
          s.view = SOURCE_VIEW.FEED_MILL;
        }
        playSfx('click');
        event.preventDefault();
        return;
      }
      const cards = getManorCards(s);
      if (x <= 52 && y >= 100 && y <= 220) {
        s.panelCursor = (s.panelCursor - 1 + cards.length) % cards.length;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (x >= 188 && y >= 100 && y <= 220) {
        s.panelCursor = (s.panelCursor + 1) % cards.length;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (y >= 210 && y <= 254 && x >= 60 && x <= 184) {
        handlePanelAction(s, s.panelCursor);
        event.preventDefault();
        return;
      }
      event.preventDefault();
      return;
    }

    if (s.view === SOURCE_VIEW.QUESTS || s.view === SOURCE_VIEW.NEIGHBORS) {
      if (y >= 36 && y <= 55) {
        s.view = x < SCREEN_W / 2 ? SOURCE_VIEW.QUESTS : SOURCE_VIEW.NEIGHBORS;
        s.panelCursor = 0;
        playSfx('click');
        event.preventDefault();
        return;
      }
      if (s.view === SOURCE_VIEW.NEIGHBORS && y >= 56 && y <= 280) {
        const list = s.catalog.neighbors || [];
        const start = Math.max(0, Math.min(Math.max(0, list.length - 8), s.panelCursor - 3));
        const rowSlot = Math.max(0, Math.min(7, Math.floor((y - 58) / 27)));
        const idx = start + rowSlot;
        if (idx >= 0 && idx < list.length) { s.panelCursor = idx; handlePanelAction(s, idx); }
      } else if (s.view === SOURCE_VIEW.QUESTS && y >= 140 && y <= 280) {
        const list = s.quests || [];
        const start = Math.max(0, Math.min(Math.max(0, list.length - 5), s.questCursor - 2));
        const rowSlot = Math.max(0, Math.min(4, Math.floor((y - 142) / 26)));
        const idx = start + rowSlot;
        if (idx >= 0 && idx < list.length) {
          s.questCursor = idx;
          if (list[idx].completed && !list[idx].claimed) handlePanelAction(s, idx);
        }
      }
      event.preventDefault();
      return;
    }

    // Standard Parchment Lists (Barn, Manor, Coop, Mailbox, Collections, Seed Picker)
    if (y >= 40 && y <= 278) {
      const cur = s.view === SOURCE_VIEW.BARN ? s.barnCursor : s.panelCursor;
      const start = Math.max(0, cur - 4);
      const idx = start + Math.floor((y - 40) / 26);
      if (s.view === SOURCE_VIEW.BARN) s.barnCursor = idx;
      else s.panelCursor = idx;
      handlePanelAction(s, idx);
    }
    event.preventDefault();
    return;
  }

  // --- ON-WORLD SEED CAROUSEL TAP (/6[1] widgets 73, 75..78, 82 — a.java:3804-3936) ---
  if (s.seedCarousel && !s.visitingNeighbor) {
    const fieldCrops = (s.catalog?.crops || []).filter(c => c.id !== 3000 && !c.isTree);
    const count = fieldCrops.length;
    if (x >= 198 && y >= 278) {
      s.seedCarousel = null;
      playSfx('click');
      event.preventDefault();
      return;
    }
    if (y >= 254 && x >= 40 && x < 198 && count > 0) {
      if (x < 100) {
        s.seedCarousel.index = (s.seedCarousel.index - 1 + count) % count;
        playSfx('click');
      } else if (x > 146) {
        s.seedCarousel.index = (s.seedCarousel.index + 1) % count;
        playSfx('click');
      } else {
        const chosen = fieldCrops[s.seedCarousel.index];
        const sc = s.seedCarousel;
        if (chosen && s.level >= (chosen.unlockLevel || 1)) {
          s.selectedCropId = chosen.id;
          s.seedCarousel = null;
          setFarmerWalkTarget(s, sc.worldX, sc.worldY + 4, {
            type: 'plant_seed', row: sc.row, col: sc.col, cropId: chosen.id,
          });
          saveSession();
        } else if (chosen) {
          s.toast = `${chosen.name} mở khóa ở Cấp ${chosen.unlockLevel}!`;
          s.toastMs = 2000;
        }
      }
      event.preventDefault();
      return;
    }
    // Tapping outside the carousel closes it
    s.seedCarousel = null;
  }

  // --- WORLD HUD BUTTONS ---
  // Zoom toggle badge (202..236, 42..56)
  if (x >= 200 && y >= 40 && y <= 58) {
    const levels = [0.75, 0.85, 1.0];
    const nextIdx = (levels.findIndex(z => Math.abs(z - (s.worldZoom || 1)) < 0.05) + 1) % levels.length;
    s.worldZoom = levels[nextIdx];
    clampWorldCamera(s, sourceWorld?.tileMap);
    playSfx('click');
    event.preventDefault();
    return;
  }
  // Top-right Pause/Menu icon [41]
  if (x >= 198 && y <= 39) {
    s.parentView = null;
    s.panelCursor = 0;
    s.view = SOURCE_VIEW.MANOR;
    playSfx('click');
    event.preventDefault();
    return;
  }
  // Return Home button when visiting a neighbor
  if (s.visitingNeighbor && x >= 152 && y >= SCREEN_H - 40) {
    playSfx('click');
    returnHomeFarm(s, sourceWorld?.tileMap);
    event.preventDefault();
    return;
  }
  // Bottom-left Clipboard/Quest icon [52]+[63]
  if (x <= 68 && y >= 274) {
    s.parentView = null;
    s.view = SOURCE_VIEW.QUESTS;
    playSfx('click');
    event.preventDefault();
    return;
  }
  // Bottom-right Market Stand icon [67]
  if (!s.visitingNeighbor && x >= 192 && y >= 274) {
    s.parentView = null;
    s.view = SOURCE_VIEW.SHOP;
    playSfx('click');
    event.preventDefault();
    return;
  }

  // --- WORLD INTERACTION ---
  const { wx, wy } = screenToWorld(s, x, y);

  // Visiting Neighbor Farm interaction: tap any crop / tree / animal to walk & help!
  if (s.visitingNeighbor) {
    const vn = s.visitingNeighbor;
    const targetEnt = (vn.entities || []).find(
      e => (e.category === 49 || e.category === 52 || e.category === 54) && Math.hypot(e.x - wx, e.y - wy) <= 30,
    );
    if (targetEnt) {
      setFarmerWalkTarget(s, targetEnt.x, targetEnt.y + 10, {
        type: 'neighbor_help', opaqueKey: targetEnt.opaqueKey, worldX: targetEnt.x, worldY: targetEnt.y,
      });
      saveSession();
    } else {
      setFarmerWalkTarget(s, wx, wy, null);
    }
    event.preventDefault();
    return;
  }

  const hit = sourceTileAt(sourceWorld.tileMap, wx - s.cameraX, wy - s.cameraY, s.cameraX, s.cameraY);

  if (s.activeTool === 'place' && s.placementItem && hit) {
    if (!isPointInUnlockedLand(s, wx, wy)) {
      const z = findLandZoneAtPoint(wx, wy);
      if (z) {
        s.selectedLandZoneId = z.id;
        s.parentView = null;
        s.view = SOURCE_VIEW.LAND;
        playSfx('click');
        event.preventDefault();
        return;
      }
    }
    setFarmerWalkTarget(s, wx, wy, { type: 'place', item: s.placementItem, row: hit.row, col: hit.column, worldX: wx, worldY: wy });
    saveSession();
    event.preventDefault();
    return;
  }

  if (s.activeTool === 'plow' && hit) {
    if (!isPointInUnlockedLand(s, wx, wy)) {
      const z = findLandZoneAtPoint(wx, wy);
      if (z) {
        s.selectedLandZoneId = z.id;
        s.parentView = null;
        s.view = SOURCE_VIEW.LAND;
        playSfx('click');
        event.preventDefault();
        return;
      }
    }
    s.cursorRow = hit.row;
    s.cursorCol = hit.column;
    setFarmerWalkTarget(s, wx, wy, { type: 'tile', row: hit.row, col: hit.column, worldX: wx, worldY: wy });
    saveSession();
    event.preventDefault();
    return;
  }

  const clearedSet = new Set(s.clearedDebris || []);
  const hitDebris = (sourceWorld?.farmEntities || []).find(
    e => e.category === 48 && !clearedSet.has(e.opaqueKey) && Math.hypot(e.x - wx, e.y - wy) <= 22,
  );
  if (s.activeTool === 'clear' && hitDebris) {
    setFarmerWalkTarget(s, hitDebris.x, hitDebris.y + 8, {
      type: 'debris', opaqueKey: hitDebris.opaqueKey, worldX: hitDebris.x, worldY: hitDebris.y,
    });
    saveSession();
    event.preventDefault();
    return;
  }

  // Plots (cat 49) take priority when planting or tending crops
  let hitPlot = null;
  let bestPlotDist = 28;
  for (const plot of s.plots.values()) {
    const px = plot.worldX ?? (plot.col * 36 + 18);
    const py = plot.worldY ?? (plot.row * 18 + 9);
    const visualY = plot.stage === 'tilled' ? py : (py - 8);
    const d = Math.hypot((px - wx) * 0.75, visualY - wy);
    if (d < bestPlotDist) { bestPlotDist = d; hitPlot = plot; }
  }
  if (hitPlot && s.activeTool === 'plant' && hitPlot.stage === 'tilled') {
    const px = hitPlot.worldX ?? (hitPlot.col * 36 + 18);
    const py = hitPlot.worldY ?? (hitPlot.row * 18 + 9);
    const cropId = s.selectedCropId;
    s.activeTool = 'auto';
    setFarmerWalkTarget(s, px, py + 4, {
      type: 'plant_seed', row: hitPlot.row, col: hitPlot.col, cropId,
    });
    saveSession();
    event.preventDefault();
    return;
  }

  // Buildings (cat 50) — walk to clear entrance outside building/Pond footprint
  const hitB = findTargetBuilding(sourceWorld?.farmEntities, wx, wy, 'tap');
  if (hitB) {
    setFarmerWalkTarget(s, hitB.entity.x, hitB.entity.y + hitB.spec.approachDy, { type: 'building', entityId: hitB.entity.entityId });
    event.preventDefault();
    return;
  }

  // Fruit Trees (cat 52)
  const hitTree = (s.fruitTrees || []).find(t => Math.hypot(t.worldX - wx, (t.worldY - 12) - wy) <= 24);
  if (hitTree && hitTree.ready) {
    setFarmerWalkTarget(s, hitTree.worldX, hitTree.worldY + 10, { type: 'tree', uid: hitTree.uid });
    event.preventDefault();
    return;
  }

  // Farm Animals (cat 54)
  const hitAnimal = (s.animals || []).find(a => Math.hypot((a.worldX ?? a.col * 36 + 18) - wx, (a.worldY ?? a.row * 18 + 9) - wy) <= 24);
  if (hitAnimal) {
    const ax = hitAnimal.worldX ?? (hitAnimal.col * 36 + 18);
    const ay = hitAnimal.worldY ?? (hitAnimal.row * 18 + 9);
    setFarmerWalkTarget(s, ax, ay + 8, { type: 'animal', uid: hitAnimal.uid });
    event.preventDefault();
    return;
  }

  if (hitPlot) {
    s.cursorRow = hitPlot.row;
    s.cursorCol = hitPlot.col;
    const px = hitPlot.worldX ?? (hitPlot.col * 36 + 18);
    const py = hitPlot.worldY ?? (hitPlot.row * 18 + 9);
    setFarmerWalkTarget(s, px, py + 8, {
      type: 'tile', row: hitPlot.row, col: hitPlot.col, worldX: px, worldY: py,
      openSeedPicker: hitPlot.stage === 'tilled',
    });
    saveSession();
    event.preventDefault();
    return;
  }

  if (hitDebris) {
    setFarmerWalkTarget(s, hitDebris.x, hitDebris.y + 8, {
      type: 'debris', opaqueKey: hitDebris.opaqueKey, worldX: hitDebris.x, worldY: hitDebris.y,
    });
    saveSession();
    event.preventDefault();
    return;
  }

  // Tapping empty ground inside an unowned land parcel opens the direct Land Purchase screen
  const tappedZone = findLandZoneAtPoint(wx, wy);
  if (tappedZone && !(s.unlockedZones || ['center']).includes(tappedZone.id)) {
    s.selectedLandZoneId = tappedZone.id;
    s.parentView = null;
    s.view = SOURCE_VIEW.LAND;
    playSfx('click');
    event.preventDefault();
    return;
  }

  if (hit) {
    s.cursorRow = hit.row;
    s.cursorCol = hit.column;
    setFarmerWalkTarget(s, wx, wy, null);
  }
  event.preventDefault();
}

const heldKeys = new Set();
function onKeyUp(event) { heldKeys.delete(event.code); }

function getHeldMoveVector() {
  let vx = 0; let vy = 0;
  if (heldKeys.has('ArrowLeft') || heldKeys.has('KeyA')) vx -= 1;
  if (heldKeys.has('ArrowRight') || heldKeys.has('KeyD')) vx += 1;
  if (heldKeys.has('ArrowUp') || heldKeys.has('KeyW')) vy -= 1;
  if (heldKeys.has('ArrowDown') || heldKeys.has('KeyS')) vy += 1;
  return { vx, vy };
}

function onKeyDown(event) {
  if (!app?.session) return;
  const code = mapKeyCode(event.code, event.key);
  const s = app.session;
  if (['ArrowUp', 'ArrowDown', 'ArrowLeft', 'ArrowRight', 'KeyW', 'KeyA', 'KeyS', 'KeyD'].includes(event.code)) {
    heldKeys.add(event.code);
  }
  if (s.view === SOURCE_VIEW.OPENING_SCRIPT) {
    const previous = app.session;
    app.session = advanceEvidenceView(s, code);
    if (previous !== app.session) event.preventDefault();
    return;
  }
  if (s.view !== SOURCE_VIEW.WORLD_LAYER) {
    if (s.view === SOURCE_VIEW.FISHING && s.fishing?.mode === 'playing') {
      const digitMatch = /^([1-9])$/.exec(event.key || '');
      if (digitMatch) {
        castFishingLine(s, Number(digitMatch[1]));
        saveSession();
        event.preventDefault();
        return;
      }
    }
    if (code === KEY.SK_RIGHT || event.code === 'Escape' || event.key === 'Escape') {
      const nextView = s.parentView || SOURCE_VIEW.WORLD_LAYER;
      s.parentView = null;
      s.view = nextView;
      playSfx('click');
      event.preventDefault();
    } else if (code === KEY.SK_LEFT) {
      if (s.view === SOURCE_VIEW.SHOP) {
        const order = ['crops', 'trees', 'animals', 'land', 'decor'];
        s.shopTab = order[(order.indexOf(s.shopTab) + 1) % order.length];
        s.shopCursor = 0;
      } else if (s.view === SOURCE_VIEW.BARN) {
        sellAllGoods(s); saveSession();
      } else if (s.view === SOURCE_VIEW.QUESTS) {
        s.view = SOURCE_VIEW.NEIGHBORS; s.panelCursor = 0;
      } else if (s.view === SOURCE_VIEW.NEIGHBORS) {
        s.view = SOURCE_VIEW.QUESTS;
      }
      event.preventDefault();
    } else if (code === KEY.UP || code === KEY.DOWN || code === KEY.LEFT || code === KEY.RIGHT) {
      const delta = (code === KEY.UP || code === KEY.LEFT) ? -1 : 1;
      if (s.view === SOURCE_VIEW.SHOP) {
        const len = Math.max(1, getShopItems(s).length);
        const step = (code === KEY.UP || code === KEY.DOWN) ? delta * 2 : delta;
        s.shopCursor = (s.shopCursor + step + len) % len;
      } else if (s.view === SOURCE_VIEW.BARN) {
        const len = s.barnTab === 'upgrade' ? 4 : Math.max(1, s.inventory.size + 1);
        s.barnCursor = (s.barnCursor + delta + len) % len;
      } else if (s.view === SOURCE_VIEW.QUESTS) {
        const len = Math.max(1, s.quests?.length || 1);
        s.questCursor = (s.questCursor + delta + len) % len;
      } else if (s.view === SOURCE_VIEW.MANOR) {
        const len = getManorCards(s).length;
        s.panelCursor = (s.panelCursor + delta + len) % len;
      } else if (s.view === SOURCE_VIEW.LAND) {
        const exp = LAND_ZONES.filter(z => z.id !== 'center');
        const curIdx = Math.max(0, exp.findIndex(z => z.id === s.selectedLandZoneId));
        s.selectedLandZoneId = exp[(curIdx + delta + exp.length) % exp.length].id;
      } else if (s.view === SOURCE_VIEW.FEED_MILL) {
        const len = s.millTab === 'queue' ? 4 : Math.max(1, s.catalog?.feedRecipes?.length || 6);
        s.panelCursor = (s.panelCursor + delta + len) % len;
      } else {
        const len = s.view === SOURCE_VIEW.KITCHEN
          ? (s.kitchenTab === 'stoves' ? 4 : Math.max(1, getKitchenRecipes(s).length))
          : s.view === SOURCE_VIEW.NEIGHBORS ? (s.catalog.neighbors?.length || 1) : 16;
        s.panelCursor = (s.panelCursor + delta + len) % len;
      }
      event.preventDefault();
    } else if (code === KEY.FIRE || code === 5) {
      const idx = s.view === SOURCE_VIEW.SHOP ? s.shopCursor
        : s.view === SOURCE_VIEW.BARN ? s.barnCursor
        : s.view === SOURCE_VIEW.QUESTS ? s.questCursor
        : s.panelCursor;
      handlePanelAction(s, idx);
      event.preventDefault();
    }
    return;
  }

  const tm = sourceWorld?.tileMap;
  // On-world Seed Carousel keyboard controls (Left/Right scroll, Enter plants, Esc closes!)
  if (s.seedCarousel && !s.visitingNeighbor) {
    const fieldCrops = (s.catalog?.crops || []).filter(c => c.id !== 3000 && !c.isTree);
    const count = fieldCrops.length;
    if (code === KEY.LEFT && count > 0) {
      s.seedCarousel.index = (s.seedCarousel.index - 1 + count) % count;
      event.preventDefault();
      return;
    }
    if (code === KEY.RIGHT && count > 0) {
      s.seedCarousel.index = (s.seedCarousel.index + 1) % count;
      event.preventDefault();
      return;
    }
    if ((code === KEY.FIRE || code === 5) && count > 0) {
      const chosen = fieldCrops[s.seedCarousel.index];
      const sc = s.seedCarousel;
      if (chosen && s.level >= (chosen.unlockLevel || 1)) {
        s.selectedCropId = chosen.id;
        s.seedCarousel = null;
        setFarmerWalkTarget(s, sc.worldX, sc.worldY + 4, {
          type: 'plant_seed', row: sc.row, col: sc.col, cropId: chosen.id,
        });
        saveSession();
      }
      event.preventDefault();
      return;
    }
    if (code === KEY.SK_RIGHT || event.code === 'Escape' || event.key === 'Escape') {
      s.seedCarousel = null;
      s.activeTool = 'auto';
      playSfx('click');
      event.preventDefault();
      return;
    }
  }

  if (code === KEY.UP || code === KEY.DOWN || code === KEY.LEFT || code === KEY.RIGHT) {
    const { vx, vy } = getHeldMoveVector();
    moveFarmerByVector(s, vx, vy, 55, tm);
    event.preventDefault();
    return;
  }
  if (event.code === 'Escape') {
    s.activeTool = 'auto';
    s.placementItem = null;
    s.toast = '';
    event.preventDefault();
    return;
  }
  if (code === KEY.SK_RIGHT && (s.activeTool !== 'auto' || s.placementItem || s.toast)) {
    s.activeTool = 'auto';
    s.placementItem = null;
    s.toast = '';
    event.preventDefault();
    return;
  }
  if (code === KEY.FIRE || code === 5) {
    const fx = s.farmer ? s.farmer.x : (s.cursorCol * 36 + 18);
    const fy = s.farmer ? s.farmer.y : (s.cursorRow * 18 + 9);
    if (s.visitingNeighbor) {
      const targetEnt = (s.visitingNeighbor.entities || []).find(
        e => (e.category === 49 || e.category === 52 || e.category === 54) && Math.hypot(e.x - fx, e.y - fy) <= 44,
      );
      if (targetEnt) {
        setFarmerWalkTarget(s, targetEnt.x, targetEnt.y + 8, {
          type: 'neighbor_help', opaqueKey: targetEnt.opaqueKey, worldX: targetEnt.x, worldY: targetEnt.y,
        });
        saveSession();
      }
      event.preventDefault();
      return;
    }
    const nearB = findTargetBuilding(sourceWorld?.farmEntities, fx, fy, 'key');
    const nearTree = (s.fruitTrees || []).find(t => t.ready && Math.hypot(t.worldX - fx, t.worldY - fy) <= 34);
    const nearAnimal = (s.animals || []).find(a => Math.hypot((a.worldX ?? a.col * 36 + 18) - fx, (a.worldY ?? a.row * 18 + 9) - fy) <= 32);
    let nearPlot = null; let bestD = 36;
    for (const p of s.plots.values()) {
      const d = Math.hypot((p.worldX ?? p.col * 36 + 18) - fx, (p.worldY ?? p.row * 18 + 9) - fy);
      if (d < bestD) { bestD = d; nearPlot = p; }
    }
    if (nearPlot && s.activeTool === 'plant' && nearPlot.stage === 'tilled') {
      const cropId = s.selectedCropId;
      s.activeTool = 'auto';
      setFarmerWalkTarget(s, nearPlot.worldX ?? fx, (nearPlot.worldY ?? fy) + 4, {
        type: 'plant_seed', row: nearPlot.row, col: nearPlot.col, cropId,
      });
    } else if (nearPlot) {
      setFarmerWalkTarget(s, nearPlot.worldX ?? fx, (nearPlot.worldY ?? fy) + 6, {
        type: 'tile', row: nearPlot.row, col: nearPlot.col, worldX: nearPlot.worldX, worldY: nearPlot.worldY,
        openSeedPicker: nearPlot.stage === 'tilled',
      });
    } else if (nearTree) {
      setFarmerWalkTarget(s, nearTree.worldX, nearTree.worldY + 8, { type: 'tree', uid: nearTree.uid });
    } else if (nearAnimal) {
      setFarmerWalkTarget(s, nearAnimal.worldX ?? fx, (nearAnimal.worldY ?? fy) + 6, { type: 'animal', uid: nearAnimal.uid });
    } else if (nearB) {
      const tx = isWalkBlocked(fx, fy) ? nearB.entity.x : fx;
      const ty = isWalkBlocked(fx, fy) ? (nearB.entity.y + nearB.spec.approachDy) : fy;
      setFarmerWalkTarget(s, tx, ty, { type: 'building', entityId: nearB.entity.entityId });
    } else {
      setFarmerWalkTarget(s, fx, fy, { type: 'tile', row: s.cursorRow, col: s.cursorCol, worldX: fx, worldY: fy });
    }
    saveSession();
  } else if (code === KEY.SK_LEFT) {
    s.parentView = null;
    s.view = SOURCE_VIEW.QUESTS;
  } else if (code === KEY.SK_RIGHT) {
    s.parentView = null;
    s.view = SOURCE_VIEW.SHOP;
  } else return;
  event.preventDefault();
}

function setAudioEnabled(enabled) {
  if (typeof Audio === 'undefined') return;
  if (!audioElement) {
    const probe = new Audio();
    if (!probe.canPlayType?.('audio/midi')) return;
    audioElement = new Audio(new URL('assets/audio/gf3_b000.mid', import.meta.url));
    audioElement.loop = true;
  }
  if (enabled) audioElement.play().catch(() => {});
  else audioElement.pause();
}

if (typeof window !== 'undefined') {
  app = { session: null, audioEnabled: true };
  bootAssets().then(() => {
    let savedRaw = null;
    try { savedRaw = localStorage.getItem(SAVE_KEY); } catch { /* ignore */ }
    app.session = savedRaw
      ? restoreFarmSession(savedRaw, sourceWorld, textData)
      : createFarmSession(sourceWorld, textData);
    canvasEl.tabIndex = 0;
    window.addEventListener('keydown', onKeyDown, true);
    window.addEventListener('keyup', onKeyUp);
    window.addEventListener('blur', () => heldKeys.clear());
    canvasEl.addEventListener('pointerdown', onPointerDown);
    canvasEl.addEventListener('pointermove', onPointerMove);
    canvasEl.addEventListener('pointerup', onPointerUp);
    canvasEl.addEventListener('pointercancel', onPointerUp);
    canvasEl.addEventListener('wheel', (e) => {
      const s = app.session;
      if (!s) return;
      if (s.view === SOURCE_VIEW.WORLD_LAYER) {
        s.worldZoom = e.deltaY > 0 ? Math.max(0.75, (s.worldZoom || 1.0) - 0.1) : Math.min(1.0, (s.worldZoom || 1.0) + 0.1);
        clampWorldCamera(s, sourceWorld?.tileMap);
      } else {
        const delta = e.deltaY > 0 ? 1 : -1;
        if (s.view === SOURCE_VIEW.NEIGHBORS) {
          const len = s.catalog.neighbors?.length || 1;
          s.panelCursor = Math.max(0, Math.min(len - 1, s.panelCursor + delta));
        } else if (s.view === SOURCE_VIEW.QUESTS) {
          const len = s.quests?.length || 1;
          s.questCursor = Math.max(0, Math.min(len - 1, s.questCursor + delta));
        } else if (s.view === SOURCE_VIEW.SHOP) {
          const len = getShopItems(s).length || 1;
          const pages = Math.max(1, Math.ceil(len / 4));
          const curP = Math.floor(s.shopCursor / 4);
          s.shopCursor = ((curP + delta + pages) % pages) * 4;
        } else if (s.view === SOURCE_VIEW.KITCHEN && s.kitchenTab !== 'stoves') {
          const len = getKitchenRecipes(s).length || 1;
          const pages = Math.max(1, Math.ceil(len / 6));
          const curP = Math.floor(Math.min(s.panelCursor, len - 1) / 6);
          s.panelCursor = ((curP + delta + pages) % pages) * 6;
        } else if (s.view === SOURCE_VIEW.BARN && s.barnTab !== 'upgrade') {
          const len = (s.inventory.size + 1) || 1;
          const pages = Math.max(1, Math.ceil(len / 6));
          const curP = Math.floor(s.barnCursor / 6);
          s.barnCursor = ((curP + delta + pages) % pages) * 6;
        } else if (s.view === SOURCE_VIEW.MANOR) {
          const len = getManorCards(s).length;
          s.panelCursor = (s.panelCursor + delta + len) % len;
        } else {
          s.panelCursor = Math.max(0, s.panelCursor + delta);
        }
      }
      e.preventDefault();
    }, { passive: false });
    window.addEventListener('keydown', (event) => {
      if (event.code === 'KeyM') {
        app.audioEnabled = !app.audioEnabled;
        setAudioEnabled(app.audioEnabled);
      }
    });
    window.__gf3 = { app, sourceWorld, saveSession };
    mountPhaserRuntime({
      canvas: canvasEl,
      width: SCREEN_W,
      height: SCREEN_H,
      tickMs: 50,
      onStepSimulation() {
        if (app.session?.view === SOURCE_VIEW.WORLD_LAYER) {
          const { vx, vy } = getHeldMoveVector();
          moveFarmerByVector(app.session, vx, vy, 50, sourceWorld?.tileMap);
        }
        stepFarmSession(app.session, 50, sourceWorld?.tileMap);
      },
      onFrameInterpolate() { return false; },
      onRenderFrame(ctx) { renderFrame(ctx, performance.now()); },
    });
  }).catch((error) => {
    console.error('Green Farm source resource load failed:', error);
    const status = document.getElementById('status');
    if (status) status.textContent = `Không thể đọc dữ liệu nguồn: ${error.message}`;
  });
}
