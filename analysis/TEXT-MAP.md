# TEXT-MAP — GLLib text packs (green-farm-3)


RESULT: 12 pages, 3834 strings + 19 IAP entries -> `web-port/assets/text/en.json`. Text id = (page<<10)|idx; f.b(id) returns it.
WARNING: pack named 'EN' actually holds the VIETNAMESE localization (clone shipped VI text under the EN filename; UTF-8 charset per f.java:1926).

Decoded by `analysis/tools/decode_text.py`; structure mirror of f.java text module (see its docstring).

- page 0: pageID=0, strings=868 (header count 868), block=35144B
- page 1: pageID=1, strings=203 (header count 203), block=13938B
- page 2: pageID=2, strings=322 (header count 322), block=22766B
- page 3: pageID=3, strings=315 (header count 315), block=23407B
- page 4: pageID=4, strings=336 (header count 336), block=24820B
- page 5: pageID=5, strings=378 (header count 378), block=27482B
- page 6: pageID=6, strings=329 (header count 329), block=23598B
- page 7: pageID=7, strings=196 (header count 196), block=15786B
- page 8: pageID=8, strings=429 (header count 429), block=9554B
- page 9: pageID=9, strings=62 (header count 62), block=1071B
- page 10: pageID=10, strings=36 (header count 36), block=22345B
- page 11: pageID=11, strings=360 (header count 360), block=7025B
- IAP_texts: plain UTF-8 'ID;TEXT' lines, 19 entries (l.java:1411)


Sample strings (idx 2,3,100 of pages 0/8/11):
- 'Chào mừng!'
- 'Chào! Tôi là Cindy Lou! Chào mừng đến với nhà mới của bạn. Hãy bắt đầu với việc ra đồng nào!'
- '.'
- 'Dâu tây'
- 'Cà chua'
- 'Súp hành tây'
- ''
- '©2013 Gameloft. Bảo lưu mọi quyền. Gameloft và lô gô của Gameloft là các thương hiệu của Gameloft ở Mỹ và/hoặc các quốc gia khác.'
- 'Stefan Weisenbacher'