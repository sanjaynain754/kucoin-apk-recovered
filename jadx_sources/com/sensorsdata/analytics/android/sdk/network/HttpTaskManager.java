package com.sensorsdata.analytics.android.sdk.network;

import com.sensorsdata.analytics.android.sdk.ThreadNameConstants;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
class HttpTaskManager {
    private static final int POOL_SIZE = 2;
    private static volatile ExecutorService executor;

    public static class ThreadFactoryWithName implements ThreadFactory {
        private final String name;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.name);
        }

        public ThreadFactoryWithName(String str) {
            this.name = str;
        }
    }

    private static ExecutorService getInstance() {
        if (executor == null) {
            synchronized (HttpTaskManager.class) {
                try {
                    if (executor == null) {
                        executor = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryWithName(ThreadNameConstants.THREAD_DEEP_LINK_REQUEST));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return executor;
    }

    private HttpTaskManager() {
    }

    public static void execute(Runnable runnable) {
        getInstance().execute(runnable);
    }
}
