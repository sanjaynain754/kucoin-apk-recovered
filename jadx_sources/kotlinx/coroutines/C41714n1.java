package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import og0.C43044a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.n1 */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020%2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m90084d2 = {"Lkotlinx/coroutines/n1;", "Lkotlinx/coroutines/m1;", "Lkotlinx/coroutines/t0;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "timeMillis", "Lkotlinx/coroutines/m;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/m;)V", "Lkotlinx/coroutines/b1;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/b1;", "close", "()V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledFuture;", "L", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;J)Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/RejectedExecutionException;", "exception", "q", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/RejectedExecutionException;)V", "c", "Ljava/util/concurrent/Executor;", "p", "()Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41714n1 extends AbstractC41710m1 implements InterfaceC41758t0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: L */
    public final ScheduledFuture<?> m91134L(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j11) {
        try {
            return scheduledExecutorService.schedule(runnable, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            m91135q(coroutineContext, e11);
            return null;
        }
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof C41714n1) && ((C41714n1) other).getExecutor() == getExecutor();
    }

    @Override // kotlinx.coroutines.AbstractC41710m1
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public Executor getExecutor() {
        return this.executor;
    }

    /* JADX INFO: renamed from: q */
    public final void m91135q(CoroutineContext context, RejectedExecutionException exception) {
        C41783z1.m91397c(context, C41702k1.m91113a("The task was rejected", exception));
    }

    public C41714n1(@NotNull Executor executor) {
        this.executor = executor;
        C43044a.m94534a(getExecutor());
    }

    @Override // kotlinx.coroutines.AbstractC41710m1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor executor = getExecutor();
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    public void dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        try {
            Executor executor = getExecutor();
            C41553c.m90497a();
            executor.execute(block);
        } catch (RejectedExecutionException e11) {
            C41553c.m90497a();
            m91135q(context, e11);
            C41782z0.m91392b().dispatch(context, block);
        }
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    @NotNull
    public InterfaceC41550b1 invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        ScheduledExecutorService scheduledExecutorService;
        long j11;
        Runnable runnable;
        CoroutineContext coroutineContext;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM91134L = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j11 = timeMillis;
            runnable = block;
            coroutineContext = context;
            scheduledFutureM91134L = m91134L(scheduledExecutorService, runnable, coroutineContext, j11);
        } else {
            j11 = timeMillis;
            runnable = block;
            coroutineContext = context;
        }
        if (scheduledFutureM91134L != null) {
            return new C41541a1(scheduledFutureM91134L);
        }
        return RunnableC41721p0.f91769h.invokeOnTimeout(j11, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.InterfaceC41758t0
    public void scheduleResumeAfterDelay(long timeMillis, @NotNull InterfaceC41708m<? super Unit> continuation) {
        ScheduledExecutorService scheduledExecutorService;
        long j11;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureM91134L = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j11 = timeMillis;
            scheduledFutureM91134L = m91134L(scheduledExecutorService, new RunnableC41711m2(this, continuation), continuation.get$context(), j11);
        } else {
            j11 = timeMillis;
        }
        if (scheduledFutureM91134L != null) {
            C41724q.m91188c(continuation, new C41700k(scheduledFutureM91134L));
        } else {
            RunnableC41721p0.f91769h.scheduleResumeAfterDelay(j11, continuation);
        }
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return getExecutor().toString();
    }
}
