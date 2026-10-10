package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class DirectExecutorService extends AbstractListeningExecutorService {
    private final Object lock = new Object();

    @GuardedBy("lock")
    private int runningTasks = 0;

    @GuardedBy("lock")
    private boolean shutdown = false;

    private void endTask() {
        synchronized (this.lock) {
            try {
                int i11 = this.runningTasks - 1;
                this.runningTasks = i11;
                if (i11 == 0) {
                    this.lock.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void startTask() {
        synchronized (this.lock) {
            try {
                if (this.shutdown) {
                    throw new RejectedExecutionException("Executor already shutdown");
                }
                this.runningTasks++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        boolean z11;
        synchronized (this.lock) {
            z11 = this.shutdown;
        }
        return z11;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        boolean z11;
        synchronized (this.lock) {
            try {
                z11 = this.shutdown && this.runningTasks == 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this.lock) {
            try {
                this.shutdown = true;
                if (this.runningTasks == 0) {
                    this.lock.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j11);
        synchronized (this.lock) {
            while (true) {
                try {
                    if (this.shutdown && this.runningTasks == 0) {
                        return true;
                    }
                    if (nanos <= 0) {
                        return false;
                    }
                    long jNanoTime = System.nanoTime();
                    TimeUnit.NANOSECONDS.timedWait(this.lock, nanos);
                    nanos -= System.nanoTime() - jNanoTime;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        startTask();
        try {
            runnable.run();
        } finally {
            endTask();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.EMPTY_LIST;
    }
}
