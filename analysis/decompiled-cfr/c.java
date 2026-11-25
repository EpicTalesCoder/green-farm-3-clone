/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.HttpConnection
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.HttpConnection;
import wfree.C;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class c
implements Runnable {
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

    public c(boolean bl) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final synchronized void a() {
        if (!this.c) {
            this.c = true;
            if (this.a != null) {
                HttpConnection httpConnection;
                if (this.a != null) {
                    try {
                        httpConnection = this.a;
                        synchronized (httpConnection) {
                            this.a.close();
                        }
                    }
                    catch (Exception exception) {}
                }
                if (this.a != null) {
                    try {
                        httpConnection = this.a;
                        synchronized (httpConnection) {
                            this.a.close();
                        }
                    }
                    catch (Exception exception) {}
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(String string, String string2) {
        c c2;
        System.gc();
        while (this.a) {
            try {
                c2 = this;
                synchronized (c2) {
                    this.wait(50L);
                }
            }
            catch (Exception exception) {
            }
        }
        c2 = this;
        c2.a();
        c2.b = false;
        c2.a = null;
        this.a = true;
        this.c = false;
        this.b = string + string2;
        this.b = false;
        this.a = new Thread(this);
        this.a.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        if (this.b == null) {
            this.a();
            this.b = true;
            this.a = false;
            return;
        }
        try {
            this.b = false;
            if (this.c) {
                this.a = false;
                return;
            }
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
                return;
            }
            if (this.c) {
                this.a = false;
                return;
            }
            Object object = this.a;
            synchronized (object) {
                this.a = this.a.openInputStream();
            }
            Thread.yield();
            object = new ByteArrayOutputStream();
            byte[] byArray = new byte[256];
            int n = 0;
            while (n != -1) {
                if (this.c) {
                    this.a = false;
                    return;
                }
                for (n = 0; n < 256; ++n) {
                    byArray[n] = 0;
                }
                if (this.a.read(byArray, 0, 256) == -1) break;
                for (n = 255; n >= 0 && byArray[n] == 0; --n) {
                }
                ((ByteArrayOutputStream)object).write(byArray, 0, ++n);
            }
            this.a = ((ByteArrayOutputStream)object).toString();
            ((ByteArrayOutputStream)object).toByteArray();
            return;
        }
        catch (Exception exception) {
            this.b = true;
            this.a = false;
            return;
        }
        finally {
            this.a();
        }
    }

    public final String toString() {
        return null + ": " + this.b;
    }
}

