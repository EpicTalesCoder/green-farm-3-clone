import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import wfree.P;

public abstract class f extends Canvas implements Runnable {
   public static Graphics a = null;
   private static Graphics b = null;
   private static boolean a;
   static int S;
   static long a;
   static int T = 240;
   static int U = 320;
   static Display a;
   private static boolean b;
   static MIDlet a;
   private static int a = 62;
   private long b;
   static int V;
   private static long c;
   static int W;
   private static int b;
   static f a;
   private static String a = null;
   private static byte[] a;
   private static byte[] b;
   private static int c;
   private static Hashtable a;
   private static Hashtable b;
   private static int d = 25;
   static final int X = 256;
   static Random a;
   private static int[] a;
   private static int[] b;
   static final int Y = 256;
   static final int Z = 90 * Y / 360;
   private static int e = 180 * Y / 360;
   private static int f = 270 * Y / 360;
   private static int g = 360 * Y / 360;
   private static InputStream a;
   private static String b;
   private static int h;
   private static int i;
   private static int[] c;
   static String c;
   private static int j;
   private static int k;
   private static int l = 0;
   private static char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   static String d = "UTF-8";
   private static int[] d;
   private static byte[][] a;
   private static int[] e;
   private static int[][] b;
   private static RecordStore a;
   private static int m;
   private static int[] f;
   private static int[][] c;
   static final boolean n = true;
   static int aa = 0;
   static int[][] a = null;
   static boolean o;
   private static int n;
   private static int o;
   static int ab;
   static int ac;
   static int ad;
   static int ae;
   private static long d = 0L;

   abstract void e();

   public f(Object var1, Object var2) {
      a = this;
      S = -1;
      b = true;
      a = (MIDlet)var1;
      a = (Display)var2;
      this.a();
      b = new Hashtable();
      (a = new Hashtable()).put(new Integer(48), new Integer(6));
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
      c = System.currentTimeMillis();
      this.b = c;
   }

   protected final void i() {
      if (S < 0) {
         T = 240;
         U = 320;
         a = new byte[d];
         b = new byte[d];
         long var1 = System.currentTimeMillis();
         if (a == null) {
            a = new Random(var1);
         } else {
            a.setSeed(var1);
         }

         S = 0;
         new Thread(this).start();
      }
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
      f var1 = this;
      if (a) {
         long var2;
         a = var2 = System.currentTimeMillis();
         c = var2;
         var1.b = var2;
         a = false;
         var1.a();
         if (!b) {
            var1.repaint();
         }

         j();
      }
   }

   public void sizeChanged(int var1, int var2) {
      T = var1;
      U = var2;
   }

   private void a() {
      this.setFullScreenMode(true);
      if (a != null && a.getCurrent() != this) {
         a.setCurrent(this);
      }
   }

   public void run() {
      try {
         this.a();
         b = false;

         while (S >= 0) {
            f var1 = this;
            if (!a) {
               var1.repaint();
               long var2 = System.currentTimeMillis();
               var1.b = Math.min(var1.b, var2);
               Thread.sleep(Math.max(1L, a - (var2 - var1.b)));
               var1.b = System.currentTimeMillis();
            } else {
               var1.b = Math.min(var1.b, System.currentTimeMillis());
               Thread.sleep(1L);
            }
         }
      } catch (Exception var4) {
         S = -1;
      }

      this.f();
      a.notifyDestroyed();
   }

   public void paint(Graphics var1) {
      Graphics var2 = var1;
      f var5 = this;
      if (!a && !b) {
         b = true;
         if (S != -1) {
            for (int var3 = 0; var3 < d; var3++) {
               a[var3] = b[var3];
               if (b[var3] != 0) {
                  if (b[var3] < 0) {
                     b[var3] = 0;
                  } else if (b[var3] < 126) {
                     b[var3]++;
                     if (var3 >= 18) {
                        b[var3] = (byte)(-b[var3]);
                     }
                  }
               }
            }

            if (c > 0) {
               if (c != Integer.MAX_VALUE) {
                  c = c - V;
               }

               j();
            }
         }

         if ((V = (int)((a = System.currentTimeMillis()) - c)) < 0) {
            V = 0;
         }

         if (V > 1000) {
            V = 1000;
         }

         c = a;
         W = W + V;
         b++;

         try {
            b = var2;
            a = var2;
            var5.e();
         } catch (Exception var4) {
            S = -1;
         }

         if (Runtime.getRuntime().freeMemory() < 10240) {
            System.gc();
         }

         b = false;
      }
   }

   static final void a(String var0) {
      a = var0;
      if (var0 != null) {
         try {
            P.pr(a, a);
         } catch (Exception var1) {
         }
      }

      S = -1;
      a.notifyDestroyed();
   }

   protected void keyPressed(int var1) {
      byte var2 = a(var1);
      if (b != null) {
         if (b[var2] <= 0) {
            if (b[var2] < 0) {
               b[var2] = 0;
            }

            if (b[var2] < 126) {
               b[var2]++;
            }
         }
      }
   }

   protected void keyReleased(int var1) {
      byte var2 = a(var1);
      if (b != null) {
         if (b[var2] > 0) {
            b[var2] = (byte)(-b[var2]);
         }
      }
   }

   public static void b(boolean var0, int var1, int var2) {
      Integer var4 = new Integer(var1);
      Hashtable var3 = a;
      if ((Integer)a.get(var4) != null) {
         var3.remove(var4);
      }

      var3.put(var4, new Integer(var2));
   }

   private static byte a(int var0) {
      Integer var2 = new Integer(var0);
      if (a == null) {
         return 0;
      } else {
         Integer var1;
         if ((var1 = (Integer)a.get(var2)) != null) {
            return var1.byteValue();
         } else {
            return (var1 = (Integer)b.get(var2)) != null ? var1.byteValue() : 0;
         }
      }
   }

