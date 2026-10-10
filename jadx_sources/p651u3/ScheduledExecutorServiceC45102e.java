package p651u3;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: u3.e */
/* JADX INFO: compiled from: HandlerExecutorServiceImpl.java */
/* JADX INFO: loaded from: classes34.dex */
public class ScheduledExecutorServiceC45102e extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b */
    public final Handler f101512b;

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture<?> submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j11, TimeUnit timeUnit) {
        RunnableFutureC45103f runnableFutureC45103fNewTaskFor = newTaskFor(runnable, null);
        this.f101512b.postDelayed(runnableFutureC45103fNewTaskFor, timeUnit.toMillis(j11));
        return runnableFutureC45103fNewTaskFor;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public <T> RunnableFutureC45103f<T> newTaskFor(Runnable runnable, T t11) {
        return new RunnableFutureC45103f<>(this.f101512b, runnable, t11);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public <T> RunnableFutureC45103f<T> newTaskFor(Callable<T> callable) {
        return new RunnableFutureC45103f<>(this.f101512b, callable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f101512b.post(runnable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j11, long j12, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public ScheduledExecutorServiceC45102e(Handler handler) {
        this.f101512b = handler;
    }

    /* JADX INFO: renamed from: a */
    public boolean m99718a() {
        if (Thread.currentThread() == this.f101512b.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public <T> ScheduledFuture<T> submit(Runnable runnable, T t11) {
        runnable.getClass();
        RunnableFutureC45103f<T> runnableFutureC45103fNewTaskFor = newTaskFor(runnable, t11);
        execute(runnableFutureC45103fNewTaskFor);
        return runnableFutureC45103fNewTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public <T> ScheduledFuture<T> submit(Callable<T> callable) {
        callable.getClass();
        RunnableFutureC45103f<T> runnableFutureC45103fNewTaskFor = newTaskFor(callable);
        execute(runnableFutureC45103fNewTaskFor);
        return runnableFutureC45103fNewTaskFor;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j11, TimeUnit timeUnit) {
        RunnableFutureC45103f runnableFutureC45103fNewTaskFor = newTaskFor(callable);
        this.f101512b.postDelayed(runnableFutureC45103fNewTaskFor, timeUnit.toMillis(j11));
        return runnableFutureC45103fNewTaskFor;
    }
}
