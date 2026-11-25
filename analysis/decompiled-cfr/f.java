/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreException
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import wfree.P;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class f
extends Canvas
implements Runnable {
    public static Graphics a = null;
    private static Graphics b = null;
    private static boolean a;
    static int S;
    static long a;
    static int T;
    static int U;
    static Display a;
    private static boolean b;
    static MIDlet a;
    private static int a;
    private long b;
    static int V;
    private static long c;
    static int W;
    private static int b;
    static f a;
    private static String a;
    private static byte[] a;
    private static byte[] b;
    private static int c;
    private static Hashtable a;
    private static Hashtable b;
    private static int d;
    static final int X;
    static Random a;
    private static int[] a;
    private static int[] b;
    static final int Y;
    static final int Z;
    private static int e;
    private static int f;
    private static int g;
    private static InputStream a;
    private static String b;
    private static int h;
    private static int i;
    private static int[] c;
    static String c;
    private static int j;
    private static int k;
    private static int l;
    private static char[] a;
    static String d;
    private static int[] d;
    private static byte[][] a;
    private static int[] e;
    private static int[][] b;
    private static RecordStore a;
    private static int m;
    private static int[] f;
    private static int[][] c;
    static final boolean n;
    static int aa;
    static int[][] a;
    static boolean o;
    private static int n;
    private static int o;
    static int ab;
    static int ac;
    static int ad;
    static int ae;
    private static long d;

    abstract void e();

    public f(Object object, Object object2) {
        a = this;
        S = -1;
        b = true;
        a = (MIDlet)object;
        a = (Display)object2;
        this.a();
        b = new Hashtable();
        a = new Hashtable<Integer, Integer>();
        a.put(new Integer(48), new Integer(6));
        a.put(new Integer(49), new Integer(7));
        a.put(new Integer(50), new Integer(1));
        a.put(new Integer(51), new Integer(9));
        a.put(new Integer(52), new Integer(3));
        a.put(new Integer(53), new Integer(5));
        a.put(new Integer(54), new Integer(4));
        a.put(new Integer(55), new Integer(13));
        a.put(new Integer(56), new Integer(2));
        a.put(new Integer(57), new Integer(15));
        a.put(new Integer(35), new Integer(17));
        a.put(new Integer(42), new Integer(16));
        a.put(new Integer(-6), new Integer(18));
        a.put(new Integer(-7), new Integer(19));
        a.put(new Integer(-8), new Integer(24));
        b.put(new Integer(-5), new Integer(5));
        b.put(new Integer(-1), new Integer(1));
        b.put(new Integer(-2), new Integer(2));
        b.put(new Integer(-3), new Integer(3));
        b.put(new Integer(-4), new Integer(4));
        this.b = c = System.currentTimeMillis();
    }

    protected final void i() {
        if (S >= 0) {
            return;
        }
        T = 240;
        U = 320;
        a = new byte[d];
        b = new byte[d];
        long l2 = System.currentTimeMillis();
        if (a == null) {
            a = new Random(l2);
        } else {
            a.setSeed(l2);
        }
        S = 0;
        new Thread(this).start();
    }

    protected void f() {
        a = null;
        b = null;
        System.gc();
    }

    protected void g() {
        if (!a) {
            a = true;
        }
    }

    public void hideNotify() {
        this.g();
    }

    public void showNotify() {
        f f2 = this;
        if (a) {
            long l2;
            a = l2 = System.currentTimeMillis();
            c = l2;
            f2.b = l2;
            a = false;
            f2.a();
            if (!b) {
                f2.repaint();
            }
            f.j();
        }
    }

    public void sizeChanged(int n, int n2) {
        T = n;
        U = n2;
    }

    private void a() {
        this.setFullScreenMode(true);
        if (a != null && a.getCurrent() != this) {
            a.setCurrent((Displayable)this);
        }
    }

    public void run() {
        try {
            this.a();
            b = false;
            while (S >= 0) {
                f f2 = this;
                if (!a) {
                    f2.repaint();
                    long l2 = System.currentTimeMillis();
                    f2.b = Math.min(f2.b, l2);
                    Thread.sleep(Math.max(1L, (long)a - (l2 - f2.b)));
                    f2.b = System.currentTimeMillis();
                    continue;
                }
                f2.b = Math.min(f2.b, System.currentTimeMillis());
                Thread.sleep(1L);
            }
        }
        catch (Exception exception) {
            S = -1;
        }
        this.f();
        a.notifyDestroyed();
    }

    public void paint(Graphics object) {
        Graphics graphics = object;
        object = this;
        if (a || b) {
            return;
        }
        b = true;
        if (S != -1) {
            for (int i2 = 0; i2 < d; ++i2) {
                f.a[i2] = b[i2];
                if (b[i2] == 0) continue;
                if (b[i2] < 0) {
                    f.b[i2] = 0;
                    continue;
                }
                if (b[i2] >= 126) continue;
                int n = i2;
                b[n] = (byte)(b[n] + 1);
                if (i2 < 18) continue;
                int n2 = i2;
                b[n2] = -b[n2];
            }
            if (c > 0) {
                if (c != Integer.MAX_VALUE) {
                    c -= V;
                }
                f.j();
            }
        }
        if ((V = (int)((a = System.currentTimeMillis()) - c)) < 0) {
            V = 0;
        }
        if (V > 1000) {
            V = 1000;
        }
        c = a;
        W += V;
        ++b;
        try {
            a = b = graphics;
            ((f)object).e();
        }
        catch (Exception exception) {
            S = -1;
        }
        if (Runtime.getRuntime().freeMemory() < (long)10240) {
            System.gc();
        }
        b = false;
    }

    static final void a(String string) {
        a = string;
        if (a != null) {
            try {
                P.pr(a, a);
            }
            catch (Exception exception) {}
        }
        S = -1;
        a.notifyDestroyed();
    }

    protected void keyPressed(int n) {
        n = f.a(n);
        if (b == null) {
            return;
        }
        if (b[n] > 0) {
            return;
        }
        if (b[n] < 0) {
            f.b[n] = 0;
        }
        if (b[n] < 126) {
            int n2 = n;
            b[n2] = (byte)(b[n2] + 1);
        }
    }

    protected void keyReleased(int n) {
        n = f.a(n);
        if (b == null) {
            return;
        }
        if (b[n] > 0) {
            int n2 = n;
            b[n2] = -b[n2];
        }
    }

    public static void b(boolean bl, int n, int n2) {
        Hashtable hashtable = a;
        Integer n3 = new Integer(n);
        if ((Integer)hashtable.get(n3) != null) {
            hashtable.remove(n3);
        }
        hashtable.put(n3, new Integer(n2));
    }

    private static byte a(int n) {
        Integer n2 = new Integer(n);
        if (a == null) {
            return 0;
        }
        Integer n3 = (Integer)a.get(n2);
        if (n3 != null) {
            return n3.byteValue();
        }
        n3 = (Integer)b.get(n2);
        if (n3 != null) {
            return n3.byteValue();
        }
        return 0;
    }

    public static void j() {
        if (a != null && b != null) {
            for (int i2 = 0; i2 < d; ++i2) {
                f.a[i2] = 0;
                f.b[i2] = 0;
            }
        }
    }

    public static boolean h(int n) {
        return a[n] > 0;
    }

    public static int g() {
        int n = d;
        while (--n >= 0) {
            if (a[n] != 1) continue;
            return n;
        }
        return -1;
    }

    public static int h() {
        int n = d;
        while (--n >= 0) {
            if (a[n] >= 0) continue;
            return n;
        }
        return -1;
    }

    public static boolean i(int n) {
        return a[n] == 1;
    }

    static void b(String string) {
        f.e(string);
        a = (int[])f.a(1);
        b = (int[])f.a(0);
        f.k();
    }

    static int c(int n, int n2) {
        if (n2 != n) {
            int n3 = a.nextInt();
            if (n3 < 0) {
                n3 = -n3;
            }
            return n + n3 % (n2 - n);
        }
        return n2;
    }

    static int d(int n) {
        if (n < 0) {
            n = -n;
        }
        if ((n &= g - 1) <= Z) {
            return a[n];
        }
        if (n < e) {
            n = e - n;
            return -a[n];
        }
        if (n <= f) {
            return -a[n -= e];
        }
        n = g - n;
        return a[n];
    }

    static int e(int n) {
        if (n >= 65536) {
            if (n >= 0x1000000) {
                if (n >= 0x10000000) {
                    if (n >= 0x40000000) {
                        return b[n >> 24] << 8;
                    }
                    return b[n >> 22] << 7;
                }
                if (n >= 0x4000000) {
                    return b[n >> 20] << 6;
                }
                return b[n >> 18] << 5;
            }
            if (n >= 0x100000) {
                if (n >= 0x400000) {
                    return b[n >> 16] << 4;
                }
                return b[n >> 14] << 3;
            }
            if (n >= 262144) {
                return b[n >> 12] << 2;
            }
            return b[n >> 10] << 1;
        }
        if (n >= 256) {
            if (n >= 4096) {
                if (n >= 16384) {
                    return b[n >> 8];
                }
                return b[n >> 6] >> 1;
            }
            if (n >= 1024) {
                return b[n >> 4] >> 2;
            }
            return b[n >> 2] >> 3;
        }
        if (n >= 0) {
            return b[n] >> 4;
        }
        return 0;
    }

    private static void e(String string) {
        if (a != null && string != null && string.compareTo(b) == 0) {
            return;
        }
        j = 1;
        f.a(string, 0, null, 0);
    }

    private static InputStream a(String string, int n, byte[] object, int n2) {
        c = string;
        if (a != null) {
            if (string != null && string.compareTo(b) == 0) {
                if (h == n) {
                    return a;
                }
                f.b();
            } else {
                f.c();
            }
        }
        if (a == null) {
            try {
                if (n > 0) {
                    string = string + "." + n;
                }
                object = string;
                InputStream inputStream = null;
                if (j == 3) {
                    inputStream = new ByteArrayInputStream(null, 0, (null).length);
                } else if (j != 2 && j == 1) {
                    inputStream = "".getClass().getResourceAsStream((String)object);
                }
                object = inputStream;
                h = n;
                ((InputStream)object).markSupported();
                if (n == 0) {
                    b = string;
                    i = ((InputStream)object).available();
                    int n3 = (((InputStream)object).read() & 0xFF) + ((((InputStream)object).read() & 0xFF) << 8);
                    ((InputStream)object).available();
                    c = new int[n3];
                    for (int i2 = 0; i2 < n3; ++i2) {
                        f.c[i2] = n = (((InputStream)object).read() & 0xFF) + ((((InputStream)object).read() & 0xFF) << 8) + ((((InputStream)object).read() & 0xFF) << 16) + ((((InputStream)object).read() & 0xFF) << 24);
                    }
                    k = c[0];
                } else {
                    k = 0;
                }
                a = object;
            }
            catch (Throwable throwable) {}
        }
        return a;
    }

    private static void b() {
        try {
            if (a != null) {
                try {
                    a.close();
                }
                catch (Throwable throwable) {}
                a = null;
            }
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    private static void c() {
        f.b();
        b = null;
        c = null;
    }

    private static int a(int n) {
        int n2 = c[n];
        n = c[n + 1] - n2 - 1;
        int n3 = 0;
        try {
            while (n2 > i) {
                n2 -= i;
                ++n3;
            }
            InputStream inputStream = f.a(b, n3, null, 0);
            inputStream.available();
            if (k > n2) {
                f.b();
                inputStream = f.a(b, n3, null, 0);
            }
            inputStream.skip(n2 - k);
            inputStream.read();
            k = n2 + 1;
        }
        catch (Throwable throwable) {}
        return n;
    }

    private static byte[] a(String string, int n, boolean bl) {
        byte[] byArray = null;
        f.e(string);
        try {
            n = f.a(n);
            InputStream inputStream = a;
            int n2 = inputStream.available();
            int n3 = 0;
            byArray = new byte[n];
            while (n > 0) {
                int n4 = f.a(inputStream, byArray, n3, Math.min(n, n2));
                n3 += n4;
                k += n4;
                if ((n -= n4) != 0 && n4 != -1) {
                    inputStream = f.a(string, h + 1, null, 0);
                    n2 = inputStream.available();
                    continue;
                }
                break;
            }
        }
        catch (Throwable throwable) {}
        return byArray;
    }

    private static int a(InputStream inputStream, byte[] byArray, int n, int n2) {
        try {
            return inputStream.read(byArray, n, n2);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    static final void c(String string) {
        f.e(string);
    }

    static final void k() {
        f.c();
        c = null;
        System.gc();
    }

    static final byte[] a(int n) {
        return f.a(b, n, false);
    }

    static final Object a(int n) {
        return f.a(new ByteArrayInputStream(f.a(n)));
    }

    static final int a(Graphics graphics) {
        return graphics.getClipX();
    }

    static final int b(Graphics graphics) {
        return graphics.getClipY();
    }

    static final int c(Graphics graphics) {
        return graphics.getClipWidth();
    }

    static final int d(Graphics graphics) {
        return graphics.getClipHeight();
    }

    static final void a(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.clipRect(n, n2, n3, n4);
    }

    static final void b(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.setClip(n, n2, n3, n4);
    }

    static final void c(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.fillRect(n, n2, n3, n4);
    }

    static final void d(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawRect(n, n2, n3, n4);
    }

    static final void a(Graphics graphics, int n, int n2, int n3, int n4, int n5, int n6) {
        graphics.fillArc(n, n2, n3, n4, n5, n6);
    }

    static final void a(String string, int n, int n2, int n3) {
        try {
            a.drawString(string, n, n2, 33);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static final void a(Graphics graphics, j j2, int n, int n2) {
        try {
            graphics.drawImage(j2.a, n, n2, 20);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static final void a(Graphics graphics, j j2, int n, int n2, int n3, int n4, int n5) {
        if (n >= j2.a.getWidth()) {
            n += j2.a.getWidth() - n;
        }
        if (n2 >= j2.a.getHeight()) {
            n2 += j2.a.getHeight() - n2;
        }
        if (n2 <= 0 || n <= 0) {
            return;
        }
        try {
            graphics.drawRegion(j2.a, 0, 0, n, n2, n3, n4, n5, 20);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    static final void a(Graphics graphics, int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, int n7, int n8, boolean bl3) {
        void var10_14;
        if (var10_14 != false) {
            int n9;
            boolean bl4 = false;
            if ((var10_14 & 4) != 0) {
                n9 = n5;
                n5 = n6;
                n6 = n2;
                n2 = n5;
            }
            int n10 = n6;
            nArray = d.a(nArray, n5, n10, (int)var10_14, null);
            if ((var10_14 & 4) != 0) {
                n6 = n9;
            }
        }
        if (graphics == b) {
            int n11 = n2;
            boolean bl5 = bl;
            int n12 = n6;
            n6 = n5;
            n5 = n4;
            n4 = n3;
            n3 = 0 / n2;
            n2 = 0 % n2;
            n = n11;
            f.a(graphics, T, U, nArray, n, n2, n3, n4, n5, n6, n12, bl5);
            return;
        }
        f.a(graphics, graphics.getClipX() + graphics.getClipWidth(), graphics.getClipY() + graphics.getClipHeight(), nArray, n2, 0 % n2, 0 / n2, n3, n4, n5, n6, bl);
    }

    private static void a(Graphics graphics, int n, int n2, int[] nArray, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl) {
        int n10 = graphics.getTranslateX();
        int n11 = graphics.getTranslateY();
        graphics.translate(-n10, -n11);
        n4 += n5 * n3;
        if ((n6 += n10) >= n || n6 + n8 <= 0 || (n7 += n11) >= n2 || n7 + n9 <= 0) {
            return;
        }
        n5 = a.getClipX();
        int n12 = a.getClipY();
        int n13 = a.getClipWidth();
        int n14 = a.getClipHeight();
        if (n5 >= n || n5 + n13 <= 0 || n12 >= n2 || n12 + n14 <= 0) {
            return;
        }
        if (n6 <= 0) {
            n4 -= n6;
            n8 += n6;
            n6 = 0;
        }
        if (n6 + n8 >= n) {
            n8 = n - n6;
        }
        if (n7 + n9 >= n2) {
            n9 = n2 - n7;
        }
        if (n7 <= 0) {
            n4 -= n7 * n3;
            n9 += n7;
            n7 = 0;
        }
        graphics.drawRGB(nArray, n4, n3, n6, n7, n8, n9, bl);
        graphics.translate(n10, n11);
    }

    static final void a(j j2, int[] nArray, int n, int n2, int n3) {
        j2.a(nArray, 0, n, 0, 0, n2, n3);
    }

    static int a(byte[] byArray, int n, byte by) {
        byArray[n++] = by;
        return n;
    }

    static int a(byte[] byArray, int n, short s) {
        byArray[n++] = (byte)s;
        byArray[n++] = (byte)(s >>> 8);
        return n;
    }

    static int a(byte[] byArray, int n, int n2) {
        byArray[n++] = (byte)n2;
        byArray[n++] = (byte)(n2 >>> 8);
        byArray[n++] = (byte)(n2 >>> 16);
        byArray[n++] = n2 >> 24;
        return n;
    }

    static int a(byte[] byArray, int n, long l2) {
        byArray[n++] = (byte)(l2 & 0xFFL);
        byArray[n++] = (byte)(l2 >>> 8 & 0xFFL);
        byArray[n++] = (byte)(l2 >>> 16 & 0xFFL);
        byArray[n++] = (byte)(l2 >>> 24 & 0xFFL);
        byArray[n++] = (byte)(l2 >>> 32 & 0xFFL);
        byArray[n++] = (byte)(l2 >>> 40 & 0xFFL);
        byArray[n++] = (byte)(l2 >>> 48 & 0xFFL);
        byArray[n++] = (byte)(l2 >>> 56 & 0xFFL);
        return n;
    }

    static byte a(byte[] byArray, int n) {
        return byArray[n];
    }

    static short a(byte[] byArray, int n) {
        return (short)(byArray[n++] & 0xFF | (byArray[n] & 0xFF) << 8);
    }

    static int a(byte[] byArray, int n) {
        return byArray[n++] & 0xFF | (byArray[n++] & 0xFF) << 8 | (byArray[n++] & 0xFF) << 16 | (byArray[n] & 0xFF) << 24;
    }

    static long a(byte[] byArray, int n) {
        return (long)(byArray[n++] & 0xFF) | (long)(byArray[n++] & 0xFF) << 8 | (long)(byArray[n++] & 0xFF) << 16 | (long)(byArray[n++] & 0xFF) << 24 | (long)(byArray[n++] & 0xFF) << 32 | (long)(byArray[n++] & 0xFF) << 40 | (long)(byArray[n++] & 0xFF) << 48 | (long)(byArray[n] & 0xFF) << 56;
    }

    private static Object a(InputStream inputStream) {
        Object[] objectArray = null;
        try {
            int n = f.a(inputStream);
            int n2 = n >> 4;
            int n3 = n & 7;
            n = (n & 8) != 0 ? f.b(inputStream) : f.a(inputStream);
            switch (n3) {
                case 0: {
                    byte[] byArray = new byte[n];
                    for (n2 = 0; n2 < n; ++n2) {
                        byArray[n2] = (byte)f.a(inputStream);
                    }
                    objectArray = byArray;
                    break;
                }
                case 1: {
                    short[] sArray = new short[n];
                    if (n2 == 0) {
                        for (n2 = 0; n2 < n; ++n2) {
                            sArray[n2] = (byte)f.a(inputStream);
                        }
                    } else {
                        for (n2 = 0; n2 < n; ++n2) {
                            sArray[n2] = (short)f.b(inputStream);
                        }
                    }
                    objectArray = sArray;
                    break;
                }
                case 2: {
                    int[] nArray = new int[n];
                    if (n2 == 0) {
                        for (n2 = 0; n2 < n; ++n2) {
                            nArray[n2] = (byte)f.a(inputStream);
                        }
                    } else if (n2 == 1) {
                        for (n2 = 0; n2 < n; ++n2) {
                            nArray[n2] = (short)f.b(inputStream);
                        }
                    } else {
                        for (n2 = 0; n2 < n; ++n2) {
                            nArray[n2] = f.c(inputStream);
                        }
                    }
                    objectArray = nArray;
                    break;
                }
                default: {
                    Object[] objectArray2;
                    switch (n3 & 3) {
                        case 0: {
                            if (n2 == 2) {
                                objectArray2 = (Object[])new byte[n][];
                                break;
                            }
                            objectArray2 = (Object[])new byte[n][][];
                            break;
                        }
                        case 1: {
                            if (n2 == 2) {
                                objectArray2 = (Object[])new short[n][];
                                break;
                            }
                            objectArray2 = (Object[])new short[n][][];
                            break;
                        }
                        default: {
                            objectArray2 = n2 == 2 ? (Object[])new int[n][] : (Object[])new int[n][][];
                        }
                    }
                    for (n2 = 0; n2 < n; ++n2) {
                        objectArray2[n2] = f.a(inputStream);
                    }
                    objectArray = objectArray2;
                    break;
                }
            }
        }
        catch (Exception exception) {}
        return objectArray;
    }

    private static int a(InputStream inputStream) {
        int n = inputStream.read();
        if (n >= 0) {
            ++l;
        }
        return n;
    }

    private static int b(InputStream inputStream) {
        return f.a(inputStream) & 0xFF | (f.a(inputStream) & 0xFF) << 8;
    }

    private static int c(InputStream inputStream) {
        return f.a(inputStream) & 0xFF | (f.a(inputStream) & 0xFF) << 8 | ((f.a(inputStream) & 0xFF) << 16 | (f.a(inputStream) & 0xFF) << 24);
    }

    private static int b(InputStream inputStream, byte[] byArray, int n, int n2) {
        n = 0;
        int n3 = n2;
        try {
            while (n3 > 0) {
                int n4 = inputStream.read(byArray, n, n3);
                n3 -= n4;
                n += n4;
            }
        }
        catch (Exception exception) {}
        l += n2;
        return n2;
    }

    private static int[] a(byte[] byArray, boolean n, int[] nArray) {
        int n2;
        int n3 = n2 = (byArray.length & 3) == 0 ? byArray.length >>> 2 : (byArray.length >>> 2) + 1;
        if (n != 0) {
            int[] nArray2 = new int[n2 + 1];
            nArray = nArray2;
            nArray2[n2] = byArray.length;
        } else {
            nArray = new int[n2];
        }
        n2 = byArray.length;
        for (n = 0; n < n2; ++n) {
            int n4 = n >>> 2;
            nArray[n4] = nArray[n4] | (0xFF & byArray[n]) << ((n & 3) << 3);
        }
        return nArray;
    }

    static String a(byte[] byArray) {
        StringBuffer stringBuffer = new StringBuffer(byArray.length << 1);
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            stringBuffer.append(a[byArray[i2] >> 4 & 0xF]);
            stringBuffer.append(a[byArray[i2] & 0xF]);
        }
        return stringBuffer.toString();
    }

    static byte[] a(byte[] objectArray, String object, boolean bl) {
        int n;
        byte[] byArray = null;
        if (!"".equals(object) && object != null) {
            byArray = ((String)object).getBytes();
        }
        object = byArray;
        if (objectArray.length == 0) {
            return objectArray;
        }
        int[] nArray = f.a(objectArray, true, null);
        object = f.a((byte[])object, false, null);
        objectArray = nArray;
        int n2 = nArray.length - 1;
        if (n2 >= 1) {
            if (((Object)object).length < 4) {
                int[] nArray2 = new int[4];
                System.arraycopy(object, 0, nArray2, 0, ((Object)object).length);
                object = nArray2;
            }
            n = objectArray[n2];
            int n3 = -1640531527;
            int n4 = 0;
            int n5 = 6 + 52 / (n2 + 1);
            while (n5-- > 0) {
                byte by;
                int n6;
                int n7 = (n4 += n3) >>> 2 & 3;
                for (n6 = 0; n6 < n2; ++n6) {
                    by = objectArray[n6 + 1];
                    int n8 = n6;
                    int n9 = objectArray[n8] + ((n >>> 5 ^ by << 2) + (by >>> 3 ^ n << 4) ^ (n4 ^ by) + (object[n6 & 3 ^ n7] ^ n));
                    objectArray[n8] = n9;
                    n = n9;
                }
                by = objectArray[0];
                int n10 = n2;
                int n11 = objectArray[n10] + ((n >>> 5 ^ by << 2) + (by >>> 3 ^ n << 4) ^ (n4 ^ by) + (object[n6 & 3 ^ n7] ^ n));
                objectArray[n10] = n11;
                n = n11;
            }
        }
        n = objectArray.length << 2;
        byte[] byArray2 = new byte[n];
        for (int i2 = 0; i2 < n; ++i2) {
            byArray2[i2] = (byte)(objectArray[i2 >>> 2] >>> ((i2 & 3) << 3));
        }
        return byArray2;
    }

    static String a(int n) {
        switch (n) {
            case 0: {
                return "EN";
            }
            case 1: {
                return "DE";
            }
            case 2: {
                return "FR";
            }
            case 3: {
                return "IT";
            }
            case 4: {
                return "ES";
            }
            case 5: {
                return "BR";
            }
            case 6: {
                return "PT";
            }
            case 7: {
                return "JP";
            }
            case 8: {
                return "CN";
            }
            case 9: {
                return "KR";
            }
            case 10: {
                return "RU";
            }
            case 12: {
                return "PL";
            }
            case 11: {
                return "TR";
            }
            case 13: {
                return "CZ";
            }
            case 14: {
                return "NL";
            }
            case 15: {
                return "TH";
            }
            case 16: {
                return "VI";
            }
            case 17: {
                return "AR";
            }
        }
        return null;
    }

    private static int d(InputStream inputStream) {
        int n = 0;
        try {
            n = f.a(inputStream);
            f.e[n] = f.c(inputStream);
            if (e[n] > 1024) {
                f.e[n] = 1024;
            }
            f.b[n] = new int[e[n] + 1];
            for (int i2 = 1; i2 < e[n] + 1; ++i2) {
                f.b[n][i2] = f.c(inputStream);
            }
            f.a[n] = new byte[b[n][e[n]]];
            f.b(inputStream, a[n], 0, a[n].length);
        }
        catch (Exception exception) {}
        return n;
    }

    static void a(String string, int n) {
        int n2;
        f.n(n);
        if (d == null) {
            d = new int[32];
            for (n2 = 0; n2 < 32; ++n2) {
                f.d[n2] = -1;
            }
            a = new byte[32][];
            b = new int[32][];
            e = new int[32];
        }
        f.e(string);
        f.d[n] = n2 = f.d(new ByteArrayInputStream(f.a(n)));
        f.k();
    }

    static String b(int n) {
        int n2 = n >> 10;
        n &= 0x3FF;
        try {
            int n3 = b[n2][n + 1] - b[n2][n];
            if (n3 == 0) {
                return null;
            }
            return new String(a[n2], b[n2][n], n3, d);
        }
        catch (Exception exception) {
            return null;
        }
    }

    static void l() {
        for (int i2 = 0; i2 < 32; ++i2) {
            f.n(i2);
        }
    }

    static void n(int n) {
        if (d != null) {
            int n2 = d[n];
            if (n2 == -1) {
                return;
            }
            f.b[n2] = null;
            f.a[n2] = null;
            f.e[n2] = 0;
            f.d[n] = -1;
        }
    }

    static String a(long l2, int n, String string) {
        if (l2 < 1000L) {
            return "" + l2;
        }
        String string2 = "";
        switch (n) {
            case 0: 
            case 7: 
            case 8: 
            case 9: 
            case 15: 
            case 17: {
                string2 = ",";
                break;
            }
            case 1: 
            case 3: 
            case 5: 
            case 16: {
                string2 = ".";
                break;
            }
            case 12: 
            case 13: {
                string2 = string;
                break;
            }
            case 2: 
            case 4: 
            case 6: 
            case 10: {
                if (l2 < 10000L) break;
                string2 = string;
                break;
            }
            case 11: 
            case 14: {
                if (l2 < 10000L) break;
                string2 = ".";
                break;
            }
            default: {
                return "" + l2;
            }
        }
        String string3 = "";
        long l3 = l2 % 1000L < 0L ? -(l2 % 1000L) : l2 % 1000L;
        l2 /= 1000L;
        while (l3 != 0L || l2 != 0L) {
            string3 = l3 < 10L ? "00" + (l3 < 0L ? -l3 : l3) + string3 : (l3 < 100L ? "0" + (l3 < 0L ? -l3 : l3) + string3 : (l3 < 0L ? -l3 : l3) + string3);
            l3 = l2 % 1000L;
            if ((l2 /= 1000L) != 0L) {
                string3 = string2 + string3;
                continue;
            }
            if (l3 == 0L) continue;
            string3 = l3 + string2 + string3;
            l3 = 0L;
        }
        return string3;
    }

    static String a(String string, String[] stringArray) {
        String string2 = "";
        if (string.indexOf(37) < 0) {
            return string;
        }
        int n = 0;
        int n2 = 0;
        do {
            if ((n2 = string.indexOf(37, n2)) < 0 || n2 == string.length() - 1) {
                string2 = string2 + string.substring(n);
                n2 = -1;
                continue;
            }
            if (string.charAt(n2 + 1) == 's') {
                int n3 = -1;
                if (n2 + 2 < string.length()) {
                    n3 = string.charAt(n2 + 2) - 48;
                }
                if (n3 >= 0 && n3 <= 9) {
                    string2 = string2 + string.substring(n, n2);
                    string2 = string2 + stringArray[n3];
                    n2 = n = n2 + 3;
                    continue;
                }
                ++n2;
                continue;
            }
            ++n2;
        } while (n2 >= 0);
        return string2;
    }

    static boolean j(int n) {
        if (d == null) {
            return false;
        }
        if (n >= 32) {
            return false;
        }
        return d[n] >= 0;
    }

    static String a(String string, String string2, String string3) {
        int n = string.indexOf(string2);
        while (n != -1) {
            string = string.substring(0, n) + string3 + string.substring(n + string2.length());
            n += string3.length();
            n = string.indexOf(string2, n);
        }
        return string;
    }

    private static void d() {
        if (a == null) {
            return;
        }
        try {
            a.closeRecordStore();
        }
        catch (RecordStoreException recordStoreException) {}
        a = null;
    }

    private static void f(String string) {
        a = RecordStore.openRecordStore((String)string, (boolean)true);
    }

    static byte[] a(String string) {
        String string2 = "";
        byte[] byArray = null;
        if (!"".equals(string2)) {
            byArray = string2.getBytes();
        }
        return f.a(string, byArray);
    }

    private static byte[] a(String string, byte[] byArray) {
        byArray = null;
        try {
            f.f(string);
            if (a.getNumRecords() > 0) {
                byArray = a.getRecord(1);
            }
        }
        catch (RecordStoreException recordStoreException) {
            byArray = null;
        }
        f.d();
        return byArray;
    }

    static void a(String string, byte[] byArray) {
        f.a(string, byArray, byArray.length);
    }

    static void a(String string, byte[] byArray, int n) {
        f.f(string);
        if (a.getNumRecords() > 0) {
            a.setRecord(1, byArray, 0, n);
        } else {
            a.addRecord(byArray, 0, n);
        }
        f.d();
    }

    static void o(int n) {
        int n2;
        int n3;
        int n4;
        block5: {
            if (f == null) {
                f = new int[1];
                c = new int[1][];
            }
            for (n4 = 0; n4 < f.length; ++n4) {
                if (f[n4] != n) continue;
                n3 = n4;
                break block5;
            }
            n3 = n2 = -1;
        }
        if (n3 == -1 || c == null) {
            ++m;
            n2 = 0;
            f.f[0] = n;
            if (c[0] == null) {
                f.c[0] = new int[256];
            }
            n4 = 256;
            while (n4 > 0) {
                f.c[0][--n4] = n;
            }
        }
        m = n2;
    }

    static void e(Graphics graphics, int n, int n2, int n3, int n4) {
        int n5 = graphics.getClipX();
        int n6 = graphics.getClipY();
        int n7 = graphics.getClipWidth();
        int n8 = graphics.getClipHeight();
        int n9 = n > n5 ? n : n5;
        int n10 = n2 > n6 ? n2 : n6;
        n3 = (n + n3 < n5 + n7 ? n + n3 : n5 + n7) - n9;
        n4 = (n2 + n4 < n6 + n8 ? n2 + n4 : n6 + n8) - n10;
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        int n11 = n4;
        int n12 = n3;
        n = n10;
        f.b(graphics, n9, n, n12, n11);
        if (n3 * n4 < 256) {
            int n13 = n3;
            int n14 = n9;
            int n15 = n10;
            n = n4;
            n10 = n3;
            n9 = n15;
            n4 = n14;
            n3 = n13;
            n3 = n13;
            n3 = n13;
            f.a(graphics, c[m], 0, n3, n4, n9, n10, n, true, true, 0, -1, true);
        } else {
            n3 += n9;
            n4 += n10;
            for (n = n9; n < n3; n += 16) {
                for (n2 = n10; n2 < n4; n2 += 16) {
                    int n16 = n;
                    n11 = n2;
                    n12 = n16;
                    n12 = n16;
                    n12 = n16;
                    f.a(graphics, c[m], 0, 16, n12, n11, 16, 16, true, true, 0, -1, true);
                }
            }
        }
        f.b(graphics, n5, n6, n7, n8);
    }

    private static final void a(Graphics graphics, int[] nArray, int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        int n7 = n2;
        int n8 = n3;
        int n9 = n4;
        int n10 = n5;
        int n11 = n6;
        n6 = bl ? 1 : 0;
        n5 = n11;
        n4 = n10;
        n3 = n9;
        n2 = n8;
        n = n7;
        f.a(graphics, nArray, 0, n, n2, n3, n4, n5, n6 != 0, true, 0, -1, true);
    }

    static final void m() {
        aa = 0;
        int[][] nArrayArray = new int[20][];
        a = nArrayArray;
        nArrayArray[13] = new int[7];
        f.a[13][1] = 100;
        f.a[13][2] = -1;
        f.a[13][0] = -1;
        f.a[13][3] = 100;
        f.a[13][4] = 100;
        f.a[13][5] = 0;
        f.a[13][6] = 0;
    }

    static final void n() {
        aa |= 0x2000;
    }

    static final void o() {
        aa &= 0xFFFFDFFF;
    }

    static final int i() {
        int n = a[13][1];
        if (n != 100) {
            return n;
        }
        return a[13][3];
    }

    static final int j() {
        int n = a[13][1];
        if (n != 100) {
            return n;
        }
        return a[13][4];
    }

    static final void p(int n) {
        f.a[13][1] = n;
        f.a[13][3] = n;
        f.a[13][4] = n;
    }

    static final void b(boolean bl) {
        bl = bl;
        f.a[13][5] = bl ? 1 : 0;
    }

    static final void a(int n, int n2, int n3, int n4, int[] nArray) {
        nArray[0] = n3 * n2 - n4 * n + 128 >> 8;
        nArray[1] = n4 * n2 + n3 * n + 128 >> 8;
    }

    static final void b(int n, int n2, int n3, int n4, int[] nArray) {
        f.a(n, n2, 0, n4, d.b);
        int n5 = d.b[0];
        int n6 = d.b[1];
        f.a(n, n2, n3, n4, d.b);
        n4 = d.b[0];
        int n7 = d.b[1];
        f.a(n, n2, n3, 0, d.b);
        n = d.b[0];
        n2 = d.b[1];
        nArray[0] = Math.max(Math.abs(n4), Math.abs(n - n5));
        nArray[1] = Math.max(Math.abs(n7), Math.abs(n2 - n6));
    }

    static final int[] a(Graphics graphics, int[] object, int n, int n2, int n3, int n4, int n5, boolean n6, boolean n7, boolean bl) {
        int n8;
        o = n6;
        f.n = n3;
        o = n4;
        ab = n;
        ac = n2;
        if ((aa & 0x5600) != 0) {
            if ((n5 & 4) != 0) {
                f.n = n4;
                o = n3;
                n3 = f.n;
                n4 = o;
            }
            n8 = n4;
            object = d.a(object, n3, n8, n5, null);
        }
        ad = n3;
        ae = n4;
        int[] nArray = d.b(object);
        if ((aa & 0x2000) != 0) {
            int n9;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            int n20;
            int n21;
            int n22;
            int n23;
            int n24;
            int n25;
            int n26;
            n8 = a[13][0];
            n7 = n8 != 1 && n8 == 2 ? 1 : 0;
            n8 = a[13][6];
            if (n8 % g != 0) {
                n6 = 1;
                int n27 = n3;
                n26 = n5;
                n25 = n8;
                n3 = n4;
                n24 = n27;
                n8 = n2;
                int n28 = n;
                int[] nArray2 = nArray;
                int[] nArray3 = object;
                if ((n5 & 4) != 0) {
                    n26 = n5 & 0xFFFFFFFB;
                    n23 = 90 * Y / 360;
                    n25 += n23;
                }
                if (n26 != 0) {
                    n22 = n26;
                    nArray3 = d.a(nArray3, n24, n3, n22, null);
                    nArray2 = d.b(nArray3);
                }
                n21 = n25;
                n20 = f.d(Z - n21);
                n21 = f.d(n25);
                f.b(n20, n21, n24, n3, d.b);
                n22 = d.b[0];
                n4 = d.b[1];
                int n29 = n22 >> 1;
                n19 = n4 >> 1;
                n23 = n22 - n24 >> 1;
                n18 = n4 - n3 >> 1;
                n17 = n19 * n20;
                n16 = -n19 * n21;
                n25 = n29 * n20;
                n26 = n29 * n21;
                n15 = n29 - n23;
                n14 = n19 - n18;
                n23 = -n26;
                n13 = -n25;
                for (n29 = 0; n29 < n22; ++n29) {
                    n12 = n23 - n17;
                    n11 = n16 - n13;
                    n10 = n29;
                    for (n9 = 0; n9 < n4; ++n9) {
                        n25 = n15 + (n12 + 128 >> 8);
                        n26 = n14 + (n11 + 128 >> 8);
                        n12 += n20;
                        n11 += n21;
                        nArray2[n10] = n25 >= 0 && n26 >= 0 && n25 < n24 && n26 < n3 ? nArray3[n26 * n24 + n25] : 0;
                        n10 += n22;
                    }
                    n23 += n21;
                    n13 += n20;
                }
                ab = n28;
                ac = n8;
                ad = n22;
                ae = n4;
                o = true;
                nArray = nArray2;
                object = nArray2;
                nArray = d.b(nArray);
                n = ab;
                n2 = ac;
                n3 = ad;
                n4 = ae;
                n5 &= ~n5;
            }
            n8 = f.i();
            n24 = f.j();
            int n30 = n3;
            n22 = n5;
            n21 = n7;
            n20 = n6;
            n6 = a[13][2];
            n26 = n24;
            n25 = n8;
            n3 = n4;
            n24 = n30;
            n8 = n2;
            int n31 = n;
            int[] nArray4 = nArray;
            int[] nArray5 = object;
            object = graphics;
            n19 = 0;
            n23 = n22 & 0xFFFFFFFE;
            if ((n22 & 4) != 0) {
                n23 = n22;
                n22 = 0;
            }
            if (n23 != 0) {
                if ((n23 & 4) != 0) {
                    f.n = n3;
                    o = n24;
                    n24 = f.n;
                    n3 = o;
                }
                int n32 = n23;
                int n33 = n3;
                nArray5 = d.a(nArray5, n24, n33, n32, null);
                nArray4 = d.b(nArray5);
            }
            n18 = n24 * n25 / 100 + (n24 * n25 % 100 != 0 ? 1 : 0);
            n23 = n3 * n26 / 100 + (n3 * n26 % 100 != 0 ? 1 : 0);
            ad = n18;
            ae = n23;
            if (n18 <= 0 || n23 <= 0) {
                return null;
            }
            n13 = (n24 << 8) / n18;
            n12 = (n3 << 8) / n23;
            n11 = object.getClipX();
            n17 = object.getClipY();
            n16 = object.getClipWidth();
            n25 = object.getClipHeight();
            n26 = n18;
            n15 = 0;
            n14 = n18;
            n10 = 0;
            if (n31 < n11) {
                if ((n18 -= n11 - n31) <= 0) {
                    return null;
                }
                n15 = n11 - n31;
                n31 = n11;
            }
            if (n8 < n17) {
                if ((n23 -= n17 - n8) <= 0) {
                    return null;
                }
                n10 = n17 - n8;
                n8 = n17;
            }
            if (n31 + n18 > n11 + n16) {
                n18 = n11 + n16 - n31;
                if (n18 <= 0) {
                    return null;
                }
                n14 = n15 + n18;
            }
            if (n8 + n23 > n17 + n25 && (n23 = n17 + n25 - n8) <= 0) {
                return null;
            }
            n9 = nArray4.length / n18;
            if (n9 <= 0) {
                return null;
            }
            n11 = n9;
            int n34 = n8;
            if (n6 < 0) {
                n3 = n9 * n18;
                if ((n22 & 1) != 0) {
                    n22 = (n26 - n14) * n13;
                    n7 = n13;
                } else {
                    n22 = (n14 - 1) * n13;
                    n7 = -n13;
                }
                n11 = n23 - n23 / n9 * n9;
                if (n11 == 0) {
                    n11 = n9;
                }
                n13 = n11;
                n19 = n11 * n18;
                n34 = n8 + n23 - n11;
                n4 = n23;
                n21 = (n4 + n10) * n12;
                while (--n4 >= 0) {
                    n26 = (((n21 -= n12) >> 8) * n24 << 8) + n22;
                    n5 = n14;
                    while (--n5 >= n15) {
                        nArray4[--n19] = nArray5[n26 >> 8];
                        n26 += n7;
                    }
                    if (--n11 != 0) continue;
                    if (bl) {
                        f.a((Graphics)object, nArray4, 0, n18, n31, n34, n18, n13, n20 != 0);
                    }
                    n13 = n9;
                    n34 -= n9;
                    n11 = n9;
                    n19 = n3;
                }
            } else {
                if ((n22 & 1) != 0) {
                    n3 = (n26 - n15 - 1) * n13;
                    n22 = -n13;
                } else {
                    n3 = n15 * n13;
                    n22 = n13;
                }
                if (n21 == 0 && n20 == 0) {
                    n6 = (n6 & 0xFF) << 24;
                    n7 = 0;
                    n13 = n10 * n12;
                    while (n7 < n23) {
                        n25 = (n13 >> 8) * n24;
                        n4 = 0;
                        n21 = n3;
                        while (n4 < n18) {
                            n26 = n25 + (n21 >> 8);
                            nArray4[n19++] = n6 | nArray5[n26] & 0xFFFFFF;
                            ++n4;
                            n21 += n22;
                        }
                        if (--n11 == 0) {
                            if (bl) {
                                f.a((Graphics)object, nArray4, 0, n18, n31, n34, n18, n9, true);
                            }
                            n34 += n9;
                            n11 = n9;
                            n19 = 0;
                        }
                        ++n7;
                        n13 += n12;
                    }
                } else if (n21 == 0 && n20 != 0) {
                    n6 = (n6 & 0xFF) << 24;
                    n7 = 0;
                    n13 = n10 * n12;
                    while (n7 < n23) {
                        n25 = (n13 >> 8) * n24;
                        n4 = 0;
                        n21 = n3;
                        while (n4 < n18) {
                            n26 = n25 + (n21 >> 8);
                            n5 = nArray5[n26] & 0xFFFFFF;
                            nArray4[n19++] = n5 != 0xFF00FF && n5 != 0 ? n6 | n5 : 0;
                            ++n4;
                            n21 += n22;
                        }
                        if (--n11 == 0) {
                            if (bl) {
                                f.a((Graphics)object, nArray4, 0, n18, n31, n34, n18, n9, true);
                            }
                            n34 += n9;
                            n11 = n9;
                            n19 = 0;
                        }
                        ++n7;
                        n13 += n12;
                    }
                } else {
                    n7 = 0;
                    n13 = n10 * n12;
                    while (n7 < n23) {
                        n25 = (n13 >> 8) * n24;
                        n4 = 0;
                        n21 = n3;
                        while (n4 < n18) {
                            n26 = n25 + (n21 >> 8);
                            n5 = ((nArray5[n26] >>> 24) * n6 >> 8 & 0xFF & 0xFF) << 24;
                            nArray4[n19++] = n5 | nArray5[n26] & 0xFFFFFF;
                            ++n4;
                            n21 += n22;
                        }
                        if (--n11 == 0) {
                            if (bl) {
                                f.a((Graphics)object, nArray4, 0, n18, n31, n34, n18, n9, true);
                            }
                            n34 += n9;
                            n11 = n9;
                            n19 = 0;
                        }
                        ++n7;
                        n13 += n12;
                    }
                }
                if (bl && n11 != n9) {
                    f.a((Graphics)object, nArray4, 0, n18, n31, n34, n18, n9 - n11, true);
                }
            }
            if (bl) {
                return null;
            }
            return nArray4;
        }
        return null;
    }

    static void a(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        n5 = n4;
        n4 = n3;
        n3 = n2;
        n2 = 0;
        Graphics graphics = a;
        int n8 = n5;
        int n9 = n4;
        n6 = 0;
        int[] nArray = d.a(null);
        int n10 = n4 < nArray.length / n5 ? n4 : nArray.length / n5;
        int n11 = (255 << 16) / --n8;
        int n12 = 0 / n8;
        ++n8;
        n4 = 0;
        n7 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        for (int i2 = 0; i2 < n8; ++i2) {
            int n16 = n10;
            while (--n16 >= 0) {
                nArray[n15] = n6;
                ++n15;
            }
            n6 = (n4 += n11) << 8 & 0xFF000000 | (n7 += n12) & 0xFF0000 | (n13 += n12) >> 8 & 0xFF00 | (n14 += n12) >> 16 & 0xFF;
        }
        while (n9 > 0) {
            int n17 = n10;
            n8 = n10 < n9 ? n10 : n9;
            n4 = n2;
            n7 = n17;
            n15 = n8;
            n7 = n17;
            n8 = n15;
            n7 = n4;
            n6 = n17;
            f.a(graphics, nArray, 0, n6, n7, n3, n8, n5, true, true, 0, -1, true);
            n2 += n10;
            n9 -= n10;
        }
    }

    public void addCommand(Command command) {
        super.addCommand(command);
    }

    protected void pointerReleased(int n, int n2) {
    }

    protected void pointerPressed(int n, int n2) {
    }

    protected void pointerDragged(int n, int n2) {
    }

    static boolean h() {
        return l.a();
    }

    static void d(String string) {
        l.a(string);
    }

    static void a(int n, String string) {
        if (System.currentTimeMillis() - d <= 3000L) {
            return;
        }
        d = System.currentTimeMillis();
        l.a(l.a(n, string), string);
    }

    static void p() {
        if (System.currentTimeMillis() - d <= 3000L) {
            return;
        }
        d = System.currentTimeMillis();
        l.a();
    }

    static int k() {
        return l.a();
    }

    static boolean k(int n) {
        return l.a(n);
    }

    static boolean i() {
        return l.b();
    }

    static int l() {
        return l.c();
    }

    static int m() {
        return l.b();
    }

    static String a(int n, String string) {
        return l.a(l.a(n, string));
    }

    static String a() {
        return l.a();
    }

    static String b() {
        return l.c();
    }

    static void q() {
        l.b();
    }

    static long a(long l2, int n, String string) {
        n = l.a(n, string);
        return l.a(l2, n);
    }

    static int n() {
        return l.d();
    }

    static int a(int n, String string) {
        return l.a(l.a(n, string));
    }

    static int a(String string) {
        return l.a(string);
    }

    static int b(int n, String string) {
        return l.a(n, string);
    }

    static long a(long l2) {
        int n = l.c();
        String string = l.b();
        return f.a(l2, n, string);
    }

    static {
        T = 240;
        U = 320;
        a = 62;
        a = null;
        d = 25;
        X = 256;
        Y = 256;
        Z = 90 * Y / 360;
        e = 180 * Y / 360;
        f = 270 * Y / 360;
        g = 360 * Y / 360;
        l = 0;
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        byte[] byArray = new byte[]{-128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        char[] cArray = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        d = "UTF-8";
        n = true;
        aa = 0;
        a = null;
        char[] cArray2 = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        d = 0L;
    }
}

