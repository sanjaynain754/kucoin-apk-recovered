package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes60.dex */
public final class TestScheduler extends Scheduler {
    long counter;
    final Queue<TimedRunnable> queue = new PriorityBlockingQueue(11);
    volatile long time;

    public final class TestWorker extends Scheduler.Worker {
        volatile boolean disposed;

        public final class QueueRemove implements Runnable {
            final TimedRunnable timedAction;

            public QueueRemove(TimedRunnable timedRunnable) {
                this.timedAction = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestScheduler.this.queue.remove(this.timedAction);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = TestScheduler.this.time + timeUnit.toNanos(j11);
            TestScheduler testScheduler = TestScheduler.this;
            long j12 = testScheduler.counter;
            testScheduler.counter = 1 + j12;
            TimedRunnable timedRunnable = new TimedRunnable(this, nanos, runnable, j12);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }

        public TestWorker() {
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(@NonNull TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j11 = testScheduler.counter;
            testScheduler.counter = 1 + j11;
            TimedRunnable timedRunnable = new TimedRunnable(this, 0L, runnable, j11);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }
    }

    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        final long count;
        final Runnable run;
        final TestWorker scheduler;
        final long time;

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            long j11 = this.time;
            long j12 = timedRunnable.time;
            return j11 == j12 ? ObjectHelper.compare(this.count, timedRunnable.count) : ObjectHelper.compare(j11, j12);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.time), this.run.toString());
        }

        public TimedRunnable(TestWorker testWorker, long j11, Runnable runnable, long j12) {
            this.time = j11;
            this.run = runnable;
            this.scheduler = testWorker;
            this.count = j12;
        }
    }

    public TestScheduler() {
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    private void triggerActions(long j11) {
        while (true) {
            TimedRunnable timedRunnablePeek = this.queue.peek();
            if (timedRunnablePeek == null) {
                break;
            }
            long j12 = timedRunnablePeek.time;
            if (j12 > j11) {
                break;
            }
            if (j12 == 0) {
                j12 = this.time;
            }
            this.time = j12;
            this.queue.remove(timedRunnablePeek);
            if (!timedRunnablePeek.scheduler.disposed) {
                timedRunnablePeek.run.run();
            }
        }
        this.time = j11;
    }

    public void advanceTimeBy(long j11, TimeUnit timeUnit) {
        advanceTimeTo(this.time + timeUnit.toNanos(j11), TimeUnit.NANOSECONDS);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new TestWorker();
    }

    @Override // io.reactivex.Scheduler
    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, TimeUnit.NANOSECONDS);
    }

    public TestScheduler(long j11, TimeUnit timeUnit) {
        this.time = timeUnit.toNanos(j11);
    }

    public void advanceTimeTo(long j11, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j11));
    }
}
