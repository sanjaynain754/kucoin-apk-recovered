package p462n4;

import android.os.Looper;

/* JADX INFO: renamed from: n4.a */
/* JADX INFO: compiled from: DeferredReleaser.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC42743a {

    /* JADX INFO: renamed from: a */
    public static AbstractC42743a f94689a;

    /* JADX INFO: renamed from: n4.a$a */
    /* JADX INFO: compiled from: DeferredReleaser.java */
    public interface a {
        void release();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo93664a(a aVar);

    /* JADX INFO: renamed from: d */
    public abstract void mo93665d(a aVar);

    /* JADX INFO: renamed from: b */
    public static synchronized AbstractC42743a m93662b() {
        try {
            if (f94689a == null) {
                f94689a = new C42744b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f94689a;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m93663c() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
