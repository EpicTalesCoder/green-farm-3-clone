/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class e {
    static e[] a;
    private static boolean f;
    private int M;
    private int N;
    private int O;
    long a;
    boolean a;
    private int P = 0;
    private boolean g;
    long b;
    private int Q;
    private int R;
    private int S;
    int a;
    private boolean h;
    long c;
    long d;
    int b;
    int c;
    int d;
    int e;
    long e;
    int f;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    boolean b;
    int g = 0;
    short a;
    private boolean m;
    private boolean n;
    short b;
    short c;
    int h = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    short d;
    boolean c;
    long f = 0L;
    int l = 0;
    int m = 0;
    private int T = 0;
    int n = 0;
    int o;
    private int U = 0;
    private int V = 0;
    private int W = 0;
    boolean d = false;
    private boolean o = false;
    private int X = 0;
    private int Y = 0;
    private int Z = 0;
    private int aa = 0;
    private int ab = 0;
    private int ac = 0;
    private boolean p;
    private static int ad;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    int p = 0;
    e a;
    private e b;
    private int aj = -1;
    int q;
    int r;
    int s;
    int t;
    private int ak;
    int u;
    int v;
    private int al;
    private int am;
    private int an;
    int w;
    int x;
    private int ao;
    short e;
    int y = -1;
    int z;
    int A = 0;
    int B = 0;
    int C;
    int D;
    int E;
    int F;
    private int ap;
    int G;
    int H;
    int I;
    private e c = false;
    i a;
    private int aq;
    private int ar;
    i b = 0;
    boolean e = 0;
    int J;
    int K = 0;
    byte a = 0;
    private static int[] a;
    private static int[][] a;
    private static int as;
    int L;

    e() {
    }

    static void a() {
        for (int i2 = 0; i2 < 5; ++i2) {
            int n = i2;
            e e2 = a[n];
            while (e2 != null) {
                e e3 = e2.a;
                if (e2.a != null) {
                    e2.a.c(f.V);
                }
                switch (e2.q) {
                    case 10: {
                        break;
                    }
                    case 42: {
                        e e4 = e2;
                        switch (e4.D) {
                            case 0: {
                                if (!e4.a.a()) break;
                                e4.c(0);
                                break;
                            }
                            case 1: {
                                e4.N();
                                if (e4.r != e4.A || e4.s != e4.B) break;
                                e4.c(0);
                                break;
                            }
                            case 2: {
                                int n2 = e4.a.a();
                                if (!e4.a.a() && n2 != 2) break;
                                e4.c(0);
                                a.v = 3;
                                break;
                            }
                            case 3: {
                                if (!e4.a.a()) break;
                                e4.c(0);
                                a.b(292, 293, 15);
                                a.p = 0;
                            }
                        }
                        break;
                    }
                    case 51: {
                        e e4 = e2;
                        switch (e4.D) {
                            case 0: {
                                if (!e4.a.a()) break;
                                e4.l(0);
                                break;
                            }
                            case 1: {
                                e4.N();
                                if (e4.r != e4.A || e4.s != e4.B) break;
                                e4.l(0);
                            }
                        }
                        break;
                    }
                    case 50: {
                        long l2;
                        e e4 = e2;
                        if (e4.y == 18) break;
                        if ((e4.y == 12 || e4.y == 11) && a.N == 0 && e4.a(512)) {
                            l2 = System.currentTimeMillis() / 1000L - e4.a;
                            if (l2 < 86400L && a.d == e4) {
                                a.a((int)l2, 86400);
                                e4.K = a.a((int)(86400L - l2));
                            }
                            if (e4.a || l2 < 86400L) break;
                            e4.a = true;
                            e4.j(16);
                            int[] nArray = new int[]{e4.r, e4.s, 150, 10, 7, -31, -58, 0, 1};
                            e4.a(e.a(33, 0, nArray));
                            if (!a.a()) break;
                            a.a(false, null);
                            break;
                        }
                        if (e4.y == 15) {
                            i i3 = e4.a;
                            if (a.c()) {
                                if (e4.P >= 0) {
                                    e4.P -= f.V;
                                    if (e4.P < 0) {
                                        e4.a = new i(a.b[e4.E], e4.u, e4.v);
                                        e4.a.b(0, 1);
                                    }
                                } else if (e4.a != null) {
                                    e4.a.c(f.V);
                                    if (e4.a.a()) {
                                        e4.a = null;
                                        e4.P = f.c(1000, 4000);
                                    }
                                }
                            } else if (e4.a != null) {
                                e4.a = null;
                            }
                            if (i3 == e4.a) break;
                            e4.H();
                            break;
                        }
                        if (e4.y == 9) {
                            if (a.N == 0 && a.d()) {
                                if (!e4.g && a.f(a.f[0]) && a.f(a.f[1])) {
                                    e4.g = true;
                                    int[] nArray = new int[]{e4.r, e4.s, 150, 10, 7, -31, -58, 0, 1};
                                    e4.a(e.a(33, 0, nArray));
                                }
                                if (e4.P >= 0) {
                                    e4.P -= f.V;
                                    if (e4.P >= 0) break;
                                    e4.a = new i(a.b[e4.E], e4.u, e4.v);
                                    e4.a.b(0, 1);
                                    break;
                                }
                                if (e4.a == null) break;
                                e4.a.c(f.V);
                                if (!e4.a.a()) break;
                                e4.P = f.c(10000, 30000);
                                e4.a = null;
                                break;
                            }
                            if (e4.a != null) {
                                e4.a = null;
                                e4.H();
                            }
                            if (!e4.g) break;
                            e4.G();
                            e4.g = false;
                            break;
                        }
                        if (e4.y == 2) {
                            if (a.f()) {
                                if (e4.b == null) {
                                    d d2 = a.b[e4.E];
                                    short s = d2.a[1];
                                    e4.aq = d2.b(s);
                                    e4.ar = d2.c(s);
                                    e4.b = new i(a.b[147], e4.u, e4.v);
                                }
                                if (e4.P >= 0) {
                                    e4.P -= f.V;
                                    if (e4.P >= 0) break;
                                    e4.b.b(0, 1);
                                    break;
                                }
                                e4.b.c(f.V);
                                if (!e4.b.a()) break;
                                e4.P = f.c(3000, 4000);
                                break;
                            }
                            if (e4.b == null) break;
                            e4.b = null;
                            break;
                        }
                        if (e4.y == 1) {
                            if (e4.b == null) break;
                            e4.b = null;
                            break;
                        }
                        if (e4.y != 14) break;
                        if (!e4.a && a.g()) {
                            e4.a = true;
                            e4.j(16);
                            int[] nArray = new int[]{e4.r, e4.s, 150, 10, 7, -31, -58, 0, 1};
                            e4.a(e.a(33, 0, nArray));
                        }
                        long l3 = System.currentTimeMillis() / 1000L;
                        boolean bl = false;
                        for (int i4 = 0; !bl && i4 < a.A; ++i4) {
                            bl = a.a[i4] > 0L && l3 < a.a[i4] + (long)a.c[i4];
                        }
                        if (bl) {
                            if (e4.a == null) {
                                e4.a = new i(a.b[e4.E], e4.u, e4.v);
                                e4.a.b(1, -1);
                                a.d(36);
                                break;
                            }
                            e4.a.c(f.V);
                            break;
                        }
                        if (e4.a == null) break;
                        e4.a = null;
                        break;
                    }
                    case 34: {
                        break;
                    }
                    case 54: {
                        e2.J();
                        break;
                    }
                    case 49: {
                        e2.I();
                        break;
                    }
                    case 52: {
                        long l2;
                        e e4 = e2;
                        if (e4.D == 2) {
                            l2 = (System.currentTimeMillis() - e4.c) / 1000L;
                            if (l2 >= (long)e4.L) {
                                e4.g(3);
                            }
                            if (a.d != e4 || e4.L == 0) break;
                            a.a((int)l2, e4.L);
                            e4.K = a.a((int)((long)e4.L - l2));
                            break;
                        }
                        if (a.d != e4) break;
                        a.a(false, null);
                        break;
                    }
                    case 20: {
                        break;
                    }
                    case 21: {
                        e2.A();
                        break;
                    }
                    case 47: {
                        e2.w();
                        break;
                    }
                    case 22: {
                        e e4 = e2;
                        if (e4.D == 0) break;
                        if (e4.a.a()) {
                            e4.a.b(0, -1);
                        }
                        e4.f();
                        break;
                    }
                    case 23: {
                        e2.M();
                        break;
                    }
                    case 32: {
                        if (e2.r == e2.A && e2.s == e2.B) break;
                        e2.N();
                        break;
                    }
                    case 33: {
                        e2.r = e2.c.r;
                        e2.s = e2.c.s;
                        if (e2.a == null || !e2.a.a()) break;
                        e2.a = null;
                        break;
                    }
                    case -1: {
                        e2.e();
                    }
                }
                if (e2.q != 10 && e2.q != 13) {
                    e2.f();
                    if (e2.a != null) {
                        e2.a.a(e2.u, e2.v);
                    }
                }
                e2 = e3;
            }
        }
    }

    static void b() {
        for (int i2 = 0; i2 < 5; ++i2) {
            int n;
            e e2;
            int n2 = i2;
            e e3 = a[n2];
            while (e3 != null) {
                e2 = e3;
                if (e2.G > -1 && e2.a(0x1000008)) {
                    e2.f(e2.G, e2.H);
                }
                e3 = e3.a;
            }
            e3 = a[n2];
            while (e3 != null) {
                e2 = e3;
                if (e2.q == 10) {
                    if (a.c.s < 288) {
                        int n3 = 70;
                        if (a.J != 100) {
                            f.n();
                            f.p(a.J);
                            n3 = 70 * a.J / 100;
                        }
                        int n4 = 41727;
                        i.a[0][0].setColor(n4);
                        i.a(0, 0, i.f(), n3, a.k);
                        int n5 = i.f();
                        n = 400;
                        n3 = 181;
                        if (a.J != 100) {
                            n = 400 * a.J / 100;
                            n3 = 181 * a.J / 100;
                        }
                        for (n4 = 0; n4 < n5; n4 += n) {
                            i.a(0, a.b[79], 0, n4, n3, a.k, null);
                        }
                        n = 120;
                        n3 = 268;
                        if (a.J != 100) {
                            n = 120 * a.J / 100;
                            n3 = 268 * a.J / 100;
                        }
                        for (n4 = 0; n4 < n5; n4 += n) {
                            i.a(0, a.b[78], 0, n4, n3, a.k, null);
                        }
                        n = 200;
                        n3 = 288;
                        if (a.J != 100) {
                            n = 200 * a.J / 100;
                            n3 = 288 * a.J / 100;
                        }
                        for (n4 = 0; n4 < n5; n4 += n) {
                            i.a(0, a.b[77], 0, n4, n3, a.k, null);
                        }
                        if (a.J != 100) {
                            f.o();
                        }
                    }
                } else if (e2.a(0x1000008) && e2.E > -1 && e2.F > -1) {
                    e2.f(e2.E, e2.F);
                }
                e3 = e3.a;
            }
            e3 = a[n2];
            while (e3 != null) {
                int n6;
                int n7;
                block47: {
                    block50: {
                        block48: {
                            block49: {
                                block46: {
                                    e2 = e3;
                                    if (e2.q != 10) break block46;
                                    i.a(f.a, 0, 0, 0);
                                    break block47;
                                }
                                if (!e2.a(8)) break block47;
                                if (e2.a(0x1000000) && e2.a == null) break block48;
                                int n8 = e2.ap;
                                if (e2.a == null) break block49;
                                if (e2.a(65536)) {
                                    n8 += e2.a.a().a >> 1;
                                }
                                e2.a.a().d(n8);
                                e2.a.a(e2.u, e2.v);
                                e2.a.d(a.J);
                                e2.a.b();
                                if (e2.a(0x2000000)) {
                                    a.b[e2.E].a(a, e2.a.a(), e2.a.b(), e2.r, e2.s, e2.a.a);
                                    if (a.J != 100) {
                                        e.a[0] = a[0] * a.J / 100;
                                        e.a[1] = a[1] * a.J / 100;
                                        e.a[2] = a[2] * a.J / 100;
                                        e.a[3] = a[3] * a.J / 100;
                                    }
                                    e.a(a[0], a[1], a[2], a[3]);
                                }
                                break block50;
                            }
                            if (e2.G > -1) {
                                e2.g(e2.G, e2.H);
                            }
                            if (e2.E <= -1) break block50;
                            e2.g(e2.E, e2.F);
                            break block50;
                        }
                        if (e2.E > -1 && e2.F > -1) {
                            int n9 = e2.E;
                            int n10 = n9 & Short.MAX_VALUE;
                            Object object = (n9 & 0x8000) != 0 ? a.a[n10] : a.b[n10];
                            int n11 = e2.ap;
                            if (e2.a(65536)) {
                                n11 += ((d)object).a >> 1;
                            }
                            ((d)object).d(n11);
                            d d2 = object;
                            object = e2;
                            d2.a(a, ((e)object).F, ((e)object).r, ((e)object).s);
                            if (a.J != 100) {
                                e.a[0] = a[0] * a.J / 100;
                                e.a[1] = a[1] * a.J / 100;
                                e.a[2] = a[2] * a.J / 100;
                                e.a[3] = a[3] * a.J / 100;
                            }
                            for (n = 0; n < as; ++n) {
                                if (a[2] < a[n][0] || a[0] > a[n][2] || a[3] < a[n][1] || a[1] > a[n][3]) continue;
                                int[] nArray = new int[2];
                                int[] nArray2 = new int[2];
                                nArray[0] = a[n][2];
                                nArray[1] = a[n][3];
                                a.b(nArray, nArray2);
                                a.b(a[n], nArray);
                                n7 = nArray2[1] - nArray[1];
                                n6 = nArray2[0] - nArray[0];
                                int n12 = nArray[1];
                                n9 = nArray[0];
                                f.b(f.a, n9, n12, n6, n7);
                                if (a.J == 100) {
                                    if (a.K > 1 || a.K == -1) {
                                        d2.a(f.a, ((e)object).F, ((e)object).u, ((e)object).v, 0);
                                    }
                                } else {
                                    d2.c(f.a, ((e)object).F, ((e)object).u, ((e)object).v, a.J);
                                }
                                n12 = f.U;
                                n9 = f.T;
                                f.b(f.a, 0, 0, n9, n12);
                            }
                        }
                    }
                    if (e2.q == 47) {
                        e2.y();
                    }
                }
                switch (e2.q) {
                    case 54: {
                        int n13;
                        e e4 = e2;
                        if (!e4.a(8)) break;
                        int n14 = e4.a.a();
                        if ((n14 == 1 || n14 == 6 || n14 == 2 || n14 == 7) && a.a[1] != null) {
                            n = e4.u + e4.h;
                            int n15 = e4.v + e4.i;
                            if (a.J == 100) {
                                a.a[1].a(f.a, 8, n, n15, 0);
                            } else {
                                a.a[1].c(f.a, 8, n += 10, n15, a.J);
                            }
                        }
                        if (!e4.a(2048)) break;
                        if (a.J == 100) {
                            n = e4.u + 5;
                            n13 = e4.v + -40;
                        } else {
                            n = e4.u + 2;
                            n13 = e4.v + -20;
                        }
                        if (a.J == 100) {
                            a.a[1].a(f.a, 34, n, n13, 0);
                            break;
                        }
                        a.a[1].c(f.a, 34, n, n13 += 40, a.J);
                    }
                }
                if (e2.e && a.a == e2) {
                    boolean bl;
                    n6 = n = e2.ao;
                    d d3 = a.b[14];
                    e e5 = e2;
                    if (d3 != null && n6 > -1) {
                        n7 = e5.u + d3.f(n6);
                        int n16 = e5.v + d3.g(n6);
                        int n17 = n7 + d3.d(n6);
                        int n18 = n16 + d3.e(n6);
                        n = 0 + f.T;
                        int n19 = 0 + f.U;
                        bl = n17 > 0 && n7 < n && n18 > 0 && n16 < n19;
                    } else {
                        bl = false;
                    }
                    if (bl && a.a(e2)) {
                        if (a.J == 100) {
                            a.b[14].a(f.a, e2.ao, e2.u, e2.v, 0);
                        } else {
                            f.b(true);
                            a.b[14].c(f.a, e2.ao, e2.u, e2.v, a.J);
                            f.b(false);
                        }
                    }
                }
                e3 = e3.a;
            }
            e3 = a[n2];
            while (e3 != null) {
                e2 = e3;
                if (e2.b != null) {
                    e2.b.a(e2.u + e2.aq, e2.v + e2.ar);
                    e2.b.d(a.J);
                    f.b(true);
                    e2.b.b();
                    f.b(false);
                }
                e3 = e3.a;
            }
        }
        a.k = false;
        as = 0;
    }

    private static void a(int n, int n2, int n3, int n4) {
        if (as >= 150) {
            as = 0;
        }
        e.a[e.as][0] = n;
        e.a[e.as][1] = n2;
        e.a[e.as][2] = n3;
        e.a[e.as][3] = n4;
        ++as;
    }

    static void c() {
        for (int i2 = 0; i2 < 5; ++i2) {
            int n = i2;
            while (a[n] != null) {
                a[n].e();
            }
        }
    }

    static void d() {
        e e2 = a[2];
        while (e2 != null) {
            if (e2.q == 47) {
                if (e2 != null && e2.T == 10) {
                    a.k(e2.W);
                } else if (e2.T == 9) {
                    a.g(e2.W);
                } else if (e2.T == 2) {
                    a.h(e2.W);
                } else if (e2.T == 29) {
                    int n = e2.W & 0xFFFF;
                    int n2 = e2.W >> 16;
                    if (n == 110) {
                        a.j(n2);
                    } else if (n == 5) {
                        a.i(n2);
                    } else if ((n < 111 || n > 116) && n >= 1 && n <= 26) {
                        a.a(0, n, n2);
                    }
                }
            }
            e2 = e2.a;
        }
    }

    private static void a(e e2, int n) {
        e2.aj = n;
        e2.al = e2.c();
        e e3 = null;
        e e4 = a[n];
        while (e4 != null && e2.al > e4.c()) {
            e3 = e4;
            e4 = e4.a;
        }
        e2.b = e3;
        e2.a = e4;
        if (e3 == null) {
            e.a[n] = e2;
        } else {
            e3.a = e2;
        }
        if (e4 != null) {
            e4.b = e2;
        }
    }

    static void a(int n) {
        e e2;
        e e3 = a[0];
        e e4 = null;
        while (e3 != null) {
            e2 = e3.a;
            int n2 = e3.c();
            if (n2 != e3.al) {
                e3.al = n2;
                e3.e();
                e3.a = e4;
                e4 = e3;
            }
            e3 = e2;
        }
        while (e4 != null) {
            e2 = e4.a;
            e.a(e4, 0);
            e4 = e2;
        }
    }

    final void e() {
        if (this.a(0x1000000)) {
            this.H();
        }
        if (this.b != null) {
            this.b.a = this.a;
        } else if (this.aj >= 0) {
            e.a[this.aj] = this.a;
        }
        if (this.a != null) {
            this.a.b = this.b;
        }
        this.aj = -1;
        this.a = null;
        this.b = null;
    }

    private static int f(int n, int n2) {
        e e2 = a[0];
        int n3 = 0;
        while (e2 != null) {
            if (e2.q == n2) {
                ++n3;
            }
            e2 = e2.a;
        }
        return n3;
    }

    static int a(int n, int n2) {
        e e2 = a[0];
        int n3 = 0;
        while (e2 != null) {
            if ((n2 == -1 || e2.q == n2) && e2.a(512)) {
                ++n3;
            }
            e2 = e2.a;
        }
        return n3;
    }

    static int b(int n, int n2) {
        e e2 = a[0];
        int n3 = 0;
        while (e2 != null) {
            if (e2.J == n2 && e2.a(512)) {
                ++n3;
            }
            e2 = e2.a;
        }
        return n3;
    }

    static int a(int n, int n2, int n3, int n4) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null) {
            if (e2.q == 54 && e2.a(512) && e2.y % 2 == 1 && e2.y >= n3 && e2.y <= n4) {
                ++n2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int c(int n, int n2) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null) {
            if (e2.q == 52 && e2.a(512)) {
                ++n2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int d(int n, int n2) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null) {
            if (e2.q == 54 && e2.a(512) && e2.y % 2 == 1 && e2.a(2048)) {
                ++n2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static e a(int n) {
        if (a != null) {
            e e2;
            e e3 = e2 = a[0];
            while (e2 != null) {
                if (e2.a(512)) {
                    boolean bl;
                    int n2;
                    e3 = e2;
                    if (e3.E != -1 && e3.F != -1 && (e3.E & 0xFFFF0000) == 0 && (n2 = (e3.E & 0x8000) != 0 ? a.a[e3.E & Short.MAX_VALUE].h(e3.F) : a.b[e3.E].h(e3.F)) > 0) {
                        int[] nArray = new int[4];
                        int[] nArray2 = new int[2];
                        int[] nArray3 = new int[2];
                        nArray2[0] = a.F;
                        nArray2[1] = a.G;
                        a.a(nArray2, nArray3);
                        if ((e3.E & 0x8000) != 0) {
                            a.a[e3.E & Short.MAX_VALUE].a(e3.F, 0, nArray, 0);
                        } else {
                            a.b[e3.E].a(e3.F, 0, nArray, 0);
                        }
                        int n3 = e3.r + nArray[0];
                        int n4 = e3.s + nArray[1];
                        int n5 = n3 + nArray[2];
                        int n6 = n4 + nArray[3];
                        bl = nArray3[0] + 1 >= n3 && nArray3[0] - 1 <= n5 && nArray3[1] + 1 >= n4 && nArray3[1] - 1 <= n6;
                    } else {
                        bl = false;
                    }
                    if (bl) {
                        return e2;
                    }
                }
                e3 = e2;
                e2 = e2.a;
            }
            e2 = e3;
            while (e2 != null) {
                if (e2.a(512)) {
                    e3 = e2;
                    int[] nArray = new int[2];
                    int[] nArray4 = new int[2];
                    nArray[0] = e3.r;
                    nArray[1] = e3.s;
                    a.c(nArray, nArray4);
                    nArray4[0] = nArray4[0] - (e3.w >> 1);
                    nArray4[1] = nArray4[1] - (e3.x >> 1);
                    int[] nArray5 = new int[2];
                    int[] nArray6 = nArray5;
                    nArray5[0] = a.F;
                    nArray6[1] = a.G;
                    a.a(nArray6, nArray);
                    a.c(nArray, nArray6);
                    if (nArray6[0] >= nArray4[0] && nArray6[0] < nArray4[0] + e3.w && nArray6[1] >= nArray4[1] && nArray6[1] < nArray4[1] + e3.x) {
                        return e2;
                    }
                }
                e2 = e2.b;
            }
        }
        return null;
    }

    static e a(int n, int n2) {
        e e2 = a[0];
        while (e2 != null) {
            if (e2.z == n2) {
                return e2;
            }
            e2 = e2.a;
        }
        return null;
    }

    static int a(int n, int n2, e[] eArray, int n3) {
        return e.a(n, n2, -1, eArray, n3);
    }

    static int a(int n, int n2, int n3, e[] eArray, int n4) {
        e e2 = a[n];
        int n5 = 0;
        while (e2 != null && n5 < n4) {
            if (!(n2 != -1 && e2.q != n2 || n3 != -1 && e2.y != n3)) {
                eArray[n5++] = e2;
            }
            e2 = e2.a;
        }
        return n5;
    }

    static int a(int n, int n2, int n3, int n4, e[] eArray, int n5) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null && n2 < n5) {
            if (e2.q == 54 && e2.a(512) && e2.y >= n3 && e2.y <= n4 && e2.y % 2 == 1) {
                eArray[n2++] = e2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int a(int n, int n2, int n3, e[] eArray) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null && n2 < 1) {
            if (e2.q == 48 && e2.a(512) && (n3 == -1 || e2.y == n3)) {
                eArray[n2++] = e2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int a(int n, int n2, int n3, int n4, e[] eArray) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null && n2 < 1) {
            if (e2.q == 54 && e2.a(512) && e2.J >= n3 && e2.J <= n4 && e2.J % 2 == 1) {
                eArray[n2++] = e2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int a(int n, int n2, e[] eArray, e e2) {
        e e3 = a[0];
        n2 = 0;
        while (e3 != null && n2 < 50) {
            if (e3.q == 54 && e3.a(512) && a.a(e3, e2)) {
                eArray[n2++] = e3;
            }
            e3 = e3.a;
        }
        return n2;
    }

    static int b(int n, int n2, int n3, e[] eArray, int n4) {
        e e2 = a[0];
        int n5 = 0;
        while (e2 != null && n5 < n4) {
            if (!(n2 != -1 && e2.q != n2 || n3 != -1 && e2.J != n3)) {
                eArray[n5++] = e2;
            }
            e2 = e2.a;
        }
        return n5;
    }

    static int a(int n, int n2, int n3, int n4, int n5, int n6, e[] eArray, int n7) {
        e e2 = a[0];
        n7 = 0;
        int[] nArray = new int[2];
        int[] nArray2 = new int[2];
        while (e2 != null && n7 < 100) {
            nArray[0] = e2.r;
            nArray[1] = e2.s;
            a.c(nArray, nArray2);
            if ((n2 == -1 || n2 == e2.q) && e2.q != -1 && nArray2[0] >= n3 && nArray2[0] < n4 && nArray2[1] >= n5 && nArray2[1] < n6) {
                eArray[n7++] = e2;
            }
            e2 = e2.a;
        }
        return n7;
    }

    static void b(int n) {
        e e2 = a[0];
        while (e2 != null) {
            int[] nArray = new int[2];
            int[] nArray2 = new int[2];
            nArray[0] = e2.r;
            nArray[1] = e2.s;
            a.c(nArray, nArray2);
            if (a.a(a.a(nArray2[0], nArray2[1]))) {
                e2.j(512);
            } else {
                e2.k(512);
            }
            e2 = e2.a;
        }
    }

    static int a(int n) {
        e e2 = a[2];
        int n2 = 0;
        while (e2 != null) {
            int n3;
            if (e2.q == 47 && e2.T == 29 && (n3 = e2.W & 0xFFFF) != 110 && n3 != 5 && (n3 < 111 || n3 > 116)) {
                n2 += e2.W >> 16;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int b(int n) {
        e e2 = a[2];
        int n2 = 0;
        while (e2 != null) {
            if (e2.q == 47 && e2.T == 10) {
                ++n2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int e(int n, int n2) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null) {
            if (e2.q == 54 && e2.a(512)) {
                n2 += e2.e;
            }
            e2 = e2.a;
        }
        return n2;
    }

    static int b(int n, int n2, int n3, e[] eArray) {
        e e2 = a[0];
        n2 = 0;
        while (e2 != null && n2 < 1) {
            if (e2.q == 54 && e2.a(4096) && e2.J == n3) {
                eArray[n2++] = e2;
            }
            e2 = e2.a;
        }
        return n2;
    }

    private void f(int n, int n2) {
        int n3 = n & Short.MAX_VALUE;
        d d2 = (n & 0x8000) != 0 ? a.a[n3] : a.b[n3];
        if (d2 == null || n2 < 0) {
            return;
        }
        int n4 = this.r;
        int n5 = this.s;
        if (a.J != 100) {
            f.n();
            f.p(a.J);
            n4 = n4 * a.J / 100;
            n5 = n5 * a.J / 100;
        }
        int n6 = this.ap;
        if (this.a(65536)) {
            n6 += d2.a >> 1;
        }
        d2.d(n6);
        i.a(0, d2, n2, n4, n5, a.k, null);
        int n7 = n2;
        n2 = n;
        e e2 = this;
        if (n7 > -1) {
            n4 = n2 & Short.MAX_VALUE;
            d d3 = (n2 & 0x8000) != 0 ? a.a[n4] : a.b[n4];
            d3.a(a, n7, e2.r, e2.s);
            if (a.J != 100) {
                e.a[0] = a[0] * a.J / 100;
                e.a[1] = a[1] * a.J / 100;
                e.a[2] = a[2] * a.J / 100;
                e.a[3] = a[3] * a.J / 100;
            }
            for (n4 = 0; n4 < as; ++n4) {
                if (a[2] < a[n4][0] || a[0] > a[n4][2] || a[3] < a[n4][1] || a[1] > a[n4][3]) continue;
                n5 = e2.r;
                n6 = e2.s;
                if (a.J != 100) {
                    n5 = n5 * a.J / 100;
                    n6 = n6 * a.J / 100;
                }
                int n8 = e2.ap;
                if (e2.a(65536)) {
                    n8 += d3.a >> 1;
                }
                d3.d(n8);
                i.a(0, d3, n7, n5, n6, true, a[n4]);
            }
        }
        if (a.J != 100) {
            f.o();
        }
    }

    private void g(int n, int n2) {
        int n3 = n & Short.MAX_VALUE;
        d d2 = (n & 0x8000) != 0 ? a.a[n3] : a.b[n3];
        n3 = this.ap;
        if (d2 == null || n2 < 0) {
            return;
        }
        if (this.a(65536)) {
            n3 += d2.a >> 1;
        }
        d2.d(n3);
        if (a.J == 100) {
            d2.a(f.a, n2, this.u, this.v, 0);
            return;
        }
        d2.c(f.a, n2, this.u, this.v, a.J);
    }

    final void f() {
        this.u = (this.r + this.am) * a.J / 100 - a.c.r;
        this.v = (this.s + this.an) * a.J / 100 - a.c.s;
    }

    private int c() {
        return (this.t << 20) + this.s;
    }

    final void c(int n) {
        int n2 = 0;
        boolean bl = false;
        int n3 = -1;
        switch (n) {
            case 0: {
                n2 = 2;
                bl = f;
                break;
            }
            case 1: {
                if (this.A > this.r) {
                    if (this.B > this.s) {
                        n2 = 0;
                        bl = true;
                    } else {
                        n2 = 1;
                    }
                } else if (this.B > this.s) {
                    n2 = 0;
                } else {
                    n2 = 1;
                    bl = true;
                }
                a.d(53);
                break;
            }
            case 2: {
                int n4;
                switch (a.b[a.t]) {
                    case 5: {
                        n2 = 3;
                        n4 = -1;
                        break;
                    }
                    case 2: {
                        n2 = 3;
                        if (a.a[a.t] != null && (a.a[a.t].y == 0 || a.a[a.t].y == 51 || a.a[a.t].y == 52)) {
                            n4 = 22;
                            break;
                        }
                        if (a.a[a.t] != null && (a.a[a.t].y == 1 || a.a[a.t].y == 53 || a.a[a.t].y == 54)) {
                            n4 = 40;
                            break;
                        }
                        n4 = 40;
                        break;
                    }
                    case 6: {
                        n2 = 3;
                        n4 = 22;
                        break;
                    }
                    case 0: {
                        n2 = 4;
                        n4 = 46;
                        break;
                    }
                    case 1: {
                        n2 = 4;
                        n4 = 39;
                        break;
                    }
                    case 3: {
                        n2 = 6;
                        n4 = 35;
                        break;
                    }
                    case 4: {
                        n2 = 4;
                        n4 = -1;
                        bl = true;
                        break;
                    }
                    default: {
                        n2 = 2;
                        n4 = 53;
                    }
                }
                n3 = 1;
                if (n4 == -1) break;
                a.d(n4);
                break;
            }
            case 3: {
                n2 = 7;
                n3 = 3;
                bl = true;
            }
        }
        this.D = n;
        f = bl;
        this.a.b(n2, n3);
        if (bl) {
            this.a.a(2);
            return;
        }
        this.a.a(0);
    }

    final boolean a() {
        boolean bl = false;
        int n = f.h();
        if (this.D == 3) {
            return false;
        }
        if (a.u == 0) {
            int[] nArray = new int[2];
            int[] nArray2 = new int[2];
            int[] nArray3 = nArray2;
            nArray2[0] = a.F;
            nArray3[1] = a.G;
            a.a(nArray3, nArray);
            a.c(nArray, nArray3);
            if ((n == 5 || n == 11) && a.d == -1) {
                if (a.a(nArray3[0], nArray3[1])) {
                    bl = true;
                    int n2 = a.G;
                    int n3 = a.F;
                    e e2 = this;
                    int[] nArray4 = new int[2];
                    int[] nArray5 = new int[2];
                    int[] nArray6 = nArray5;
                    nArray5[0] = n3;
                    nArray6[1] = n2;
                    a.a(nArray6, nArray4);
                    e2.a(nArray4[0], nArray4[1]);
                } else if (a.N == 0 && a.a(nArray3[0], nArray3[1]) > 0 && (n = a.a(nArray3[0], nArray3[1])) >= 1 && !a.a[n] && a.K == -1 && a.f(a.f[0]) && a.f(a.f[1])) {
                    a.r = n;
                    a.a(12);
                }
            }
        }
        return bl;
    }

    final void a(int n, int n2) {
        this.A = n;
        this.B = n2;
        if (Math.abs(this.A - this.r) > 180 || Math.abs(this.B - this.s) > 180) {
            this.r += (this.A - this.r) * 80 / 100;
            this.s += (this.B - this.s) * 80 / 100;
        }
        this.c(1);
    }

    final void b(int n, int n2) {
        this.A = n;
        this.B = n2;
        if (Math.abs(this.A - this.r) > 180 || Math.abs(this.B - this.s) > 180) {
            this.r += (this.A - this.r) * 80 / 100;
            this.s += (this.B - this.s) * 80 / 100;
        }
        this.c(1);
    }

    final void g() {
        if (this.D == 0 && a.j && !a.c) {
            this.r += a.H;
            this.s += a.I;
        }
    }

    final void h() {
        if (this.D == 0) {
            if (a.a.u < 40) {
                this.r -= 1 * f.V;
            } else if (a.a.u > f.T - 40) {
                this.r += 1 * f.V;
            }
            if (a.a.v < 40) {
                this.s -= 1 * f.V;
                return;
            }
            if (a.a.v > f.U - 40) {
                this.s += 1 * f.V;
            }
        }
    }

    final void i() {
        if (a.a) {
            return;
        }
        if (this.D == 0) {
            int n = 0 * a.J / 100;
            int n2 = 0 * a.J / 100;
            int n3 = this.M * a.J / 100 - f.T;
            int n4 = this.N * a.J / 100 - f.U;
            if (this.r < n) {
                this.r = n;
            } else if (this.r > n3) {
                this.r = n3;
            }
            if (this.s < n2) {
                this.s = n2;
            } else if (this.s > n4) {
                this.s = n4;
            }
        } else if (this.D == 1) {
            int n;
            this.O -= f.V;
            int[] nArray = new int[2];
            int[] nArray2 = new int[2];
            int[] nArray3 = nArray2;
            nArray2[0] = f.T >> 1;
            nArray3[1] = f.U >> 1;
            a.a(nArray3, nArray);
            int n5 = this.A - nArray[0];
            int n6 = this.B - nArray[1];
            if (this.O > 0) {
                n = f.V * 100 / this.O;
                if (n > 100) {
                    n = 100;
                }
            } else {
                this.O = 0;
                this.D = 0;
                n = 100;
            }
            int n7 = n5 * n / 100;
            n = n6 * n / 100;
            this.r += n7;
            this.s += n;
        }
        i.c(this.r, this.s);
    }

    final void c(int n, int n2) {
        this.r = n;
        this.s = n2;
        i.c(this.r, this.s);
    }

    final void a(int n, int n2, int n3) {
        this.A = n;
        this.B = n2;
        this.D = 1;
        this.O = n3;
    }

    static void d(int n) {
        if (a.J != 100) {
            a.J = 100;
            n = f.T >> 1;
            int n2 = f.U >> 1;
            int n3 = (a.c.r - n * a.J / 100 + n) * 100 / a.J;
            int n4 = (a.c.s - n2 * a.J / 100 + n2) * 100 / a.J;
            a.c.r = (n3 + n) * a.J / 100 - n;
            a.c.s = (n4 + n2) * a.J / 100 - n2;
        }
    }

    static void j() {
        a.p = 1;
        Object object = new e[1];
        e.a(0, 50, 18, object, 1);
        if (object[0] != null) {
            ah = object[0].r;
            ai = object[0].s;
        }
        a.d(30);
        af = 0;
        ag = 4;
        if (e.f(0, 23) > 0) {
            object = new e[1];
            e.a(0, 23, object, 1);
            d d2 = a.b[13];
            object[0].a = new i(d2, object[0].r, object[0].s);
            object[0].a.b(1, 1);
            return;
        }
        Object object2 = object = (Object)new int[]{ah * 100 / a.J, ai * 100 / a.J, 255};
        object2 = e.a(23, 0, (int[])object2);
        object = a.b[13];
        object2.a = new i((d)object, object2.r, object2.s);
        object2.a.b(1, 1);
    }

    static void k() {
        e e2 = a[0];
        int n = a.N == 0 ? a.O : 0;
        while (e2 != null) {
            if (e2.q == 50) {
                switch (e2.y) {
                    case 2: {
                        e2.H();
                        if (n < 1) {
                            e2.k(8);
                            break;
                        }
                        e2.j(8);
                        break;
                    }
                    case 0: {
                        e2.H();
                        if (n < 2) {
                            e2.k(8);
                            break;
                        }
                        e2.j(8);
                        break;
                    }
                    case 3: {
                        e2.H();
                        if (n < 3) {
                            e2.k(8);
                            break;
                        }
                        e2.j(8);
                        break;
                    }
                    case 1: {
                        e2.H();
                        if (n < 4) {
                            e2.E = 128;
                            e2.F = 2;
                            break;
                        }
                        e2.E = 130;
                        e2.F = 0;
                        break;
                    }
                    case 4: {
                        e2.H();
                        if (n < 5) {
                            e2.k(8);
                            break;
                        }
                        e2.j(8);
                        break;
                    }
                    case 5: {
                        e2.H();
                        if (n < 6) {
                            e2.k(8);
                            break;
                        }
                        e2.j(8);
                        break;
                    }
                    case 6: {
                        e2.H();
                        if (n < 7) {
                            e2.k(8);
                            break;
                        }
                        e2.j(8);
                        break;
                    }
                    case 7: {
                        e2.H();
                        if (n < 8) {
                            e2.E = 128;
                            e2.F = 1;
                            break;
                        }
                        e2.E = 136;
                        e2.F = 0;
                        break;
                    }
                    case 8: {
                        e2.H();
                        if (n < 9) {
                            e2.k(8);
                            break;
                        }
                        e2.j(8);
                    }
                }
            }
            e2 = e2.a;
        }
    }

    private void I() {
        if (this.b != null) {
            this.b.c(f.V);
        }
        if (this.D == 3) {
            long l2 = (System.currentTimeMillis() - this.b) / 1000L;
            if (l2 >= (long)(this.Q / 2) && a.K != 8 && a.K != 45) {
                this.f(4);
            }
            if (a.d == this && this.Q != 0) {
                a.a((int)l2, this.Q);
                this.K = a.a((int)((long)this.Q - l2));
            }
        } else if (this.D == 4) {
            long l3 = (System.currentTimeMillis() - this.b) / 1000L;
            if (l3 >= (long)this.Q && (a.K < 46 || a.K > 57) && a.K != 8 && a.K != 45) {
                this.f(5);
            }
            if (a.d == this && this.Q != 0) {
                a.a((int)l3, this.Q);
                this.K = a.a((int)((long)this.Q - l3));
            }
        } else if (a.d == this) {
            a.a(false, null);
        }
        if ((this.b == null || this.b.a() != a.b[16]) && this.D == 5) {
            this.b = new i(a.b[16], this.u, this.v);
            this.b.b(0, -1);
            this.b.b(0);
        } else if (this.b != null && this.D != 5 && this.b.a() == a.b[16]) {
            this.b = null;
        }
        if (this.b != null && this.D == 5) {
            int n = 0;
            if (this.a(1024)) {
                n = 1;
            }
            if (this.b.a().f() != n) {
                this.b.a().d(n);
            }
        }
    }

    final boolean b() {
        if (a.K == 4 || a.K == 7 || a.K == 44) {
            a.f = true;
        }
        if (this.D == 1 && a.e == 0) {
            if (a.n <= a.e()) {
                if (a.K == 45) {
                    a.g = 1;
                }
                this.e(a.g);
                if (a.j > 0 && a.c(a.j) || a.k > 0 && a.d(a.k)) {
                    a.a(0, this);
                } else {
                    a.D = -1;
                    if (a.j > 0) {
                        String string = f.b(379);
                        string = string == null ? "" : string;
                        String string2 = f.a(a.j - a.c(), a.L, " ");
                        a.a = f.a(string, "%d", string2);
                        a.D = 18;
                        a.i = false;
                    } else if (a.k > 0) {
                        String string = f.b(381);
                        string = string == null ? "" : string;
                        String string3 = f.a(a.k - a.d(), a.L, " ");
                        a.a = f.a(string, "%d", string3);
                        a.D = 19;
                        a.i = true;
                    }
                    if (a.D != -1) {
                        a.a(34);
                        a.m = true;
                    }
                    a.e = -1;
                    this.h = false;
                }
            }
            return true;
        }
        if (this.D == 5 && a.e == 1) {
            if (!((a.w & 2) == 2)) {
                return false;
            }
            if (a.g) {
                return false;
            }
            if (a.N == 0 && a.b(5) + e.a(2) + 1 > a.b() || a.N == 0 && a.b(5) + a.s + 1 > a.b()) {
                a.g = true;
                a.a(false, 1, a.f);
                a.b(471, 477);
                return false;
            }
            a.a(1, this);
            return true;
        }
        return false;
    }

    final boolean c() {
        if (this.D == 1 && a.e != 0 && a.N == 0 && a.K != 40 && a.K != 5 && a.K != 38) {
            a.e(0);
            if (a.K == 7) {
                a.b();
                a.a[1][11][10] = 1;
            }
            if (a.K == 44) {
                a.f = true;
            }
            return true;
        }
        if (a.K >= 14 && a.K <= 36) {
            return false;
        }
        if ((this.D == 3 || this.D == 4) && a.e == -1) {
            if (a.K == -1) {
                a.d(46);
                a.a(true, this);
            }
            return false;
        }
        if (this.D == 5 && a.e != 1) {
            a.e(1);
            return true;
        }
        return false;
    }

    final void e(int n) {
        if (this.h) {
            return;
        }
        this.h = true;
        this.y = (char)n;
        this.I = a.h;
        this.Q = a.i;
        this.a = a.o;
        this.R = a.j;
        this.S = a.k;
        this.y = a.g;
        this.J = a.l;
        this.E = a.m;
    }

    final void l() {
        if (this.R > 0 && a.b(this.R) || this.S > 0 && a.e(this.S)) {
            this.f(3);
            if (a.K == 45) {
                ++a.q;
                return;
            }
            if (a.K == 8) {
                ++a.q;
                return;
            }
            if (a.K == -1) {
                a.b(this.J, 1, 12);
                return;
            }
        } else {
            a.D = -1;
            if (this.R > 0) {
                String string = f.b(379);
                string = string == null ? "" : string;
                String string2 = f.a(this.R - a.c(), a.L, " ");
                a.a = f.a(string, "%d", string2);
                a.D = 18;
                a.i = false;
            } else if (this.S > 0) {
                String string = f.b(381);
                string = string == null ? "" : string;
                String string3 = f.a(this.S - a.d(), a.L, " ");
                a.a = f.a(string, "%d", string3);
                a.D = 19;
                a.i = true;
            }
            if (a.D != -1) {
                a.a(34);
                a.m = true;
            }
            a.e = -1;
            this.h = false;
        }
    }

    final void m() {
        this.f(1);
        if (a.K == 38) {
            ++a.q;
        } else if (a.K == 5) {
            ++a.q;
        }
        this.a(false);
        this.J = a.a[0];
        this.k(1024);
    }

    private void a(boolean bl) {
        int[] nArray = new int[]{0, 0, 14};
        e.a(47, 2, nArray).a(this.r, this.s, 10, 1000, false, this.a);
        if (a.N == 0 || a.b(5) < a.b() && f.c(0, 100) < a.d[20]) {
            e e2 = e.a(47, 2, nArray);
            int n = this.I;
            if (this.I == -1) {
                return;
            }
            int n2 = 1;
            if (bl) {
                n2 = 3;
            }
            if (this.a(1024)) {
                ++n2;
            }
            if (bl && a.K == -1) {
                a.a(this.J, n2, 14);
            }
            if (a.K == -1) {
                a.b(this.J, n2, 14);
            }
            e2.a(this.r, this.s, 29, 1000, true, n |= n2 << 16);
        }
        if (a.e() >= a.a[0] && f.c(0, 100) < a.d[10]) {
            e.a(47, 2, nArray).a(this.r - 60, this.s, 30, 2000, false, 1);
        }
    }

    final void f(int n) {
        this.H();
        this.D = n;
        switch (this.D) {
            case 1: {
                this.E = -1;
                this.F = -1;
                this.y = 0;
                this.h = false;
                this.t = 11;
                break;
            }
            case 8: {
                this.t = 11;
                break;
            }
            case 3: {
                this.F = 0;
                this.b = System.currentTimeMillis();
                this.t = 11;
                this.G();
                break;
            }
            case 4: {
                this.F = 1;
                this.F = 1;
                this.t = 12;
                break;
            }
            case 5: {
                this.F = 2;
                this.t = 12;
            }
        }
        this.G = 6;
        this.H = 0;
    }

    static void n() {
        e e2 = a[0];
        while (e2 != null) {
            if (e2.q == 49 || e2.q == 52) {
                e2.j(1024);
            }
            e2 = e2.a;
        }
    }

    final boolean d() {
        if (this.D == 3) {
            a.e(1);
        }
        Object object = this;
        if (((e)object).D == 3 && a.e == 1 && !a.g) {
            if (a.N == 0 && a.b(5) + e.a(2) + 3 > a.b() || a.N == 0 && a.b(5) + a.s + 3 > a.b()) {
                a.g = true;
                a.a(false, 1, a.f);
                if (a.b(5) < a.b()) {
                    object = f.b(476);
                    object = f.a((String)(object == null ? "" : object), "%slots", "3");
                    String string = f.b(475);
                    a.a(string == null ? "" : string, (String)object, 7, 0);
                } else {
                    a.b(471, 477);
                }
                return false;
            }
            a.a(1, (e)object);
            a.e = -1;
            return true;
        }
        return false;
    }

    final boolean e() {
        if (this.D == 2) {
            if (a.K != 18 && a.e == -1) {
                a.d(46);
                a.a(true, this);
                return true;
            }
        } else if (this.D == 3 && a.e != 1) {
            a.e(1);
            return true;
        }
        return false;
    }

    final void o() {
        this.g(2);
        this.a(true);
        this.k(1024);
    }

    final void g(int n) {
        this.H();
        this.D = n;
        switch (this.D) {
            case 2: {
                this.c = System.currentTimeMillis();
                this.F = 0;
                return;
            }
            case 3: {
                this.k(32);
                this.F = 1;
            }
        }
    }

    final void p() {
        int n;
        Object object;
        int n2;
        if (this.E > -1 && this.F > -1) {
            int n3 = this.E;
            n2 = n3 & Short.MAX_VALUE;
            object = (n3 & 0x8000) != 0 ? a.a[n2] : a.b[n2];
            n2 = ((d)object).d(this.F) >> 1;
            n = ((d)object).e(this.F) >> 1;
            if (this.r - n2 > i.d() && this.s - n > i.e()) {
                this.H();
            } else {
                i.d();
                a.k = true;
            }
        }
        a.b(this);
        object = g.a(11);
        n2 = ((g)object).a[this.y][3];
        n = ((g)object).a[this.y][4];
        int n4 = ((g)object).a[this.y][5];
        int n5 = ((g)object).a[this.y][6];
        int[] nArray = new int[]{0, 0, 14};
        if (n2 > 0) {
            e.a(47, 2, nArray).a(this.r, this.s, 10, 1000, false, n2);
        }
        if (n > 0) {
            e.a(47, 2, nArray).a(this.r, this.s, 9, 1000, true, n);
        }
        if (n5 > 0 && (n5 = f.c(n4, n5 + 1)) > 0) {
            e.a(47, 2, nArray).a(this.r, this.s, 2, 1000, true, n5);
        }
        this.e();
    }

    private void J() {
        Object object;
        int n;
        if (this.a == null) {
            return;
        }
        if (this.b != null) {
            n = this.b.a();
            if (n == 0) {
                if (this.c == 0) {
                    g g2 = g.a(0);
                    this.c = (short)g2.a[this.y][30];
                    object = a.b[g2.a[this.y][31]];
                    short s = ((d)object).a[this.c];
                    this.j = ((d)object).b(s);
                    this.k = ((d)object).c(s);
                    this.aq = this.j;
                    this.ar = this.k;
                }
            } else {
                this.b.a(this.u, this.v + -50);
            }
            this.b.d(a.J);
            if (this.b.a()) {
                if (n == 1 && a.K == 18) {
                    a.f = true;
                }
                this.b = null;
            } else {
                this.b.c(f.V);
            }
        }
        if ((this.b == null || this.b.a() != a.b[16]) && this.b) {
            this.b = new i(a.b[16], this.u, this.v);
            this.b.b(0, -1);
            this.b.b(1);
        } else if (this.b != null && !this.b && this.b.a() == a.b[16]) {
            this.b = null;
        }
        if (!this.a(512)) {
            if (this.a.a()) {
                this.h(0);
            }
            return;
        }
        if (this.h()) {
            int n2;
            if (!this.m && a.a != null && a.a != this && this.r > a.P + 150 && this.r < a.P + 530 && this.s > a.Q + 340 && this.s < a.Q + 570) {
                this.m = true;
                this.d(a.P + 150, a.Q + 446);
            }
            if (this.m && this.r == this.A && this.s == this.B) {
                this.m = false;
            }
            e[] eArray = new e[10];
            for (n2 = 0; n2 < 10; ++n2) {
                eArray[n2] = null;
            }
            e.b(0, 50, a.b[10], eArray, 10);
            for (n2 = 0; n2 < 10; ++n2) {
                if (eArray[n2] == null || this.r <= eArray[n2].r - 100 || this.r >= eArray[n2].r + 100 || this.s <= eArray[n2].s - 100 || this.s >= eArray[n2].s + 100 || this.n) continue;
                this.n = true;
                this.d(eArray[n2].r - 150, eArray[n2].s);
            }
            for (n2 = 0; n2 < 10; ++n2) {
                eArray[n2] = null;
            }
            if (this.n && this.r == this.A && this.s == this.B) {
                this.n = false;
            }
        }
        switch (this.D) {
            case 0: {
                if (!this.a.a()) break;
                if (a.d == 0 || a.d == 1 || a.d == 3 || a.a() && a.d == this || !this.h() || a.l || f.c(0, 100) < 50) {
                    this.h(0);
                    break;
                }
                e e2 = this;
                a.l = true;
                int n3 = f.c(-4, 4);
                int n4 = f.c(-4, 4);
                int[] nArray = new int[2];
                int[] nArray2 = new int[2];
                nArray[0] = e2.r;
                nArray[1] = e2.s;
                a.c(nArray, nArray2);
                nArray2[0] = nArray2[0] + n3;
                nArray2[1] = nArray2[1] + n4;
                if (a.K == -1 && !a.a(nArray2[0], nArray2[1], e2.w << 1, e2.x << 1)) {
                    a.d(nArray2, nArray);
                    e2.d(nArray[0], nArray[1]);
                    break;
                }
                e2.h(0);
                break;
            }
            case 1: {
                if (a.K == 15) {
                    this.h(0);
                }
                n = this.r;
                int n5 = this.s;
                this.N();
                if (this.m) break;
                object = new int[2];
                int[] nArray = new int[2];
                object[0] = this.r;
                object[1] = this.s;
                a.c((int[])object, nArray);
                if (a.a() && a.d == this) {
                    this.r = n;
                    this.s = n5;
                    this.h(0);
                }
                if (!a.a(nArray[0], nArray[1])) {
                    this.r = n;
                    this.s = n5;
                    this.h(0);
                    break;
                }
                if (this.r != this.A || this.s != this.B) break;
                this.h(0);
                break;
            }
            case 2: {
                if (!this.a(4)) {
                    this.i(4);
                }
                if (!this.a.a()) break;
                this.h(0);
                break;
            }
            case 7: {
                if (!this.a.a()) break;
                this.h(0);
                this.b = true;
                break;
            }
            case 3: {
                if (!this.a.a()) break;
                if (!a.d && a.a() == 18) {
                    a.d = true;
                    a.f = false;
                    a.e = false;
                    a.K = 33;
                }
                this.h(0);
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                this.K();
                this.q();
                this.h(2);
            }
        }
        if (this.a(32)) {
            long l2 = System.currentTimeMillis();
            long l3 = l2 / 1000L - this.e;
            if (this.c && this.f > 0L) {
                long l4 = l2 - this.f;
                if (a.R == -1) {
                    a.R = g.a((int)0).a[this.y][13];
                }
                this.e = (int)((long)(a.R * 60) + l4 / 1000L);
            } else if (a.a == null) {
                a.R = -1;
            }
            if (this.e > 0 && a.d == this) {
                a.a((int)l3, this.e);
                this.K = a.a((int)((long)this.e - l3));
            }
            if (l3 >= (long)this.e) {
                this.L();
            }
        } else if (!this.a(4) && !this.a(16)) {
            long l5 = System.currentTimeMillis();
            if (a.K == 33) {
                this.d = l5;
            }
            long l6 = (l5 - this.d) / 1000L;
            if (!this.a(256) && (a.g(20) || a.f(a.f[20]))) {
                if (l6 > (long)(this.b * 3 / 4) && this.d > 0L && !this.j) {
                    this.j = true;
                    if (!this.i && f.c(0, 100) < 35) {
                        this.i(256);
                        this.i = true;
                    }
                } else if (l6 > (long)(this.b >> 1) && this.d > 0L && !this.k) {
                    this.k = true;
                    if (!this.i && f.c(0, 100) < 35) {
                        this.i(256);
                        this.i = true;
                    }
                } else if (l6 > (long)(this.b >> 2) && this.d > 0L && !this.l) {
                    this.l = true;
                    if (!this.i && f.c(0, 100) < 35) {
                        this.i(256);
                        this.i = true;
                    }
                }
            }
            if (l6 >= (long)this.b && this.d != 0L) {
                if (a.K == 35) {
                    a.f = true;
                }
                if (a.K != 34) {
                    this.i(16);
                    a.a(false, null);
                }
            }
            if (a.d == this && this.b != 0) {
                a.a((int)l6, this.b);
                this.K = a.a((int)((long)this.b - l6));
            }
        }
        if (this.a(4) && (this.c == null || this.c.q == -1)) {
            this.i(4);
            return;
        }
        if (this.a(16) && (this.c == null || this.c.q == -1)) {
            this.i(16);
            return;
        }
        if (this.a(256) && (this.c == null || this.c.q == -1)) {
            this.i(256);
            return;
        }
        if (!a.b && !a.b()) {
            if ((a.a == null || a.a != this) && this.h() && f.c(0, 100) < 10) {
                a.c(this.a);
                a.b = true;
                a.b = 0;
            }
            return;
        }
        if (a.b && a.b >= a.c) {
            a.b = false;
            return;
        }
        if (a.b && a.b < a.c) {
            ++a.b;
        }
    }

    final void d(int n, int n2) {
        this.A = n;
        this.B = n2;
        this.h(1);
    }

    final boolean f() {
        if (a.p == 1) {
            return false;
        }
        if (this.D == 3) {
            return false;
        }
        if (this.D == 7) {
            return false;
        }
        a.d(this.a);
        if (a.b == this) {
            a.b();
        }
        if (this.a(4)) {
            if (a.c(this.a) >= this.f) {
                a.a(4, this);
            } else {
                a.a(391, 7, 0);
            }
            return true;
        }
        if (this.a(16)) {
            if (a.b(5) + e.a(2) < a.b() || a.N != 0) {
                a.a(7, this);
                return true;
            }
            a.b(471, 477);
            return false;
        }
        if (this.a(256)) {
            a.a(4, this);
            return true;
        }
        this.h(0);
        a.a(true, this);
        if (!this.a(32) && this.b == 0 && this.d != 0L && a.N == 0) {
            this.i(16);
            a.a(false, null);
        }
        return false;
    }

    final void q() {
        g g2 = g.a(0);
        this.b = g2.a[this.y][25] * 60;
        this.d = System.currentTimeMillis();
    }

    final void r() {
        g g2 = g.a(0);
        this.e = g2.a[this.y][13] * 60;
        this.e = System.currentTimeMillis() / 1000L;
    }

    final void s() {
        if (this.a(4)) {
            if (this.D != 3 && a.N == 0) {
                a.b(this.f, (int)this.a);
                this.h(3);
                ++this.d;
                if (this.d >= this.c && !this.a(2048)) {
                    this.j(2048);
                    a.d();
                    a.m(0);
                }
                a.b(this.J, 1, 19);
                this.k(4);
                this.G();
                this.d = System.currentTimeMillis();
                this.i = false;
                this.l = false;
                this.k = false;
                this.j = false;
                this.b = false;
                a.d(35);
                return;
            }
            if (a.N != 0) {
                this.h(3);
                this.k(4);
                this.G();
                this.d = System.currentTimeMillis();
                this.i = false;
                this.l = false;
                this.k = false;
                this.j = false;
                this.b = false;
                a.d(35);
                return;
            }
            a.d(55);
            return;
        }
        if (this.a(256)) {
            this.h(7);
            a.b(this.J, 1, 20);
            this.k(256);
            this.G();
            this.b = new i(a.b[13], this.u, this.v);
            this.b.b(0, 2);
            this.aq = this.j;
            this.ar = this.k;
            a.d(31);
        }
    }

    final void t() {
        this.h(5);
        this.k(16);
        this.G();
        this.d = System.currentTimeMillis();
    }

    private void K() {
        int[] nArray = new int[]{0, 0, 14};
        e.a(47, 2, nArray).a(this.r, this.s, 10, 1000, false, 1);
        g g2 = g.a(0);
        int n = g2.a[this.y][18];
        int n2 = g2.a[this.y][19];
        int n3 = g2.a[this.y][20];
        int n4 = g2.a[this.y][21];
        int n5 = g2.a[this.y][22];
        int n6 = g2.a[this.y][23];
        boolean bl = false;
        if (this.b) {
            if (n > 0) {
                ++n;
            }
            if (n4 > 0) {
                ++n4;
            }
            this.b = false;
        }
        if (a.N == 0 || a.b(5) < a.b() && f.c(0, 100) < a.d[20]) {
            int n7 = f.c(0, 100);
            int n8 = 0;
            if (n7 < n3) {
                this.I = n2;
                n8 = n << 16;
                e e2 = e.a(47, 2, nArray);
                if (a.N != 0) {
                    n8 = 1;
                }
                e2.a(this.r, this.s, 29, 1000, true, this.I | n8);
                bl = true;
            }
            if (n7 < n6) {
                if (a.N == 0) {
                    this.I = n5;
                    e e3 = e.a(47, 2, nArray);
                    n = n4 << 16;
                    e3.a(this.r + 50, this.s + 10, 29, 1000, true, this.I | n);
                    bl = true;
                } else if (n8 == 0) {
                    this.I = n5;
                    e.a(47, 2, nArray).a(this.r + 50, this.s + 10, 29, 1000, true, this.I | 1);
                    bl = true;
                }
            }
            if (this.a(2048) && this.g > 0) {
                e.a(47, 2, nArray).a(this.r + 65, this.s, 9, 1000, true, this.g);
            }
        }
        if (bl) {
            a.a(this.J, 1, 41, this.a(2048));
        }
    }

    private void L() {
        if (this.a(32)) {
            int n = this.J;
            a.a(false, null);
            this.k(32);
            ++this.y;
            g g2 = g.a(0);
            this.f = g2.a[this.y][24];
            this.c = g2.a[this.y][14];
            this.g = g2.a[this.y][17];
            this.d = 0;
            this.w = g2.a[this.y][27];
            this.x = g2.a[this.y][28];
            d d2 = a.b[g2.a[this.y][31]];
            this.ap = g2.a[this.y][32];
            this.F = g2.a[this.y][33];
            this.b = (short)g2.a[this.y][29];
            this.c = (short)g2.a[this.y][30];
            if (this.a != null && d2 != null) {
                this.a.a(d2);
                this.a.b(0, -1);
            }
            this.b = new i(a.b[13], this.u, this.v + -50);
            this.b.b(1, 1);
            if (a.N == 0) {
                a.b(n, 1, 21);
            }
            this.J = g2.a[this.y][1];
            if (a.N == 0) {
                a.m(this.J);
                a.a(true);
            }
            this.q();
            this.h(2);
            if (g2.a[this.y][19] != 5 && g2.a[this.y][19] != 110) {
                this.l = g2.a[this.y][18];
            }
            if (g2.a[this.y][22] != 5 && g2.a[this.y][22] != 110) {
                this.m = g2.a[this.y][21];
            }
            a.d(43);
            n = d2.a[this.b];
            this.h = d2.b(n);
            this.i = d2.c(n);
            n = d2.a[this.c];
            this.j = d2.b(n);
            this.k = d2.c(n);
            this.m = false;
        }
    }

    final void h(int n) {
        int n2;
        int n3 = 0;
        int n4 = -1;
        boolean bl = false;
        this.j(1);
        switch (n) {
            case 4: {
                if (this.a(32)) {
                    n3 = 5;
                    break;
                }
                n3 = 0;
                break;
            }
            case 0: {
                n3 = this.a(32) ? 5 : 0;
                n4 = f.c(1, 5);
                break;
            }
            case 1: {
                n2 = 0;
                if (this.a(32)) {
                    n2 = 5;
                }
                if (this.A > this.r) {
                    if (this.B > this.s) {
                        n3 = 3;
                        bl = true;
                    } else {
                        n3 = 4;
                    }
                } else if (this.B > this.s) {
                    n3 = 3;
                } else {
                    n3 = 4;
                    bl = true;
                }
                n3 += n2;
                break;
            }
            case 3: {
                this.k(1);
                n3 = this.a(32) ? 6 : 1;
                n4 = 3;
                break;
            }
            case 7: {
                this.k(1);
                n3 = this.a(32) ? 5 : 0;
                n4 = 5;
            }
        }
        n2 = 0;
        if (this.a.a() == n3) {
            n2 = 1;
        }
        this.D = n;
        this.a.a(n3, n4, n2 != 0);
        if (bl) {
            this.a.a(2);
            return;
        }
        this.a.a(0);
    }

    final void i(int n) {
        if (a.N != 0 && n == 4) {
            return;
        }
        this.G();
        this.j(n);
        int n2 = 0;
        if (n == 4) {
            n2 = 8;
        } else if (n == 16) {
            n2 = 7;
        } else if (n == 256) {
            n2 = 6;
        }
        int[] nArray = new int[]{this.r, this.s, 150, 10, n2, -31, -58, 0, 1};
        this.a(e.a(33, 0, nArray));
    }

    final void u() {
        this.G();
    }

    final void v() {
        if (this.a(4) && this.c != null) {
            this.G();
            this.c = null;
        }
        if (this.a(16) && this.c != null) {
            this.G();
            this.c = null;
        }
        if (this.a(256) && this.c != null) {
            this.G();
            this.c = null;
        }
    }

    final void w() {
        if (!this.a(8)) {
            return;
        }
        if (!this.d) {
            int n;
            this.aa += f.V;
            this.ab += f.V;
            int n2 = this.aa << 1;
            int n3 = n = this.o ? 1 : -1;
            if (this.ac < 3) {
                this.X = this.Z * this.ab * n / 100;
                this.Y = (n2 << 2) * n2 / 10000 + n2 * -40 / 100;
                for (int i2 = 1; i2 < this.ac; ++i2) {
                    this.Y = this.Y * 40 / 100;
                }
                if (this.Y > 0) {
                    ++this.ac;
                    this.Y = this.Y * -40 / 100;
                    this.aa = 0;
                }
            } else {
                this.d = true;
                a.d(37);
                if (this.T == 30) {
                    int n4 = ((this.E & 0xFFFF7FFF) - 107 << 2) + this.F;
                    a.a(true, n4);
                }
            }
            this.r = this.U + this.X;
            this.s = this.V + this.Y;
            return;
        }
        this.n += 4 * f.V;
        if (this.T == 27) {
            this.A = a.c.r + a.a[1][30][2] + (a.a[1].d(7) >> 1);
            this.B = a.c.s + a.a[1][30][3] + (a.a[1].d(7) >> 1);
        } else if (this.T >= 29) {
            if ((this.W & 0xFFFF) == 5) {
                this.A = a.c.r + a.a[1][32][2];
                this.B = a.c.s + a.a[1][32][3];
            } else {
                this.A = a.c.r + a.a[1][67][2];
                this.B = a.c.s + a.a[1][67][3];
            }
        } else if (this.T == 10) {
            this.A = a.c.r + a.a[1][25][2] + (a.a[1].d(1) >> 1);
            this.B = a.c.s + a.a[1][25][3] + (a.a[1].d(1) >> 1);
        } else {
            this.A = a.c.r;
            this.B = a.c.s;
        }
        if (this.T == 30) {
            this.A = a.c.r + a.a[1][96 + this.F][2];
            this.B = a.c.s + a.a[1][96 + this.F][3];
        }
        if (this.o > 0) {
            this.r = this.U + (this.A * 100 / a.J - this.U) * this.n / this.o;
            this.s = this.V + (this.B * 100 / a.J - this.V) * (this.n * this.n) / this.o / this.o;
        }
        if (this.n > this.o) {
            this.j(8);
            if (this.p) {
                this.e();
                if (this.T == 10) {
                    a.k(this.W);
                    return;
                }
                if (this.T == 9) {
                    a.g(this.W);
                    return;
                }
                if (this.T == 2) {
                    a.h(this.W);
                    return;
                }
                if (this.T == 29) {
                    int n = this.W & 0xFFFF;
                    int n5 = this.W >> 16;
                    if (n == 110) {
                        a.j(n5);
                        short s = a.c[n];
                        a.a((int)s, n5, 34);
                        a.b((int)s, n5, 34);
                        a.b((int)s, n5, 22);
                    } else if (n == 5) {
                        a.i(n5);
                    } else if (n >= 111 && n <= 116) {
                        a.c(n5, n - 111);
                    } else {
                        a.a(0, n, n5);
                        if (n5 > 0) {
                            a.f(-n5);
                        }
                        a.c();
                    }
                    if (n >= 0 && n < 6) {
                        a.b((int)a.c[n], n5, 22);
                    }
                }
            }
        }
    }

    final void a(int n, int n2, int n3, int n4, boolean bl, int n5) {
        this.T = n3;
        this.U = n;
        this.V = n2;
        this.u = this.U;
        this.v = this.V;
        this.o = n4;
        this.n = 0;
        this.d = false;
        this.o = bl;
        this.W = n5;
        if (n3 == 29) {
            n = this.W & 0xFFFF;
            new StringBuffer().append("itemIndex : ").append(n);
            this.E = a.d[n] | 0x8000;
            this.F = a.e[n];
        } else if (n3 == 30) {
            n = a.f();
            n2 = 107 + n / 4;
            this.E = n2 | 0x8000;
            this.F = n % 4;
            n = n2;
            a.a(1, n, 1, 0, 24);
            f.c("/7");
            a.b(1);
            f.k();
        } else {
            this.E = 32769;
            this.F = this.T;
        }
        this.aa = 0;
        this.ab = 0;
        this.Z = 4;
        this.ac = 1;
    }

    final void x() {
        this.g(this.E, this.F);
    }

    final void y() {
        int n = 0;
        if (this.T == 10 || this.T == 9 || this.T == 2) {
            n = this.W;
        } else if (this.T == 29) {
            n = this.W >> 16;
        }
        if (n > 0) {
            f.b(true);
            int n2 = (this.r + this.am) * a.J / 100 - a.c.r;
            int n3 = (this.s + this.an) * a.J / 100 - a.c.s;
            a.a("+" + f.a(n, a.L, " "), n2 + 10, n3 + 10, 0, 0, 0, 0, 2, 1, false, false);
            f.b(false);
        }
    }

    final void z() {
        if (this.a != null) {
            this.a.d(a.J);
            this.a.a(this.u, this.v);
            this.a.b();
        }
    }

    final void A() {
        if (this.a != null && this.a.a() && (ad == -1 || ad < ae)) {
            a.d(f.c(25, 29));
            this.a.b(0, 1);
            int n = this.a.a().d(0);
            int n2 = this.a.a().e(0);
            this.r = (a.c.r + f.c(n, f.T - n)) * 100 / a.J;
            this.s = (a.c.s + f.c(n2, f.U - n2)) * 100 / a.J;
            if (a.a[a.a] == 13) {
                this.u = this.r * a.J / 100 - a.c.r;
                this.v = this.s * a.J / 100 - a.c.s;
            }
            n = this.a.a().a;
            n = f.c(0, n);
            this.a.b(n);
            if (ad > -1) {
                ++ad;
            }
            return;
        }
        if (this.a != null && this.a.a() && ad >= ae) {
            this.a = null;
            this.q = -1;
            e[] eArray = new e[1];
            e.a(0, 21, eArray, 1);
        }
    }

    static e b(int n) {
        Object object;
        a.d(f.c(25, 29));
        if (n == -1) {
            ad = -1;
        } else {
            ad = 0;
            ae = n;
        }
        if (a.b[85] == null) {
            a.a(0, 85, 15, 0, 24);
            f.c("/5");
            a.b(0);
            f.k();
        }
        if (e.f(0, 21) > 0) {
            e[] eArray = new e[1];
            e.a(0, 21, eArray, 1);
            d d2 = a.b[85];
            eArray[0].a = new i(d2, eArray[0].r, eArray[0].s);
            eArray[0].a.b(0, 1);
            return eArray[0];
        }
        Object object2 = object = new int[]{(a.c.r + (f.T >> 1)) * 100 / a.J, (a.c.s + (f.U >> 1)) * 100 / a.J, 255};
        object2 = e.a(21, 0, object2);
        object = a.b[85];
        object2.a = new i((d)object, object2.r, object2.s);
        object2.a.b(0, 1);
        return object2;
    }

    private void M() {
        if (this.a != null && this.a.a() && (af == -1 || af < ag)) {
            this.a.b(1, 1);
            int n = this.a.a().d(0);
            int n2 = this.a.a().e(0);
            this.r = ah + f.c(-n, n);
            this.s = ai + f.c(-n2, n2);
            if (af > -1) {
                ++af;
            }
            return;
        }
        if (this.a != null && this.a.a() && af >= ag) {
            this.a = null;
            this.q = -1;
            e[] eArray = new e[1];
            e.a(0, 23, eArray, 1);
            e.k();
            eArray = new e[1];
            e.a(0, 42, eArray, 1);
            eArray[0].c(3);
            a.d(33);
            e.b(3);
        }
    }

    private void l(int n) {
        int n2 = 0;
        boolean bl = false;
        switch (n) {
            case 0: {
                n2 = 1;
                break;
            }
            case 1: {
                if (this.A > this.r) {
                    n2 = 0;
                    break;
                }
                n2 = 0;
                bl = true;
            }
        }
        this.D = n;
        if (this.a.a.a() > n2) {
            this.a.b(n2, -1);
            if (bl) {
                this.a.a(2);
                return;
            }
            this.a.a(0);
        }
    }

    final void e(int n, int n2) {
        this.A = n;
        this.B = n2;
        this.l(1);
    }

    final void B() {
        a.b(this);
        this.e();
    }

    final void C() {
        a.a(this);
        this.D = 1;
        this.a.b(0, -1);
        this.F = 0;
    }

    static e a(int n, int[] nArray) {
        return e.a(n, 0, nArray);
    }

    static e a(int n, int n2, int[] nArray) {
        e e2 = new e();
        int[] nArray2 = nArray;
        int n3 = n;
        e e3 = e2;
        e e4 = e2;
        e2.a = null;
        e4.b = null;
        e4.a = null;
        e4.b = null;
        e4.aj = -1;
        e4.q = 0;
        e4.r = 0;
        e4.s = 0;
        e4.t = 0;
        e4.u = 0;
        e4.v = 0;
        e4.al = 0;
        e4.aq = 0;
        e4.ar = 0;
        e4.z = -1;
        e4.C = 0;
        e4.E = -1;
        e4.F = -1;
        e4.ap = 0;
        e4.G = -1;
        e4.e = false;
        e4.w = 1;
        e4.x = 1;
        e4.a = 0;
        e4.am = 0;
        e4.an = 0;
        e3.q = n3;
        e3.j(8);
        switch (e3.q) {
            case 10: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                break;
            }
            case 13: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.D = 0;
                e4 = e3;
                e3.M = i.f();
                e4.N = i.g();
                i.c(e3.r, e3.s);
                e3.k(8);
                break;
            }
            case 34: {
                break;
            }
            case 50: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.y = nArray2[3];
                e3.E = nArray2[4];
                e3.F = nArray2[5];
                e3.w = nArray2[6];
                e3.x = nArray2[7];
                e3.ao = a.b(e3.w, e3.x);
                e3.j(0x1000202);
                n3 = nArray2[8];
                int n4 = nArray2[9];
                int n5 = nArray2[10];
                if (n3 == 1) {
                    e3.j(64);
                }
                if (n4 == 1) {
                    e3.j(128);
                }
                if (n5 == 1) {
                    e3.j(1);
                }
                if (e3.y == 18) {
                    e3.G = 135;
                    e3.H = 0;
                    a.P = e3.r;
                    a.Q = e3.s;
                }
                if (e3.y != 1) break;
                e3.t = 14;
                break;
            }
            case 20: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.y = nArray2[3];
                e3.E = nArray2[4];
                e3.ap = nArray2[5];
                e3.F = nArray2[6];
                e3.w = nArray2[7];
                e3.x = nArray2[8];
                e3.ao = a.b(e3.w, e3.x);
                if (a.b[e3.E].a() > 0) {
                    d d2 = a.b[e3.E];
                    e3.a = new i(d2, e3.r, e3.s);
                    e3.a.b(0, -1);
                    e3.j(0x2000000);
                } else {
                    e3.j(0x1000000);
                }
                e3.j(515);
                int n6 = nArray2[9];
                int n7 = nArray2[10];
                if (n6 == 1) {
                    e3.j(64);
                }
                if (n7 != 1) break;
                e3.j(128);
                break;
            }
            case 21: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.j(65536);
                break;
            }
            case 23: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.j(65536);
                break;
            }
            case 54: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.w = nArray2[3];
                e3.x = nArray2[4];
                e3.ao = 16;
                d d3 = a.b[nArray2[5]];
                e3.ap = nArray2[6];
                if (nArray2[7] == 1) {
                    e3.j(32);
                }
                e3.I = nArray2[8];
                e3.E = nArray2[5];
                e3.F = nArray2[9];
                e3.a = new i(d3, e3.r, e3.s);
                e3.h(0);
                e3.j(0x2000201);
                int n8 = nArray2[10];
                int n9 = nArray2[11];
                if (n8 == 1) {
                    e3.j(64);
                }
                if (n9 == 1) {
                    e3.j(128);
                }
                e3.ak = 50;
                break;
            }
            case 42: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.E = nArray2[3];
                d d4 = a.b[e3.E];
                e3.a = new i(d4, e3.r, e3.s);
                e3.A = e3.r;
                e3.B = e3.s;
                e3.ak = 150;
                e3.j(0x2000000);
                e3.c(0);
                break;
            }
            case 51: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.E = nArray2[4];
                d d5 = a.b[e3.E];
                e3.F = 0;
                e3.a = new i(d5, e3.r, e3.s);
                e3.A = e3.r;
                e3.B = e3.s;
                e3.ak = nArray2[6];
                e3.l(0);
                e3.j(0x2000000);
                break;
            }
            case 49: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.w = 4;
                e3.x = 4;
                e3.ao = 16;
                e3.j(64);
                e3.j(16777731);
                e3.f(1);
                break;
            }
            case 52: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.w = 4;
                e3.x = 4;
                e3.ao = 16;
                e3.E = nArray2[3];
                e3.j(16777763);
                n3 = nArray2[4];
                int n10 = nArray2[5];
                if (n3 == 1) {
                    e3.j(64);
                }
                if (n10 == 1) {
                    e3.j(128);
                }
                e3.g(2);
                break;
            }
            case 48: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.E = nArray2[3];
                e3.F = nArray2[4];
                e3.ap = nArray2[5];
                e3.j(0x1000202);
                e3.w = 4;
                e3.x = 4;
                e3.ao = 16;
                break;
            }
            case 47: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.w = 2;
                e3.x = 2;
                e3.j(512);
                e3.p = true;
                break;
            }
            case 32: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.A = e3.r;
                e3.B = e3.s;
                e3.t = nArray2[2];
                e3.E = nArray2[3];
                e3.F = nArray2[4];
                e3.ap = nArray2[5];
                if (nArray2[6] != -1) {
                    e3.a = new i(a.b[e3.E], e3.r, e3.s);
                    e3.a.b(nArray2[6], -1);
                }
                e3.G = e3.E;
                e3.H = nArray2[7];
                e3.ak = nArray2[8];
                break;
            }
            case 11: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.E = nArray2[3];
                e3.F = nArray2[4];
                break;
            }
            case 33: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.E = nArray2[3];
                e3.F = nArray2[4];
                e3.am = nArray2[5];
                e3.an = nArray2[6];
                if (nArray2.length > 7) {
                    e3.a = new i(a.b[e3.E], e3.r, e3.s);
                    e3.a.b(nArray2[7], nArray2[8]);
                } else {
                    e3.j(0x1000000);
                }
                e3.ap = 0;
                break;
            }
            case 22: {
                e3.r = nArray2[0];
                e3.s = nArray2[1];
                e3.t = nArray2[2];
                e3.a = new i(a.b[144], e3.r, e3.s);
                e3.a.b(0, -1);
                e3.j(514);
                e3.E = 144;
                e3.F = 0;
                break;
            }
            default: {
                e3.q = -1;
            }
        }
        e3.A = e3.r;
        e3.B = e3.s;
        if (e3.a(0x1000000)) {
            e3.H();
        }
        e.a(e2, n2);
        return e2;
    }

    static void D() {
        a = new e[5];
        a = new int[4];
        a = new int[150][];
        as = 0;
        for (int i2 = 0; i2 < 150; ++i2) {
            e.a[i2] = new int[4];
        }
    }

    final boolean g() {
        return this.A != this.r || this.B != this.s;
    }

    final void j(int n) {
        if ((n & 8) != 0) {
            this.H();
        }
        this.C |= n;
    }

    final void k(int n) {
        if ((n & 8) != 0) {
            this.H();
        }
        this.C &= ~n;
    }

    final boolean a(int n) {
        return (this.C & n) == n;
    }

    final void E() {
        if (this.q == 49) {
            this.Q = 0;
            this.f(5);
            return;
        }
        if (this.q == 54) {
            if (this.a(32)) {
                this.e = 0;
                this.L();
            } else {
                this.b = 0;
            }
            a.M = 100;
            a.b = "0:0:0";
            return;
        }
        if (this.q == 52) {
            this.g(3);
            return;
        }
        if (this.q == 50) {
            this.a = 0L;
        }
    }

    private void N() {
        int n = this.A - this.r;
        int n2 = this.B - this.s;
        int n3 = f.e(n * n + n2 * n2);
        if (n3 == 0) {
            return;
        }
        int n4 = (this.ak * f.V << 8) / 1000;
        int n5 = n * n4 / n3 >> 8;
        n3 = n2 * n4 / n3 >> 8;
        this.r = (n5 < 0 ? -n5 : n5) >= (n < 0 ? -n : n) || n5 == 0 ? this.A : (this.r += n5);
        if ((n3 < 0 ? -n3 : n3) >= (n2 < 0 ? -n2 : n2) || n3 == 0) {
            this.s = this.B;
            return;
        }
        this.s += n3;
    }

    final int a() {
        int n = 0;
        int n2 = this.J;
        switch (n2 >= 1000 && n2 < 2000 || n2 >= 10000 && n2 < 11000 ? 50 : (n2 >= 2000 && n2 < 3000 ? 54 : (n2 >= 3000 && n2 < 4000 ? 49 : (n2 >= 7000 && n2 < 8000 ? 20 : (n2 >= 25000 && n2 < 26000 ? 48 : -1))))) {
            case 50: {
                n = g.a((int)3).a[this.y][33];
                break;
            }
            case 49: {
                n = g.a((int)2).a[this.y][18];
                break;
            }
            case 20: {
                n = g.a((int)4).a[this.y][18];
                break;
            }
            case 54: {
                g g2 = g.a(0);
                n = this.a(2048) ? g2.a[this.y][11] : g2.a[this.y][10];
            }
        }
        return n;
    }

    final void F() {
        int n;
        if (this.q == 49) {
            if (this.D == 3 || this.D == 4) {
                n = this.a();
                this.f(1);
                this.J = a.a[0];
                this.k(1024);
            } else {
                if (this.a(2)) {
                    a.b(this);
                }
                n = this.a();
                this.e();
            }
        } else {
            if (this.a(2)) {
                a.b(this);
            }
            n = this.a();
            this.e();
        }
        this.G();
        int[] nArray = new int[]{0, 0, 14};
        e.a(47, 2, nArray).a(this.r, this.s, 9, 1000, false, n);
    }

    final int b() {
        int n = -1;
        switch (this.q) {
            case 54: {
                n = 3;
                break;
            }
            case 50: {
                n = 1;
                break;
            }
            case 20: {
                n = 2;
                break;
            }
            case 52: {
                n = 4;
            }
        }
        return n;
    }

    private void a(e e2) {
        this.c = e2;
        e2.c = this;
    }

    final void G() {
        if (this.c != null) {
            this.c.q = -1;
        }
    }

    final void H() {
        this.h(this.G, this.H);
        this.h(this.E, this.F);
    }

    private void h(int n, int n2) {
        if (n > -1 && n2 > -1) {
            int n3 = 36 * a.J / 100;
            int n4 = 18 * a.J / 100;
            int n5 = n & Short.MAX_VALUE;
            ((n & 0x8000) != 0 ? a.a[n5] : a.b[n5]).a(a, n2, this.r, this.s);
            if (this.q == 49) {
                n = a[0];
                n2 = a[2];
                e.a[0] = a[0] / n3 * n3;
                e.a[1] = a[1] / n4 * n4;
                e.a[2] = (a[2] + n3 - 1) / n3 * n3;
                e.a[3] = (a[3] + n4 - 1) / n4 * n4;
                if (n2 - n == a[2] - a[0]) {
                    a[2] = a[2] + n3;
                }
            } else {
                e.a[0] = a[0] / n3 * n3;
                e.a[1] = a[1] / n4 * n4;
                e.a[2] = (a[2] + n3 - 1) / n3 * n3;
                e.a[3] = (a[3] + n4 - 1) / n4 * n4;
            }
            e.a(a[0], a[1], a[2], a[3]);
            if (!a.e()) {
                i.a(a[0], a[1], a[2] - a[0], a[3] - a[1], 0);
            }
        }
    }

    private boolean h() {
        int[] nArray = new int[2];
        int[] nArray2 = new int[2];
        nArray[0] = this.r;
        nArray[1] = this.s;
        a.b(nArray, nArray2);
        return nArray2[0] > -100 && nArray2[0] < f.T + 100 && nArray2[1] >= -100 && nArray2[1] < f.U + 100;
    }

    static {
        f = false;
        ad = 0;
        ae = 10;
        af = 0;
        ag = 10;
        ah = 0;
        ai = 0;
    }
}

