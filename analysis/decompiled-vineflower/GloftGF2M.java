import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftGF2M extends MIDlet {
   public static a a;
   public static GloftGF2M a;

   public GloftGF2M() {
      a = this;
   }

   public final void startApp() {
      if (a == null) {
         (a = new a(this, Display.getDisplay(this))).i();
      }
   }

   public final void pauseApp() {
      a.g();
   }

   public final void destroyApp(boolean var1) {
      if (a != null) {
         if (a.a() == 31) {
            if (a.B > 0) {
               a.g(a.B);
            }

            if (a.C > 0) {
               a.k(a.C);
            }
         }

         if (a.a() == 8) {
            if (a.x > 0) {
               a.g(a.x);
            }

            if (a.y > 0) {
               a.k(a.y);
            }
         }

         if (a.a() == 27) {
            a.l(a.z + a.E);
         }

         a.h();
         a.a();
         if (var1) {
            f.S = -1;
         }
      }
   }
}
