/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import wfree.P;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class k
implements Runnable,
CommandListener {
    private static String a = "2.3";
    private static String b = "IGP-Signature=" + a;
    private static String c = "";
    private static String d;
    private static Font a;
    private static String e;
    private static int a;
    private static boolean[] a;
    private static int[] a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static int m;
    private static int n;
    private static int o;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    private static String k;
    private static String l;
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static int z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static int E;
    private static int F;
    private static int G;
    private static int H;
    private static int I;
    private static int J;
    private static int K;
    private static int L;
    private static int M;
    private static int[] b;
    private static int N;
    private static int O;
    private static int P;
    private static int Q;
    private static int R;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;
    private static String s;
    private static String t;
    private static String u;
    private static String v;
    private static String w;
    private static String x;
    private static String y;
    private static String z;
    private static String A;
    private static String B;
    private static String C;
    private static boolean a;
    private static boolean b;
    private static String D;
    private static boolean c;
    private static String[] a;
    private static int S;
    private static String[] b;
    private static short[] a;
    private static String[] c;
    private static String[] d;
    private static int T;
    private static boolean d;
    private static boolean e;
    private static int[][] a;
    private static MIDlet a;
    private static k a;
    private static boolean f;
    private static String E;
    private static boolean g;
    private static int U;
    private static int V;
    private static int W;
    private static int X;
    private static int Y;
    private static int Z;
    private static d[] a;
    private static d a;
    private static int aa;
    private static String[] e;
    private static int[] c;
    private static boolean[] b;
    private static int ab;
    private static int ac;
    private static int ad;
    private static boolean h;
    private static int ae;
    private static int af;
    private static int ag;
    private static int ah;
    private static int ai;
    private static String F;
    private static String G;
    private static String H;
    private static String I;
    private static String J;
    private static String K;
    private static boolean i;
    private static int aj;
    private static int ak;
    private static int al;
    private static int am;

    private static boolean b() {
        k.a();
        try {
            InputStream inputStream = k.a("/dataIGP");
            M = inputStream.read() & 0xFF;
            b = new int[M += (inputStream.read() & 0xFF) << 8];
            int n = 0;
            while (n < M) {
                k.b[n] = inputStream.read() & 0xFF;
                int n2 = n;
                b[n2] = b[n2] + ((inputStream.read() & 0xFF) << 8);
                int n3 = n;
                b[n3] = b[n3] + ((inputStream.read() & 0xFF) << 16);
                int n4 = n++;
                b[n4] = b[n4] + ((inputStream.read() & 0xFF) << 24);
            }
            inputStream.close();
        }
        catch (Exception exception) {
            return false;
        }
        return true;
    }

    private static void a() {
        b = null;
        M = 0;
        System.gc();
    }

    private static byte[] a(int n) {
        if (n < 0 || n >= M - 1) {
            return null;
        }
        int n2 = b[n + 1] - b[n];
        if (n2 == 0) {
            return null;
        }
        byte[] byArray = null;
        try {
            InputStream inputStream = k.a("/dataIGP");
            inputStream.skip(2 + 4 * M + b[n]);
            byArray = new byte[n2];
            for (n = byArray.length; n > 0; n -= inputStream.read(byArray)) {
            }
            inputStream.close();
        }
        catch (Exception exception) {}
        return byArray;
    }

    private static int a(byte[] byArray) {
        return (byArray[N++] & 0xFF) + ((byArray[N++] & 0xFF) << 8);
    }

    private static String a(int n) {
        return "" + b[n];
    }

    private static void a(String string, Graphics graphics, int n, int n2, int n3) {
        k.a(string, graphics, n, n2, n3, 3, 10, false);
    }

    private static void b(String string, Graphics graphics, int n, int n2, int n3) {
        k.a(string, graphics, n, n2, n3, 3, 10, true);
    }

    private static void a(String string, Graphics graphics, int n, int n2, int n3, int n4, int n5, boolean bl) {
        if (bl) {
            a.d(P);
            Object object = a.a(string, n, false);
            String string2 = string;
            short[] sArray = object;
            object = string2;
            a.a(graphics, string2, sArray, n2, n3, 0, 10, 3, -1, false);
            return;
        }
        a.d(P);
        a.a(graphics, string, n2, n3, 3);
    }

    public static void a(MIDlet object, Canvas canvas, int n, int n2) {
        new StringBuffer().append("initialize(midlet = ").append(object).append(", game = ").append(canvas).append(", screenWidth = ").append(n).append(", screenHeight = ").append(n2).append(", cmdListener = ").append((Object)null).append(")");
        aj = n;
        ak = n2;
        al = aj >> 1;
        am = ak >> 1;
        if (2 > aj) {
            a = 2;
        }
        if (a == null && canvas != null) {
            a = object;
            k.b();
            object = b;
            new StringBuffer().append((String)object).append("");
            k.c();
            A = null;
            C = null;
            p = null;
            m = null;
            j = null;
            k = null;
            l = null;
            e = null;
            v = null;
            w = null;
            z = null;
            x = null;
            B = null;
            k.n = null;
            System.gc();
        }
    }

    private static boolean a(String string) {
        if (string == null) {
            return false;
        }
        return (string = string.trim()).length() != 0 && string.toUpperCase().compareTo("DEL") != 0 && string.toUpperCase().compareTo("NO") != 0 && string.toUpperCase().compareTo("0") != 0;
    }

    private static String a(String string, String string2, String string3) {
        String string4 = "";
        try {
            if (string3 != null && string != null && string2 != null) {
                int n = string.indexOf(string2 + "=");
                string3 = string3.trim();
                if (n >= 0 && string3.length() > 0) {
                    int n2 = string.indexOf(B, n += string2.length() + 1);
                    if (n2 < 0) {
                        n2 = string.length();
                    }
                    if ((string4 = string.substring(n, n2).trim()).length() == 0 || string4.compareTo("0") == 0 || string4.toUpperCase().compareTo("NO") == 0) {
                        string4 = "";
                    } else if (string4.toUpperCase().compareTo("DEL") != 0 && string2.compareTo("OP") != 0) {
                        int n3 = string3.indexOf(v);
                        string4 = n3 >= 0 ? string3.substring(0, n3) + string4 + string3.substring(n3 + v.length()) : string3;
                    }
                }
            }
        }
        catch (Exception exception) {
            string4 = "";
        }
        return string4;
    }

    private static void a(int n, String string, int n2, String string2, String string3, int n3) {
        try {
            String string4;
            String string5 = "";
            if (b) {
                string4 = k.a(a.getAppProperty(string2), string, string3);
                if (string.equals(g)) {
                    string2 = o;
                    string5 = k.a(a.getAppProperty(string2), c[n - d.length], string3);
                }
            } else if (string.equals(i)) {
                string4 = I;
            } else {
                string2 = e + "-" + string;
                string4 = a.getAppProperty(string2);
            }
            if (string.equals(g)) {
                if (b) {
                    int n4 = string4.indexOf(g);
                    if (n4 >= 0) {
                        string4 = string4.substring(0, n4) + c[n - d.length] + string4.substring(n4 + c[n - d.length].length());
                    }
                } else {
                    string2 = e + "-" + g + "-" + c[n - d.length];
                    string4 = a.getAppProperty(string2);
                    string2 = e + "-" + g + "-" + c[n - d.length];
                    string5 = a.getAppProperty(string2);
                }
            }
            boolean bl = k.a(string4);
            boolean bl2 = true;
            if (string.equals(g)) {
                bl2 = k.a(string5);
            }
            if (bl && bl2 && (string4.toUpperCase().compareTo("NO") != 0 || string4.toUpperCase().compareTo("0") != 0)) {
                k.b[n] = true;
                k.e[n] = string4;
                if (b[n]) {
                    k.c[n] = n3;
                    switch (n3) {
                        case 4: {
                            ++ab;
                            if (!a) break;
                            int n5 = n;
                            e[n5] = e[n5] + x + z + (ab < 10 ? "0" : "") + ab;
                            return;
                        }
                        case 6: {
                            ++ac;
                            if (!a) break;
                            int n6 = n;
                            e[n6] = e[n6] + x + g;
                            return;
                        }
                        case 7: {
                            if (!a) break;
                            int n7 = n;
                            e[n7] = e[n7] + x + h;
                            return;
                        }
                        case 8: {
                            if (!a) break;
                            int n8 = n;
                            e[n8] = e[n8] + x + i;
                        }
                    }
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static String[] a(byte[] byArray) {
        String[] stringArray = new String[k.a(byArray)];
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            int n = k.a(byArray);
            stringArray[i2] = new String(byArray, N, n);
            N += n;
        }
        return stringArray;
    }

    private static void b() {
        int n;
        Object[] objectArray;
        try {
            if (!k.b()) {
                g = false;
                return;
            }
            objectArray = k.a(0);
            k.a(objectArray);
            int n2 = k.a(objectArray);
            N += n2;
            n2 = k.a(objectArray);
            D = new String((byte[])objectArray, N, n2);
            N += n2;
            n2 = k.a(objectArray);
            N += n2;
            n2 = k.a(objectArray);
            N += n2;
            n2 = k.a(objectArray);
            N += n2;
            c = k.a(objectArray) == 1;
            k.a(objectArray);
            k.a(objectArray);
            a = k.a(objectArray);
            d = k.a(objectArray);
            c = k.a(objectArray);
            k.a(objectArray);
            for (n2 = 0; n2 < a.length; ++n2) {
                k.a[n2] = k.a(objectArray) == 1;
            }
            try {
                n2 = k.a(objectArray);
                c = new String((byte[])objectArray, N, n2);
                new StringBuffer().append("IGP dataIGP version: ").append(c);
                new StringBuffer().append(a).append("z");
                if (!c.startsWith(a)) {
                    new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(c);
                    new StringBuffer().append("IGP Class version : ").append(a);
                }
            }
            catch (Exception exception) {
                g = false;
            }
            k.a();
        }
        catch (Exception exception) {
            g = false;
            return;
        }
        String[] stringArray = c;
        objectArray = d;
        int n3 = (d.length - 1 > 0 ? objectArray.length - 1 : 0) + (stringArray.length - 1 > 0 ? stringArray.length - 1 : 0);
        j = ++n3 + 1;
        g = j + 1;
        h = g + 1;
        k = h + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        l = k + 1;
        m = l + 1;
        k.n = m + 1;
        o = k.n + 1 + 1 + 1 + 1 + 1 + 1;
        i = o + 1;
        S = d.length + c.length + 1 + 1;
        for (n3 = 0; n3 < a.length; ++n3) {
            k.a[n3] = a[n3] ? ++c : --b;
        }
        ++c;
        e = new String[S];
        b = new boolean[S];
        c = new int[S];
        for (n3 = 0; n3 < b.length; ++n3) {
            k.b[n3] = false;
        }
        d = d.length;
        e = d + c.length;
        f = e + 1;
        String string = q;
        s = a.getAppProperty(string);
        string = r;
        t = a.getAppProperty(string);
        if (s != null && t.toLowerCase().equals(u.toLowerCase())) {
            K = s;
            i = true;
            g = true;
            return;
        }
        try {
            string = p;
            C = a.getAppProperty(string);
            if (C != null) {
                C = C.trim();
                b = true;
                if (C.indexOf(A) != -1) {
                    a = true;
                }
            }
        }
        catch (Exception exception) {}
        for (n = 0; n < d.length; ++n) {
            k.a(n, d[n], 7, k.n, C, 4);
        }
        for (n = 0; n < c.length; ++n) {
            k.a(d + n, g, 7, m, C, 6);
        }
        try {
            String string2 = l;
            string2 = a.getAppProperty(string2).trim();
            if (k.a(string2)) {
                I = string2;
            }
        }
        catch (Exception exception) {}
        k.a(e, h, 7, m, C, 7);
        k.a(f, i, 7, m, C, 8);
        String string3 = j;
        F = k.a(a.getAppProperty(string3));
        string3 = k;
        G = k.a(a.getAppProperty(string3));
        aa = k.a();
        if (aa > 0) {
            g = true;
        }
        new StringBuffer().append("isAvailable = ").append(g);
    }

    private static String a(String object) {
        if (object == null) {
            return "0";
        }
        String string = "";
        object = ((String)object).toUpperCase();
        boolean bl = false;
        int n = aj;
        char c2 = (char)ak;
        if (n >= c2 && n == 320) {
            bl = true;
        }
        object = ((String)object).toCharArray();
        for (n = 0; n < ((Object)object).length; ++n) {
            c2 = (char)object[n];
            if (bl && c2 == '\n') continue;
            string = string + c2;
        }
        return string;
    }

    public static boolean a() {
        return g;
    }

    public static void a(String string) {
        new StringBuffer().append("enterIGP(loadingMsg = ").append(string).append(", appLanguage = ").append(0).append(" (").append(a[0]).append(")");
        if (i) {
            k.c();
            f = true;
            E = K;
        } else {
            if (0 < a.length) {
                H = string;
                Y = -1;
                U = 0;
                X = -1;
                W = 0;
                f = true;
                a = Font.getFont((int)0, (int)0, (int)8);
                k.c();
            }
            Z = 4 + S;
            W = k.b();
        }
        string = null;
        try {
            string = RecordStore.openRecordStore((String)"igp19", (boolean)false);
        }
        catch (Exception exception) {
            try {
                string = RecordStore.openRecordStore((String)"igp19", (boolean)true);
            }
            catch (Exception exception2) {}
        }
        try {
            if (string != null) {
                string.closeRecordStore();
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static boolean c() {
        block10: {
            boolean bl = false;
            for (int i2 = 0; i2 < a.length; ++i2) {
                if (!a[i2].equals("SP")) continue;
                bl = true;
            }
            if (!bl) {
                return false;
            }
            try {
                String string = m;
                String string2 = a.getAppProperty(string);
                if (string2 != null && string2.indexOf(f) != -1) {
                    int n = string2.indexOf(f) + f.length() + 1;
                    int n2 = n + f.length();
                    if (n2 >= string2.length()) {
                        return false;
                    }
                    if (!string2.substring(n, n2).equals(f)) {
                        return false;
                    }
                    J = I;
                    if (a) {
                        n = (J = J + w).indexOf(v);
                        if (n >= 0) {
                            J = J.substring(0, n) + f + J.substring(n + v.length());
                        }
                        if (J.length() == 0) {
                            return false;
                        }
                    }
                    break block10;
                }
                string = e + "-" + f;
                J = a.getAppProperty(string);
                return J != null;
            }
            catch (Exception exception) {
                return false;
            }
        }
        return true;
    }

    private static void c() {
        if (a == null) {
            a = new k();
        }
        new Thread(a).start();
    }

    private static int a() {
        int n = 0;
        for (int i2 = 0; i2 < b.length; ++i2) {
            if (!b[i2]) continue;
            ++n;
        }
        return n;
    }

    private static int b() {
        for (int i2 = 0; i2 < b.length; ++i2) {
            if (!b[i2]) continue;
            return i2;
        }
        return -1;
    }

    private static void a(int n) {
        try {
            N = 0;
            switch (n) {
                case -1: {
                    a = new d[x];
                    return;
                }
                case 0: {
                    return;
                }
                case 4: {
                    return;
                }
                case 5: {
                    return;
                }
                case 6: {
                    return;
                }
                case 7: {
                    return;
                }
                case 8: {
                    return;
                }
                case 1: {
                    int n2;
                    k.b();
                    byte[] byArray = k.a(n);
                    k.a(byArray);
                    int n3 = k.a(byArray);
                    b = new String[n3];
                    byte[] byArray2 = new byte[n3];
                    System.arraycopy(byArray, N, byArray2, 0, n3);
                    N += n3;
                    k.a(byArray);
                    int n4 = byArray[N++] & 0xFF | (byArray[N++] & 0xFF) << 8;
                    a = new short[n4];
                    for (n2 = 0; n2 < n4 - 1; ++n2) {
                        k.a[n2] = (short)((byArray[N++] & 0xFF) + ((byArray[N++] & 0xFF) << 8));
                    }
                    k.a[n4 - 1] = (short)n3;
                    for (n2 = 0; n2 < n4; ++n2) {
                        int n5 = n2 == 0 ? 0 : a[n2 - 1] & 0xFFFF;
                        n3 = (a[n2] & 0xFFFF) - n5;
                        if (n3 == 0) continue;
                        try {
                            k.b[n2] = new String(byArray2, n5, n3, "UTF-8");
                            continue;
                        }
                        catch (Exception exception) {}
                    }
                    return;
                }
                case 2: {
                    f.c("/11");
                    a = k.a(t, 3);
                    short[] sArray = (short[])f.a(v);
                    a.a(sArray);
                    O = a.d();
                    if (ak > 160 && ak > 220 && ak <= 320) {
                        a.c(-1);
                        if (c) {
                            a.c(0);
                        }
                    }
                    f.k();
                    return;
                }
                case 3: {
                    f.c("/11");
                    for (int i2 = 0; i2 < x; ++i2) {
                        if (i2 == t || i2 == v || i2 == u || i2 == w) continue;
                        k.a[i2] = k.a(i2, 1);
                    }
                    f.k();
                }
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private static void b(boolean bl) {
        int n;
        for (n = 0; n < x; ++n) {
            if (a[n] == null || n == t || n == v || n == u || n == w || n == 0) continue;
            a[n].a();
            k.a[n] = null;
        }
        if (bl) {
            k.a();
            f.k();
            a = null;
            b = null;
            H = null;
            for (n = 0; n < x; ++n) {
                if (a[n] == null) continue;
                a[n].a();
                k.a[n] = null;
            }
            a = null;
            a.a();
            a = null;
        }
        System.gc();
    }

    public static void a(boolean bl) {
        if (bl) {
            if (U == 0 || U == 2) {
                X = U;
                U = 5;
            }
            return;
        }
        if (U == 5) {
            U = X;
            Y = -1;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static boolean a(int var0) {
        if (k.i) {
            return true;
        }
        if (!k.g) {
            return true;
        }
        k.V = var0;
        switch (k.U) {
            case 0: {
                if (k.Y >= k.Z) {
                    k.U = 1;
                    k.d();
                    var0 = k.aj;
                    var1_2 = k.ak;
                    k.a = new int[k.L][];
                    for (var2_4 = 0; var2_4 < k.L; ++var2_4) {
                        k.a[var2_4] = new int[2];
                        k.a[var2_4][0] = 0;
                        k.a[var2_4][1] = 0;
                    }
                    var2_4 = k.a(0, 0);
                    var3_5 = k.b(0, 0);
                    var4_6 = k.a(k.p, 0);
                    var5_7 = k.b(k.p, 0);
                    var6_8 = k.b(0, 9);
                    k.a.a(k.a(k.o), null);
                    var9_9 = var0 - var2_4;
                    var7_12 = k.a.a(k.a(k.o), var9_9, false);
                    k.R = d.d;
                    var8_16 = k.Q = var7_12[0] * k.O;
                    if (var3_5 > k.Q) {
                        var8_16 = var3_5;
                    }
                    var9_10 = new String[]{k.F, k.G, k.a(k.k), k.a(k.m)};
                    var7_12 = "";
                    for (var10_17 = 0; var10_17 < var9_10.length; ++var10_17) {
                        if (var7_12.length() >= var9_10[var10_17].length()) continue;
                        var7_12 = var9_10[var10_17];
                    }
                    k.a.a((String)var7_12, null);
                    var7_13 = var0 - 2;
                    var7_14 = k.a.a((String)var7_12, var7_13, false);
                    k.R = d.d;
                    var7_15 = k.Q = var7_14[0] * k.O;
                    var9_11 = k.Q + var6_8 + var5_7 + var8_16;
                    var10_17 = var1_2 - var9_11 >> 2;
                    var8_16 = -3;
                    if (var1_2 <= 160) {
                        var8_16 = 2;
                    } else if (var1_2 <= 220) {
                        var8_16 = 1;
                    } else if (var1_2 <= 240) {
                        var8_16 = 0;
                    } else if (var1_2 <= 320) {
                        var8_16 = 0;
                    } else if (var1_2 <= 360) {
                        var8_16 = 3;
                    } else if (var1_2 <= 400) {
                        var8_16 = 1;
                    } else if (var1_2 <= 480) {
                        var8_16 = 6;
                    } else if (var1_2 <= 640) {
                        var8_16 = 0;
                    } else if (var1_2 <= 800) {
                        var8_16 = 3;
                    }
                    k.a[0][0] = var0 >> 1;
                    k.a[0][1] = var10_17 + (var7_15 >> 1) + var8_16 + -2;
                    k.a[k.z][0] = 0;
                    k.a[k.z][1] = k.a[0][1] + var10_17 + (var7_15 >> 1) - var8_16 - -2;
                    k.a[k.y][0] = var0 >> 1;
                    k.a[k.y][1] = k.a[k.z][1] + (var6_8 >> 1) + var8_16 + -2;
                    var7_15 = k.a(0, 2);
                    var8_16 = k.b(0, 2);
                    k.a[k.G][0] = 5;
                    k.a[k.G][1] = k.a[k.z][1] + (var6_8 >> 1) - (var8_16 >> 1);
                    k.a[k.H][0] = var0 - 5 - var7_15;
                    k.a[k.H][1] = k.a[k.G][1];
                    k.a[k.E][0] = var0 - k.a - var2_4;
                    k.a[k.E][1] = var1_2 - 2 - var3_5;
                    k.a[k.K][0] = k.a;
                    k.a[k.K][1] = var1_2 - 2 - var3_5;
                    k.a[k.A][0] = (var0 >> 1) - (var4_6 >> 1);
                    k.a[k.A][1] = k.a[k.z][1] + var6_8 + var10_17;
                    k.a[k.I][0] = var0 - var2_4 >> 1;
                    k.a[k.I][1] = k.a[k.A][1] + var5_7 + (var1_2 - k.a[k.A][1] - var5_7 >> 1);
                    k.a[k.B][0] = var0 >> 1;
                    k.a[k.B][1] = k.a[k.A][1] + (var5_7 << 1) / 3;
                    k.a[k.C][0] = 5;
                    k.a[k.C][1] = k.a[k.A][1] + (var5_7 >> 1) - (k.b(0, 6) >> 1);
                    k.a[k.D][0] = var0 - k.a(0, 4) - 5;
                    k.a[k.D][1] = k.a[k.C][1];
                    var0 = k.a(0, 8);
                    var1_2 = k.b(0, 8);
                    k.a[k.F][0] = k.a[k.A][0] + var4_6 - var0;
                    k.a[k.F][1] = k.a[k.A][1] + var5_7 - var1_2;
                    k.a[k.J][0] = 0;
                    k.a[k.J][1] = k.a[0][1];
                } else {
                    k.a(k.Y);
                }
                ++k.Y;
                break;
            }
            case 1: {
                switch (k.V) {
                    case 26: {
                        k.U = 4;
                        break;
                    }
                    case 23: {
                        if (k.aa <= 1) break;
                        k.W = k.W == 0 ? k.S - 1 : --k.W;
                        while (!k.b[k.W]) {
                            if (k.W == 0) {
                                k.W = k.S - 1;
                                continue;
                            }
                            --k.W;
                        }
                        k.d = true;
                        ** GOTO lbl159
                    }
                    case 24: {
                        if (k.aa <= 1) break;
                        if (!k.d) {
                            k.W = k.W == k.S - 1 ? 0 : ++k.W;
                            while (!k.b[k.W]) {
                                if (k.W == k.S - 1) {
                                    k.W = 0;
                                    continue;
                                }
                                ++k.W;
                            }
                            k.e = true;
                        }
                        k.d();
                        break;
                    }
                    case 32: {
                        break;
                    }
                    case 21: {
                        break;
                    }
                    case 25: 
                    case 27: {
                        k.U = 6;
                        break;
                    }
                    case 28: {
                        block28: while (true) {
                            k.W = 0;
                            while (!k.b[k.W]) {
                                if (k.W == k.d - 1) continue block28;
                                ++k.W;
                            }
                            break;
                        }
                        k.d();
                        break;
                    }
                    case 29: {
                        block30: while (true) {
                            k.W = k.d;
                            while (!k.b[k.W]) {
                                if (k.W == k.S - 1) continue block30;
                                ++k.W;
                            }
                            break;
                        }
lbl159:
                        // 2 sources

                        k.d();
                    }
                }
                break;
            }
            case 6: {
                var0_1 = k.e[k.W];
                if (var0_1 == null || var0_1.length() <= 0) break;
                if (k.a) {
                    var1_3 = var0_1.indexOf(k.y);
                    var0_1 = var1_3 == -1 ? var0_1 + k.y + k.a[0] : var0_1.substring(0, var1_3) + k.y + k.a[0] + var0_1.substring(var1_3 + k.y.length() + 2);
                }
                k.E = var0_1;
                break;
            }
            case 2: {
                k.b(false);
                var0 = k.W;
                k.Y = k.c[var0] == 4 ? k.c[var0] : (k.c[var0] == 6 ? 6 : (k.c[var0] == 7 ? 7 : (k.c[var0] == 8 ? 8 : -1)));
                k.a(k.Y);
                k.U = 1;
                break;
            }
            case 5: {
                break;
            }
            case 3: {
                switch (k.V) {
                    case 26: {
                        k.U = 1;
                        break;
                    }
                    case 25: {
                        break;
                    }
                    case 30: {
                        k.E = null;
                    }
                }
                break;
            }
            case 4: {
                k.b(true);
                k.f = false;
                return true;
            }
        }
        return false;
    }

    private static int a(int n, int n2) {
        return a[n].d(n2);
    }

    private static int b(int n, int n2) {
        return a[n].e(n2);
    }

    private static void d() {
        ad = W;
        h = e[W] != null && e[W].length() > 0 && e[W].compareTo("DEL") != 0;
        ae = g;
        if (c[W] == 4 || c[W] == 6 || c[W] == 7) {
            ae = h;
        }
        if (c[W] == 8) {
            ae = n;
        }
    }

    public static void a(Graphics graphics) {
        if (i) {
            return;
        }
        if (!g) {
            return;
        }
        k.b(graphics, 0, 0, aj, ak);
        switch (U) {
            case 0: {
                graphics.setColor(0);
                int n = ak;
                int n2 = aj;
                f.c(graphics, 0, 0, n2, n);
                int n3 = Z;
                int n4 = Y;
                n = aj * 3 / 4;
                n2 = am;
                Graphics graphics2 = graphics;
                if (n4 > n3) {
                    n4 = n3;
                }
                int n5 = (aj - n) / 2;
                k.b(graphics2, n5, 0, n + 2, ak);
                graphics2.setColor(0xFFFFFF);
                f.d(graphics2, n5, n2, n, 6);
                n = (n - 2 - 2) * n4 / n3 + 1;
                graphics2.setColor(0xFF0000);
                n4 = n;
                n = n2 + 1 + 1;
                f.c(graphics2, n5 + 1 + 1, n, n4, 3);
                if (H == null || H.trim().equals("")) break;
                graphics.setColor(0xFFFFFF);
                graphics = a;
                f.a.setFont((Font)graphics);
                f.a(H, al, am - 5, 33);
                return;
            }
            case 1: {
                k.b(graphics);
                if (System.currentTimeMillis() % 1000L <= 500L) break;
                if (W != f) {
                    k.a(graphics, true);
                    return;
                }
                k.a(graphics, false);
                return;
            }
            case 2: {
                return;
            }
            case 5: {
                return;
            }
            case 3: {
                k.b(graphics);
                int n = ak;
                int n6 = aj;
                int n7 = n * 40 / 100;
                k.a(graphics, 0, n7 - 1, n6, n - (n7 - 1 << 1), -1);
                k.a(graphics, 0, n7, n6, n - (n7 << 1), -220209185);
                P = 1;
                int n8 = n >> 1;
                n7 = n6 >> 1;
                Graphics graphics3 = graphics;
                k.b(k.a(i), graphics3, aj, n7, n8);
                k.c(graphics);
            }
        }
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4, int n5) {
        int[] nArray = new int[n3 * n4];
        for (int i2 = 0; i2 < nArray.length; ++i2) {
            nArray[i2] = n5;
        }
        graphics.drawRGB(nArray, 0, n3, 0, n2, n3, n4, true);
    }

    private static void b(Graphics graphics) {
        int n;
        int n2;
        int n3 = aj;
        int n4 = ak;
        if (W != f) {
            ah = a[B][0];
            ai = a[B][1];
        } else {
            ah = a[B][0];
            n2 = k.b(s, 0);
            n = k.b(p, 0);
            ai = a[A][1] + (n - n2) / 2 + n2;
        }
        graphics.setColor(0xFFFFFF);
        if (a[0]) {
            graphics.setColor(0);
        }
        graphics.setColor(0xFFFFFF);
        f.c(graphics, 0, 0, n3, n4);
        n4 = a[0][0];
        n2 = a[0][1];
        n = a[y][0];
        int n5 = a[y][1];
        int n6 = a[A][0];
        int n7 = a[A][1];
        int n8 = a[F][0];
        int n9 = a[F][1];
        int n10 = a[z][0];
        int n11 = a[z][1];
        int n12 = a[I][0];
        int n13 = a[I][1];
        k.a(graphics, 0, 9, n10, n11);
        P = 1;
        if (c[W] == 6) {
            if (!F.equals("0")) {
                k.b(F, graphics, n3 - 2, n4, n2);
            }
            k.a(k.a(ad), graphics, n3, n, n5);
            k.a(graphics, q + (W - d), 0, n6, n7);
            k.a(graphics, 0, 8, n8, n9);
            if (D == null || !D.equals("TMUS")) {
                k.b(k.a(o), graphics, n3 - k.a(0, 0) - a, n12, n13);
            }
        } else if (c[W] == 7) {
            if (!G.equals("0")) {
                k.b(G, graphics, n3 - 2, n4, n2);
            }
            k.a(k.a(l), graphics, n3, n, n5);
            k.a(graphics, r, 0, n6, n7);
        } else if (c[W] == 8) {
            k.b(k.a(m), graphics, n3 - 2, n4, n2);
            k.a(k.a(j), graphics, n3 * 3 / 4, n, n5);
            k.a(graphics, s, 0, n6, n7);
        } else {
            P = 1;
            k.b(k.a(k), graphics, n3 - 2, n4, n2);
            k.a(k.a(ad), graphics, n3 * 3 / 4, n, n5);
            k.a(graphics, p + W, 0, n6, n7);
        }
        n3 = 0;
        if (aa > 1) {
            n3 = 1;
        }
        if (n3 != 0) {
            n3 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
            n4 = 6;
            n2 = 4;
            ++n3;
            n = a[C][0];
            n5 = a[C][1];
            n6 = a[D][0];
            n7 = a[D][1];
            if (d) {
                n4 = 7;
                ++T;
            }
            if (e) {
                n2 = 5;
                ++T;
            }
            k.a(graphics, 0, n4, n + n3, n5);
            k.a(graphics, 0, n2, n6 - n3, n7);
            if (T > 4) {
                d = false;
                e = false;
                T = 0;
            }
        }
        k.c(graphics);
    }

    private static void a(Graphics graphics, boolean n) {
        if (h) {
            int n2 = aj;
            int n3 = ak;
            int n4 = -1030069;
            int n5 = a[C][0];
            int n6 = a[D][0];
            int n7 = k.a(0, 6);
            n5 = n6 - n5 - n7 - 16;
            if (n == 0) {
                n5 = n2;
            }
            n = k.a(0, 20);
            n2 = k.b(0, 20);
            n6 = k.a(0, 25);
            n7 = k.a(0, 25);
            int n8 = P;
            P = 0;
            a.a(k.a(ae), null);
            int n9 = n5;
            short[] sArray = a.a(k.a(ae), n9, false);
            R = d.d;
            Q = sArray[0] * O;
            af = R;
            ag = Q;
            if (af % n6 != 0) {
                af = (af / n6 + 1) * n6;
            }
            int n10 = af / n6;
            int n11 = k.b(0, 10);
            if (ag < n11) {
                ag = n11;
            }
            af += n << 1;
            if (ai + ag + (n7 << 1) > n3) {
                ai = n3 - ag - (n7 << 1);
            }
            n3 = ah - (af >> 1);
            n11 = ai + (ag >> 1);
            graphics.setColor(n4);
            int n12 = ag - (n2 << 1);
            int n13 = af;
            n4 = n11 + n2;
            f.c(graphics, n3, n4, n13, n12);
            k.a(graphics, 0, 20, n3, n11);
            k.a(graphics, 0, 23, n3, n11 + ag - n7);
            n3 += n;
            for (n = 0; n < n10; ++n) {
                k.a(graphics, 0, 22, n3, n11);
                k.a(graphics, 0, 25, n3, n11 + ag - n7);
                n3 += n6;
            }
            k.a(graphics, 0, 21, n3, n11);
            k.a(graphics, 0, 24, n3, n11 + ag - n7);
            k.b(k.a(ae), graphics, n5, ah, ai + ag + n2);
            P = n8;
        }
    }

    private static void c(Graphics graphics) {
        int n = a[E][0];
        int n2 = a[E][1];
        k.a(graphics, 0, 0, n, n2);
    }

    private static void a(Graphics graphics, int n, int n2, int n3, int n4) {
        a[n].a(graphics, n2, n3, n4, 0);
    }

    private static void b(Graphics graphics, int n, int n2, int n3, int n4) {
        n = Math.max(n, 0);
        n2 = Math.max(0, 0);
        n3 = Math.min(n3, aj);
        n4 = Math.min(n4, ak);
        f.b(graphics, n, n2, n3, n4);
    }

    public final void run() {
        new StringBuffer().append("Thread.activeCount() = ").append(Thread.activeCount());
        while (f) {
            try {
                if (E != null) {
                    d = E;
                    if (d != null && d.length() > 0) {
                        String string = d;
                        d = null;
                        new StringBuffer().append("urlPlatformRequest = ").append(string);
                        try {
                            wfree.P.pr(a, string);
                            Thread.sleep(200L);
                        }
                        catch (Exception exception) {}
                        U = 1;
                        a.notifyDestroyed();
                    }
                    E = null;
                }
                Thread.sleep(1000L);
            }
            catch (Exception exception) {}
        }
    }

    public final void commandAction(Command command, Displayable displayable) {
    }

    private static InputStream a(String string) {
        return "a".getClass().getResourceAsStream(string);
    }

    private static d a(int n, int n2) {
        d d2 = new d();
        d2.a(f.a(n), 0);
        return d2;
    }

    static {
        e = "URL";
        a = 2;
        a = new boolean[1];
        a = new int[1];
        b = -1;
        c = 8;
        f = "ZVIP";
        g = "SCFR";
        h = "GMCL";
        i = "CCTL";
        j = "TITLE-FREEMIUM";
        k = "TITLE-GLCLUB";
        l = "URL-OPERATOR";
        p = 1;
        q = 4;
        r = 8;
        s = 9;
        t = 10;
        u = 11;
        v = 12;
        w = 13;
        x = 14;
        y = 1;
        z = 6;
        A = 7;
        B = 8;
        C = 9;
        D = 10;
        E = 11;
        F = 12;
        G = 13;
        H = 14;
        I = 21;
        J = 22;
        K = 24;
        L = 25;
        m = "IGP-CATEGORIES";
        n = "IGP-PROMOS";
        o = "IGP-FREEMIUM";
        p = "URL-TEMPLATE-GAME";
        q = "more_games_url";
        r = "more_games_status";
        s = null;
        t = null;
        u = "on";
        v = "XXXX";
        w = "&ctg=" + v;
        x = "&ctg=";
        y = "&lg=";
        z = "SC";
        A = "ingameads.gameloft.com/redir";
        B = ";";
        c = false;
        a = new String[0];
        a = null;
        f = false;
        E = null;
        g = false;
        aa = -1;
        ab = 0;
        ac = 0;
        I = "";
        i = false;
        new Hashtable();
    }
}

