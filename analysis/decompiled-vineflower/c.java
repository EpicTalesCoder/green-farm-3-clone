import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.HttpConnection;
import wfree.C;

public final class c implements Runnable {
   private Thread a;
   private String b;
   private HttpConnection a;
   private InputStream a;
   private OutputStream a;
   public String a;
   boolean a;
   private boolean c;
   public boolean b;
   private int a;

   public c() {
      this(true);
   }

   public c(boolean var1) {
   }

   public final synchronized void a() {
      if (!this.c) {
         this.c = true;
         if (this.a != null) {
            if (this.a != null) {
               try {
                  synchronized (this.a) {
                     this.a.close();
                  }
               } catch (Exception var6) {
               }
            }

            if (this.a != null) {
               try {
                  synchronized (this.a) {
                     this.a.close();
                  }
               } catch (Exception var4) {
               }
            }

            this.a = null;
         }

         this.a = null;
         this.a = null;
         this.a = false;
         this.a = null;
         System.gc();
      }
   }

   public final void a(String var1, String var2) {
      System.gc();

      while (this.a) {
         try {
            synchronized (this) {
               this.wait(50L);
            }
         } catch (Exception var6) {
         }
      }

      c var3 = this;
      this.a();
      var3.b = false;
      var3.a = null;
      this.a = true;
      this.c = false;
      this.b = var1 + var2;
      this.b = false;
      this.a = new Thread(this);
      this.a.start();
   }

   public final void run() {
      if (this.b == null) {
         this.a();
         this.b = true;
         this.a = false;
      } else {
         try {
            this.b = false;
            if (this.c) {
               this.a = false;
            } else {
               this.a = (HttpConnection)C.open(this.b, 3);
               this.a.setRequestMethod("GET");
               this.a.setRequestProperty("Connection", "close");
               this.a = this.a.getResponseCode();
               this.a.getResponseMessage();
               this.a.getDate();
               if (this.a != 200 && this.a != 202) {
                  this.a();
                  this.b = true;
                  this.a = false;
               } else if (this.c) {
                  this.a = false;
               } else {
                  synchronized (this.a) {
                     this.a = this.a.openInputStream();
                  }

                  Thread.yield();
                  ByteArrayOutputStream var10 = new ByteArrayOutputStream();
                  byte[] var2 = new byte[256];
                  int var12 = 0;

                  while (var12 != -1) {
                     if (this.c) {
                        this.a = false;
                        return;
                     }

                     for (int var11 = 0; var11 < 256; var11++) {
                        var2[var11] = 0;
                     }

                     if (this.a.read(var2, 0, 256) == -1) {
                        break;
                     }

                     var12 = 255;

                     while (var12 >= 0 && var2[var12] == 0) {
                        var12--;
                     }

                     var10.write(var2, 0, ++var12);
                  }

                  this.a = var10.toString();
                  var10.toByteArray();
               }
            }
         } catch (Exception var8) {
            this.b = true;
            this.a = false;
         } finally {
            this.a();
         }
      }
   }

   public final String toString() {
      return null + ": " + this.b;
   }
}
