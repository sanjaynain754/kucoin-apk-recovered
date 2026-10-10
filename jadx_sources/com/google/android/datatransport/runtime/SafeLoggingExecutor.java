package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class SafeLoggingExecutor implements Executor {
    private final Executor delegate;

    public static class SafeLoggingRunnable implements Runnable {
        private final Runnable delegate;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.delegate.run();
            } catch (Exception e11) {
                Logging.m12821e("Executor", "Background execution failure.", e11);
            }
        }

        public SafeLoggingRunnable(Runnable runnable) {
            this.delegate = runnable;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(new SafeLoggingRunnable(runnable));
    }

    public SafeLoggingExecutor(Executor executor) {
        this.delegate = executor;
    }
}
