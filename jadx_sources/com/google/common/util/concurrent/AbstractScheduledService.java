package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.tencent.bugly.proguard.C33627eb;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractScheduledService implements Service {
    private static final LazyLogger logger = new LazyLogger(AbstractScheduledService.class);
    private final AbstractService delegate = new ServiceDelegate();

    public interface Cancellable {
        void cancel(boolean z11);

        boolean isCancelled();
    }

    public static abstract class CustomScheduler extends Scheduler {

        public final class ReschedulableCallable implements Callable<Void> {

            @GuardedBy("lock")
            private SupplantableFuture cancellationDelegate;
            private final ScheduledExecutorService executor;
            private final ReentrantLock lock = new ReentrantLock();
            private final AbstractService service;
            private final Runnable wrappedRunnable;

            public ReschedulableCallable(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.wrappedRunnable = runnable;
                this.executor = scheduledExecutorService;
                this.service = abstractService;
            }

            @GuardedBy("lock")
            private Cancellable initializeOrUpdateCancellationDelegate(Schedule schedule) {
                SupplantableFuture supplantableFuture = this.cancellationDelegate;
                if (supplantableFuture == null) {
                    SupplantableFuture supplantableFuture2 = new SupplantableFuture(this.lock, submitToExecutor(schedule));
                    this.cancellationDelegate = supplantableFuture2;
                    return supplantableFuture2;
                }
                if (!supplantableFuture.currentFuture.isCancelled()) {
                    this.cancellationDelegate.currentFuture = submitToExecutor(schedule);
                }
                return this.cancellationDelegate;
            }

            private ScheduledFuture<Void> submitToExecutor(Schedule schedule) {
                return this.executor.schedule(this, schedule.delay, schedule.unit);
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                this.wrappedRunnable.run();
                reschedule();
                return null;
            }

            @CanIgnoreReturnValue
            public Cancellable reschedule() throws Exception {
                Cancellable futureAsCancellable;
                try {
                    Schedule nextSchedule = CustomScheduler.this.getNextSchedule();
                    this.lock.lock();
                    try {
                        futureAsCancellable = initializeOrUpdateCancellationDelegate(nextSchedule);
                        this.lock.unlock();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            futureAsCancellable = new FutureAsCancellable(Futures.immediateCancelledFuture());
                            this.lock.unlock();
                        } catch (Throwable th3) {
                            this.lock.unlock();
                            throw th3;
                        }
                    }
                    if (th != null) {
                        this.service.notifyFailed(th);
                    }
                    return futureAsCancellable;
                } catch (Throwable th4) {
                    Platform.restoreInterruptIfIsInterruptedException(th4);
                    this.service.notifyFailed(th4);
                    return new FutureAsCancellable(Futures.immediateCancelledFuture());
                }
            }
        }

        public static final class Schedule {
            private final long delay;
            private final TimeUnit unit;

            public Schedule(long j11, TimeUnit timeUnit) {
                this.delay = j11;
                this.unit = (TimeUnit) Preconditions.checkNotNull(timeUnit);
            }
        }

        public static final class SupplantableFuture implements Cancellable {

            @GuardedBy("lock")
            private Future<Void> currentFuture;
            private final ReentrantLock lock;

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public void cancel(boolean z11) {
                this.lock.lock();
                try {
                    this.currentFuture.cancel(z11);
                } finally {
                    this.lock.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
            public boolean isCancelled() {
                this.lock.lock();
                try {
                    return this.currentFuture.isCancelled();
                } finally {
                    this.lock.unlock();
                }
            }

            public SupplantableFuture(ReentrantLock reentrantLock, Future<Void> future) {
                this.lock = reentrantLock;
                this.currentFuture = future;
            }
        }

        public CustomScheduler() {
            super();
        }

        public abstract Schedule getNextSchedule() throws Exception;

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
        public final Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new ReschedulableCallable(abstractService, scheduledExecutorService, runnable).reschedule();
        }
    }

    public static final class FutureAsCancellable implements Cancellable {
        private final Future<?> delegate;

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public void cancel(boolean z11) {
            this.delegate.cancel(z11);
        }

        @Override // com.google.common.util.concurrent.AbstractScheduledService.Cancellable
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        public FutureAsCancellable(Future<?> future) {
            this.delegate = future;
        }
    }

    public static abstract class Scheduler {
        public abstract Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        private Scheduler() {
        }

        public static Scheduler newFixedDelaySchedule(final long j11, final long j12, final TimeUnit timeUnit) {
            boolean z11;
            Preconditions.checkNotNull(timeUnit);
            if (j12 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "delay must be > 0, found %s", j12);
            return new Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                    return new FutureAsCancellable(scheduledExecutorService.scheduleWithFixedDelay(runnable, j11, j12, timeUnit));
                }
            };
        }

        public static Scheduler newFixedRateSchedule(final long j11, final long j12, final TimeUnit timeUnit) {
            boolean z11;
            Preconditions.checkNotNull(timeUnit);
            if (j12 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Preconditions.checkArgument(z11, "period must be > 0, found %s", j12);
            return new Scheduler() { // from class: com.google.common.util.concurrent.AbstractScheduledService.Scheduler.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.google.common.util.concurrent.AbstractScheduledService.Scheduler
                public Cancellable schedule(AbstractService abstractService, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                    return new FutureAsCancellable(scheduledExecutorService.scheduleAtFixedRate(runnable, j11, j12, timeUnit));
                }
            };
        }
    }

    public final class ServiceDelegate extends AbstractService {
        private volatile ScheduledExecutorService executorService;
        private final ReentrantLock lock;
        private volatile Cancellable runningTask;
        private final Runnable task;

        public class Task implements Runnable {
            public Task() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ServiceDelegate.this.lock.lock();
                try {
                    Cancellable cancellable = ServiceDelegate.this.runningTask;
                    Objects.requireNonNull(cancellable);
                    if (!cancellable.isCancelled()) {
                        AbstractScheduledService.this.runOneIteration();
                    }
                    ServiceDelegate.this.lock.unlock();
                } catch (Throwable th2) {
                    try {
                        Platform.restoreInterruptIfIsInterruptedException(th2);
                        try {
                            AbstractScheduledService.this.shutDown();
                        } catch (Exception e11) {
                            Platform.restoreInterruptIfIsInterruptedException(e11);
                            AbstractScheduledService.logger.get().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e11);
                        }
                        ServiceDelegate.this.notifyFailed(th2);
                        Cancellable cancellable2 = ServiceDelegate.this.runningTask;
                        Objects.requireNonNull(cancellable2);
                        cancellable2.cancel(false);
                        ServiceDelegate.this.lock.unlock();
                    } catch (Throwable th3) {
                        ServiceDelegate.this.lock.unlock();
                        throw th3;
                    }
                }
            }
        }

        private ServiceDelegate() {
            this.lock = new ReentrantLock();
            this.task = new Task();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ String m13672a(ServiceDelegate serviceDelegate) {
            return AbstractScheduledService.this.serviceName() + C33627eb.f69716f + serviceDelegate.state();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m13673b(ServiceDelegate serviceDelegate) {
            serviceDelegate.lock.lock();
            try {
                AbstractScheduledService.this.startUp();
                Objects.requireNonNull(serviceDelegate.executorService);
                serviceDelegate.runningTask = AbstractScheduledService.this.scheduler().schedule(AbstractScheduledService.this.delegate, serviceDelegate.executorService, serviceDelegate.task);
                serviceDelegate.notifyStarted();
                serviceDelegate.lock.unlock();
            } catch (Throwable th2) {
                try {
                    Platform.restoreInterruptIfIsInterruptedException(th2);
                    serviceDelegate.notifyFailed(th2);
                    if (serviceDelegate.runningTask != null) {
                        serviceDelegate.runningTask.cancel(false);
                    }
                } finally {
                    serviceDelegate.lock.unlock();
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            this.executorService = MoreExecutors.renamingDecorator(AbstractScheduledService.this.executor(), (Supplier<String>) new Supplier() { // from class: com.google.common.util.concurrent.g
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AbstractScheduledService.ServiceDelegate.m13672a(this.f12420b);
                }
            });
            this.executorService.execute(new Runnable() { // from class: com.google.common.util.concurrent.h
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractScheduledService.ServiceDelegate.m13673b(this.f12422b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            Objects.requireNonNull(this.runningTask);
            Objects.requireNonNull(this.executorService);
            this.runningTask.cancel(false);
            this.executorService.execute(new Runnable() { // from class: com.google.common.util.concurrent.i
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractScheduledService.ServiceDelegate.m13674c(this.f12423b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractScheduledService.this.toString();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m13674c(ServiceDelegate serviceDelegate) throws Exception {
            serviceDelegate.getClass();
            try {
                serviceDelegate.lock.lock();
                try {
                    if (serviceDelegate.state() != Service.State.STOPPING) {
                        serviceDelegate.lock.unlock();
                        return;
                    }
                    AbstractScheduledService.this.shutDown();
                    serviceDelegate.lock.unlock();
                    serviceDelegate.notifyStopped();
                } catch (Throwable th2) {
                    serviceDelegate.lock.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                Platform.restoreInterruptIfIsInterruptedException(th3);
                serviceDelegate.notifyFailed(th3);
            }
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning() {
        this.delegate.awaitRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated() {
        this.delegate.awaitTerminated();
    }

    public abstract void runOneIteration() throws Exception;

    public abstract Scheduler scheduler();

    @Override // com.google.common.util.concurrent.Service
    public final void addListener(Service.Listener listener, Executor executor) {
        this.delegate.addListener(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitRunning(long j11, TimeUnit timeUnit) throws TimeoutException {
        this.delegate.awaitRunning(j11, timeUnit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void awaitTerminated(long j11, TimeUnit timeUnit) throws TimeoutException {
        this.delegate.awaitTerminated(j11, timeUnit);
    }

    public ScheduledExecutorService executor() {
        final ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: com.google.common.util.concurrent.AbstractScheduledService.1ThreadFactoryImpl
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return MoreExecutors.newThread(AbstractScheduledService.this.serviceName(), runnable);
            }
        });
        addListener(new Service.Listener(this) { // from class: com.google.common.util.concurrent.AbstractScheduledService.1
            final /* synthetic */ AbstractScheduledService this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void failed(Service.State state, Throwable th2) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }

            @Override // com.google.common.util.concurrent.Service.Listener
            public void terminated(Service.State state) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.shutdown();
            }
        }, MoreExecutors.directExecutor());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable failureCause() {
        return this.delegate.failureCause();
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.delegate.isRunning();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service startAsync() throws Exception {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() throws Exception {
        this.delegate.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public void shutDown() throws Exception {
    }

    public void startUp() throws Exception {
    }
}
