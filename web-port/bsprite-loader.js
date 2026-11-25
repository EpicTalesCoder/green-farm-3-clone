/** Source-driven resource and BSprite loader for Green Farm 3. */

// Port of f.java:457-545 (split pack stream and offset table).
export async function loadSplitPack(baseUrl, fetcher = fetch, chunkCount = null) {
  const response = await fetcher(baseUrl);
  if (!response.ok) throw new Error(`Cannot load pack index ${baseUrl}: ${response.status}`);
  const base = new Uint8Array(await response.arrayBuffer());
  const view = new DataView(base.buffer, base.byteOffset, base.byteLength);
  if (base.length < 2) throw new RangeError('Pack index is shorter than its count');
  const count = view.getUint16(0, true);
  const headerLength = 2 + count * 4;
  if (headerLength > base.length) throw new RangeError('Pack offset table exceeds index data');
  const offsets = Array.from({ length: count }, (_, index) => view.getUint32(2 + index * 4, true));
  if (offsets.some((offset, index) => index > 0 && offset < offsets[index - 1])) {
    throw new RangeError('Pack offsets are not monotonically increasing');
  }

  const chunks = [base];
  if (chunkCount === null) {
    const packDirectory = new URL('.', baseUrl);
    const manifestUrl = new URL('manifest.json', packDirectory).href;
    const manifestResponse = await fetcher(manifestUrl);
    if (manifestResponse.ok) {
      const manifest = await manifestResponse.json();
      chunkCount = manifest.chunk_count;
    } else {
      const directoryResponse = await fetcher(packDirectory.href);
      if (directoryResponse.ok) {
        const directory = await directoryResponse.text();
        const matches = [...directory.matchAll(/href=["']([^"']+)["']/g)]
          .map((match) => decodeURIComponent(match[1].split('/').pop()))
          .map((name) => /^(\d+)\.(\d+)$/.exec(name))
          .filter((match) => match && match[1] === new URL(baseUrl).pathname.split('/').pop())
          .map((match) => Number(match[2]));
        if (matches.length) chunkCount = Math.max(...matches);
      }
    }
  }
  if (chunkCount !== null && (!Number.isInteger(chunkCount) || chunkCount < 0)) {
    throw new RangeError(`Invalid split-pack chunk count: ${chunkCount}`);
  }
  for (let index = 1; chunkCount === null || index <= chunkCount; index += 1) {
    const url = `${baseUrl}.${index}`;
    const chunkResponse = await fetcher(url);
    if (chunkCount === null && chunkResponse.status === 404) break;
    if (!chunkResponse.ok) throw new Error(`Cannot load pack chunk ${url}: ${chunkResponse.status}`);
    chunks.push(new Uint8Array(await chunkResponse.arrayBuffer()));
  }

  const totalLength = chunks.reduce((sum, chunk) => sum + chunk.length, 0);
  const virtual = new Uint8Array(totalLength);
  let cursor = 0;
  for (const chunk of chunks) {
    virtual.set(chunk, cursor);
    cursor += chunk.length;
  }
  if (offsets.some((offset) => offset > totalLength)) throw new RangeError('Pack offset exceeds split stream length');
  return { offsets, virtual, chunkLengths: chunks.map((chunk) => chunk.length) };
}

// Port of f.java:526-545, including its one-byte discard at each block start.
export function readPackBlock(pack, blockIndex) {
  if (!Number.isInteger(blockIndex) || blockIndex < 0 || blockIndex + 1 >= pack.offsets.length) {
    throw new RangeError(`Pack block index out of bounds: ${blockIndex}`);
  }
  const start = pack.offsets[blockIndex] + 1;
  const end = pack.offsets[blockIndex + 1];
  if (start > end || end > pack.virtual.length) throw new RangeError('Malformed pack block bounds');
  return pack.virtual.slice(start, end);
}

class Reader {
  constructor(bytes) { this.bytes = bytes; this.offset = 0; }
  take(size, label) {
    if (!Number.isInteger(size) || size < 0 || this.offset + size > this.bytes.length) {
      throw new RangeError(`Truncated ${label} at ${this.offset}; need ${size} bytes`);
    }
    const value = this.bytes.subarray(this.offset, this.offset + size);
    this.offset += size;
    return value;
  }
  u8(label) { return this.take(1, label)[0]; }
  i8(label) { return (this.u8(label) << 24) >> 24; }
  u16(label) {
    const b = this.take(2, label);
    return b[0] | (b[1] << 8);
  }
  i16(label) { return (this.u16(label) << 16) >> 16; }
  u32(label) {
    const b = this.take(4, label);
    return (b[0] | (b[1] << 8) | (b[2] << 16) | (b[3] << 24)) >>> 0;
  }
}

