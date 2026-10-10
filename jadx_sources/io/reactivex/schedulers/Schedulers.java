package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public final class Schedulers {

    @NonNull
    static final Scheduler SINGLE = RxJavaPlugins.initSingleScheduler(new SingleTask());

    @NonNull
    static final Scheduler COMPUTATION = RxJavaPlugins.initComputationScheduler(new ComputationTask());

    /* JADX INFO: renamed from: IO */
    @NonNull
    static final Scheduler f87224IO = RxJavaPlugins.initIoScheduler(new IOTask());

    @NonNull
    static final Scheduler TRAMPOLINE = TrampolineScheduler.instance();

    @NonNull
    static final Scheduler NEW_THREAD = RxJavaPlugins.initNewThreadScheduler(new NewThreadTask());

    public static final class ComputationHolder {
        static final Scheduler DEFAULT = new ComputationScheduler();
    }

    public static final class ComputationTask implements Callable<Scheduler> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return ComputationHolder.DEFAULT;
        }
    }

    public static final class IOTask implements Callable<Scheduler> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return IoHolder.DEFAULT;
        }
    }

    public static final class IoHolder {
        static final Scheduler DEFAULT = new IoScheduler();
    }

    public static final class NewThreadHolder {
        static final Scheduler DEFAULT = new NewThreadScheduler();
    }

    public static final class NewThreadTask implements Callable<Scheduler> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return NewThreadHolder.DEFAULT;
        }
    }

    public static final class SingleHolder {
        static final Scheduler DEFAULT = new SingleScheduler();
    }

    public static final class SingleTask implements Callable<Scheduler> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return SingleHolder.DEFAULT;
        }
    }

    @NonNull
    public static Scheduler from(@NonNull Executor executor) {
        return new ExecutorScheduler(executor, false);
    }

    @NonNull
    public static Scheduler computation() {
        return RxJavaPlugins.onComputationScheduler(COMPUTATION);
    }

    @Experimental
    @NonNull
    public static Scheduler from(@NonNull Executor executor, boolean z11) {
        return new ExecutorScheduler(executor, z11);
    }

    @NonNull
    /* JADX INFO: renamed from: io */
    public static Scheduler m87969io() {
        return RxJavaPlugins.onIoScheduler(f87224IO);
    }

    @NonNull
    public static Scheduler newThread() {
        return RxJavaPlugins.onNewThreadScheduler(NEW_THREAD);
    }

    @NonNull
    public static Scheduler single() {
        return RxJavaPlugins.onSingleScheduler(SINGLE);
    }

    @NonNull
    public static Scheduler trampoline() {
        return TRAMPOLINE;
    }

    private Schedulers() {
        throw new IllegalStateException("No instances!");
    }

    public static void shutdown() {
        computation().shutdown();
        m87969io().shutdown();
        newThread().shutdown();
        single().shutdown();
        trampoline().shutdown();
        SchedulerPoolFactory.shutdown();
    }

    public static void start() {
        computation().start();
        m87969io().start();
        newThread().start();
        single().start();
        trampoline().start();
        SchedulerPoolFactory.start();
    }
}
