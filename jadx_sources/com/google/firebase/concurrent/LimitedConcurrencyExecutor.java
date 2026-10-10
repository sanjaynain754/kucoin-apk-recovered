package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes56.dex */
class LimitedConcurrencyExecutor implements Executor {
    private final Executor delegate;
    private final LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
    private final Semaphore semaphore;

    private Runnable decorate(final Runnable runnable) {
        return new Runnable() { // from class: com.google.firebase.concurrent.w
            @Override // java.lang.Runnable
            public final void run() {
                LimitedConcurrencyExecutor.m13743a(this.f12513b, runnable);
            }
        };
    }

    private void maybeEnqueueNext() {
        while (this.semaphore.tryAcquire()) {
            Runnable runnablePoll = this.queue.poll();
            if (runnablePoll == null) {
                this.semaphore.release();
                return;
            }
            this.delegate.execute(decorate(runnablePoll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.queue.offer(runnable);
        maybeEnqueueNext();
    }

    public LimitedConcurrencyExecutor(Executor executor, int i11) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "concurrency must be positive.");
        this.delegate = executor;
        this.semaphore = new Semaphore(i11, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13743a(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable) {
        limitedConcurrencyExecutor.getClass();
        try {
            runnable.run();
        } finally {
            limitedConcurrencyExecutor.semaphore.release();
            limitedConcurrencyExecutor.maybeEnqueueNext();
        }
    }
}