function readColor(reader, pixelFormat, label) {
  if ([0x5515, 0x1555, 0x0565, 0x4444].includes(pixelFormat)) return reader.u16(label);
  if (pixelFormat === 0x3203) return reader.u8(label);
  if (pixelFormat === 0x8888) return reader.u32(label);
  throw new RangeError(`Unsupported BSprite pixel format 0x${pixelFormat.toString(16)}`);
}

function colorToRgba(raw, pixelFormat) {
  let r; let g; let b; let a;
  if (pixelFormat === 0x5515 || pixelFormat === 0x1555) {
    a = (raw & 0x8000) !== 0 ? 255 : 0;
    r = ((raw >>> 10) & 31) << 3;
    g = ((raw >>> 5) & 31) << 3;
    b = (raw & 31) << 3;
    // Port of d.java:835-836: source magenta key preserves its transparent alpha.
    if (a === 0 && r === 248 && g === 0 && b === 248) return [255, 0, 255, 0];
  } else if (pixelFormat === 0x0565) {
    a = 255; r = ((raw >>> 11) & 31) << 3; g = ((raw >>> 5) & 63) << 2; b = (raw & 31) << 3;
  } else if (pixelFormat === 0x3203) {
    a = raw === 192 ? 0 : 255;
    r = raw & 0xe0;
    g = (raw & 0x1c) << 3;
    b = (raw & 3) << 6;
  } else if (pixelFormat === 0x4444) {
    a = ((raw >>> 12) & 15) * 17; r = ((raw >>> 8) & 15) * 17; g = ((raw >>> 4) & 15) * 17; b = (raw & 15) * 17;
  } else if (pixelFormat === 0x8888) {
    a = (raw >>> 24) & 255; r = (raw >>> 16) & 255; g = (raw >>> 8) & 255; b = raw & 255;
  }
  return [r, g, b, a];
}

