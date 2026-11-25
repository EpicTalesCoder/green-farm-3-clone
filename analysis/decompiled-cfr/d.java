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
public final class d {
    static int[] a;
    private static int[] c;
    private int e;
    byte[] a;
    byte[] b;
    private short[] b;
    private short[] c;
    private byte[] d;
    private short[] d;
    short[] a;
    private byte[] e;
    private short[] e;
    private byte[] f;
    private short[] f;
    private short[] g;
    private byte[] g;
    private short[] h;
    private byte[] h;
    private short[] i;
    private short[] j;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private short[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    byte[] c;
    private short[] l;
    private int f;
    private int[][][] a;
    int a;
    private int[] d;
    private int g;
    private boolean a;
    private int h;
    private short a;
    private int[] e;
    private int[] f;
    static int b;
    static int c;
    j[][] a;
    private j[][][] a;
    private static int[] g;
    private static int[] h;
    private static int[] i;
    private static int[] j;
    private byte[] q;
    private byte[] r;
    private int[] k;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    static int[] b;
    private static boolean b;
    private static char a;
    private int m = -1;
    private static short[][] a;
    private static int[] l;
    private static int[] m;
    private static d[][] a;
    private static int n;
    static int d;
    private static int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private boolean c = false;
    private boolean d = false;
    private short[][] b;
    private short b;
    private int u = -1;
    private static short[] m;
    private static int v;
    private static int w;
    private static int x;

    final void a() {
        this.a = null;
        this.b = null;
        this.h = null;
        this.g = null;
        this.d = null;
        this.d = null;
        this.l = null;
        this.k = null;
        this.a = null;
        this.e = null;
        this.e = null;
        this.f = null;
        this.f = null;
        this.g = null;
        this.k = null;
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                this.a[i2] = null;
            }
            this.a = null;
        }
        d d2 = this;
        if (d2.a != null) {
            for (int i3 = 0; i3 < d2.a.length; ++i3) {
                d2.a[i3] = null;
            }
            d2.a = null;
        }
    }

    final void a(byte[] object, int n) {
        int n2 = 0xFFFFFF;
        byte[] byArray = object;
        object = this;
        if (byArray == null) {
            return;
        }
        try {
            int n3;
            if (b) {
                System.gc();
            }
            if ((n3 = (int)((byArray[0] & 0xFF) + ((byArray[1] & 0xFF) << 8))) != 1503) {
                new StringBuffer().append("ASprite.Load.Invalid BSprite version !  GLLib supports only (0x").append(Integer.toHexString(1503)).append(")    this sprite version (0x").append(Integer.toHexString(n3)).append(")");
            }
            ((d)object).f = (byArray[2] & 0xFF) + ((byArray[3] & 0xFF) << 8) + ((byArray[4] & 0xFF) << 16) + ((byArray[5] & 0xFF) << 24);
            n3 = super.a(6, byArray);
            n3 = super.b(n3, byArray);
            n3 = super.c(n3, byArray);
            n3 = super.d(n3, byArray);
            n3 = super.e(n3, byArray);
            if (((d)object).e <= 0) {
                if (b) {
                    System.gc();
                }
                return;
            }
            if ((((d)object).f & 0x1000000) != 0) {
                super.a(n3, byArray, n2);
            }
            if ((((d)object).f & 0x1000) != 0) {
                int n4 = ((d)object).b();
                if (n4 > 0) {
                    n3 = 0;
                    if ((((d)object).f & 0x400) == 0 && (((d)object).h & 4) == 0) {
                        ((d)object).e = new byte[n4 << 2];
                        n2 = 0;
                        while (n2 < n4) {
                            int n5 = n2++;
                            super.a(b, n5);
                            ((d)object).e[n3++] = (byte)b[0];
                            ((d)object).e[n3++] = (byte)b[1];
                            ((d)object).e[n3++] = (byte)(b[2] - b[0]);
                            ((d)object).e[n3++] = (byte)(b[3] - b[1]);
                        }
                    } else {
                        ((d)object).e = new short[n4 << 2];
                        n2 = 0;
                        while (n2 < n4) {
                            int n6 = n2++;
                            super.a(b, n6);
                            ((d)object).e[n3++] = (short)b[0];
                            ((d)object).e[n3++] = (short)b[1];
                            ((d)object).e[n3++] = (short)(b[2] - b[0]);
                            ((d)object).e[n3++] = (short)(b[3] - b[1]);
                        }
                    }
                }
            } else if ((((d)object).h & 4) != 0) {
                ((d)object).h &= 0xFFFFFFFB;
            }
            if (b) {
                System.gc();
            }
            return;
        }
        catch (Exception exception) {
            Exception exception2 = exception;
            exception.printStackTrace();
            new StringBuffer().append("Asprite.Load. error while loading sprite : ").append(exception2);
            return;
        }
    }

    private void f(int n) {
        if (this.q == null) {
            this.q = new byte[n];
            for (int i2 = 0; i2 < n; ++i2) {
                this.q[i2] = 0;
            }
        }
        if (this.k == null) {
            this.k = new int[n];
        }
    }

    private int a(int n, byte[] byArray) {
        ++n;
        ++n;
        this.e = (short)((byArray[6] & 0xFF) + ((byArray[7] & 0xFF) << 8));
        if (this.e > 0) {
            int n2;
            int n3;
            this.a = new byte[this.e];
            this.b = new byte[this.e];
            int n4 = 0;
            int n5 = 0;
            short[][] sArrayArray = null;
            if ((this.f & 4) != 0) {
                this.r = new byte[this.e];
            }
            boolean bl = false;
            boolean bl2 = false;
            for (n3 = 0; n3 < this.e; ++n3) {
                boolean bl3 = false;
                boolean bl4 = false;
                boolean bl5 = false;
                if ((byArray[n] & 0xFF) == 0) {
                    ++n;
                    bl = false;
                    bl2 = true;
                    if ((this.f & 4) != 0) {
                        this.r[n3] = byArray[n++];
                    }
                } else if ((byArray[n] & 0xFF) == 255) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 1;
                    bl = true;
                    bl2 = true;
                } else if ((byArray[n] & 0xFF) == 254) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 2;
                    bl = true;
                    bl2 = true;
                } else if ((byArray[n] & 0xFF) == 253) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 5;
                    bl = false;
                    bl2 = true;
                } else if ((byArray[n] & 0xFF) == 252) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 3;
                    bl = true;
                    bl2 = true;
                    bl3 = true;
                } else if ((byArray[n] & 0xFF) == 251) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 4;
                    bl = true;
                    bl2 = true;
                    bl3 = true;
                } else if ((byArray[n] & 0xFF) == 250) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 6;
                    bl = true;
                    bl2 = false;
                    bl4 = true;
                } else if ((byArray[n] & 0xFF) == 249) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 7;
                    bl = true;
                    bl2 = false;
                    bl4 = true;
                } else if ((byArray[n] & 0xFF) == 248) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 8;
                    bl = true;
                    bl2 = true;
                    bl4 = false;
                } else if ((byArray[n] & 0xFF) == 247) {
                    ++n;
                    this.f(this.e);
                    this.q[n3] = 9;
                    bl = true;
                    bl5 = true;
                    bl2 = true;
                    bl4 = false;
                } else {
                    new StringBuffer().append("Invalid module type : ").append(byArray[n] & 0xFF).append("   module #").append(n3);
                }
                if (bl) {
                    this.k[n3] = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8) + ((byArray[n++] & 0xFF) << 16) + ((byArray[n++] & 0xFF) << 24);
                }
                if (bl5) {
                    if (sArrayArray == null) {
                        sArrayArray = new short[this.e][];
                    }
                    short[] sArray = new short[3];
                    n2 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8) + ((byArray[n++] & 0xFF) << 16) + ((byArray[n++] & 0xFF) << 24);
                    sArray[0] = (short)n2;
                    sArray[1] = n2 >> 16;
                    sArray[2] = byArray[n++];
                    sArrayArray[n3] = sArray;
                    ++n4;
                    n5 += 3;
                }
                if (bl2) {
                    this.a[n3] = byArray[n++];
                    this.b[n3] = byArray[n++];
                }
                if (bl3) {
                    if (sArrayArray == null) {
                        sArrayArray = new short[this.e][];
                    }
                    short[] sArray = new short[2];
                    short[] sArray2 = sArray;
                    sArray[0] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                    sArray2[1] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                    sArrayArray[n3] = sArray2;
                    ++n4;
                    n5 += 2;
                }
                if (!bl4) continue;
                if (sArrayArray == null) {
                    sArrayArray = new short[this.e][];
                }
                short[] sArray = new short[4];
                short[] sArray3 = sArray;
                sArray[0] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                sArray3[1] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                sArray3[2] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                sArray3[3] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                sArrayArray[n3] = sArray3;
                ++n4;
                n5 += 4;
            }
            if (n4 > 0) {
                this.b = new short[n5];
                this.c = new short[n4 << 1];
                n3 = 0;
                short s = 0;
                for (int n6 = 0; n6 < this.e; n6 = (int)((short)(n6 + 1))) {
                    n2 = this.q[n6] == 4 ? 2 : -1;
                    if (n2 <= 0) continue;
                    this.c[n3 << 1] = n6;
                    this.c[(n3 << 1) + 1] = s;
                    for (n4 = 0; n4 < n2; ++n4) {
                        this.b[s] = sArrayArray[n6][n4];
                        s = (short)(s + 1);
                    }
                    sArrayArray[n6] = null;
                    ++n3;
                }
            }
        }
        return n;
    }

    private int b(int n, byte[] byArray) {
        int n2;
        if ((n2 = (int)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
            if ((this.f & 0x100000) != 0) {
                this.h = new short[n2];
            } else {
                this.g = new byte[n2];
            }
            if ((this.f & 0x400) != 0) {
                this.i = new short[n2];
                this.j = new short[n2];
            } else {
                this.i = new byte[n2];
                this.j = new byte[n2];
            }
            this.h = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                if ((this.f & 0x100000) != 0) {
                    this.h[i2] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                } else {
                    this.g[i2] = byArray[n++];
                }
                if ((this.f & 0x400) != 0) {
                    if ((this.f & 0x400) != 0) {
                        this.i[i2] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                        this.j[i2] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                    } else {
                        this.i[i2] = byArray[n++];
                        this.j[i2] = byArray[n++];
                    }
                } else {
                    this.i[i2] = byArray[n++];
                    this.j[i2] = byArray[n++];
                }
                this.h[i2] = byArray[n++];
            }
        }
        return n;
    }

    private int c(int n, byte[] byArray) {
        block12: {
            int n2;
            int n3;
            if ((this.f & 0x8000) != 0) {
                n3 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8);
                if ((this.f & 0x400) == 0) {
                    this.f = new byte[n3 << 2];
                    System.arraycopy(byArray, n, this.f, 0, n3 << 2);
                    n += n3 << 2;
                } else {
                    this.f = new short[n3 << 2];
                    n2 = n3 << 2;
                    short[] sArray = this.f;
                    n3 = n;
                    byte[] byArray2 = byArray;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        sArray[i2] = (short)((byArray2[n3++] & 0xFF) + ((byArray2[n3++] & 0xFF) << 8));
                    }
                    n = n3;
                }
            }
            if ((n3 = (int)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) <= 0) break block12;
            this.d = (short[])((this.f & 0x800) != 0 ? new short[n3] : new byte[n3]);
            this.a = new short[n3];
            if ((this.f & 0x8000) != 0) {
                this.g = new short[n3 + 1];
            }
            short s = 0;
            for (n2 = 0; n2 < n3; ++n2) {
                this.d[n2] = (this.f & 0x800) != 0 ? (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8)) : byArray[n++];
                this.a[n2] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                if ((this.f & 0x8000) == 0 || (this.f & 0x8000) == 0) continue;
                this.g[n2] = s;
                s = (short)(s + byArray[n++]);
            }
            if ((this.f & 0x8000) != 0) {
                this.g[this.g.length - 1] = s;
            }
            if ((this.f & 0x1000) == 0) {
                n2 = n3 << 2;
                if ((this.f & 0x400) == 0) {
                    this.e = new byte[n2];
                    for (n3 = 0; n3 < n2; ++n3) {
                        this.e[n3] = byArray[n++];
                    }
                } else {
                    this.e = new short[n2];
                    for (n3 = 0; n3 < n2; ++n3) {
                        this.e[n3] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                    }
                }
            }
        }
        return n;
    }

    private int d(int n, byte[] byArray) {
        int n2;
        if ((n2 = (int)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
            this.l = new byte[n2];
            this.m = new byte[n2];
            this.n = new byte[n2];
            this.o = new byte[n2];
            this.p = new byte[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                this.l[i2] = byArray[n++];
                this.m[i2] = byArray[n++];
                this.n[i2] = byArray[n++];
                this.o[i2] = byArray[n++];
                this.p[i2] = byArray[n++];
            }
        }
        return n;
    }

    private int e(int n, byte[] byArray) {
        int n2;
        if ((n2 = (int)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8))) > 0) {
            this.k = new byte[n2];
            this.k = new short[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                this.k[i2] = byArray[n++];
                this.k[i2] = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            }
        }
        return n;
    }

    final void b() {
        this.a = null;
        this.c = null;
        this.l = null;
        if (b) {
            System.gc();
        }
    }

    final int a(int n, int n2) {
        return this.m[this.k[n] + n2] & 0xFF;
    }

    final int a(int n) {
        return this.k[n] & 0xFF;
    }

    private int j(int n) {
        if ((this.f & 0x800) != 0) {
            return this.d[n];
        }
        return this.d[n] & 0xFF;
    }

    final int b(int n) {
        if ((this.f & 0x400) != 0) {
            return this.i[n];
        }
        return this.i[n];
    }

    final int c(int n) {
        if ((this.f & 0x400) != 0) {
            return this.j[n];
        }
        return this.j[n];
    }

    final int d(int n) {
        if ((this.f & 0x400) == 0 && (this.h & 4) == 0) {
            return this.e[(n << 2) + 2] & 0xFF;
        }
        return this.e[(n << 2) + 2] & 0xFFFF;
    }

    final int e(int n) {
        if ((this.f & 0x400) == 0 && (this.h & 4) == 0) {
            return this.e[(n << 2) + 3] & 0xFF;
        }
        return this.e[(n << 2) + 3] & 0xFFFF;
    }

    final int f(int n) {
        if ((this.f & 0x400) == 0 && (this.h & 4) == 0) {
            return this.e[n << 2];
        }
        return this.e[n << 2];
    }

    final int g(int n) {
        if ((this.f & 0x400) == 0 && (this.h & 4) == 0) {
            return this.e[(n << 2) + 1];
        }
        return this.e[(n << 2) + 1];
    }

    private int k(int n) {
        n = (this.f & 0x100000) != 0 ? this.h[n] : this.g[n] & 0xFF;
        return n;
    }

    final int b(int n, int n2) {
        n = this.d(n, n2);
        return this.k(n);
    }

    private int l(int n) {
        return this.h[n] & 0xFF;
    }

    final int c(int n, int n2) {
        n = this.d(n, n2);
        return this.l(n);
    }

    private int d(int n, int n2) {
        return this.a[n] + n2;
    }

    private int m(int n) {
        return this.b(this.a[n]);
    }

    private int n(int n) {
        return this.c(this.a[0] + n);
    }

    private void a(int[] nArray, int n) {
        this.a(nArray, n, 0, 0, 0, false, true);
    }

    /*
     * WARNING - void declaration
     */
    private void a(int[] nArray, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        void var7_10;
        if (var7_10 == false) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9 = this.f(n);
            int n10 = this.g(n);
            int n11 = this.d(n);
            n = this.e(n);
            if ((n4 & 1) != 0) {
                n8 = -n9 - n11;
            }
            if ((n4 & 2) != 0) {
                n7 = -n10 - n;
            }
            if ((n4 & 4) != 0) {
                n4 = n8;
                n6 = -n7 - n;
                n5 = n4;
                n4 = n11;
                n11 = n;
                n = n4;
            }
            i = n2 + n6;
            j = n3 + n5;
            k = i + n11;
            l = j + n;
        } else {
            i = Integer.MAX_VALUE;
            j = Integer.MAX_VALUE;
            k = Integer.MIN_VALUE;
            l = Integer.MIN_VALUE;
            this.a(null, n, n2, n3, n4);
        }
        nArray[0] = i;
        nArray[1] = j;
        nArray[2] = k;
        nArray[3] = l;
    }

    final void a(int[] nArray, int n, int n2, int n3) {
        this.a(nArray, n, n2, n3, 0, false, false);
    }

    final void a(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        d d2 = this;
        int n7 = d2.p[d2.k[n] + n2] & 0xF;
        if ((n5 & 1) != 0) {
            n7 = h[n7 & 7] | n7 & 0xFFFFFFF8;
        }
        if ((n5 & 2) != 0) {
            n7 = i[n7 & 7] | n7 & 0xFFFFFFF8;
        }
        if ((n5 & 4) != 0) {
            n7 = j[n7 & 7] | n7 & 0xFFFFFFF8;
        }
        d d3 = this;
        int n8 = d3.k[n] + n2;
        int n9 = d3.l[n8] & 0xFF;
        d2 = this;
        int n10 = n6 = d2.k[n] + n2;
        n8 = d2.n[n10];
        d d4 = this;
        int n11 = n6 = d4.k[n] + n2;
        n = d4.o[n11];
        if ((n5 & 1) != 0) {
            n8 = -n8;
        }
        if ((n5 & 2) != 0) {
            n = -n;
        }
        if ((n5 & 4) != 0) {
            n2 = n8;
            n8 = -n;
            n = n2;
        }
        this.a(nArray, n9, n3 + n8, n4 + n, n7, false, false);
    }

    final int a() {
        if (this.k == null) {
            return 0;
        }
        return this.k.length;
    }

    final int b() {
        if ((this.f & 0x800) != 0) {
            if (this.d == null) {
                return 0;
            }
            return this.d.length;
        }
        if (this.d == null) {
            return 0;
        }
        return this.d.length;
    }

    private int o(int n) {
        if (this.l != null) {
            return this.l[n] & 0xFFFF;
        }
        return -1;
    }

    final int h(int n) {
        if (this.g != null) {
            return this.g[n + 1] - this.g[n];
        }
        return 0;
    }

    final void a(int n, int n2, int[] nArray, int n3) {
        if (this.g != null && nArray != null) {
            n3 = this.g[n];
            if ((n = this.g[n + 1] - n3) > 0 && n2 < n) {
                n3 = n3 + n2 << 2;
                if ((this.f & 0x400) != 0) {
                    if (this.f != null) {
                        nArray[0] = this.f[n3];
                        nArray[1] = this.f[n3 + 1];
                        nArray[2] = this.f[n3 + 2] & 0xFFFF;
                        nArray[3] = this.f[n3 + 3] & 0xFFFF;
                        return;
                    }
                } else if (this.f != null) {
                    nArray[0] = this.f[n3];
                    nArray[1] = this.f[n3 + 1];
                    nArray[2] = this.f[n3 + 2] & 0xFF;
                    nArray[3] = this.f[n3 + 3] & 0xFF;
                }
                return;
            }
            nArray[0] = 0;
            nArray[1] = 0;
            nArray[2] = 0;
            nArray[3] = 0;
        }
    }

    static int[] a(int[] nArray) {
        if (nArray == null || nArray != a) {
            if (a == null) {
                a = new int[5000];
            }
            return a;
        }
        if (nArray == null || nArray != c) {
            if (c == null) {
                c = new int[5000];
            }
            return c;
        }
        return null;
    }

    final boolean a(int n) {
        if (n < 0) {
            return false;
        }
        if (this.a == null) {
            return false;
        }
        if (n >= this.a.length) {
            return false;
        }
        return this.a[n] != null;
    }

    final void a(int n, int n2) {
        if ((this.f & 0x400) != 0) {
            this.i[n] = (short)n2;
            return;
        }
        this.i[n] = (byte)n2;
    }

    final void b(int n, int n2) {
        if ((this.f & 0x400) != 0) {
            this.j[n] = (short)n2;
            return;
        }
        this.j[n] = (byte)n2;
    }

    private int a(int n, byte[] byArray, int n2) {
        if ((this.f & 0x1000000) != 0) {
            int n3;
            int n4;
            if (n >= byArray.length) {
                return n;
            }
            n2 = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            int n5 = 1;
            if ((this.f & 0x40000000) != 0) {
                n5 = byArray[n++];
            }
            if (this.d == null) {
                this.d = new int[n5];
            }
            for (n4 = 0; n4 < n5; ++n4) {
                this.a = n3 = byArray[n++] & 0xFF;
                this.d[n4] = n3 = byArray[n++] & 0xFF;
                int n6 = n5;
                d d2 = this;
                if (d2.a == null) {
                    d2.a = new int[n6][16][];
                }
                int n7 = n4;
                byte[] byArray2 = byArray;
                n6 = n;
                d2 = this;
                for (int i2 = 0; i2 < d2.a; ++i2) {
                    int n8;
                    int n9;
                    int n10;
                    d2.a[n7][i2] = new int[n3];
                    int[] nArray = d2.a[n7][i2];
                    if (n2 == 21781) {
                        for (n10 = 0; n10 < n3; ++n10) {
                            n9 = (short)((byArray2[n6++] & 0xFF) + ((byArray2[n6++] & 0xFF) << 8));
                            n8 = -16777216;
                            if ((n9 & 0x8000) != 32768) {
                                n8 = 0;
                                d2.a = true;
                            }
                            if ((n9 = n8 | (n9 & 0x7C00) << 9 | (n9 & 0x3E0) << 6 | (n9 & 0x1F) << 3) == 0xF800F8) {
                                n9 = 0xFF00FF;
                            }
                            nArray[n10] = n9;
                        }
                        continue;
                    }
                    if (n2 == 12803) {
                        for (n10 = 0; n10 < n3; ++n10) {
                            n9 = byArray2[n6++] & 0xFF;
                            n8 = -16777216;
                            if (n9 == 192) {
                                n8 = 0;
                                d2.a = true;
                            }
                            nArray[n10] = n8 | (n9 & 0xE0) << 16 | (n9 & 0x1C) << 11 | (n9 & 3) << 6;
                        }
                        continue;
                    }
                    new StringBuffer().append("Sprite Pixel Format Error: Unsupported format! Format ID: 0x").append(Integer.toHexString(n2));
                }
                n = n6;
            }
            this.a = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
            if (this.a == 25840 || this.a == -22976) {
                if (this.e == null) {
                    this.e = new int[n5];
                    this.f = new int[n5];
                }
                n4 = 0;
                while (n4 < n5) {
                    n3 = n4;
                    this.e[n4] = 1;
                    this.f[n4] = 0;
                    for (n3 = this.d[n3] - 1; n3 != 0; n3 >>= 1) {
                        int n11 = n4;
                        this.e[n11] = this.e[n11] << 1;
                        int n12 = n4;
                        this.f[n12] = this.f[n12] + 1;
                    }
                    int n13 = n4++;
                    this.e[n13] = this.e[n13] - 1;
                }
            }
            if (this.e > 0) {
                this.l = new short[this.e];
                n4 = 0;
                n3 = n;
                for (n2 = 0; n2 < this.e; ++n2) {
                    if ((this.f & 0x80) != 0) {
                        n5 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8) + ((byArray[n++] & 0xFF) << 16) + ((byArray[n++] & 0xFF) << 24);
                    } else {
                        short s = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                        n5 = s;
                        if (s < 0) {
                            new StringBuffer().append("LoadingModules: module ").append(n2).append(" size read as short is negative. You need to add BS_IMAGE_SIZE_INT to this sprites export flags");
                        }
                    }
                    this.l[n2] = (short)n4;
                    n4 += n5;
                    n += n5;
                }
                n = n3;
                this.c = new byte[n4];
                for (n4 = 0; n4 < this.e; ++n4) {
                    if ((this.f & 0x80) != 0) {
                        n3 = (byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8) + ((byArray[n++] & 0xFF) << 16) + ((byArray[n++] & 0xFF) << 24);
                    } else {
                        short s = (short)((byArray[n++] & 0xFF) + ((byArray[n++] & 0xFF) << 8));
                        n3 = s;
                        if (s < 0) {
                            new StringBuffer().append("LoadingModules: module ").append(n4).append(" size read as short is negative. You need to add BS_IMAGE_SIZE_INT to this sprites export flags");
                        }
                    }
                    System.arraycopy(byArray, n, this.c, this.o(n4), n3);
                    n += n3;
                }
            }
        }
        return n;
    }

    static void a(int n) {
        a = new short[n][];
        a = new d[n][];
        l = new int[n];
        m = new int[n];
    }

    static void c(int n, int n2) {
        d.m[n] = n2;
        d.a[n] = new short[n2];
        d.a[n] = new d[n2];
        for (n2 = 0; n2 < a[n].length; ++n2) {
            d.a[n][n2] = -1;
        }
    }

    final void b(int n) {
        this.m = n;
        if (this.a == null) {
            this.a = new j[this.a][];
            for (n = 0; n < this.a; ++n) {
                this.a[n] = new j[this.e];
            }
        }
    }

    final void c() {
        if (this.m >= 0) {
            for (int i2 = 0; i2 < m[this.m]; ++i2) {
                if (a[this.m][i2] != this) continue;
                int n = a[this.m][i2];
                int n2 = n >> 10;
                d.a[this.m][i2] = null;
                this.a[n2][n &= 0x3FF] = null;
            }
        }
    }

    private final void a(int n, Object object) {
        Object object2 = object;
        int n2 = n;
        d d2 = this;
        if (d2.m >= 0 && d2.a[d2.g][n2] == null) {
            d d3;
            int n3 = l[d2.m];
            short s = a[d2.m][n3];
            int n4 = s >> 10;
            int n5 = s & 0x3FF;
            if (s >= 0 && (d3 = a[d2.m][n3]) != null) {
                d3.a[n4][n5] = null;
            }
            d.a[d2.m][n3] = s = (short)((n2 & 0x3FF) + (d2.g << 10));
            d.a[d2.m][n3] = d2;
            d.l[d2.m] = (l[d2.m] + 1) % m[d2.m];
            d2.a[d2.g][n2] = (j)object2;
        }
    }

    final Object a(int n) {
        return this.a(n);
    }

    private int[] a(int n) {
        d d2 = this;
        if (d2.l == null ? false : d2.c != null) {
            boolean bl;
            d2 = this;
            int n2 = d2.r == null ? 0 : d2.r[n];
            Object object = this.b[n] & 0xFF;
            int n3 = this.a[n] & 0xFF;
            int n4 = this.o(n);
            byte[] byArray = this.c;
            int n5 = n2;
            d d3 = this;
            int n6 = 0;
            int n7 = n3 * object;
            if (a == null) {
                a = new int[5000];
            }
            if (n7 > a.length) {
                new StringBuffer().append("DecodeImage_Algorithm: Module WxH > temp_int.length (").append(n3).append(" x ").append((int)object).append(" = ").append(n7).append(" > ").append(a.length).append(")! Either decrease module size or increase GLLibConfig.TMP_BUFFER_SIZE!");
            }
            int n8 = d3.g;
            object = n5;
            Object object2 = d3;
            int[] nArray = n8 >= 0 && n8 < ((d)object2).a && ((d)object2).a != null && n8 < ((d)object2).a[object].length ? ((d)object2).a[object][n8] : null;
            object2 = nArray;
            if (nArray == null) {
                bl = false;
            } else {
                if (d3.a == 25840) {
                    while (n6 < n7) {
                        n8 = byArray[n4++] & 0xFF;
                        object = object2[n8 & d3.e[n5]];
                        n8 >>= d3.f[n5];
                        while (n8-- >= 0) {
                            d.a[n6++] = object;
                        }
                    }
                } else if (d3.a == 5632) {
                    n7 = n7 + ((n7 & 1) == 0 ? 0 : 2) >> 1;
                    while (--n7 >= 0) {
                        n8 = byArray[n4++];
                        d.a[n6++] = (int)object2[n8 >> 4 & 0xF];
                        d.a[n6++] = (int)object2[n8 & 0xF];
                    }
                } else {
                    new StringBuffer().append("ERROR : sprite encoding for ").append(Integer.toHexString(d3.a)).append(" is not enabled. Check sprite_useEncodeFormat in GllibConfiguration");
                }
                bl = true;
            }
            if (bl) {
                return a;
            }
        }
        return null;
    }

    final void a(short[] object) {
        int n;
        this.b = object[0];
        this.b = new short[this.b][];
        int n2 = 1;
        for (n = 0; n < this.b; ++n) {
            this.b[n] = new short[2];
            this.b[n][0] = object[n2++];
            this.b[n][1] = (short)object[n2++];
        }
        n = n2;
        while (n < ((short[])object).length) {
            n2 = object[n++];
            int n3 = object[n++];
            short[] sArray = new short[(n3 << 1) + 2];
            short[] sArray2 = sArray;
            sArray[0] = this.b[n2][0];
            sArray2[1] = this.b[n2][1];
            for (int i2 = 0; i2 < n3; ++i2) {
                sArray2[(i2 << 1) + 2] = (short)object[n++];
                sArray2[(i2 << 1) + 3] = (short)object[n++];
            }
            this.b[n2] = sArray2;
        }
        d d2 = this;
        object = d2;
        d2.t = -d2.n(0);
        n2 = super.n(1);
        ((d)object).p = ((d)object).t + n2;
        Object object2 = object;
        ((d)object2).q = super.n(2) - super.n(1);
        object2 = object;
        ((d)object2).s = super.m(super.p(32));
    }

    private int p(int n) {
        int n2;
        if (this.b == null) {
            return 0;
        }
        int n3 = n % this.b;
        if (this.b[n3][0] == n) {
            return this.b[n3][1];
        }
        int n4 = this.b[n3].length;
        for (n2 = 2; n2 < n4 && this.b[n3][n2] != n; n2 += 2) {
        }
        if (n2 >= n4) {
            return 1;
        }
        return this.b[n3][n2 + 1];
    }

    final int c() {
        if (this.u >= 0) {
            return this.q * this.u >> 8;
        }
        return this.q;
    }

    final int d() {
        if (this.u >= 0) {
            return this.p * this.u >> 8;
        }
        return this.p;
    }

    private int g() {
        if (this.u >= 0) {
            return this.s * this.u >> 8;
        }
        return this.s;
    }

    private int h() {
        if (this.u >= 0) {
            return this.r * this.u >> 8;
        }
        return this.r;
    }

    final void c(int n) {
        this.r = n;
    }

    final int e() {
        if (this.u >= 0) {
            return this.p * this.u >> 8;
        }
        return this.p;
    }

    private static final int a(short[] sArray, int n) {
        n = n * 3 + 1;
        return sArray[n];
    }

    private static final int b(short[] sArray, int n) {
        n = n * 3 + 2;
        return sArray[n];
    }

    final short[] a(String string, int n, boolean s) {
        if (m == null) {
            m = new short[1500];
        }
        int n2 = string.length();
        short s2 = 0;
        int n3 = 1;
        short s3 = 0;
        boolean bl = this.d;
        boolean bl2 = this.c;
        int n4 = this.g;
        boolean bl3 = false;
        short s4 = 0;
        boolean bl4 = this.d;
        boolean bl5 = this.c;
        int n5 = this.g;
        int n6 = n5 & 0xFFF | (bl4 ? 4096 : 0) | (bl5 ? 8192 : 0);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n7 = string.charAt(i2);
            int n8 = this.q(this.p(n7));
            if (n7 == 32 || n7 == a) {
                if (n7 == 32) {
                    s2 = (short)(s2 + (short)this.g());
                }
                s3 = (short)i2;
                bl = bl4;
                bl3 = true;
                s4 = 0;
                bl2 = bl5;
                n4 = n5;
                if (s2 <= n) continue;
                bl3 = false;
                for (n8 = (int)s3; n8 >= 0 && (string.charAt(n8) == ' ' || string.charAt(n8) == a); --n8) {
                    if (string.charAt(n8) != ' ') continue;
                    s2 = (short)(s2 - (short)this.g());
                }
                while (s3 < n2 && (string.charAt(s3) == ' ' || string.charAt(s3) == a)) {
                    s3 = (short)(s3 + 1);
                }
                s3 = (short)(s3 - 1);
                i2 = s3;
                bl4 = bl;
                int n9 = n3;
                n3 = (short)(n3 + 1);
                d.m[n9] = (short)(s3 + 1);
                int n10 = n3;
                n3 = (short)(n3 + 1);
                d.m[n10] = s2;
                int n11 = n3;
                n3 = (short)(n3 + 1);
                d.m[n11] = (short)n6;
                bl5 = bl2;
                n5 = n4;
                n6 = n4 & 0xFFF | (bl ? 4096 : 0) | (bl2 ? 8192 : 0);
                s2 = 0;
                continue;
            }
            if (n7 == 92) {
                char c2 = string.charAt(++i2);
                n8 = c2;
                if (c2 == '^') {
                    bl4 = !bl4;
                    continue;
                }
                if (n8 == 95) {
                    bl5 = !bl5;
                    continue;
                }
                n7 = n8 & 0xFF;
                if ((n7 -= 48) >= this.a) continue;
                n5 = n7;
                continue;
            }
            if (n7 == 10) {
                int n12 = n3;
                n3 = (short)(n3 + 1);
                d.m[n12] = (short)i2;
                int n13 = n3;
                n3 = (short)(n3 + 1);
                d.m[n13] = s2;
                s3 = (short)i2;
                s2 = 0;
                s4 = 0;
                int n14 = n3;
                n3 = (short)(n3 + 1);
                d.m[n14] = (short)n6;
                n6 = n5 & 0xFFF | (bl4 ? 4096 : 0) | (bl5 ? 8192 : 0);
                continue;
            }
            if (n7 < 32) {
                if (n7 == 1) {
                    ++i2;
                    continue;
                }
                if (n7 != 2) continue;
                ++i2;
            }
            n8 += this.h();
            if (bl4) {
                ++n8;
            }
            s4 = (short)(s4 + (short)n8);
            if ((s2 = (short)(s2 + (short)n8)) <= n) continue;
            n7 = !bl3 ? 1 : 0;
            if (n7 != 0) {
                s2 = (short)(s2 - (short)n8);
                s3 = (short)(i2 - 1);
            }
            bl3 = false;
            for (n8 = (int)s3; n8 >= 0 && (string.charAt(n8) == ' ' || string.charAt(n8) == '\n' || string.charAt(n8) == a); --n8) {
                if (string.charAt(n8) != ' ') continue;
                s2 = (short)(s2 - (short)this.g());
            }
            if (n7 != 0) {
                bl = bl4;
                bl2 = bl5;
                n4 = n5;
                s4 = 0;
            }
            if (string.charAt(s3) != '\n') {
                int n15 = n3;
                n3 = (short)(n3 + 1);
                d.m[n15] = (short)(s3 + 1);
                int n16 = n3;
                n3 = (short)(n3 + 1);
                d.m[n16] = (short)(s2 - s4);
            }
            int n17 = n3;
            n3 = (short)(n3 + 1);
            d.m[n17] = (short)n6;
            bl5 = bl2;
            n5 = n4;
            n6 = n4 & 0xFFF | (bl ? 4096 : 0) | (bl2 ? 8192 : 0);
            s2 = 0;
            i2 = s3;
            bl4 = bl;
        }
        int n18 = n3;
        n3 = (short)(n3 + 1);
        d.m[n18] = (short)n2;
        int n19 = n3;
        n3 = (short)(n3 + 1);
        d.m[n19] = s2;
        int n20 = n3;
        n3 = (short)(n3 + 1);
        d.m[n20] = (short)n6;
        d.m[0] = (short)(n3 / 3);
        return m;
    }

    final void a(Graphics graphics, String string, short[] sArray, int n, int n2, int n3, int n4, int n5, int n6, boolean n7) {
        n3 = sArray[0];
        n6 = this.e();
        if (n4 == -1) {
            n4 = n3;
        }
        if (n4 > n3) {
            n4 = n3;
        }
        n6 = this.c() + n6;
        if ((n5 & 0x20) != 0) {
            n2 -= n6 * (n4 - 1);
        } else if ((n5 & 2) != 0) {
            n2 -= n6 * (n4 - 1) >> 1;
        }
        d.n = this.g;
        boolean bl = this.d;
        boolean bl2 = this.c;
        int n8 = f.b(graphics);
        int n9 = n8 + f.d(graphics);
        n8 -= n6;
        n9 += n6;
        int n10 = 0;
        for (n7 = 0; n7 < n3 && n10 <= n4 - 1; ++n7, ++n10) {
            v = n7 > 0 ? d.a(sArray, n7 - 1) : 0;
            w = d.a(sArray, n7);
            if (v < string.length() && string.charAt(v) == '\n') {
                ++v;
            }
            int n11 = n;
            int n12 = n2 + n10 * n6;
            if (n12 < n8) continue;
            if (n12 > n9) break;
            if ((n5 & 0x2B) != 0) {
                if (this.u >= 0) {
                    if ((n5 & 8) != 0) {
                        n11 = n - (d.b(sArray, n7) * this.u >> 8);
                    } else if ((n5 & 1) != 0) {
                        n11 = n - (d.b(sArray, n7) * this.u >> 9);
                    }
                } else if ((n5 & 8) != 0) {
                    n11 = n - d.b(sArray, n7);
                } else if ((n5 & 1) != 0) {
                    n11 = n - (d.b(sArray, n7) >> 1);
                }
                if ((n5 & 0x20) != 0) {
                    n12 -= this.e();
                } else if ((n5 & 2) != 0) {
                    n12 -= this.e() >> 1;
                }
            }
            int n13 = n7;
            short[] sArray2 = sArray;
            short s = sArray2[n13 = n13 * 3 + 3];
            this.d = (s & 0x1000) != 0;
            this.c = (s & 0x2000) != 0;
            this.d(s & 0xFFF);
            this.a(graphics, string, n11, n12, 0, false);
        }
        v = -1;
        w = -1;
        x = -1;
        this.g = d.n;
        this.d = bl;
        this.c = bl2;
    }

    final void a(String string, char[] cArray) {
        int n;
        if (string == null) {
            return;
        }
        d = 0;
        o = this.e();
        int n2 = 0;
        boolean bl = string != null;
        int n3 = n = v >= 0 ? v : 0;
        int n4 = bl ? (w >= 0 ? w : string.length()) : (w >= 0 ? w : (null).length);
        boolean bl2 = this.d;
        while (n < n4) {
            block13: {
                int n5;
                int n6;
                block15: {
                    block19: {
                        block18: {
                            block17: {
                                block16: {
                                    block14: {
                                        block12: {
                                            n6 = bl ? string.charAt(n) : null[n];
                                            if (n6 != 92) break block12;
                                            if ((bl ? string.charAt(n) : null[++n]) == '^') {
                                                bl2 = !bl2;
                                            }
                                            break block13;
                                        }
                                        if (n6 <= 32) break block14;
                                        n5 = this.p(n6);
                                        break block15;
                                    }
                                    if (n6 != 32 && n6 != a) break block16;
                                    if (n6 == 32) {
                                        n2 += this.g();
                                    }
                                    break block13;
                                }
                                if (n6 != 32) break block17;
                                n2 += this.g();
                                break block13;
                            }
                            if (n6 != 10) break block18;
                            if (n2 > d) {
                                d = n2;
                            }
                            n2 = 0;
                            o += this.c() + this.e();
                            break block13;
                        }
                        if (n6 != 1) break block19;
                        ++n;
                        break block13;
                    }
                    if (n6 != 2) break block13;
                    ++n;
                    n5 = bl ? (int)string.charAt(n) : null[n];
                }
                n6 = n5;
                n2 += this.q(n6) + this.h();
                if (bl2) {
                    ++n2;
                }
            }
            ++n;
        }
        if (n2 > d) {
            d = n2;
        }
        if (d > 0) {
            d -= this.h();
        }
    }

    final void a(Graphics graphics, String string, int n, int n2, int n3) {
        this.a(graphics, string, n, n2, n3, true);
    }

    private void a(Graphics object, String string, int n, int n2, int n3, boolean bl) {
        boolean bl2 = bl;
        int n4 = n3;
        n3 = n2;
        n2 = n;
        String string2 = string;
        string = object;
        object = this;
        if (string2 != null) {
            int n5;
            int n6;
            n3 = ((d)object).u >= 0 ? (n3 += ((d)object).t * ((d)object).u >> 8) : (n3 += ((d)object).t);
            boolean bl3 = string2 != null;
            ((d)object).a(string2, null);
            if ((n4 & 0x2B) != 0) {
                if ((n4 & 8) != 0) {
                    n2 -= d;
                } else if ((n4 & 1) != 0) {
                    n2 -= d >> 1;
                }
                if ((n4 & 0x20) != 0) {
                    n3 -= o;
                } else if ((n4 & 2) != 0) {
                    n3 -= o >> 1;
                }
            }
            int n7 = n2;
            if (bl2) {
                d.n = ((d)object).g;
            }
            int n8 = n6 = v >= 0 ? v : 0;
            if (bl3) {
                n5 = w >= 0 ? w : string2.length();
            } else {
                int n9 = n5 = w >= 0 ? w : (null).length;
            }
            if (x >= 0 && n5 > x) {
                n5 = x;
            }
            for (int i2 = n6; i2 < n5; ++i2) {
                int n10;
                int n11;
                int n12;
                int n13 = bl3 ? string2.charAt(i2) : null[i2];
                if (n13 == 92) {
                    char c2 = bl3 ? string2.charAt(i2) : null[++i2];
                    n6 = c2;
                    if (c2 == '_') {
                        ((d)object).c = !((d)object).c;
                        continue;
                    }
                    if (n6 == 94) {
                        ((d)object).d = !((d)object).d;
                        continue;
                    }
                    n13 = n6 & 0xFF;
                    ((d)object).d(n13 - 48);
                    continue;
                }
                if (n13 == a) continue;
                if (n13 > 32) {
                    n12 = super.p(n13);
                } else {
                    if (n13 == 32) {
                        if (((d)object).c) {
                            n11 = super.p(95);
                            n6 = n10 + (super.g() - super.q(n11) >> 1);
                            ((d)object).a((Graphics)string, n11, n6, n3, 0);
                        }
                        n10 += super.g();
                        continue;
                    }
                    if (n13 == 10) {
                        n10 = n2;
                        n3 += ((d)object).c() + ((d)object).e();
                        continue;
                    }
                    if (n13 == 1) {
                        char c3 = bl3 ? string2.charAt(i2) : null[++i2];
                        n6 = c3;
                        if (c3 < ((d)object).a) {
                            ((d)object).d(n6);
                        }
                        if (n6 != 255) continue;
                        ((d)object).g = d.n;
                        continue;
                    }
                    if (n13 != 2) continue;
                    ++i2;
                    n12 = bl3 ? (int)string2.charAt(i2) : null[i2];
                }
                n13 = n12;
                ((d)object).a((Graphics)string, n13, n10, n3, 0);
                if (((d)object).c) {
                    n11 = super.p(95);
                    n6 = n10 + (super.q(n13) - super.q(n11) >> 1);
                    ((d)object).a((Graphics)string, n11, n6, n3, 0);
                }
                if (((d)object).d) {
                    ((d)object).a((Graphics)string, n13, ++n10, n3, 0);
                }
                n10 += super.q(n13) + super.h();
            }
            if (bl2) {
                ((d)object).g = d.n;
            }
        }
    }

    private final int q(int n) {
        if (this.u >= 0) {
            return this.m(n) * this.u >> 8;
        }
        return this.m(n);
    }

    final void d(int n) {
        int n2 = n;
        d d2 = this;
        if (n2 >= d2.a || n2 < 0) {
            return;
        }
        d2.g = n2;
        int n3 = n2;
        if (n3 < 0) {
            new StringBuffer().append("DeallocatePalette: invalid palette(").append(n3).append(") passed");
        }
        if (n3 >= 16) {
            new StringBuffer().append("DeallocatePalette: palId(").append(n3).append(") is bigger then MAX_SPRITE_PALETTES. Increase this value in GLLibConfig!");
        }
    }

    final int f() {
        return this.g;
    }

    final int i(int n) {
        if ((this.f & 0x100000) != 0) {
            return this.d[n];
        }
        return this.d[n];
    }

    final void a(int n, int n2, int n3, int n4) {
        d d2 = this;
        if (d2.a == null) {
            d2.a = new j[d2.a][];
        }
        if (d2.a[n] == null) {
            d2.a[n] = new j[d2.e];
        }
        if (this.e == 0) {
            return;
        }
        if (n3 == -1) {
            n3 = this.e - 1;
        }
        if ((this.f & 0x1000008) != 0) {
            int n5 = this.g;
            this.g = n;
            if (b) {
                System.gc();
            }
            while (n2 <= n3) {
                int n6 = n2;
                d d3 = this;
                if ((d3.q != null ? d3.q[n6] : (byte)0) == 0) {
                    int[] nArray;
                    n6 = n2;
                    int n7 = this.a[n6] & 0xFF;
                    int n8 = n2;
                    n6 = this.b[n8] & 0xFF;
                    if (n7 > 0 && n6 > 0 && (nArray = this.a(n2)) != null) {
                        int n9;
                        if (f.n && (f.aa & 0xFF7E0) != 0) {
                            n9 = this.a;
                            nArray = f.a(null, nArray, 0, 0, n7, n6, 0, n9 != 0, false, false);
                            n7 = f.ad;
                            n6 = f.ae;
                        }
                        int n10 = n7;
                        n7 = n2;
                        n9 = n6;
                        int n11 = n10;
                        int[] nArray2 = nArray;
                        this.a[n][n7] = j.a(nArray2, n11, n9);
                    }
                }
                ++n2;
            }
            if (b) {
                System.gc();
            }
            this.g = n5;
        }
        if (b) {
            System.gc();
        }
    }

    final void a(int n, int n2, int n3) {
        boolean bl = b;
        if (b) {
            System.gc();
            b = false;
        }
        int n4 = this.j(n2);
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = this.b(n2, i2);
            if ((this.c(n2, i2) & 0x10) != 0) {
                this.a(n, n5, n3);
                continue;
            }
            int n6 = n5;
            d d2 = this;
            if ((d2.a != null && n >= 0 && n < d2.a.length && d2.a[n] != null && n6 >= 0 && n6 < d2.a[n].length ? d2.a[n][n6] : null) != null) continue;
            this.a(n, n5, n5, -1);
        }
        b = bl;
        if (b) {
            System.gc();
        }
    }

    final void e(int n) {
        if (this.a != null && n < this.a.length) {
            this.a[n] = null;
        }
    }

    final void b(int n, int n2, int n3) {
        int n4 = n3;
        n3 = n2;
        n2 = n;
        d d2 = this;
        if (n3 < 0) {
            new StringBuffer().append("BuildCacheFrames: First frame index is ").append(n3).append(", it can't be negative!");
        }
        if (n2 < 0) {
            new StringBuffer().append("BuildCacheFrames: Palette index is ").append(n2).append(", it can't be negative!");
        }
        if (n2 >= d2.a) {
            new StringBuffer().append("BuildCacheFrames: Palette index is ").append(n2).append(", its out of bounds! Current number of palettes is ").append(d2.a).append(".");
        }
        int n5 = d2.b();
        if (n4 == -1 || n4 >= n5) {
            n4 = n5 - 1;
        }
        if (d2.a == null) {
            d2.a = new j[d2.a][][];
        }
        if (d2.a[n2] == null) {
            d2.a[n2] = new j[1][];
        }
        if (0 >= d2.a[n2].length) {
            new StringBuffer().append("BuildCacheFrames: module map ").append(-1).append(" was not loaded the first time that was cached a frame for this sprite");
        }
        if (d2.a[n2][0] == null) {
            d2.a[n2][0] = new j[n5];
        }
        while (n3 <= n4) {
            j j2;
            j[] jArray = d2.a[n2][0];
            int n6 = n3;
            d d3 = d2;
            int n7 = d3.d(n6);
            int n8 = d3.e(n6);
            if ((f.aa & 0x2000) != 0) {
                int n9 = f.i();
                int n10 = f.j();
                n7 = n7 * n9 / 100;
                n8 = n8 * n10 / 100;
            }
            if (n7 == 0 || n8 == 0) {
                j2 = null;
            } else {
                int[] nArray = d3.a(n6, n2, null, 2, 0);
                if (nArray == null) {
                    j2 = null;
                } else {
                    int n11 = n8;
                    j2 = j.a(nArray, n7, n11);
                }
            }
            jArray[n3] = j2;
            ++n3;
        }
    }

    private int[] a(int n, int n2, int[] nArray, int n3, int n4) {
        int n5;
        int n6;
        n3 = this.d(n);
        n4 = this.e(n);
        int n7 = this.f(n);
        int n8 = this.g(n);
        n7 = -n7;
        n8 = -n8;
        if ((f.aa & 0x2000) != 0) {
            n6 = f.i();
            n5 = f.j();
            n3 = n3 * n6 / 100;
            n4 = n4 * n5 / 100;
            n7 = n7 * n6 / 100;
            n8 = n8 * n5 / 100;
        }
        n6 = n3 * n4;
        if (n3 == 0 || n4 == 0) {
            return null;
        }
        nArray = new int[n6];
        n5 = this.g;
        this.g = n2;
        j j2 = j.a(n3, n4);
        Graphics graphics = j2.a.getGraphics();
        graphics.setColor(-65281);
        graphics.fillRect(0, 0, n3, n4);
        this.a(graphics, n, n7, n8, 0);
        f.a(j2, nArray, n3, n3, n4);
        n = 0xFF00FF;
        n = f.a.getDisplayColor(n);
        while (n6 > 0) {
            if ((nArray[--n6] & 0xFFFFFF) != n) continue;
            nArray[n6] = 0xFF00FF;
        }
        this.g = n5;
        return nArray;
    }

    final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        n = this.k[n] + n2;
        n2 = this.l[n] & 0xFF;
        int n6 = this.n[n];
        int n7 = this.o[n];
        int n8 = this.p[n] & 0xF;
        if ((n5 & 1) != 0) {
            n8 = h[n8 & 7] | n8 & 0xFFFFFFF8;
            n6 = -n6;
        }
        if ((n5 & 2) != 0) {
            n8 = i[n8 & 7] | n8 & 0xFFFFFFF8;
            n7 = -n7;
        }
        if ((n5 & 4) != 0) {
            n8 = j[n8 & 7] | n8 & 0xFFFFFFF8;
            n = n6;
            n6 = -n7;
            n7 = n;
        }
        if ((f.aa & 0x2000) != 0 && !(f.a[13][5] != 0)) {
            n = f.i();
            n5 = f.j();
            n6 = n * n6 / 100;
            n7 = n5 * n7 / 100;
        }
        this.a(graphics, n2, n3 + n6, n4 + n7, n8);
    }

    final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        this.b(graphics, n, n2, n3, n4);
    }

    final void b(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5 = this.j(n);
        if (n5 > 0) {
            for (int i2 = 0; i2 < n5; ++i2) {
                int n6;
                int n7 = i2;
                Graphics graphics2 = graphics;
                d d2 = this;
                int n8 = d2.d(n, n7);
                n7 = d2.l(n8);
                int n9 = n6 = d2.k(n8);
                int n10 = 0;
                int n11 = 0;
                if ((n7 & 0x10) == 0) {
                    n11 = n6;
                    n10 = d2.a[n9] & 0xFF;
                    n11 = d2.b[n11] & 0xFF;
                }
                int n12 = n10;
                int n13 = n11;
                n9 = 0 + d2.b(n8);
                int n14 = 0 + d2.c(n8);
                if ((n7 & 4) != 0) {
                    n8 = n10;
                    n10 = n11;
                    n11 = n8;
                }
                if ((n4 & 1) != 0) {
                    n7 = h[n7 & 7] | n7 & 0xFFFFFFF8;
                    n9 = -n9 - n10;
                }
                if ((n4 & 2) != 0) {
                    n7 = i[n7 & 7] | n7 & 0xFFFFFFF8;
                    n14 = -n14 - n11;
                }
                if ((n4 & 4) != 0) {
                    n7 = j[n7 & 7] | n7 & 0xFFFFFFF8;
                    n8 = n9;
                    n9 = -n14 - n11;
                    n14 = n8;
                }
                if ((f.aa & 0x2000) != 0 && !(f.a[13][5] != 0)) {
                    n8 = f.i();
                    n11 = f.j();
                    if (f.a[13][6] % f.X != 0) {
                        f.a[16][1] = n10 = -n9;
                        f.a[16][2] = n10 = -n14;
                    }
                    n9 = n8 * n9 / 100;
                    n14 = n11 * n14 / 100;
                }
                n8 = n2 + n9;
                n11 = n3 + n14;
                if ((n7 & 0x10) != 0) {
                    d2.a(graphics2, n6, n8, n11, n7 & 0xF);
                    continue;
                }
                d2.a(graphics2, n6, n8, n11, n7 & 0xF, n12, n13);
            }
        }
    }

    final void c(Graphics graphics, int n, int n2, int n3, int n4) {
        f.n();
        f.p(n4);
        this.a(graphics, n, n2, n3, 0);
        f.o();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    final void a(Graphics var1_1, int var2_4, int var3_9, int var4_12, int var5_15, int var6_16, int var7_17) {
        block44: {
            block45: {
                block46: {
                    block41: {
                        block43: {
                            block42: {
                                d.b[0] = var6_16;
                                d.b[1] = var7_17;
                                var7_18 = d.b;
                                var6_16 = var5_15;
                                var5_15 = var4_12;
                                var4_12 = var3_9;
                                var3_9 = var2_4;
                                var2_5 = var1_1;
                                var1_1 = this;
                                if ((f.aa & 8192) != 0 && f.a[13][5] != 0) {
                                    var8_20 = f.i();
                                    var9_21 = f.j();
                                    var4_12 = var4_12 * var8_20 / 100;
                                    var5_15 = var5_15 * var9_21 / 100;
                                }
                                var8_20 = var7_18[0];
                                var9_21 = var7_18[1];
                                var7_19 = var8_20;
                                var10_22 = var9_21;
                                var11_25 = var7_19;
                                var12_26 = var10_22;
                                if ((var6_16 & 4) != 0) {
                                    var13_27 = var7_19;
                                    var7_19 = var10_22;
                                    var10_22 = var13_27;
                                }
                                var13_28 = var1_1;
                                if ((var13_28.q != null ? var13_28.q[var3_9] : 0) != 0 && var2_5 != null) {
                                    if ((f.aa & 8192) != 0) {
                                        var13_29 = f.i();
                                        var14_33 = f.j();
                                        var7_19 = var7_19 * var13_29 / 100;
                                        var10_22 = var10_22 * var14_33 / 100;
                                    }
                                    v0 = var7_19;
                                    var9_21 = var5_15;
                                    var8_20 = var4_12;
                                    var7_19 = var10_22;
                                    var5_15 = v0;
                                    var10_22 = var1_1.k[var3_9];
                                    var2_5.setColor(var10_22);
                                    switch (var1_1.q[var3_9]) {
                                        case 2: {
                                            if ((var10_22 & -16777216) == -16777216 || (var10_22 & -16777216) == 0) {
                                                f.c(var2_5, var8_20, var9_21, var5_15, var7_19);
                                                return;
                                            }
                                            return;
                                        }
                                        case 1: {
                                            return;
                                        }
                                        case 3: 
                                        case 4: {
                                            var4_13 = var1_1;
                                            if (var4_13.c != null) {
                                                for (var10_22 = 0; var10_22 < var4_13.c.length; var10_22 += 2) {
                                                    if (var4_13.c[var10_22] != var3_9) continue;
                                                    v1 = var4_13.c[var10_22 + 1];
                                                    break;
                                                }
                                            } else {
                                                v1 = var3_9 = -1;
                                            }
                                            if (v1 == -1) break;
                                            var4_14 = var1_1.b[var3_9];
                                            var1_2 = var1_1.b[var3_9 + 1];
                                            if ((var6_16 & 1) != 0) {
                                                var4_14 = 90 - var4_14;
                                            }
                                            if ((var6_16 & 2) != 0) {
                                                var4_14 = -var4_14;
                                                var1_2 = -var1_2;
                                            }
                                            if ((var6_16 & 4) != 0) {
                                                var4_14 -= 90;
                                            }
                                            var2_6 = var1_2;
                                            var1_2 = var4_14;
                                            f.a(var2_5, var8_20, var9_21, var5_15, var7_19, var1_2, var2_6);
                                        }
                                    }
                                    return;
                                }
                                if ((f.aa & 8192) != 0 && f.a[13][6] % 360 != 0) {
                                    v2 = var13_30 = (f.aa & 8192) != 0 != false ? f.a[13][6] : f.a[16][0];
                                    if ((var6_16 & 4) != 0) {
                                        var6_16 &= -5;
                                        var13_30 += 90 * f.Y / 360;
                                    }
                                    var14_34 = var13_30;
                                    var14_34 = f.d(f.Z - var14_34);
                                    var15_36 = f.d(var13_30);
                                    f.b(var14_34, var15_36, var7_19, var10_22, d.b);
                                    var15_36 = d.b[0];
                                    var14_34 = d.b[1];
                                    var16_37 = f.a[16][1];
                                    var17_39 = f.a[16][2];
                                    if ((f.aa & 8192) != 0) {
                                        var16_37 = var16_37 * f.i() / 100;
                                        var17_39 = var17_39 * f.j() / 100;
                                        var7_19 = var7_19 * f.i() / 100;
                                        var10_22 = var10_22 * f.j() / 100;
                                        var15_36 = var15_36 * f.i() / 100;
                                        var14_34 = var14_34 * f.i() / 100;
                                    }
                                    var20_40 = d.b;
                                    var19_42 = (var10_22 >> 1) - var17_39;
                                    var18_43 = (var7_19 >> 1) - var16_37;
                                    var21_44 = var13_30;
                                    var21_44 = f.d(f.Z - var21_44);
                                    var13_30 = f.d(var13_30);
                                    f.a(var21_44, var13_30, var18_43, var19_42, var20_40);
                                    var4_12 += d.b[0] - var15_36 / 2 + var16_37;
                                    var5_15 += d.b[1] - var14_34 / 2 + var17_39;
                                }
                                if (var7_19 <= 0 || var10_22 <= 0) {
                                    return;
                                }
                                if (!(var2_5 != null)) break block41;
                                var17_39 = var10_22;
                                var16_37 = var7_19;
                                var15_36 = var5_15;
                                var14_34 = var4_12;
                                var13_31 = var2_5;
                                var18_43 = f.a(var13_31);
                                var19_42 = f.b(var13_31);
                                var20_41 = f.c(var13_31);
                                var13_32 = f.d(var13_31);
                                if (!((f.aa & 8192) != 0)) break block42;
                                var21_44 = f.i();
                                var22_45 = f.j();
                                var16_37 = var16_37 * var21_44 / 100;
                                var17_39 = var17_39 * var22_45 / 100;
                                break block43;
                            }
                            if ((f.aa & 1 << 15) != 0) ** GOTO lbl-1000
                        }
                        if (var14_34 + var16_37 < var18_43 || var15_36 + var17_39 < var19_42 || var14_34 >= var18_43 + var20_41 || var15_36 >= var19_42 + var13_32) {
                            v3 = false;
                        } else lbl-1000:
                        // 2 sources

                        {
                            v3 = true;
                        }
                        if (!v3) break block44;
                    }
                    var14_35 /* !! */  = null;
                    if ((var1_1.f & 0x1000008) == 0) break block44;
                    if (var1_1.a != null && var1_1.a[var1_1.g] != null) {
                        var14_35 /* !! */  = (int[])var1_1.a[var1_1.g][var3_9];
                    }
                    var15_36 = (int)var1_1.a;
                    if (var14_35 /* !! */  != null) break block45;
                    var14_35 /* !! */  = super.a(var3_9);
                    if (var14_35 /* !! */  == null) break block44;
                    var17_39 = 0;
                    if (!f.n || (f.aa & 1046496) == 0) break block46;
                    if ((var14_35 /* !! */  = f.a(var2_5, var14_35 /* !! */ , var4_12, var5_15, var11_25, var12_26, var6_16, (boolean)var15_36, false, true)) == null) break block44;
                    var15_36 = (int)f.o;
                    var6_16 = 0;
                    var4_12 = f.ab;
                    var5_15 = f.ac;
                    var7_19 = f.ad;
                    var10_22 = f.ae;
                    var11_25 = var7_19;
                    var12_26 = var10_22;
                    f.a(var2_5, var14_35 /* !! */ , 0, var11_25, var4_12, var5_15, var11_25, var12_26, (boolean)var15_36, (boolean)var15_36, 0, -1, false);
                    var17_39 = 1;
                }
                if (var1_1.m >= 0) {
                    if (var1_1.a == null) {
                        var1_1.a = new j[var1_1.a][];
                        for (var8_20 = 0; var8_20 < var1_1.a; ++var8_20) {
                            var1_1.a[var8_20] = new j[var1_1.e];
                        }
                    }
                    if ((var6_16 & 4) != 0) {
                        var11_25 = var7_19;
                        var14_35 /* !! */  = (int[])j.a(var14_35 /* !! */ , var10_22, var11_25);
                    } else {
                        var11_25 = var10_22;
                        var14_35 /* !! */  = (int[])j.a(var14_35 /* !! */ , var7_19, var11_25);
                    }
                    super.a(var3_9, var14_35 /* !! */ );
                    if (var17_39 == 0) {
                        if (var14_35 /* !! */  != null) {
                            if (d.g[var6_16 & 7] == 0) {
                                f.a(var2_5, (j)var14_35 /* !! */ , var4_12, var5_15);
                                return;
                            }
                            if ((var6_16 & 4) != 0) {
                                f.a(var2_5, (j)var14_35 /* !! */ , var10_22, var7_19, d.g[var6_16 & 7], var4_12, var5_15);
                                return;
                            }
                            f.a(var2_5, (j)var14_35 /* !! */ , var7_19, var10_22, d.g[var6_16 & 7], var4_12, var5_15);
                        }
                        return;
                    }
                } else if (var17_39 == 0) {
                    v4 = var11_25;
                    v5 = var11_25;
                    var11_25 = var6_16;
                    var10_22 = var15_36;
                    var9_21 = var15_36;
                    var8_20 = var12_26;
                    var7_19 = v5;
                    var6_16 = var5_15;
                    var5_15 = var4_12;
                    var4_12 = v4;
                    v6 = var5_15;
                    v7 = var6_16;
                    v8 = var7_19;
                    v9 = var8_20;
                    v10 = var9_21;
                    var9_21 = var11_25;
                    var8_20 = var10_22;
                    var7_19 = v10;
                    var6_16 = v9;
                    var5_15 = v8;
                    var2_7 = v7;
                    var1_3 = v6;
                    var4_12 = v4;
                    f.a(var2_5, var14_35 /* !! */ , 0, var4_12, var1_3, var2_7, var5_15, var6_16, (boolean)var7_19, (boolean)var8_20, var9_21, -1, true);
                    return;
                }
                break block44;
            }
            if (f.n && (f.aa & 1046496) != 0) {
                var9_21 = var15_36;
                var8_20 = var6_16;
                var7_19 = var12_26;
                var6_16 = var11_25;
                var3_10 = var14_35 /* !! */ ;
                var1_1 = var2_5;
                var10_23 = d.a(null);
                f.a((j)var3_10, var10_23, var6_16, var6_16, var7_19);
                var16_38 = f.a((Graphics)var1_1, var10_23, var4_12, var5_15, var6_16, var7_19, var8_20, (boolean)var9_21, false, true);
                if (var16_38 != null) {
                    var15_36 = (int)f.o;
                    var4_12 = f.ab;
                    var5_15 = f.ac;
                    var7_19 = f.ad;
                    var10_24 = f.ae;
                    var11_25 = var7_19;
                    var12_26 = var10_24;
                    v11 = var11_25;
                    var9_21 = var15_36;
                    var8_20 = var12_26;
                    var7_19 = var11_25;
                    var6_16 = var5_15;
                    var5_15 = var4_12;
                    var4_12 = v11;
                    var4_12 = v11;
                    v12 = var5_15;
                    v13 = var6_16;
                    v14 = var7_19;
                    var7_19 = var9_21;
                    var6_16 = var8_20;
                    var5_15 = v14;
                    var4_12 = v13;
                    var3_11 = v12;
                    var2_8 = v11;
                    f.a(var2_5, var16_38, 0, var2_8, var3_11, var4_12, var5_15, var6_16, (boolean)var7_19, true, 0, -1, true);
                    return;
                }
            } else {
                var7_19 = var8_20;
                var10_22 = var9_21;
                super.a(var3_9, var14_35 /* !! */ );
                if (var14_35 /* !! */  != null) {
                    if (d.g[var6_16 & 7] == 0) {
                        f.a(var2_5, (j)var14_35 /* !! */ , var4_12, var5_15);
                        return;
                    }
                    f.a(var2_5, (j)var14_35 /* !! */ , var7_19, var10_22, d.g[var6_16 & 7], var4_12, var5_15);
                }
            }
        }
    }

    static final int[] a(int[] nArray, int n, int n2, int n3, int[] nArray2) {
        if ((n3 & 7) == 0) {
            return nArray;
        }
        nArray2 = d.a(nArray);
        if (nArray2.length < n * n2) {
            new StringBuffer().append("TransformRGB ERROR: The output buffer specified is not big enough (").append(n).append(" x ").append(n2).append(" = ").append(n * n2).append(" > ").append(nArray2.length).append(")! (increase GLLibConfig.TMP_BUFFER_SIZE)");
        }
        int n4 = 0;
        int n5 = 0;
        switch (n3 & 7) {
            case 1: {
                n4 = n * n2;
                n5 = n * (n2 - 1);
                int n6 = n2;
                while (--n6 >= 0) {
                    n3 = n;
                    while (--n3 >= 0) {
                        nArray2[--n4] = nArray[n5++];
                    }
                    n5 -= n << 1;
                }
                break;
            }
            case 2: {
                n4 = (n2 - 1) * n;
                int n7 = n2;
                while (--n7 >= 0) {
                    System.arraycopy(nArray, n5, nArray2, n4, n);
                    n4 -= n;
                    n5 += n;
                }
                break;
            }
            case 3: {
                n5 = n * n2 - 1;
                while (n5 >= 0) {
                    nArray2[n4++] = nArray[n5--];
                }
                break;
            }
            case 4: {
                n4 = n * n2;
                int n8 = n2;
                while (--n8 >= 0) {
                    n5 = n8;
                    n3 = n;
                    while (--n3 >= 0) {
                        nArray2[--n4] = nArray[n5];
                        n5 += n2;
                    }
                }
                break;
            }
            case 5: {
                n4 = n * n2;
                int n9 = n2;
                while (--n9 >= 0) {
                    n5 = n2 - 1 - n9;
                    n3 = n;
                    while (--n3 >= 0) {
                        nArray2[--n4] = nArray[n5];
                        n5 += n2;
                    }
                }
                break;
            }
            case 6: {
                n4 = n * n2;
                int n10 = n4 - 1;
                int n11 = n2;
                while (--n11 >= 0) {
                    n5 = n10--;
                    n3 = n;
                    while (--n3 >= 0) {
                        nArray2[--n4] = nArray[n5];
                        n5 -= n2;
                    }
                }
                break;
            }
            case 7: {
                n4 = n * n2;
                int n12 = n4 - n2;
                int n13 = n2;
                while (--n13 >= 0) {
                    n5 = n12++;
                    n3 = n;
                    while (--n3 >= 0) {
                        nArray2[--n4] = nArray[n5];
                        n5 -= n2;
                    }
                }
                break;
            }
        }
        return nArray2;
    }

    static final int[] b(int[] nArray) {
        return d.a(nArray);
    }

    static {
        b = 240;
        c = 320;
        g = new int[]{0, 2, 1, 3, 5, 7, 4, 6};
        h = new int[]{1, 0, 3, 2, 6, 7, 4, 5};
        i = new int[]{2, 3, 0, 1, 5, 4, 7, 6};
        j = new int[]{4, 5, 6, 7, 3, 2, 1, 0};
        b = new int[4];
        b = true;
        a = (char)124;
        v = -1;
        w = -1;
        x = -1;
    }
}