   public static void j() {
      if (a != null && b != null) {
         for (int var0 = 0; var0 < d; var0++) {
            a[var0] = 0;
            b[var0] = 0;
         }
      }
   }

   public static boolean h(int var0) {
      return a[var0] > 0;
   }

   public static int g() {
      int var0 = d;

      while (--var0 >= 0) {
         if (a[var0] == 1) {
            return var0;
         }
      }

      return -1;
   }

   public static int h() {
      int var0 = d;

      while (--var0 >= 0) {
         if (a[var0] < 0) {
            return var0;
         }
      }

      return -1;
   }

   public static boolean i(int var0) {
      return a[var0] == 1;
   }

   static void b(String var0) {
      e(var0);
      a = (int[])a(1);
      b = (int[])a(0);
      k();
   }

   static int c(int var0, int var1) {
      if (var1 != var0) {
         int var2;
         if ((var2 = a.nextInt()) < 0) {
            var2 = -var2;
         }

         return var0 + var2 % (var1 - var0);
      } else {
         return var1;
      }
   }

   static int d(int var0) {
      if (var0 < 0) {
         var0 = -var0;
      }

      if ((var0 = var0 & g - 1) <= Z) {
         return a[var0];
      } else if (var0 < e) {
         var0 = e - var0;
         return -a[var0];
      } else if (var0 <= f) {
         var0 -= e;
         return -a[var0];
      } else {
         var0 = g - var0;
         return a[var0];
      }
   }

   static int e(int var0) {
      if (var0 >= 65536) {
         if (var0 >= 16777216) {
            if (var0 >= 268435456) {
               return var0 >= 1073741824 ? b[var0 >> 24] << 8 : b[var0 >> 22] << 7;
            } else {
               return var0 >= 67108864 ? b[var0 >> 20] << 6 : b[var0 >> 18] << 5;
            }
         } else if (var0 >= 1048576) {
            return var0 >= 4194304 ? b[var0 >> 16] << 4 : b[var0 >> 14] << 3;
         } else {
            return var0 >= 262144 ? b[var0 >> 12] << 2 : b[var0 >> 10] << 1;
         }
      } else if (var0 >= 256) {
         if (var0 >= 4096) {
            return var0 >= 16384 ? b[var0 >> 8] : b[var0 >> 6] >> 1;
         } else {
            return var0 >= 1024 ? b[var0 >> 4] >> 2 : b[var0 >> 2] >> 3;
         }
      } else {
         return var0 >= 0 ? b[var0] >> 4 : 0;
      }
   }

   private static void e(String var0) {
      if (a == null || var0 == null || var0.compareTo(b) != 0) {
         j = 1;
         a(var0, 0, null, 0);
      }
   }

   private static InputStream a(String var0, int var1, byte[] var2, int var3) {
      c = var0;
      if (a != null) {
         if (var0 != null && var0.compareTo(b) == 0) {
            if (h == var1) {
               return a;
            }

            b();
         } else {
            c();
         }
      }

      if (a == null) {
         try {
            if (var1 > 0) {
               var0 = var0 + "." + var1;
            }

            String var7 = var0;
            InputStream var9 = null;
            if (j == 3) {
               var9 = new ByteArrayInputStream(null, 0, ((Object[])null).length);
            } else if (j != 2 && j == 1) {
               var9 = "".getClass().getResourceAsStream(var7);
            }

            InputStream var8 = var9;
            h = var1;
            var8.markSupported();
            if (var1 != 0) {
               k = 0;
            } else {
               b = var0;
               i = var8.available();
               int var5 = (var8.read() & 0xFF) + ((var8.read() & 0xFF) << 8);
               var8.available();
               c = new int[var5];

               for (int var10 = 0; var10 < var5; var10++) {
                  var1 = (var8.read() & 0xFF) + ((var8.read() & 0xFF) << 8) + ((var8.read() & 0xFF) << 16) + ((var8.read() & 0xFF) << 24);
                  c[var10] = var1;
               }

               k = c[0];
            }

            a = var8;
         } catch (Throwable var4) {
         }
      }

      return a;
   }

   private static void b() {
      try {
         if (a != null) {
            try {
               a.close();
            } catch (Throwable var0) {
            }

            a = null;
         }
      } catch (Throwable var1) {
      }
   }

   private static void c() {
      b();
      b = null;
      c = null;
   }

   private static int a(int var0) {
      int var1 = c[var0];
      var0 = c[var0 + 1] - var1 - 1;
      int var2 = 0;

      try {
         while (var1 > i) {
            var1 -= i;
            var2++;
         }

         InputStream var3;
         (var3 = a(b, var2, null, 0)).available();
         if (k > var1) {
            b();
            var3 = a(b, var2, null, 0);
         }

         var3.skip(var1 - k);
         var3.read();
         k = var1 + 1;
      } catch (Throwable var4) {
      }

      return var0;
   }

   private static byte[] a(String var0, int var1, boolean var2) {
      byte[] var8 = null;
      e(var0);

      try {
         var1 = a(var1);
         InputStream var3 = a;
         int var4 = a.available();
         int var5 = 0;
         var8 = new byte[var1];

         while (var1 > 0) {
            int var9 = a(var3, var8, var5, Math.min(var1, var4));
            var5 += var9;
            k += var9;
            if ((var1 -= var9) == 0 || var9 == -1) {
               break;
            }

            var4 = (var3 = a(var0, h + 1, null, 0)).available();
         }
      } catch (Throwable var6) {
      }

      return var8;
   }

   private static int a(InputStream var0, byte[] var1, int var2, int var3) {
      try {
         return var0.read(var1, var2, var3);
      } catch (Exception var4) {
         return -1;
      }
   }

   static final void c(String var0) {
      e(var0);
   }

   static final void k() {
      c();
      c = null;
      System.gc();
   }

   static final byte[] a(int var0) {
      return a(b, var0, false);
   }

