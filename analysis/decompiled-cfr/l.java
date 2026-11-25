/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayOutputStream;
import java.util.Random;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import wfree.MessageConnection;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class l {
    private static MIDlet a = null;
    static int a = -1;
    static String a = "";
    static int b = -1;
    private static String b = "";
    private static String c = "PaySMS.IAP.Version:1.1.8";
    private static c a;
    private static int c;
    private static boolean c;
    private static String[][] a;
    private static boolean d;
    private static Vector[] a;
    private static String[][] b;
    private static String[][] c;
    private static int d;
    private static Vector a;
    private static int e;
    private static String[] b;
    private static int f;
    private static String[][] d;
    private static String[] c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static String i;
    private static String j;
    private static String k;
    private static String l;
    private static int g;
    private static long a;
    public static final String[] a;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;
    private static String s;
    private static String t;
    private static String u;
    private static Timer a;
    public static MessageConnection a;
    public static boolean a;
    public static boolean b;
    private static int h;
    private static int i;
    private static String v;
    private static String w;
    private static String x;
    private static String y;
    private static String z;
    private static String[] d;
    private static Vector b;
    private static Vector c;
    private static Vector d;
    private static String[] e;
    private static boolean j;
    private static String[] f;
    private static String[] g;
    private static String[] h;
    private static int[] a;
    private static int[] b;
    private static int j;
    private static char a;

    private static String a(String string, int n, char c2) {
        c2 = '\u0000';
        int n2 = n;
        int n3 = string.indexOf(124, 1);
        while (n > 0) {
            if (c2 == '\uffffffff') {
                return null;
            }
            c2 = (char)n3;
            n3 = string.indexOf(124, c2 + '\u0001');
            --n;
        }
        if (c2 == '\uffffffff') {
            return null;
        }
        if (n3 == -1) {
            n3 = string.length();
        }
        if (n2 > 0) {
            c2 = (char)(c2 + 1);
        }
        if (c2 == n3) {
            return "";
        }
        if (c2 > n3) {
            return null;
        }
        try {
            char[] cArray = new char[n3 - c2];
            string.getChars(c2, n3, cArray, 0);
            return new String(cArray);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
    }

    public static void a(String string) {
        b = string;
        a = f.a;
        i = 0;
        if (a == null) {
            a = new Vector();
        }
        if (c == null) {
            c = l.b();
        }
        d = l.c();
        f = l.h();
        h = l.i();
        l = l.i();
        if (l.equals("")) {
            l = l.j();
            l.a(a[1], l);
        }
        a = l.c();
        c = true;
        if (c != null) {
            c = c + "";
        }
        if (!l.j() && l.f() == 0 && d && l.g()) {
            l.f();
        }
        l.d();
        if (d) {
            String string2;
            int n;
            Vector<String> vector = new Vector<String>();
            if (l.f() == 0) {
                for (n = 0; n < a.size(); ++n) {
                    int n2 = (Integer)a.elementAt(n);
                    string2 = a[n2][13];
                    if (vector.indexOf(string2) != -1) continue;
                    vector.addElement(string2);
                }
            } else {
                for (n = 0; n < b.length; ++n) {
                    string2 = b[n][13];
                    if (vector.indexOf(string2) != -1) continue;
                    vector.addElement(string2);
                }
            }
            for (n = 0; n < c.length; ++n) {
                if (c[n] == null || vector.indexOf(string2 = c[n][0]) != -1) continue;
                l.c[n] = null;
            }
            if (l.f() == 0) {
                for (n = 0; n < a.length; ++n) {
                    if (a.indexOf(new Integer(n)) != -1) continue;
                    l.a[n] = null;
                }
                b = null;
                return;
            }
            a = null;
            a = null;
        }
    }

    private static boolean d() {
        if (l.a.a) {
            return false;
        }
        if (l.a.b) {
            return true;
        }
        if (l.a.a != null && l.a.a != "") {
            String string = l.a(l.a.a, 0, '|');
            try {
                if (string.equals("FAILURE")) {
                    c = Integer.parseInt(l.a(l.a.a, 1, '|'));
                    return true;
                }
            }
            catch (NumberFormatException numberFormatException) {
                c = 40;
                string = l.a(l.a.a, 1, '|');
                if (string.indexOf("PB") != -1) {
                    try {
                        c = Integer.parseInt(string.substring(2, string.length()));
                    }
                    catch (NumberFormatException numberFormatException2) {}
                }
                return true;
            }
            if (string.equals("SUCCESS")) {
                l = l.a(l.a.a, 2, '|');
                c = 0;
                return true;
            }
        }
        c = 40;
        return true;
    }

    public static boolean a() {
        int n;
        j = 6;
        String string = l.e(a[6]);
        if (string != null && !string.equals("1") && string.equals("0")) {
            n = 0;
            i = -10;
        } else {
            int n2;
            a = f.a;
            m = l.d("IAP-OverrideFromJad");
            if (m.equals("1")) {
                s = l.d("IAP-BillingType").toUpperCase();
                if (s.equals("HTTP")) {
                    r = l.d("IAP-BillingURL");
                    if (r.equals("")) {
                        m = "0";
                    }
                } else if (!s.equals("SMS")) {
                    m = "0";
                }
            }
            l.d("IAP-Version");
            h = l.d("IAP-GameCodeIGP");
            if (h.length() == 0) {
                n2 = 0;
            } else {
                i = l.d("IAP-PhoneModel");
                if (i.length() == 0) {
                    i = "5477";
                }
                if ((y = l.d("IAP-Test")).length() == 0) {
                    y = "0";
                }
                if (l.f() != 0) {
                    if (l.f() == 1) {
                        z = v;
                    } else if (l.f() == 2) {
                        z = w;
                    } else {
                        y = "0";
                        z = "";
                    }
                }
                new StringBuffer().append("PaySMS.parseJadFields:iapTestField: ").append(y).append(" useTestProfile: ").append(z);
                d = l.d("IAP-DebugNumber");
                string = System.getProperty("wireless.messaging.sms.smsc");
                if (string != null && string.length() > 0) {
                    f = string;
                }
                string = l.d("IAP-DebugSMSCenter");
                e = l.d("IAP-DebugMNC");
                if (!string.equals("")) {
                    f = string;
                }
                if (!e.equals("")) {
                    g = e;
                }
                j = l.d("Download-Code");
                if (l.d("IAP-EnableCreditCard").equals("1")) {
                    j = true;
                }
                b = new Vector();
                c = new Vector();
                d = new Vector();
                for (n = 0; n < d.length; ++n) {
                    for (int i2 = 1; i2 <= j; ++i2) {
                        String string2 = l.d("IAP-ContentID-" + d[n] + "-" + i2);
                        if (string2 == null || string2.equals("")) continue;
                        b.addElement(string2);
                    }
                }
                new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(b);
                for (n = 0; n < b.size(); ++n) {
                    String string3 = (String)b.elementAt(n);
                    boolean bl = false;
                    for (int i3 = n + 1; i3 < b.size(); ++i3) {
                        if (!b.elementAt(i3).equals(string3)) continue;
                        bl = true;
                        b.removeElementAt(i3);
                        --i3;
                    }
                    if (!bl) continue;
                    b.removeElementAt(n);
                    --n;
                }
                if (b.size() == 0) {
                    n2 = 0;
                } else {
                    new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(b);
                    String string4 = l.d("IAP-Profiles");
                    if (string4.equals("")) {
                        n2 = 0;
                    } else {
                        String[] stringArray;
                        if (string4.length() > 0 && string4.charAt(string4.length() - 1) != ';') {
                            string4 = string4 + ";";
                        }
                        if ((stringArray = l.a(string4)) == null) {
                            n2 = 0;
                        } else if (!l.a(null, stringArray, l.b(t))) {
                            n2 = j ? 1 : 0;
                        } else {
                            d = true;
                            n2 = 1;
                        }
                    }
                }
            }
            n = n2;
            new StringBuffer().append("PaySMS.checkAvailable:parseJadFields: ").append(n != 0 ? "true" : "false");
            n = n != 0 && l.e() ? 1 : 0;
        }
        if (n == 0) {
            a = null;
            a = null;
            c = null;
            b = null;
        }
        return n != 0;
    }

    private static boolean e() {
        boolean bl;
        if (l.f() != 0) {
            bl = true;
        } else if (j && (a == null || a.length == 0)) {
            bl = true;
        } else if (a.length == 1) {
            bl = true;
        } else if (a.length > 1) {
            String string = a[0][2];
            String string2 = a[0][3];
            bl = true;
            for (int i2 = 1; i2 < a.length; ++i2) {
                String string3 = a[i2][2];
                String string4 = a[i2][3];
                if (string.equals(string3) && string2.equals(string4)) continue;
                bl = false;
                break;
            }
        } else {
            bl = false;
        }
        new StringBuffer().append("PaySMS.checkAvailable:validProfiles: ").append(bl ? "true" : "false");
        return bl;
    }

    public static boolean b() {
        f = l.h();
        h = l.i();
        return f || h;
    }

    public static void a(int n, String string) {
        new StringBuffer().append("PaySMS.sendRequest: start (PricePoint:").append(n).append(") (Item Type: ").append(string).append(")");
        b = n;
        a = l.b(n, string);
        a = string;
        boolean bl = false;
        String string2 = "";
        if (m.equals("1")) {
            string2 = s;
        } else {
            int n2;
            if (l.f() != 0) {
                a = b;
                if (l.f() == 1) {
                    string2 = "SMS";
                } else if (l.f() == 2) {
                    string2 = "HTTP";
                }
                for (n2 = 0; n2 < a.length; ++n2) {
                    if (!a[n2][0].equals(z)) continue;
                    g = n2;
                    bl = true;
                    break;
                }
            } else {
                new StringBuffer().append("PaySMS.sendRequest: currentValidProfiles: ").append(a == null ? "null" : "Size: " + a.size());
                if (a == null || a.size() == 0) {
                    g = -1;
                } else {
                    g = 0;
                    for (n2 = 0; n2 < a.size(); ++n2) {
                        int n3 = (Integer)a.elementAt(n2);
                        try {
                            if (Integer.parseInt(a[n3][14]) != n) continue;
                            g = n3;
                            bl = true;
                            string2 = a[g][6];
                            break;
                        }
                        catch (Exception exception) {
                            g = 0;
                        }
                    }
                }
            }
            new StringBuffer().append("PaySMS.sendRequest: currentProfile: ").append(g);
            if (bl && g != -1) {
                new StringBuffer().append("PaySMS.sendRequest: Id: ").append(a[g][0]).append(" Billing: ").append(a[g][6]).append(" Region: ").append(a[g][2]).append(" Carrier: ").append(a[g][3]).append(" Pricepoint: ").append(a[g][14]);
            }
        }
        if (c) {
            new StringBuffer().append("creditCardEnabled: ").append(j);
            if (bl && string2.equals("SMS")) {
                e = true;
                f = false;
                l.a(a[0], "0");
                k = "";
                p = m.equals("1") ? l.d("IAP-Alias-PP" + b) : "";
                if (!p.equals("")) {
                    l.b(p);
                } else if (g != -1 && !a[g][10].equals("")) {
                    l.b(a[g][10]);
                }
                if (a[g][12].equals("7")) {
                    l.b("UNLOCK");
                } else {
                    l.b("INAPP");
                }
                l.b("V009");
                l.b(h);
                l.b(l);
                l.b(i);
                o = m.equals("1") ? l.d("IAP-ProfileID-PP" + b) : "";
                if (!o.equals("")) {
                    l.b(o);
                } else if (g != -1) {
                    l.b(a[g][0]);
                } else {
                    i = 7;
                    return;
                }
                if (!b.equals("")) {
                    l.b(b);
                } else {
                    l.b("EN");
                }
                if (a[g][12].equals("7")) {
                    l.b("7");
                } else {
                    l.b("1");
                }
                String string3 = l.d("IAP-ContentID-" + a + "-" + b);
                if (string3.equals("")) {
                    new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(a).append("-").append(b).append(" missing in JAD");
                    i = -2;
                    return;
                }
                l.b(string3);
                l.b("ct" + a);
                new StringBuffer().append("PaySMS.sendSMS: smsContent: ").append(k);
                g = true;
                new b().start();
                return;
            }
            if (bl && string2.equals("HTTP")) {
                String string4;
                String string5;
                a = new c(false);
                if (m.equals("1")) {
                    string5 = r;
                    string = o = l.d("IAP-ProfileID-PP" + b);
                } else if (g != -1) {
                    string5 = a[g][11];
                    string = a[g][0];
                } else {
                    i = 7;
                    return;
                }
                if (string5.equals("") || string.equals("")) {
                    i = 4;
                    return;
                }
                new StringBuffer().append("PaySMS.sendHTTP: URL = ").append(string5);
                if (!string5.startsWith("http://")) {
                    string5 = "http://" + string5;
                }
                if (!string5.endsWith("?")) {
                    string5 = string5 + "?";
                }
                if ((string4 = l.d("IAP-ContentID-" + a + "-" + b)).equals("")) {
                    new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(a).append("-").append(b).append(" missing in JAD");
                    i = -2;
                    return;
                }
                String string6 = string4;
                String string7 = i;
                String string8 = j;
                String string9 = l;
                string2 = h;
                string4 = string;
                string = string6;
                a.a();
                String string10 = "%7C";
                String string11 = string5;
                string5 = "b=contentpurchase" + string10 + string2 + string10;
                string5 = string5 + string + string10 + string4 + string10;
                string5 = string5 + string9;
                if (!string8.equals("")) {
                    string5 = string5 + "&d=" + string8;
                }
                string5 = string5 + "&phoneId=" + string7;
                c = -100;
                a.a(string11, string5);
                l.a(a[1], l);
                l.a(a[2], String.valueOf(a));
                l.a(a[5], a);
                if (!m.equals("1")) {
                    l.b(a);
                }
                h = 1;
                return;
            }
            if (j && g == -1) {
                l.b(n, string);
                return;
            }
            if (j) {
                l.b(n, string);
                return;
            }
            i = -2;
            return;
        }
    }

    public static void a() {
        h = true;
        l.a(a[4], "1");
        int n = l.c();
        String string = l.b();
        l.a(l.a(n, string), string);
    }

    public static int a() {
        if (i) {
            i = false;
            return 7;
        }
        if (!c) {
            return 0;
        }
        if (f) {
            return 2;
        }
        if (g) {
            return 1;
        }
        if (e || h) {
            if (h) {
                e = false;
                f = true;
                l.a(a[0], "1");
                return 8;
            }
            l.c();
            return 3;
        }
        if (h == 1) {
            if (l.d()) {
                int n;
                h = 0;
                if ((l.a.a ? -1 : (n = l.a.b ? -2 : c)) == 0) {
                    if (l.a(Integer.parseInt(l))) {
                        i = 0;
                        l.c();
                        return 7;
                    }
                    i = 1;
                    l.c();
                    return 3;
                }
                if (n == -2) {
                    i = -1;
                    l.c();
                    return 3;
                }
                i = n;
                l.c();
                return 3;
            }
            return 1;
        }
        if (!m.equals("1") && l.f() == 0) {
            if (i != 0) {
                return 3;
            }
            if (!(a != null && a.size() >= 1 || j && !d)) {
                if (f < 0) {
                    i = -3;
                    return 3;
                }
                if (a.size() < 1) {
                    i = -3;
                    return 3;
                }
            }
        }
        return 6;
    }

    public static int b() {
        return i;
    }

    public static int c() {
        int n;
        String string = l.e(a[2]);
        if (string == null || string.length() == 0) {
            return -1;
        }
        try {
            n = Integer.parseInt(string);
        }
        catch (Exception exception) {
            n = -1;
        }
        return n;
    }

    public static boolean a(int n) {
        String string;
        boolean bl = false;
        l = l.i();
        if (l != null && l.length() > 0) {
            int string5;
            string = String.valueOf(n);
            bl = string.equals(String.valueOf(string5 = Integer.parseInt(l) ^ 0xD0A4));
        }
        new StringBuffer().append("PaySMS.verifyRequest: inputCode: ").append(n).append(" ").append(bl ? "Unlocked" : "Still Locked");
        if (bl) {
            try {
                String c2;
                String string3 = l.e(a[7]);
                string = "0";
                if (string3 != null && !string3.equals("")) {
                    string = string3.substring(0, string3.indexOf(95));
                }
                int n3 = l.c();
                String string2 = l.b();
                int string22 = l.a(n3, string2);
                string2 = l.a(0, string22);
                String string4 = c2 = l.a(9, string22);
                string = string.replace(',', '.');
                string4 = string4.replace(',', '.');
                long l2 = l.a(string);
                long l3 = l.a(string4);
                String string5 = string4;
                char exception = string.indexOf(a) != -1 || string5.indexOf(a) != -1 ? a : 32;
                long l4 = l2 + l3;
                string = exception == ' ' ? l4 / 100000L + "" : "" + l4 / 100000L + exception + l4 % 100000L;
                new StringBuffer().append("totalMoneySpent : ").append(string).append("  profileID: ").append(string2);
                l.a(a[7], string + "_" + string2);
            }
            catch (Exception exception) {
                new StringBuffer().append("Exception : ").append(exception);
            }
            i = 0;
            if (!l.c(l.c()).equals("http_2d")) {
                i = true;
            }
            l.c();
        }
        return bl;
    }

    private static void c() {
        g = false;
        e = false;
        c = false;
        l.a(a[1], "");
        f = false;
        l.a(a[0], "0");
        h = false;
        l.a(a[4], "0");
    }

    public static void b() {
        d = -1;
        f = -1;
        a = null;
        i = false;
        l.a(a[2], "");
        l.a(a[5], "");
        l.a(a[3], "");
        l.a(a[8], "");
        l.a(a[9], "");
        g = null;
        l.c();
    }

    private static boolean f() {
        int n;
        if (a == null) {
            a = new Vector();
        }
        if (a.size() == 1) {
            g = (Integer)a.elementAt(0);
            new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, detected profile: ").append(g);
            return true;
        }
        e = -1;
        g = -1;
        a.removeAllElements();
        String[][] stringArray = l.a(d[f][0]);
        b = new String[stringArray.length];
        String[] stringArray2 = new String[stringArray.length];
        for (n = 0; n < stringArray.length; ++n) {
            l.b[n] = stringArray[n][0];
            stringArray2[n] = stringArray[n][1];
        }
        b = l.a(b);
        stringArray2 = l.a(stringArray2);
        new StringBuffer().append("PaySMS.detectCarrier: currentIDS ").append(stringArray2.length).append(", currentCarriers = ").append(b.length);
        if (stringArray2.length == 1) {
            e = 0;
            for (n = 0; n < a.length; ++n) {
                if (!a[n][0].equals(stringArray2[0])) continue;
                a.addElement(new Integer(n));
            }
            new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one profile. currentValidProfiles.size() ").append(a.size());
            return true;
        }
        if (b.length == 1) {
            e = 0;
            new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one carrier: ").append(b[e]);
            for (n = 0; n < a.length; ++n) {
                if (a[n][2].indexOf(d[f][0]) == -1) continue;
                for (int i2 = 0; i2 < a[n].size(); ++i2) {
                    if (((String)a[n].elementAt(i2)).indexOf(b[e]) == -1) continue;
                    a.addElement(new Integer(n));
                }
            }
            new StringBuffer().append("PaySMS.detectCarrier: currentValidProfiles.size =  ").append(a.size());
            return true;
        }
        if (b.length >= 1) {
            int n2;
            int n3;
            String[][] stringArray3 = new String[stringArray2.length][2];
            int n4 = 1;
            block4: for (n3 = 0; n3 < stringArray2.length; ++n3) {
                new StringBuffer().append("PaySMS.detectCarrier: currentIDS[").append(n3).append("]= ").append(stringArray2[n3]);
                for (n2 = 0; n2 < a.length; ++n2) {
                    if (!a[n2][0].equals(stringArray2[n3])) continue;
                    stringArray3[n3][0] = a[n2][3];
                    stringArray3[n3][1] = "" + n2;
                    new StringBuffer().append("PaySMS.detectCarrier: is Openmarket???? ").append(a[n2][1]);
                    if (a[n2][1].indexOf("Open Market") != -1) continue block4;
                    n4 = 0;
                    continue block4;
                }
            }
            n3 = 1;
            for (n2 = 1; n2 < stringArray3.length; ++n2) {
                if (stringArray3[n2][0].equals(stringArray3[n2 - 1][0])) continue;
                n3 = 0;
                new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i] ").append(stringArray3[n2][0]);
                new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i-1] ").append(stringArray3[n2 - 1][0]);
            }
            new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles: ").append(n3 != 0).append(", isOpenMarket: ").append(n4 != 0);
            if (n3 != 0) {
                block7: for (n2 = 0; n2 < stringArray2.length; ++n2) {
                    for (n4 = 0; n4 < a.length; ++n4) {
                        if (!a[n4][0].equals(stringArray2[n2])) continue;
                        a.addElement(new Integer(n4));
                        continue block7;
                    }
                }
                new StringBuffer().append("PaySMS.detectCarrier: Dont auto skip carrier selection(except OpenMarket). currentValidProfiles.size() ").append(a.size());
                new StringBuffer().append("PaySMS.detectCarrier: More than one carrier, but multicarrier profiles: ").append(stringArray3[0][0]);
                return true;
            }
            n2 = b.length;
            for (n4 = 0; n4 < n2; ++n4) {
                l.b[n4] = b[n4].trim();
            }
            int[] nArray = new int[n2];
            for (int i3 = 0; i3 < n2; ++i3) {
                nArray[i3] = i3;
                new StringBuffer().append("PaySMS.detectCarrier: carrierNames[").append(i3).append("]: ").append(b[i3]);
            }
        }
        return false;
    }

    private static boolean g() {
        int n;
        if (d != -1) {
            f = d;
            return true;
        }
        f = -1;
        g = -1;
        a = null;
        c = new String[d.length];
        for (n = 0; n < c.length; ++n) {
            l.c[n] = d[n][0];
        }
        if (c.length == 1 && (f == null || d == -1)) {
            f = 0;
            d = 0;
            new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, only one region: ").append(c[f]);
            return true;
        }
        if (f != null && d != -1) {
            f = d;
            new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, region auto-detected: ").append(d);
            return true;
        }
        n = c.length;
        for (int i2 = 0; i2 < n - 1; ++i2) {
            for (int i3 = i2 + 1; i3 < n; ++i3) {
                if (c[i2].compareTo(c[i3]) <= 0) continue;
                String string = c[i2];
                l.c[i2] = c[i3];
                l.c[i3] = string;
            }
        }
        return false;
    }

    private static void b(int n, String string) {
        new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: Pricepoint:").append(n).append(" Type:").append(string);
        String string2 = e[11];
        String string3 = l.d("IAP-ContentID-" + string + "-" + n);
        if (string3.equals("")) {
            new StringBuffer().append("PaySMS.sendCCARD: Wrong Item. IAP-ContentID-").append(string).append("-").append(n).append(" missing in JAD");
            i = -2;
            return;
        }
        string = "";
        string = string + "?igpcode=" + h;
        string = string + "&content_id=" + string3;
        string = string + "&tier=" + n;
        string = string + "&code=" + l;
        string = string + "&d=" + j;
        String string4 = string2 + string;
        new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: ").append(string4);
        l.a(a[0], "1");
        l.a(a[1], l);
        l.a(a[2], String.valueOf(a));
        l.a(a[5], a);
        if (string4 != null) {
            f.a(string4);
        }
    }

    private static void b(String string) {
        if (string != null) {
            k = k + string + " ";
        }
    }

    private static String[][] a(String string) {
        Vector<String[]> vector = new Vector<String[]>();
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (a[i2][2].indexOf(string) == -1) continue;
            for (int i3 = 0; i3 < a[i2].size(); ++i3) {
                String string2 = (String)a[i2].elementAt(i3);
                String string3 = a[i2][0];
                if (string2 == null) continue;
                int n = string2.indexOf(40);
                if (n == -1) {
                    n = string2.length();
                }
                new StringBuffer().append("PaySMS.getProfilesCarrierAndIds: regionName = ").append(string).append(", carrierName = ").append(string2);
                if (g != null && !l.a(string2, g) || vector.contains(string2.substring(0, n))) continue;
                vector.addElement(new String[]{new String(string2.substring(0, n)), string3});
            }
        }
        String[][] stringArray = new String[vector.size()][2];
        vector.copyInto((Object[])stringArray);
        return stringArray;
    }

    public static String a(int n) {
        return l.b(n);
    }

    private static String b(int n) {
        new StringBuffer().append("PaySMS.getPrice: begin (").append(n).append(")");
        if (m.equals("1")) {
            q = l.d("IAP-Price-PP" + n);
            if (q.equals("")) {
                return null;
            }
            return q;
        }
        new StringBuffer().append("PaySMS.getPrice: currentValidProfiles: ").append(a == null ? "NULL" : "Size: " + a.size());
        if (a == null) {
            if (j) {
                return " ";
            }
            return null;
        }
        int n2 = -1;
        if (l.f() == 0) {
            for (int i2 = 0; i2 < a.size(); ++i2) {
                int n3 = (Integer)a.elementAt(i2);
                try {
                    if (Integer.parseInt(a[n3][14]) != n) continue;
                    n2 = n3;
                    break;
                }
                catch (Exception exception) {}
            }
        } else {
            for (int i3 = 0; i3 < b.length; ++i3) {
                if (!b[i3][0].equals(z)) continue;
                return b[i3][9];
            }
        }
        new StringBuffer().append("PaySMS.getPrice: profileIndex: ").append(n2);
        if (n2 == -1) {
            if (j) {
                return " ";
            }
            return null;
        }
        return a[n2][4];
    }

    public static long a(long l2, int n) {
        int n2;
        new StringBuffer().append("PaySMS.getVirtualCurrency: begin basecurrency ").append(l2).append(", pricepoint").append(n);
        long l3 = 0L;
        if (l.f() == 0 && a != null && a.size() > 0) {
            for (n2 = 0; n2 < a.size(); ++n2) {
                int n3 = (Integer)a.elementAt(n2);
                try {
                    if (Integer.parseInt(a[n3][14]) != n) continue;
                    l3 = l2 * Long.parseLong(a[n3][16]) / 10000000L;
                    long l4 = l2 * Long.parseLong(a[n3][16]) % 10000000L;
                    l3 += l4 / 5000000L;
                    break;
                }
                catch (Exception exception) {}
            }
        } else {
            l3 = l2 * (long)b[n - 1] * (long)a[n - 1] / (long)(b[0] * 100);
            long l5 = l2 * (long)b[n - 1] * (long)a[n - 1] % (long)(b[0] * 100);
            l3 += l5 / (long)(b[0] * 100 >> 1);
        }
        n2 = ("" + l3).length();
        int n4 = 1;
        if (n2 == 2) {
            n4 = 2;
        } else if (n2 > 2) {
            n4 = 5;
            for (int i2 = 0; i2 < n2 - 3; ++i2) {
                n4 *= 10;
            }
        }
        new StringBuffer().append("currency:\t").append(l3).append("\tRound Up:\t").append(n4);
        if (l3 % (long)n4 != 0L) {
            l3 = (l3 / (long)n4 + 1L) * (long)n4;
        }
        new StringBuffer().append("Rounded currency:\t").append(l3);
        return l3;
    }

    private static String a(int n, int n2) {
        if (l.f() == 0) {
            for (int i2 = 0; i2 < a.size(); ++i2) {
                int n3 = (Integer)a.elementAt(i2);
                if (!a[n3][14].equals(String.valueOf(n2))) continue;
                return a[n3][n];
            }
        } else {
            for (int i3 = 0; i3 < b.length; ++i3) {
                if (!b[i3][0].equals(z)) continue;
                return b[i3][n];
            }
        }
        return "";
    }

    private static String c(int n) {
        if (l.f() != 0) {
            if (l.f() == 1) {
                return "sms_2d";
            }
            if (l.f() == 2) {
                return "http_2d";
            }
            if (l.f() == 3) {
                return "cc_2d";
            }
        }
        new StringBuffer().append("PaySMS.GetBillingType: currentValidProfiles: ").append(a == null ? "NULL" : "Size: " + a.size());
        if (a == null) {
            return "cc_2d";
        }
        int n2 = 0;
        boolean bl = false;
        for (int i2 = 0; i2 < a.size(); ++i2) {
            int n3 = (Integer)a.elementAt(i2);
            try {
                if (Integer.parseInt(a[n3][14]) != n) continue;
                n2 = n3;
                bl = true;
                break;
            }
            catch (Exception exception) {}
        }
        if (!bl) {
            return "cc_2d";
        }
        if (a[n2][6].equals("SMS")) {
            return "sms_2d";
        }
        if (a[n2][6].equals("HTTP")) {
            return "http_2d";
        }
        return null;
    }

    public static String a() {
        String string;
        String string2;
        block6: {
            int n;
            block5: {
                new StringBuffer().append("PaySMS.GetTermsAndConditions: currentValidProfiles: ").append(a == null ? "NULL" : "Size: " + a.size());
                if (a == null) {
                    return null;
                }
                string2 = null;
                string = null;
                if (l.f() != 0) break block5;
                if (a.size() <= 0) break block6;
                n = (Integer)a.elementAt(0);
                try {
                    string2 = a[n][13];
                    string = a[n][15];
                }
                catch (Exception exception) {}
                break block6;
            }
            if (b.length > 0) {
                for (n = 0; n < b.length; ++n) {
                    if (!b[n][0].equals(z)) continue;
                    string2 = b[n][13];
                    break;
                }
            }
        }
        new StringBuffer().append("PaySMS.GetTermsAndConditions: tncID = '").append(string2).append("'");
        String string3 = l.c(string2);
        new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc = '").append(string3).append("'");
        new StringBuffer().append("PaySMS.GetTermsAndConditions: supportNumber = '").append(string).append("'");
        string3 = l.a(string3, string);
        new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc without phone number = '").append(string3).append("'");
        return string3;
    }

    public static int a(String string) {
        if (string.equals("Cash")) {
            return c.size();
        }
        if (string.equals("Coin")) {
            return d.size();
        }
        return -1;
    }

    private static void d() {
        int n;
        int n2;
        int n3;
        int n4;
        c.removeAllElements();
        d.removeAllElements();
        if (l.f() == 0 && a != null && a.size() > 0) {
            for (n4 = 0; n4 < a.size(); ++n4) {
                n3 = (Integer)a.elementAt(n4);
                n2 = Integer.parseInt(a[n3][14]);
                if (l.a(n2, "Cash")) {
                    c.addElement(new Integer(n2));
                }
                if (!l.a(n2, "Coin")) continue;
                d.addElement(new Integer(n2));
            }
        } else if (j || l.f() != 0) {
            new StringBuffer().append("PaySMS.parseValidItems: IAP_TEST_FIELD or CC. creditCardEnabled = ").append(j);
            for (n4 = 1; n4 <= j; ++n4) {
                if (l.a(n4, "Cash")) {
                    c.addElement(new Integer(n4));
                }
                if (!l.a(n4, "Coin")) continue;
                d.addElement(new Integer(n4));
            }
        }
        for (n4 = 0; n4 < c.size() - 1; ++n4) {
            for (n3 = n4 + 1; n3 < c.size(); ++n3) {
                n2 = (Integer)c.elementAt(n4);
                if (n2 <= (n = ((Integer)c.elementAt(n3)).intValue())) continue;
                c.setElementAt(new Integer(n), n4);
                c.setElementAt(new Integer(n2), n3);
            }
        }
        for (n4 = 0; n4 < d.size() - 1; ++n4) {
            for (n3 = n4 + 1; n3 < d.size(); ++n3) {
                n2 = (Integer)d.elementAt(n4);
                if (n2 <= (n = ((Integer)d.elementAt(n3)).intValue())) continue;
                d.setElementAt(new Integer(n), n4);
                d.setElementAt(new Integer(n2), n3);
            }
        }
        new StringBuffer().append("PaySMS.parseValidItems: number of cash: ").append(c.size());
        new StringBuffer().append("PaySMS.parseValidItems: number of coin: ").append(d.size());
    }

    public static int a(int n, String string) {
        new StringBuffer().append("PaySMS.getPricePoint: itemIndex").append(n).append(", itemType ").append(string);
        if (string.equals("Cash") && n <= c.size()) {
            return (Integer)c.elementAt(n);
        }
        if (string.equals("Coin") && n <= d.size()) {
            return (Integer)d.elementAt(n);
        }
        return -1;
    }

    private static int b(int n, String string) {
        int n2;
        block2: {
            block3: {
                n2 = -1;
                if (!string.equals("Cash")) break block3;
                for (int i2 = 0; i2 < c.size(); ++i2) {
                    if ((Integer)c.elementAt(i2) != n) continue;
                    n2 = i2;
                    break block2;
                }
                break block2;
            }
            if (!string.equals("Coin")) break block2;
            for (int i3 = 0; i3 < d.size(); ++i3) {
                if ((Integer)d.elementAt(i3) != n) continue;
                n2 = i3;
                break;
            }
        }
        return n2;
    }

    private static boolean a(int n, String string) {
        String string2 = l.d("IAP-ContentID-" + string + "-" + n);
        boolean bl = false;
        if (b.contains(string2)) {
            bl = true;
        }
        new StringBuffer().append("PaySMS.isValidContentID: IAP-ContentID-").append(string).append("-").append(n).append(": ").append(string2).append(bl ? " - Valid" : " - Invalid");
        return bl;
    }

    private static String c(String string) {
        new StringBuffer().append("PaySMS.retrieveTermsAndConditions: id = '").append(string).append("'");
        if (string == null || string.length() == 0) {
            return "";
        }
        for (int i2 = 0; i2 < c.length; ++i2) {
            if (c[i2] == null) continue;
            new StringBuffer().append("PaySMS.retrieveTermsAndConditions: profilesTexts[").append(i2).append("][TEXT_PROFILE_ID] = '").append(c[i2][0]).append("'");
            if (!l.b(c[i2][0], string)) continue;
            return c[i2][1];
        }
        return "";
    }

    private static String a(String string, String string2) {
        String string3;
        if (string == null || string.equals("")) {
            return null;
        }
        try {
            int n = string.indexOf("<phone>");
            int n2 = string.indexOf("</phone>", n + "<phone>".length());
            String string4 = string.substring(0, n);
            string3 = string.substring(n + "<phone>".length(), n2);
            String string5 = string.substring(n2 + "</phone>".length(), string.length());
            if (string2 == null || string2.equals("")) {
                string3 = string4 + string5;
            } else {
                int n3 = string3.indexOf("<support_number>");
                int n4 = "<support_number>".length();
                string3 = string3.substring(0, n3) + string2 + string3.substring(n3 + n4, string3.length());
                string3 = string4 + string3 + string5;
            }
        }
        catch (Exception exception) {
            return string;
        }
        return string3;
    }

    private static String[][] b() {
        int n;
        String[] stringArray = l.b(u);
        if (stringArray == null) {
            return null;
        }
        String[][] stringArray2 = new String[stringArray.length][2];
        for (n = 0; n < stringArray.length; ++n) {
            int n2 = stringArray[n].indexOf(59);
            if (n2 == -1) continue;
            stringArray2[n][0] = new String(stringArray[n].substring(0, n2));
            stringArray2[n][1] = new String(stringArray[n].substring(n2 + 1, stringArray[n].length()));
        }
        for (n = 0; n < stringArray2.length; ++n) {
            new StringBuffer().append("PaySMS.loadSpecificTextsFile: ID: ").append(stringArray2[n][0]).append(" TEXT: ").append(stringArray2[n][1]);
        }
        return stringArray2;
    }

    private static String d(String string) {
        if ((string = a.getAppProperty(string)) == null) {
            string = "";
        }
        return string;
    }

    private static int f() {
        if (y.equals("0")) {
            return 0;
        }
        if (y.equals("1")) {
            return 1;
        }
        if (y.equals("2")) {
            return 2;
        }
        return 0;
    }

    private static boolean a(String[] stringArray, String[] stringArray2, String[] stringArray3) {
        int n;
        if (stringArray3 == null) {
            i = 8;
            return false;
        }
        for (int i2 = 0; i2 < stringArray3.length; ++i2) {
            new StringBuffer().append("PaySMS.loadProfileConfiguration: profilesArgs[").append(i2).append("]: ").append(stringArray3[i2]);
        }
        String[] stringArray4 = stringArray2;
        int n2 = 0;
        int[] nArray = new int[stringArray3.length];
        String[][] stringArray5 = new String[stringArray3.length][17];
        int n3 = 0;
        int[] nArray2 = new int[stringArray3.length];
        block3: for (n = 0; n < stringArray3.length; ++n) {
            int n4;
            int n5 = 0;
            for (n4 = 0; n4 < 16; ++n4) {
                String string;
                int n6 = stringArray3[n].indexOf(";", n5);
                stringArray5[n][n4] = string = new String(stringArray3[n].substring(n5, n6));
                n5 = n6 + 1;
            }
            if (l.a(stringArray5[n][0])) {
                nArray2[n3++] = n;
            }
            if (stringArray5[n][6].equals("CC")) {
                e = stringArray5[n];
            }
            for (n4 = 0; n4 < stringArray4.length; ++n4) {
                String string = stringArray4[n4];
                if (string == null || string.length() == 0 || !stringArray5[n][0].equals(string)) continue;
                if (l.a(stringArray5[n][0]) || stringArray5[n][6].equals("CC")) continue block3;
                nArray[n2++] = n;
                stringArray4[n4] = null;
                continue block3;
            }
        }
        if (n3 != 0) {
            b = new String[n3][];
            for (n = 0; n < b.length; ++n) {
                l.b[n] = stringArray5[nArray2[n]];
            }
        }
        if (n2 == 0) {
            return false;
        }
        a = new String[n2][];
        for (n = 0; n < a.length; ++n) {
            l.a[n] = stringArray5[nArray[n]];
        }
        try {
            for (n = 0; n < n2; ++n) {
                String string = a[n][9];
                String string2 = a[n][7];
                int n7 = Integer.parseInt(a[n][14]);
                if (string2 != null) {
                    l.a[n][16] = "" + l.a(string) * (long)(100 + Integer.parseInt(a[n][5])) * 100000L / l.a(string2);
                    new StringBuffer().append("bonus    ").append(100 + Integer.parseInt(a[n][5])).append(", tier ").append(n7);
                }
                new StringBuffer().append("profile Id :\t").append(a[n][0]).append("\tTier:\t").append(n7).append("\tRatios :\t").append(a[n][16]);
            }
        }
        catch (Exception exception) {}
        l.e();
        return true;
    }

    private static void e() {
        int n;
        int n2 = a.length;
        if (e != null) {
            ++n2;
        }
        a = new Vector[n2];
        for (n2 = 0; n2 < a.length; ++n2) {
            l.a[n2] = new Vector();
            String string = a[n2][3];
            new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(a[n2][0]);
            n = 0;
            int n3 = string.indexOf("\u00ac", 0);
            if (n3 == -1) {
                a[n2].addElement(string);
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(string);
            } else {
                while (n3 != -1) {
                    a[n2].addElement(new String(string.substring(n, n3)));
                    new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(string.substring(n, n3));
                    n = n3 + 1;
                    n3 = string.indexOf("\u00ac", n);
                }
                a[n2].addElement(new String(string.substring(n, string.length())));
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(string.substring(n, string.length()));
            }
            new StringBuffer().append("\tSize: ").append(a[n2].size());
        }
        if (e != null) {
            l.a[l.a.length] = new Vector();
            String string = e[3];
            new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(e[0]);
            int n4 = 0;
            n = string.indexOf("\u00ac", 0);
            if (n == -1) {
                a[a.length].addElement(string);
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(string);
            } else {
                while (n != -1) {
                    a[a.length].addElement(string.substring(n4, n));
                    new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(string.substring(n4, n));
                    n4 = n + 1;
                    n = string.indexOf("\u00ac", n4);
                }
                a[a.length].addElement(new String(string.substring(n4, string.length())));
                new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(string.substring(n4, string.length()));
            }
            new StringBuffer().append("\tSize: ").append(a[a.length].size());
        }
    }

    private static boolean a(String string) {
        return string.equals(v) || string.equals(w) || string.equals(x);
    }

    private static String[] a(String objectArray) {
        if (objectArray == null) {
            return null;
        }
        Vector<String> vector = new Vector<String>();
        int n = 0;
        while (n < objectArray.length()) {
            int n2 = objectArray.indexOf(59, n);
            if (n2 != -1) {
                vector.addElement(new String(objectArray.substring(n, n2)));
                n = n2 + 1;
                continue;
            }
            n = objectArray.length();
        }
        objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    private static String[] b(String object) {
        int n;
        Object[] objectArray = "".getClass().getResourceAsStream((String)object);
        Object object2 = null;
        try {
            object2 = new ByteArrayOutputStream(2048);
            byte[] byArray = new byte[256];
            while ((n = objectArray.read(byArray)) != -1) {
                ((ByteArrayOutputStream)object2).write(byArray, 0, n);
            }
            objectArray.close();
            byArray = ((ByteArrayOutputStream)object2).toByteArray();
            ((ByteArrayOutputStream)object2).close();
            object2 = new String(byArray, 0, byArray.length, "UTF-8");
        }
        catch (Exception exception) {
            new StringBuffer().append("PaySMS.readFile: ").append((String)object).append(" Exception: ").append(exception.toString());
            return null;
        }
        int n2 = 0;
        object = new Vector();
        do {
            if ((n = ((String)object2).indexOf(10, n2)) == -1) continue;
            ((Vector)object).addElement(new String(((String)object2).substring(n2, n)));
            n2 = n + 1;
        } while (n != -1);
        objectArray = new String[((Vector)object).size()];
        ((Vector)object).copyInto(objectArray);
        return objectArray;
    }

    private static String[][] c() {
        int n;
        int n2;
        String[][] stringArray;
        if (!d || l.f() != 0) {
            return null;
        }
        Vector<Object> vector = new Vector<Object>();
        for (int i2 = 0; i2 < a.length; ++i2) {
            stringArray = a[i2][2];
            n2 = 0;
            for (n = 0; n2 == 0 && n < vector.size(); ++n) {
                if (!l.b((String)stringArray, (String)vector.elementAt(n))) continue;
                n2 = 1;
            }
            if (n2 != 0) continue;
            stringArray = a[i2][2];
            vector.addElement(stringArray);
        }
        if (e != null && j && vector.size() > 1) {
            vector.addElement("Other");
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        vector.removeAllElements();
        vector = new Vector();
        stringArray = new String[objectArray.length][2];
        n2 = 0;
        n = 0;
        for (int i3 = 0; i3 < objectArray.length; ++i3) {
            String[] stringArray2 = objectArray[i3];
            int n3 = stringArray2.indexOf(40);
            if (n3 != -1) {
                stringArray[i3][0] = stringArray2.substring(0, n3);
                int n4 = stringArray2.indexOf(58, ++n3);
                l.e(a[8]);
                if (n4 != -1) {
                    stringArray[i3][1] = stringArray2.substring(n3, n4);
                    if (f != null && f.startsWith(stringArray[i3][1], 1) && n2 <= n4 - n3) {
                        n2 = n4 - n3;
                        d = i3;
                        new StringBuffer().append("currentAutoDetectedRegion ").append(d);
                        String[] stringArray3 = new String[2];
                        stringArray2 = stringArray3;
                        stringArray3[0] = stringArray[i3][0];
                        stringArray2[1] = stringArray[i3][1];
                        vector.addElement(stringArray2);
                        ++n;
                    }
                }
            } else {
                stringArray[i3][0] = stringArray2;
                stringArray[i3][1] = "";
            }
            new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(i3).append("][REGION_NAME]: ").append(stringArray[i3][0]);
            new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(i3).append("][REGION_CODE]: ").append(stringArray[i3][1]);
        }
        if (n > 1) {
            d = -1;
            stringArray = new String[vector.size()][2];
            vector.copyInto((Object[])stringArray);
        }
        new StringBuffer().append("PaySMS.getProfilesRegions: Auto-detected: ").append(d == -1 ? "NONE" : stringArray[d][0]);
        return stringArray;
    }

    private static String e(String string) {
        RecordStore recordStore = null;
        String string2 = null;
        try {
            byte[] byArray;
            recordStore = RecordStore.openRecordStore((String)string, (boolean)true);
            if (recordStore.getNumRecords() >= 1 && (byArray = recordStore.getRecord(1)) != null) {
                string2 = new String(byArray);
            }
        }
        catch (Exception exception) {
            new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(string).append(" ").append(exception.toString());
        }
        try {
            recordStore.closeRecordStore();
        }
        catch (Exception exception) {
            new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(string).append(" ").append(exception.toString());
        }
        return string2;
    }

    public static void a(String object, String string) {
        RecordStore recordStore = null;
        try {
            recordStore = RecordStore.openRecordStore((String)object, (boolean)true);
            object = string.getBytes();
            if (recordStore.getNumRecords() >= 1) {
                recordStore.setRecord(1, (byte[])object, 0, ((Object)object).length);
            } else {
                recordStore.addRecord((byte[])object, 0, ((Object)object).length);
            }
        }
        catch (Exception exception) {
            new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(exception.toString());
        }
        if (recordStore != null) {
            try {
                recordStore.closeRecordStore();
                return;
            }
            catch (Exception exception) {
                new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(exception.toString());
            }
        }
    }

    private static boolean h() {
        String string = l.e(a[0]);
        return string != null && string.equals("1");
    }

    private static boolean i() {
        String string = l.e(a[4]);
        return string != null && string.equals("1");
    }

    private static String i() {
        String string = l.e(a[1]);
        if (string != null) {
            return string;
        }
        return "";
    }

    private static long c() {
        try {
            String string = l.e(a[11]);
            if (string != null) {
                return Long.parseLong(string);
            }
        }
        catch (Exception exception) {}
        return 1L;
    }

    public static String b() {
        String string = l.e(a[5]);
        if (string != null) {
            return string;
        }
        return "";
    }

    private static boolean j() {
        String string = l.e(a[3]);
        if (string == null || string.length() == 0) {
            return false;
        }
        Vector<Integer> vector = new Vector<Integer>();
        int n = 0;
        int n2 = string.indexOf(";");
        while (n2 != -1) {
            String string2 = string.substring(n, n2);
            vector.addElement(new Integer(Integer.parseInt(string2)));
            n = n2 + 1;
            n2 = string.indexOf(";", n);
        }
        a = vector;
        return true;
    }

    private static void b(Vector vector) {
        String string = "";
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            string = string + vector.elementAt(i2) + ";";
        }
        new StringBuffer().append("PaySMS.storeProfileID: ").append(string);
        l.a(a[3], String.valueOf(string));
    }

    private static String j() {
        int n = Math.abs(new Random().nextInt() % 9999);
        while (n < 1000) {
            if (n >= 1000) continue;
            n += 1000;
        }
        return String.valueOf(n);
    }

    private static boolean b(String string) {
        return string == null || string.length() == 0 || string.equals("null");
    }

    private static boolean a(String string, String string2) {
        if (l.b(string) || l.b(string2)) {
            return false;
        }
        int n = string2.length();
        for (int i2 = 0; i2 <= string.length() - n; ++i2) {
            if (!l.b(string.substring(i2, i2 + n), string2)) continue;
            return true;
        }
        return false;
    }

    private static String[] a(String[] stringArray) {
        Vector<String> vector = new Vector<String>();
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            boolean bl = false;
            for (int i3 = 0; i3 < i2; ++i3) {
                if (!stringArray[i2].equals(stringArray[i3])) continue;
                bl = true;
                break;
            }
            if (bl) continue;
            vector.addElement(stringArray[i2]);
        }
        Object[] objectArray = new String[vector.size()];
        vector.copyInto(objectArray);
        return objectArray;
    }

    public static int d() {
        if (a == null || a.size() <= 0) {
            return 0;
        }
        if (l.f() != 0) {
            return 8;
        }
        try {
            int n;
            int n2 = (Integer)a.elementAt(0);
            String string = a[n2][0];
            new StringBuffer().append("profileID : ").append(string);
            for (n = 0; n < f.length; ++n) {
                if (string == null || !string.equals(f[n])) continue;
                new StringBuffer().append("PaySMS. Found valid the Turkey profile: ").append(a[n2][0]);
                return 3;
            }
            for (n = 0; n < g.length; ++n) {
                if (string == null || !string.equals(g[n])) continue;
                new StringBuffer().append("PaySMS. Found valid the FR Open Market profile: ").append(a[n2][0]);
                return 6;
            }
            for (n = 0; n < h.length; ++n) {
                if (string == null || !string.equals(h[n])) continue;
                new StringBuffer().append("PaySMS. Found valid the Indonesia Telkomsel profile: ").append(a[n2][0]);
                return 11;
            }
            String string2 = a[n2][2];
            if (string2 == null) {
                return 8;
            }
            string2 = string2.substring(string2.indexOf(40) + 1, string2.lastIndexOf(58)).trim();
            new StringBuffer().append("PaySMS. Country code ").append(string2);
            if (a[n2][6].equals("SMS")) {
                if (string2.equals("49:DE")) {
                    return 2;
                }
                if (string2.equals("45:DK")) {
                    return 4;
                }
                if (string2.equals("43:AT")) {
                    return 5;
                }
                if (string2.equals("91:IN")) {
                    return 7;
                }
                if (string2.equals("34:ES")) {
                    return 0;
                }
                if (string2.equals("44:GB")) {
                    return 10;
                }
                if (string2.equals("58:VE")) {
                    return 12;
                }
            }
            if (string2.equals("34:ES") && a[n2][6].equals("HTTP")) {
                return 9;
            }
        }
        catch (Exception exception) {
            new StringBuffer().append("PaySMS. GetSpecialFlow,  Exception: ").append(exception);
        }
        return 8;
    }

    public static int a(int n) {
        if (l.d() == 6) {
            if (a == null) {
                return 0;
            }
            for (int i2 = 0; i2 < a.size(); ++i2) {
                int n2 = (Integer)a.elementAt(i2);
                try {
                    if (Integer.parseInt(a[n2][14]) != n) continue;
                    long l2 = l.a(a[n2][9]);
                    new StringBuffer().append("Fixed price : ").append(a[n2][9]);
                    if (l2 <= 500000L) break;
                    new StringBuffer().append("Found Price greater than 5 Euros : ").append(a[n2][9]);
                    return 1;
                }
                catch (Exception exception) {}
            }
        }
        return 0;
    }

    public static String c() {
        try {
            String string = f.a.getAppProperty("URL-SUPPORT");
            if (string == null) {
                return null;
            }
            String string2 = l.e(a[7]);
            if (string2 == null || string2.equals("")) {
                return string;
            }
            Object object = string2.substring(0, string2.indexOf(95));
            string2 = string2.substring(string2.indexOf(95) + 1);
            object = f.a(((String)object).getBytes(), "a8bc1a23a89", true);
            return string + "&extra_1=" + f.a((byte[])object) + "&extra_2=" + string2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static long a(String string) {
        int n = (string = string.replace(',', '.')).indexOf(a);
        if (n == -1) {
            return (long)l.b(string) * 100000L;
        }
        long l2 = (long)l.b(string.substring(0, n)) * 100000L;
        string = string.substring(n + 1);
        while (string.length() < "100000".length() - 1) {
            string = string + "0";
        }
        return l2 + (long)l.b(string);
    }

    private static int b(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            return -1;
        }
    }

    private static boolean b(String string, String string2) {
        if (string == null || string2 == null) {
            new StringBuffer().append("PaySMS.equalsIgnoreCase: s1 = '").append(string).append("', s2 = '").append(string2).append("'");
            return false;
        }
        return string.toUpperCase().equals(string2.toUpperCase());
    }

    static /* synthetic */ String d() {
        return d;
    }

    static /* synthetic */ String e() {
        return m;
    }

    static /* synthetic */ String a(String string) {
        n = string;
        return n;
    }

    static /* synthetic */ String b(String string) {
        return l.d(string);
    }

    static /* synthetic */ String f() {
        return n;
    }

    static /* synthetic */ int e() {
        return g;
    }

    static /* synthetic */ String[][] a() {
        return a;
    }

    static /* synthetic */ boolean a(boolean bl) {
        f = bl;
        return f;
    }

    static /* synthetic */ boolean c() {
        g = false;
        return false;
    }

    static /* synthetic */ int b(int n) {
        i = n;
        return i;
    }

    static /* synthetic */ String g() {
        return k;
    }

    static /* synthetic */ Timer a(Timer timer) {
        a = timer;
        return a;
    }

    static /* synthetic */ Timer a() {
        return a;
    }

    static /* synthetic */ String h() {
        return l;
    }

    static /* synthetic */ long a() {
        return a++;
    }

    static /* synthetic */ long b() {
        return a;
    }

    static /* synthetic */ Vector a() {
        return a;
    }

    static /* synthetic */ void a(Vector vector) {
        l.b(vector);
    }

    static {
        c = false;
        a = null;
        d = false;
        a = null;
        b = null;
        c = null;
        d = -1;
        a = null;
        e = -1;
        b = null;
        f = -1;
        d = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = "";
        l = "";
        g = -1;
        a = 1L;
        a = new String[]{"rmsSMS", "Cm1zY2", "rmsPackageId", "rmsAvailableProfiles", "rmsRedeemUnlocked", "rmsItemType", "rmsUnlocked", "rmsMoneySpent", "rmsCurrentRegion", "rmsCurrentCarrier", "Cm1zY1", "rmsSMSCnt"};
        e = false;
        f = false;
        g = false;
        h = false;
        i = false;
        m = "";
        n = "";
        o = "";
        p = "";
        q = "";
        r = "";
        s = "";
        t = "/IAP_profiles";
        u = "/IAP_texts";
        a = null;
        a = null;
        a = false;
        b = false;
        h = 0;
        i = 0;
        v = "933";
        w = "5023";
        x = "5025";
        y = "";
        z = "";
        d = new String[]{"Cash", "Coin"};
        b = null;
        c = null;
        d = null;
        e = null;
        j = false;
        f = new String[]{"2124", "2126", "2128", "2130", "3501", "3503", "3505", "3507", "3509", "3511"};
        g = new String[]{"1152", "1154", "1049", "1156", "2741", "2743", "2745", "2878"};
        h = new String[]{"1104", "1106", "1108", "1110"};
        a = new int[]{100, 110, 120, 130, 140, 150};
        b = new int[]{199, 399, 999, 1999, 2999, 3999};
        int[] nArray = new int[]{25, 50, 100, 150};
        j = 4;
        a = (char)46;
    }
}

