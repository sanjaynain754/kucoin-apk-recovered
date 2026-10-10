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
final class PausableExecutorServiceImpl implements PausableExecutorService {
    private final ExecutorService delegateService;
    private final PausableExecutor pausableDelegate;

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegateService.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegateService.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, TimeUnit timeUnit) throws InterruptedException {
        return this.delegateService.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.pausableDelegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) throws InterruptedException {
        return this.delegateService.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegateService.invokeAny(collection, j11, timeUnit);
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.pausableDelegate.isPaused();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegateService.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegateService.isTerminated();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.pausableDelegate.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.pausableDelegate.resume();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public PausableExecutorServiceImpl(boolean z11, ExecutorService executorService) {
        this.delegateService = executorService;
        this.pausableDelegate = new PausableExecutorImpl(z11, executorService);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m13746a(Runnable runnable) {
        runnable.run();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m13747b(Runnable runnable, Object obj) {
        runnable.run();
        return obj;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t11) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PausableExecutorServiceImpl.m13747b(runnable, t11);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PausableExecutorServiceImpl.m13746a(runnable);
            }
        });
    }
}
