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

public final class k implements Runnable, CommandListener {
   private static String a = "2.3";
   private static String b;
   private static String c = "";
   private static String d;
   private static Font a;
   private static String e = "URL";
   private static int a = 2;
   private static boolean[] a = new boolean[1];
   private static int[] a = new int[1];
   private static int b = -1;
   private static int c = 8;
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
   private static String f = "ZVIP";
   private static String g = "SCFR";
   private static String h = "GMCL";
   private static String i = "CCTL";
   private static String j = "TITLE-FREEMIUM";
   private static String k = "TITLE-GLCLUB";
   private static String l = "URL-OPERATOR";
   private static int p = 1;
   private static int q = 4;
   private static int r = 8;
   private static int s = 9;
   private static int t = 10;
   private static int u = 11;
   private static int v = 12;
   private static int w = 13;
   private static int x = 14;
   private static int y = 1;
   private static int z = 6;
   private static int A = 7;
   private static int B = 8;
   private static int C = 9;
   private static int D = 10;
   private static int E = 11;
   private static int F = 12;
   private static int G = 13;
   private static int H = 14;
   private static int I = 21;
   private static int J = 22;
   private static int K = 24;
   private static int L = 25;
   private static int M;
   private static int[] b;
   private static int N;
   private static int O;
   private static int P;
   private static int Q;
   private static int R;
   private static String m = "IGP-CATEGORIES";
   private static String n = "IGP-PROMOS";
   private static String o = "IGP-FREEMIUM";
   private static String p = "URL-TEMPLATE-GAME";
   private static String q = "more_games_url";
   private static String r = "more_games_status";
   private static String s = null;
   private static String t = null;
   private static String u = "on";
   private static String v = "XXXX";
   private static String w;
   private static String x = "&ctg=";
   private static String y = "&lg=";
   private static String z = "SC";
   private static String A = "ingameads.gameloft.com/redir";
   private static String B = ";";
   private static String C;
   private static boolean a;
   private static boolean b;
   private static String D;
   private static boolean c = false;
   private static String[] a = new String[0];
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
   private static k a = null;
   private static boolean f = false;
   private static String E = null;
   private static boolean g = false;
   private static int U;
   private static int V;
   private static int W;
   private static int X;
   private static int Y;
   private static int Z;
   private static d[] a;
   private static d a;
   private static int aa = -1;
   private static String[] e;
   private static int[] c;
   private static boolean[] b;
   private static int ab = 0;
   private static int ac = 0;
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
   private static String I = "";
   private static String J;
   private static String K;
   private static boolean i = false;
   private static int aj;
   private static int ak;
   private static int al;
   private static int am;

