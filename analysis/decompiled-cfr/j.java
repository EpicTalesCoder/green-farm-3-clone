/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public final class j {
    Image a;

    public static j a(int n, int n2) {
        return new j(Image.createImage((int)n, (int)n2));
    }

    public static j a(int[] nArray, int n, int n2) {
        return new j(Image.createRGBImage((int[])nArray, (int)n, (int)n2, (boolean)true));
    }

    public final void a(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6) {
        this.a.getRGB(nArray, 0, n2, 0, 0, n5, n6);
    }

    private j(Image image) {
        this.a = image;
    }

    public j() {
    }
}

