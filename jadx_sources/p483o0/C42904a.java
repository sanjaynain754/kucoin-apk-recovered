package p483o0;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o0.a */
/* JADX INFO: compiled from: AndroidExecutors.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C42904a {

    /* JADX INFO: renamed from: b */
    public static final C42904a f94981b = new C42904a();

    /* JADX INFO: renamed from: c */
    public static final int f94982c;

    /* JADX INFO: renamed from: d */
    public static final int f94983d;

    /* JADX INFO: renamed from: e */
    public static final int f94984e;

    /* JADX INFO: renamed from: a */
    public final Executor f94985a = new b();

    /* JADX INFO: renamed from: o0.a$b */
    /* JADX INFO: compiled from: AndroidExecutors.java */
    public static class b implements Executor {
        public b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f94982c = iAvailableProcessors;
        f94983d = iAvailableProcessors + 1;
        f94984e = (iAvailableProcessors * 2) + 1;
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorService m94085b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f94983d, f94984e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        m94084a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: c */
    public static Executor m94086c() {
        return f94981b.f94985a;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static void m94084a(ThreadPoolExecutor threadPoolExecutor, boolean z11) {
        threadPoolExecutor.allowCoreThreadTimeOut(z11);
    }
}
