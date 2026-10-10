package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {
    private static final Runnable DONE;
    private static final int MAX_BUSY_WAIT_SPINS = 1000;
    private static final Runnable PARKED;

    @VisibleForTesting
    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        private Blocker(InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }

        public String toString() {
            return this.task.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOwner(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        @VisibleForTesting
        public Thread getOwner() {
            return super.getExclusiveOwnerThread();
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public abstract void afterRanInterruptiblyFailure(Throwable th2);

    public abstract void afterRanInterruptiblySuccess(@ParametricNullness T t11);

    public abstract boolean isDone();

    @ParametricNullness
    public abstract T runInterruptibly() throws Exception;

    public abstract String toPendingString();

    static {
        DONE = new DoNothingRunnable();
        PARKED = new DoNothingRunnable();
    }

    private void waitForInterrupt(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            boolean z12 = runnable instanceof Blocker;
            if (!z12 && runnable != PARKED) {
                break;
            }
            if (z12) {
                blocker = (Blocker) runnable;
            }
            i11++;
            if (i11 > 1000) {
                Runnable runnable2 = PARKED;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z11) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z11) {
            thread.interrupt();
        }
    }

    public final void interruptTask() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.setOwner(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(DONE) == PARKED) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objRunInterruptibly = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zIsDone = isDone();
            if (!zIsDone) {
                try {
                    objRunInterruptibly = runInterruptibly();
                } catch (Throwable th2) {
                    try {
                        Platform.restoreInterruptIfIsInterruptedException(th2);
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            afterRanInterruptiblyFailure(th2);
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, DONE)) {
                            waitForInterrupt(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            afterRanInterruptiblySuccess(NullnessCasts.uncheckedCastNullableTToT(null));
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, DONE)) {
                waitForInterrupt(threadCurrentThread);
            }
            if (!zIsDone) {
                afterRanInterruptiblySuccess(NullnessCasts.uncheckedCastNullableTToT(objRunInterruptibly));
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == DONE) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + toPendingString();
    }

    public static final class DoNothingRunnable implements Runnable {
        private DoNothingRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
