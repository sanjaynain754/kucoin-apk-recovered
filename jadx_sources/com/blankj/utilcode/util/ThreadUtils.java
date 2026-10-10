package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.tencent.bugly.proguard.C33864ph;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class ThreadUtils {

    /* JADX INFO: renamed from: a */
    public static final Handler f6473a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    public static final Map<Integer, Map<Integer, ExecutorService>> f6474b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final Map<Object, ExecutorService> f6475c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final int f6476d = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: e */
    public static final Timer f6477e = new Timer();

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile C5257a mPool;

        public LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(@NonNull Runnable runnable) {
            if (runnable == null) {
                throw new NullPointerException("Argument 'runnable' of type Runnable (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueue4Util(boolean z11) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z11) {
                this.mCapacity = 0;
            }
        }

        public LinkedBlockingQueue4Util(int i11) {
            this.mCapacity = i11;
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        public static final AtomicInteger f6478b = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        /* JADX INFO: renamed from: com.blankj.utilcode.util.ThreadUtils$UtilsThreadFactory$a */
        public class C5255a extends Thread {
            public C5255a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable th2) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th2);
                }
            }
        }

        /* JADX INFO: renamed from: com.blankj.utilcode.util.ThreadUtils$UtilsThreadFactory$b */
        public class C5256b implements Thread.UncaughtExceptionHandler {
            public C5256b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                System.out.println(th2);
            }
        }

        public UtilsThreadFactory(String str, int i11) {
            this(str, i11, false);
        }

        public UtilsThreadFactory(String str, int i11, boolean z11) {
            this.namePrefix = str + "-pool-" + f6478b.getAndIncrement() + "-thread-";
            this.priority = i11;
            this.isDaemon = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            if (runnable == null) {
                throw new NullPointerException("Argument 'r' of type Runnable (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            C5255a c5255a = new C5255a(runnable, this.namePrefix + getAndIncrement());
            c5255a.setDaemon(this.isDaemon);
            c5255a.setUncaughtExceptionHandler(new C5256b());
            c5255a.setPriority(this.priority);
            return c5255a;
        }
    }

    /* JADX INFO: renamed from: com.blankj.utilcode.util.ThreadUtils$a */
    public static final class C5257a extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f6481b;

        /* JADX INFO: renamed from: c */
        public LinkedBlockingQueue4Util f6482c;

        /* JADX INFO: renamed from: b */
        public static ExecutorService m6117b(int i11, int i12) {
            if (i11 == -8) {
                return new C5257a(ThreadUtils.f6476d + 1, (ThreadUtils.f6476d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i12));
            }
            if (i11 == -4) {
                return new C5257a((ThreadUtils.f6476d * 2) + 1, (ThreadUtils.f6476d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i12));
            }
            if (i11 == -2) {
                return new C5257a(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory(C33864ph.f71458d, i12));
            }
            if (i11 == -1) {
                return new C5257a(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("single", i12));
            }
            return new C5257a(i11, i11, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i11 + ")", i12));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th2) {
            this.f6481b.decrementAndGet();
            super.afterExecute(runnable, th2);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (runnable == null) {
                throw new NullPointerException("Argument 'command' of type Runnable (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
            }
            if (isShutdown()) {
                return;
            }
            this.f6481b.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f6482c.offer(runnable);
            } catch (Throwable unused2) {
                this.f6481b.decrementAndGet();
            }
        }

        public C5257a(int i11, int i12, long j11, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i11, i12, j11, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f6481b = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.f6482c = linkedBlockingQueue4Util;
        }
    }

    /* JADX INFO: renamed from: b */
    public static ExecutorService m6109b() {
        return m6111d(-2);
    }

    /* JADX INFO: renamed from: d */
    public static ExecutorService m6111d(int i11) {
        return m6112e(i11, 5);
    }

    /* JADX INFO: renamed from: c */
    public static Handler m6110c() {
        return f6473a;
    }

    /* JADX INFO: renamed from: e */
    public static ExecutorService m6112e(int i11, int i12) {
        ExecutorService executorServiceM6117b;
        Map<Integer, Map<Integer, ExecutorService>> map = f6474b;
        synchronized (map) {
            try {
                Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i11));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorServiceM6117b = C5257a.m6117b(i11, i12);
                    concurrentHashMap.put(Integer.valueOf(i12), executorServiceM6117b);
                    map.put(Integer.valueOf(i11), concurrentHashMap);
                } else {
                    executorServiceM6117b = map2.get(Integer.valueOf(i12));
                    if (executorServiceM6117b == null) {
                        executorServiceM6117b = C5257a.m6117b(i11, i12);
                        map2.put(Integer.valueOf(i12), executorServiceM6117b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorServiceM6117b;
    }

    /* JADX INFO: renamed from: h */
    public static void m6115h(Runnable runnable, long j11) {
        f6473a.postDelayed(runnable, j11);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6113f() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static void m6114g(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f6473a.post(runnable);
        }
    }
}
