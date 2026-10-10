package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes23.dex */
public class NewThreadWorker extends Scheduler.Worker implements Disposable {
    volatile boolean disposed;
    private final ScheduledExecutorService executor;

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.executor.shutdownNow();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public boolean getDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
        return this.disposed ? EmptyDisposable.INSTANCE : scheduleActual(runnable, j11, timeUnit, null);
    }

    public Disposable scheduleDirect(Runnable runnable, long j11, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        try {
            scheduledDirectTask.setFuture(j11 <= 0 ? this.executor.submit(scheduledDirectTask) : this.executor.schedule(scheduledDirectTask, j11, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e11) {
            RxJavaPlugins.onError(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void shutdown() {
        if (this.disposed) {
            return;
        }
        this.disposed = true;
        this.executor.shutdown();
    }

    public NewThreadWorker(ThreadFactory threadFactory) {
        this.executor = SchedulerPoolFactory.create(threadFactory);
    }

    @NonNull
    public ScheduledRunnable scheduleActual(Runnable runnable, long j11, @NonNull TimeUnit timeUnit, @Nullable DisposableContainer disposableContainer) {
        Future<?> futureSchedule;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), disposableContainer);
        if (disposableContainer == null || disposableContainer.add(scheduledRunnable)) {
            try {
                if (j11 <= 0) {
                    futureSchedule = this.executor.submit((Callable) scheduledRunnable);
                } else {
                    futureSchedule = this.executor.schedule((Callable) scheduledRunnable, j11, timeUnit);
                }
                scheduledRunnable.setFuture(futureSchedule);
                return scheduledRunnable;
            } catch (RejectedExecutionException e11) {
                if (disposableContainer != null) {
                    disposableContainer.remove(scheduledRunnable);
                }
                RxJavaPlugins.onError(e11);
            }
        }
        return scheduledRunnable;
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j12 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(runnableOnSchedule, this.executor);
            try {
                if (j11 <= 0) {
                    futureSchedule = this.executor.submit(instantPeriodicTask);
                } else {
                    futureSchedule = this.executor.schedule(instantPeriodicTask, j11, timeUnit);
                }
                instantPeriodicTask.setFirst(futureSchedule);
                return instantPeriodicTask;
            } catch (RejectedExecutionException e11) {
                RxJavaPlugins.onError(e11);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableOnSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.executor.scheduleAtFixedRate(scheduledDirectPeriodicTask, j11, j12, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e12) {
            RxJavaPlugins.onError(e12);
            return EmptyDisposable.INSTANCE;
        }
    }
}
