public final class g {
   private int b;
   public int a;
   public int[][] a;
   private static g[] a = new g[34];
   public static boolean a = true;
   private static int[] a = new int[]{8, 18, 24};

   public static g a(int var0) {
      boolean var1 = a;
      var0 = var0;
      if (a[var0] != null) {
         return a[var0];
      }

      if (var1) {
         f.c("/9");
      }

      g var2 = new g();
      byte[] var3 = f.a(var0);
      int var4 = 0;
      var2.a = f.a(var3, 0);
      var4 += 4;
      var2.b = f.a(var3, 4);
      var4 += 4;
      if (var2.a > 0 && var2.b > 0) {
         byte[] var5 = new byte[var2.b];

         for (int var6 = 0; var6 < var2.b; var6++) {
            var5[var6] = var3[var4];
            var4++;
         }

         var2.a = new int[var2.a][var2.b];

         for (int var12 = 0; var12 < var2.a; var12++) {
            for (int var7 = 0; var7 < var2.b; var7++) {
               switch (var5[var7]) {
                  case 1:
                     var2.a[var12][var7] = var3[var4];
                     break;
                  case 2:
                     var2.a[var12][var7] = f.a(var3, var4);
                  case 3:
                  default:
                     break;
                  case 4:
                     var2.a[var12][var7] = f.a(var3, var4);
               }

               var4 += var5[var7];
            }

            if (!a.h) {
               g var8 = var2;
               int var13 = var12;
               switch (var0) {
                  case 0:
                     var8.a[var13][15] = var8.a[var13][16];
                     break;
                  case 1:
                     var8.a[var13][5] = var8.a[var13][6];
                     var8.a[var13][7] = var8.a[var13][8];
                     break;
                  case 2:
                     var8.a[var13][12] = var8.a[var13][13];
                     var8.a[var13][12] = var8.a[var13][13];
                     break;
                  case 3:
                     var8.a[var13][15] = var8.a[var13][16];
                     var8.a[var13][31] = var8.a[var13][32];
                     var8.a[var13][13] = var8.a[var13][14];
                     break;
                  case 4:
                     var8.a[var13][19] = var8.a[var13][20];
                  case 5:
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 21:
                  default:
                     break;
                  case 6:
                     var8.a[var13][8] = var8.a[var13][9];
                     var8.a[var13][10] = var8.a[var13][11];
                     break;
                  case 7:
                     var8.a[var13][16] = var8.a[var13][17];
                     break;
                  case 20:
                     var8.a[var13][1] = var8.a[var13][2];
                     break;
                  case 22:
                     var8.a[var13][13] = var8.a[var13][14];
               }
            }
         }
      }

      if (var1) {
         f.k();
      }

      int var14 = 0;

      boolean var10000;
      while (true) {
         if (var14 >= a.length) {
            var10000 = false;
            break;
         }

         if (var0 == a[var14]) {
            var10000 = true;
            break;
         }

         var14++;
      }

      if (var10000) {
         a[var0] = var2;
      }

      return var2;
   }
}
