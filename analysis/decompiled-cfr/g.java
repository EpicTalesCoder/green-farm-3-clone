/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class g {
    private int b;
    public int a;
    public int[][] a;
    private static g[] a = new g[34];
    public static boolean a = true;
    private static int[] a = new int[]{8, 18, 24};

    public static g a(int n) {
        boolean bl;
        g g2;
        block26: {
            int n2;
            boolean bl2 = a;
            if (a[n] != null) {
                return a[n];
            }
            if (bl2) {
                f.c("/9");
            }
            g2 = new g();
            byte[] byArray = f.a(n);
            int n3 = 0;
            g2.a = f.a(byArray, 0);
            n3 += 4;
            g2.b = f.a(byArray, 4);
            n3 += 4;
            if (g2.a > 0 && g2.b > 0) {
                int n4;
                byte[] byArray2 = new byte[g2.b];
                for (n4 = 0; n4 < g2.b; ++n4) {
                    byArray2[n4] = byArray[n3];
                    ++n3;
                }
                g2.a = new int[g2.a][g2.b];
                block18: for (n4 = 0; n4 < g2.a; ++n4) {
                    for (n2 = 0; n2 < g2.b; ++n2) {
                        switch (byArray2[n2]) {
                            case 1: {
                                g2.a[n4][n2] = byArray[n3];
                                break;
                            }
                            case 2: {
                                g2.a[n4][n2] = f.a(byArray, n3);
                                break;
                            }
                            case 4: {
                                g2.a[n4][n2] = f.a(byArray, n3);
                            }
                        }
                        n3 += byArray2[n2];
                    }
                    if (a.h) continue;
                    g g3 = g2;
                    n2 = n4;
                    switch (n) {
                        case 20: {
                            g3.a[n2][1] = g3.a[n2][2];
                            continue block18;
                        }
                        case 12: {
                            continue block18;
                        }
                        case 3: {
                            g3.a[n2][15] = g3.a[n2][16];
                            g3.a[n2][31] = g3.a[n2][32];
                            g3.a[n2][13] = g3.a[n2][14];
                            continue block18;
                        }
                        case 0: {
                            g3.a[n2][15] = g3.a[n2][16];
                            continue block18;
                        }
                        case 2: {
                            g3.a[n2][12] = g3.a[n2][13];
                            g3.a[n2][12] = g3.a[n2][13];
                            continue block18;
                        }
                        case 7: {
                            g3.a[n2][16] = g3.a[n2][17];
                            continue block18;
                        }
                        case 22: {
                            g3.a[n2][13] = g3.a[n2][14];
                            continue block18;
                        }
                        case 4: {
                            g3.a[n2][19] = g3.a[n2][20];
                            continue block18;
                        }
                        case 1: {
                            g3.a[n2][5] = g3.a[n2][6];
                            g3.a[n2][7] = g3.a[n2][8];
                            continue block18;
                        }
                        case 6: {
                            g3.a[n2][8] = g3.a[n2][9];
                            g3.a[n2][10] = g3.a[n2][11];
                        }
                    }
                }
            }
            if (bl2) {
                f.k();
            }
            for (n2 = 0; n2 < a.length; ++n2) {
                if (n != a[n2]) continue;
                bl = true;
                break block26;
            }
            bl = false;
        }
        if (bl) {
            g.a[n] = g2;
        }
        return g2;
    }
}

