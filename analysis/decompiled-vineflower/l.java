import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Random;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import wfree.MessageConnection;

public final class l {
   private static MIDlet a = null;
   static int a = -1;
   static String a = "";
   static int b = -1;
   private static String b = "";
   private static String c = "PaySMS.IAP.Version:1.1.8";
   private static c a;
   private static int c;
   private static boolean c = false;
   private static String[][] a = null;
   private static boolean d = false;
   private static Vector[] a = null;
   private static String[][] b = null;
   private static String[][] c = null;
   private static int d = -1;
   private static Vector a = null;
   private static int e = -1;
   private static String[] b = null;
   private static int f = -1;
   private static String[][] d = null;
   private static String[] c = null;
   private static String d = null;
   private static String e = null;
   private static String f = null;
   private static String g = null;
   private static String h = null;
   private static String i = null;
   private static String j = null;
   private static String k = "";
   private static String l = "";
   private static int g = -1;
   private static long a = 1L;
   public static final String[] a = new String[]{
      "rmsSMS",
      "Cm1zY2",
      "rmsPackageId",
      "rmsAvailableProfiles",
      "rmsRedeemUnlocked",
      "rmsItemType",
      "rmsUnlocked",
      "rmsMoneySpent",
      "rmsCurrentRegion",
      "rmsCurrentCarrier",
      "Cm1zY1",
      "rmsSMSCnt"
   };
   private static boolean e = false;
   private static boolean f = false;
   private static boolean g = false;
   private static boolean h = false;
   private static boolean i = false;
   private static String m = "";
   private static String n = "";
   private static String o = "";
   private static String p = "";
   private static String q = "";
   private static String r = "";
   private static String s = "";
   private static String t = "/IAP_profiles";
   private static String u = "/IAP_texts";
   private static Timer a = null;
   public static MessageConnection a = null;
   public static boolean a = false;
   public static boolean b = false;
   private static int h = 0;
   private static int i = 0;
   private static String v = "933";
   private static String w = "5023";
   private static String x = "5025";
   private static String y = "";
   private static String z = "";
   private static String[] d = new String[]{"Cash", "Coin"};
   private static Vector b = null;
   private static Vector c = null;
   private static Vector d = null;
   private static String[] e = null;
   private static boolean j = false;
   private static String[] f = new String[]{"2124", "2126", "2128", "2130", "3501", "3503", "3505", "3507", "3509", "3511"};
   private static String[] g = new String[]{"1152", "1154", "1049", "1156", "2741", "2743", "2745", "2878"};
   private static String[] h = new String[]{"1104", "1106", "1108", "1110"};
   private static int[] a = new int[]{100, 110, 120, 130, 140, 150};
   private static int[] b = new int[]{199, 399, 999, 1999, 2999, 3999};
   private static int j = 4;
   private static char a = '.';

   private static String a(String var0, int var1, char var2) {
      var2 = 0;
      int var3 = var1;
      int var4 = var0.indexOf(124, 1);

      while (var1 > 0) {
         if (var2 == -1) {
            return null;
         }

         var2 = var4;
         var4 = var0.indexOf(124, var2 + 1);
         var1--;
      }

      if (var2 == -1) {
         return null;
      }

      if (var4 == -1) {
         var4 = var0.length();
      }

      if (var3 > 0) {
         var2++;
      }

      if (var2 == var4) {
         return "";
      }

      if (var2 > var4) {
         return null;
      }

      try {
         char[] var6 = new char[var4 - var2];
         var0.getChars(var2, var4, var6, 0);
         return new String(var6);
      } catch (IndexOutOfBoundsException var5) {
         return null;
      }
   }

   public static void a(String var0) {
      b = var0;
      a = f.a;
      i = 0;
      if (a == null) {
         a = new Vector();
      }

      if (c == null) {
         c = b();
      }

      d = c();
      f = h();
      h = i();
      if ((l = i()).equals("")) {
         l = j();
         a(a[1], l);
      }

      a = c();
      c = true;
      if (c != null) {
         c = c + "";
      }

      if (!j() && f() == 0 && d && g()) {
         f();
      }

      d();
      if (d) {
         Vector var2 = new Vector();
         if (f() == 0) {
            for (int var4 = 0; var4 < a.size(); var4++) {
               int var7 = (Integer)a.elementAt(var4);
               String var8 = a[var7][13];
               if (var2.indexOf(var8) == -1) {
                  var2.addElement(var8);
               }
            }
         } else {
            for (int var3 = 0; var3 < b.length; var3++) {
               String var1 = b[var3][13];
               if (var2.indexOf(var1) == -1) {
                  var2.addElement(var1);
               }
            }
         }

         for (int var5 = 0; var5 < c.length; var5++) {
            if (c[var5] != null) {
               String var9 = c[var5][0];
               if (var2.indexOf(var9) == -1) {
                  c[var5] = null;
               }
            }
         }

         if (f() == 0) {
            for (int var6 = 0; var6 < a.length; var6++) {
               if (a.indexOf(new Integer(var6)) == -1) {
                  a[var6] = null;
               }
            }

            b = null;
            return;
         }

         a = null;
         a = null;
      }
   }

   private static boolean d() {
      if (a.a) {
         return false;
      }

      if (a.b) {
         return true;
      }

      if (a.a != null && a.a != "") {
         String var0 = a(a.a, 0, '|');

         try {
            if (var0.equals("FAILURE")) {
               c = Integer.parseInt(a(a.a, 1, '|'));
               return true;
            }
         } catch (NumberFormatException var2) {
            c = 40;
            if ((var0 = a(a.a, 1, '|')).indexOf("PB") != -1) {
               try {
                  c = Integer.parseInt(var0.substring(2, var0.length()));
               } catch (NumberFormatException var1) {
               }
            }

            return true;
         }

         if (var0.equals("SUCCESS")) {
            l = a(a.a, 2, '|');
            c = 0;
            return true;
         }
      }

      c = 40;
      return true;
   }

