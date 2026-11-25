/*
 * Decompiled with CFR 0.152.
 */
import java.util.TimerTask;

final class h
extends TimerTask {
    h() {
    }

    public final void run() {
        if (!l.b) {
            try {
                l.a = true;
                l.a.close();
                return;
            }
            catch (Exception exception) {
                new StringBuffer().append("PaySMS.buy: Failed to close connection in timer. Exception: ").append(exception.toString());
            }
        }
    }
}

