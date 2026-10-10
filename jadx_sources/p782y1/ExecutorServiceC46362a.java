package p782y1;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: compiled from: GlideExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorServiceC46362a implements ExecutorService {

    /* JADX INFO: renamed from: c */
    public static final long f103953c = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: d */
    public static volatile int f103954d;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f103955b;

    /* JADX INFO: renamed from: y1.a$a */
    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final boolean f103956a;

        /* JADX INFO: renamed from: b */
        public int f103957b;

        /* JADX INFO: renamed from: c */
        public int f103958c;

        /* JADX INFO: renamed from: d */
        @NonNull
        public c f103959d = c.f103970d;

        /* JADX INFO: renamed from: e */
        public String f103960e;

        /* JADX INFO: renamed from: f */
        public long f103961f;

        /* JADX INFO: renamed from: a */
        public ExecutorServiceC46362a m102245a() {
            if (TextUtils.isEmpty(this.f103960e)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f103960e);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f103957b, this.f103958c, this.f103961f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f103960e, this.f103959d, this.f103956a));
            if (this.f103961f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC46362a(threadPoolExecutor);
        }

        /* JADX INFO: renamed from: b */
        public a m102246b(String str) {
            this.f103960e = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m102247c(@IntRange(from = 1) int i11) {
            this.f103957b = i11;
            this.f103958c = i11;
            return this;
        }

        public a(boolean z11) {
            this.f103956a = z11;
        }
    }

    /* JADX INFO: renamed from: y1.a$c */
    /* JADX INFO: compiled from: GlideExecutor.java */
    public interface c {

        /* JADX INFO: renamed from: a */
        public static final c f103967a = new a();

        /* JADX INFO: renamed from: b */
        public static final c f103968b;

        /* JADX INFO: renamed from: c */
        public static final c f103969c;

        /* JADX INFO: renamed from: d */
        public static final c f103970d;

        /* JADX INFO: renamed from: y1.a$c$b */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class b implements c {
            @Override // p782y1.ExecutorServiceC46362a.c
            /* JADX INFO: renamed from: a */
            public void mo102248a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* JADX INFO: renamed from: y1.a$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class C47037c implements c {
            @Override // p782y1.ExecutorServiceC46362a.c
            /* JADX INFO: renamed from: a */
            public void mo102248a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        void mo102248a(Throwable th2);

        static {
            b bVar = new b();
            f103968b = bVar;
            f103969c = new C47037c();
            f103970d = bVar;
        }

        /* JADX INFO: renamed from: y1.a$c$a */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class a implements c {
            @Override // p782y1.ExecutorServiceC46362a.c
            /* JADX INFO: renamed from: a */
            public void mo102248a(Throwable th2) {
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f103955b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f103955b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f103955b.submit(runnable);
    }

    /* JADX INFO: renamed from: y1.a$b */
    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        public final String f103962b;

        /* JADX INFO: renamed from: c */
        public final c f103963c;

        /* JADX INFO: renamed from: d */
        public final boolean f103964d;

        /* JADX INFO: renamed from: e */
        public int f103965e;

        /* JADX INFO: renamed from: y1.a$b$a */
        /* JADX INFO: compiled from: GlideExecutor.java */
        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f103964d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th2) {
                    b.this.f103963c.mo102248a(th2);
                }
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(@NonNull Runnable runnable) {
            a aVar;
            aVar = new a(runnable, "glide-" + this.f103962b + "-thread-" + this.f103965e);
            this.f103965e = this.f103965e + 1;
            return aVar;
        }

        public b(String str, c cVar, boolean z11) {
            this.f103962b = str;
            this.f103963c = cVar;
            this.f103964d = z11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m102237a() {
        if (f103954d == 0) {
            f103954d = Math.min(4, C46363b.m102249a());
        }
        return f103954d;
    }

    /* JADX INFO: renamed from: d */
    public static a m102240d() {
        return new a(true).m102247c(1).m102246b("disk-cache");
    }

    /* JADX INFO: renamed from: f */
    public static a m102242f() {
        return new a(false).m102247c(m102237a()).m102246b("source");
    }

    /* JADX INFO: renamed from: h */
    public static ExecutorServiceC46362a m102244h() {
        return new ExecutorServiceC46362a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f103953c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f103970d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f103955b.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f103955b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f103955b.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f103955b.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f103955b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f103955b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f103955b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f103955b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t11) {
        return this.f103955b.submit(runnable, t11);
    }

    public String toString() {
        return this.f103955b.toString();
    }

    @VisibleForTesting
    public ExecutorServiceC46362a(ExecutorService executorService) {
        this.f103955b = executorService;
    }

    /* JADX INFO: renamed from: b */
    public static a m102238b() {
        int i11;
        if (m102237a() >= 4) {
            i11 = 2;
        } else {
            i11 = 1;
        }
        return new a(true).m102247c(i11).m102246b("animation");
    }

    /* JADX INFO: renamed from: c */
    public static ExecutorServiceC46362a m102239c() {
        return m102238b().m102245a();
    }

    /* JADX INFO: renamed from: e */
    public static ExecutorServiceC46362a m102241e() {
        return m102240d().m102245a();
    }

    /* JADX INFO: renamed from: g */
    public static ExecutorServiceC46362a m102243g() {
        return m102242f().m102245a();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f103955b.submit(callable);
    }
}
