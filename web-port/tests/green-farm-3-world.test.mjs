import test from "node:test";
import assert from "node:assert/strict";
import { spawnSync } from "node:child_process";
import { mkdtempSync, readFileSync, rmSync } from "node:fs";
import os from "node:os";
import path from "node:path";
import { fileURLToPath } from "node:url";

const ROOT = path.resolve(path.dirname(fileURLToPath(import.meta.url)), "../..");
const ANALYSIS = path.join(ROOT, "analysis");
const decoderPath = path.join(ANALYSIS, "tools", "decode_world.py");

function decodeOpeningWorld() {
  const tempDir = mkdtempSync(path.join(os.tmpdir(), "gf3-world-start-"));
  const outputPath = path.join(tempDir, "world-start.json");
  const run = spawnSync(
    "python3",
    [
      "-I",
      decoderPath,
      "--pack",
      path.join(ANALYSIS, "recovered", "10"),
      "--config-pack",
      path.join(ANALYSIS, "recovered", "9"),
      "--pack5-frames",
      path.join(ANALYSIS, "frames", "pack5.json"),
      "--output",
      outputPath,
    ],
    { cwd: ROOT, encoding: "utf8" },
  );
  try {
    assert.equal(
      run.status,
      0,
      run.stderr || run.stdout || "world-data decoder failed",
    );
    return JSON.parse(readFileSync(outputPath, "utf8"));
  } finally {
    rmSync(tempDir, { recursive: true, force: true });
  }
}

test("original first-world script displays recovered opening-story IDs 0 and 1", () => {
  const world = decodeOpeningWorld();
  assert.equal(world.script_block, 15);
  assert.equal(world.entity_block, 16);
  const groups = world.world_script.scripts[0].groups;
  const openingGroup = groups.find(
    (group) => group.group_type === 0 && group.context === 0,
  );
  assert.ok(openingGroup, "first-world script contains the story group");

  const displays = openingGroup.records
    .flatMap((record) => record.commands)
    .filter((command) => command.opcode === 110)
    .map((command) => command.args[0]);
  assert.deepEqual(displays, [0, 1]);

  const textData = JSON.parse(
    readFileSync(
      path.join(ROOT, "web-port", "assets", "text", "en.json"),
      "utf8",
    ),
  );
  assert.equal(
    textData.page_0["0"],
    "Có người gửi cho mình một lá thư. Không biết là chuyện gì đây!",
  );
  assert.equal(
    textData.page_0["1"],
    "Gì thế này? Thư nói mình được... thừa kế một trang trại! Trang trại cũ của gia tộc. Và mình phải khôi phục nó!",
  );
});

test("opening export joins numeric entities to exact original frame composition", () => {
  const world = decodeOpeningWorld();
  assert.equal(world.entity_records.length, 52);
  assert.equal(world.entity_records.records.length, 4);
  assert.deepEqual(
    world.category_15_instances.map((instance) => [
      instance.entity_id,
      instance.sprite_registry_index,
      instance.frame_index,
      instance.identity,
    ]),
    [
      [1, 81, 0, "unresolved numeric world entity"],
      [0, 101, -1, "unresolved numeric world entity"],
      [2, 100, 0, "unresolved numeric world entity"],
      [3, 97, 0, "unresolved numeric world entity"],
    ],
  );
  assert.equal(
    world.category_15_instances[2].sprite_registry.source_frame
      .frame_module_count,
    17,
  );
  assert.deepEqual(
    world.category_15_instances[2].sprite_registry.source_frame.frame_modules.map(
      (item) => [item.module_index, item.module_png],
    ),
    Array.from({ length: 17 }, (_, module) => [
      module,
      `5_b100_m${String(module).padStart(2, "0")}.png`,
    ]),
  );
  assert.equal(
    world.provenance.semantic_names,
    "not inferred; numeric IDs are retained as unknown source identifiers",
  );
});