   public static boolean a() {
      j = 6;
      String var0;
      boolean var4;
      if ((var0 = e(a[6])) != null && !var0.equals("1") && var0.equals("0")) {
         var4 = false;
         i = -10;
      } else {
         a = f.a;
         if ((m = d("IAP-OverrideFromJad")).equals("1")) {
            if ((s = d("IAP-BillingType").toUpperCase()).equals("HTTP")) {
               if ((r = d("IAP-BillingURL")).equals("")) {
                  m = "0";
               }
            } else if (!s.equals("SMS")) {
               m = "0";
            }
         }

         d("IAP-Version");
         boolean var10000;
         if ((h = d("IAP-GameCodeIGP")).length() == 0) {
            var10000 = false;
         } else {
            if ((i = d("IAP-PhoneModel")).length() == 0) {
               i = "5477";
            }

            if ((y = d("IAP-Test")).length() == 0) {
               y = "0";
            }

            if (f() != 0) {
               if (f() == 1) {
                  z = v;
               } else if (f() == 2) {
                  z = w;
               } else {
                  y = "0";
                  z = "";
               }
            }

            new StringBuffer().append("PaySMS.parseJadFields:iapTestField: ").append(y).append(" useTestProfile: ").append(z);
            d = d("IAP-DebugNumber");
            if ((var0 = System.getProperty("wireless.messaging.sms.smsc")) != null && var0.length() > 0) {
               f = var0;
            }

            var0 = d("IAP-DebugSMSCenter");
            e = d("IAP-DebugMNC");
            if (!var0.equals("")) {
               f = var0;
            }

            if (!e.equals("")) {
               g = e;
            }

            j = d("Download-Code");
            if (d("IAP-EnableCreditCard").equals("1")) {
               j = true;
            }

            b = new Vector();
            c = new Vector();
            d = new Vector();

            for (int var7 = 0; var7 < d.length; var7++) {
               for (int var1 = 1; var1 <= j; var1++) {
                  String var2;
                  if ((var2 = d("IAP-ContentID-" + d[var7] + "-" + var1)) != null && !var2.equals("")) {
                     b.addElement(var2);
                  }
               }
            }

            new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(b);

            for (int var8 = 0; var8 < b.size(); var8++) {
               String var11 = (String)b.elementAt(var8);
               boolean var13 = false;

               for (int var3 = var8 + 1; var3 < b.size(); var3++) {
                  if (b.elementAt(var3).equals(var11)) {
                     var13 = true;
                     b.removeElementAt(var3);
                     var3--;
                  }
               }

               if (var13) {
                  b.removeElementAt(var8);
                  var8--;
               }
            }

            if (b.size() == 0) {
               var10000 = false;
            } else {
               new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(b);
               if ((var0 = d("IAP-Profiles")).equals("")) {
                  var10000 = false;
               } else {
                  if (var0.length() > 0 && var0.charAt(var0.length() - 1) != ';') {
                     var0 = var0 + ";";
                  }

                  String[] var12;
                  if ((var12 = a(var0)) == null) {
                     var10000 = false;
                  } else if (!a(null, var12, b(t))) {
                     var10000 = j;
                  } else {
                     d = true;
                     var10000 = true;
                  }
               }
            }
         }

         boolean var10 = var10000;
         new StringBuffer().append("PaySMS.checkAvailable:parseJadFields: ").append(var10 ? "true" : "false");
         if (var10 && e()) {
            var4 = true;
         } else {
            var4 = false;
         }
      }

      if (!var4) {
         a = null;
         a = null;
         c = null;
         b = null;
      }

      return var4;
   }

   private static boolean e() {
      boolean var0;
      if (f() != 0) {
         var0 = true;
      } else if (!j || a != null && a.length != 0) {
         if (a.length == 1) {
            var0 = true;
         } else if (a.length > 1) {
            String var1 = a[0][2];
            String var2 = a[0][3];
            var0 = true;

            for (int var3 = 1; var3 < a.length; var3++) {
               String var4 = a[var3][2];
               String var5 = a[var3][3];
               if (!var1.equals(var4) || !var2.equals(var5)) {
                  var0 = false;
                  break;
               }
            }
         } else {
            var0 = false;
         }
      } else {
         var0 = true;
      }

      new StringBuffer().append("PaySMS.checkAvailable:validProfiles: ").append(var0 ? "true" : "false");
      return var0;
   }

   public static boolean b() {
      f = h();
      h = i();
      return f || h;
   }

   public static void a(int var0, String var1) {
      new StringBuffer().append("PaySMS.sendRequest: start (PricePoint:").append(var0).append(") (Item Type: ").append(var1).append(")");
      b = var0;
      a = b(var0, var1);
      a = var1;
      boolean var2 = false;
      String var3 = "";
      if (m.equals("1")) {
         var3 = s;
      } else {
         if (f() != 0) {
            a = b;
            if (f() == 1) {
               var3 = "SMS";
            } else if (f() == 2) {
               var3 = "HTTP";
            }

            for (int var22 = 0; var22 < a.length; var22++) {
               if (a[var22][0].equals(z)) {
                  g = var22;
                  var2 = true;
                  break;
               }
            }
         } else {
            new StringBuffer().append("PaySMS.sendRequest: currentValidProfiles: ").append(a == null ? "null" : "Size: " + a.size());
            if (a != null && a.size() != 0) {
               g = 0;

               for (int var4 = 0; var4 < a.size(); var4++) {
                  int var5 = (Integer)a.elementAt(var4);

                  try {
                     if (Integer.parseInt(a[var5][14]) == var0) {
                        g = var5;
                        var2 = true;
                        var3 = a[g][6];
                        break;
                     }
                  } catch (Exception var9) {
                     g = 0;
                  }
               }
            } else {
               g = -1;
            }
         }

         new StringBuffer().append("PaySMS.sendRequest: currentProfile: ").append(g);
         if (var2 && g != -1) {
            new StringBuffer()
               .append("PaySMS.sendRequest: Id: ")
               .append(a[g][0])
               .append(" Billing: ")
               .append(a[g][6])
               .append(" Region: ")
               .append(a[g][2])
               .append(" Carrier: ")
               .append(a[g][3])
               .append(" Pricepoint: ")
               .append(a[g][14]);
         }
      }

      if (c) {
         new StringBuffer().append("creditCardEnabled: ").append(j);
         if (var2 && var3.equals("SMS")) {
            e = true;
            f = false;
            a(a[0], "0");
            k = "";
            if (m.equals("1")) {
               p = d("IAP-Alias-PP" + b);
            } else {
               p = "";
            }

            if (!p.equals("")) {
               b(p);
            } else if (g != -1 && !a[g][10].equals("")) {
               b(a[g][10]);
            }

            if (a[g][12].equals("7")) {
               b("UNLOCK");
            } else {
               b("INAPP");
            }

            b("V009");
            b(h);
            b(l);
            b(i);
            if (m.equals("1")) {
               o = d("IAP-ProfileID-PP" + b);
            } else {
               o = "";
            }

            if (!o.equals("")) {
               b(o);
            } else {
               if (g == -1) {
                  i = 7;
                  return;
               }

               b(a[g][0]);
            }

            if (!b.equals("")) {
               b(b);
            } else {
               b("EN");
            }

            if (a[g][12].equals("7")) {
               b("7");
            } else {
               b("1");
            }

            String var16;
            if (!(var16 = d("IAP-ContentID-" + a + "-" + b)).equals("")) {
               b(var16);
               b("ct" + a);
               new StringBuffer().append("PaySMS.sendSMS: smsContent: ").append(k);
               g = true;
               new b().start();
            } else {
               new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(a).append("-").append(b).append(" missing in JAD");
               i = -2;
            }
         } else if (var2 && var3.equals("HTTP")) {
            a = new c(false);
            String var10;
            if (m.equals("1")) {
               var10 = r;
               var1 = o = d("IAP-ProfileID-PP" + b);
            } else {
               if (g == -1) {
                  i = 7;
                  return;
               }

               var10 = a[g][11];
               var1 = a[g][0];
            }

            if (!var10.equals("") && !var1.equals("")) {
               new StringBuffer().append("PaySMS.sendHTTP: URL = ").append(var10);
               if (!var10.startsWith("http://")) {
                  var10 = "http://" + var10;
               }

               if (!var10.endsWith("?")) {
                  var10 = var10 + "?";
               }

               String var19;
               if ((var19 = d("IAP-ContentID-" + a + "-" + b)).equals("")) {
                  new StringBuffer().append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-").append(a).append("-").append(b).append(" missing in JAD");
                  i = -2;
               } else {
                  String var6 = i;
                  String var24 = j;
                  String var23 = l;
                  var3 = h;
                  String var20 = var1;
                  var1 = var19;
                  String var11 = var10;
                  a.a();
                  String var7 = "%7C";
                  String var8 = var11;
                  String var12 = "b=contentpurchase" + var7 + var3 + var7;
                  String var13 = var12 + var1 + var7 + var20 + var7;
                  String var14 = var13 + var23;
                  if (!var24.equals("")) {
                     var14 = var14 + "&d=" + var24;
                  }

                  String var15 = var14 + "&phoneId=" + var6;
                  c = -100;
                  a.a(var8, var15);
                  a(a[1], l);
                  a(a[2], String.valueOf(a));
                  a(a[5], a);
                  if (!m.equals("1")) {
                     b(a);
                  }

                  h = 1;
               }
            } else {
               i = 4;
            }
         } else if (j && g == -1) {
            b(var0, var1);
         } else if (j) {
            b(var0, var1);
         } else {
            i = -2;
         }
      }
   }

