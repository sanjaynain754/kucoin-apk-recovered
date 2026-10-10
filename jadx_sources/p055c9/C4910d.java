package p055c9;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: c9.d */
/* JADX INFO: compiled from: CameraThread.java */
/* JADX INFO: loaded from: classes56.dex */
public class C4910d {

    /* JADX INFO: renamed from: e */
    public static C4910d f5442e;

    /* JADX INFO: renamed from: a */
    public Handler f5443a;

    /* JADX INFO: renamed from: b */
    public HandlerThread f5444b;

    /* JADX INFO: renamed from: c */
    public int f5445c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f5446d = new Object();

    /* JADX INFO: renamed from: d */
    public static C4910d m5126d() {
        if (f5442e == null) {
            f5442e = new C4910d();
        }
        return f5442e;
    }

    /* JADX INFO: renamed from: a */
    public final void m5127a() {
        synchronized (this.f5446d) {
            try {
                if (this.f5443a == null) {
                    if (this.f5445c <= 0) {
                        throw new IllegalStateException("CameraThread is not open");
                    }
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f5444b = handlerThread;
                    handlerThread.start();
                    this.f5443a = new Handler(this.f5444b.getLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5128b() {
        synchronized (this.f5446d) {
            try {
                int i11 = this.f5445c - 1;
                this.f5445c = i11;
                if (i11 == 0) {
                    m5131f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m5129c(Runnable runnable) {
        synchronized (this.f5446d) {
            m5127a();
            this.f5443a.post(runnable);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5130e(Runnable runnable) {
        synchronized (this.f5446d) {
            this.f5445c++;
            m5129c(runnable);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5131f() {
        synchronized (this.f5446d) {
            this.f5444b.quit();
            this.f5444b = null;
            this.f5443a = null;
        }
    }
}
