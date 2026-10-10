package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class ExecutorScheduler extends Scheduler {
    static final Scheduler HELPER = Schedulers.single();

    @NonNull
    final Executor executor;
    final boolean interruptibleWorker;

    public final class DelayedDispose implements Runnable {

        /* JADX INFO: renamed from: dr */
        private final DelayedRunnable f87201dr;

        public DelayedDispose(DelayedRunnable delayedRunnable) {
            this.f87201dr = delayedRunnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            DelayedRunnable delayedRunnable = this.f87201dr;
            delayedRunnable.direct.replace(ExecutorScheduler.this.scheduleDirect(delayedRunnable));
        }
    }

    public static final class ExecutorWorker extends Scheduler.Worker implements Runnable {
        volatile boolean disposed;
        final Executor executor;
        final boolean interruptibleWorker;
        final AtomicInteger wip = new AtomicInteger();
        final CompositeDisposable tasks = new CompositeDisposable();
        final MpscLinkedQueue<Runnable> queue = new MpscLinkedQueue<>();

        /* JADX INFO: loaded from: classes60.dex */
        public static final class InterruptibleRunnable extends AtomicInteger implements Runnable, Disposable {
            static final int FINISHED = 2;
            static final int INTERRUPTED = 4;
            static final int INTERRUPTING = 3;
            static final int READY = 0;
            static final int RUNNING = 1;
            private static final long serialVersionUID = -3603436687413320876L;
            final Runnable run;
            final DisposableContainer tasks;
            volatile Thread thread;

            public void cleanup() {
                DisposableContainer disposableContainer = this.tasks;
                if (disposableContainer != null) {
                    disposableContainer.delete(this);
                }
            }

            public InterruptibleRunnable(Runnable runnable, DisposableContainer disposableContainer) {
                this.run = runnable;
                this.tasks = disposableContainer;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                while (true) {
                    int i11 = get();
                    if (i11 >= 2) {
                        return;
                    }
                    if (i11 == 0) {
                        if (compareAndSet(0, 4)) {
                            cleanup();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.thread;
                        if (thread != null) {
                            thread.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        cleanup();
                        return;
                    }
                }
            }

            @Override // io.reactivex.disposables.Disposable
            /* JADX INFO: renamed from: isDisposed */
            public boolean getDisposed() {
                if (get() >= 2) {
                    return true;
                }
                return false;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            this.thread = null;
                            if (!compareAndSet(1, 2)) {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            } else {
                                cleanup();
                            }
                        }
                    }
                    this.thread = null;
                }
            }
        }

        public final class SequentialDispose implements Runnable {
            private final Runnable decoratedRun;
            private final SequentialDisposable mar;

            public SequentialDispose(SequentialDisposable sequentialDisposable, Runnable runnable) {
                this.mar = sequentialDisposable;
                this.decoratedRun = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.mar.replace(ExecutorWorker.this.schedule(this.decoratedRun));
            }
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            Disposable booleanRunnable;
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            if (this.interruptibleWorker) {
                booleanRunnable = new InterruptibleRunnable(runnableOnSchedule, this.tasks);
                this.tasks.add(booleanRunnable);
            } else {
                booleanRunnable = new BooleanRunnable(runnableOnSchedule);
            }
            this.queue.offer(booleanRunnable);
            if (this.wip.getAndIncrement() != 0) {
                return booleanRunnable;
            }
            try {
                this.executor.execute(this);
                return booleanRunnable;
            } catch (RejectedExecutionException e11) {
                this.disposed = true;
                this.queue.clear();
                RxJavaPlugins.onError(e11);
                return EmptyDisposable.INSTANCE;
            }
        }

        public static final class BooleanRunnable extends AtomicBoolean implements Runnable, Disposable {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                lazySet(true);
            }

            public BooleanRunnable(Runnable runnable) {
                this.actual = runnable;
            }

            @Override // io.reactivex.disposables.Disposable
            /* JADX INFO: renamed from: isDisposed */
            public boolean getDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.actual.run();
                } finally {
                    lazySet(true);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.tasks.dispose();
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // java.lang.Runnable
        public void run() {
            MpscLinkedQueue<Runnable> mpscLinkedQueue = this.queue;
            int iAddAndGet = 1;
            while (!this.disposed) {
                while (true) {
                    Runnable runnablePoll = mpscLinkedQueue.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    runnablePoll.run();
                    if (this.disposed) {
                        mpscLinkedQueue.clear();
                        return;
                    }
                }
                if (this.disposed) {
                    mpscLinkedQueue.clear();
                    return;
                } else {
                    iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            mpscLinkedQueue.clear();
        }

        public ExecutorWorker(Executor executor, boolean z11) {
            this.executor = executor;
            this.interruptibleWorker = z11;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
            if (j11 <= 0) {
                return schedule(runnable);
            }
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(new SequentialDispose(sequentialDisposable2, RxJavaPlugins.onSchedule(runnable)), this.tasks);
            this.tasks.add(scheduledRunnable);
            Executor executor = this.executor;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    scheduledRunnable.setFuture(((ScheduledExecutorService) executor).schedule((Callable) scheduledRunnable, j11, timeUnit));
                } catch (RejectedExecutionException e11) {
                    this.disposed = true;
                    RxJavaPlugins.onError(e11);
                    return EmptyDisposable.INSTANCE;
                }
            } else {
                scheduledRunnable.setFuture(new DisposeOnCancel(ExecutorScheduler.HELPER.scheduleDirect(scheduledRunnable, j11, timeUnit)));
            }
            sequentialDisposable.replace(scheduledRunnable);
            return sequentialDisposable2;
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        try {
            if (this.executor instanceof ExecutorService) {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableOnSchedule);
                scheduledDirectTask.setFuture(((ExecutorService) this.executor).submit(scheduledDirectTask));
                return scheduledDirectTask;
            }
            if (this.interruptibleWorker) {
                ExecutorWorker.InterruptibleRunnable interruptibleRunnable = new ExecutorWorker.InterruptibleRunnable(runnableOnSchedule, null);
                this.executor.execute(interruptibleRunnable);
                return interruptibleRunnable;
            }
            ExecutorWorker.BooleanRunnable booleanRunnable = new ExecutorWorker.BooleanRunnable(runnableOnSchedule);
            this.executor.execute(booleanRunnable);
            return booleanRunnable;
        } catch (RejectedExecutionException e11) {
            RxJavaPlugins.onError(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    public static final class DelayedRunnable extends AtomicReference<Runnable> implements Runnable, Disposable, SchedulerRunnableIntrospection {
        private static final long serialVersionUID = -4101336210206799084L;
        final SequentialDisposable direct;
        final SequentialDisposable timed;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }

        public DelayedRunnable(Runnable runnable) {
            super(runnable);
            this.timed = new SequentialDisposable();
            this.direct = new SequentialDisposable();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public Runnable getWrappedRunnable() {
            Runnable runnable = get();
            if (runnable != null) {
                return runnable;
            }
            return Functions.EMPTY_RUNNABLE;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    SequentialDisposable sequentialDisposable = this.direct;
                } finally {
                    lazySet(null);
                    this.timed.lazySet(DisposableHelper.DISPOSED);
                    this.direct.lazySet(DisposableHelper.DISPOSED);
                }
            }
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new ExecutorWorker(this.executor, this.interruptibleWorker);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        if (!(this.executor instanceof ScheduledExecutorService)) {
            return super.schedulePeriodicallyDirect(runnable, j11, j12, timeUnit);
        }
        try {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(RxJavaPlugins.onSchedule(runnable));
            scheduledDirectPeriodicTask.setFuture(((ScheduledExecutorService) this.executor).scheduleAtFixedRate(scheduledDirectPeriodicTask, j11, j12, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e11) {
            RxJavaPlugins.onError(e11);
            return EmptyDisposable.INSTANCE;
        }
    }

    public ExecutorScheduler(@NonNull Executor executor, boolean z11) {
        this.executor = executor;
        this.interruptibleWorker = z11;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j11, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        if (this.executor instanceof ScheduledExecutorService) {
            try {
                ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnableOnSchedule);
                scheduledDirectTask.setFuture(((ScheduledExecutorService) this.executor).schedule(scheduledDirectTask, j11, timeUnit));
                return scheduledDirectTask;
            } catch (RejectedExecutionException e11) {
                RxJavaPlugins.onError(e11);
                return EmptyDisposable.INSTANCE;
            }
        }
        DelayedRunnable delayedRunnable = new DelayedRunnable(runnableOnSchedule);
        delayedRunnable.timed.replace(HELPER.scheduleDirect(new DelayedDispose(delayedRunnable), j11, timeUnit));
        return delayedRunnable;
    }
}
