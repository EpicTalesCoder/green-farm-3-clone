import javax.microedition.lcdui.Graphics;

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
   static int b = 240;
   static int c = 320;
   j[][] a;
   private j[][][] a;
   private static int[] g = new int[]{0, 2, 1, 3, 5, 7, 4, 6};
   private static int[] h = new int[]{1, 0, 3, 2, 6, 7, 4, 5};
   private static int[] i = new int[]{2, 3, 0, 1, 5, 4, 7, 6};
   private static int[] j = new int[]{4, 5, 6, 7, 3, 2, 1, 0};
   private byte[] q;
   private byte[] r;
   private int[] k;
   private static int i;
   private static int j;
   private static int k;
   private static int l;
   static int[] b = new int[4];
   private static boolean b = true;
   private static char a = '|';
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
   private static int v = -1;
   private static int w = -1;
   private static int x = -1;

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
         for (int var1 = 0; var1 < this.a.length; var1++) {
            this.a[var1] = null;
         }

         this.a = null;
      }

      d var3 = this;
      if (this.a != null) {
         for (int var2 = 0; var2 < var3.a.length; var2++) {
            var3.a[var2] = null;
         }

         var3.a = null;
      }
   }

   final void a(byte[] var1, int var2) {
      int var4 = 16777215;
      byte[] var8 = var1;
      d var7 = this;
      if (var8 != null) {
         try {
            if (b) {
               System.gc();
            }

            short var3;
            if ((var3 = (short)((var8[0] & 255) + ((var8[1] & 255) << 8))) != 1503) {
               new StringBuffer()
                  .append("ASprite.Load.Invalid BSprite version !  GLLib supports only (0x")
                  .append(Integer.toHexString(1503))
                  .append(")    this sprite version (0x")
                  .append(Integer.toHexString(var3))
                  .append(")");
            }

            var7.f = (var8[2] & 255) + ((var8[3] & 255) << 8) + ((var8[4] & 255) << 16) + ((var8[5] & 255) << 24);
            var3 = var7.a(6, var8);
            var3 = var7.b(var3, var8);
            var3 = var7.c(var3, var8);
            var3 = var7.d(var3, var8);
            var3 = var7.e(var3, var8);
            if (var7.e <= 0) {
               if (b) {
                  System.gc();
               }
            } else {
               if ((var7.f & 16777216) != 0) {
                  var7.a(var3, var8, var4);
               }

               if ((var7.f & 4096) != 0) {
                  if ((var2 = var7.b()) > 0) {
                     var3 = 0;
                     if ((var7.f & 1024) == 0 && (var7.h & 4) == 0) {
                        var7.e = new byte[var2 << 2];

                        for (int var23 = 0; var23 < var2; var23++) {
                           var7.a(b, var23);
                           var7.e[var3++] = (byte)b[0];
                           var7.e[var3++] = (byte)b[1];
                           var7.e[var3++] = (byte)(b[2] - b[0]);
                           var7.e[var3++] = (byte)(b[3] - b[1]);
                        }
                     } else {
                        var7.e = new short[var2 << 2];

                        for (int var22 = 0; var22 < var2; var22++) {
                           var7.a(b, var22);
                           var7.e[var3++] = (short)b[0];
                           var7.e[var3++] = (short)b[1];
                           var7.e[var3++] = (short)(b[2] - b[0]);
                           var7.e[var3++] = (short)(b[3] - b[1]);
                        }
                     }
                  }
               } else if ((var7.h & 4) != 0) {
                  var7.h &= -5;
               }

               if (b) {
                  System.gc();
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            new StringBuffer().append("Asprite.Load. error while loading sprite : ").append(var6);
         }
      }
   }

   private void f(int var1) {
      if (this.q == null) {
         this.q = new byte[var1];

         for (int var2 = 0; var2 < var1; var2++) {
            this.q[var2] = 0;
         }
      }

      if (this.k == null) {
         this.k = new int[var1];
      }
   }

   private int a(int var1, byte[] var2) {
      var1++;
      int var10001 = var2[6] & 255;
      var1++;
      this.e = (short)(var10001 + ((var2[7] & 255) << 8));
      if (this.e > 0) {
         this.a = new byte[this.e];
         this.b = new byte[this.e];
         int var3 = 0;
         byte var4 = 0;
         short[][] var5 = null;
         if ((this.f & 4) != 0) {
            this.r = new byte[this.e];
         }

         boolean var6 = false;
         boolean var7 = false;

         for (int var11 = 0; var11 < this.e; var11++) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            if ((var2[var1] & 255) == 0) {
               var1++;
               var6 = false;
               var7 = true;
               if ((this.f & 4) != 0) {
                  this.r[var11] = var2[var1++];
               }
            } else if ((var2[var1] & 255) == 255) {
               var1++;
               this.f(this.e);
               this.q[var11] = 1;
               var6 = true;
               var7 = true;
            } else if ((var2[var1] & 255) == 254) {
               var1++;
               this.f(this.e);
               this.q[var11] = 2;
               var6 = true;
               var7 = true;
            } else if ((var2[var1] & 255) == 253) {
               var1++;
               this.f(this.e);
               this.q[var11] = 5;
               var6 = false;
               var7 = true;
            } else if ((var2[var1] & 255) == 252) {
               var1++;
               this.f(this.e);
               this.q[var11] = 3;
               var6 = true;
               var7 = true;
               var8 = true;
            } else if ((var2[var1] & 255) == 251) {
               var1++;
               this.f(this.e);
               this.q[var11] = 4;
               var6 = true;
               var7 = true;
               var8 = true;
            } else if ((var2[var1] & 255) == 250) {
               var1++;
               this.f(this.e);
               this.q[var11] = 6;
               var6 = true;
               var7 = false;
               var9 = true;
            } else if ((var2[var1] & 255) == 249) {
               var1++;
               this.f(this.e);
               this.q[var11] = 7;
               var6 = true;
               var7 = false;
               var9 = true;
            } else if ((var2[var1] & 255) == 248) {
               var1++;
               this.f(this.e);
               this.q[var11] = 8;
               var6 = true;
               var7 = true;
               var9 = false;
            } else if ((var2[var1] & 255) == 247) {
               var1++;
               this.f(this.e);
               this.q[var11] = 9;
               var6 = true;
               var10 = true;
               var7 = true;
               var9 = false;
            } else {
               new StringBuffer().append("Invalid module type : ").append(var2[var1] & 255).append("   module #").append(var11);
            }

            if (var6) {
               this.k[var11] = (var2[var1++] & 255) + ((var2[var1++] & 255) << 8) + ((var2[var1++] & 255) << 16) + ((var2[var1++] & 255) << 24);
            }

            if (var10) {
               if (var5 == null) {
                  var5 = new short[this.e][];
               }

               short[] var35 = new short[3];
               int var12 = (var2[var1++] & 255) + ((var2[var1++] & 255) << 8) + ((var2[var1++] & 255) << 16) + ((var2[var1++] & 255) << 24);
               var35[0] = (short)var12;
               var35[1] = (short)(var12 >> 16);
               var35[2] = var2[var1++];
               var5[var11] = var35;
               var3++;
               var4 += 3;
            }

            if (var7) {
               this.a[var11] = var2[var1++];
               this.b[var11] = var2[var1++];
            }

            if (var8) {
               if (var5 == null) {
                  var5 = new short[this.e][];
               }

               short[] var36;
               (var36 = new short[2])[0] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               var36[1] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               var5[var11] = var36;
               var3++;
               var4 += 2;
            }

            if (var9) {
               if (var5 == null) {
                  var5 = new short[this.e][];
               }

               short[] var37;
               (var37 = new short[4])[0] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               var37[1] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               var37[2] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               var37[3] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               var5[var11] = var37;
               var3++;
               var4 += 4;
            }
         }

         if (var3 > 0) {
            this.b = new short[var4];
            this.c = new short[var3 << 1];
            int var39 = 0;
            short var38 = 0;

            for (short var33 = 0; var33 < this.e; var33++) {
               byte var40;
               if (this.q[var33] == 4) {
                  var40 = 2;
               } else {
                  var40 = -1;
               }

               if (var40 > 0) {
                  this.c[var39 << 1] = var33;
                  this.c[(var39 << 1) + 1] = var38;

                  for (int var34 = 0; var34 < var40; var34++) {
                     this.b[var38] = var5[var33][var34];
                     var38++;
                  }

                  var5[var33] = null;
                  var39++;
               }
            }
         }
      }

      return var1;
   }

   private int b(int var1, byte[] var2) {
      short var3;
      if ((var3 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8))) > 0) {
         if ((this.f & 1048576) != 0) {
            this.h = new short[var3];
         } else {
            this.g = new byte[var3];
         }

         if ((this.f & 1024) != 0) {
            this.i = new short[var3];
            this.j = new short[var3];
         } else {
            this.i = new byte[var3];
            this.j = new byte[var3];
         }

         this.h = new byte[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            if ((this.f & 1048576) != 0) {
               this.h[var4] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
            } else {
               this.g[var4] = var2[var1++];
            }

            if ((this.f & 1024) != 0) {
               if ((this.f & 1024) != 0) {
                  this.i[var4] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
                  this.j[var4] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               } else {
                  this.i[var4] = var2[var1++];
                  this.j[var4] = var2[var1++];
               }
            } else {
               this.i[var4] = var2[var1++];
               this.j[var4] = var2[var1++];
            }

            this.h[var4] = var2[var1++];
         }
      }

      return var1;
   }

   private int c(int var1, byte[] var2) {
      if ((this.f & 32768) != 0) {
         int var3 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
         if ((this.f & 1024) == 0) {
            this.f = new byte[var3 << 2];
            System.arraycopy(var2, var1, this.f, 0, var3 << 2);
            var1 += var3 << 2;
         } else {
            this.f = new short[var3 << 2];
            int var5 = var3 << 2;
            short[] var4 = this.f;
            var3 = var1;
            byte[] var9 = var2;

            for (int var6 = 0; var6 < var5; var6++) {
               var4[var6] = (short)((var9[var3++] & 255) + ((var9[var3++] & 255) << 8));
            }

            var1 = var3;
         }
      }

      short var18;
      if ((var18 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8))) > 0) {
         if ((this.f & 2048) != 0) {
            this.d = new short[var18];
         } else {
            this.d = new byte[var18];
         }

         this.a = new short[var18];
         if ((this.f & 32768) != 0) {
            this.g = new short[var18 + 1];
         }

         short var21 = 0;

         for (int var22 = 0; var22 < var18; var22++) {
            if ((this.f & 2048) != 0) {
               this.d[var22] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
            } else {
               this.d[var22] = var2[var1++];
            }

            this.a[var22] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
            if ((this.f & 32768) != 0 && (this.f & 32768) != 0) {
               this.g[var22] = var21;
               var21 = (short)(var21 + var2[var1++]);
            }
         }

         if ((this.f & 32768) != 0) {
            this.g[this.g.length - 1] = var21;
         }

         if ((this.f & 4096) == 0) {
            int var23 = var18 << 2;
            if ((this.f & 1024) == 0) {
               this.e = new byte[var23];

               for (int var19 = 0; var19 < var23; var19++) {
                  this.e[var19] = var2[var1++];
               }
            } else {
               this.e = new short[var23];

               for (int var20 = 0; var20 < var23; var20++) {
                  this.e[var20] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
               }
            }
         }
      }

      return var1;
   }

   private int d(int var1, byte[] var2) {
      short var3;
      if ((var3 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8))) > 0) {
         this.l = new byte[var3];
         this.m = new byte[var3];
         this.n = new byte[var3];
         this.o = new byte[var3];
         this.p = new byte[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.l[var4] = var2[var1++];
            this.m[var4] = var2[var1++];
            this.n[var4] = var2[var1++];
            this.o[var4] = var2[var1++];
            this.p[var4] = var2[var1++];
         }
      }

      return var1;
   }

   private int e(int var1, byte[] var2) {
      short var3;
      if ((var3 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8))) > 0) {
         this.k = new byte[var3];
         this.k = new short[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.k[var4] = var2[var1++];
            this.k[var4] = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
         }
      }

      return var1;
   }

   final void b() {
      this.a = null;
      this.c = null;
      this.l = null;
      if (b) {
         System.gc();
      }
   }

   final int a(int var1, int var2) {
      return this.m[this.k[var1] + var2] & 0xFF;
   }

   final int a(int var1) {
      return this.k[var1] & 0xFF;
   }

   private int j(int var1) {
      return (this.f & 2048) != 0 ? this.d[var1] : this.d[var1] & 0xFF;
   }

   final int b(int var1) {
      return (this.f & 1024) != 0 ? this.i[var1] : this.i[var1];
   }

   final int c(int var1) {
      return (this.f & 1024) != 0 ? this.j[var1] : this.j[var1];
   }

   final int d(int var1) {
      return (this.f & 1024) == 0 && (this.h & 4) == 0 ? this.e[(var1 << 2) + 2] & 0xFF : this.e[(var1 << 2) + 2] & 65535;
   }

   final int e(int var1) {
      return (this.f & 1024) == 0 && (this.h & 4) == 0 ? this.e[(var1 << 2) + 3] & 0xFF : this.e[(var1 << 2) + 3] & 65535;
   }

   final int f(int var1) {
      return (this.f & 1024) == 0 && (this.h & 4) == 0 ? this.e[var1 << 2] : this.e[var1 << 2];
   }

   final int g(int var1) {
      return (this.f & 1024) == 0 && (this.h & 4) == 0 ? this.e[(var1 << 2) + 1] : this.e[(var1 << 2) + 1];
   }

   private int k(int var1) {
      if ((this.f & 1048576) != 0) {
         var1 = this.h[var1];
      } else {
         var1 = this.g[var1] & 255;
      }

      return var1;
   }

   final int b(int var1, int var2) {
      var1 = this.d(var1, var2);
      return this.k(var1);
   }

   private int l(int var1) {
      return this.h[var1] & 0xFF;
   }

   final int c(int var1, int var2) {
      var1 = this.d(var1, var2);
      return this.l(var1);
   }

   private int d(int var1, int var2) {
      return this.a[var1] + var2;
   }

   private int m(int var1) {
      return this.b(this.a[var1]);
   }

   private int n(int var1) {
      return this.c(this.a[0] + var1);
   }

   private void a(int[] var1, int var2) {
      this.a(var1, var2, 0, 0, 0, false, true);
   }

   private void a(int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      if (!var7) {
         var6 = this.f(var2);
         var7 = this.g(var2);
         int var8 = this.d(var2);
         var2 = this.e(var2);
         if ((var5 & 1) != 0) {
            var6 = -var6 - var8;
         }

         if ((var5 & 2) != 0) {
            var7 = -var7 - var2;
         }

         if ((var5 & 4) != 0) {
            var5 = var6;
            var6 = -var7 - var2;
            var7 = var5;
            var5 = var8;
            var8 = var2;
            var2 = var5;
         }

         i = var3 + var6;
         j = var4 + var7;
         k = i + var8;
         l = j + var2;
      } else {
         i = Integer.MAX_VALUE;
         j = Integer.MAX_VALUE;
         k = Integer.MIN_VALUE;
         l = Integer.MIN_VALUE;
         this.a(null, var2, var3, var4, var5);
      }

      var1[0] = i;
      var1[1] = j;
      var1[2] = k;
      var1[3] = l;
   }

   final void a(int[] var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 0, false, false);
   }

   final void a(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      d var10 = this;
      int var7 = this.p[var10.k[var2] + var3] & 15;
      if ((var6 & 1) != 0) {
         var7 = h[var7 & 7] | var7 & -8;
      }

      if ((var6 & 2) != 0) {
         var7 = i[var7 & 7] | var7 & -8;
      }

      if ((var6 & 4) != 0) {
         var7 = j[var7 & 7] | var7 & -8;
      }

      d var8 = this;
      int var9 = this.k[var2] + var3;
      int var14 = var8.l[var9] & 255;
      var10 = this;
      int var11 = this.k[var2] + var3;
      int var17 = var11;
      var9 = var10.n[var17];
      var10 = this;
      var11 = this.k[var2] + var3;
      int var19 = var11;
      var2 = var10.o[var19];
      if ((var6 & 1) != 0) {
         var9 = -var9;
      }

      if ((var6 & 2) != 0) {
         var2 = -var2;
      }

      if ((var6 & 4) != 0) {
         var3 = var9;
         var9 = -var2;
         var2 = var3;
      }

      this.a(var1, var14, var4 + var9, var5 + var2, var7, false, false);
   }

   final int a() {
      return this.k == null ? 0 : this.k.length;
   }

   final int b() {
      if ((this.f & 2048) != 0) {
         return this.d == null ? 0 : this.d.length;
      } else {
         return this.d == null ? 0 : this.d.length;
      }
   }

   private int o(int var1) {
      return this.l != null ? this.l[var1] & 65535 : -1;
   }

   final int h(int var1) {
      return this.g != null ? this.g[var1 + 1] - this.g[var1] : 0;
   }

   final void a(int var1, int var2, int[] var3, int var4) {
      if (this.g != null && var3 != null) {
         int var6 = this.g[var1];
         if ((var1 = this.g[var1 + 1] - var6) > 0 && var2 < var1) {
            var6 = var6 + var2 << 2;
            if ((this.f & 1024) != 0) {
               if (this.f != null) {
                  var3[0] = this.f[var6];
                  var3[1] = this.f[var6 + 1];
                  var3[2] = this.f[var6 + 2] & '\uffff';
                  var3[3] = this.f[var6 + 3] & '\uffff';
                  return;
               }
            } else if (this.f != null) {
               var3[0] = this.f[var6];
               var3[1] = this.f[var6 + 1];
               var3[2] = this.f[var6 + 2] & 255;
               var3[3] = this.f[var6 + 3] & 255;
            }

            return;
         }

         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
         var3[3] = 0;
      }
   }

   static int[] a(int[] var0) {
      if (var0 != null && var0 == a) {
         if (var0 != null && var0 == c) {
            return null;
         }

         if (c == null) {
            c = new int[5000];
         }

         return c;
      } else {
         if (a == null) {
            a = new int[5000];
         }

         return a;
      }
   }

   final boolean a(int var1) {
      if (var1 < 0) {
         return false;
      } else if (this.a == null) {
         return false;
      } else {
         return var1 >= this.a.length ? false : this.a[var1] != null;
      }
   }

   final void a(int var1, int var2) {
      if ((this.f & 1024) != 0) {
         this.i[var1] = (short)var2;
      } else {
         this.i[var1] = (byte)var2;
      }
   }

   final void b(int var1, int var2) {
      if ((this.f & 1024) != 0) {
         this.j[var1] = (short)var2;
      } else {
         this.j[var1] = (byte)var2;
      }
   }

   private int a(int var1, byte[] var2, int var3) {
      if ((this.f & 16777216) != 0) {
         if (var1 >= var2.length) {
            return var1;
         }

         short var31 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
         int var4 = 1;
         if ((this.f & 1073741824) != 0) {
            var4 = (byte)var2[var1++];
         }

         if (this.d == null) {
            this.d = new int[var4];
         }

         for (int var6 = 0; var6 < var4; var6++) {
            int var5 = var2[var1++] & 255;
            this.a = var5;
            var5 = var2[var1++] & 255;
            this.d[var6] = var5;
            int var8 = var4;
            d var7 = this;
            if (this.a == null) {
               var7.a = new int[var8][16][];
            }

            int var9 = var6;
            var5 = var5;
            byte[] var19 = var2;
            var8 = var1;
            var7 = this;

            for (int var11 = 0; var11 < var7.a; var11++) {
               var7.a[var9][var11] = new int[var5];
               int[] var10 = var7.a[var9][var11];
               if (var31 == 21781) {
                  for (int var46 = 0; var46 < var5; var46++) {
                     int var47 = (short)((var19[var8++] & 255) + ((var19[var8++] & 255) << 8));
                     int var49 = -16777216;
                     if ((var47 & 32768) != 32768) {
                        var49 = 0;
                        var7.a = true;
                     }

                     if ((var47 = var49 | (var47 & 31744) << 9 | (var47 & 992) << 6 | (var47 & 31) << 3) == 16253176) {
                        var47 = 16711935;
                     }

                     var10[var46] = var47;
                  }
               } else if (var31 == 12803) {
                  for (int var12 = 0; var12 < var5; var12++) {
                     int var13 = var19[var8++] & 255;
                     int var14 = -16777216;
                     if (var13 == 192) {
                        var14 = 0;
                        var7.a = true;
                     }

                     var10[var12] = var14 | (var13 & 224) << 16 | (var13 & 28) << 11 | (var13 & 3) << 6;
                  }
               } else {
                  new StringBuffer().append("Sprite Pixel Format Error: Unsupported format! Format ID: 0x").append(Integer.toHexString(var31));
               }
            }

            var1 = var8;
         }

         this.a = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8));
         if (this.a == 25840 || this.a == -22976) {
            if (this.e == null) {
               this.e = new int[var4];
               this.f = new int[var4];
            }

            for (int var40 = 0; var40 < var4; var40++) {
               int var36 = var40;
               var36 = this.d[var36] - 1;
               this.e[var40] = 1;

               for (this.f[var40] = 0; var36 != 0; this.f[var40]++) {
                  var36 >>= 1;
                  this.e[var40] = this.e[var40] << 1;
               }

               this.e[var40]--;
            }
         }

         if (this.e > 0) {
            this.l = new short[this.e];
            int var41 = 0;
            int var38 = var1;

            for (int var32 = 0; var32 < this.e; var32++) {
               if ((this.f & 128) != 0) {
                  var4 = (var2[var1++] & 255) + ((var2[var1++] & 255) << 8) + ((var2[var1++] & 255) << 16) + ((var2[var1++] & 255) << 24);
               } else if ((var4 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8))) < 0) {
                  new StringBuffer()
                     .append("LoadingModules: module ")
                     .append(var32)
                     .append(" size read as short is negative. You need to add BS_IMAGE_SIZE_INT to this sprites export flags");
               }

               this.l[var32] = (short)var41;
               var41 += var4;
               var1 += var4;
            }

            var1 = var38;
            this.c = new byte[var41];

            for (int var42 = 0; var42 < this.e; var42++) {
               if ((this.f & 128) != 0) {
                  var38 = (var2[var1++] & 255) + ((var2[var1++] & 255) << 8) + ((var2[var1++] & 255) << 16) + ((var2[var1++] & 255) << 24);
               } else if ((var38 = (short)((var2[var1++] & 255) + ((var2[var1++] & 255) << 8))) < 0) {
                  new StringBuffer()
                     .append("LoadingModules: module ")
                     .append(var42)
                     .append(" size read as short is negative. You need to add BS_IMAGE_SIZE_INT to this sprites export flags");
               }

               System.arraycopy(var2, var1, this.c, this.o(var42), var38);
               var1 += var38;
            }
         }
      }

      return var1;
   }

   static void a(int var0) {
      a = new short[var0][];
      a = new d[var0][];
      l = new int[var0];
      m = new int[var0];
   }

   static void c(int var0, int var1) {
      m[var0] = var1;
      a[var0] = new short[var1];
      a[var0] = new d[var1];

      for (int var2 = 0; var2 < a[var0].length; var2++) {
         a[var0][var2] = -1;
      }
   }

   final void b(int var1) {
      this.m = var1;
      if (this.a == null) {
         this.a = new j[this.a][];

         for (int var2 = 0; var2 < this.a; var2++) {
            this.a[var2] = new j[this.e];
         }
      }
   }

   final void c() {
      if (this.m >= 0) {
         for (int var1 = 0; var1 < m[this.m]; var1++) {
            if (a[this.m][var1] == this) {
               short var2;
               int var3 = (var2 = a[this.m][var1]) >> 10;
               var2 &= 1023;
               a[this.m][var1] = null;
               this.a[var3][var2] = null;
            }
         }
      }
   }

   private final void a(int var1, Object var2) {
      Object var3 = var2;
      var2 = var1;
      d var8 = this;
      if (this.m >= 0 && var8.a[var8.g][var2] == null) {
         int var4 = l[var8.m];
         short var5;
         int var6 = (var5 = a[var8.m][var4]) >> 10;
         int var7 = var5 & 1023;
         d var10;
         if (var5 >= 0 && (var10 = a[var8.m][var4]) != null) {
            var10.a[var6][var7] = null;
         }

         var5 = (short)((var2 & 1023) + (var8.g << 10));
         a[var8.m][var4] = var5;
         a[var8.m][var4] = var8;
         l[var8.m] = (l[var8.m] + 1) % m[var8.m];
         var8.a[var8.g][var2] = (j)var3;
      }
   }

   final Object a(int var1) {
      return this.a(var1);
   }

   private int[] a(int var1) {
      d var2 = this;
      if (this.l == null ? false : var2.c != null) {
         var2 = this;
         byte var12 = this.r == null ? 0 : var2.r[var1];
         byte[] var10002 = this.c;
         int var10003 = this.o(var1);
         int var10004 = this.a[var1] & 255;
         int var6 = this.b[var1] & 255;
         int var5 = var10004;
         int var4 = var10003;
         byte[] var10 = var10002;
         byte var3 = var12;
         var2 = this;
         int var7 = 0;
         int var8 = var5 * var6;
         if (a == null) {
            a = new int[5000];
         }

         if (var8 > a.length) {
            new StringBuffer()
               .append("DecodeImage_Algorithm: Module WxH > temp_int.length (")
               .append(var5)
               .append(" x ")
               .append(var6)
               .append(" = ")
               .append(var8)
               .append(" > ")
               .append(a.length)
               .append(")! Either decrease module size or increase GLLibConfig.TMP_BUFFER_SIZE!");
         }

         int var9 = var2.g;
         int var16 = var3;
         d var14 = var2;
         int[] var15;
         boolean var23;
         if ((var15 = var9 >= 0 && var9 < var14.a && var14.a != null && var9 < var14.a[var16].length ? var14.a[var16][var9] : null) == null) {
            var23 = false;
         } else {
            if (var2.a != 25840) {
               if (var2.a == 5632) {
                  var8 = var8 + ((var8 & 1) == 0 ? 0 : 2) >> 1;

                  while (--var8 >= 0) {
                     byte var22 = var10[var4++];
                     a[var7++] = var15[var22 >> 4 & 15];
                     a[var7++] = var15[var22 & 15];
                  }
               } else {
                  new StringBuffer()
                     .append("ERROR : sprite encoding for ")
                     .append(Integer.toHexString(var2.a))
                     .append(" is not enabled. Check sprite_useEncodeFormat in GllibConfiguration");
               }
            } else {
               while (var7 < var8) {
                  var9 = var10[var4++] & 255;
                  var16 = var15[var9 & var2.e[var3]];
                  var9 >>= var2.f[var3];

                  while (var9-- >= 0) {
                     a[var7++] = var16;
                  }
               }
            }

            var23 = true;
         }

         if (var23) {
            return a;
         }
      }

      return null;
   }

   final void a(short[] var1) {
      this.b = var1[0];
      this.b = new short[this.b][];
      int var2 = 1;

      for (int var3 = 0; var3 < this.b; var3++) {
         this.b[var3] = new short[2];
         this.b[var3][0] = var1[var2++];
         this.b[var3][1] = var1[var2++];
      }

      int var12 = var2;

      while (var12 < var1.length) {
         short var9 = var1[var12++];
         short var4;
         short[] var5;
         (var5 = new short[((var4 = var1[var12++]) << 1) + 2])[0] = this.b[var9][0];
         var5[1] = this.b[var9][1];

         for (int var6 = 0; var6 < var4; var6++) {
            var5[(var6 << 1) + 2] = var1[var12++];
            var5[(var6 << 1) + 3] = var1[var12++];
         }

         this.b[var9] = var5;
      }

      d var7 = this;
      this.t = -this.n(0);
      var2 = var7.n(1);
      var7.p = var7.t + var2;
      d var11 = var7;
      var7.q = var7.n(2) - var11.n(1);
      var7.s = var7.m(var7.p(32));
   }

   private int p(int var1) {
      if (this.b == null) {
         return 0;
      }

      int var2 = var1 % this.b;
      if (this.b[var2][0] == var1) {
         return this.b[var2][1];
      }

      byte var3 = 2;
      int var4 = this.b[var2].length;

      while (var3 < var4 && this.b[var2][var3] != var1) {
         var3 += 2;
      }

      return var3 >= var4 ? 1 : this.b[var2][var3 + 1];
   }

   final int c() {
      return this.u >= 0 ? this.q * this.u >> 8 : this.q;
   }

   final int d() {
      return this.u >= 0 ? this.p * this.u >> 8 : this.p;
   }

   private int g() {
      return this.u >= 0 ? this.s * this.u >> 8 : this.s;
   }

   private int h() {
      return this.u >= 0 ? this.r * this.u >> 8 : this.r;
   }

   final void c(int var1) {
      this.r = var1;
   }

   final int e() {
      return this.u >= 0 ? this.p * this.u >> 8 : this.p;
   }

   private static final int a(short[] var0, int var1) {
      var1 = var1 * 3 + 1;
      return var0[var1];
   }

   private static final int b(short[] var0, int var1) {
      var1 = var1 * 3 + 2;
      return var0[var1];
   }

   final short[] a(String var1, int var2, boolean var3) {
      if (m == null) {
         m = new short[1500];
      }

      var3 = var1.length();
      short var4 = 0;
      short var5 = 1;
      short var7 = 0;
      boolean var8 = this.d;
      boolean var9 = this.c;
      int var10 = this.g;
      boolean var11 = false;
      short var12 = 0;
      boolean var13 = this.d;
      boolean var14 = this.c;
      int var15 = this.g;
      int var16 = this.g & 4095 | (var13 ? 4096 : 0) | (var14 ? 8192 : 0);

      for (int var17 = 0; var17 < var3; var17++) {
         int var18 = var1.charAt(var17);
         int var6 = this.q(this.p(var18));
         if (var18 != 32 && var18 != a) {
            if (var18 == 92) {
               char var31;
               if ((var31 = var1.charAt(++var17)) == '^') {
                  var13 = !var13;
               } else if (var31 == '_') {
                  var14 = !var14;
               } else {
                  var18 = var31 & 255;
                  var18 -= 48;
                  if (var18 < this.a) {
                     var15 = var18;
                  }
               }
            } else if (var18 == 10) {
               m[var5++] = (short)var17;
               m[var5++] = var4;
               var7 = (short)var17;
               var4 = 0;
               var12 = 0;
               m[var5++] = (short)var16;
               var16 = var15 & 4095 | (var13 ? 4096 : 0) | (var14 ? 8192 : 0);
            } else {
               if (var18 < 32) {
                  if (var18 == 1) {
                     var17++;
                     continue;
                  }

                  if (var18 != 2) {
                     continue;
                  }

                  var17++;
               }

               var6 += this.h();
               if (var13) {
                  var6++;
               }

               var12 += (short)var6;
               if ((var4 += (short)var6) > var2) {
                  boolean var32;
                  if (var32 = !var11) {
                     var4 -= (short)var6;
                     var7 = (short)(var17 - 1);
                  }

                  var11 = false;

                  for (int var30 = var7; var30 >= 0 && (var1.charAt(var30) == ' ' || var1.charAt(var30) == '\n' || var1.charAt(var30) == a); var30--) {
                     if (var1.charAt(var30) == ' ') {
                        var4 -= (short)this.g();
                     }
                  }

                  if (var32) {
                     var8 = var13;
                     var9 = var14;
                     var10 = var15;
                     var12 = 0;
                  }

                  if (var1.charAt(var7) != '\n') {
                     m[var5++] = (short)(var7 + 1);
                     m[var5++] = (short)(var4 - var12);
                  }

                  m[var5++] = (short)var16;
                  var14 = var9;
                  var15 = var10;
                  var16 = var10 & 4095 | (var8 ? 4096 : 0) | (var9 ? 8192 : 0);
                  var4 = 0;
                  var17 = var7;
                  var13 = var8;
               }
            }
         } else {
            if (var18 == 32) {
               var4 += (short)this.g();
            }

            var7 = (short)var17;
            var8 = var13;
            var11 = true;
            var12 = 0;
            var9 = var14;
            var10 = var15;
            if (var4 > var2) {
               var11 = false;

               for (int var28 = var7; var28 >= 0 && (var1.charAt(var28) == ' ' || var1.charAt(var28) == a); var28--) {
                  if (var1.charAt(var28) == ' ') {
                     var4 -= (short)this.g();
                  }
               }

               while (var7 < var3 && (var1.charAt(var7) == ' ' || var1.charAt(var7) == a)) {
                  var7++;
               }

               var17 = --var7;
               var13 = var8;
               m[var5++] = (short)(var7 + 1);
               m[var5++] = (short)var4;
               m[var5++] = (short)var16;
               var14 = var9;
               var15 = var10;
               var16 = var10 & 4095 | (var8 ? 4096 : 0) | (var9 ? 8192 : 0);
               var4 = 0;
            }
         }
      }

      m[var5++] = (short)var3;
      m[var5++] = var4;
      m[var5++] = (short)var16;
      m[0] = (short)(var5 / 3);
      return m;
   }

   final void a(Graphics var1, String var2, short[] var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      short var20 = var3[0];
      var9 = this.e();
      if (var7 == -1) {
         var7 = var20;
      }

      if (var7 > var20) {
         var7 = var20;
      }

      var9 = this.c() + var9;
      if ((var8 & 32) != 0) {
         var5 -= var9 * (var7 - 1);
      } else if ((var8 & 2) != 0) {
         var5 -= var9 * (var7 - 1) >> 1;
      }

      n = this.g;
      boolean var11 = this.d;
      boolean var12 = this.c;
      int var13;
      int var14 = (var13 = f.b(var1)) + f.d(var1);
      var13 -= var9;
      var14 += var9;
      int var15 = 0;

      for (int var23 = 0; var23 < var20 && var15 <= var7 - 1; var15++) {
         v = var23 > 0 ? a(var3, var23 - 1) : 0;
         w = a(var3, var23);
         if (v < var2.length() && var2.charAt(v) == '\n') {
            v++;
         }

         int var16 = var4;
         int var17;
         if ((var17 = var5 + var15 * var9) >= var13) {
            if (var17 > var14) {
               break;
            }

            if ((var8 & 43) != 0) {
               if (this.u >= 0) {
                  if ((var8 & 8) != 0) {
                     var16 = var4 - (b(var3, var23) * this.u >> 8);
                  } else if ((var8 & 1) != 0) {
                     var16 = var4 - (b(var3, var23) * this.u >> 9);
                  }
               } else if ((var8 & 8) != 0) {
                  var16 = var4 - b(var3, var23);
               } else if ((var8 & 1) != 0) {
                  var16 = var4 - (b(var3, var23) >> 1);
               }

               if ((var8 & 32) != 0) {
                  var17 -= this.e();
               } else if ((var8 & 2) != 0) {
                  var17 -= this.e() >> 1;
               }
            }

            int var19 = var23;
            short[] var18 = var3;
            var19 = var19 * 3 + 3;
            short var26 = var18[var19];
            this.d = (var26 & 4096) != 0;
            this.c = (var26 & 8192) != 0;
            this.d(var26 & 4095);
            this.a(var1, var2, var16, var17, 0, false);
         }

         var23++;
      }

      v = -1;
      w = -1;
      x = -1;
      this.g = n;
      this.d = var11;
      this.c = var12;
   }

   final void a(String var1, char[] var2) {
      if (var1 != null) {
         d = 0;
         o = this.e();
         int var8 = 0;
         boolean var3 = var1 != null;
         int var4 = v >= 0 ? v : 0;
         int var5;
         if (var3) {
            var5 = w >= 0 ? w : var1.length();
         } else {
            var5 = w >= 0 ? w : ((Object[])null).length;
         }

         boolean var6 = this.d;

         while (var4 < var5) {
            char var7;
            if ((var7 = var3 ? var1.charAt(var4) : ((Object[])null)[var4]) == 92) {
               var4++;
               if ((var3 ? var1.charAt(var4) : ((Object[])null)[var4]) == '^') {
                  var6 = !var6;
               }
            } else {
               label123: {
                  int var10000;
                  if (var7 > 32) {
                     var10000 = this.p(var7);
                  } else {
                     if (var7 == 32 || var7 == a) {
                        if (var7 == 32) {
                           var8 += this.g();
                        }
                        break label123;
                     }

                     if (var7 == 32) {
                        var8 += this.g();
                        break label123;
                     }

                     if (var7 == 10) {
                        if (var8 > d) {
                           d = var8;
                        }

                        var8 = 0;
                        o = o + this.c() + this.e();
                        break label123;
                     }

                     if (var7 == 1) {
                        var4++;
                        break label123;
                     }

                     if (var7 != 2) {
                        break label123;
                     }

                     var4++;
                     var10000 = var3 ? var1.charAt(var4) : ((Object[])null)[var4];
                  }

                  var7 = var10000;
                  var8 += this.q(var7) + this.h();
                  if (var6) {
                     var8++;
                  }
               }
            }

            var4++;
         }

         if (var8 > d) {
            d = var8;
         }

         if (d > 0) {
            d = d - this.h();
         }
      }
   }

   final void a(Graphics var1, String var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, true);
   }

   private void a(Graphics var1, String var2, int var3, int var4, int var5, boolean var6) {
      boolean var7 = (boolean)var6;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      String var16 = var2;
      Graphics var15 = var1;
      d var14 = this;
      if (var16 != null) {
         if (var14.u >= 0) {
            var5 += var14.t * var14.u >> 8;
         } else {
            var5 += var14.t;
         }

         boolean var8 = var16 != null;
         var14.a(var16, null);
         if ((var6 & 43) != 0) {
            if ((var6 & 8) != 0) {
               var4 -= d;
            } else if ((var6 & 1) != 0) {
               var4 -= d >> 1;
            }

            if ((var6 & 32) != 0) {
               var5 -= o;
            } else if ((var6 & 2) != 0) {
               var5 -= o >> 1;
            }
         }

         var6 = var4;
         if (var7) {
            n = var14.g;
         }

         int var9 = v >= 0 ? v : 0;
         int var11;
         if (var8) {
            var11 = w >= 0 ? w : var16.length();
         } else {
            var11 = w >= 0 ? w : ((Object[])null).length;
         }

         if (x >= 0 && var11 > x) {
            var11 = x;
         }

         for (int var12 = var9; var12 < var11; var12++) {
            char var13;
            if ((var13 = var8 ? var16.charAt(var12) : ((Object[])null)[var12]) == 92) {
               var12++;
               char var22;
               if ((var22 = var8 ? var16.charAt(var12) : ((Object[])null)[var12]) == '_') {
                  var14.c = !var14.c;
               } else if (var22 == '^') {
                  var14.d = !var14.d;
               } else {
                  var13 = var22 & 255;
                  var14.d(var13 - 48);
               }
            } else if (var13 != a) {
               int var10000;
               if (var13 > 32) {
                  var10000 = var14.p(var13);
               } else {
                  if (var13 == 32) {
                     if (var14.c) {
                        int var26 = var14.p(95);
                        var9 = var6 + (var14.g() - var14.q(var26) >> 1);
                        var14.a(var15, var26, var9, var5, 0);
                     }

                     var6 += var14.g();
                     continue;
                  }

                  if (var13 == 10) {
                     var6 = var4;
                     var5 += var14.c() + var14.e();
                     continue;
                  }

                  if (var13 == 1) {
                     var12++;
                     char var24;
                     if ((var24 = var8 ? var16.charAt(var12) : ((Object[])null)[var12]) < var14.a) {
                        var14.d(var24);
                     }

                     if (var24 == 255) {
                        var14.g = n;
                     }
                     continue;
                  }

                  if (var13 != 2) {
                     continue;
                  }

                  var12++;
                  var10000 = var8 ? var16.charAt(var12) : ((Object[])null)[var12];
               }

               var13 = var10000;
               var14.a(var15, var13, var6, var5, 0);
               if (var14.c) {
                  int var10 = var14.p(95);
                  var9 = var6 + (var14.q(var13) - var14.q(var10) >> 1);
                  var14.a(var15, var10, var9, var5, 0);
               }

               if (var14.d) {
                  var14.a(var15, var13, ++var6, var5, 0);
               }

               var6 += var14.q(var13) + var14.h();
            }
         }

         if (var7) {
            var14.g = n;
         }
      }
   }

   private final int q(int var1) {
      return this.u >= 0 ? this.m(var1) * this.u >> 8 : this.m(var1);
   }

   final void d(int var1) {
      int var2 = var1;
      d var3 = this;
      if (var2 < var3.a && var2 >= 0) {
         var3.g = var2;
         var1 = var2;
         if (var2 < 0) {
            new StringBuffer().append("DeallocatePalette: invalid palette(").append(var1).append(") passed");
         }

         if (var1 >= 16) {
            new StringBuffer()
               .append("DeallocatePalette: palId(")
               .append(var1)
               .append(") is bigger then MAX_SPRITE_PALETTES. Increase this value in GLLibConfig!");
         }
      }
   }

   final int f() {
      return this.g;
   }

   final int i(int var1) {
      return (this.f & 1048576) != 0 ? this.d[var1] : this.d[var1];
   }

   final void a(int var1, int var2, int var3, int var4) {
      d var9 = this;
      if (this.a == null) {
         var9.a = new j[var9.a][];
      }

      if (var9.a[var1] == null) {
         var9.a[var1] = new j[var9.e];
      }

      if (this.e != 0) {
         if (var3 == -1) {
            var3 = this.e - 1;
         }

         if ((this.f & 16777224) != 0) {
            var4 = this.g;
            this.g = var1;
            if (b) {
               System.gc();
            }

            while (var2 <= var3) {
               int var6 = var2;
               d var5 = this;
               if ((this.q != null ? var5.q[var6] : 0) == 0) {
                  var6 = var2;
                  int var11 = this.a[var6] & 255;
                  int var7 = var2;
                  var6 = this.b[var7] & 255;
                  int[] var16;
                  if (var11 > 0 && var6 > 0 && (var16 = this.a(var2)) != null) {
                     if (f.n && (f.aa & 1046496) != 0) {
                        boolean var8 = this.a;
                        var16 = f.a(null, var16, 0, 0, var11, var6, 0, var8, false, false);
                        var11 = f.ad;
                        var6 = f.ae;
                     }

                     int var12 = var2;
                     int var18 = var6;
                     var7 = var11;
                     int[] var15 = var16;
                     this.a[var1][var12] = j.a(var15, var7, var18);
                  }
               }

               var2++;
            }

            if (b) {
               System.gc();
            }

            this.g = var4;
         }

         if (b) {
            System.gc();
         }
      }
   }

   final void a(int var1, int var2, int var3) {
      boolean var4 = b;
      if (b) {
         System.gc();
         b = false;
      }

      int var5 = this.j(var2);

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = this.b(var2, var6);
         if ((this.c(var2, var6) & 16) != 0) {
            this.a(var1, var7, var3);
         } else {
            int var9 = var7;
            d var8 = this;
            if ((
                  this.a != null && var1 >= 0 && var1 < var8.a.length && var8.a[var1] != null && var9 >= 0 && var9 < var8.a[var1].length
                     ? var8.a[var1][var9]
                     : null
               )
               == null) {
               this.a(var1, var7, var7, -1);
            }
         }
      }

      b = var4;
      if (var4) {
         System.gc();
      }
   }

   final void e(int var1) {
      if (this.a != null && var1 < this.a.length) {
         this.a[var1] = null;
      }
   }

   final void b(int var1, int var2, int var3) {
      int var4 = var3;
      var3 = var2;
      var2 = var1;
      d var11 = this;
      if (var3 < 0) {
         new StringBuffer().append("BuildCacheFrames: First frame index is ").append(var3).append(", it can't be negative!");
      }

      if (var2 < 0) {
         new StringBuffer().append("BuildCacheFrames: Palette index is ").append(var2).append(", it can't be negative!");
      }

      if (var2 >= var11.a) {
         new StringBuffer()
            .append("BuildCacheFrames: Palette index is ")
            .append(var2)
            .append(", its out of bounds! Current number of palettes is ")
            .append(var11.a)
            .append(".");
      }

      int var5 = var11.b();
      if (var4 == -1 || var4 >= var5) {
         var4 = var5 - 1;
      }

      if (var11.a == null) {
         var11.a = new j[var11.a][][];
      }

      if (var11.a[var2] == null) {
         var11.a[var2] = new j[1][];
      }

      if (0 >= var11.a[var2].length) {
         new StringBuffer().append("BuildCacheFrames: module map ").append(-1).append(" was not loaded the first time that was cached a frame for this sprite");
      }

      if (var11.a[var2][0] == null) {
         var11.a[var2][0] = new j[var5];
      }

      while (var3 <= var4) {
         j[] var10000 = var11.a[var2][0];
         int var6 = var3;
         d var14 = var11;
         int var7 = var11.d(var6);
         int var8 = var14.e(var6);
         if ((f.aa & 8192) != 0) {
            int var9 = f.i();
            int var10 = f.j();
            var7 = var7 * var9 / 100;
            var8 = var8 * var10 / 100;
         }

         int[] var15;
         var10000[var3] = var7 != 0 && var8 != 0 ? ((var15 = var14.a(var6, var2, null, 2, 0)) == null ? null : j.a(var15, var7, var8)) : null;
         var3++;
      }
   }

   private int[] a(int var1, int var2, int[] var3, int var4, int var5) {
      var4 = this.d(var1);
      var5 = this.e(var1);
      int var6 = this.f(var1);
      int var7 = this.g(var1);
      var6 = -var6;
      var7 = -var7;
      if ((f.aa & 8192) != 0) {
         int var8 = f.i();
         int var9 = f.j();
         var4 = var4 * var8 / 100;
         var5 = var5 * var9 / 100;
         var6 = var6 * var8 / 100;
         var7 = var7 * var9 / 100;
      }

      int var19 = var4 * var5;
      if (var4 != 0 && var5 != 0) {
         var3 = new int[var19];
         int var20 = this.g;
         this.g = var2;
         Graphics var10;
         j var13;
         (var10 = (var13 = j.a(var4, var5)).a.getGraphics()).setColor(-65281);
         var10.fillRect(0, 0, var4, var5);
         this.a(var10, var1, var6, var7, 0);
         f.a(var13, var3, var4, var4, var5);
         var1 = 16711935;
         var1 = f.a.getDisplayColor(var1);

         while (var19 > 0) {
            if ((var3[--var19] & 16777215) == var1) {
               var3[var19] = 16711935;
            }
         }

         this.g = var20;
         return var3;
      } else {
         return null;
      }
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      var2 = this.k[var2] + var3;
      var3 = this.l[var2] & 255;
      int var7 = this.n[var2];
      int var8 = this.o[var2];
      int var9 = this.p[var2] & 15;
      if ((var6 & 1) != 0) {
         var9 = h[var9 & 7] | var9 & -8;
         var7 = -var7;
      }

      if ((var6 & 2) != 0) {
         var9 = i[var9 & 7] | var9 & -8;
         var8 = -var8;
      }

      if ((var6 & 4) != 0) {
         var9 = j[var9 & 7] | var9 & -8;
         var2 = var7;
         var7 = -var8;
         var8 = var2;
      }

      if ((f.aa & 8192) != 0 && f.a[13][5] == 0) {
         var2 = f.i();
         var6 = f.j();
         var7 = var2 * var7 / 100;
         var8 = var6 * var8 / 100;
      }

      this.a(var1, var3, var4 + var7, var5 + var8, var9);
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.b(var1, var2, var3, var4, var5);
   }

   final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      int var6;
      if ((var6 = this.j(var2)) > 0) {
         for (int var7 = 0; var7 < var6; var7++) {
            int var11 = var7;
            Graphics var9 = var1;
            d var8 = this;
            int var10 = this.d(var2, var11);
            var11 = var8.l(var10);
            int var13;
            int var14 = var13 = var8.k(var10);
            int var16 = 0;
            int var12 = 0;
            if ((var11 & 16) == 0) {
               var12 = var13;
               var16 = var8.a[var14] & 255;
               var12 = var8.b[var12] & 255;
            }

            int var17 = var16;
            int var18 = var12;
            var14 = 0 + var8.b(var10);
            int var15 = 0 + var8.c(var10);
            if ((var11 & 4) != 0) {
               var10 = var16;
               var16 = var12;
               var12 = var10;
            }

            if ((var5 & 1) != 0) {
               var11 = h[var11 & 7] | var11 & -8;
               var14 = -var14 - var16;
            }

            if ((var5 & 2) != 0) {
               var11 = i[var11 & 7] | var11 & -8;
               var15 = -var15 - var12;
            }

            if ((var5 & 4) != 0) {
               var11 = j[var11 & 7] | var11 & -8;
               var10 = var14;
               var14 = -var15 - var12;
               var15 = var10;
            }

            if ((f.aa & 8192) != 0 && f.a[13][5] == 0) {
               var10 = f.i();
               var12 = f.j();
               if (f.a[13][6] % f.X != 0) {
                  var16 = -var14;
                  f.a[16][1] = var16;
                  var16 = -var15;
                  f.a[16][2] = var16;
               }

               var14 = var10 * var14 / 100;
               var15 = var12 * var15 / 100;
            }

            var10 = var3 + var14;
            var12 = var4 + var15;
            if ((var11 & 16) != 0) {
               var8.a(var9, var13, var10, var12, var11 & 15);
            } else {
               var8.a(var9, var13, var10, var12, var11 & 15, var17, var18);
            }
         }
      }
   }

   final void c(Graphics var1, int var2, int var3, int var4, int var5) {
      f.n();
      f.p(var5);
      this.a(var1, var2, var3, var4, 0);
      f.o();
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      b[0] = var6;
      b[1] = var7;
      int[] var61 = b;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      var3 = var2;
      Graphics var29 = var1;
      d var23 = this;
      if ((f.aa & 8192) != 0 && f.a[13][5] != 0) {
         int var8 = f.i();
         int var9 = f.j();
         var4 = var4 * var8 / 100;
         var5 = var5 * var9 / 100;
      }

      int var72 = var61[0];
      int var79 = var61[1];
      var7 = var72;
      int var10 = var79;
      int var11 = var7;
      int var12 = var10;
      if ((var6 & 4) != 0) {
         int var13 = var7;
         var7 = var10;
         var10 = var13;
      }

      d var94 = var23;
      if ((var23.q != null ? var94.q[var3] : 0) != 0 && var29 != null) {
         if ((f.aa & 8192) != 0) {
            int var100 = f.i();
            int var107 = f.j();
            var7 = var7 * var100 / 100;
            var10 = var10 * var107 / 100;
         }

         var79 = var5;
         var72 = var4;
         int var71 = var10;
         var5 = var7;
         Graphics var32 = var29;
         d var26 = var23;
         var10 = var23.k[var3];
         var32.setColor(var10);
         switch (var26.q[var3]) {
            case 1:
               return;
            case 2:
               if ((var10 & 0xFF000000) != -16777216 && (var10 & 0xFF000000) != 0) {
                  return;
               }

               f.c(var32, var72, var79, var5, var71);
               return;
            case 3:
            case 4:
               short var125;
               label198: {
                  d var43 = var26;
                  if (var26.c != null) {
                     for (byte var90 = 0; var90 < var43.c.length; var90 += 2) {
                        if (var43.c[var90] == var3) {
                           var125 = var43.c[var90 + 1];
                           break label198;
                        }
                     }
                  }

                  var125 = -1;
               }

               short var37 = var125;
               if (var125 != -1) {
                  var4 = var26.b[var37];
                  int var27 = var26.b[var37 + 1];
                  if ((var6 & 1) != 0) {
                     var4 = 90 - var4;
                  }

                  if ((var6 & 2) != 0) {
                     var4 = -var4;
                     var27 = -var27;
                  }

                  if ((var6 & 4) != 0) {
                     var4 -= 90;
                  }

                  var2 = var27;
                  int var28 = var4;
                  f.a(var32, var72, var79, var5, var71, var28, var2);
               }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
         }
      } else {
         if ((f.aa & 8192) != 0 && f.a[13][6] % 360 != 0) {
            int var95 = (f.aa & 8192) != 0 ? f.a[13][6] : f.a[16][0];
            if ((var6 & 4) != 0) {
               var6 &= -5;
               var95 += 90 * f.Y / 360;
            }

            int var14 = var95;
            var14 = f.d(f.Z - var14);
            int var15 = f.d(var95);
            f.b(var14, var15, var7, var10, b);
            var15 = b[0];
            var14 = b[1];
            int var16 = f.a[16][1];
            int var17 = f.a[16][2];
            if ((f.aa & 8192) != 0) {
               var16 = var16 * f.i() / 100;
               var17 = var17 * f.j() / 100;
               var7 = var7 * f.i() / 100;
               var10 = var10 * f.j() / 100;
               var15 = var15 * f.i() / 100;
               var14 = var14 * f.i() / 100;
            }

            int var10001 = (var7 >> 1) - var16;
            int var10002 = (var10 >> 1) - var17;
            int[] var20 = b;
            int var19 = var10002;
            int var18 = var10001;
            int var96 = var95;
            int var21 = var95;
            var21 = f.d(f.Z - var21);
            int var97 = f.d(var96);
            f.a(var21, var97, var18, var19, var20);
            var4 += b[0] - var15 / 2 + var16;
            var5 += b[1] - var14 / 2 + var17;
         }

         if (var7 > 0 && var10 > 0) {
            if (var29 != null) {
               boolean var121;
               label242: {
                  label267: {
                     int var114 = var10;
                     int var112 = var7;
                     int var109 = var5;
                     int var103 = var4;
                     Graphics var98 = var29;
                     int var116 = f.a(var29);
                     int var117 = f.b(var98);
                     int var118 = f.c(var98);
                     int var99 = f.d(var98);
                     if ((f.aa & 8192) != 0) {
                        int var120 = f.i();
                        int var22 = f.j();
                        var112 = var112 * var120 / 100;
                        var114 = var114 * var22 / 100;
                     } else if ((f.aa & 1 << 15) != 0) {
                        break label267;
                     }

                     if (var103 + var112 < var116 || var109 + var114 < var117 || var103 >= var116 + var118 || var109 >= var117 + var99) {
                        var121 = false;
                        break label242;
                     }
                  }

                  var121 = true;
               }

               if (!var121) {
                  return;
               }
            }

            j var104 = null;
            if ((var23.f & 16777224) != 0) {
               if (var23.a != null && var23.a[var23.g] != null) {
                  var104 = var23.a[var23.g][var3];
               }

               boolean var110 = var23.a;
               if (var104 == null) {
                  int[] var105;
                  if ((var105 = var23.a(var3)) != null) {
                     boolean var115 = false;
                     if (f.n && (f.aa & 1046496) != 0) {
                        if ((var105 = f.a(var29, var105, var4, var5, var11, var12, var6, var110, false, true)) == null) {
                           return;
                        }

                        var110 = f.o;
                        var6 = 0;
                        var4 = f.ab;
                        var5 = f.ac;
                        var7 = f.ad;
                        var10 = f.ae;
                        var11 = var7;
                        var12 = var10;
                        f.a(var29, var105, 0, var11, var4, var5, var11, var12, var110, var110, 0, -1, false);
                        var115 = true;
                     }

                     if (var23.m >= 0) {
                        if (var23.a == null) {
                           var23.a = new j[var23.a][];

                           for (int var73 = 0; var73 < var23.a; var73++) {
                              var23.a[var73] = new j[var23.e];
                           }
                        }

                        if ((var6 & 4) != 0) {
                           var104 = j.a(var105, var10, var7);
                        } else {
                           var104 = j.a(var105, var7, var10);
                        }

                        var23.a(var3, var104);
                        if (!var115) {
                           if (var104 != null) {
                              if (g[var6 & 7] == 0) {
                                 f.a(var29, var104, var4, var5);
                                 return;
                              }

                              if ((var6 & 4) != 0) {
                                 f.a(var29, var104, var10, var7, g[var6 & 7], var4, var5);
                                 return;
                              }

                              f.a(var29, var104, var7, var10, g[var6 & 7], var4, var5);
                           }

                           return;
                        }
                     } else if (!var115) {
                        int var91 = var6;
                        boolean var85 = var110;
                        boolean var80 = var110;
                        var72 = var12;
                        var7 = var11;
                        var6 = var5;
                        var5 = var4;
                        int var81 = var91;
                        boolean var75 = var85;
                        boolean var64 = var80;
                        int var56 = var72;
                        int var47 = var7;
                        var2 = var6;
                        int var24 = var5;
                        var4 = var11;
                        f.a(var29, var105, 0, var4, var24, var2, var47, var56, var64, var75, var81, -1, true);
                        return;
                     }
                  }
               } else if (f.n && (f.aa & 1046496) != 0) {
                  boolean var82 = var110;
                  var72 = var6;
                  var7 = var12;
                  var6 = var11;
                  var5 = var5;
                  var4 = var4;
                  j var35 = var104;
                  var1 = var29;
                  int[] var87 = a((int[])null);
                  f.a(var35, var87, var6, var6, var7);
                  int[] var113;
                  if ((var113 = f.a(var1, var87, var4, var5, var6, var7, var72, var82, false, true)) != null) {
                     var110 = f.o;
                     var4 = f.ab;
                     var5 = f.ac;
                     var7 = f.ad;
                     var10 = f.ae;
                     var11 = var7;
                     var12 = var10;
                     var82 = var110;
                     var72 = var12;
                     var7 = var11;
                     var6 = var5;
                     var5 = var4;
                     var7 = var7;
                     var6 = var6;
                     var5 = var5;
                     boolean var70 = var82;
                     int var60 = var72;
                     int var52 = var7;
                     var4 = var6;
                     var3 = var5;
                     var2 = var11;
                     f.a(var29, var113, 0, var2, var3, var4, var52, var60, var70, true, 0, -1, true);
                     return;
                  }
               } else {
                  var7 = var72;
                  var10 = var79;
                  var23.a(var3, var104);
                  if (var104 != null) {
                     if (g[var6 & 7] == 0) {
                        f.a(var29, var104, var4, var5);
                        return;
                     }

                     f.a(var29, var104, var7, var10, g[var6 & 7], var4, var5);
                  }
               }
            }
         }
      }
   }

   static final int[] a(int[] var0, int var1, int var2, int var3, int[] var4) {
      if ((var3 & 7) == 0) {
         return var0;
      }

      if ((var4 = a(var0)).length < var1 * var2) {
         new StringBuffer()
            .append("TransformRGB ERROR: The output buffer specified is not big enough (")
            .append(var1)
            .append(" x ")
            .append(var2)
            .append(" = ")
            .append(var1 * var2)
            .append(" > ")
            .append(var4.length)
            .append(")! (increase GLLibConfig.TMP_BUFFER_SIZE)");
      }

      int var5 = 0;
      int var6 = 0;
      switch (var3 & 7) {
         case 1:
            var5 = var1 * var2;
            var6 = var1 * (var2 - 1);

            for (int var31 = var2; --var31 >= 0; var6 -= var1 << 1) {
               for (int var13 = var1; --var13 >= 0; var4[var5] = var0[var6++]) {
                  var5--;
               }
            }
            break;
         case 2:
            var5 = (var2 - 1) * var1;

            for (int var30 = var2; --var30 >= 0; var6 += var1) {
               System.arraycopy(var0, var6, var4, var5, var1);
               var5 -= var1;
            }
            break;
         case 3:
            var6 = var1 * var2 - 1;

            while (var6 >= 0) {
               var4[var5++] = var0[var6--];
            }
            break;
         case 4:
            var5 = var1 * var2;
            int var29 = var2;

            while (--var29 >= 0) {
               var6 = var29;

               for (int var12 = var1; --var12 >= 0; var6 += var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 5:
            var5 = var1 * var2;
            int var28 = var2;

            while (--var28 >= 0) {
               var6 = var2 - 1 - var28;

               for (int var11 = var1; --var11 >= 0; var6 += var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 6:
            int var32 = (var5 = var1 * var2) - 1;
            int var27 = var2;

            while (--var27 >= 0) {
               var6 = var32--;

               for (int var10 = var1; --var10 >= 0; var6 -= var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 7:
            int var8 = (var5 = var1 * var2) - var2;
            int var7 = var2;

            while (--var7 >= 0) {
               var6 = var8++;

               for (int var9 = var1; --var9 >= 0; var6 -= var2) {
                  var4[--var5] = var0[var6];
               }
            }
      }

      return var4;
   }

   static final int[] b(int[] var0) {
      return a(var0);
   }
}