   public static void a() {
      h = true;
      a(a[4], "1");
      int var0 = c();
      String var1 = b();
      a(a(var0, var1), var1);
   }

   public static int a() {
      if (i) {
         i = false;
         return 7;
      }

      if (!c) {
         return 0;
      }

      if (f) {
         return 2;
      }

      if (g) {
         return 1;
      }

      if (!e && !h) {
         if (h == 1) {
            if (d()) {
               h = 0;
               int var0;
               if ((var0 = a.a ? -1 : (a.b ? -2 : c)) == 0) {
                  if (a(Integer.parseInt(l))) {
                     i = 0;
                     c();
                     return 7;
                  } else {
                     i = 1;
                     c();
                     return 3;
                  }
               } else if (var0 == -2) {
                  i = -1;
                  c();
                  return 3;
               } else {
                  i = var0;
                  c();
                  return 3;
               }
            } else {
               return 1;
            }
         } else {
            if (!m.equals("1") && f() == 0) {
               if (i != 0) {
                  return 3;
               }

               if ((a == null || a.size() < 1) && (!j || d)) {
                  if (f < 0) {
                     i = -3;
                     return 3;
                  }

                  if (a.size() < 1) {
                     i = -3;
                     return 3;
                  }
               }
            }

            return 6;
         }
      } else if (h) {
         e = false;
         f = true;
         a(a[0], "1");
         return 8;
      } else {
         c();
         return 3;
      }
   }

   public static int b() {
      return i;
   }

   public static int c() {
      String var0;
      if ((var0 = e(a[2])) != null && var0.length() != 0) {
         try {
            var2 = Integer.parseInt(var0);
         } catch (Exception var1) {
            var2 = -1;
         }

         return var2;
      } else {
         return -1;
      }
   }

   public static boolean a(int var0) {
      boolean var1 = false;
      if ((l = i()) != null && l.length() > 0) {
         String var2 = String.valueOf(var0);
         int var4 = Integer.parseInt(l) ^ 53412;
         var1 = var2.equals(String.valueOf(var4));
      }

      new StringBuffer().append("PaySMS.verifyRequest: inputCode: ").append(var0).append(" ").append(var1 ? "Unlocked" : "Still Locked");
      if (var1) {
         try {
            String var12 = e(a[7]);
            String var17 = "0";
            if (var12 != null && !var12.equals("")) {
               var17 = var12.substring(0, var12.indexOf(95));
            }

            var0 = c();
            String var3 = b();
            var0 = a(var0, var3);
            var3 = a(0, var0);
            String var15 = a(9, var0);
            String var21 = var15;
            var17 = var17.replace(',', '.');
            var21 = var21.replace(',', '.');
            long var5 = a(var17);
            long var7 = a(var21);
            String var10 = var21;
            char var16 = var17.indexOf(a) == -1 && var10.indexOf(a) == -1 ? ' ' : a;
            long var9 = var5 + var7;
            var17 = var16 == ' ' ? var9 / 100000L + "" : "" + var9 / 100000L + var16 + var9 % 100000L;
            new StringBuffer().append("totalMoneySpent : ").append(var17).append("  profileID: ").append(var3);
            a(a[7], var17 + "_" + var3);
         } catch (Exception var11) {
            new StringBuffer().append("Exception : ").append(var11);
         }

         i = 0;
         if (!c(c()).equals("http_2d")) {
            i = true;
         }

         c();
      }

      return var1;
   }

   private static void c() {
      g = false;
      e = false;
      c = false;
      a(a[1], "");
      f = false;
      a(a[0], "0");
      h = false;
      a(a[4], "0");
   }

   public static void b() {
      d = -1;
      f = -1;
      a = null;
      i = false;
      a(a[2], "");
      a(a[5], "");
      a(a[3], "");
      a(a[8], "");
      a(a[9], "");
      g = null;
      c();
   }

   private static boolean f() {
      if (a == null) {
         a = new Vector();
      }

      if (a.size() == 1) {
         g = (Integer)a.elementAt(0);
         new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, detected profile: ").append(g);
         return true;
      }

      e = -1;
      g = -1;
      a.removeAllElements();
      String[][] var0;
      b = new String[(var0 = a(d[f][0])).length];
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         b[var2] = var0[var2][0];
         var1[var2] = var0[var2][1];
      }

