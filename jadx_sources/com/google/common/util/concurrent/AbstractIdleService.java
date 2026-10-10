package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tencent.bugly.proguard.C33627eb;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractIdleService implements Service {
    private final Service delegate;
    private final Supplier<String> threadNameSupplier;

    public final class DelegateService extends AbstractService {
        private DelegateService() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.renamingDecorator(AbstractIdleService.this.executor(), (Supplier<String>) AbstractIdleService.this.threadNameSupplier).execute(new Runnable() { // from class: com.google.common.util.concurrent.f
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractIdleService.DelegateService.m13671b(this.f12419b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStop() {
            MoreExecutors.renamingDecorator(AbstractIdleService.this.executor(), (Supplier<String>) AbstractIdleService.this.threadNameSupplier).execute(new Runnable() { // from class: com.google.common.util.concurrent.e
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractIdleService.DelegateService.m13670a(this.f12418b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractIdleService.this.toString();
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m13670a(DelegateService delegateService) throws Exception {
            delegateService.getClass();
            try {
                AbstractIdleService.this.shutDown();
                delegateService.notifyStopped();
            } catch (Throwable th2) {
                Platform.restoreInterruptIfIsInterruptedException(th2);
                delegateService.notifyFailed(th2);
            }
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m13671b(DelegateService delegateService) throws Exception {
            delegateService.getClass();
            try {
                AbstractIdleService.this.startUp();
                delegateService.notifyStarted();
            } catch (Throwable th2) {
                Platform.restoreInterruptIfIsInterruptedException(th2);
                delegateService.notifyFailed(th2);
            }
        }
    }

    public final class ThreadNameSupplier implements Supplier<String> {
        private ThreadNameSupplier() {
        }

        @Override // com.google.common.base.Supplier
        public String get() {
            return AbstractIdleService.this.serviceName() + C33627eb.f69716f + AbstractIdleService.this.state();
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

    public abstract void shutDown() throws Exception;

    public abstract void startUp() throws Exception;

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

    public Executor executor() {
        return new Executor() { // from class: com.google.common.util.concurrent.d
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                MoreExecutors.newThread(this.f12417b.threadNameSupplier.get(), runnable).start();
            }
        };
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
    public final Service startAsync() {
        this.delegate.startAsync();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State state() {
        return this.delegate.state();
    }

    @Override // com.google.common.util.concurrent.Service
    @CanIgnoreReturnValue
    public final Service stopAsync() {
        this.delegate.stopAsync();
        return this;
    }

    public String toString() {
        return serviceName() + " [" + state() + "]";
    }

    public AbstractIdleService() {
        this.threadNameSupplier = new ThreadNameSupplier();
        this.delegate = new DelegateService();
    }

    public String serviceName() {
        return getClass().getSimpleName();
    }
}
