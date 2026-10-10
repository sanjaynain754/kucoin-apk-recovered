package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes56.dex */
final class LimitedConcurrencyExecutorService extends LimitedConcurrencyExecutor implements ExecutorService {
    private final ExecutorService delegate;

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public LimitedConcurrencyExecutorService(ExecutorService executorService, int i11) {
        super(executorService, i11);
        this.delegate = executorService;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m13744b(Runnable runnable, Object obj) {
        runnable.run();
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m13745c(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t11) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LimitedConcurrencyExecutorService.m13744b(runnable, t11);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LimitedConcurrencyExecutorService.m13745c(runnable);
            }
        });
    }
}