      b = a(b);
      var1 = a(var1);
      new StringBuffer().append("PaySMS.detectCarrier: currentIDS ").append(var1.length).append(", currentCarriers = ").append(b.length);
      if (var1.length == 1) {
         e = 0;

         for (int var14 = 0; var14 < a.length; var14++) {
            if (a[var14][0].equals(var1[0])) {
               a.addElement(new Integer(var14));
            }
         }

         new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one profile. currentValidProfiles.size() ").append(a.size());
         return true;
      } else if (b.length == 1) {
         e = 0;
         new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one carrier: ").append(b[e]);

         for (int var13 = 0; var13 < a.length; var13++) {
            if (a[var13][2].indexOf(d[f][0]) != -1) {
               for (int var9 = 0; var9 < a[var13].size(); var9++) {
                  if (((String)a[var13].elementAt(var9)).indexOf(b[e]) != -1) {
                     a.addElement(new Integer(var13));
                  }
               }
            }
         }

         new StringBuffer().append("PaySMS.detectCarrier: currentValidProfiles.size =  ").append(a.size());
         return true;
      } else {
         if (b.length >= 1) {
            String[][] var12 = new String[var1.length][2];
            boolean var5 = true;

            for (int var3 = 0; var3 < var1.length; var3++) {
               new StringBuffer().append("PaySMS.detectCarrier: currentIDS[").append(var3).append("]= ").append(var1[var3]);

               for (int var4 = 0; var4 < a.length; var4++) {
                  if (a[var4][0].equals(var1[var3])) {
                     var12[var3][0] = a[var4][3];
                     var12[var3][1] = "" + var4;
                     new StringBuffer().append("PaySMS.detectCarrier: is Openmarket???? ").append(a[var4][1]);
                     if (a[var4][1].indexOf("Open Market") == -1) {
                        var5 = false;
                     }
                     break;
                  }
               }
            }

            boolean var15 = true;

            for (int var16 = 1; var16 < var12.length; var16++) {
               if (!var12[var16][0].equals(var12[var16 - 1][0])) {
                  var15 = false;
                  new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i] ").append(var12[var16][0]);
                  new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i-1] ").append(var12[var16 - 1][0]);
               }
            }

            new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles: ").append(var15).append(", isOpenMarket: ").append(var5);
            if (var15) {
               for (int var18 = 0; var18 < var1.length; var18++) {
                  for (int var8 = 0; var8 < a.length; var8++) {
                     if (a[var8][0].equals(var1[var18])) {
                        a.addElement(new Integer(var8));
                        break;
                     }
                  }
               }

               new StringBuffer()
                  .append("PaySMS.detectCarrier: Dont auto skip carrier selection(except OpenMarket). currentValidProfiles.size() ")
                  .append(a.size());
               new StringBuffer().append("PaySMS.detectCarrier: More than one carrier, but multicarrier profiles: ").append(var12[0][0]);
               return true;
            }

            int var17 = b.length;

            for (int var6 = 0; var6 < var17; var6++) {
               b[var6] = b[var6].trim();
            }

            int[] var7 = new int[var17];

