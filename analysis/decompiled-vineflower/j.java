import javax.microedition.lcdui.Image;

public final class j {
   Image a;

   public static j a(int var0, int var1) {
      return new j(Image.createImage(var0, var1));
   }

   public static j a(int[] var0, int var1, int var2) {
      return new j(Image.createRGBImage(var0, var1, var2, true));
   }

   public final void a(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.a.getRGB(var1, 0, var3, 0, 0, var6, var7);
   }

   private j(Image var1) {
      this.a = var1;
   }

   public j() {
   }
}
