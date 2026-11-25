import test from "node:test";
import assert from "node:assert/strict";
import { spawnSync } from "node:child_process";
import { mkdtempSync, readFileSync, rmSync } from "node:fs";
import os from "node:os";
import path from "node:path";
import { fileURLToPath } from "node:url";

const ROOT = path.resolve(path.dirname(fileURLToPath(import.meta.url)), "../..");
const TOOLS = path.join(ROOT, "analysis", "tools");
const RECOVERED = path.join(ROOT, "analysis", "recovered");
const decoderPath = path.join(TOOLS, "decode_image.py");

function exportMetadata(packId) {
  const tmp = mkdtempSync(path.join(os.tmpdir(), "gf3-frame-metadata-"));
  const summaryPath = path.join(tmp, `pack${packId}.json`);
  const run = spawnSync(
    "python3",
    [
      "-I",
      decoderPath,
      "--pack",
      path.join(RECOVERED, String(packId)),
      "--metadata-only",
      "--quiet",
      "--summary",
      summaryPath,
    ],
    { cwd: ROOT, encoding: "utf8" },
  );
  try {
    assert.equal(
      run.status,
      0,
      run.stderr || run.stdout || "metadata parser exited unsuccessfully",
    );
    return JSON.parse(readFileSync(summaryPath, "utf8"));
  } finally {
    rmSync(tmp, { recursive: true, force: true });
  }
}

function assertFrameReferences(summary) {
  for (const block of summary.frames_by_block) {
    const modules = block.modules.length;
    for (const [index, frameModule] of block.frame_modules.entries()) {
      assert.ok(
        frameModule.module_index < modules,
        `pack ${summary.pack} block ${block.block} FModule ${index} references missing module ${frameModule.module_index}`,
      );
    }
    let expectedRect = 0;
    for (const [index, frame] of block.frames.entries()) {
      assert.ok(
        frame.first_frame_module + frame.frame_module_count <=
          block.frame_modules.length,
        `pack ${summary.pack} block ${block.block} frame ${index} exceeds FModule table`,
      );
      if (frame.frame_rect_count) {
        assert.equal(frame.first_frame_rect, expectedRect);
        expectedRect += frame.frame_rect_count;
      }
    }
    if (block.flags & 0x8000) {
      assert.equal(
        expectedRect,
        block.frame_rects.length,
        `pack ${summary.pack} block ${block.block} frame rect references`,
      );
    }
    if (!(block.flags & 0x1000)) {
      assert.equal(
        block.frame_bounds.length,
        block.frames.length,
        `pack ${summary.pack} block ${block.block} bounds count`,
      );
    }
    for (const frame of block.animation_frames) assert.equal(frame.length, 5);
    for (const [index, animation] of block.animations.entries()) {
      assert.ok(
        animation.first_animation_frame + animation.frame_count <=
          block.animation_frames.length,
        `pack ${summary.pack} block ${block.block} animation ${index} exceeds animation frame table`,
      );
    }
  }
}

test("decoded metadata exactly preserves the original GLLib records", () => {
  const expected = {
    2: { blocks: 6, frames: 1280, animations: 0 },
    5: { blocks: 160, frames: 918, animations: 134 },
    7: { blocks: 123, frames: 688, animations: 28 },
    8: { blocks: 1, frames: 3, animations: 0 },
    11: { blocks: 14, frames: 197, animations: 7 },
  };
  for (const [packText, counts] of Object.entries(expected)) {
    const packId = Number(packText);
    const summary = exportMetadata(packId);
    assert.equal(summary.errors.length, 0, `pack ${packId} parser errors`);
    assert.equal(summary.block_count, counts.blocks);
    assert.equal(summary.frames, counts.frames);
    assert.equal(summary.anims, counts.animations);
    assertFrameReferences(summary);
  }
});
