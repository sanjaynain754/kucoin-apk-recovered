package jumio.core;

import android.os.Handler;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jumio.core.RunnableScheduledFutureC40563M1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.M1 */
/* JADX INFO: loaded from: classes61.dex */
public final class RunnableScheduledFutureC40563M1 implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: a */
    public final long f90049a;

    /* JADX INFO: renamed from: b */
    public final Callable f90050b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f90051c;

    /* JADX INFO: renamed from: d */
    public final ListenableFuture f90052d;

    /* JADX INFO: renamed from: a */
    public static final Object m89202a(final RunnableScheduledFutureC40563M1 runnableScheduledFutureC40563M1, final Handler handler, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        completer.addCancellationListener(new Runnable() { // from class: lg0.n
            @Override // java.lang.Runnable
            public final void run() {
                RunnableScheduledFutureC40563M1.m89203a(this.f93671b, handler);
            }
        }, ExecutorC40601U0.f90129a.getInstance());
        runnableScheduledFutureC40563M1.f90051c.set(completer);
        return "HandlerScheduledFuture-" + runnableScheduledFutureC40563M1.f90050b;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f90052d.get();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    public RunnableScheduledFutureC40563M1(final Handler handler, long j11, Callable mTask) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(mTask, "mTask");
        this.f90049a = j11;
        this.f90050b = mTask;
        this.f90051c = new AtomicReference(null);
        ListenableFuture future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: lg0.m
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return RunnableScheduledFutureC40563M1.m89202a(this.f93669a, handler, completer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        this.f90052d = future;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z11) {
        return this.f90052d.cancel(z11);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        Delayed other = delayed;
        Intrinsics.checkNotNullParameter(other, "other");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Intrinsics.compare(getDelay(timeUnit), other.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j11, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f90052d.get(j11, unit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f90052d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f90052d.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) this.f90051c.getAndSet(null);
        if (completer != null) {
            try {
                completer.set(this.f90050b.call());
            } catch (Exception e11) {
                completer.setException(e11);
            }
        }
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.convert(this.f90049a - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: a */
    public static final void m89203a(RunnableScheduledFutureC40563M1 runnableScheduledFutureC40563M1, Handler handler) {
        if (runnableScheduledFutureC40563M1.f90051c.getAndSet(null) != null) {
            handler.removeCallbacks(runnableScheduledFutureC40563M1);
        }
    }
}
