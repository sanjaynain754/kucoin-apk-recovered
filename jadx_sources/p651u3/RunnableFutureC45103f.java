package p651u3;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: u3.f */
/* JADX INFO: compiled from: ScheduledFutureImpl.java */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableFutureC45103f<V> implements RunnableFuture<V>, ScheduledFuture<V> {

    /* JADX INFO: renamed from: b */
    public final Handler f101513b;

    /* JADX INFO: renamed from: c */
    public final FutureTask<V> f101514c;

    public RunnableFutureC45103f(Handler handler, Callable<V> callable) {
        this.f101513b = handler;
        this.f101514c = new FutureTask<>(callable);
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        return this.f101514c.get();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        return this.f101514c.cancel(z11);
    }

    @Override // java.util.concurrent.Future
    public V get(long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f101514c.get(j11, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f101514c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f101514c.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f101514c.run();
    }

    public RunnableFutureC45103f(Handler handler, Runnable runnable, V v11) {
        this.f101513b = handler;
        this.f101514c = new FutureTask<>(runnable, v11);
    }
}
