import javax.microedition.lcdui.Graphics;

final class i implements Runnable {
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
   private static int p = 100;

   i() {
      this.e();
   }

   i(d var1, int var2, int var3) {
      this.e();
      this.b = var2;
      this.c = var3;
      this.a(var1);
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

   final void a(int var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   final d a() {
      return this.a;
   }

   final void a(d var1) {
      this.a = var1;
      if (var1 != null) {
         this.b(-1, -1);
      } else {
         this.d = -1;
      }
   }

   final void a(int var1, int var2, boolean var3) {
      if (var3) {
         this.b(-1, 1);
      }

      this.b(var1, var2);
   }

   final void b(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      i var5 = this;
      if (this.a || var2 != var5.d) {
         var5.d = var2;
         var5.g = j;
         i var7 = var5;
         if (var5.d >= 0) {
            int var4 = var7.h();
            var4 = 0 % var4;
            var7.e = var4;
            var7.f = 0;
         }

         var5.h = var3 - 1;
         var5.a = false;
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

   final void a(int var1) {
      switch (var1) {
         case 0:
            this.a = 0;
            return;
         case 1:
            this.a = 2;
            return;
         case 2:
            this.a = 1;
            return;
         case 3:
            this.a = 3;
            return;
         case 4:
            this.a = 5;
         default:
            return;
         case 5:
            this.a = 4;
            return;
         case 6:
            this.a = 7;
            return;
         case 7:
            this.a = 6;
      }
   }

   final void b(int var1) {
      this.k = var1;
   }

   final int c() {
      return this.h;
   }

   private int h() {
      i var1 = this;
      return this.d >= 0 ? var1.a.a(var1.d) : -1;
   }

   private int i() {
      return this.d >= 0 ? this.a.a(this.d, this.e) * this.g : 0;
   }

   final boolean a() {
      if (this.d < 0) {
         return true;
      } else {
         return this.h < 0 ? false : this.a;
      }
   }

   final void b() {
      if (this.d >= 0) {
         if (!this.a) {
            boolean var1 = false;
            if (this.i != -1 && this.i != 100 && (f.aa & 8192) == 0) {
               var1 = true;
               f.n();
               f.p(this.i);
            }

            if (this.k != -1) {
               int var2 = this.a.f();
               this.a.d(this.k);
               this.a.a(f.a, this.d, this.e, this.b, this.c, this.a);
               this.a.d(var2);
            } else {
               this.a.a(f.a, this.d, this.e, this.b, this.c, this.a);
            }

            if (var1) {
               f.aa &= -1046497;
            }
         }
      }
   }

   final void c(int var1) {
      if (!this.a && this.d >= 0) {
         int var2;
         if ((var2 = this.i()) != 0) {
            while (this.f >= var2) {
               this.f -= var2;
               if (this.e < this.a.a(this.d) - 1) {
                  this.e++;
               } else {
                  if (this.h == 0) {
                     this.a = true;
                     break;
                  }

                  if (this.h > 0) {
                     this.h--;
                  }

                  this.e = 0;
               }

               if ((var2 = this.i()) == 0) {
                  break;
               }
            }

            this.f += var1;
         }
      }
   }

   final void d(int var1) {
      this.i = var1;
   }

   public final void run() {
   }

   static void a(int var0, int var1, int var2, int var3) {
      a = new int[8];
      a = new int[l][m];
      a = new j[l][1];
      a = new Graphics[l][1];
      if (var2 > 0 && var3 > 0) {
         a = new byte[l][2][];
         a = new d[l];
         a[2] = var2;
         a[4] = 0;
         a[5] = var3;
         a[7] = 0;
      }

      a = new int[l][n][4];
      a[0] = var0;
      a[1] = var1;
      b = true;
   }

   private static void f(int var0) {
      var0 = a[0][18];
      int var1 = a[0][19];
      int var2 = var0 % a[2];
      int var3 = 1 + (var2 != 0 ? 1 : 0);
      a[0][7] = var0 - var2 + var3 * a[2];
      var0 = var1 % a[5];
      var2 = 1 + (var0 != 0 ? 1 : 0);
      a[0][8] = var1 - var0 + var2 * a[5];
   }

   private static void g(int var0) {
      try {
         a[0][0] = j.a(a[0][7], a[0][8]);
         a[0][0] = a[0][0].a.getGraphics();
      } catch (Exception var1) {
         new StringBuffer().append("GLLibPlayer.Tileset_LoadLayer.pb while ceating circular buffer : ").append(var1.toString());
      }
   }

   static void c() {
      if (b) {
         f(0);
         g(0);
      }
   }

   private static boolean a(int var0, int var1) {
      return (a[var0][15] & var1) != 0;
   }

   private static void a(int var0, boolean var1) {
      if (var1) {
         a[0][15] = a[0][15] | var0;
      } else {
         a[0][15] = a[0][15] & ~var0;
      }
   }

   static void a(byte[] var0, byte[] var1, byte[] var2, d var3) {
      var1 = var1;
      var0 = var0;
      if (b) {
         b(0, false);
         a[0][18] = 0;
         a[0][19] = 0;
         a[0][18] = a[0];
         a[0][19] = a[1];
         a[0][0] = var1;
         a[0][1] = var2;
         a[0][2] = f.a(var0, 0);
         a[0][3] = f.a(var0, 2);
         a[0][5] = a[0][2] * a[2];
         a[0][6] = a[0][3] * a[5];
         a[0] = var3;
         f(0);
         if (a[0][0] == null || a[0][0].a.getWidth() != a[0][7] || a[0][0].a.getHeight() != a[0][8]) {
            g(0);
         }

         a(64, true);
         a(4, true);
         a(128, true);
         a[0][9] = -1;
         a[0][10] = -1;
         a[0][11] = -1;
         a[0][12] = -1;
         a[0][0] = 1;
         a[0][1] = 1;
         a[0][13] = 0;
         a[0][14] = 0;
         a[0][16] = 0;
         a[0][17] = 0;
         a(1, false);
         a(16, false);
         a(2, false);
         a(32, false);
         a(8, false);
      }
   }

   static void e(int var0) {
      b(var0, true);
   }

   private static void b(int var0, boolean var1) {
      if (b) {
         a[var0] = new int[m];
         if (var1) {
            a[var0] = new j[1];
            a[var0] = new Graphics[1];
         }

         if (a != null) {
            a[var0] = new byte[2][];
            a[var0] = null;
         }
      }
   }

   static void a(Graphics var0, int var1, int var2, int var3) {
      var1 = var1;
      var0 = var0;
      if (b) {
         if (var3 == -1) {
            for (int var27 = 0; var27 < l; var27++) {
               a(var0, var1, var2, var27);
            }

            return;
         }

         int var4 = a[var3][18] * 100 / p;
         int var5 = a[var3][19] * 100 / p;
         if (var4 == 0) {
            a[var3][18] = a[0];
            var4 = a[var3][18];
         }

         if (var5 == 0) {
            a[var3][19] = a[1];
            var4 = a[var3][18];
         }

         int[] var6;
         if ((var6 = a[var3])[0] != 1 || var6[1] != 1) {
            return;
         }

         int var7 = var6[13] + var6[16];
         int var8 = var6[14] + var6[17];
         if (a(var3, 4)) {
            int var28 = 0;
            int var29 = 0;
            int var30 = 0;
            int var31 = 0;
            if (var0 != null) {
               var28 = f.a(var0);
               var29 = f.b(var0);
               var30 = f.c(var0);
               var31 = f.d(var0);
            }

            if (a(var3, 128)) {
               o = 0;
            }

            if (a(var3, 256)) {
               h(var3);
            } else {
               int var17 = var7;
               int var18 = var8;
               if (var17 < 0) {
                  var17 -= a[2];
               }

               if (var18 < 0) {
                  var18 -= a[5];
               }

               int var32 = var17 / a[2];
               int var37 = var18 / a[5];
               int var41 = var32 + var6[7] / a[2] - 1;
               int var44 = var37 + var6[8] / a[5] - 1;
               int var19 = 0;
               int var20 = 0;
               if (var6[10] != var37 || var6[12] != var44) {
                  if (var6[10] >= var37 && var6[12] >= var44) {
                     if (var6[10] > var44) {
                        var19 = var37;
                        var20 = var44;
                     } else {
                        var19 = var37;
                        var20 = var6[10] - 1;
                     }
                  } else if (var6[12] < var37) {
                     var19 = var37;
                     var20 = var44;
                  } else {
                     var19 = var6[12] + 1;
                     var20 = var44;
                  }
               }

               if (var6[9] != var32 || var6[11] != var41) {
                  if (var6[9] >= var32 && var6[11] >= var41) {
                     if (var6[9] > var41) {
                        var17 = var32;
                        var18 = var41;
                     } else {
                        var17 = var32;
                        var18 = var6[9] - 1;
                     }
                  } else if (var6[11] < var32) {
                     var17 = var32;
                     var18 = var41;
                  } else {
                     var17 = var6[11] + 1;
                     var18 = var41;
                  }

                  int var21 = var44 - var37;
                  int var22 = var37;
                  if (var6[10] != var37 || var6[12] != var44) {
                     if (var6[10] >= var37 && var6[12] >= var44) {
                        var21 -= var20 - var19 + 1;
                        var22 += var20 - var19 + 1;
                     } else {
                        var21 -= var20 - var19 + 1;
                     }
                  }

                  if (var21 >= 0) {
                     a(a[var3][0], var3, var17, var22, var18 - var17, var21, 0, 0);
                  }

                  var6[9] = var32;
                  var6[11] = var41;
               }

               if (var6[10] != var37 || var6[12] != var44) {
                  a(a[var3][0], var3, var32, var19, var41 - var32, var20 - var19, 0, 0);
                  var6[10] = var37;
                  var6[12] = var44;
               }
            }

            if (var0 != null) {
               if (!a(var3, 273)) {
                  if (var7 < 0) {
                     var1 -= var7;
                     var7 = 0;
                  } else if (var7 > var6[5] - var4) {
                     var1 -= var7 - (var6[5] - var4);
                     var7 = var6[5] - var4;
                  }
               } else {
                  while (var7 < 0) {
                     var7 += var6[7];
                  }
               }

               if (!a(var3, 290)) {
                  if (var8 < 0) {
                     var2 -= var8;
                     var8 = 0;
                  } else if (var8 > var6[6] - var5) {
                     var2 -= var8 - (var6[6] - var5);
                     var8 = var6[6] - var5;
                  }
               } else {
                  while (var8 < 0) {
                     var8 += var6[8];
                  }
               }

               int var33 = var7 % var6[7];
               int var38 = var8 % var6[8];
               int var42 = (var7 + var4) % var6[7];
               int var45 = (var8 + var5) % var6[8];
               int var52 = var31;
               int var48 = var30;
               f.b(var0, var28, var29, var48, var52);
               if (var42 > var33) {
                  if (var45 > var38) {
                     a(var0, var3, var33, var38, var4, var5, var1, var2, var28, var29, var30, var31);
                  } else {
                     a(var0, var3, var33, var38, var4, var5 - var45, var1, var2, var28, var29, var30, var31);
                     var42 = var31;
                     var38 = var30;
                     f.b(var0, var28, var29, var38, var42);
                     a(var0, var3, var33, 0, var4, var45, var1, var5 - var45 + var2, var28, var29, var30, var31);
                  }
               } else if (var45 > var38) {
                  a(var0, var3, var33, var38, var4 - var42, var5, var1, var2, var28, var29, var30, var31);
                  var45 = var31;
                  var33 = var30;
                  f.b(var0, var28, var29, var33, var45);
                  a(var0, var3, 0, var38, var42, var5, var4 - var42 + var1, var2, var28, var29, var30, var31);
               } else {
                  a(var0, var3, var33, var38, var4 - var42, var5 - var45, var1, var2, var28, var29, var30, var31);
                  var52 = var31;
                  var48 = var30;
                  f.b(var0, var28, var29, var48, var52);
                  a(var0, var3, var33, 0, var4 - var42, var45, var1, var5 - var45 + var2, var28, var29, var30, var31);
                  var48 = var31;
                  var33 = var30;
                  f.b(var0, var28, var29, var33, var48);
                  a(var0, var3, 0, var38, var42, var5 - var45, var4 - var42 + var1, var2, var28, var29, var30, var31);
                  var38 = var31;
                  var33 = var30;
                  f.b(var0, var28, var29, var33, var38);
                  a(var0, var3, 0, 0, var42, var45, var4 - var42 + var1, var5 - var45 + var2, var28, var29, var30, var31);
               }

               var3 = var31;
               var2 = var30;
               f.b(var0, var28, var29, var2, var3);
            }

            return;
         }

         if (var0 != null) {
            int var15 = var7;
            int var16 = var8;
            if (var15 < 0) {
               var15 -= a[2];
            }

            if (var16 < 0) {
               var16 -= a[5];
            }

            int var9 = var15 / a[2];
            int var10 = var16 / a[5];
            int var11;
            if ((var11 = var4 / a[2]) * a[2] < var4) {
               var11++;
            }

            int var12;
            if ((var12 = var5 / a[5]) * a[5] < var5) {
               var12++;
            }

            int var13 = var9 * a[2] - var7;
            int var14 = var10 * a[5] - var8;
            a(var0, var3, var9, var10, var11, var12, var13 + var1, var14 + var2);
         }
      }
   }

   static void a(int var0, int var1, int var2, int var3, int var4) {
      if (b && a(var4, 4)) {
         if (var4 != -1) {
            int[] var16;
            if ((var16 = a[var4])[0] == 1 && var16[1] == 1) {
               if (var0 + var2 > var16[13] && var0 < var16[13] + var16[7] && var1 + var3 > var16[14] && var1 < var16[14] + var16[8]) {
                  var2 = var0 + var2 < var16[13] + var16[7] ? var0 + var2 : var16[13] + var16[7];
                  var3 = var1 + var3 < var16[14] + var16[8] ? var1 + var3 : var16[14] + var16[8];
                  var0 = var0 > var16[13] ? var0 : var16[13];
                  var1 = var1 > var16[14] ? var1 : var16[14];
                  var2 -= var0;
                  var3 -= var1;
                  if (var0 < 0) {
                     var0 -= a[2];
                  }

                  if (var1 < 0) {
                     var1 -= a[5];
                  }

                  var0 /= a[2];
                  var1 /= a[5];
                  var2 = var2 / a[2] - 1;
                  var3 = var3 / a[5] - 1;
                  a(a[var4][0], var4, var0, var1, var2, var3, 0, 0, true);
               }
            }
         } else {
            for (int var5 = 0; var5 < l; var5++) {
               a(var0, var1, var2, var3, var5);
            }
         }
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var6 <= (var8 + var10) * 100 && var7 <= (var9 + var11) * 100 && var6 + var4 >= var8 * 100 && var7 + var5 >= var9 * 100) {
         f.a(var0, var6, var7, var4, var5);
         j var10001 = a[var1][0];
         int var10002 = var6 - var2;
         var3 = var7 - var3;
         f.a(var0, var10001, var10002, var3);
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      a(var0, var1, var2, var3, var4, var5, var6, var7, false);
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      int var9 = a(var1, 4);
      boolean var10 = a(var1, 1);
      boolean var11 = a(var1, 2);
      int var12 = a[var1][2];
      int var13 = a[var1][3];
      int var14 = a[2];
      int var15 = a[5];
      int var16 = var12 * var13;
      if (var9) {
         var6 += var2 * a[2] % a[var1][7];
         var7 += var3 * a[5] % a[var1][8];
         if (var6 < 0) {
            var6 += a[var1][7];
         }

         if (var7 < 0) {
            var7 += a[var1][8];
         }
      }

      if (!var10) {
         if (!a(var1, 16)) {
            if (var2 < 0) {
               var6 -= var2 * var14;
               var4 += var2;
               var2 = 0;
               if (var9 && var6 >= a[var1][7]) {
                  var6 = 0;
               }
            }

            if (var2 + var4 >= var12) {
               var4 = var12 - var2 - 1;
            }

            if (var4 < 0) {
               return;
            }
         }
      } else {
         while (var2 < 0) {
            var2 += var12;
         }

         while (var2 >= var12) {
            var2 -= var12;
         }
      }

      if (!var11) {
         if (!a(var1, 32)) {
            if (var3 < 0) {
               var7 -= var3 * var15;
               var5 += var3;
               var3 = 0;
               if (var9 && var7 >= a[var1][8]) {
                  var7 = 0;
               }
            }

            if (var3 + var5 >= var13) {
               var5 = var13 - var3 - 1;
            }

            if (var5 < 0) {
               return;
            }
         }
      } else {
         while (var3 < 0) {
            var3 += var13;
         }

         while (var3 >= var13) {
            var3 -= var13;
         }
      }

      int var17 = var6;
      int var18 = var7;

      while (var5-- >= 0) {
         var17 = var6;
         int var19 = var4;
         int var20 = var2;

         while (var19-- >= 0) {
            int var21;
            if ((var21 = var20 + var3 * var12) < var16) {
               int var23 = var21;
               int var22;
               if ((var22 = b(var1, 0, var23)) != 255) {
                  if (a[var1][1] == null) {
                     var21 = 0;
                  } else {
                     var23 = var21;
                     var21 = b(var1, 1, var23);
                  }

                  if (p != 100) {
                     f.n();
                     var23 = p;
                     f.a[13][1] = var23;
                     f.b(true);
                  }

                  if (a[var1].b() == 0) {
                     a[var1].a(var0, var22, var17, var18, var21, a[2], a[5]);
                  } else {
                     var23 = var17;
                     int var24 = var18;
                     if ((var21 & 1) != 0) {
                        var23 += var14;
                     }

                     if ((var21 & 2) != 0) {
                        var24 += var15;
                     }

                     if ((var21 & 4) != 0) {
                        if ((var21 & 1) != 0) {
                           var23 -= var15;
                        } else {
                           var23 += var15;
                        }
                     }

                     a[var1].a(var0, var22, var23, var24, var21);
                  }

                  if (p != 100) {
                     f.b(false);
                     f.o();
                  }
               }
            }

            var17 += var14;
            if (++var20 >= var12) {
               if (!var10) {
                  break;
               }

               var20 = 0;
            }

            if (var9 && var17 >= a[var1][7]) {
               var17 = 0;
            }
         }

         var18 += var15;
         if (++var3 >= var13) {
            if (!var11) {
               break;
            }

            var3 = 0;
         }

         if (var9 && var18 >= a[var1][8]) {
            var18 = 0;
         }
      }

      if (!var8 && a(var1, 128)) {
         int var36;
         int var37;
         if (var17 > var6) {
            var36 = var17;
            var37 = 0;
         } else {
            var36 = a[var1][7];
            var37 = var17;
         }

         int var25;
         if (var18 > var7) {
            var25 = var18;
            var2 = 0;
         } else {
            var25 = a[var1][8];
            var2 = var18;
         }

         for (int var27 = 0; var27 < 4; var27++) {
            if ((var27 != 1 && var27 != 3 || var37 != 0) && (var27 != 2 && var27 != 3 || var2 != 0)) {
               var4 = var27 != 0 && var27 != 2 ? 0 : var6;
               var5 = var27 != 0 && var27 != 1 ? 0 : var7;
               var8 = var27 != 0 && var27 != 2 ? var37 : var36 - var6;
               var9 = var27 != 0 && var27 != 1 ? var2 : var25 - var7;
               b(var1, var4, var5, var8, var9);
            }
         }
      }
   }

   private static final void b(int var0, int var1, int var2, int var3, int var4) {
      int[] var5;
      (var5 = a[var0][o])[0] = var1;
      var5[1] = var2;
      var5[2] = var3;
      var5[3] = var4;
      o++;
   }

   private static final int a(int var0, int var1) {
      return a(0, 8) ? a[0][6] - a[1] - var1 : var1;
   }

   static final void c(int var0, int var1) {
      if (b) {
         if (l <= 0) {
            new StringBuffer().append("Tileset_SetCamera: nLayer invalid : ").append(0);
         } else if (a[0][0] == 1 && a[0][1] == 1) {
            a[0][13] = var0;
            a[0][14] = a(0, var1);
            if (a(0, 16)) {
               if (a[0][13] < 0) {
                  a[0][13] = 0;
               } else if (a[0][13] + a[0] >= a[0][5]) {
                  a[0][13] = a[0][5] - a[0] - 1;
               }
            }

            if (a(0, 32)) {
               if (a[0][14] < 0) {
                  a[0][14] = 0;
                  return;
               }

               if (a[0][14] + a[1] >= a[0][6]) {
                  a[0][14] = a[0][6] - a[1] - 1;
               }
            }
         }
      }
   }

   static final int d() {
      if (!b) {
         return -1;
      } else if (l <= 0) {
         new StringBuffer().append("Tileset_GetCamera: nLayer invalid : ").append(0);
         return -1;
      } else {
         return a[0][0] == 1 && a[0][1] == 1 ? a[0][13] : -1;
      }
   }

   static final int e() {
      if (!b) {
         return -1;
      } else if (l <= 0) {
         new StringBuffer().append("Tileset_GetCamera: nLayer invalid : ").append(0);
         return -1;
      } else if (a[0][0] != 1 || a[0][1] != 1) {
         return -1;
      } else {
         return a(0, 8) ? a[0][6] - a[1] - a[0][14] : a[0][14];
      }
   }

   static final int f() {
      if (!b) {
         return -1;
      } else if (l <= 0) {
         new StringBuffer().append("Tileset_GetLayerWidth: nLayer invalid : ").append(0);
         return -1;
      } else {
         return a[0][0] == 1 && a[0][1] == 1 ? a[0][5] : -1;
      }
   }

   static final int g() {
      if (!b) {
         return -1;
      } else if (l <= 0) {
         new StringBuffer().append("Tileset_GetLayerHeight: nLayer invalid : ").append(0);
         return -1;
      } else {
         return a[0][0] == 1 && a[0][1] == 1 ? a[0][6] : -1;
      }
   }

   static final int a(int var0, int var1, int var2) {
      var2 = a(0, var2);
      if (!b) {
         return -1;
      } else if (l <= 0) {
         new StringBuffer().append("Tileset_GetTile: nLayer invalid : ").append(0);
         return -1;
      } else if (a[0][0] != 1 || a[0][1] != 1) {
         return -1;
      } else if (var1 < 0 || var1 > a[0][2]) {
         new StringBuffer().append("Tileset_GetTile: x value out of bound [").append(var1).append("]  0 <= x < ").append(a[0][2]);
         return -1;
      } else if (var2 >= 0 && var2 <= a[0][3]) {
         var0 = var2;
         var2 = var1;
         var1 = a[0][2];
         return b(0, 0, var0 * var1 + var2);
      } else {
         new StringBuffer().append("Tileset_GetTile: y value out of bound [").append(var2).append("]  0 <= y < ").append(a[0][3]);
         return -1;
      }
   }

   static final j a() {
      if (!b) {
         return null;
      } else if (l <= 0) {
         new StringBuffer().append("Tileset_GetBufferImage: p_iLayer invalid : ").append(0);
         return null;
      } else {
         return a[0][0];
      }
   }

   static void d() {
      if (b) {
         if (a(0, 256)) {
            a[0][9] = 1;
         } else {
            a[0][9] = -1;
            a[0][10] = -1;
            a[0][11] = -1;
            a[0][12] = -1;
         }
      }
   }

   static void a(int var0, int var1, int var2) {
      var1 = a(0, var1);
      var0 /= a[2];
      var1 /= a[5];
      if (b) {
         if (l <= 0) {
            new StringBuffer().append("Tileset_SetTile: layer invalid : ").append(0);
         } else if (a[0][0] == 1 && a[0][1] == 1) {
            if (var0 < 0 || var0 > a[0][2]) {
               new StringBuffer().append("Tileset_SetTile: x value out of bound [").append(var0).append("]  0 <= x < ").append(a[0][2]);
            } else if (var1 >= 0 && var1 <= a[0][3]) {
               var0 += var1 * a[0][2];
               if (var2 != -1) {
                  b(0, var0, var2);
               }

               b(1, var0, 0);
            } else {
               new StringBuffer().append("Tileset_SetTile: y value out of bound [").append(var1).append("]  0 <= y < ").append(a[0][3]);
            }
         }
      }
   }

   static final void a(int var0, int var1, int var2, int var3, boolean var4) {
      if (a(0, 4)) {
         a(2, 0, null, 0, 0, 0, 0, var2, var3, 0, var4, null);
      } else {
         var1 = 0 - e();
         var0 = 0 - d();
         f.c(f.a, var0, var1, var2, var3);
      }
   }

   static final void a(int var0, d var1, int var2, int var3, int var4, boolean var5, int[] var6) {
      if (p != 100) {
         f.n();
         var0 = p;
         f.a[13][1] = var0;
         f.b(true);
      }

      if (a(0, 4)) {
         a(0, 0, var1, 0, var2, var3, var4, 0, 0, 0, var5, var6);
      } else {
         var1.a(f.a, var2, var3 - d(), var4 - e(), 0);
      }

      if (p != 100) {
         f.b(false);
         f.o();
      }
   }

   private static void a(int var0, int var1, Object var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int[] var11) {
      int[] var66 = var11;
      boolean var65 = var10;
      int var63 = var8;
      int var62 = var7;
      int var58 = var6;
      int var55 = var5;
      var3 = var4;
      var2 = var2;
      var0 = var0;
      if (a(0, 4) && (o != 0 || var65)) {
         var11 = a[0];
         var1 = 0;
         var8 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var0 == 0) {
            var1 = ((d)var2).f(var3);
            var8 = ((d)var2).g(var3);
            var12 = ((d)var2).d(var3);
            var13 = ((d)var2).e(var3);
            if ((f.aa & 8192) != 0) {
               int var14 = f.a[13][1];
               var1 = var1 * var14 / 100;
               var8 = var8 * var14 / 100;
               var12 = var12 * var14 / 100;
               var13 = var13 * var14 / 100;
            }
         } else if (var0 != 1 && var0 != 2 && var0 != 3 && var0 != 5 && var0 != 4) {
            new StringBuffer().append("Tileset_PaintToBuffer: Invalid drawOperation set: ").append(var0);
         } else {
            var12 = var62;
            var13 = var63;
         }

         var5 = a(0, var58);
         int var70 = var11[13];
         int var15 = var11[14];
         int var16;
         int var17;
         if (a(0, 256)) {
            var16 = var11[2];
            var17 = var11[3];
         } else {
            var16 = a[2];
            var17 = a[5];
         }

         int var18 = var70 % var16;
         int var19 = var15 % var17;
         if (var18 < 0) {
            var18 += var16;
         }

         if (var19 < 0) {
            var19 += var17;
         }

         var70 -= var18;
         var15 -= var19;
         var4 = var55 - var70;
         var5 -= var15;
         if (a(0, 273) && var70 < 0) {
            var70 = var11[7] + var70 % var11[7];
         }

         if (a(0, 290) && var15 < 0) {
            var15 = var11[8] + var15 % var11[8];
         }

         var16 = var70 % var11[7];
         var17 = var15 % var11[8];
         var18 = var11[7] - var16;
         var19 = var11[8] - var17;
         Graphics var20;
         int var21 = f.a(var20 = a[0][0]);
         int var22 = f.b(var20);
         int var23 = f.c(var20);
         int var24 = f.d(var20);
         int var25 = 1;
         if (!var65) {
            var25 = o;
         }

         int var26 = var11[7];
         int var27 = var11[8];
         int var28 = d.b;
         int var29 = d.c;
         int var30 = var27;
         d.b = var26;
         d.c = var30;
         var30 = var25;
         var4 += var1;
         var5 += var8;
         var12 = var4 + var12;
         var13 = var5 + var13;
         int var37 = 0;
         int var38 = 0;
         int var39 = 0;
         int var40 = 0;
         if (var66 != null) {
            var37 = var66[0] - var70;
            var38 = var66[1] - var15;
            var39 = var66[2] - var70;
            var40 = var66[3] - var15;
         }

         for (int var41 = 0; var41 < 1; var41++) {
            var70 = var4;
            var15 = var5;
            int var31 = var12;
            int var32 = var13;

            for (int var42 = 0; var42 < 1; var42++) {
               int var33 = var70;
               int var34 = var15;
               int var35 = var31;
               int var36 = var32;
               if (var33 <= var26 && var36 >= 0 && var35 >= 0 && var34 <= var27) {
                  var25 = var30;

                  while (--var25 >= 0) {
                     int[] var43 = null;
                     if (!var65) {
                        int var44 = (var43 = a[0][var25])[0] - var16;
                        if (var43[0] < var16) {
                           var44 += var11[7];
                        }

                        int var45 = var44 + var43[2];
                        if (var33 >= var45 || var35 < var44) {
                           continue;
                        }

                        int var46 = var43[1] - var17;
                        if (var43[1] < var17) {
                           var46 += var11[8];
                        }

                        int var47 = var46 + var43[3];
                        if (var34 >= var47 || var36 < var46) {
                           continue;
                        }
                     }

                     if (var33 < var18 && (var66 == null || var37 < var18)) {
                        if (var34 < var19 && (var66 == null || var38 < var19)) {
                           int var82;
                           int var88;
                           int var93;
                           int var97;
                           if (var66 != null) {
                              var82 = var37 > 0 ? var37 : 0;
                              var88 = var38 > 0 ? var38 : 0;
                              var93 = (var39 < var18 ? var39 : var18) - var82;
                              var97 = (var40 < var19 ? var40 : var19) - var88;
                              var82 += var16;
                              var88 += var17;
                           } else {
                              var82 = var16;
                              var88 = var17;
                              var93 = var18;
                              var97 = var19;
                           }

                           a(
                              var20,
                              var2,
                              var3,
                              0,
                              var82,
                              var88,
                              var93,
                              var97,
                              var16 + var33 - var1,
                              var17 + var34 - var8,
                              var62,
                              var63,
                              var0,
                              var21,
                              var22,
                              var23,
                              var24,
                              var43,
                              var65
                           );
                        }

                        if (var36 >= var19 && var17 != 0 && (var66 == null || var40 >= var19)) {
                           int var84;
                           byte var89;
                           int var94;
                           int var98;
                           if (var66 != null) {
                              var84 = var37 > 0 ? var37 : 0;
                              var89 = (byte)(var38 - var19 > 0 ? var38 - var19 : 0);
                              var94 = (var39 < var18 ? var39 : var18) - var84;
                              var98 = (var40 - var19 < var17 ? var40 - var19 : var17) - var89;
                              var84 += var16;
                           } else {
                              var84 = var16;
                              var89 = 0;
                              var94 = var18;
                              var98 = var17;
                           }

                           a(
                              var20,
                              var2,
                              var3,
                              0,
                              var84,
                              var89,
                              var94,
                              var98,
                              var16 + var33 - var1,
                              var34 - var8 - var19,
                              var62,
                              var63,
                              var0,
                              var21,
                              var22,
                              var23,
                              var24,
                              var43,
                              var65
                           );
                        }
                     }

                     if (var35 >= var18 && var16 != 0 && (var66 == null || var39 >= var18)) {
                        if (var34 < var19 && (var66 == null || var38 < var19)) {
                           byte var85;
                           int var91;
                           int var95;
                           int var99;
                           if (var66 != null) {
                              var85 = (byte)(var37 - var18 > 0 ? var37 - var18 : 0);
                              var91 = var38 > 0 ? var38 : 0;
                              var95 = (var39 - var18 < var16 ? var39 - var18 : var16) - var85;
                              var99 = (var40 < var19 ? var40 : var19) - var91;
                              var91 += var17;
                           } else {
                              var85 = 0;
                              var91 = var17;
                              var95 = var16;
                              var99 = var19;
                           }

                           a(
                              var20,
                              var2,
                              var3,
                              0,
                              var85,
                              var91,
                              var95,
                              var99,
                              var33 - var1 - var18,
                              var17 + var34 - var8,
                              var62,
                              var63,
                              var0,
                              var21,
                              var22,
                              var23,
                              var24,
                              var43,
                              var65
                           );
                        }

                        if (var36 >= var19 && var17 != 0 && (var66 == null || var40 >= var19)) {
                           byte var86;
                           byte var92;
                           int var96;
                           int var100;
                           if (var66 != null) {
                              var86 = (byte)(var37 - var18 > 0 ? var37 - var18 : 0);
                              var92 = (byte)(var38 - var19 > 0 ? var38 - var19 : 0);
                              var96 = (var39 - var18 < var16 ? var39 - var18 : var16) - var86;
                              var100 = (var40 - var19 < var17 ? var40 - var19 : var17) - var92;
                           } else {
                              var86 = 0;
                              var92 = 0;
                              var96 = var16;
                              var100 = var17;
                           }

                           a(
                              var20,
                              var2,
                              var3,
                              0,
                              var86,
                              var92,
                              var96,
                              var100,
                              var33 - var1 - var18,
                              var34 - var8 - var19,
                              var62,
                              var63,
                              var0,
                              var21,
                              var22,
                              var23,
                              var24,
                              var43,
                              var65
                           );
                        }
                     }
                  }
               }
            }
         }

         var3 = var24;
         var2 = var23;
         f.b(var20, var21, var22, var2, var3);
         var0 = var29;
         d.b = var28;
         d.c = var0;
      }
   }

   private static void a(
      Graphics var0,
      Object var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int[] var17,
      boolean var18
   ) {
      f.a(var0, var4, var5, var6, var7);
      if (!var18) {
         int var10001 = var17[0];
         int var10002 = var17[1];
         int var10003 = var17[2];
         int var21 = var17[3];
         var7 = var10003;
         f.a(var0, var10001, var10002, var7, var21);
      }

      if (var12 == 0) {
         ((d)var1).b(var0, var2, var8, var9, 0);
      } else if (var12 == 5) {
         int[] var22 = (int[])var1;
         var4 = var10;
         f.a(var0, var22, 0, var4, var8, var9, var4, var11, true, false, 0, -1, true);
      } else if (var12 == 4) {
         f.a(var0, (j)var1, var8, var9);
      } else if (var12 == 1) {
         f.d(var0, var8, var9, var10, var11);
      } else if (var12 == 2) {
         f.c(var0, var8, var9, var10, var11);
      } else if (var12 == 3) {
         f.e(var0, var8, var9, var10, var11);
      }

      f.b(var0, var13, var14, var15, var16);
   }

   private static final void b(int var0, int var1, int var2) {
      var0 = var0;
      a[0][var0][var1] = (byte)var2;
   }

   private static int b(int var0, int var1, int var2) {
      return a[var0][var1][var2] & 0xFF;
   }

   private static void h(int var0) {
      int[] var1;
      int var2 = (var1 = a[var0])[13];
      int var3 = var1[14];
      int var4 = a[0];
      int var5 = a[1];
      int var6 = var1[5];
      int var7 = var1[6];
      int var8 = var6 + var1[7];
      int var9 = var7 + var1[8];
      int var10 = var1[2];
      int var11 = var1[3];
      int var12 = var1[9] > 0;
      int var13 = var2;
      if (var2 < 0) {
         var13 = var2 - (var10 - 1);
      }

      int var14 = var3;
      if (var3 < 0) {
         var14 = var3 - (var11 - 1);
      }

      if (!var12) {
         int var10000 = var8 - 1;
         int var10001 = var9 - 1;
         int var10002 = var2 + var4 - 1;
         int var17 = var3 + var5 - 1;
         int var15 = var10002;
         int var16 = var10001;
         if (var10000 < var2 ? false : (var6 > var15 ? false : (var16 < var3 ? false : var7 <= var17))) {
            var15 = 0;
            var16 = 0;
            if (var2 < var6) {
               var2 = var13 / var10 * var10;
               var12 = var14 / var11 * var11;
               var4 = var6 - var2;
               var6 = var1[8];
               var15 = var4;
               var16 = var4;
               var1[5] = var2;
               c(var0, var2, var12, var4, var6);
            } else if (var2 + var4 >= var8) {
               var12 = var14 / var11 * var11;
               var4 = ((var2 + var4 - var8) / var10 + 1) * var10;
               var6 = var1[8];
               var16 = var4;
               var1[5] = var13 / var10 * var10;
               c(var0, var8, var12, var4, var6);
            }

            if (var3 < var7) {
               var2 = var13 / var10 * var10 + var15;
               var12 = var14 / var11 * var11;
               var4 = var1[7] - var16;
               var6 = var7 - var12;
               var1[6] = var12;
               c(var0, var2, var12, var4, var6);
            } else if (var3 + var5 >= var9) {
               var2 = var13 / var10 * var10 + var15;
               var4 = var1[7] - var16;
               var6 = ((var3 + var5 - var9) / var11 + 1) * var11;
               var1[6] = var14 / var11 * var11;
               c(var0, var2, var9, var4, var6);
            }

            var1[10] = 0;
            return;
         }
      }

      int var32 = var13 / var10 * var10;
      int var34 = var14 / var11 * var11;
      c(var0, var32, var34, var1[7], var1[8]);
      var1[5] = var32;
      var1[6] = var34;
      if (var12) {
         var1[9] = 0;
      }

      var1[10] = 1;
   }

   private static void c(int var0, int var1, int var2, int var3, int var4) {
      Graphics var5;
      (var5 = a[var0][0]).setColor(a[var0][4]);
      int var6 = a[var0][7];
      int var7 = a[var0][8];
      if ((var1 = var1 % var6) < 0) {
         var1 += var6;
      }

      if ((var2 = var2 % var7) < 0) {
         var2 += var7;
      }

      if (var1 + var3 > var6) {
         int var8 = var4;
         if (var2 + var4 > var7) {
            int var10001 = var1 + var3 - var6;
            int var10 = var2 + var4 - var7;
            int var9 = var10001;
            f.c(var5, 0, 0, var9, var10);
            b(var0, 0, 0, var1 + var3 - var6, var2 + var4 - var7);
            var8 = var7 - var2;
         }

         int var10002 = var1 + var3 - var6;
         int var11 = var8;
         int var15 = var10002;
         int var18 = var2;
         f.c(var5, 0, var18, var15, var11);
         b(var0, 0, var2, var1 + var3 - var6, var8);
         var3 = var6 - var1;
      }

      if (var2 + var4 > var7) {
         int var19 = var2 + var4 - var7;
         int var16 = var3;
         f.c(var5, var1, 0, var16, var19);
         b(var0, var1, 0, var3, var2 + var4 - var7);
         var4 = var7 - var2;
      }

      int var17 = var4;
      int var14 = var3;
      f.c(var5, var1, var2, var14, var17);
      b(var0, var1, var2, var3, var4);
   }
}