// Port of d.java:212-369 (BSprite modules, FModules, frame and bounds tables).
export function parseStructure(reader, flags) {
  const modules = [];
  const modulePaletteIndices = [];
  const moduleGeometry = [];
  const moduleCount = reader.u16('module count');
  for (let index = 0; index < moduleCount; index += 1) {
    const type = reader.u8(`module ${index} type`);
    const module = { type };
    let hasU32 = false; let hasWh = false; let hasTwoU16 = false; let hasFourU16 = false; let hasF7Fields = false;
    if (type === 0x00) { hasWh = true; }
    else if (type === 0xff) { hasU32 = true; hasWh = true; }
    else if (type === 0xfe) { hasU32 = true; hasWh = true; }
    else if (type === 0xfd) { hasWh = true; }
    else if (type === 0xfc) { hasU32 = true; hasWh = true; hasTwoU16 = true; }
    else if (type === 0xfb) { hasU32 = true; hasWh = true; hasTwoU16 = true; }
    else if (type === 0xfa || type === 0xf9) { hasU32 = true; hasFourU16 = true; }
    else if (type === 0xf8) { hasU32 = true; hasWh = true; }
    else if (type === 0xf7) { hasU32 = true; hasF7Fields = true; hasWh = true; }
    else throw new RangeError(`Invalid BSprite module type 0x${type.toString(16)}`);
    if (hasU32) module.colorOrParameter = reader.u32(`module ${index} color/parameter`);
    if (hasF7Fields) { module.extraU32 = reader.u32(`module ${index} extra parameter`); module.extraByte = reader.u8(`module ${index} extra byte`); }
    if (hasWh) { module.width = reader.u8(`module ${index} width`); module.height = reader.u8(`module ${index} height`); }
    if (hasTwoU16) module.angles = [reader.u16('module angle'), reader.u16('module angle')];
    if (hasFourU16) module.quad = Array.from({ length: 4 }, () => reader.u16('module quad'));
    moduleGeometry.push({ type, hasU32, hasWh, hasTwoU16, hasFourU16, hasF7Fields });
    if (![0, 0xff, 0xfe, 0xfd, 0xfc, 0xfb, 0xfa, 0xf9, 0xf8, 0xf7].includes(type)) {
      throw new RangeError(`Invalid BSprite module type 0x${type.toString(16)}`);
    }
    modules.push(module);
    // Port of d.java:233-239: the optional selector is read only on image modules.
    if (type === 0 && (flags & 0x4)) modulePaletteIndices[index] = reader.u8(`module ${index} palette`);
    else modulePaletteIndices[index] = null;
  }

  const fmoduleCount = reader.u16('FModule count');
  const fmodules = Array.from({ length: fmoduleCount }, (_, index) => ({
    moduleIndex: flags & 0x100000 ? reader.u16(`FModule ${index} module`) : reader.u8(`FModule ${index} module`),
    offsetX: flags & 0x400 ? reader.i16(`FModule ${index} x`) : reader.i8(`FModule ${index} x`),
    offsetY: flags & 0x400 ? reader.i16(`FModule ${index} y`) : reader.i8(`FModule ${index} y`),
    flags: reader.u8(`FModule ${index} flags`),
  }));
  if (fmodules.some((item) => item.moduleIndex >= moduleCount)) throw new RangeError('FModule references missing module');

  const frameRects = [];
  if (flags & 0x8000) {
    const rectCount = reader.u16('frame rect count');
    for (let i = 0; i < rectCount; i += 1) {
      frameRects.push(flags & 0x400
        ? [reader.i16('frame rect x'), reader.i16('frame rect y'), reader.u16('frame rect width'), reader.u16('frame rect height')]
        : [reader.i8('frame rect x'), reader.i8('frame rect y'), reader.u8('frame rect width'), reader.u8('frame rect height')]);
    }
  }
  const frameCount = reader.u16('frame count');
  let firstRect = 0;
  const frames = Array.from({ length: frameCount }, (_, index) => {
    const count = flags & 0x800 ? reader.u16(`frame ${index} FModule count`) : reader.u8(`frame ${index} FModule count`);
    const first = reader.u16(`frame ${index} first FModule`);
    const rectCount = flags & 0x8000 ? reader.u8(`frame ${index} rect count`) : 0;
    const frame = { firstFmodule: first, fmoduleCount: count, firstRect: rectCount ? firstRect : null, rectCount };
    firstRect += rectCount;
    if (first + count > fmodules.length) throw new RangeError(`Frame ${index} exceeds FModule table`);
    return frame;
  });
  if (flags & 0x8000 && firstRect !== frameRects.length) throw new RangeError('Frame rect references do not cover source rect table');

  const bounds = [];
  if (!(flags & 0x1000)) {
    for (let i = 0; i < frameCount; i += 1) {
      bounds.push(flags & 0x400
        ? { x: reader.i16('frame bound x'), y: reader.i16('frame bound y'), width: reader.u16('frame bound width'), height: reader.u16('frame bound height') }
        : { x: reader.i8('frame bound x'), y: reader.i8('frame bound y'), width: reader.u8('frame bound width'), height: reader.u8('frame bound height') });
    }
  }
  const animationFrameCount = reader.u16('animation frame count');
  const animationFrames = Array.from({ length: animationFrameCount }, () => Array.from({ length: 5 }, () => reader.u8('animation frame field')));
  const animationCount = reader.u16('animation count');
  const animations = Array.from({ length: animationCount }, () => ({ frameCount: reader.u8('animation count'), firstAnimationFrame: reader.u16('animation start') }));
  for (const [index, animation] of animations.entries()) {
    if (animation.firstAnimationFrame + animation.frameCount > animationFrameCount) throw new RangeError(`Animation ${index} exceeds AFrame table`);
  }
  return { modules, modulePaletteIndices, fmodules, frameRects, frames, bounds, animationFrames, animations };
}

// Port of d.java:794-914 (per-palette table and module pixel decoding).
function parseImageData(reader, flags, modules) {
  const pixelFormat = reader.u16('pixel format');
  // This GLLib export stores a palette count and one shared color count,
  // followed by each palette's colors. The layout is empirically verified by
  // exact byte/pixel consumption for the original blocks in PACK-MAP.md.
  // Observed original blocks encode [palette count][shared color count]; the
  // exact-fit local decoder establishes this layout for all shipped pack data.
  const paletteCount = reader.u8('palette count');
  const colorsPerPalette = reader.u8('shared palette color count');
  const rleBitsValue = colorsPerPalette > 1 ? Math.floor(Math.log2(colorsPerPalette - 1)) + 1 : 0;
  const palettes = Array.from({ length: paletteCount }, (_, p) =>
    Array.from({ length: colorsPerPalette }, (_, i) => colorToRgba(readColor(reader, pixelFormat, `palette ${p} color ${i}`), pixelFormat)));
  const rleBits = Array.from({ length: paletteCount }, () => rleBitsValue);
  const dataFormat = reader.u16('image data format');
  const payloads = modules.map((module, index) => reader.take(flags & 0x80 ? reader.u32(`module ${index} data size`) : reader.u16(`module ${index} data size`), `module ${index} payload`));
  return { pixelFormat, dataFormat, palettes, rleBits, payloads };
}