   static final Object a(int var0) {
      return a(new ByteArrayInputStream(a(var0)));
   }

   static final int a(Graphics var0) {
      return var0.getClipX();
   }

   static final int b(Graphics var0) {
      return var0.getClipY();
   }

   static final int c(Graphics var0) {
      return var0.getClipWidth();
   }

   static final int d(Graphics var0) {
      return var0.getClipHeight();
   }

   static final void a(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.clipRect(var1, var2, var3, var4);
   }

   static final void b(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.setClip(var1, var2, var3, var4);
   }

   static final void c(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.fillRect(var1, var2, var3, var4);
   }

   static final void d(Graphics var0, int var1, int var2, int var3, int var4) {
      var0.drawRect(var1, var2, var3, var4);
   }

   static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.fillArc(var1, var2, var3, var4, var5, var6);
   }

   static final void a(String var0, int var1, int var2, int var3) {
      try {
         a.drawString(var0, var1, var2, 33);
      } catch (Exception var4) {
      }
   }

   static final void a(Graphics var0, j var1, int var2, int var3) {
      try {
         var0.drawImage(var1.a, var2, var3, 20);
      } catch (Exception var4) {
      }
   }

   static final void a(Graphics var0, j var1, int var2, int var3, int var4, int var5, int var6) {
      if (var2 >= var1.a.getWidth()) {
         var2 += var1.a.getWidth() - var2;
      }

      if (var3 >= var1.a.getHeight()) {
         var3 += var1.a.getHeight() - var3;
      }

      if (var3 > 0 && var2 > 0) {
         try {
            var0.drawRegion(var1.a, 0, 0, var2, var3, var4, var5, var6, 20);
         } catch (Exception var7) {
         }
      }
   }

   static final void a(
      Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, int var10, int var11, boolean var12
   ) {
      if (var10 != 0) {
         var9 = 0;
         if ((var10 & 4) != 0) {
            var9 = var6;
            var6 = var7;
            var7 = var3;
            var3 = var6;
         }

         var1 = d.a(var1, var6, var7, var10, null);
         if ((var10 & 4) != 0) {
            var7 = var9;
         }
      }

      if (var0 == b) {
         int var10003 = 0 % var3;
         int var10004 = 0 / var3;
         boolean var22 = (boolean)var8;
         var8 = var7;
         var7 = var6;
         var6 = var5;
         var5 = var4;
         var4 = var10004;
         int var15 = var10003;
         var2 = var3;
         var1 = var1;
         a(var0, T, U, var1, var2, var15, var4, var5, var6, var7, var8, var22);
      } else {
         a(
            var0,
            var0.getClipX() + var0.getClipWidth(),
            var0.getClipY() + var0.getClipHeight(),
            var1,
            var3,
            0 % var3,
            0 / var3,
            var4,
            var5,
            var6,
            var7,
            (boolean)var8
         );
      }
   }

   private static void a(Graphics var0, int var1, int var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      int var12 = var0.getTranslateX();
      int var13 = var0.getTranslateY();
      var0.translate(-var12, -var13);
      var7 += var12;
      var8 += var13;
      var5 += var6 * var4;
      if (var7 < var1 && var7 + var9 > 0 && var8 < var2 && var8 + var10 > 0) {
         var6 = a.getClipX();
         int var14 = a.getClipY();
         int var15 = a.getClipWidth();
         int var16 = a.getClipHeight();
         if (var6 < var1 && var6 + var15 > 0 && var14 < var2 && var14 + var16 > 0) {
            if (var7 <= 0) {
               var5 -= var7;
               var9 += var7;
               var7 = 0;
            }

            if (var7 + var9 >= var1) {
               var9 = var1 - var7;
            }

            if (var8 + var10 >= var2) {
               var10 = var2 - var8;
            }

            if (var8 <= 0) {
               var5 -= var8 * var4;
               var10 += var8;
               var8 = 0;
            }

            var0.drawRGB(var3, var5, var4, var7, var8, var9, var10, var11);
            var0.translate(var12, var13);
         }
      }
   }

   static final void a(j var0, int[] var1, int var2, int var3, int var4) {
      var0.a(var1, 0, var2, 0, 0, var3, var4);
   }

   static int a(byte[] var0, int var1, byte var2) {
      var0[var1++] = var2;
      return var1;
   }

   static int a(byte[] var0, int var1, short var2) {
      var0[var1++] = (byte)var2;
      var0[var1++] = (byte)(var2 >>> 8);
      return var1;
   }

   static int a(byte[] var0, int var1, int var2) {
      var0[var1++] = (byte)var2;
      var0[var1++] = (byte)(var2 >>> 8);
      var0[var1++] = (byte)(var2 >>> 16);
      var0[var1++] = (byte)(var2 >> 24);
      return var1;
   }

   static int a(byte[] var0, int var1, long var2) {
      var0[var1++] = (byte)(var2 & 255L);
      var0[var1++] = (byte)(var2 >>> 8 & 255L);
      var0[var1++] = (byte)(var2 >>> 16 & 255L);
      var0[var1++] = (byte)(var2 >>> 24 & 255L);
      var0[var1++] = (byte)(var2 >>> 32 & 255L);
      var0[var1++] = (byte)(var2 >>> 40 & 255L);
      var0[var1++] = (byte)(var2 >>> 48 & 255L);
      var0[var1++] = (byte)(var2 >>> 56 & 255L);
      return var1;
   }

   static byte a(byte[] var0, int var1) {
      return var0[var1];
   }

   static short a(byte[] var0, int var1) {
      return (short)(var0[var1++] & 0xFF | (var0[var1] & 255) << 8);
   }

   static int a(byte[] var0, int var1) {
      return var0[var1++] & 0xFF | (var0[var1++] & 0xFF) << 8 | (var0[var1++] & 0xFF) << 16 | (var0[var1] & 0xFF) << 24;
   }

   static long a(byte[] var0, int var1) {
      return var0[var1++] & 0xFF
         | (long)(var0[var1++] & 0xFF) << 8
         | (long)(var0[var1++] & 0xFF) << 16
         | (long)(var0[var1++] & 0xFF) << 24
         | (long)(var0[var1++] & 0xFF) << 32
         | (long)(var0[var1++] & 0xFF) << 40
         | (long)(var0[var1++] & 0xFF) << 48
         | (long)(var0[var1] & 0xFF) << 56;
   }

   private static Object a(InputStream var0) {
      Object[] var1 = null;

      try {
         int var2;
         int var3 = (var2 = a(var0)) >> 4;
         int var4 = var2 & 7;
         if ((var2 & 8) != 0) {
            var2 = b(var0);
         } else {
            var2 = a(var0);
         }

         switch (var4) {
            case 0:
               byte[] var17 = new byte[var2];

               for (int var13 = 0; var13 < var2; var13++) {
                  var17[var13] = (byte)a(var0);
               }

               var1 = var17;
               break;
            case 1:
               short[] var16 = new short[var2];
               if (var3 == 0) {
                  for (int var12 = 0; var12 < var2; var12++) {
                     var16[var12] = (byte)a(var0);
                  }
               } else {
                  for (int var11 = 0; var11 < var2; var11++) {
                     var16[var11] = (short)b(var0);
                  }
               }

               var1 = var16;
               break;
            case 2:
               int[] var15 = new int[var2];
               if (var3 == 0) {
                  for (int var10 = 0; var10 < var2; var10++) {
                     var15[var10] = (byte)a(var0);
                  }
               } else if (var3 == 1) {
                  for (int var9 = 0; var9 < var2; var9++) {
                     var15[var9] = (short)b(var0);
                  }
               } else {
                  for (int var8 = 0; var8 < var2; var8++) {
                     var15[var8] = c(var0);
                  }
               }

               var1 = var15;
               break;
            default:
               Object[] var14;
               switch (var4 & 3) {
                  case 0:
                     if (var3 == 2) {
                        var14 = (Object[])(new byte[var2][]);
                     } else {
                        var14 = (Object[])(new byte[var2][][]);
                     }
                     break;
                  case 1:
                     if (var3 == 2) {
                        var14 = (Object[])(new short[var2][]);
                     } else {
                        var14 = (Object[])(new short[var2][][]);
                     }
                     break;
                  default:
                     if (var3 == 2) {
                        var14 = (Object[])(new int[var2][]);
                     } else {
                        var14 = (Object[])(new int[var2][][]);
                     }
               }

               for (int var7 = 0; var7 < var2; var7++) {
                  var14[var7] = a(var0);
               }

               var1 = var14;
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   private static int a(InputStream var0) {
      int var1;
      if ((var1 = var0.read()) >= 0) {
         l++;
      }

      return var1;
   }

   private static int b(InputStream var0) {
      return a(var0) & 0xFF | (a(var0) & 0xFF) << 8;
   }

   private static int c(InputStream var0) {
      return a(var0) & 0xFF | (a(var0) & 0xFF) << 8 | (a(var0) & 0xFF) << 16 | (a(var0) & 0xFF) << 24;
   }

   private static int b(InputStream var0, byte[] var1, int var2, int var3) {
      var2 = 0;
      int var4 = var3;

      try {
         while (var4 > 0) {
            int var5 = var0.read(var1, var2, var4);
            var4 -= var5;
            var2 += var5;
         }
      } catch (Exception var6) {
      }

      l += var3;
      return var3;
   }

   private static int[] a(byte[] var0, boolean var1, int[] var2) {
      int var3 = (var0.length & 3) == 0 ? var0.length >>> 2 : (var0.length >>> 2) + 1;
      if (var1) {
         (var2 = new int[var3 + 1])[var3] = var0.length;
      } else {
         var2 = new int[var3];
      }

      var3 = var0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var2[var4 >>> 2] = var2[var4 >>> 2] | (255 & var0[var4]) << ((var4 & 3) << 3);
      }

      return var2;
   }

   static String a(byte[] var0) {
      StringBuffer var1 = new StringBuffer(var0.length << 1);

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.append(a[var0[var2] >> 4 & 15]);
         var1.append(a[var0[var2] & 15]);
      }

      return var1.toString();
   }

   static byte[] a(byte[] var0, String var1, boolean var2) {
      byte[] var16 = null;
      if (!"".equals(var1) && var1 != null) {
         var16 = var1.getBytes();
      }

      byte[] var13 = var16;
      var0 = (byte[])var0;
      if (var0.length == 0) {
         return var0;
      }

      int[] var22 = a(var0, true, null);
      int[] var14 = a(var13, false, null);
      var0 = var22;
      if ((var2 = var22.length - 1) >= 1) {
         if (var14.length < 4) {
            int[] var3 = new int[4];
            System.arraycopy(var14, 0, var3, 0, var14.length);
            var14 = var3;
         }

         int var19 = var0[var2];
         int var5 = -1640531527;
         int var6 = 0;
         int var9 = 6 + 52 / (var2 + 1);

         while (var9-- > 0) {
            int var7 = (var6 += var5) >>> 2 & 3;

            int var8;
            for (var8 = 0; var8 < var2; var8++) {
               int var4 = var0[var8 + 1];
               var19 = var0[var8] += (var19 >>> 5 ^ var4 << 2) + (var4 >>> 3 ^ var19 << 4) ^ (var6 ^ var4) + (var14[var8 & 3 ^ var7] ^ var19);
            }

            int var21 = var0[0];
            var19 = var0[var2] += (var19 >>> 5 ^ var21 << 2) + (var21 >>> 3 ^ var19 << 4) ^ (var6 ^ var21) + (var14[var8 & 3 ^ var7] ^ var19);
         }
      }

      int[] var12;
      int var20;
      byte[] var18 = new byte[var20 = (var12 = var0).length << 2];

      for (int var15 = 0; var15 < var20; var15++) {
         var18[var15] = (byte)(var12[var15 >>> 2] >>> ((var15 & 3) << 3));
      }

      return var18;
   }

   static String a(int var0) {
      switch (var0) {
         case 0:
            return "EN";
         case 1:
            return "DE";
         case 2:
            return "FR";
         case 3:
            return "IT";
         case 4:
            return "ES";
         case 5:
            return "BR";
         case 6:
            return "PT";
         case 7:
            return "JP";
         case 8:
            return "CN";
         case 9:
            return "KR";
         case 10:
            return "RU";
         case 11:
            return "TR";
         case 12:
            return "PL";
         case 13:
            return "CZ";
         case 14:
            return "NL";
         case 15:
            return "TH";
         case 16:
            return "VI";
         case 17:
            return "AR";
         default:
            return null;
      }
   }

   private static int d(InputStream var0) {
      int var1 = 0;

      try {
         var1 = a(var0);
         e[var1] = c(var0);
         if (e[var1] > 1024) {
            e[var1] = 1024;
         }

         b[var1] = new int[e[var1] + 1];

         for (int var2 = 1; var2 < e[var1] + 1; var2++) {
            b[var1][var2] = c(var0);
         }

         a[var1] = new byte[b[var1][e[var1]]];
         b(var0, a[var1], 0, a[var1].length);
      } catch (Exception var3) {
      }

      return var1;
   }

   static void a(String var0, int var1) {
      n(var1);
      if (d == null) {
         d = new int[32];

         for (int var2 = 0; var2 < 32; var2++) {
            d[var2] = -1;
         }

         a = new byte[32][];
         b = new int[32][];
         e = new int[32];
      }

      e(var0);
      int var3 = d(new ByteArrayInputStream(a(var1)));
      d[var1] = var3;
      k();
   }

   static String b(int var0) {
      int var1 = var0 >> 10;
      var0 &= 1023;

      try {
         int var2;
         return (var2 = b[var1][var0 + 1] - b[var1][var0]) == 0 ? null : new String(a[var1], b[var1][var0], var2, d);
      } catch (Exception var3) {
         return null;
      }
   }

   static void l() {
      for (int var0 = 0; var0 < 32; var0++) {
         n(var0);
      }
   }

   static void n(int var0) {
      if (d != null) {
         int var1;
         if ((var1 = d[var0]) == -1) {
            return;
         }

         b[var1] = null;
         a[var1] = null;
         e[var1] = 0;
         d[var0] = -1;
      }
   }

   static String a(long var0, int var2, String var3) {
      if (var0 < 1000L) {
         return "" + var0;
      }

      String var4 = "";
      switch (var2) {
         case 0:
         case 7:
         case 8:
         case 9:
         case 15:
         case 17:
            var4 = ",";
            break;
         case 1:
         case 3:
         case 5:
         case 16:
            var4 = ".";
            break;
         case 2:
         case 4:
         case 6:
         case 10:
            if (var0 >= 10000L) {
               var4 = var3;
            }
            break;
         case 11:
         case 14:
            if (var0 >= 10000L) {
               var4 = ".";
            }
            break;
         case 12:
         case 13:
            var4 = var3;
            break;
         default:
            return "" + var0;
      }

      String var8 = "";
      long var5 = var0 % 1000L < 0L ? -(var0 % 1000L) : var0 % 1000L;
      var0 /= 1000L;

      while (var5 != 0L || var0 != 0L) {
         if (var5 < 10L) {
            var8 = "00" + (var5 < 0L ? -var5 : var5) + var8;
         } else if (var5 < 100L) {
            var8 = "0" + (var5 < 0L ? -var5 : var5) + var8;
         } else {
            var8 = (var5 < 0L ? -var5 : var5) + var8;
         }

         var5 = var0 % 1000L;
         if ((var0 /= 1000L) != 0L) {
            var8 = var4 + var8;
         } else if (var5 != 0L) {
            var8 = var5 + var4 + var8;
            var5 = 0L;
         }
      }

      return var8;
   }

   static String a(String var0, String[] var1) {
      String var5 = "";
      if (var0.indexOf(37) < 0) {
         return var0;
      }

      int var3 = 0;
      int var6 = 0;

      do {
         if ((var6 = var0.indexOf(37, var6)) < 0 || var6 == var0.length() - 1) {
            var5 = var5 + var0.substring(var3);
            var6 = -1;
         } else if (var0.charAt(var6 + 1) == 's') {
            int var4 = -1;
            if (var6 + 2 < var0.length()) {
               var4 = var0.charAt(var6 + 2) - '0';
            }

            if (var4 >= 0 && var4 <= 9) {
               var5 = var5 + var0.substring(var3, var6);
               var5 = var5 + var1[var4];
               var6 = var3 = var6 + 3;
            } else {
               var6++;
            }
         } else {
            var6++;
         }
      } while (var6 >= 0);

      return var5;
   }

   static boolean j(int var0) {
      if (d == null) {
         return false;
      } else {
         return var0 >= 32 ? false : d[var0] >= 0;
      }
   }

   static String a(String var0, String var1, String var2) {
      int var3 = var0.indexOf(var1);

      while (var3 != -1) {
         var0 = var0.substring(0, var3) + var2 + var0.substring(var3 + var1.length());
         var3 += var2.length();
         var3 = var0.indexOf(var1, var3);
      }

      return var0;
   }

   private static void d() {
      if (a != null) {
         try {
            a.closeRecordStore();
         } catch (RecordStoreException var0) {
         }

         a = null;
      }
   }

   private static void f(String var0) {
      a = RecordStore.openRecordStore(var0, true);
   }

   static byte[] a(String var0) {
      String var1 = "";
      var0 = var0;
      byte[] var2 = null;
      if (!"".equals(var1)) {
         var2 = var1.getBytes();
      }

      return a(var0, var2);
   }

   private static byte[] a(String var0, byte[] var1) {
      var1 = null;

      try {
         f(var0);
         if (a.getNumRecords() > 0) {
            var1 = a.getRecord(1);
         }
      } catch (RecordStoreException var2) {
         var1 = null;
      }

      d();
      return var1;
   }

   static void a(String var0, byte[] var1) {
      a(var0, var1, var1.length);
   }

   static void a(String var0, byte[] var1, int var2) {
      f(var0);
      if (a.getNumRecords() > 0) {
         a.setRecord(1, var1, 0, var2);
      } else {
         a.addRecord(var1, 0, var2);
      }

      d();
   }

   static void o(int var0) {
      if (f == null) {
         f = new int[1];
         c = new int[1][];
      }

      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 >= f.length) {
            var10000 = -1;
            break;
         }

         if (f[var2] == var0) {
            var10000 = var2;
            break;
         }

         var2++;
      }

      int var1 = var10000;
      if (var10000 == -1 || c == null) {
         m++;
         var1 = 0;
         f[0] = var0;
         if (c[0] == null) {
            c[0] = new int[256];
         }

         var2 = 256;

         while (var2 > 0) {
            c[0][--var2] = var0;
         }
      }

      m = var1;
   }

   static void e(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.getClipX();
      int var6 = var0.getClipY();
      int var7 = var0.getClipWidth();
      int var8 = var0.getClipHeight();
      int var9 = var1 > var5 ? var1 : var5;
      int var10 = var2 > var6 ? var2 : var6;
      var3 = (var1 + var3 < var5 + var7 ? var1 + var3 : var5 + var7) - var9;
      var4 = (var2 + var4 < var6 + var8 ? var2 + var4 : var6 + var8) - var10;
      if (var3 > 0 && var4 > 0) {
         int var12 = var4;
         int var11 = var3;
         b(var0, var9, var10, var11, var12);
         if (var3 * var4 < 256) {
            int[] var10001 = c[m];
            var1 = var4;
            int var27 = var3;
            int var24 = var10;
            var4 = var9;
            var9 = var24;
            var4 = var4;
            var9 = var9;
            var4 = var4;
            var3 = var3;
            a(var0, var10001, 0, var3, var4, var9, var27, var1, true, true, 0, -1, true);
         } else {
            var3 += var9;
            var4 += var10;

            for (int var14 = var9; var14 < var3; var14 += 16) {
               for (int var15 = var10; var15 < var4; var15 += 16) {
                  int[] var30 = c[m];
                  var12 = var15;
                  var11 = var14;
                  a(var0, var30, 0, 16, var11, var12, 16, 16, true, true, 0, -1, true);
               }
            }
         }

         b(var0, var5, var6, var7, var8);
      }
   }

   private static final void a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      boolean var14 = var8;
      int var13 = var7;
      int var12 = var6;
      int var11 = var5;
      int var10 = var4;
      var2 = var3;
      a(var0, var1, 0, var2, var10, var11, var12, var13, var14, true, 0, -1, true);
   }

   static final void m() {
      aa = 0;
      (a = new int[20][])[13] = new int[7];
      a[13][1] = 100;
      a[13][2] = -1;
      a[13][0] = -1;
      a[13][3] = 100;
      a[13][4] = 100;
      a[13][5] = 0;
      a[13][6] = 0;
   }

   static final void n() {
      aa |= 8192;
   }

   static final void o() {
      aa &= -8193;
   }

   static final int i() {
      int var0;
      return (var0 = a[13][1]) != 100 ? var0 : a[13][3];
   }

   static final int j() {
      int var0;
      return (var0 = a[13][1]) != 100 ? var0 : a[13][4];
   }

   static final void p(int var0) {
      a[13][1] = var0;
      a[13][3] = var0;
      a[13][4] = var0;
   }

   static final void b(boolean var0) {
      var0 = var0 ? 1 : 0;
      a[13][5] = var0;
   }

   static final void a(int var0, int var1, int var2, int var3, int[] var4) {
      var4[0] = var2 * var1 - var3 * var0 + 128 >> 8;
      var4[1] = var3 * var1 + var2 * var0 + 128 >> 8;
   }

   static final void b(int var0, int var1, int var2, int var3, int[] var4) {
      a(var0, var1, 0, var3, d.b);
      int var5 = d.b[0];
      int var6 = d.b[1];
      a(var0, var1, var2, var3, d.b);
      var3 = d.b[0];
      int var7 = d.b[1];
      a(var0, var1, var2, 0, d.b);
      var0 = d.b[0];
      var1 = d.b[1];
      var4[0] = Math.max(Math.abs(var3), Math.abs(var0 - var5));
      var4[1] = Math.max(Math.abs(var7), Math.abs(var1 - var6));
   }

   static final int[] a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9) {
      o = (boolean)var7;
      n = var4;
      o = var5;
      ab = var2;
      ac = var3;
      if ((aa & 22016) != 0) {
         if ((var6 & 4) != 0) {
            n = var5;
            o = var4;
            var4 = n;
            var5 = o;
         }

         var1 = d.a(var1, var4, var5, var6, null);
      }

      ad = var4;
      ae = var5;
      int[] var10 = d.b(var1);
      if ((aa & 8192) == 0) {
         return null;
      }

      int var11;
      var8 = (var11 = a[13][0]) != 1 && var11 == 2;
      if ((var11 = a[13][6]) % g != 0) {
         var7 = 1;
         int var14 = var6;
         int var13 = var11;
         int var40 = var5;
         int var12 = var4;
         var11 = var3;
         int var60 = var2;
         int[] var37 = var10;
         int[] var35 = var1;
         if ((var6 & 4) != 0) {
            var14 = var6 & -5;
            int var19 = 90 * Y / 360;
            var13 += var19;
         }

         if (var14 != 0) {
            int var17 = var14;
            var37 = d.b(var35 = d.a(var35, var12, var40, var17, null));
         }

         int var16 = var13;
         int var15 = d(Z - var16);
         var16 = d(var13);
         b(var15, var16, var12, var40, d.b);
         int var91 = d.b[0];
         var5 = d.b[1];
         int var32 = var91 >> 1;
         int var18 = var5 >> 1;
         int var97 = var91 - var12 >> 1;
         int var20 = var5 - var40 >> 1;
         int var24 = var18 * var15;
         int var25 = -var18 * var16;
         var13 = var32 * var15;
         var14 = var32 * var16;
         int var26 = var32 - var97;
         int var27 = var18 - var20;
         var97 = -var14;
         int var21 = -var13;

         for (int var33 = 0; var33 < var91; var33++) {
            int var22 = var97 - var24;
            int var23 = var25 - var21;
            int var28 = var33;

            for (int var29 = 0; var29 < var5; var29++) {
               var13 = var26 + (var22 + 128 >> 8);
               var14 = var27 + (var23 + 128 >> 8);
               var22 += var15;
               var23 += var16;
               if (var13 >= 0 && var14 >= 0 && var13 < var12 && var14 < var40) {
                  var37[var28] = var35[var14 * var12 + var13];
               } else {
                  var37[var28] = 0;
               }

               var28 += var91;
            }

            var97 += var16;
            var21 += var15;
         }

         ab = var60;
         ac = var11;
         ad = var91;
         ae = var5;
         o = true;
         var10 = var37;
         var1 = var37;
         var10 = d.b(var10);
         var2 = ab;
         var3 = ac;
         var4 = ad;
         var5 = ae;
         var6 &= ~var6;
      }

      var11 = i();
      int var67 = j();
      int var10009 = a[13][2];
      int var92 = var6;
      int var86 = var8;
      boolean var84 = (boolean)var7;
      var7 = var10009;
      int var78 = var67;
      int var71 = var11;
      int var41 = var5;
      var67 = var4;
      var11 = var3;
      int var62 = var2;
      int[] var38 = var10;
      int[] var36 = var1;
      Graphics var34 = var0;
      int var95 = 0;
      int var99 = var92 & -2;
      if ((var92 & 4) != 0) {
         var99 = var92;
         var92 = 0;
      }

      if (var99 != 0) {
         if ((var99 & 4) != 0) {
            n = var41;
            o = var67;
            var67 = n;
            var41 = o;
         }

         var3 = var99;
         var38 = d.b(var36 = d.a(var36, var67, var41, var3, null));
      }

      int var101 = var67 * var71 / 100 + (var67 * var71 % 100 != 0 ? 1 : 0);
      var99 = var41 * var78 / 100 + (var41 * var78 % 100 != 0 ? 1 : 0);
      ad = var101;
      ae = var99;
      if (var101 > 0 && var99 > 0) {
         int var102 = (var67 << 8) / var101;
         int var107 = (var41 << 8) / var99;
         int var108 = var34.getClipX();
         int var111 = var34.getClipY();
         int var112 = var34.getClipWidth();
         var71 = var34.getClipHeight();
         var78 = var101;
         int var113 = 0;
         int var114 = var101;
         int var115 = 0;
         if (var62 < var108) {
            if ((var101 -= var108 - var62) <= 0) {
               return null;
            }

            var113 = var108 - var62;
            var62 = var108;
         }

         if (var11 < var111) {
            if ((var99 -= var111 - var11) <= 0) {
               return null;
            }

            var115 = var111 - var11;
            var11 = var111;
         }

         if (var62 + var101 > var108 + var112) {
            if ((var101 = var108 + var112 - var62) <= 0) {
               return null;
            }

            var114 = var113 + var101;
         }

         if (var11 + var99 > var111 + var71 && (var99 = var111 + var71 - var11) <= 0) {
            return null;
         }

         int var116;
         if ((var116 = var38.length / var101) <= 0) {
            return null;
         }

         var108 = var116;
         int var30 = var11;
         if (var7 < 0) {
            var4 = var116 * var101;
            if ((var92 & 1) != 0) {
               var92 = (var78 - var114) * var102;
               var8 = var102;
            } else {
               var92 = (var114 - 1) * var102;
               var8 = -var102;
            }

            if ((var108 = var99 - var99 / var116 * var116) == 0) {
               var108 = var116;
            }

            var102 = var108;
            var95 = var108 * var101;
            int var31 = var11 + var99 - var108;
            var5 = var99;
            var86 = (var99 + var115) * var107;

            while (--var5 >= 0) {
               var78 = (((var86 -= var107) >> 8) * var67 << 8) + var92;

               for (int var49 = var114; --var49 >= var113; var78 += var8) {
                  var38[--var95] = var36[var78 >> 8];
               }

               if (--var108 == 0) {
                  if (var9) {
                     a(var34, var38, 0, var101, var62, var31, var101, var102, var84);
                  }

                  var102 = var116;
                  var31 -= var116;
                  var108 = var116;
                  var95 = var4;
               }
            }
         } else {
            if ((var92 & 1) != 0) {
               var4 = (var78 - var113 - 1) * var102;
               var92 = -var102;
            } else {
               var4 = var113 * var102;
               var92 = var102;
            }

            if (!var86 && !var84) {
               var7 = (var7 & 0xFF) << 24;
               var8 = 0;

               for (int var106 = var115 * var107; var8 < var99; var106 += var107) {
                  var71 = (var106 >> 8) * var67;
                  var5 = 0;

                  for (int var90 = var4; var5 < var101; var90 += var92) {
                     var78 = var71 + (var90 >> 8);
                     var38[var95++] = var7 | var36[var78] & 16777215;
                     var5++;
                  }

                  if (--var108 == 0) {
                     if (var9) {
                        a(var34, var38, 0, var101, var62, var30, var101, var116, true);
                     }

                     var30 += var116;
                     var108 = var116;
                     var95 = 0;
                  }

                  var8++;
               }
            } else if (!var86 && var84) {
               var7 = (var7 & 0xFF) << 24;
               var8 = 0;

               for (int var105 = var115 * var107; var8 < var99; var105 += var107) {
                  var71 = (var105 >> 8) * var67;
                  var5 = 0;

                  for (int var89 = var4; var5 < var101; var89 += var92) {
                     var78 = var71 + (var89 >> 8);
                     if ((var6 = var36[var78] & 16777215) != 16711935 && var6 != 0) {
                        var38[var95++] = var7 | var6;
                     } else {
                        var38[var95++] = 0;
                     }

                     var5++;
                  }

                  if (--var108 == 0) {
                     if (var9) {
                        a(var34, var38, 0, var101, var62, var30, var101, var116, true);
                     }

                     var30 += var116;
                     var108 = var116;
                     var95 = 0;
                  }

                  var8++;
               }
            } else {
               var8 = 0;

               for (int var104 = var115 * var107; var8 < var99; var104 += var107) {
                  var71 = (var104 >> 8) * var67;
                  var5 = 0;

                  for (int var88 = var4; var5 < var101; var88 += var92) {
                     var78 = var71 + (var88 >> 8);
                     var6 = ((var36[var78] >>> 24) * var7 >> 8 & 0xFF & 0xFF) << 24;
                     var38[var95++] = var6 | var36[var78] & 16777215;
                     var5++;
                  }

                  if (--var108 == 0) {
                     if (var9) {
                        a(var34, var38, 0, var101, var62, var30, var101, var116, true);
                     }

                     var30 += var116;
                     var108 = var116;
                     var95 = 0;
                  }

                  var8++;
               }
            }

            if (var9 && var108 != var116) {
               a(var34, var38, 0, var101, var62, var30, var101, var116 - var108, true);
            }
         }

         return var9 ? null : var38;
      } else {
         return null;
      }
   }

   static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var4 = var3;
      var3 = var2;
      var2 = var1;
      var1 = 0;
      Graphics var18 = a;
      int var7 = var4;
      int var8 = var3;
      var5 = 0;
      int[] var10 = d.a((int[])null);
      int var11 = var3 < var10.length / var4 ? var3 : var10.length / var4;
      var7--;
      int var15 = (255 << 16) / var7;
      int var14 = 0 / var7;
      var7++;
      var3 = 0;
      var6 = 0;
      int var12 = 0;
      int var13 = 0;
      int var9 = 0;

      for (int var16 = 0; var16 < var7; var16++) {
         for (int var17 = var11; --var17 >= 0; var9++) {
            var10[var9] = var5;
         }

         var3 += var15;
         var6 += var14;
         var12 += var14;
         var13 += var14;
         var5 = var3 << 8 & 0xFF000000 | var6 & 0xFF0000 | var12 >> 8 & 0xFF00 | var13 >> 16 & 0xFF;
      }

      while (var8 > 0) {
         var7 = var11 < var8 ? var11 : var8;
         var3 = var1;
         var9 = var7;
         var3 = var3;
         var7 = var9;
         var6 = var3;
         var5 = var11;
         a(var18, var10, 0, var5, var6, var2, var7, var4, true, true, 0, -1, true);
         var1 += var11;
         var8 -= var11;
      }
   }

   public void addCommand(Command var1) {
      super.addCommand(var1);
   }

   protected void pointerReleased(int var1, int var2) {
   }

   protected void pointerPressed(int var1, int var2) {
   }

   protected void pointerDragged(int var1, int var2) {
   }

   static boolean h() {
      return l.a();
   }

   static void d(String var0) {
      l.a(var0);
   }

   static void a(int var0, String var1) {
      if (System.currentTimeMillis() - d > 3000L) {
         d = System.currentTimeMillis();
         l.a(l.a(var0, var1), var1);
      }
   }

   static void p() {
      if (System.currentTimeMillis() - d > 3000L) {
         d = System.currentTimeMillis();
         l.a();
      }
   }

   static int k() {
      return l.a();
   }

   static boolean k(int var0) {
      return l.a(var0);
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

   static String a(int var0, String var1) {
      return l.a(l.a(var0, var1));
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

   static long a(long var0, int var2, String var3) {
      var2 = l.a(var2, var3);
      return l.a(var0, var2);
   }

   static int n() {
      return l.d();
   }

   static int a(int var0, String var1) {
      return l.a(l.a(var0, var1));
   }

   static int a(String var0) {
      return l.a(var0);
   }

   static int b(int var0, String var1) {
      return l.a(var0, var1);
   }

   static long a(long var0) {
      int var2 = l.c();
      String var3 = l.b();
      return a(var0, var2, var3);
   }

   static {
      byte[] var10000 = new byte[]{
         -128,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0
      };
      char[] var0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
      char[] var1 = new char[]{
         'A',
         'B',
         'C',
         'D',
         'E',
         'F',
         'G',
         'H',
         'I',
         'J',
         'K',
         'L',
         'M',
         'N',
         'O',
         'P',
         'Q',
         'R',
         'S',
         'T',
         'U',
         'V',
         'W',
         'X',
         'Y',
         'Z',
         'a',
         'b',
         'c',
         'd',
         'e',
         'f',
         'g',
         'h',
         'i',
         'j',
         'k',
         'l',
         'm',
         'n',
         'o',
         'p',
         'q',
         'r',
         's',
         't',
         'u',
         'v',
         'w',
         'x',
         'y',
         'z',
         '0',
         '1',
         '2',
         '3',
         '4',
         '5',
         '6',
         '7',
         '8',
         '9',
         '+',
         '/'
      };
   }
}
