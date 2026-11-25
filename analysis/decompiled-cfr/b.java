/*
 * Decompiled with CFR 0.152.
 */
import java.util.Timer;
import java.util.TimerTask;
import wfree.C;
import wfree.MessageConnection;

final class b
extends Thread {
    b() {
    }

    public final void run() {
        try {
            Object object = "cbs://";
            if (!l.d().equals("")) {
                object = (String)object + l.d();
            } else {
                if (l.e().equals("1")) {
                    l.a(l.b("IAP-ShortCode-PP" + l.b));
                } else {
                    l.a("");
                }
                if (!l.f().equals("")) {
                    object = (String)object + l.f();
                } else if (l.e() != -1) {
                    object = (String)object + l.a()[l.e()][11];
                } else {
                    l.a(false);
                    l.a(l.a[0], "0");
                    l.c();
                    l.b(-1);
                    return;
                }
            }
            new StringBuffer().append("PaySMS.buy: smsAdress: ").append((String)object);
            l.a = (MessageConnection)C.open((String)object);
            new StringBuffer().append("PaySMS.buy: Connection opened - conn: ").append(l.a);
            object = l.a;
            new StringBuffer().append("PaySMS.buy: TextMessage created - msg: ").append(object);
            l.g();
            try {
                Thread.sleep(200L);
            }
            catch (Exception exception) {
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(exception.toString());
            }
            l.a(new Timer());
            l.a().schedule((TimerTask)new h(), 30000);
            b.nosms$wait();
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
            }
            catch (Exception exception) {
                new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(exception.toString());
            }
        }
        catch (SecurityException securityException) {
            l.a(false);
            l.a(l.a[0], "0");
            l.b(-9);
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Security Exception: ").append(securityException.toString());
        }
        catch (Throwable throwable) {
            l.a(false);
            l.a(l.a[0], "0");
            if (l.a) {
                l.b(-4);
            } else {
                l.b(-1);
            }
            new StringBuffer().append("PaySMS.buy: SMS sent failed! Exception: ").append(throwable.toString());
        }
        try {
            if (l.a != null) {
                l.a.close();
            }
        }
        catch (Exception exception) {
            new StringBuffer().append("PaySMS.buy: Failed to close connection! Exception: ").append(exception.toString());
        }
        l.c();
    }

    private static void nosms$wait() {
        Thread.sleep(500L);
    }
}