function decodeModule(module, payload, dataFormat, palette, rleBits, moduleIndex) {
  if (module.type !== 0) {
    if (payload.length !== 0) throw new RangeError(`Non-image BSprite module ${moduleIndex} unexpectedly has pixel bytes`);
    return null;
  }
  const needed = module.width * module.height;
  const pixels = new Uint8ClampedArray(needed * 4);
  let source = 0;
  let target = 0;
  let invalidPaletteIndex = -1;
  const emit = (index, run) => {
    const color = palette[index];
    if (!color) {
      invalidPaletteIndex = index;
      return;
    }
    for (let i = 0; i < run && target < needed; i += 1) pixels.set(color, target++ * 4);
  };
  if (dataFormat === 0x64f0) {
    const rleMask = rleBits ? (1 << rleBits) - 1 : 0;
    while (target < needed) {
      const value = payload[source++];
      if (value === undefined) throw new RangeError(`I64RLE payload ended at pixel ${target}`);
      emit(value & rleMask, (value >>> rleBits) + 1);
    }
  } else if (dataFormat === 0x1600) {
    while (target < needed) {
      const value = payload[source++];
      if (value === undefined) throw new RangeError(`I16 payload ended at pixel ${target}`);
      emit(value >>> 4, 1);
      if (target < needed) emit(value & 15, 1);
    }
  } else {
    throw new RangeError(`Unsupported BSprite image format 0x${dataFormat.toString(16)}`);
  }
  if (invalidPaletteIndex !== -1) throw new RangeError(`Palette index ${invalidPaletteIndex} outside source table`);
  if (source !== payload.length || target !== needed) {
    throw new RangeError(`BSprite module ${moduleIndex} did not exactly consume source bytes/pixels`);
  }
  return { width: module.width, height: module.height, pixels };
}

/** Convert a decoded source module into a browser CanvasImageSource on demand. */
export function moduleToCanvasImage(module) {
  if (!module) return null;
  const canvas = document.createElement('canvas');
  canvas.width = module.width;
  canvas.height = module.height;
  const context = canvas.getContext('2d');
  context.imageSmoothingEnabled = false;
  // Port of f.java:1713-1715 & d.java:835-836: treat both 24-bit 0xFF00FF and 16-bit RGB565/555
  // quantized magenta (248, 0, 248) plus black key as transparent pixels.
  const rgba = new Uint8ClampedArray(module.pixels);
  for (let i = 0; i < rgba.length; i += 4) {
    if ((rgba[i] >= 248 && rgba[i + 1] <= 4 && rgba[i + 2] >= 248)
      || (rgba[i] === 0 && rgba[i + 1] === 0 && rgba[i + 2] === 0)) rgba[i + 3] = 0;
  }
  context.putImageData(new ImageData(rgba, module.width, module.height), 0, 0);
  return canvas;
}

export function decodeBSpriteBlock(blockBytes, { paletteIndex = 0 } = {}) {
  const reader = new Reader(blockBytes);
  if (reader.u16('BSprite magic') !== 0x05df) throw new RangeError('Block does not start with BSprite v5 magic');
  const flags = reader.u32('BSprite flags');
  const structure = parseStructure(reader, flags);
  if (!(flags & 0x1000000)) throw new RangeError('BSprite block has no source image data');
  const imageData = parseImageData(reader, flags, structure.modules);
  if (paletteIndex < 0 || paletteIndex >= imageData.palettes.length) throw new RangeError(`Palette index out of range: ${paletteIndex}`);
  const moduleImages = structure.modules.map((module, index) => {
    const modulePalette = structure.modulePaletteIndices[index] ?? paletteIndex;
    if (modulePalette >= imageData.palettes.length) throw new RangeError(`Module ${index} references missing palette ${modulePalette}`);
    return decodeModule(module, imageData.payloads[index], imageData.dataFormat, imageData.palettes[modulePalette], imageData.rleBits[modulePalette], index);
  });
  if (reader.offset !== blockBytes.length) throw new RangeError(`BSprite has ${blockBytes.length - reader.offset} unexplained trailing bytes`);
  return { flags, ...structure, ...imageData, moduleImages };
}
