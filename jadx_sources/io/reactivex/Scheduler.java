package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.internal.schedulers.SchedulerWhen;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Scheduler {
    static final long CLOCK_DRIFT_TOLERANCE_NANOSECONDS = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: loaded from: classes60.dex */
    public static final class DisposeTask implements Disposable, Runnable, SchedulerRunnableIntrospection {

        @NonNull
        final Runnable decoratedRun;

        @Nullable
        Thread runner;

        /* JADX INFO: renamed from: w */
        @NonNull
        final Worker f87111w;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.runner == Thread.currentThread()) {
                Worker worker = this.f87111w;
                if (worker instanceof NewThreadWorker) {
                    ((NewThreadWorker) worker).shutdown();
                    return;
                }
            }
            this.f87111w.dispose();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public Runnable getWrappedRunnable() {
            return this.decoratedRun;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f87111w.isDisposed();
        }

        public DisposeTask(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.decoratedRun = runnable;
            this.f87111w = worker;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.runner = Thread.currentThread();
            try {
                this.decoratedRun.run();
            } finally {
                dispose();
                this.runner = null;
            }
        }
    }

    public static final class PeriodicDirectTask implements Disposable, Runnable, SchedulerRunnableIntrospection {
        volatile boolean disposed;

        @NonNull
        final Runnable run;

        @NonNull
        final Worker worker;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.worker.dispose();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public Runnable getWrappedRunnable() {
            return this.run;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.disposed) {
                return;
            }
            try {
                this.run.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.worker.dispose();
                throw ExceptionHelper.wrapOrThrow(th2);
            }
        }

        public PeriodicDirectTask(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.run = runnable;
            this.worker = worker;
        }
    }

    public static abstract class Worker implements Disposable {

        public final class PeriodicTask implements Runnable, SchedulerRunnableIntrospection {
            long count;

            @NonNull
            final Runnable decoratedRun;
            long lastNowNanoseconds;
            final long periodInNanoseconds;

            /* JADX INFO: renamed from: sd */
            @NonNull
            final SequentialDisposable f87112sd;
            long startInNanoseconds;

            public PeriodicTask(@NonNull long j11, Runnable runnable, @NonNull long j12, SequentialDisposable sequentialDisposable, long j13) {
                this.decoratedRun = runnable;
                this.f87112sd = sequentialDisposable;
                this.periodInNanoseconds = j13;
                this.lastNowNanoseconds = j12;
                this.startInNanoseconds = j11;
            }

            @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
            public Runnable getWrappedRunnable() {
                return this.decoratedRun;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j11;
                this.decoratedRun.run();
                if (this.f87112sd.isDisposed()) {
                    return;
                }
                Worker worker = Worker.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jNow = worker.now(timeUnit);
                long j12 = Scheduler.CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
                long j13 = jNow + j12;
                long j14 = this.lastNowNanoseconds;
                if (j13 >= j14) {
                    long j15 = this.periodInNanoseconds;
                    if (jNow >= j14 + j15 + j12) {
                        long j16 = this.periodInNanoseconds;
                        long j17 = jNow + j16;
                        long j18 = this.count + 1;
                        this.count = j18;
                        this.startInNanoseconds = j17 - (j16 * j18);
                        j11 = j17;
                    } else {
                        long j19 = this.startInNanoseconds;
                        long j21 = this.count + 1;
                        this.count = j21;
                        j11 = j19 + (j21 * j15);
                    }
                } else {
                    long j110 = this.periodInNanoseconds;
                    long j111 = jNow + j110;
                    long j112 = this.count + 1;
                    this.count = j112;
                    this.startInNanoseconds = j111 - (j110 * j112);
                    j11 = j111;
                }
                this.lastNowNanoseconds = jNow;
                this.f87112sd.replace(Worker.this.schedule(this, j11 - jNow, timeUnit));
            }
        }

        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            return schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @NonNull
        public abstract Disposable schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit);

        @NonNull
        public Disposable schedulePeriodically(@NonNull Runnable runnable, long j11, long j12, @NonNull TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j12);
            long jNow = now(TimeUnit.NANOSECONDS);
            Disposable disposableSchedule = schedule(new PeriodicTask(jNow + timeUnit.toNanos(j11), runnableOnSchedule, jNow, sequentialDisposable2, nanos), j11, timeUnit);
            if (disposableSchedule == EmptyDisposable.INSTANCE) {
                return disposableSchedule;
            }
            sequentialDisposable.replace(disposableSchedule);
            return sequentialDisposable2;
        }

        public long now(@NonNull TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    @NonNull
    public abstract Worker createWorker();

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        return scheduleDirect(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public static long clockDriftTolerance() {
        return CLOCK_DRIFT_TOLERANCE_NANOSECONDS;
    }

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
        Worker workerCreateWorker = createWorker();
        DisposeTask disposeTask = new DisposeTask(RxJavaPlugins.onSchedule(runnable), workerCreateWorker);
        workerCreateWorker.schedule(disposeTask, j11, timeUnit);
        return disposeTask;
    }

    @NonNull
    public <S extends Scheduler & Disposable> S when(@NonNull Function<Flowable<Flowable<Completable>>, Completable> function) {
        return new SchedulerWhen(function, this);
    }

    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j11, long j12, @NonNull TimeUnit timeUnit) {
        Worker workerCreateWorker = createWorker();
        PeriodicDirectTask periodicDirectTask = new PeriodicDirectTask(RxJavaPlugins.onSchedule(runnable), workerCreateWorker);
        Disposable disposableSchedulePeriodically = workerCreateWorker.schedulePeriodically(periodicDirectTask, j11, j12, timeUnit);
        if (disposableSchedulePeriodically == EmptyDisposable.INSTANCE) {
            return disposableSchedulePeriodically;
        }
        return periodicDirectTask;
    }

    public void shutdown() {
    }

    public void start() {
    }
}
