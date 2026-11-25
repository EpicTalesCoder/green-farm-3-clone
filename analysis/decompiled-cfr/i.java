/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class i
implements Runnable {
    private int b;
    private int c;
    int a;
    d a;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean a;
    private int i;
    private static int j = 40;
    private int k;
    private static boolean b = false;
    private static int l = 4;
    private static final int m = 20;
    private static final int n = 6;
    private static int[] a;
    private static int[][] a;
    private static byte[][][] a;
    private static j[][] a;
    static Graphics[][] a;
    private static int[][][] a;
    private static int o;
    private static d[] a;
    private static int p;

    i() {
        this.e();
    }

    i(d d2, int n, int n2) {
        this.e();
        this.b = n;
        this.c = n2;
        this.a(d2);
    }

    private void e() {
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = 0;
        this.a = null;
        this.a = 0;
        this.f = 0;
        this.h = 1;
        this.k = -1;
        this.a = true;
        this.i = -1;
    }

    final void a(int n, int n2) {
        this.b = n;
        this.c = n2;
    }

    final d a() {
        return this.a;
    }

    final void a(d d2) {
        this.a = d2;
        if (d2 != null) {
            this.b(-1, -1);
            return;
        }
        this.d = -1;
    }

    final void a(int n, int n2, boolean bl) {
        if (bl) {
            this.b(-1, 1);
        }
        this.b(n, n2);
    }

    final void b(int n, int n2) {
        int n3 = n2;
        n2 = n;
        i i2 = this;
        if (i2.a || n2 != i2.d) {
            i2.d = n2;
            i2.g = j;
            i i3 = i2;
            if (i3.d >= 0) {
                int n4 = i3.h();
                i3.e = n4 = 0 % n4;
                i3.f = 0;
            }
            i2.h = n3 - 1;
            i2.a = false;
        }
    }

    final int a() {
        return this.d;
    }

    final void a() {
        this.e = f.c(0, this.h());
        this.f = 0;
    }

    final int b() {
        return this.e;
    }

    final void a(int n) {
        switch (n) {
            case 0: {
                this.a = 0;
                return;
            }
            case 2: {
                this.a = 1;
                return;
            }
            case 1: {
                this.a = 2;
                return;
            }
            case 3: {
                this.a = 3;
                return;
            }
            case 5: {
                this.a = 4;
                return;
            }
            case 6: {
                this.a = 7;
                return;
            }
            case 7: {
                this.a = 6;
                return;
            }
            case 4: {
                this.a = 5;
            }
        }
    }

    final void b(int n) {
        this.k = n;
    }

    final int c() {
        return this.h;
    }

    private int h() {
        i i2 = this;
        if (i2.d >= 0) {
            return i2.a.a(i2.d);
        }
        return -1;
    }

    private int i() {
        if (this.d >= 0) {
            return this.a.a(this.d, this.e) * this.g;
        }
        return 0;
    }

    final boolean a() {
        if (this.d < 0) {
            return true;
        }
        if (this.h < 0) {
            return false;
        }
        return this.a;
    }

    final void b() {
        if (this.d < 0) {
            return;
        }
        if (this.a) {
            return;
        }
        boolean bl = false;
        if (this.i != -1 && this.i != 100 && !((f.aa & 0x2000) != 0)) {
            bl = true;
            f.n();
            f.p(this.i);
        }
        if (this.k != -1) {
            int n = this.a.f();
            this.a.d(this.k);
            this.a.a(f.a, this.d, this.e, this.b, this.c, this.a);
            this.a.d(n);
        } else {
            this.a.a(f.a, this.d, this.e, this.b, this.c, this.a);
        }
        if (bl) {
            f.aa &= 0xFFF0081F;
        }
    }

    final void c(int n) {
        if (this.a || this.d < 0) {
            return;
        }
        int n2 = this.i();
        if (n2 == 0) {
            return;
        }
        while (this.f >= n2) {
            this.f -= n2;
            if (this.e < this.a.a(this.d) - 1) {
                ++this.e;
            } else {
                if (this.h == 0) {
                    this.a = true;
                    break;
                }
                if (this.h > 0) {
                    --this.h;
                }
                this.e = 0;
            }
            if ((n2 = this.i()) != 0) continue;
        }
        this.f += n;
    }

    final void d(int n) {
        this.i = n;
    }

    public final void run() {
    }

    static void a(int n, int n2, int n3, int n4) {
        a = new int[8];
        a = new int[l][m];
        a = new j[l][1];
        a = new Graphics[l][1];
        if (n3 > 0 && n4 > 0) {
            a = new byte[l][2][];
            a = new d[l];
            i.a[2] = n3;
            i.a[4] = 0;
            i.a[5] = n4;
            i.a[7] = 0;
        }
        a = new int[l][i.n][4];
        i.a[0] = n;
        i.a[1] = n2;
        b = true;
    }

    private static void f(int n) {
        n = a[0][18];
        int n2 = a[0][19];
        int n3 = n % a[2];
        int n4 = 1 + (n3 != 0 ? 1 : 0);
        i.a[0][7] = n - n3 + n4 * a[2];
        n = n2 % a[5];
        n3 = 1 + (n != 0 ? 1 : 0);
        i.a[0][8] = n2 - n + n3 * a[5];
    }

    private static void g(int n) {
        try {
            i.a[0][0] = j.a(a[0][7], a[0][8]);
            i.a[0][0] = i.a[0][0].a.getGraphics();
            return;
        }
        catch (Exception exception) {
            new StringBuffer().append("GLLibPlayer.Tileset_LoadLayer.pb while ceating circular buffer : ").append(exception.toString());
            return;
        }
    }

    static void c() {
        if (!b) {
            return;
        }
        i.f(0);
        i.g(0);
    }

    private static boolean a(int n, int n2) {
        return (a[n][15] & n2) != 0;
    }

    private static void a(int n, boolean bl) {
        if (bl) {
            int[] nArray = a[0];
            nArray[15] = nArray[15] | n;
            return;
        }
        int[] nArray = a[0];
        nArray[15] = nArray[15] & ~n;
    }

    static void a(byte[] byArray, byte[] byArray2, byte[] byArray3, d d2) {
        if (b) {
            i.b(0, false);
            i.a[0][18] = 0;
            i.a[0][19] = 0;
            i.a[0][18] = a[0];
            i.a[0][19] = a[1];
            i.a[0][0] = byArray2;
            i.a[0][1] = byArray3;
            i.a[0][2] = f.a(byArray, 0);
            i.a[0][3] = f.a(byArray, 2);
            i.a[0][5] = a[0][2] * a[2];
            i.a[0][6] = a[0][3] * a[5];
            i.a[0] = d2;
            i.f(0);
            if (a[0][0] == null || i.a[0][0].a.getWidth() != a[0][7] || i.a[0][0].a.getHeight() != a[0][8]) {
                i.g(0);
            }
            i.a(64, true);
            i.a(4, true);
            i.a(128, true);
            i.a[0][9] = -1;
            i.a[0][10] = -1;
            i.a[0][11] = -1;
            i.a[0][12] = -1;
            i.a[0][0] = 1;
            i.a[0][1] = 1;
            i.a[0][13] = 0;
            i.a[0][14] = 0;
            i.a[0][16] = 0;
            i.a[0][17] = 0;
            i.a(1, false);
            i.a(16, false);
            i.a(2, false);
            i.a(32, false);
            i.a(8, false);
        }
    }

    static void e(int n) {
        i.b(n, true);
    }

    private static void b(int n, boolean bl) {
        if (!b) {
            return;
        }
        i.a[n] = new int[m];
        if (bl) {
            i.a[n] = new j[1];
            i.a[n] = new Graphics[1];
        }
        if (a != null) {
            i.a[n] = new byte[2][];
            i.a[n] = null;
        }
    }

    static void a(Graphics graphics, int n, int n2, int n3) {
        block43: {
            int n4;
            int n5;
            int n6;
            int n7;
            block44: {
                block45: {
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    int n17;
                    int[] nArray;
                    block51: {
                        block49: {
                            block50: {
                                block48: {
                                    block46: {
                                        block47: {
                                            if (!b) break block43;
                                            if (n3 == -1) {
                                                for (int i2 = 0; i2 < l; ++i2) {
                                                    i.a(graphics, n, n2, i2);
                                                }
                                                return;
                                            }
                                            n7 = a[n3][18] * 100 / p;
                                            n6 = a[n3][19] * 100 / p;
                                            if (n7 == 0) {
                                                i.a[n3][18] = a[0];
                                                n7 = a[n3][18];
                                            }
                                            if (n6 == 0) {
                                                i.a[n3][19] = a[1];
                                                n7 = a[n3][18];
                                            }
                                            if ((nArray = a[n3])[0] != 1 || nArray[1] != 1) {
                                                return;
                                            }
                                            n5 = nArray[13] + nArray[16];
                                            n4 = nArray[14] + nArray[17];
                                            if (!i.a(n3, 4)) break block44;
                                            n17 = 0;
                                            n16 = 0;
                                            n15 = 0;
                                            n14 = 0;
                                            if (graphics != null) {
                                                n17 = f.a(graphics);
                                                n16 = f.b(graphics);
                                                n15 = f.c(graphics);
                                                n14 = f.d(graphics);
                                            }
                                            if (i.a(n3, 128)) {
                                                o = 0;
                                            }
                                            if (i.a(n3, 256)) {
                                                i.h(n3);
                                            } else {
                                                n13 = n5;
                                                n12 = n4;
                                                if (n13 < 0) {
                                                    n13 -= a[2];
                                                }
                                                if (n12 < 0) {
                                                    n12 -= a[5];
                                                }
                                                n11 = n13 / a[2];
                                                n10 = n12 / a[5];
                                                n9 = n11 + nArray[7] / a[2] - 1;
                                                n8 = n10 + nArray[8] / a[5] - 1;
                                                int n18 = 0;
                                                int n19 = 0;
                                                if (nArray[10] != n10 || nArray[12] != n8) {
                                                    if (nArray[10] < n10 || nArray[12] < n8) {
                                                        if (nArray[12] < n10) {
                                                            n18 = n10;
                                                            n19 = n8;
                                                        } else {
                                                            n18 = nArray[12] + 1;
                                                            n19 = n8;
                                                        }
                                                    } else if (nArray[10] > n8) {
                                                        n18 = n10;
                                                        n19 = n8;
                                                    } else {
                                                        n18 = n10;
                                                        n19 = nArray[10] - 1;
                                                    }
                                                }
                                                if (nArray[9] != n11 || nArray[11] != n9) {
                                                    if (nArray[9] < n11 || nArray[11] < n9) {
                                                        if (nArray[11] < n11) {
                                                            n13 = n11;
                                                            n12 = n9;
                                                        } else {
                                                            n13 = nArray[11] + 1;
                                                            n12 = n9;
                                                        }
                                                    } else if (nArray[9] > n9) {
                                                        n13 = n11;
                                                        n12 = n9;
                                                    } else {
                                                        n13 = n11;
                                                        n12 = nArray[9] - 1;
                                                    }
                                                    int n20 = n8 - n10;
                                                    int n21 = n10;
                                                    if (nArray[10] != n10 || nArray[12] != n8) {
                                                        if (nArray[10] < n10 || nArray[12] < n8) {
                                                            n20 -= n19 - n18 + 1;
                                                        } else {
                                                            n20 -= n19 - n18 + 1;
                                                            n21 += n19 - n18 + 1;
                                                        }
                                                    }
                                                    if (n20 >= 0) {
                                                        i.a(a[n3][0], n3, n13, n21, n12 - n13, n20, 0, 0);
                                                    }
                                                    nArray[9] = n11;
                                                    nArray[11] = n9;
                                                }
                                                if (nArray[10] != n10 || nArray[12] != n8) {
                                                    i.a(a[n3][0], n3, n11, n18, n9 - n11, n19 - n18, 0, 0);
                                                    nArray[10] = n10;
                                                    nArray[12] = n8;
                                                }
                                            }
                                            if (graphics == null) break block45;
                                            if (i.a(n3, 273)) break block46;
                                            if (n5 >= 0) break block47;
                                            n -= n5;
                                            n5 = 0;
                                            break block48;
                                        }
                                        if (n5 <= nArray[5] - n7) break block48;
                                        n -= n5 - (nArray[5] - n7);
                                        n5 = nArray[5] - n7;
                                        break block48;
                                    }
                                    while (n5 < 0) {
                                        n5 += nArray[7];
                                    }
                                }
                                if (i.a(n3, 290)) break block49;
                                if (n4 >= 0) break block50;
                                n2 -= n4;
                                n4 = 0;
                                break block51;
                            }
                            if (n4 <= nArray[6] - n6) break block51;
                            n2 -= n4 - (nArray[6] - n6);
                            n4 = nArray[6] - n6;
                            break block51;
                        }
                        while (n4 < 0) {
                            n4 += nArray[8];
                        }
                    }
                    n11 = n5 % nArray[7];
                    n10 = n4 % nArray[8];
                    n9 = (n5 + n7) % nArray[7];
                    n8 = (n4 + n6) % nArray[8];
                    n12 = n14;
                    n13 = n15;
                    n4 = n16;
                    f.b(graphics, n17, n4, n13, n12);
                    if (n9 > n11) {
                        if (n8 > n10) {
                            i.a(graphics, n3, n11, n10, n7, n6, n, n2, n17, n16, n15, n14);
                        } else {
                            i.a(graphics, n3, n11, n10, n7, n6 - n8, n, n2, n17, n16, n15, n14);
                            n9 = n14;
                            n10 = n15;
                            n4 = n16;
                            f.b(graphics, n17, n4, n10, n9);
                            i.a(graphics, n3, n11, 0, n7, n8, n, n6 - n8 + n2, n17, n16, n15, n14);
                        }
                    } else if (n8 > n10) {
                        i.a(graphics, n3, n11, n10, n7 - n9, n6, n, n2, n17, n16, n15, n14);
                        n8 = n14;
                        n11 = n15;
                        n4 = n16;
                        f.b(graphics, n17, n4, n11, n8);
                        i.a(graphics, n3, 0, n10, n9, n6, n7 - n9 + n, n2, n17, n16, n15, n14);
                    } else {
                        i.a(graphics, n3, n11, n10, n7 - n9, n6 - n8, n, n2, n17, n16, n15, n14);
                        n12 = n14;
                        n13 = n15;
                        n4 = n16;
                        f.b(graphics, n17, n4, n13, n12);
                        i.a(graphics, n3, n11, 0, n7 - n9, n8, n, n6 - n8 + n2, n17, n16, n15, n14);
                        n13 = n14;
                        n11 = n15;
                        n4 = n16;
                        f.b(graphics, n17, n4, n11, n13);
                        i.a(graphics, n3, 0, n10, n9, n6 - n8, n7 - n9 + n, n2, n17, n16, n15, n14);
                        n10 = n14;
                        n11 = n15;
                        n4 = n16;
                        f.b(graphics, n17, n4, n11, n10);
                        i.a(graphics, n3, 0, 0, n9, n8, n7 - n9 + n, n6 - n8 + n2, n17, n16, n15, n14);
                    }
                    n3 = n14;
                    n2 = n15;
                    int n22 = n16;
                    f.b(graphics, n17, n22, n2, n3);
                }
                return;
            }
            if (graphics != null) {
                int n23;
                int n24 = n5;
                int n25 = n4;
                if (n24 < 0) {
                    n24 -= a[2];
                }
                if (n25 < 0) {
                    n25 -= a[5];
                }
                int n26 = n24 / a[2];
                int n27 = n25 / a[5];
                int n28 = n7 / a[2];
                if (n28 * a[2] < n7) {
                    ++n28;
                }
                if ((n23 = n6 / a[5]) * a[5] < n6) {
                    ++n23;
                }
                int n29 = n26 * a[2] - n5;
                int n30 = n27 * a[5] - n4;
                i.a(graphics, n3, n26, n27, n28, n23, n29 + n, n30 + n2);
            }
        }
    }

    static void a(int n, int n2, int n3, int n4, int n5) {
        if (!b || !i.a(n5, 4)) {
            return;
        }
        if (n5 == -1) {
            for (int i2 = 0; i2 < l; ++i2) {
                i.a(n, n2, n3, n4, i2);
            }
            return;
        }
        int[] nArray = a[n5];
        if (nArray[0] != 1 || nArray[1] != 1) {
            return;
        }
        if (n + n3 > nArray[13] && n < nArray[13] + nArray[7] && n2 + n4 > nArray[14] && n2 < nArray[14] + nArray[8]) {
            n3 = n + n3 < nArray[13] + nArray[7] ? n + n3 : nArray[13] + nArray[7];
            n4 = n2 + n4 < nArray[14] + nArray[8] ? n2 + n4 : nArray[14] + nArray[8];
            n = n > nArray[13] ? n : nArray[13];
            n2 = n2 > nArray[14] ? n2 : nArray[14];
            n3 -= n;
            n4 -= n2;
            if (n < 0) {
                n -= a[2];
            }
            if (n2 < 0) {
                n2 -= a[5];
            }
            n3 = n3 / a[2] - 1;
            n4 = n4 / a[5] - 1;
            i.a(a[n5][0], n5, n /= a[2], n2 /= a[5], n3, n4, 0, 0, true);
        }
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        if (n6 > (n8 + n10) * 100 || n7 > (n9 + n11) * 100 || n6 + n4 < n8 * 100 || n7 + n5 < n9 * 100) {
            return;
        }
        f.a(graphics, n6, n7, n4, n5);
        n3 = n7 - n3;
        n2 = n6 - n2;
        f.a(graphics, a[n][0], n2, n3);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        i.a(graphics, n, n2, n3, n4, n5, n6, n7, false);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        int n8;
        int n9;
        int n10 = i.a(n, 4);
        boolean bl2 = i.a(n, 1);
        boolean bl3 = i.a(n, 2);
        int n11 = a[n][2];
        int n12 = a[n][3];
        int n13 = a[2];
        int n14 = a[5];
        int n15 = n11 * n12;
        if (n10 != 0) {
            n6 = n2 * a[2] % a[n][7] + n6;
            n7 = n3 * a[5] % a[n][8] + n7;
            if (n6 < 0) {
                n6 += a[n][7];
            }
            if (n7 < 0) {
                n7 += a[n][8];
            }
        }
        if (bl2) {
            while (n2 < 0) {
                n2 += n11;
            }
            while (n2 >= n11) {
                n2 -= n11;
            }
        } else if (!i.a(n, 16)) {
            if (n2 < 0) {
                n6 -= n2 * n13;
                n4 += n2;
                n2 = 0;
                if (n10 != 0 && n6 >= a[n][7]) {
                    n6 = 0;
                }
            }
            if (n2 + n4 >= n11) {
                n4 = n11 - n2 - 1;
            }
            if (n4 < 0) {
                return;
            }
        }
        if (bl3) {
            while (n3 < 0) {
                n3 += n12;
            }
            while (n3 >= n12) {
                n3 -= n12;
            }
        } else if (!i.a(n, 32)) {
            if (n3 < 0) {
                n7 -= n3 * n14;
                n5 += n3;
                n3 = 0;
                if (n10 != 0 && n7 >= a[n][8]) {
                    n7 = 0;
                }
            }
            if (n3 + n5 >= n12) {
                n5 = n12 - n3 - 1;
            }
            if (n5 < 0) {
                return;
            }
        }
        int n16 = n6;
        int n17 = n7;
        while (n5-- >= 0) {
            n16 = n6;
            int n18 = n4;
            int n19 = n2;
            while (n18-- >= 0) {
                int n20;
                int n21 = n19 + n3 * n11;
                if (n21 < n15 && !((n20 = i.b(n, 0, n9 = n21)) == 255)) {
                    if (a[n][1] == null) {
                        n21 = 0;
                    } else {
                        n9 = n21;
                        n21 = i.b(n, 1, n9);
                    }
                    if (p != 100) {
                        f.n();
                        f.a[13][1] = n9 = p;
                        f.b(true);
                    }
                    if (a[n].b() == 0) {
                        a[n].a(graphics, n20, n16, n17, n21, a[2], a[5]);
                    } else {
                        n9 = n16;
                        n8 = n17;
                        if ((n21 & 1) != 0) {
                            n9 += n13;
                        }
                        if ((n21 & 2) != 0) {
                            n8 += n14;
                        }
                        if ((n21 & 4) != 0) {
                            n9 = (n21 & 1) != 0 ? (n9 -= n14) : (n9 += n14);
                        }
                        a[n].a(graphics, n20, n9, n8, n21);
                    }
                    if (p != 100) {
                        f.b(false);
                        f.o();
                    }
                }
                n16 += n13;
                if (++n19 >= n11) {
                    if (!bl2) break;
                    n19 = 0;
                }
                if (n10 == 0 || n16 < a[n][7]) continue;
                n16 = 0;
            }
            n17 += n14;
            if (++n3 >= n12) {
                if (!bl3) break;
                n3 = 0;
            }
            if (n10 == 0 || n17 < a[n][8]) continue;
            n17 = 0;
        }
        if (!bl && i.a(n, 128)) {
            int n22;
            if (n16 > n6) {
                n9 = n16;
                n8 = 0;
            } else {
                n9 = a[n][7];
                n8 = n16;
            }
            if (n17 > n7) {
                n22 = n17;
                n2 = 0;
            } else {
                n22 = a[n][8];
                n2 = n17;
            }
            for (n3 = 0; n3 < 4; ++n3) {
                if ((n3 == 1 || n3 == 3) && n8 == 0 || (n3 == 2 || n3 == 3) && n2 == 0) continue;
                n4 = n3 == 0 || n3 == 2 ? n6 : 0;
                n5 = n3 == 0 || n3 == 1 ? n7 : 0;
                int n23 = n3 == 0 || n3 == 2 ? n9 - n6 : n8;
                n10 = n3 == 0 || n3 == 1 ? n22 - n7 : n2;
                i.b(n, n4, n5, n23, n10);
            }
        }
    }

    private static final void b(int n, int n2, int n3, int n4, int n5) {
        int[] nArray = a[n][o];
        int[] nArray2 = nArray;
        nArray[0] = n2;
        nArray2[1] = n3;
        nArray2[2] = n4;
        nArray2[3] = n5;
        ++o;
    }

    private static final int a(int n, int n2) {
        if (i.a(0, 8)) {
            return a[0][6] - a[1] - n2;
        }
        return n2;
    }

    static final void c(int n, int n2) {
        if (!b) {
            return;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_SetCamera: nLayer invalid : ").append(0);
            return;
        }
        if (a[0][0] != 1 || a[0][1] != 1) {
            return;
        }
        i.a[0][13] = n;
        i.a[0][14] = i.a(0, n2);
        if (i.a(0, 16)) {
            if (a[0][13] < 0) {
                i.a[0][13] = 0;
            } else if (a[0][13] + a[0] >= a[0][5]) {
                i.a[0][13] = a[0][5] - a[0] - 1;
            }
        }
        if (i.a(0, 32)) {
            if (a[0][14] < 0) {
                i.a[0][14] = 0;
                return;
            }
            if (a[0][14] + a[1] >= a[0][6]) {
                i.a[0][14] = a[0][6] - a[1] - 1;
            }
        }
    }

    static final int d() {
        if (!b) {
            return -1;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_GetCamera: nLayer invalid : ").append(0);
            return -1;
        }
        if (a[0][0] != 1 || a[0][1] != 1) {
            return -1;
        }
        return a[0][13];
    }

    static final int e() {
        if (!b) {
            return -1;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_GetCamera: nLayer invalid : ").append(0);
            return -1;
        }
        if (a[0][0] != 1 || a[0][1] != 1) {
            return -1;
        }
        if (i.a(0, 8)) {
            return a[0][6] - a[1] - a[0][14];
        }
        return a[0][14];
    }

    static final int f() {
        if (!b) {
            return -1;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_GetLayerWidth: nLayer invalid : ").append(0);
            return -1;
        }
        if (a[0][0] != 1 || a[0][1] != 1) {
            return -1;
        }
        return a[0][5];
    }

    static final int g() {
        if (!b) {
            return -1;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_GetLayerHeight: nLayer invalid : ").append(0);
            return -1;
        }
        if (a[0][0] != 1 || a[0][1] != 1) {
            return -1;
        }
        return a[0][6];
    }

    static final int a(int n, int n2, int n3) {
        n3 = i.a(0, n3);
        if (!b) {
            return -1;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_GetTile: nLayer invalid : ").append(0);
            return -1;
        }
        if (a[0][0] != 1 || a[0][1] != 1) {
            return -1;
        }
        if (n2 < 0 || n2 > a[0][2]) {
            new StringBuffer().append("Tileset_GetTile: x value out of bound [").append(n2).append("]  0 <= x < ").append(a[0][2]);
            return -1;
        }
        if (n3 < 0 || n3 > a[0][3]) {
            new StringBuffer().append("Tileset_GetTile: y value out of bound [").append(n3).append("]  0 <= y < ").append(a[0][3]);
            return -1;
        }
        n = n3;
        n3 = n2;
        n2 = a[0][2];
        return i.b(0, 0, n * n2 + n3);
    }

    static final j a() {
        if (!b) {
            return null;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_GetBufferImage: p_iLayer invalid : ").append(0);
            return null;
        }
        return a[0][0];
    }

    static void d() {
        if (!b) {
            return;
        }
        if (i.a(0, 256)) {
            i.a[0][9] = 1;
            return;
        }
        i.a[0][9] = -1;
        i.a[0][10] = -1;
        i.a[0][11] = -1;
        i.a[0][12] = -1;
    }

    static void a(int n, int n2, int n3) {
        n2 = i.a(0, n2);
        n /= a[2];
        n2 /= a[5];
        if (!b) {
            return;
        }
        if (l <= 0) {
            new StringBuffer().append("Tileset_SetTile: layer invalid : ").append(0);
            return;
        }
        if (a[0][0] != 1 || a[0][1] != 1) {
            return;
        }
        if (n < 0 || n > a[0][2]) {
            new StringBuffer().append("Tileset_SetTile: x value out of bound [").append(n).append("]  0 <= x < ").append(a[0][2]);
            return;
        }
        if (n2 < 0 || n2 > a[0][3]) {
            new StringBuffer().append("Tileset_SetTile: y value out of bound [").append(n2).append("]  0 <= y < ").append(a[0][3]);
            return;
        }
        n += n2 * a[0][2];
        if (n3 != -1) {
            i.b(0, n, n3);
        }
        i.b(1, n, 0);
    }

    static final void a(int n, int n2, int n3, int n4, boolean bl) {
        if (i.a(0, 4)) {
            i.a(2, 0, null, 0, 0, 0, 0, n3, n4, 0, bl, null);
            return;
        }
        n2 = 0 - i.e();
        n = 0 - i.d();
        f.c(f.a, n, n2, n3, n4);
    }

    static final void a(int n, d d2, int n2, int n3, int n4, boolean bl, int[] nArray) {
        if (p != 100) {
            f.n();
            f.a[13][1] = n = p;
            f.b(true);
        }
        if (i.a(0, 4)) {
            i.a(0, 0, d2, 0, n2, n3, n4, 0, 0, 0, bl, nArray);
        } else {
            d2.a(f.a, n2, n3 - i.d(), n4 - i.e(), 0);
        }
        if (p != 100) {
            f.b(false);
            f.o();
        }
    }

    private static void a(int n, int n2, Object object, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl, int[] nArray) {
        int n10 = n4;
        int n11 = n5;
        int n12 = n6;
        int n13 = n7;
        int[] nArray2 = nArray;
        n9 = bl ? 1 : 0;
        n7 = n8;
        n6 = n13;
        n5 = n12;
        n4 = n11;
        n3 = n10;
        if (i.a(0, 4) && (o != 0 || n9 != 0)) {
            int n14;
            int n15;
            int n16;
            nArray = a[0];
            n2 = 0;
            n8 = 0;
            int n17 = 0;
            int n18 = 0;
            if (n == 0) {
                n2 = ((d)object).f(n3);
                n8 = ((d)object).g(n3);
                n17 = ((d)object).d(n3);
                n18 = ((d)object).e(n3);
                if ((f.aa & 0x2000) != 0) {
                    n16 = f.a[13][1];
                    n2 = n2 * n16 / 100;
                    n8 = n8 * n16 / 100;
                    n17 = n17 * n16 / 100;
                    n18 = n18 * n16 / 100;
                }
            } else if (n == 1 || n == 2 || n == 3 || n == 5 || n == 4) {
                n17 = n6;
                n18 = n7;
            } else {
                new StringBuffer().append("Tileset_PaintToBuffer: Invalid drawOperation set: ").append(n);
            }
            n5 = i.a(0, n5);
            n16 = nArray[13];
            int n19 = nArray[14];
            if (i.a(0, 256)) {
                n15 = nArray[2];
                n14 = nArray[3];
            } else {
                n15 = a[2];
                n14 = a[5];
            }
            int n20 = n16 % n15;
            int n21 = n19 % n14;
            if (n20 < 0) {
                n20 = n15 + n20;
            }
            if (n21 < 0) {
                n21 = n14 + n21;
            }
            n4 -= (n16 -= n20);
            n5 -= (n19 -= n21);
            if (i.a(0, 273) && n16 < 0) {
                n16 = nArray[7] + n16 % nArray[7];
            }
            if (i.a(0, 290) && n19 < 0) {
                n19 = nArray[8] + n19 % nArray[8];
            }
            n15 = n16 % nArray[7];
            n14 = n19 % nArray[8];
            n20 = nArray[7] - n15;
            n21 = nArray[8] - n14;
            Graphics graphics = a[0][0];
            int n22 = f.a(graphics);
            int n23 = f.b(graphics);
            int n24 = f.c(graphics);
            int n25 = f.d(graphics);
            int n26 = 1;
            if (n9 == 0) {
                n26 = o;
            }
            int n27 = nArray[7];
            int n28 = nArray[8];
            int n29 = d.b;
            int n30 = d.c;
            int n31 = n28;
            d.b = n27;
            d.c = n31;
            n31 = n26;
            n17 = (n4 += n2) + n17;
            n18 = (n5 += n8) + n18;
            int n32 = 0;
            int n33 = 0;
            int n34 = 0;
            int n35 = 0;
            if (nArray2 != null) {
                n32 = nArray2[0] - n16;
                n33 = nArray2[1] - n19;
                n34 = nArray2[2] - n16;
                n35 = nArray2[3] - n19;
            }
            for (int i2 = 0; i2 < 1; ++i2) {
                n16 = n4;
                n19 = n5;
                int n36 = n17;
                int n37 = n18;
                for (int i3 = 0; i3 < 1; ++i3) {
                    int n38 = n16;
                    int n39 = n19;
                    int n40 = n36;
                    int n41 = n37;
                    if (n38 > n27 || n41 < 0 || n40 < 0 || n39 > n28) continue;
                    n26 = n31;
                    while (--n26 >= 0) {
                        int n42;
                        int n43;
                        int n44;
                        int n45;
                        int[] nArray3 = null;
                        if (n9 == 0) {
                            nArray3 = a[0][n26];
                            n45 = nArray3[0] - n15;
                            if (nArray3[0] < n15) {
                                n45 += nArray[7];
                            }
                            if (n38 >= (n44 = n45 + nArray3[2]) || n40 < n45) continue;
                            n43 = nArray3[1] - n14;
                            if (nArray3[1] < n14) {
                                n43 += nArray[8];
                            }
                            if (n39 >= (n42 = n43 + nArray3[3]) || n41 < n43) continue;
                        }
                        if (n38 < n20 && (nArray2 == null || n32 < n20)) {
                            if (n39 < n21 && (nArray2 == null || n33 < n21)) {
                                if (nArray2 != null) {
                                    n45 = n32 > 0 ? n32 : 0;
                                    n44 = n33 > 0 ? n33 : 0;
                                    n43 = (n34 < n20 ? n34 : n20) - n45;
                                    n42 = (n35 < n21 ? n35 : n21) - n44;
                                    n45 += n15;
                                    n44 += n14;
                                } else {
                                    n45 = n15;
                                    n44 = n14;
                                    n43 = n20;
                                    n42 = n21;
                                }
                                i.a(graphics, object, n3, 0, n45, n44, n43, n42, n15 + n38 - n2, n14 + n39 - n8, n6, n7, n, n22, n23, n24, n25, nArray3, n9 != 0);
                            }
                            if (n41 >= n21 && n14 != 0 && (nArray2 == null || n35 >= n21)) {
                                if (nArray2 != null) {
                                    n45 = n32 > 0 ? n32 : 0;
                                    n44 = n33 - n21 > 0 ? n33 - n21 : 0;
                                    n43 = (n34 < n20 ? n34 : n20) - n45;
                                    n42 = (n35 - n21 < n14 ? n35 - n21 : n14) - n44;
                                    n45 += n15;
                                } else {
                                    n45 = n15;
                                    n44 = 0;
                                    n43 = n20;
                                    n42 = n14;
                                }
                                i.a(graphics, object, n3, 0, n45, n44, n43, n42, n15 + n38 - n2, n39 - n8 - n21, n6, n7, n, n22, n23, n24, n25, nArray3, n9 != 0);
                            }
                        }
                        if (n40 < n20 || n15 == 0 || nArray2 != null && n34 < n20) continue;
                        if (n39 < n21 && (nArray2 == null || n33 < n21)) {
                            if (nArray2 != null) {
                                n45 = n32 - n20 > 0 ? n32 - n20 : 0;
                                n44 = n33 > 0 ? n33 : 0;
                                n43 = (n34 - n20 < n15 ? n34 - n20 : n15) - n45;
                                n42 = (n35 < n21 ? n35 : n21) - n44;
                                n44 += n14;
                            } else {
                                n45 = 0;
                                n44 = n14;
                                n43 = n15;
                                n42 = n21;
                            }
                            i.a(graphics, object, n3, 0, n45, n44, n43, n42, n38 - n2 - n20, n14 + n39 - n8, n6, n7, n, n22, n23, n24, n25, nArray3, n9 != 0);
                        }
                        if (n41 < n21 || n14 == 0 || nArray2 != null && n35 < n21) continue;
                        if (nArray2 != null) {
                            n45 = n32 - n20 > 0 ? n32 - n20 : 0;
                            n44 = n33 - n21 > 0 ? n33 - n21 : 0;
                            n43 = (n34 - n20 < n15 ? n34 - n20 : n15) - n45;
                            n42 = (n35 - n21 < n14 ? n35 - n21 : n14) - n44;
                        } else {
                            n45 = 0;
                            n44 = 0;
                            n43 = n15;
                            n42 = n14;
                        }
                        i.a(graphics, object, n3, 0, n45, n44, n43, n42, n38 - n2 - n20, n39 - n8 - n21, n6, n7, n, n22, n23, n24, n25, nArray3, n9 != 0);
                    }
                }
            }
            n3 = n25;
            int n46 = n24;
            n2 = n23;
            f.b(graphics, n22, n2, n46, n3);
            n = n30;
            d.b = n29;
            d.c = n;
        }
    }

    private static void a(Graphics graphics, Object object, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int[] nArray, boolean bl) {
        f.a(graphics, n3, n4, n5, n6);
        if (!bl) {
            int n16 = nArray[3];
            n6 = nArray[2];
            n5 = nArray[1];
            f.a(graphics, nArray[0], n5, n6, n16);
        }
        if (n11 == 0) {
            ((d)object).b(graphics, n, n7, n8, 0);
        } else if (n11 == 5) {
            n3 = n9;
            f.a(graphics, (int[])object, 0, n3, n7, n8, n3, n10, true, false, 0, -1, true);
        } else if (n11 == 4) {
            f.a(graphics, (j)object, n7, n8);
        } else if (n11 == 1) {
            f.d(graphics, n7, n8, n9, n10);
        } else if (n11 == 2) {
            f.c(graphics, n7, n8, n9, n10);
        } else if (n11 == 3) {
            f.e(graphics, n7, n8, n9, n10);
        }
        f.b(graphics, n12, n13, n14, n15);
    }

    private static final void b(int n, int n2, int n3) {
        i.a[0][n][n2] = (byte)n3;
    }

    private static int b(int n, int n2, int n3) {
        return a[n][n2][n3] & 0xFF;
    }

    private static void h(int n) {
        int n2;
        int n3;
        int[] nArray = a[n];
        int n4 = nArray[13];
        int n5 = nArray[14];
        int n6 = a[0];
        int n7 = a[1];
        int n8 = nArray[5];
        int n9 = nArray[6];
        int n10 = n8 + nArray[7];
        int n11 = n9 + nArray[8];
        int n12 = nArray[2];
        int n13 = nArray[3];
        int n14 = nArray[9] > 0 ? 1 : 0;
        int n15 = n4;
        if (n4 < 0) {
            n15 = n4 - (n12 - 1);
        }
        int n16 = n5;
        if (n5 < 0) {
            n16 = n5 - (n13 - 1);
        }
        if (n14 == 0) {
            int n17 = n5 + n7 - 1;
            n3 = n4 + n6 - 1;
            n2 = n11 - 1;
            if (n10 - 1 < n4 ? false : (n8 > n3 ? false : (n2 < n5 ? false : n9 <= n17))) {
                n3 = 0;
                n2 = 0;
                if (n4 < n8) {
                    n4 = n15 / n12 * n12;
                    n14 = n16 / n13 * n13;
                    n6 = n8 - n4;
                    n8 = nArray[8];
                    n3 = n6;
                    n2 = n6;
                    nArray[5] = n4;
                    i.c(n, n4, n14, n6, n8);
                } else if (n4 + n6 >= n10) {
                    n14 = n16 / n13 * n13;
                    n6 = ((n4 + n6 - n10) / n12 + 1) * n12;
                    n8 = nArray[8];
                    n2 = n6;
                    nArray[5] = n15 / n12 * n12;
                    i.c(n, n10, n14, n6, n8);
                }
                if (n5 < n9) {
                    n4 = n15 / n12 * n12 + n3;
                    n14 = n16 / n13 * n13;
                    n6 = nArray[7] - n2;
                    n8 = n9 - n14;
                    nArray[6] = n14;
                    i.c(n, n4, n14, n6, n8);
                } else if (n5 + n7 >= n11) {
                    n4 = n15 / n12 * n12 + n3;
                    n6 = nArray[7] - n2;
                    n8 = ((n5 + n7 - n11) / n13 + 1) * n13;
                    nArray[6] = n16 / n13 * n13;
                    i.c(n, n4, n11, n6, n8);
                }
                nArray[10] = 0;
                return;
            }
        }
        n3 = n15 / n12 * n12;
        n2 = n16 / n13 * n13;
        i.c(n, n3, n2, nArray[7], nArray[8]);
        nArray[5] = n3;
        nArray[6] = n2;
        if (n14 != 0) {
            nArray[9] = 0;
        }
        nArray[10] = 1;
    }

    private static void c(int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        Graphics graphics = a[n][0];
        graphics.setColor(a[n][4]);
        int n9 = a[n][7];
        int n10 = a[n][8];
        if ((n2 %= n9) < 0) {
            n2 += n9;
        }
        if ((n3 %= n10) < 0) {
            n3 += n10;
        }
        if (n2 + n4 > n9) {
            n8 = n5;
            if (n3 + n5 > n10) {
                n7 = n3 + n5 - n10;
                n6 = n2 + n4 - n9;
                f.c(graphics, 0, 0, n6, n7);
                i.b(n, 0, 0, n2 + n4 - n9, n3 + n5 - n10);
                n8 = n10 - n3;
            }
            int n11 = n8;
            n6 = n2 + n4 - n9;
            n7 = n3;
            f.c(graphics, 0, n7, n6, n11);
            i.b(n, 0, n3, n2 + n4 - n9, n8);
            n4 = n9 - n2;
        }
        if (n3 + n5 > n10) {
            n7 = n3 + n5 - n10;
            n6 = n4;
            f.c(graphics, n2, 0, n6, n7);
            i.b(n, n2, 0, n4, n3 + n5 - n10);
            n5 = n10 - n3;
        }
        n6 = n5;
        n8 = n4;
        n10 = n3;
        f.c(graphics, n2, n10, n8, n6);
        i.b(n, n2, n3, n4, n5);
    }

    static {
        p = 100;
    }
}

