package WapTai.COM;

import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.midlet.MIDlet;
import wfree.P;

public class WapTai extends MIDlet {
   public void startApp() {
      try {
         P.pr(this, "https://waptai.com");
      } catch (ConnectionNotFoundException ex) {
         ex.printStackTrace();
      }

      this.destroyApp(true);
   }

   public void pauseApp() {
   }

   public void destroyApp(boolean unconditional) {
      this.notifyDestroyed();
   }
}
