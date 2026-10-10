package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Supplier;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractExecutionThreadService implements Service {
    private static final LazyLogger logger = new LazyLogger(AbstractExecutionThreadService.class);
    private final Service delegate = new C85111();

    /* JADX INFO: renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1 */
    public class C85111 extends AbstractService {
        public C85111() {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public final void doStart() {
            MoreExecutors.renamingDecorator(AbstractExecutionThreadService.this.executor(), (Supplier<String>) new Supplier() { // from class: com.google.common.util.concurrent.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AbstractExecutionThreadService.this.serviceName();
                }
            }).execute(new Runnable() { // from class: com.google.common.util.concurrent.c
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    AbstractExecutionThreadService.C85111.m13668b(this.f12415b);
                }
            });
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public void doStop() {
            AbstractExecutionThreadService.this.triggerShutdown();
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m13668b(C85111 c85111) throws Exception {
            c85111.getClass();
            try {
                AbstractExecutionThreadService.this.startUp();
                c85111.notifyStarted();
                if (c85111.isRunning()) {
                    try {
                        AbstractExecutionThreadService.this.run();
                    } catch (Throwable th2) {
                        Platform.restoreInterruptIfIsInterruptedException(th2);
                        try {
                            AbstractExecutionThreadService.this.shutDown();
                        } catch (Exception e11) {
                            Platform.restoreInterruptIfIsInterruptedException(e11);
                            AbstractExecutionThreadService.logger.get().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e11);
                        }
                        c85111.notifyFailed(th2);
                        return;
                    }
                }
                AbstractExecutionThreadService.this.shutDown();
                c85111.notifyStopped();
            } catch (Throwable th3) {
                Platform.restoreInterruptIfIsInterruptedException(th3);
                c85111.notifyFailed(th3);
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

    public abstract void run() throws Exception;

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
        return new Executor() { // from class: com.google.common.util.concurrent.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                MoreExecutors.newThread(this.f12412b.serviceName(), runnable).start();
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

    public String serviceName() {
        return getClass().getSimpleName();
    }

    public void shutDown() throws Exception {
    }

    public void startUp() throws Exception {
    }

    public void triggerShutdown() {
    }
}
