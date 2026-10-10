package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public final class Monitor {

    @GuardedBy("lock")
    private Guard activeGuards;
    private final boolean fair;
    private final ReentrantLock lock;

    public Monitor() {
        this(false);
    }

    @GuardedBy("lock")
    private boolean awaitNanos(Guard guard, long j11, boolean z11) throws InterruptedException {
        boolean z12 = true;
        while (j11 > 0) {
            if (z12) {
                if (z11) {
                    try {
                        signalNextWaiter();
                    } catch (Throwable th2) {
                        if (!z12) {
                            endWaitingFor(guard);
                        }
                        throw th2;
                    }
                }
                beginWaitingFor(guard);
                z12 = false;
            }
            j11 = guard.condition.awaitNanos(j11);
            if (guard.isSatisfied()) {
                if (!z12) {
                    endWaitingFor(guard);
                }
                return true;
            }
        }
        if (!z12) {
            endWaitingFor(guard);
        }
        return false;
    }

    public void enter() {
        this.lock.lock();
    }

    public boolean enterIf(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean enterIfInterruptibly(Guard guard) throws InterruptedException {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lockInterruptibly();
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void enterInterruptibly() throws InterruptedException {
        this.lock.lockInterruptibly();
    }

    public void enterWhen(Guard guard) throws InterruptedException {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lockInterruptibly();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            await(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            leave();
            throw th2;
        }
    }

    public void enterWhenUninterruptibly(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
        reentrantLock.lock();
        try {
            if (guard.isSatisfied()) {
                return;
            }
            awaitUninterruptibly(guard, zIsHeldByCurrentThread);
        } catch (Throwable th2) {
            leave();
            throw th2;
        }
    }

    public void waitFor(Guard guard) throws InterruptedException {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        await(guard, true);
    }

    public void waitForUninterruptibly(Guard guard) {
        if (guard.monitor != this || !this.lock.isHeldByCurrentThread()) {
            throw new IllegalMonitorStateException();
        }
        if (guard.isSatisfied()) {
            return;
        }
        awaitUninterruptibly(guard, true);
    }

    public static abstract class Guard {
        final Condition condition;

        @Weak
        final Monitor monitor;

        @GuardedBy("monitor.lock")
        Guard next;

        @GuardedBy("monitor.lock")
        int waiterCount = 0;

        public abstract boolean isSatisfied();

        public Guard(Monitor monitor) {
            this.monitor = (Monitor) Preconditions.checkNotNull(monitor, "monitor");
            this.condition = monitor.lock.newCondition();
        }
    }

    public Monitor(boolean z11) {
        this.activeGuards = null;
        this.fair = z11;
        this.lock = new ReentrantLock(z11);
    }

    @GuardedBy("lock")
    private void await(Guard guard, boolean z11) throws InterruptedException {
        if (z11) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.await();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    private void awaitUninterruptibly(Guard guard, boolean z11) {
        if (z11) {
            signalNextWaiter();
        }
        beginWaitingFor(guard);
        do {
            try {
                guard.condition.awaitUninterruptibly();
            } finally {
                endWaitingFor(guard);
            }
        } while (!guard.isSatisfied());
    }

    @GuardedBy("lock")
    private void beginWaitingFor(Guard guard) {
        int i11 = guard.waiterCount;
        guard.waiterCount = i11 + 1;
        if (i11 == 0) {
            guard.next = this.activeGuards;
            this.activeGuards = guard;
        }
    }

    @GuardedBy("lock")
    private void endWaitingFor(Guard guard) {
        int i11 = guard.waiterCount - 1;
        guard.waiterCount = i11;
        if (i11 == 0) {
            Guard guard2 = this.activeGuards;
            Guard guard3 = null;
            while (guard2 != guard) {
                guard3 = guard2;
                guard2 = guard2.next;
            }
            if (guard3 == null) {
                this.activeGuards = guard2.next;
            } else {
                guard3.next = guard2.next;
            }
            guard2.next = null;
        }
    }

    private static long initNanoTime(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        long jNanoTime = System.nanoTime();
        if (jNanoTime == 0) {
            return 1L;
        }
        return jNanoTime;
    }

    private static long remainingNanos(long j11, long j12) {
        if (j12 <= 0) {
            return 0L;
        }
        return j12 - (System.nanoTime() - j11);
    }

    @GuardedBy("lock")
    private void signalAllWaiters() {
        for (Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            guard.condition.signalAll();
        }
    }

    @GuardedBy("lock")
    private void signalNextWaiter() {
        for (Guard guard = this.activeGuards; guard != null; guard = guard.next) {
            if (isSatisfied(guard)) {
                guard.condition.signal();
                return;
            }
        }
    }

    public boolean enter(long j11, TimeUnit timeUnit) throws Throwable {
        boolean zTryLock;
        long safeNanos = toSafeNanos(j11, timeUnit);
        ReentrantLock reentrantLock = this.lock;
        boolean z11 = true;
        if (!this.fair && reentrantLock.tryLock()) {
            return true;
        }
        boolean zInterrupted = Thread.interrupted();
        try {
            long jNanoTime = System.nanoTime();
            long jRemainingNanos = safeNanos;
            while (true) {
                try {
                    try {
                        zTryLock = reentrantLock.tryLock(jRemainingNanos, TimeUnit.NANOSECONDS);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    jRemainingNanos = remainingNanos(jNanoTime, safeNanos);
                    zInterrupted = true;
                }
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (Throwable th3) {
            th = th3;
            z11 = zInterrupted;
        }
    }

    public boolean enterInterruptibly(long j11, TimeUnit timeUnit) throws InterruptedException {
        return this.lock.tryLock(j11, timeUnit);
    }

    public int getOccupiedDepth() {
        return this.lock.getHoldCount();
    }

    public int getQueueLength() {
        return this.lock.getQueueLength();
    }

    public int getWaitQueueLength(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        this.lock.lock();
        try {
            return guard.waiterCount;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean hasQueuedThread(Thread thread) {
        return this.lock.hasQueuedThread(thread);
    }

    public boolean hasQueuedThreads() {
        return this.lock.hasQueuedThreads();
    }

    public boolean isFair() {
        return this.fair;
    }

    public boolean isOccupied() {
        return this.lock.isLocked();
    }

    public boolean isOccupiedByCurrentThread() {
        return this.lock.isHeldByCurrentThread();
    }

    public void leave() {
        ReentrantLock reentrantLock = this.lock;
        try {
            if (reentrantLock.getHoldCount() == 1) {
                signalNextWaiter();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean tryEnter() {
        return this.lock.tryLock();
    }

    public boolean tryEnterIf(Guard guard) {
        if (guard.monitor != this) {
            throw new IllegalMonitorStateException();
        }
        ReentrantLock reentrantLock = this.lock;
        if (!reentrantLock.tryLock()) {
            return false;
        }
        try {
            boolean zIsSatisfied = guard.isSatisfied();
            if (!zIsSatisfied) {
                reentrantLock.unlock();
            }
            return zIsSatisfied;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @GuardedBy("lock")
    private boolean isSatisfied(Guard guard) {
        try {
            return guard.isSatisfied();
        } catch (Throwable th2) {
            signalAllWaiters();
            throw th2;
        }
    }

    private static long toSafeNanos(long j11, TimeUnit timeUnit) {
        return Longs.constrainToRange(timeUnit.toNanos(j11), 0L, 6917529027641081853L);
    }

    public boolean hasWaiters(Guard guard) {
        if (getWaitQueueLength(guard) > 0) {
            return true;
        }
        return false;
    }

    public boolean waitFor(Guard guard, long j11, TimeUnit timeUnit) throws InterruptedException {
        long safeNanos = toSafeNanos(j11, timeUnit);
        if (guard.monitor == this && this.lock.isHeldByCurrentThread()) {
            if (guard.isSatisfied()) {
                return true;
            }
            if (!Thread.interrupted()) {
                return awaitNanos(guard, safeNanos, true);
            }
            throw new InterruptedException();
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    public boolean waitForUninterruptibly(Guard guard, long j11, TimeUnit timeUnit) throws Throwable {
        long safeNanos = toSafeNanos(j11, timeUnit);
        if (guard.monitor == this && this.lock.isHeldByCurrentThread()) {
            boolean z11 = true;
            if (guard.isSatisfied()) {
                return true;
            }
            long jInitNanoTime = initNanoTime(safeNanos);
            boolean zInterrupted = Thread.interrupted();
            long jRemainingNanos = safeNanos;
            boolean z12 = true;
            while (true) {
                try {
                    try {
                        boolean zAwaitNanos = awaitNanos(guard, jRemainingNanos, z12);
                        if (zInterrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return zAwaitNanos;
                    } catch (Throwable th2) {
                        th = th2;
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedException unused) {
                    if (guard.isSatisfied()) {
                        Thread.currentThread().interrupt();
                        return true;
                    }
                    jRemainingNanos = remainingNanos(jInitNanoTime, safeNanos);
                    z12 = false;
                    zInterrupted = true;
                } catch (Throwable th3) {
                    th = th3;
                    z11 = zInterrupted;
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }

    public boolean enterIf(Guard guard, long j11, TimeUnit timeUnit) {
        if (guard.monitor == this) {
            if (!enter(j11, timeUnit)) {
                return false;
            }
            try {
                boolean zIsSatisfied = guard.isSatisfied();
                if (!zIsSatisfied) {
                    this.lock.unlock();
                }
                return zIsSatisfied;
            } catch (Throwable th2) {
                this.lock.unlock();
                throw th2;
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterIfInterruptibly(Guard guard, long j11, TimeUnit timeUnit) throws InterruptedException {
        if (guard.monitor == this) {
            ReentrantLock reentrantLock = this.lock;
            if (!reentrantLock.tryLock(j11, timeUnit)) {
                return false;
            }
            try {
                boolean zIsSatisfied = guard.isSatisfied();
                if (!zIsSatisfied) {
                    reentrantLock.unlock();
                }
                return zIsSatisfied;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        throw new IllegalMonitorStateException();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    public boolean enterWhen(Guard guard, long j11, TimeUnit timeUnit) throws InterruptedException {
        long jInitNanoTime;
        boolean z11;
        long safeNanos = toSafeNanos(j11, timeUnit);
        if (guard.monitor == this) {
            ReentrantLock reentrantLock = this.lock;
            boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            if (!this.fair) {
                if (!Thread.interrupted()) {
                    if (reentrantLock.tryLock()) {
                        jInitNanoTime = 0;
                    } else {
                        jInitNanoTime = initNanoTime(safeNanos);
                        if (!reentrantLock.tryLock(j11, timeUnit)) {
                            return false;
                        }
                    }
                } else {
                    throw new InterruptedException();
                }
            } else {
                jInitNanoTime = initNanoTime(safeNanos);
                if (!reentrantLock.tryLock(j11, timeUnit)) {
                    return false;
                }
            }
            try {
                if (!guard.isSatisfied()) {
                    if (jInitNanoTime != 0) {
                        safeNanos = remainingNanos(jInitNanoTime, safeNanos);
                    }
                    z11 = awaitNanos(guard, safeNanos, zIsHeldByCurrentThread);
                }
                if (!z11) {
                    reentrantLock.unlock();
                }
                return z11;
            } catch (Throwable th2) {
                if (!zIsHeldByCurrentThread) {
                    try {
                        signalNextWaiter();
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                throw th2;
            }
        }
        throw new IllegalMonitorStateException();
    }

    public boolean enterWhenUninterruptibly(Guard guard, long j11, TimeUnit timeUnit) throws Throwable {
        long jInitNanoTime;
        long jRemainingNanos;
        long safeNanos = toSafeNanos(j11, timeUnit);
        if (guard.monitor == this) {
            ReentrantLock reentrantLock = this.lock;
            boolean zIsHeldByCurrentThread = reentrantLock.isHeldByCurrentThread();
            boolean zInterrupted = Thread.interrupted();
            try {
                boolean zAwaitNanos = true;
                if (this.fair || !reentrantLock.tryLock()) {
                    jInitNanoTime = initNanoTime(safeNanos);
                    long jRemainingNanos2 = safeNanos;
                    while (true) {
                        try {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                                zInterrupted = true;
                                if (zInterrupted) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        } catch (InterruptedException unused) {
                            jRemainingNanos2 = remainingNanos(jInitNanoTime, safeNanos);
                            zInterrupted = true;
                        }
                    }
                    if (!reentrantLock.tryLock(jRemainingNanos2, TimeUnit.NANOSECONDS)) {
                        if (zInterrupted) {
                            Thread.currentThread().interrupt();
                        }
                        return false;
                    }
                } else {
                    jInitNanoTime = 0;
                }
                while (!guard.isSatisfied()) {
                    try {
                        if (jInitNanoTime == 0) {
                            jInitNanoTime = initNanoTime(safeNanos);
                            jRemainingNanos = safeNanos;
                        } else {
                            jRemainingNanos = remainingNanos(jInitNanoTime, safeNanos);
                        }
                        zAwaitNanos = awaitNanos(guard, jRemainingNanos, zIsHeldByCurrentThread);
                    } catch (InterruptedException unused2) {
                        zIsHeldByCurrentThread = false;
                        zInterrupted = zAwaitNanos;
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
                if (!zAwaitNanos) {
                    reentrantLock.unlock();
                }
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                return zAwaitNanos;
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            throw new IllegalMonitorStateException();
        }
    }
}
