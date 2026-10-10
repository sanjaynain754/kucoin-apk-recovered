package com.sensorsdata.analytics.android.sdk.util;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes59.dex */
public class ThreadUtils {
    private static final String TAG = "SA.ThreadUtils";
    private static final Map<Integer, Map<Integer, ExecutorService>> TYPE_PRIORITY_POOLS = new HashMap();
    private static final byte TYPE_SINGLE = -1;

    public static final class LinkedBlockingQueueUtil extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile ThreadPoolExecutorUtil mPool;

        public LinkedBlockingQueueUtil() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }

        public LinkedBlockingQueueUtil(boolean z11) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z11) {
                this.mCapacity = 0;
            }
        }

        public LinkedBlockingQueueUtil(int i11) {
            this.mCapacity = i11;
        }
    }

    public static final class ThreadPoolExecutorUtil extends ThreadPoolExecutor {
        private final AtomicInteger mSubmittedCount;
        private LinkedBlockingQueueUtil mWorkQueue;

        /* JADX INFO: Access modifiers changed from: private */
        public static ExecutorService createPool(int i11, int i12) {
            if (i11 == -1) {
                return new ThreadPoolExecutorUtil(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueueUtil(), new UtilsThreadFactory("single", i12));
            }
            return new ThreadPoolExecutorUtil(i11, i11, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueueUtil(), new UtilsThreadFactory("fixed(" + i11 + ")", i12));
        }

        private int getSubmittedCount() {
            return this.mSubmittedCount.get();
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th2) {
            this.mSubmittedCount.decrementAndGet();
            super.afterExecute(runnable, th2);
        }

        public ThreadPoolExecutorUtil(int i11, int i12, long j11, TimeUnit timeUnit, LinkedBlockingQueueUtil linkedBlockingQueueUtil, ThreadFactory threadFactory) {
            super(i11, i12, j11, timeUnit, linkedBlockingQueueUtil, threadFactory);
            this.mSubmittedCount = new AtomicInteger();
            linkedBlockingQueueUtil.mPool = this;
            this.mWorkQueue = linkedBlockingQueueUtil;
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (!isShutdown()) {
                this.mSubmittedCount.incrementAndGet();
                try {
                    super.execute(runnable);
                } catch (RejectedExecutionException unused) {
                    SALog.m68589i(ThreadUtils.TAG, "This will not happen!");
                    this.mWorkQueue.offer(runnable);
                } catch (Throwable unused2) {
                    this.mSubmittedCount.decrementAndGet();
                }
            }
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {
        private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        public UtilsThreadFactory(String str, int i11) {
            this(str, i11, false);
        }

        public UtilsThreadFactory(String str, int i11, boolean z11) {
            this.namePrefix = str + "-pool-" + POOL_NUMBER.getAndIncrement() + "-thread-";
            this.priority = i11;
            this.isDaemon = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.namePrefix + getAndIncrement()) { // from class: com.sensorsdata.analytics.android.sdk.util.ThreadUtils.UtilsThreadFactory.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        super.run();
                    } catch (Throwable unused) {
                        SALog.m68589i("ThreadUtils", "Request threw uncaught throwable");
                    }
                }
            };
            thread.setDaemon(this.isDaemon);
            thread.setPriority(this.priority);
            return thread;
        }
    }

    private static ExecutorService getPoolByTypeAndPriority(int i11) {
        return getPoolByTypeAndPriority(i11, 5);
    }

    public static ExecutorService getSinglePool() {
        return getPoolByTypeAndPriority(-1);
    }

    private static ExecutorService getPoolByTypeAndPriority(int i11, int i12) {
        ExecutorService executorServiceCreatePool;
        Map<Integer, Map<Integer, ExecutorService>> map = TYPE_PRIORITY_POOLS;
        synchronized (map) {
            try {
                Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i11));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorServiceCreatePool = ThreadPoolExecutorUtil.createPool(i11, i12);
                    concurrentHashMap.put(Integer.valueOf(i12), executorServiceCreatePool);
                    map.put(Integer.valueOf(i11), concurrentHashMap);
                } else {
                    executorServiceCreatePool = map2.get(Integer.valueOf(i12));
                    if (executorServiceCreatePool == null) {
                        executorServiceCreatePool = ThreadPoolExecutorUtil.createPool(i11, i12);
                        map2.put(Integer.valueOf(i12), executorServiceCreatePool);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorServiceCreatePool;
    }

    public static ExecutorService getSinglePool(int i11) {
        return getPoolByTypeAndPriority(-1, i11);
    }
}