   private static boolean b() {
      a();

      try {
         InputStream var0;
         b = new int[M = (M = (var0 = a("/dataIGP")).read() & 0xFF) + ((var0.read() & 0xFF) << 8)];

         for (int var1 = 0; var1 < M; var1++) {
            b[var1] = var0.read() & 0xFF;
            b[var1] = b[var1] + ((var0.read() & 0xFF) << 8);
            b[var1] = b[var1] + ((var0.read() & 0xFF) << 16);
            b[var1] = b[var1] + ((var0.read() & 0xFF) << 24);
         }

         var0.close();
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   private static void a() {
      b = null;
      M = 0;
      System.gc();
   }

   private static byte[] a(int var0) {
      if (var0 >= 0 && var0 < M - 1) {
         int var1;
         if ((var1 = b[var0 + 1] - b[var0]) == 0) {
            return null;
         }

         byte[] var2 = null;

         try {
            InputStream var3;
            (var3 = a("/dataIGP")).skip(2 + 4 * M + b[var0]);
            var0 = (var2 = new byte[var1]).length;

            while (var0 > 0) {
               var0 -= var3.read(var2);
            }

            var3.close();
         } catch (Exception var4) {
         }

         return var2;
      } else {
         return null;
      }
   }

   private static int a(byte[] var0) {
      return (var0[N++] & 0xFF) + ((var0[N++] & 0xFF) << 8);
   }

   private static String a(int var0) {
      return "" + b[var0];
   }

   private static void a(String var0, Graphics var1, int var2, int var3, int var4) {
      a(var0, var1, var2, var3, var4, 3, 10, false);
   }

   private static void b(String var0, Graphics var1, int var2, int var3, int var4) {
      a(var0, var1, var2, var3, var4, 3, 10, true);
   }

   private static void a(String var0, Graphics var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (var7) {
         a.d(P);
         short[] var8 = a.a(var0, var2, false);
         short[] var9 = var8;
         a.a(var1, var0, var9, var3, var4, 0, 10, 3, -1, false);
      } else {
         a.d(P);
         a.a(var1, var0, var3, var4, 3);
      }
   }

   public static void a(MIDlet var0, Canvas var1, int var2, int var3) {
      var1 = var1;
      var0 = var0;
      new StringBuffer()
         .append("initialize(midlet = ")
         .append(var0)
         .append(", game = ")
         .append(var1)
         .append(", screenWidth = ")
         .append(var2)
         .append(", screenHeight = ")
         .append(var3)
         .append(", cmdListener = ")
         .append((Object)null)
         .append(")");
      aj = var2;
      ak = var3;
      al = aj >> 1;
      am = ak >> 1;
      if (2 > aj) {
         a = 2;
      }

      if (a == null && var1 != null) {
         a = var0;
         b();
         String var5 = b;
         new StringBuffer().append(var5).append("");
         c();
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
         n = null;
         System.gc();
      }
   }

   private static boolean a(String var0) {
      String var1;
      return var0 == null
         ? false
         : (var1 = var0.trim()).length() != 0
            && var1.toUpperCase().compareTo("DEL") != 0
            && var1.toUpperCase().compareTo("NO") != 0
            && var1.toUpperCase().compareTo("0") != 0;
   }

   private static String a(String var0, String var1, String var2) {
      String var3 = "";

      try {
         if (var2 != null && var0 != null && var1 != null) {
            int var4 = var0.indexOf(var1 + "=");
            var2 = var2.trim();
            if (var4 >= 0 && var2.length() > 0) {
               var4 += var1.length() + 1;
               int var8;
               if ((var8 = var0.indexOf(B, var4)) < 0) {
                  var8 = var0.length();
               }

               if ((var3 = var0.substring(var4, var8).trim()).length() == 0 || var3.compareTo("0") == 0 || var3.toUpperCase().compareTo("NO") == 0) {
                  var3 = "";
               } else if (var3.toUpperCase().compareTo("DEL") != 0 && var1.compareTo("OP") != 0) {
                  int var6;
                  if ((var6 = var2.indexOf(v)) >= 0) {
                     var3 = var2.substring(0, var6) + var3 + var2.substring(var6 + v.length());
                  } else {
                     var3 = var2;
                  }
               }
            }
         }
      } catch (Exception var5) {
         var3 = "";
      }

      return var3;
   }

   private static void a(int var0, String var1, int var2, String var3, String var4, int var5) {
      try {
         String var6 = "";
         String var8;
         if (b) {
            var8 = a(a.getAppProperty(var3), var1, var4);
            if (var1.equals(g)) {
               var3 = o;
               var6 = a(a.getAppProperty(var3), c[var0 - d.length], var4);
            }
         } else if (var1.equals(i)) {
            var8 = I;
         } else {
            var3 = e + "-" + var1;
            var8 = a.getAppProperty(var3);
         }

         if (var1.equals(g)) {
            if (b) {
               int var11;
               if ((var11 = var8.indexOf(g)) >= 0) {
                  var8 = var8.substring(0, var11) + c[var0 - d.length] + var8.substring(var11 + c[var0 - d.length].length());
               }
            } else {
               var3 = e + "-" + g + "-" + c[var0 - d.length];
               var8 = a.getAppProperty(var3);
               var3 = e + "-" + g + "-" + c[var0 - d.length];
               var6 = a.getAppProperty(var3);
            }
         }

         boolean var14 = a(var8);
         boolean var15 = true;
         if (var1.equals(g)) {
            var15 = a(var6);
         }

         if (var14 && var15 && (var8.toUpperCase().compareTo("NO") != 0 || var8.toUpperCase().compareTo("0") != 0)) {
            b[var0] = true;
            e[var0] = var8;
            if (b[var0]) {
               c[var0] = var5;
               switch (var5) {
                  case 4:
                     ab++;
                     if (a) {
                        e[var0] = e[var0] + x + z + (ab < 10 ? "0" : "") + ab;
                        return;
                     }
                  case 5:
                  default:
                     break;
                  case 6:
                     ac++;
                     if (a) {
                        e[var0] = e[var0] + x + g;
                        return;
                     }
                     break;
                  case 7:
                     if (a) {
                        e[var0] = e[var0] + x + h;
                        return;
                     }
                     break;
                  case 8:
                     if (a) {
                        e[var0] = e[var0] + x + i;
                     }
               }
            }
         }
      } catch (Exception var7) {
      }
   }

   private static String[] a(byte[] var0) {
      String[] var1 = new String[a(var0)];

      for (int var2 = 0; var2 < var1.length; var2++) {
         int var3 = a(var0);
         var1[var2] = new String(var0, N, var3);
         N += var3;
      }

      return var1;
   }

   private static void b() {
      try {
         if (!b()) {
            g = false;
            return;
         }

         byte[] var0;
         a(var0 = a(0));
         int var1 = a(var0);
         N += var1;
         var1 = a(var0);
         D = new String(var0, N, var1);
         N += var1;
         var1 = a(var0);
         N += var1;
         var1 = a(var0);
         N += var1;
         var1 = a(var0);
         N += var1;
         c = a(var0) == 1;
         a(var0);
         a(var0);
         a = a(var0);
         d = a(var0);
         c = a(var0);
         a(var0);

         for (int var24 = 0; var24 < a.length; var24++) {
            a[var24] = a(var0) == 1;
         }

         try {
            var1 = a(var0);
            c = new String(var0, N, var1);
            new StringBuffer().append("IGP dataIGP version: ").append(c);
            new StringBuffer().append(a).append("z");
            if (!c.startsWith(a)) {
               new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(c);
               new StringBuffer().append("IGP Class version : ").append(a);
            }
         } catch (Exception var4) {
            g = false;
         }

         a();
      } catch (Exception var5) {
         g = false;
         return;
      }

      String[] var26 = c;
      String[] var6 = d;
      int var7 = (d.length - 1 > 0 ? var6.length - 1 : 0) + (var26.length - 1 > 0 ? var26.length - 1 : 0);
      i = (o = (n = (m = (l = (k = (h = (g = (j = ++var7 + 1) + 1) + 1) + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1) + 1) + 1) + 1) + 1 + 1 + 1 + 1 + 1 + 1) + 1;
      S = d.length + c.length + 1 + 1;

      for (int var9 = 0; var9 < a.length; var9++) {
         if (a[var9]) {
            a[var9] = ++c;
         } else {
            a[var9] = --b;
         }
      }

      c++;
      e = new String[S];
      b = new boolean[S];
      c = new int[S];

      for (int var10 = 0; var10 < b.length; var10++) {
         b[var10] = false;
      }

      f = (e = (d = d.length) + c.length) + 1;
      String var11 = q;
      s = a.getAppProperty(var11);
      String var12 = r;
      t = a.getAppProperty(var12);
      if (s != null && t.toLowerCase().equals(u.toLowerCase())) {
         K = s;
         i = true;
         g = true;
      } else {
         try {
            String var13 = p;
            if ((C = a.getAppProperty(var13)) != null) {
               C = C.trim();
               b = true;
               if (C.indexOf(A) != -1) {
                  a = true;
               }
            }
         } catch (Exception var3) {
         }

         for (int var14 = 0; var14 < d.length; var14++) {
            a(var14, d[var14], 7, n, C, 4);
         }

         for (int var15 = 0; var15 < c.length; var15++) {
            a(d + var15, g, 7, m, C, 6);
         }

         try {
            String var16 = l;
            String var17;
            if (a(var17 = a.getAppProperty(var16).trim())) {
               I = var17;
            }
         } catch (Exception var2) {
         }

         a(e, h, 7, m, C, 7);
         a(f, i, 7, m, C, 8);
         String var18 = j;
         F = a(a.getAppProperty(var18));
         String var19 = k;
         G = a(a.getAppProperty(var19));
         if ((aa = a()) > 0) {
            g = true;
         }

         new StringBuffer().append("isAvailable = ").append(g);
      }
   }

   private static String a(String var0) {
      if (var0 == null) {
         return "0";
      }

      String var1 = "";
      var0 = var0.toUpperCase();
      boolean var2 = false;
      int var3 = aj;
      int var4 = ak;
      if (var3 >= var4 && var3 == 320) {
         var2 = true;
      }

      char[] var6 = var0.toCharArray();

      for (int var7 = 0; var7 < var6.length; var7++) {
         char var8 = var6[var7];
         if (!var2 || var8 != '\n') {
            var1 = var1 + var8;
         }
      }

      return var1;
   }

   public static boolean a() {
      return g;
   }

   public static void a(String var0) {
      new StringBuffer().append("enterIGP(loadingMsg = ").append(var0).append(", appLanguage = ").append(0).append(" (").append(a[0]).append(")");
      if (i) {
         c();
         f = true;
         E = K;
      } else {
         if (0 < a.length) {
            H = var0;
            Y = -1;
            U = 0;
            X = -1;
            W = 0;
            f = true;
            a = Font.getFont(0, 0, 8);
            c();
         }

         Z = 4 + S;
         W = b();
      }

      RecordStore var4 = null;

      try {
         var4 = RecordStore.openRecordStore("igp19", false);
      } catch (Exception var3) {
         try {
            var4 = RecordStore.openRecordStore("igp19", true);
         } catch (Exception var2) {
         }
      }

      try {
         if (var4 != null) {
            var4.closeRecordStore();
         }
      } catch (Exception var1) {
      }
   }

   private static boolean c() {
      int var0 = 0;

      for (int var1 = 0; var1 < a.length; var1++) {
         if (a[var1].equals("SP")) {
            var0 = 1;
         }
      }

      if (!var0) {
         return false;
      }

      try {
         String var4 = m;
         String var8;
         if ((var8 = a.getAppProperty(var4)) == null || var8.indexOf(f) == -1) {
            String var5 = e + "-" + f;
            return (J = a.getAppProperty(var5)) != null;
         }

         int var2;
         if ((var2 = (var0 = var8.indexOf(f) + f.length() + 1) + f.length()) >= var8.length()) {
            return false;
         }

         if (!var8.substring(var0, var2).equals(f)) {
            return false;
         }

         J = I;
         if (a) {
            if ((var0 = (J = J + w).indexOf(v)) >= 0) {
               J = J.substring(0, var0) + f + J.substring(var0 + v.length());
            }

            if (J.length() == 0) {
               return false;
            }
         }

         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   private static void c() {
      if (a == null) {
         a = new k();
      }

      new Thread(a).start();
   }

   private static int a() {
      int var0 = 0;

      for (int var1 = 0; var1 < b.length; var1++) {
         if (b[var1]) {
            var0++;
         }
      }

      return var0;
   }

   private static int b() {
      for (int var0 = 0; var0 < b.length; var0++) {
         if (b[var0]) {
            return var0;
         }
      }

      return -1;
   }

   private static void a(int var0) {
      try {
         N = 0;
         switch (var0) {
            case -1:
               a = new d[x];
               return;
            case 0:
               return;
            case 1:
               b();
               byte[] var7;
               a(var7 = a(var0));
               int var1;
               b = new String[var1 = a(var7)];
               byte[] var2 = new byte[var1];
               System.arraycopy(var7, N, var2, 0, var1);
               N += var1;
               a(var7);
               int var3;
               a = new short[var3 = var7[N++] & 0xFF | (var7[N++] & 255) << 8];

               for (int var11 = 0; var11 < var3 - 1; var11++) {
                  a[var11] = (short)((var7[N++] & 255) + ((var7[N++] & 255) << 8));
               }

               a[var3 - 1] = (short)var1;

               for (int var12 = 0; var12 < var3; var12++) {
                  var0 = var12 == 0 ? 0 : a[var12 - 1] & 65535;
                  if ((var1 = (a[var12] & '\uffff') - var0) != 0) {
                     try {
                        b[var12] = new String(var2, var0, var1, "UTF-8");
                     } catch (Exception var5) {
                     }
                  }
               }

               return;
            case 2:
               f.c("/11");
               a = a(t, 3);
               short[] var10 = (short[])f.a(v);
               a.a(var10);
               O = a.d();
               if (ak > 160 && ak > 220 && ak <= 320) {
                  a.c(-1);
                  if (c) {
                     a.c(0);
                  }
               }

               f.k();
               return;
            case 3:
               f.c("/11");

               for (int var4 = 0; var4 < x; var4++) {
                  if (var4 != t && var4 != v && var4 != u && var4 != w) {
                     a[var4] = a(var4, 1);
                  }
               }

               f.k();
            default:
               return;
            case 4:
               return;
            case 5:
               return;
            case 6:
               return;
            case 7:
               return;
            case 8:
         }
      } catch (Exception var6) {
      }
   }

   private static void b(boolean var0) {
      for (int var1 = 0; var1 < x; var1++) {
         if (a[var1] != null && var1 != t && var1 != v && var1 != u && var1 != w && var1 != 0) {
            a[var1].a();
            a[var1] = null;
         }
      }

      if (var0) {
         a();
         f.k();
         a = null;
         b = null;
         H = null;

         for (int var2 = 0; var2 < x; var2++) {
            if (a[var2] != null) {
               a[var2].a();
               a[var2] = null;
            }
         }

         a = null;
         a.a();
         a = null;
      }

      System.gc();
   }

   public static void a(boolean var0) {
      if (!var0) {
         if (U == 5) {
            U = X;
            Y = -1;
         }
      } else {
         if (U == 0 || U == 2) {
            X = U;
            U = 5;
         }
      }
   }

   public static boolean a(int var0) {
      if (i) {
         return true;
      }

      if (!g) {
         return true;
      }

      V = var0;
      switch (U) {
         case 0:
            if (Y < Z) {
               a(Y);
            } else {
               U = 1;
               d();
               var0 = aj;
               int var15 = ak;
               a = new int[L][];

               for (int var2 = 0; var2 < L; var2++) {
                  a[var2] = new int[2];
                  a[var2][0] = 0;
                  a[var2][1] = 0;
               }

               int var17 = a(0, 0);
               int var3 = b(0, 0);
               int var4 = a(p, 0);
               int var5 = b(p, 0);
               int var6 = b(0, 9);
               a.a(a(o), null);
               int var9;
               short[] var7 = a.a(a(o), var9 = var0 - var17, false);
               R = d.d;
               int var8 = Q = var7[0] * O;
               if (var3 > Q) {
                  var8 = var3;
               }

               String[] var25 = new String[]{F, G, a(k), a(m)};
               String var18 = "";

               for (int var10 = 0; var10 < var25.length; var10++) {
                  if (var18.length() < var25[var10].length()) {
                     var18 = var25[var10];
                  }
               }

               a.a(var18, null);
               int var19;
               var7 = a.a(var18, var19 = var0 - 2, false);
               R = d.d;
               int var21;
               var9 = (var21 = Q = var7[0] * O) + var6 + var5 + var8;
               int var27 = var15 - var9 >> 2;
               int var23 = -3;
               if (var15 <= 160) {
                  var23 = 2;
               } else if (var15 <= 220) {
                  var23 = 1;
               } else if (var15 <= 240) {
                  var23 = 0;
               } else if (var15 <= 320) {
                  var23 = 0;
               } else if (var15 <= 360) {
                  var23 = 3;
               } else if (var15 <= 400) {
                  var23 = 1;
               } else if (var15 <= 480) {
                  var23 = 6;
               } else if (var15 <= 640) {
                  var23 = 0;
               } else if (var15 <= 800) {
                  var23 = 3;
               }

               a[0][0] = var0 >> 1;
               a[0][1] = var27 + (var21 >> 1) + var23 + -2;
               a[z][0] = 0;
               a[z][1] = a[0][1] + var27 + (var21 >> 1) - var23 - -2;
               a[y][0] = var0 >> 1;
               a[y][1] = a[z][1] + (var6 >> 1) + var23 + -2;
               int var22 = a(0, 2);
               var23 = b(0, 2);
               a[G][0] = 5;
               a[G][1] = a[z][1] + (var6 >> 1) - (var23 >> 1);
               a[H][0] = var0 - 5 - var22;
               a[H][1] = a[G][1];
               a[E][0] = var0 - a - var17;
               a[E][1] = var15 - 2 - var3;
               a[K][0] = a;
               a[K][1] = var15 - 2 - var3;
               a[A][0] = (var0 >> 1) - (var4 >> 1);
               a[A][1] = a[z][1] + var6 + var27;
               a[I][0] = var0 - var17 >> 1;
               a[I][1] = a[A][1] + var5 + (var15 - a[A][1] - var5 >> 1);
               a[B][0] = var0 >> 1;
               a[B][1] = a[A][1] + (var5 << 1) / 3;
               a[C][0] = 5;
               a[C][1] = a[A][1] + (var5 >> 1) - (b(0, 6) >> 1);
               a[D][0] = var0 - a(0, 4) - 5;
               a[D][1] = a[C][1];
               var0 = a(0, 8);
               var15 = b(0, 8);
               a[F][0] = a[A][0] + var4 - var0;
               a[F][1] = a[A][1] + var5 - var15;
               a[J][0] = 0;
               a[J][1] = a[0][1];
            }

            Y++;
            break;
         case 1:
            label177: {
               switch (V) {
                  case 21:
                  case 22:
                  case 30:
                  case 31:
                  case 32:
                  default:
                     return false;
                  case 23:
                     if (aa <= 1) {
                        return false;
                     }

                     if (W == 0) {
                        W = S - 1;
                     } else {
                        W--;
                     }

                     while (!b[W]) {
                        if (W == 0) {
                           W = S - 1;
                        } else {
                           W--;
                        }
                     }

                     d = true;
                     break label177;
                  case 24:
                     if (aa > 1) {
                        if (!d) {
                           if (W == S - 1) {
                              W = 0;
                           } else {
                              W++;
                           }

                           while (!b[W]) {
                              if (W == S - 1) {
                                 W = 0;
                              } else {
                                 W++;
                              }
                           }

                           e = true;
                        }

                        d();
                     }

                     return false;
                  case 25:
                  case 27:
                     U = 6;
                     return false;
                  case 26:
                     U = 4;
                     return false;
                  case 28:
                     label154:
                     while (true) {
                        for (W = 0; !b[W]; W++) {
                           if (W == d - 1) {
                              continue label154;
                           }
                        }

                        d();
                        return false;
                     }
                  case 29:
               }

               label176:
               while (true) {
                  W = d;

                  while (true) {
                     if (b[W]) {
                        break label176;
                     }

                     if (W == S - 1) {
                        break;
                     }

                     W++;
                  }
               }
            }

            d();
            break;
         case 2:
            b(false);
            var0 = W;
            a(Y = c[var0] == 4 ? c[var0] : (c[var0] == 6 ? 6 : (c[var0] == 7 ? 7 : (c[var0] == 8 ? 8 : -1))));
            U = 1;
            break;
         case 3:
            switch (V) {
               case 25:
               default:
                  return false;
               case 26:
                  U = 1;
                  return false;
               case 30:
                  E = null;
                  return false;
            }
         case 4:
            b(true);
            f = false;
            return true;
         case 5:
         default:
            break;
         case 6:
            String var11;
            if ((var11 = e[W]) != null && var11.length() > 0) {
               if (a) {
                  int var1;
                  if ((var1 = var11.indexOf(y)) == -1) {
                     var11 = var11 + y + a[0];
                  } else {
                     var11 = var11.substring(0, var1) + y + a[0] + var11.substring(var1 + y.length() + 2);
                  }
               }

               E = var11;
            }
      }

      return false;
   }

   private static int a(int var0, int var1) {
      return a[var0].d(var1);
   }

   private static int b(int var0, int var1) {
      return a[var0].e(var1);
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

   public static void a(Graphics var0) {
      if (!i) {
         if (g) {
            Graphics var7;
            b(var7 = var0, 0, 0, aj, ak);
            switch (U) {
               case 0:
                  var7.setColor(0);
                  int var14 = ak;
                  int var11 = aj;
                  f.c(var7, 0, 0, var11, var14);
                  int var19 = aj * 3 / 4;
                  int var5 = Z;
                  int var17 = Y;
                  var14 = var19;
                  var11 = am;
                  Graphics var9 = var7;
                  if (var17 > var5) {
                     var17 = var5;
                  }

                  int var6 = (aj - var14) / 2;
                  b(var9, var6, 0, var14 + 2, ak);
                  var9.setColor(16777215);
                  f.d(var9, var6, var11, var14, 6);
                  var14 = (var14 - 2 - 2) * var17 / var5 + 1;
                  var9.setColor(16711680);
                  int var10001 = var6 + 1 + 1;
                  var19 = var11 + 1 + 1;
                  var17 = var14;
                  f.c(var9, var10001, var19, var17, 3);
                  if (H != null && !H.trim().equals("")) {
                     var7.setColor(16777215);
                     Font var8 = a;
                     f.a.setFont(var8);
                     f.a(H, al, am - 5, 33);
                     return;
                  }
                  break;
               case 1:
                  b(var7);
                  if (System.currentTimeMillis() % 1000L > 500L) {
                     if (W != f) {
                        a(var7, true);
                        return;
                     }

                     a(var7, false);
                     return;
                  }
                  break;
               case 2:
                  return;
               case 3:
                  b(var7);
                  int var1 = ak;
                  int var2 = aj;
                  int var3 = var1 * 40 / 100;
                  a(var7, 0, var3 - 1, var2, var1 - (var3 - 1 << 1), -1);
                  a(var7, 0, var3, var2, var1 - (var3 << 1), -220209185);
                  P = 1;
                  int var10002 = var2 >> 1;
                  int var4 = var1 >> 1;
                  var3 = var10002;
                  Graphics var10 = var7;
                  b(a(i), var10, aj, var3, var4);
                  c(var7);
               case 4:
               default:
                  break;
               case 5:
                  return;
            }
         }
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[var3 * var4];

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = var5;
      }

      var0.drawRGB(var7, 0, var3, 0, var2, var3, var4, true);
   }

   private static void b(Graphics var0) {
      int var1 = aj;
      int var2 = ak;
      if (W != f) {
         ah = a[B][0];
         ai = a[B][1];
      } else {
         ah = a[B][0];
         int var3 = b(s, 0);
         int var4 = b(p, 0);
         ai = a[A][1] + (var4 - var3) / 2 + var3;
      }

      var0.setColor(16777215);
      if (a[0]) {
         var0.setColor(0);
      }

      var0.setColor(16777215);
      f.c(var0, 0, 0, var1, var2);
      var2 = a[0][0];
      int var19 = a[0][1];
      int var21 = a[y][0];
      int var5 = a[y][1];
      int var6 = a[A][0];
      int var7 = a[A][1];
      int var8 = a[F][0];
      int var9 = a[F][1];
      int var10 = a[z][0];
      int var11 = a[z][1];
      int var12 = a[I][0];
      int var13 = a[I][1];
      a(var0, 0, 9, var10, var11);
      P = 1;
      if (c[W] == 6) {
         if (!F.equals("0")) {
            b(F, var0, var1 - 2, var2, var19);
         }

         a(a(ad), var0, var1, var21, var5);
         a(var0, q + (W - d), 0, var6, var7);
         a(var0, 0, 8, var8, var9);
         if (D == null || !D.equals("TMUS")) {
            b(a(o), var0, var1 - a(0, 0) - a, var12, var13);
         }
      } else if (c[W] == 7) {
         if (!G.equals("0")) {
            b(G, var0, var1 - 2, var2, var19);
         }

         a(a(l), var0, var1, var21, var5);
         a(var0, r, 0, var6, var7);
      } else if (c[W] == 8) {
         b(a(m), var0, var1 - 2, var2, var19);
         a(a(j), var0, var1 * 3 / 4, var21, var5);
         a(var0, s, 0, var6, var7);
      } else {
         P = 1;
         b(a(k), var0, var1 - 2, var2, var19);
         a(a(ad), var0, var1 * 3 / 4, var21, var5);
         a(var0, p + W, 0, var6, var7);
      }

      int var14 = 0;
      if (aa > 1) {
         var14 = 1;
      }

      if (var14) {
         var14 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
         byte var18 = 6;
         byte var20 = 4;
         var14++;
         var21 = a[C][0];
         var5 = a[C][1];
         var6 = a[D][0];
         var7 = a[D][1];
         if (d) {
            var18 = 7;
            T++;
         }

         if (e) {
            var20 = 5;
            T++;
         }

         a(var0, 0, var18, var21 + var14, var5);
         a(var0, 0, var20, var6 - var14, var7);
         if (T > 4) {
            d = false;
            e = false;
            T = 0;
         }
      }

      c(var0);
   }

   private static void a(Graphics var0, boolean var1) {
      if (h) {
         int var2 = aj;
         int var3 = ak;
         int var4 = -1030069;
         int var5 = a[C][0];
         int var6 = a[D][0];
         int var7 = a(0, 6);
         var5 = var6 - var5 - var7 - 16;
         if (!var1) {
            var5 = var2;
         }

         var1 = a(0, 20);
         var2 = b(0, 20);
         var6 = a(0, 25);
         var7 = a(0, 25);
         int var8 = P;
         P = 0;
         a.a(a(ae), null);
         short[] var9 = a.a(a(ae), var5, false);
         R = d.d;
         Q = var9[0] * O;
         af = R;
         ag = Q;
         if (af % var6 != 0) {
            af = (af / var6 + 1) * var6;
         }

         int var21 = af / var6;
         int var10 = b(0, 10);
         if (ag < var10) {
            ag = var10;
         }

         af += var1 << 1;
         if (ai + ag + (var7 << 1) > var3) {
            ai = var3 - ag - (var7 << 1);
         }

         var3 = ah - (af >> 1);
         var10 = ai + (ag >> 1);
         var0.setColor(var4);
         int var10002 = var10 + var2;
         int var12 = ag - (var2 << 1);
         int var11 = af;
         f.c(var0, var3, var10002, var11, var12);
         a(var0, 0, 20, var3, var10);
         a(var0, 0, 23, var3, var10 + ag - var7);
         var3 += var1;

         for (int var14 = 0; var14 < var21; var14++) {
            a(var0, 0, 22, var3, var10);
            a(var0, 0, 25, var3, var10 + ag - var7);
            var3 += var6;
         }

         a(var0, 0, 21, var3, var10);
         a(var0, 0, 24, var3, var10 + ag - var7);
         b(a(ae), var0, var5, ah, ai + ag + var2);
         P = var8;
      }
   }

   private static void c(Graphics var0) {
      int var1 = a[E][0];
      int var2 = a[E][1];
      a(var0, 0, 0, var1, var2);
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      a[var1].a(var0, var2, var3, var4, 0);
   }

   private static void b(Graphics var0, int var1, int var2, int var3, int var4) {
      var1 = Math.max(var1, 0);
      var2 = Math.max(0, 0);
      var3 = Math.min(var3, aj);
      var4 = Math.min(var4, ak);
      f.b(var0, var1, var2, var3, var4);
   }

   public final void run() {
      new StringBuffer().append("Thread.activeCount() = ").append(Thread.activeCount());

      while (f) {
         try {
            if (E != null) {
               if ((d = E) != null && d.length() > 0) {
                  String var1 = d;
                  d = null;
                  new StringBuffer().append("urlPlatformRequest = ").append(var1);

                  try {
                     wfree.P.pr(a, var1);
                     Thread.sleep(200L);
                  } catch (Exception var2) {
                  }

                  U = 1;
                  a.notifyDestroyed();
               }

               E = null;
            }

            Thread.sleep(1000L);
         } catch (Exception var3) {
         }
      }
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   private static InputStream a(String var0) {
      return "a".getClass().getResourceAsStream(var0);
   }

   private static d a(int var0, int var1) {
      d var2;
      (var2 = new d()).a(f.a(var0), 0);
      return var2;
   }

   static {
      b = "IGP-Signature=" + a;
      w = "&ctg=" + v;
      new Hashtable();
   }
}
