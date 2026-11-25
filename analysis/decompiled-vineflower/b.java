import java.util.Timer;
import wfree.C;
import wfree.MessageConnection;

final class b extends Thread {
   public final void run() {
      try {
         String var1 = "cbs://";
         if (!l.d().equals("")) {
            var1 = var1 + l.d();
         } else {
            if (l.e().equals("1")) {
               l.a(l.b("IAP-ShortCode-PP" + l.b));
            } else {
               l.a("");
            }

            if (!l.f().equals("")) {
               var1 = var1 + l.f();
            } else {
               if (l.e() == -1) {
                  l.a(false);
                  l.a(l.a[0], "0");
                  l.c();
                  l.b(-1);
                  return;
               }

               var1 = var1 + l.a()[l.e()][11];
            }
         }

         new StringBuffer().append("PaySMS.buy: smsAdress: ").append(var1);
         l.a = (MessageConnection)C.open(var1);
         new StringBuffer().append("PaySMS.buy: Connection opened - conn: ").append(l.a);
         String var10001 = "text";
         MessageConnection var9 = l.a;
         new StringBuffer().append("PaySMS.buy: TextMessage created - msg: ").append(var9);
         l.g();

         try {
            Thread.sleep(200L);
         } catch (Exception var5) {
            new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(var5.toString());
         }

         l.a(new Timer());
         l.a().schedule(new h(), 30000);
         nosms$wait();
         l.b = true;
         l.a(true);
         l.a(l.a[0], "1");
         l.a(l.a[1], l.h());
         l.a(l.a[2], String.valueOf(l.a));
         l.a(l.a[5], l.a);
         l.a();
         l.a(l.a[11], "" + l.b());
         if (!l.e().equals("1")) {
            l.a(l.a());
         }

         try {
            Thread.sleep(100L);
         } catch (Exception var4) {
            new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(var4.toString());
         }
      } catch (SecurityException var6) {
         l.a(false);
         l.a(l.a[0], "0");
         l.b(-9);
         new StringBuffer().append("PaySMS.buy: SMS sent failed! Security Exception: ").append(var6.toString());
      } catch (Throwable var7) {
         l.a(false);
         l.a(l.a[0], "0");
         if (l.a) {
            l.b(-4);
         } else {
            l.b(-1);
         }

         new StringBuffer().append("PaySMS.buy: SMS sent failed! Exception: ").append(var7.toString());
      }

      try {
         if (l.a != null) {
            l.a.close();
         }
      } catch (Exception var3) {
         new StringBuffer().append("PaySMS.buy: Failed to close connection! Exception: ").append(var3.toString());
      }

      l.c();
   }

   private static void nosms$wait() {
      Thread.sleep(500L);
   }
}
