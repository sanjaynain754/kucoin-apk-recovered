package yb0;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: yb0.o */
/* JADX INFO: compiled from: DatabaseWorker.java */
/* JADX INFO: loaded from: classes59.dex */
public class C46447o {

    /* JADX INFO: renamed from: a */
    public final String f104162a;

    /* JADX INFO: renamed from: b */
    public final int f104163b;

    /* JADX INFO: renamed from: c */
    public HandlerThread f104164c;

    /* JADX INFO: renamed from: d */
    public Handler f104165d;

    /* JADX INFO: renamed from: e */
    public Runnable f104166e;

    /* JADX INFO: renamed from: f */
    public C46445m f104167f;

    /* JADX INFO: renamed from: e */
    public synchronized void m102488e() {
        HandlerThread handlerThread = this.f104164c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f104164c = null;
            this.f104165d = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m102489f(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f104162a, this.f104163b);
        this.f104164c = handlerThread;
        handlerThread.start();
        this.f104165d = new Handler(this.f104164c.getLooper());
        this.f104166e = runnable;
    }

    /* JADX INFO: renamed from: b */
    public boolean m102485b() {
        C46445m c46445m = this.f104167f;
        return c46445m != null && c46445m.m102483b();
    }

    /* JADX INFO: renamed from: c */
    public Integer m102486c() {
        C46445m c46445m = this.f104167f;
        if (c46445m != null) {
            return c46445m.m102482a();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m102487d(final C46445m c46445m) {
        this.f104165d.post(new Runnable() { // from class: yb0.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f104160b.m102490g(c46445m);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void m102490g(C46445m c46445m) {
        c46445m.f104159b.run();
        this.f104167f = c46445m;
        this.f104166e.run();
    }

    public C46447o(String str, int i11) {
        this.f104162a = str;
        this.f104163b = i11;
    }
}
