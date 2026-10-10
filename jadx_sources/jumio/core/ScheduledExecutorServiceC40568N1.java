package jumio.core;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.jumio.commons.log.Log;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jumio.core.C40558L1;
import jumio.core.ScheduledExecutorServiceC40568N1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.N1 */
/* JADX INFO: loaded from: classes61.dex */
public final class ScheduledExecutorServiceC40568N1 extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: c */
    public static final C40558L1 f90056c;

    /* JADX INFO: renamed from: a */
    public final Handler f90057a;

    /* JADX INFO: renamed from: b */
    public boolean f90058b;

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(final Runnable command, long j11, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return schedule(new Callable() { // from class: lg0.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ScheduledExecutorServiceC40568N1.m89204a(command);
            }
        }, j11, unit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f90058b = true;
        this.f90057a.getLooper().quitSafely();
    }

    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        new Object(defaultConstructorMarker) { // from class: com.jumio.commons.camera.renderer.executor.HandlerScheduledExecutorService$Companion
            @NotNull
            public final ScheduledExecutorService currentThreadExecutor() {
                C40558L1 c40558l1 = ScheduledExecutorServiceC40568N1.f90056c;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) c40558l1.get();
                if (scheduledExecutorService != null) {
                    return scheduledExecutorService;
                }
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("Current thread has no looper!");
                }
                ScheduledExecutorServiceC40568N1 scheduledExecutorServiceC40568N1 = new ScheduledExecutorServiceC40568N1(new Handler(looperMyLooper));
                c40558l1.set(scheduledExecutorServiceC40568N1);
                return scheduledExecutorServiceC40568N1;
            }
        };
        f90056c = new C40558L1();
    }

    public ScheduledExecutorServiceC40568N1(Handler mHandler) {
        Intrinsics.checkNotNullParameter(mHandler, "mHandler");
        this.f90057a = mHandler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (this.f90058b || this.f90057a.post(command)) {
            return;
        }
        throw new RejectedExecutionException(this.f90057a + " is shutting down");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable command, long j11, long j12, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(unit, "unit");
        throw new UnsupportedOperationException(ScheduledExecutorServiceC40568N1.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable command, long j11, long j12, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(unit, "unit");
        throw new UnsupportedOperationException(ScheduledExecutorServiceC40568N1.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    /* JADX INFO: renamed from: a */
    public static final Void m89204a(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j11, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        Log.m14467e(ScheduledExecutorServiceC40568N1.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j11, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jConvert = TimeUnit.MILLISECONDS.convert(j11, unit) + SystemClock.uptimeMillis();
        RunnableScheduledFutureC40563M1 runnableScheduledFutureC40563M1 = new RunnableScheduledFutureC40563M1(this.f90057a, jConvert, callable);
        if (this.f90057a.postAtTime(runnableScheduledFutureC40563M1, jConvert)) {
            return runnableScheduledFutureC40563M1;
        }
        return new ScheduledFutureC40597T1(new RejectedExecutionException(this.f90057a + " is shutting down"));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return CollectionsKt.emptyList();
    }
}
