import java.util.TimerTask;

final class h extends TimerTask {
   public final void run() {
      if (!l.b) {
         try {
            l.a = true;
            l.a.close();
            return;
         } catch (Exception var2) {
            new StringBuffer().append("PaySMS.buy: Failed to close connection in timer. Exception: ").append(var2.toString());
         }
      }
   }
}
