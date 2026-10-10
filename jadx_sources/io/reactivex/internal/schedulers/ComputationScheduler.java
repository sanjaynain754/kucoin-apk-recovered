package io.reactivex.internal.schedulers;

import androidx.camera.view.C1454t;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {
    private static final String KEY_COMPUTATION_PRIORITY = "rx2.computation-priority";
    static final String KEY_MAX_THREADS = "rx2.computation-threads";
    static final int MAX_THREADS = cap(Runtime.getRuntime().availableProcessors(), Integer.getInteger(KEY_MAX_THREADS, 0).intValue());
    static final FixedSchedulerPool NONE;
    static final PoolWorker SHUTDOWN_WORKER;
    static final RxThreadFactory THREAD_FACTORY;
    private static final String THREAD_NAME_PREFIX = "RxComputationThreadPool";
    final AtomicReference<FixedSchedulerPool> pool;
    final ThreadFactory threadFactory;

    /* JADX INFO: loaded from: classes60.dex */
    public static final class EventLoopWorker extends Scheduler.Worker {
        private final ListCompositeDisposable both;
        volatile boolean disposed;
        private final PoolWorker poolWorker;
        private final ListCompositeDisposable serial;
        private final CompositeDisposable timed;

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            return this.disposed ? EmptyDisposable.INSTANCE : this.poolWorker.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.serial);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.both.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        public EventLoopWorker(PoolWorker poolWorker) {
            this.poolWorker = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.serial = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.timed = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.both = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j11, @NonNull TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            return this.poolWorker.scheduleActual(runnable, j11, timeUnit, this.timed);
        }
    }

    public static final class FixedSchedulerPool implements SchedulerMultiWorkerSupport {
        final int cores;
        final PoolWorker[] eventLoops;

        /* JADX INFO: renamed from: n */
        long f87200n;

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public void createWorkers(int i11, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i12 = this.cores;
            if (i12 == 0) {
                for (int i13 = 0; i13 < i11; i13++) {
                    workerCallback.onWorker(i13, ComputationScheduler.SHUTDOWN_WORKER);
                }
                return;
            }
            int i14 = ((int) this.f87200n) % i12;
            for (int i15 = 0; i15 < i11; i15++) {
                workerCallback.onWorker(i15, new EventLoopWorker(this.eventLoops[i14]));
                i14++;
                if (i14 == i12) {
                    i14 = 0;
                }
            }
            this.f87200n = i14;
        }

        public PoolWorker getEventLoop() {
            int i11 = this.cores;
            if (i11 == 0) {
                return ComputationScheduler.SHUTDOWN_WORKER;
            }
            PoolWorker[] poolWorkerArr = this.eventLoops;
            long j11 = this.f87200n;
            this.f87200n = 1 + j11;
            return poolWorkerArr[(int) (j11 % ((long) i11))];
        }

        public void shutdown() {
            for (PoolWorker poolWorker : this.eventLoops) {
                poolWorker.dispose();
            }
        }

        public FixedSchedulerPool(int i11, ThreadFactory threadFactory) {
            this.cores = i11;
            this.eventLoops = new PoolWorker[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                this.eventLoops[i12] = new PoolWorker(threadFactory);
            }
        }
    }

    public ComputationScheduler() {
        this(THREAD_FACTORY);
    }

    public static final class PoolWorker extends NewThreadWorker {
        public PoolWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
        this.pool = new AtomicReference<>(NONE);
        start();
    }

    public static int cap(int i11, int i12) {
        return (i12 <= 0 || i12 > i11) ? i11 : i12;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new EventLoopWorker(this.pool.get().getEventLoop());
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j11, TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().scheduleDirect(runnable, j11, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().schedulePeriodicallyDirect(runnable, j11, j12, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        FixedSchedulerPool fixedSchedulerPool;
        FixedSchedulerPool fixedSchedulerPool2;
        do {
            fixedSchedulerPool = this.pool.get();
            fixedSchedulerPool2 = NONE;
            if (fixedSchedulerPool == fixedSchedulerPool2) {
                return;
            }
        } while (!C1454t.m2255a(this.pool, fixedSchedulerPool, fixedSchedulerPool2));
        fixedSchedulerPool.shutdown();
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(MAX_THREADS, this.threadFactory);
        if (C1454t.m2255a(this.pool, NONE, fixedSchedulerPool)) {
            return;
        }
        fixedSchedulerPool.shutdown();
    }

    static {
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        SHUTDOWN_WORKER = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory(THREAD_NAME_PREFIX, Math.max(1, Math.min(10, Integer.getInteger(KEY_COMPUTATION_PRIORITY, 5).intValue())), true);
        THREAD_FACTORY = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        NONE = fixedSchedulerPool;
        fixedSchedulerPool.shutdown();
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i11, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        ObjectHelper.verifyPositive(i11, "number > 0 required");
        this.pool.get().createWorkers(i11, workerCallback);
    }
}
