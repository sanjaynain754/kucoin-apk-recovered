package jumio.core;

import com.google.common.util.concurrent.ListenableFuture;
import com.jumio.commons.log.Log;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.T1 */
/* JADX INFO: loaded from: classes61.dex */
public final class ScheduledFutureC40597T1 implements ScheduledFuture, ListenableFuture {

    /* JADX INFO: renamed from: a */
    public final RejectedExecutionException f90125a;

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        throw new ExecutionException(this.f90125a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public ScheduledFutureC40597T1(RejectedExecutionException mCause) {
        Intrinsics.checkNotNullParameter(mCause, "cause");
        Intrinsics.checkNotNullParameter(mCause, "mCause");
        this.f90125a = mCause;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor executor) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(executor, "executor");
        try {
            executor.execute(listener);
        } catch (RuntimeException e11) {
            Log.m14470e("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + listener + " on Executor " + executor, e11);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed other = delayed;
        Intrinsics.checkNotNullParameter(other, "other");
        return -1;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit unit) throws ExecutionException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        throw new ExecutionException(this.f90125a);
    }

    public final String toString() {
        return super.toString() + "[status=FAILURE, cause=[" + this.f90125a + "]]";
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return 0L;
    }
}
