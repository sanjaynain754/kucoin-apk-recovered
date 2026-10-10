package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes23.dex */
public final class TrampolineScheduler extends Scheduler {
    private static final TrampolineScheduler INSTANCE = new TrampolineScheduler();

    /* JADX INFO: loaded from: classes60.dex */
    public static final class SleepingRunnable implements Runnable {
        private final long execTime;
        private final Runnable run;
        private final TrampolineWorker worker;

        @Override // java.lang.Runnable
        public void run() {
            if (this.worker.disposed) {
                return;
            }
            long jNow = this.worker.now(TimeUnit.MILLISECONDS);
            long j11 = this.execTime;
            if (j11 > jNow) {
                try {
                    Thread.sleep(j11 - jNow);
                } catch (InterruptedException e11) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.onError(e11);
                    return;
                }
            }
            if (this.worker.disposed) {
                return;
            }
            this.run.run();
        }

        public SleepingRunnable(Runnable runnable, TrampolineWorker trampolineWorker, long j11) {
            this.run = runnable;
            this.worker = trampolineWorker;
            this.execTime = j11;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        final int count;
        volatile boolean disposed;
        final long execTime;
        final Runnable run;

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            int iCompare = ObjectHelper.compare(this.execTime, timedRunnable.execTime);
            return iCompare == 0 ? ObjectHelper.compare(this.count, timedRunnable.count) : iCompare;
        }

        public TimedRunnable(Runnable runnable, Long l11, int i11) {
            this.run = runnable;
            this.execTime = l11.longValue();
            this.count = i11;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static final class TrampolineWorker extends Scheduler.Worker implements Disposable {
        volatile boolean disposed;
        final PriorityBlockingQueue<TimedRunnable> queue = new PriorityBlockingQueue<>();
        private final AtomicInteger wip = new AtomicInteger();
        final AtomicInteger counter = new AtomicInteger();

        public final class AppendToQueueTask implements Runnable {
            final TimedRunnable timedRunnable;

            public AppendToQueueTask(TimedRunnable timedRunnable) {
                this.timedRunnable = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.timedRunnable.disposed = true;
                TrampolineWorker.this.queue.remove(this.timedRunnable);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            return enqueue(runnable, now(TimeUnit.MILLISECONDS));
        }

        public Disposable enqueue(Runnable runnable, long j11) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            TimedRunnable timedRunnable = new TimedRunnable(runnable, Long.valueOf(j11), this.counter.incrementAndGet());
            this.queue.add(timedRunnable);
            if (this.wip.getAndIncrement() != 0) {
                return Disposables.fromRunnable(new AppendToQueueTask(timedRunnable));
            }
            int iAddAndGet = 1;
            while (!this.disposed) {
                TimedRunnable timedRunnablePoll = this.queue.poll();
                if (timedRunnablePoll == null) {
                    iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!timedRunnablePoll.disposed) {
                    timedRunnablePoll.run.run();
                }
            }
            this.queue.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
            long jNow = now(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j11);
            return enqueue(new SleepingRunnable(runnable, this, jNow), jNow);
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    public static TrampolineScheduler instance() {
        return INSTANCE;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new TrampolineWorker();
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j11, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j11);
            RxJavaPlugins.onSchedule(runnable).run();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(e11);
        }
        return EmptyDisposable.INSTANCE;
    }
}