            for (int var11 = 0; var11 < var17; var11++) {
               var7[var11] = var11;
               new StringBuffer().append("PaySMS.detectCarrier: carrierNames[").append(var11).append("]: ").append(b[var11]);
            }
         }

         return false;
      }
   }

   private static boolean g() {
      if (d != -1) {
         f = d;
         return true;
      }

      f = -1;
      g = -1;
      a = null;
      c = new String[d.length];

      for (int var0 = 0; var0 < c.length; var0++) {
         c[var0] = d[var0][0];
      }

      if (c.length != 1 || f != null && d != -1) {
         if (f != null && d != -1) {
            f = d;
            new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, region auto-detected: ").append(d);
            return true;
         }

         int var4 = c.length;

         for (int var1 = 0; var1 < var4 - 1; var1++) {
            for (int var2 = var1 + 1; var2 < var4; var2++) {
               if (c[var1].compareTo(c[var2]) > 0) {
                  String var3 = c[var1];
                  c[var1] = c[var2];
                  c[var2] = var3;
               }
            }
         }

         return false;
      } else {
         f = 0;
         d = 0;
         new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, only one region: ").append(c[f]);
         return true;
      }
   }

   private static void b(int var0, String var1) {
      new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: Pricepoint:").append(var0).append(" Type:").append(var1);
      String var2 = e[11];
      String var3;
      if ((var3 = d("IAP-ContentID-" + var1 + "-" + var0)).equals("")) {
         new StringBuffer().append("PaySMS.sendCCARD: Wrong Item. IAP-ContentID-").append(var1).append("-").append(var0).append(" missing in JAD");
         i = -2;
      } else {
         var1 = "";
         var1 = var1 + "?igpcode=" + h;
         var1 = var1 + "&content_id=" + var3;
         var1 = var1 + "&tier=" + var0;
         var1 = var1 + "&code=" + l;
         var1 = var1 + "&d=" + j;
         String var4 = var2 + var1;
         new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: ").append(var4);
         a(a[0], "1");
         a(a[1], l);
         a(a[2], String.valueOf(a));
         a(a[5], a);
         String var5;
         if ((var5 = var4) != null) {
            f.a(var5);
         }
      }
   }

   private static void b(String var0) {
      if (var0 != null) {
         k = k + var0 + " ";
      }
   }

   private static String[][] a(String var0) {
      Vector var2 = new Vector();

      for (int var3 = 0; var3 < a.length; var3++) {
         if (a[var3][2].indexOf(var0) != -1) {
            for (int var4 = 0; var4 < a[var3].size(); var4++) {
               String var5 = (String)a[var3].elementAt(var4);
               String var6 = a[var3][0];
               if (var5 != null) {
                  int var1;
                  if ((var1 = var5.indexOf(40)) == -1) {
                     var1 = var5.length();
                  }

                  new StringBuffer().append("PaySMS.getProfilesCarrierAndIds: regionName = ").append(var0).append(", carrierName = ").append(var5);
                  if ((g == null || a(var5, g)) && !var2.contains(var5.substring(0, var1))) {
                     var2.addElement(new String[]{new String(var5.substring(0, var1)), var6});
                  }
               }
            }
         }
      }

      String[][] var7 = new String[var2.size()][2];
      var2.copyInto(var7);
      return var7;
   }

   public static String a(int var0) {
      return b(var0);
   }

   private static String b(int var0) {
      new StringBuffer().append("PaySMS.getPrice: begin (").append(var0).append(")");
      if (m.equals("1")) {
         return (q = d("IAP-Price-PP" + var0)).equals("") ? null : q;
      }

      new StringBuffer().append("PaySMS.getPrice: currentValidProfiles: ").append(a == null ? "NULL" : "Size: " + a.size());
      if (a == null) {
         return j ? " " : null;
      }

      int var1 = -1;
      if (f() == 0) {
         for (int var2 = 0; var2 < a.size(); var2++) {
            int var3 = (Integer)a.elementAt(var2);

            try {
               if (Integer.parseInt(a[var3][14]) == var0) {
                  var1 = var3;
                  break;
               }
            } catch (Exception var4) {
            }
         }
      } else {
         for (int var5 = 0; var5 < b.length; var5++) {
            if (b[var5][0].equals(z)) {
               return b[var5][9];
            }
         }
      }

      new StringBuffer().append("PaySMS.getPrice: profileIndex: ").append(var1);
      if (var1 == -1) {
         return j ? " " : null;
      } else {
         return a[var1][4];
      }
   }

   public static long a(long var0, int var2) {
      new StringBuffer().append("PaySMS.getVirtualCurrency: begin basecurrency ").append(var0).append(", pricepoint").append(var2);
      long var3 = 0L;
      if (f() == 0 && a != null && a.size() > 0) {
         for (int var7 = 0; var7 < a.size(); var7++) {
            int var11 = (Integer)a.elementAt(var7);

            try {
               if (Integer.parseInt(a[var11][14]) == var2) {
                  var3 = var0 * Long.parseLong(a[var11][16]) / 10000000L;
                  long var12 = var0 * Long.parseLong(a[var11][16]) % 10000000L;
                  var3 += var12 / 5000000L;
                  break;
               }
            } catch (Exception var8) {
            }
         }
      } else {
         var3 = var0 * b[var2 - 1] * a[var2 - 1] / (b[0] * 100);
         long var5 = var0 * b[var2 - 1] * a[var2 - 1] % (b[0] * 100);
         var3 += var5 / (b[0] * 100 >> 1);
      }

      int var14 = ("" + var3).length();
      byte var13 = 1;
      if (var14 == 2) {
         var13 = 2;
      } else if (var14 > 2) {
         var13 = 5;

         for (int var9 = 0; var9 < var14 - 3; var9++) {
            var13 *= 10;
         }
      }

      new StringBuffer().append("currency:\t").append(var3).append("\tRound Up:\t").append(var13);
      if (var3 % var13 != 0L) {
         var3 = (var3 / var13 + 1L) * var13;
      }

      new StringBuffer().append("Rounded currency:\t").append(var3);
      return var3;
   }

   private static String a(int var0, int var1) {
      if (f() == 0) {
         for (int var2 = 0; var2 < a.size(); var2++) {
            int var3 = (Integer)a.elementAt(var2);
            if (a[var3][14].equals(String.valueOf(var1))) {
               return a[var3][var0];
            }
         }
      } else {
         for (int var4 = 0; var4 < b.length; var4++) {
            if (b[var4][0].equals(z)) {
               return b[var4][var0];
            }
         }
      }

      return "";
   }

   private static String c(int var0) {
      if (f() != 0) {
         if (f() == 1) {
            return "sms_2d";
         }

         if (f() == 2) {
            return "http_2d";
         }

         if (f() == 3) {
            return "cc_2d";
         }
      }

      new StringBuffer().append("PaySMS.GetBillingType: currentValidProfiles: ").append(a == null ? "NULL" : "Size: " + a.size());
      if (a == null) {
         return "cc_2d";
      }

      int var1 = 0;
      boolean var2 = false;

      for (int var3 = 0; var3 < a.size(); var3++) {
         int var4 = (Integer)a.elementAt(var3);

         try {
            if (Integer.parseInt(a[var4][14]) == var0) {
               var1 = var4;
               var2 = true;
               break;
            }
         } catch (Exception var5) {
         }
      }

      if (!var2) {
         return "cc_2d";
      } else if (a[var1][6].equals("SMS")) {
         return "sms_2d";
      } else {
         return a[var1][6].equals("HTTP") ? "http_2d" : null;
      }
   }

   public static String a() {
      new StringBuffer().append("PaySMS.GetTermsAndConditions: currentValidProfiles: ").append(a == null ? "NULL" : "Size: " + a.size());
      if (a == null) {
         return null;
      }

      String var0 = null;
      String var1 = null;
      if (f() == 0) {
         if (a.size() > 0) {
            int var2 = (Integer)a.elementAt(0);

            try {
               var0 = a[var2][13];
               var1 = a[var2][15];
            } catch (Exception var3) {
            }
         }
      } else if (b.length > 0) {
         for (int var4 = 0; var4 < b.length; var4++) {
            if (b[var4][0].equals(z)) {
               var0 = b[var4][13];
               break;
            }
         }
      }

      new StringBuffer().append("PaySMS.GetTermsAndConditions: tncID = '").append(var0).append("'");
      String var5 = c(var0);
      new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc = '").append(var5).append("'");
      new StringBuffer().append("PaySMS.GetTermsAndConditions: supportNumber = '").append(var1).append("'");
      var5 = a(var5, var1);
      new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc without phone number = '").append(var5).append("'");
      return var5;
   }

   public static int a(String var0) {
      if (var0.equals("Cash")) {
         return c.size();
      } else {
         return var0.equals("Coin") ? d.size() : -1;
      }
   }

   private static void d() {
      c.removeAllElements();
      d.removeAllElements();
      if (f() == 0 && a != null && a.size() > 0) {
         for (int var4 = 0; var4 < a.size(); var4++) {
            int var1 = (Integer)a.elementAt(var4);
            int var2;
            if (a(var2 = Integer.parseInt(a[var1][14]), "Cash")) {
               c.addElement(new Integer(var2));
            }

            if (a(var2, "Coin")) {
               d.addElement(new Integer(var2));
            }
         }
      } else if (j || f() != 0) {
         new StringBuffer().append("PaySMS.parseValidItems: IAP_TEST_FIELD or CC. creditCardEnabled = ").append(j);

         for (int var0 = 1; var0 <= j; var0++) {
            if (a(var0, "Cash")) {
               c.addElement(new Integer(var0));
            }

            if (a(var0, "Coin")) {
               d.addElement(new Integer(var0));
            }
         }
      }

      for (int var5 = 0; var5 < c.size() - 1; var5++) {
         for (int var7 = var5 + 1; var7 < c.size(); var7++) {
            int var9 = (Integer)c.elementAt(var5);
            int var3 = (Integer)c.elementAt(var7);
            if (var9 > var3) {
               c.setElementAt(new Integer(var3), var5);
               c.setElementAt(new Integer(var9), var7);
            }
         }
      }

      for (int var6 = 0; var6 < d.size() - 1; var6++) {
         for (int var8 = var6 + 1; var8 < d.size(); var8++) {
            int var10 = (Integer)d.elementAt(var6);
            int var11 = (Integer)d.elementAt(var8);
            if (var10 > var11) {
               d.setElementAt(new Integer(var11), var6);
               d.setElementAt(new Integer(var10), var8);
            }
         }
      }

      new StringBuffer().append("PaySMS.parseValidItems: number of cash: ").append(c.size());
      new StringBuffer().append("PaySMS.parseValidItems: number of coin: ").append(d.size());
   }

   public static int a(int var0, String var1) {
      new StringBuffer().append("PaySMS.getPricePoint: itemIndex").append(var0).append(", itemType ").append(var1);
      if (var1.equals("Cash") && var0 <= c.size()) {
         return (Integer)c.elementAt(var0);
      } else {
         return var1.equals("Coin") && var0 <= d.size() ? (Integer)d.elementAt(var0) : -1;
      }
   }

   private static int b(int var0, String var1) {
      int var2 = -1;
      if (var1.equals("Cash")) {
         for (int var3 = 0; var3 < c.size(); var3++) {
            if ((Integer)c.elementAt(var3) == var0) {
               var2 = var3;
               break;
            }
         }
      } else if (var1.equals("Coin")) {
         for (int var4 = 0; var4 < d.size(); var4++) {
            if ((Integer)d.elementAt(var4) == var0) {
               var2 = var4;
               break;
            }
         }
      }

      return var2;
   }

   private static boolean a(int var0, String var1) {
      String var2 = d("IAP-ContentID-" + var1 + "-" + var0);
      boolean var3 = false;
      if (b.contains(var2)) {
         var3 = true;
      }

      new StringBuffer()
         .append("PaySMS.isValidContentID: IAP-ContentID-")
         .append(var1)
         .append("-")
         .append(var0)
         .append(": ")
         .append(var2)
         .append(var3 ? " - Valid" : " - Invalid");
      return var3;
   }

   private static String c(String var0) {
      new StringBuffer().append("PaySMS.retrieveTermsAndConditions: id = '").append(var0).append("'");
      if (var0 != null && var0.length() != 0) {
         for (int var1 = 0; var1 < c.length; var1++) {
            if (c[var1] != null) {
               new StringBuffer()
                  .append("PaySMS.retrieveTermsAndConditions: profilesTexts[")
                  .append(var1)
                  .append("][TEXT_PROFILE_ID] = '")
                  .append(c[var1][0])
                  .append("'");
               if (b(c[var1][0], var0)) {
                  return c[var1][1];
               }
            }
         }

         return "";
      } else {
         return "";
      }
   }

   private static String a(String var0, String var1) {
      if (var0 != null && !var0.equals("")) {
         try {
            int var2 = var0.indexOf("<phone>");
            int var3 = var0.indexOf("</phone>", var2 + "<phone>".length());
            String var4 = var0.substring(0, var2);
            String var8 = var0.substring(var2 + "<phone>".length(), var3);
            String var11 = var0.substring(var3 + "</phone>".length(), var0.length());
            String var9;
            if (var1 != null && !var1.equals("")) {
               int var5 = var8.indexOf("<support_number>");
               int var6 = "<support_number>".length();
               String var10 = var8.substring(0, var5) + var1 + var8.substring(var5 + var6, var8.length());
               var9 = var4 + var10 + var11;
            } else {
               var9 = var4 + var11;
            }

            return var9;
         } catch (Exception var7) {
            return var0;
         }
      } else {
         return null;
      }
   }

   private static String[][] b() {
      String[] var0;
      if ((var0 = b(u)) == null) {
         return null;
      }

      String[][] var1 = new String[var0.length][2];

      for (int var2 = 0; var2 < var0.length; var2++) {
         int var3;
         if ((var3 = var0[var2].indexOf(59)) != -1) {
            var1[var2][0] = new String(var0[var2].substring(0, var3));
            var1[var2][1] = new String(var0[var2].substring(var3 + 1, var0[var2].length()));
         }
      }

      for (int var4 = 0; var4 < var1.length; var4++) {
         new StringBuffer().append("PaySMS.loadSpecificTextsFile: ID: ").append(var1[var4][0]).append(" TEXT: ").append(var1[var4][1]);
      }

      return var1;
   }

   private static String d(String var0) {
      if ((var0 = a.getAppProperty(var0)) == null) {
         var0 = "";
      }

      return var0;
   }

   private static int f() {
      if (y.equals("0")) {
         return 0;
      } else if (y.equals("1")) {
         return 1;
      } else {
         return y.equals("2") ? 2 : 0;
      }
   }

   private static boolean a(String[] var0, String[] var1, String[] var2) {
      if (var2 == null) {
         i = 8;
         return false;
      }

      for (int var12 = 0; var12 < var2.length; var12++) {
         new StringBuffer().append("PaySMS.loadProfileConfiguration: profilesArgs[").append(var12).append("]: ").append(var2[var12]);
      }

      var0 = var1;
      int var3 = 0;
      int[] var4 = new int[var2.length];
      String[][] var5 = new String[var2.length][17];
      int var6 = 0;
      int[] var7 = new int[var2.length];

      for (int var8 = 0; var8 < var2.length; var8++) {
         int var14 = 0;

         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = var2[var8].indexOf(";", var14);
            String var15 = new String(var2[var8].substring(var14, var10));
            var5[var8][var9] = var15;
            var14 = var10 + 1;
         }

         if (a(var5[var8][0])) {
            var7[var6++] = var8;
         }

         if (var5[var8][6].equals("CC")) {
            e = var5[var8];
         }

         for (int var21 = 0; var21 < var0.length; var21++) {
            String var16;
            if ((var16 = var0[var21]) != null && var16.length() != 0 && var5[var8][0].equals(var16)) {
               if (!a(var5[var8][0]) && !var5[var8][6].equals("CC")) {
                  var4[var3++] = var8;
                  var0[var21] = null;
               }
               break;
            }
         }
      }

      if (var6 != 0) {
         b = new String[var6][];

         for (int var18 = 0; var18 < b.length; var18++) {
            b[var18] = var5[var7[var18]];
         }
      }

      if (var3 == 0) {
         return false;
      }

      a = new String[var3][];

      for (int var19 = 0; var19 < a.length; var19++) {
         a[var19] = var5[var4[var19]];
      }

      try {
         for (int var20 = 0; var20 < var3; var20++) {
            String var22 = a[var20][9];
            String var23 = a[var20][7];
            int var17 = Integer.parseInt(a[var20][14]);
            if (var23 != null) {
               a[var20][16] = "" + a(var22) * (100 + Integer.parseInt(a[var20][5])) * 100000L / a(var23);
               new StringBuffer().append("bonus    ").append(100 + Integer.parseInt(a[var20][5])).append(", tier ").append(var17);
            }

            new StringBuffer().append("profile Id :\t").append(a[var20][0]).append("\tTier:\t").append(var17).append("\tRatios :\t").append(a[var20][16]);
         }
      } catch (Exception var11) {
      }

      e();
      return true;
   }

   private static void e() {
      int var0 = a.length;
      if (e != null) {
         var0++;
      }

      a = new Vector[var0];

      for (int var4 = 0; var4 < a.length; var4++) {
         a[var4] = new Vector();
         String var1 = a[var4][3];
         new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(a[var4][0]);
         int var2 = 0;
         int var3;
         if ((var3 = var1.indexOf("¬", 0)) == -1) {
            a[var4].addElement(var1);
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var1);
         } else {
            while (var3 != -1) {
               a[var4].addElement(new String(var1.substring(var2, var3)));
               new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var1.substring(var2, var3));
               var2 = var3 + 1;
               var3 = var1.indexOf("¬", var2);
            }

            a[var4].addElement(new String(var1.substring(var2, var1.length())));
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var1.substring(var2, var1.length()));
         }

         new StringBuffer().append("\tSize: ").append(a[var4].size());
      }

      if (e != null) {
         a[a.length] = new Vector();
         String var5 = e[3];
         new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(e[0]);
         int var6 = 0;
         int var7;
         if ((var7 = var5.indexOf("¬", 0)) == -1) {
            a[a.length].addElement(var5);
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var5);
         } else {
            while (var7 != -1) {
               a[a.length].addElement(var5.substring(var6, var7));
               new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var5.substring(var6, var7));
               var6 = var7 + 1;
               var7 = var5.indexOf("¬", var6);
            }

            a[a.length].addElement(new String(var5.substring(var6, var5.length())));
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var5.substring(var6, var5.length()));
         }

         new StringBuffer().append("\tSize: ").append(a[a.length].size());
      }
   }

   private static boolean a(String var0) {
      return var0.equals(v) || var0.equals(w) || var0.equals(x);
   }

   private static String[] a(String var0) {
      if (var0 == null) {
         return null;
      }

      Vector var1 = new Vector();
      int var2 = 0;

      while (var2 < var0.length()) {
         int var3;
         if ((var3 = var0.indexOf(59, var2)) != -1) {
            var1.addElement(new String(var0.substring(var2, var3)));
            var2 = var3 + 1;
         } else {
            var2 = var0.length();
         }
      }

      String[] var4 = new String[var1.size()];
      var1.copyInto(var4);
      return var4;
   }

   private static String[] b(String var0) {
      InputStream var1 = "".getClass().getResourceAsStream(var0);
      String var2 = null;

      try {
         ByteArrayOutputStream var8 = new ByteArrayOutputStream(2048);
         byte[] var3 = new byte[256];

         int var4;
         while ((var4 = var1.read(var3)) != -1) {
            var8.write(var3, 0, var4);
         }

         var1.close();
         var3 = var8.toByteArray();
         var8.close();
         var2 = new String(var3, 0, var3.length, "UTF-8");
      } catch (Exception var5) {
         new StringBuffer().append("PaySMS.readFile: ").append(var0).append(" Exception: ").append(var5.toString());
         return null;
      }

      int var11 = 0;
      Vector var6 = new Vector();

      int var12;
      do {
         if ((var12 = var2.indexOf(10, var11)) != -1) {
            var6.addElement(new String(var2.substring(var11, var12)));
            var11 = var12 + 1;
         }
      } while (var12 != -1);

      String[] var7 = new String[var6.size()];
      var6.copyInto(var7);
      return var7;
   }

   private static String[][] c() {
      if (d && f() == 0) {
         Vector var0 = new Vector();

         for (int var1 = 0; var1 < a.length; var1++) {
            String var2 = a[var1][2];
            boolean var3 = false;

            for (int var4 = 0; !var3 && var4 < var0.size(); var4++) {
               if (b(var2, (String)var0.elementAt(var4))) {
                  var3 = true;
               }
            }

            if (!var3) {
               var2 = a[var1][2];
               var0.addElement(var2);
            }
         }

         if (e != null && j && var0.size() > 1) {
            var0.addElement("Other");
         }

         String[] var10 = new String[var0.size()];
         var0.copyInto(var10);
         var0.removeAllElements();
         var0 = new Vector();
         String[][] var12 = new String[var10.length][2];
         int var13 = 0;
         int var14 = 0;

         for (int var5 = 0; var5 < var10.length; var5++) {
            String var6;
            int var7;
            if ((var7 = (var6 = var10[var5]).indexOf(40)) != -1) {
               var12[var5][0] = var6.substring(0, var7);
               int var8 = var6.indexOf(58, ++var7);
               e(a[8]);
               if (var8 != -1) {
                  var12[var5][1] = var6.substring(var7, var8);
                  if (f != null && f.startsWith(var12[var5][1], 1) && var13 <= var8 - var7) {
                     var13 = var8 - var7;
                     d = var5;
                     new StringBuffer().append("currentAutoDetectedRegion ").append(d);
                     String[] var15;
                     (var15 = new String[2])[0] = var12[var5][0];
                     var15[1] = var12[var5][1];
                     var0.addElement(var15);
                     var14++;
                  }
               }
            } else {
               var12[var5][0] = var6;
               var12[var5][1] = "";
            }

            new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(var5).append("][REGION_NAME]: ").append(var12[var5][0]);
            new StringBuffer().append("PaySMS.getProfilesRegions:          regionsConfig[").append(var5).append("][REGION_CODE]: ").append(var12[var5][1]);
         }

         if (var14 > 1) {
            d = -1;
            var12 = new String[var0.size()][2];
            var0.copyInto(var12);
         }

         new StringBuffer().append("PaySMS.getProfilesRegions: Auto-detected: ").append(d == -1 ? "NONE" : var12[d][0]);
         return var12;
      } else {
         return null;
      }
   }

   private static String e(String var0) {
      RecordStore var1 = null;
      String var2 = null;

      try {
         byte[] var3;
         if ((var1 = RecordStore.openRecordStore(var0, true)).getNumRecords() >= 1 && (var3 = var1.getRecord(1)) != null) {
            var2 = new String(var3);
         }
      } catch (Exception var5) {
         new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(var0).append(" ").append(var5.toString());
      }

      try {
         var1.closeRecordStore();
      } catch (Exception var4) {
         new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(var0).append(" ").append(var4.toString());
      }

      return var2;
   }

   public static void a(String var0, String var1) {
      RecordStore var2 = null;

      try {
         var2 = RecordStore.openRecordStore(var0, true);
         byte[] var5 = var1.getBytes();
         if (var2.getNumRecords() >= 1) {
            var2.setRecord(1, var5, 0, var5.length);
         } else {
            var2.addRecord(var5, 0, var5.length);
         }
      } catch (Exception var3) {
         new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(var3.toString());
      }

      if (var2 != null) {
         try {
            var2.closeRecordStore();
            return;
         } catch (Exception var4) {
            new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(var4.toString());
         }
      }
   }

   private static boolean h() {
      String var0;
      return (var0 = e(a[0])) != null && var0.equals("1");
   }

   private static boolean i() {
      String var0;
      return (var0 = e(a[4])) != null && var0.equals("1");
   }

   private static String i() {
      String var0;
      return (var0 = e(a[1])) != null ? var0 : "";
   }

   private static long c() {
      try {
         String var0;
         if ((var0 = e(a[11])) != null) {
            return Long.parseLong(var0);
         }
      } catch (Exception var1) {
      }

      return 1L;
   }

   public static String b() {
      String var0;
      return (var0 = e(a[5])) != null ? var0 : "";
   }

   private static boolean j() {
      String var0;
      if ((var0 = e(a[3])) != null && var0.length() != 0) {
         Vector var1 = new Vector();
         int var2 = 0;

         for (int var3 = var0.indexOf(";"); var3 != -1; var3 = var0.indexOf(";", var2)) {
            String var4 = var0.substring(var2, var3);
            var1.addElement(new Integer(Integer.parseInt(var4)));
            var2 = var3 + 1;
         }

         a = var1;
         return true;
      } else {
         return false;
      }
   }

   private static void b(Vector var0) {
      Object var1 = "";

      for (int var2 = 0; var2 < var0.size(); var2++) {
         var1 = var1 + var0.elementAt(var2) + ";";
      }

      new StringBuffer().append("PaySMS.storeProfileID: ").append((String)var1);
      a(a[3], String.valueOf(var1));
   }

   private static String j() {
      int var0 = Math.abs(new Random().nextInt() % 9999);

      while (var0 < 1000) {
         if (var0 < 1000) {
            var0 += 1000;
         }
      }

      return String.valueOf(var0);
   }

   private static boolean b(String var0) {
      return var0 == null || var0.length() == 0 || var0.equals("null");
   }

   private static boolean a(String var0, String var1) {
      if (!b(var0) && !b(var1)) {
         int var2 = var1.length();

         for (int var3 = 0; var3 <= var0.length() - var2; var3++) {
            if (b(var0.substring(var3, var3 + var2), var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String[] a(String[] var0) {
      Vector var1 = new Vector();

      for (int var2 = 0; var2 < var0.length; var2++) {
         boolean var3 = false;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var0[var2].equals(var0[var4])) {
               var3 = true;
               break;
            }
         }

         if (!var3) {
            var1.addElement(var0[var2]);
         }
      }

      String[] var5 = new String[var1.size()];
      var1.copyInto(var5);
      return var5;
   }

   public static int d() {
      if (a == null || a.size() <= 0) {
         return 0;
      }

      if (f() != 0) {
         return 8;
      }

      try {
         int var0 = (Integer)a.elementAt(0);
         String var1 = a[var0][0];
         new StringBuffer().append("profileID : ").append(var1);

         for (int var2 = 0; var2 < f.length; var2++) {
            if (var1 != null && var1.equals(f[var2])) {
               new StringBuffer().append("PaySMS. Found valid the Turkey profile: ").append(a[var0][0]);
               return 3;
            }
         }

         for (int var4 = 0; var4 < g.length; var4++) {
            if (var1 != null && var1.equals(g[var4])) {
               new StringBuffer().append("PaySMS. Found valid the FR Open Market profile: ").append(a[var0][0]);
               return 6;
            }
         }

         for (int var5 = 0; var5 < h.length; var5++) {
            if (var1 != null && var1.equals(h[var5])) {
               new StringBuffer().append("PaySMS. Found valid the Indonesia Telkomsel profile: ").append(a[var0][0]);
               return 11;
            }
         }

         String var6;
         if ((var6 = a[var0][2]) == null) {
            return 8;
         }

         var6 = var6.substring(var6.indexOf(40) + 1, var6.lastIndexOf(58)).trim();
         new StringBuffer().append("PaySMS. Country code ").append(var6);
         if (a[var0][6].equals("SMS")) {
            if (var6.equals("49:DE")) {
               return 2;
            }

            if (var6.equals("45:DK")) {
               return 4;
            }

            if (var6.equals("43:AT")) {
               return 5;
            }

            if (var6.equals("91:IN")) {
               return 7;
            }

            if (var6.equals("34:ES")) {
               return 0;
            }

            if (var6.equals("44:GB")) {
               return 10;
            }

            if (var6.equals("58:VE")) {
               return 12;
            }
         }

         if (var6.equals("34:ES") && a[var0][6].equals("HTTP")) {
            return 9;
         }
      } catch (Exception var3) {
         new StringBuffer().append("PaySMS. GetSpecialFlow,  Exception: ").append(var3);
      }

      return 8;
   }

   public static int a(int var0) {
      if (d() == 6) {
         if (a == null) {
            return 0;
         }

         for (int var1 = 0; var1 < a.size(); var1++) {
            int var2 = (Integer)a.elementAt(var1);

            try {
               if (Integer.parseInt(a[var2][14]) == var0) {
                  long var3 = a(a[var2][9]);
                  new StringBuffer().append("Fixed price : ").append(a[var2][9]);
                  if (var3 > 500000L) {
                     new StringBuffer().append("Found Price greater than 5 Euros : ").append(a[var2][9]);
                     return 1;
                  }
                  break;
               }
            } catch (Exception var5) {
            }
         }
      }

      return 0;
   }

   public static String c() {
      try {
         String var0;
         if ((var0 = f.a.getAppProperty("URL-SUPPORT")) == null) {
            return null;
         } else {
            String var1;
            if ((var1 = e(a[7])) != null && !var1.equals("")) {
               String var2 = var1.substring(0, var1.indexOf(95));
               var1 = var1.substring(var1.indexOf(95) + 1);
               byte[] var5 = f.a(var2.getBytes(), "a8bc1a23a89", true);
               return var0 + "&extra_1=" + f.a(var5) + "&extra_2=" + var1;
            } else {
               return var0;
            }
         }
      } catch (Exception var3) {
         return null;
      }
   }

   private static long a(String var0) {
      int var1;
      if ((var1 = (var0 = var0.replace(',', '.')).indexOf(a)) == -1) {
         return b(var0) * 100000L;
      }

      long var2 = b(var0.substring(0, var1)) * 100000L;
      var0 = var0.substring(var1 + 1);

      while (var0.length() < "100000".length() - 1) {
         var0 = var0 + "0";
      }

      return var2 + b(var0);
   }

   private static int b(String var0) {
      try {
         return Integer.parseInt(var0);
      } catch (Exception var1) {
         return -1;
      }
   }

   private static boolean b(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return var0.toUpperCase().equals(var1.toUpperCase());
      }

      new StringBuffer().append("PaySMS.equalsIgnoreCase: s1 = '").append(var0).append("', s2 = '").append(var1).append("'");
      return false;
   }

   static {
      int[] var10000 = new int[]{25, 50, 100, 150};
   }
}
