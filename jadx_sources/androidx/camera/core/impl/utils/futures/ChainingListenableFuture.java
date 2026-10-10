package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes23.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {
    private AsyncFunction<? super I, ? extends O> mFunction;
    private ListenableFuture<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);
    volatile ListenableFuture<? extends O> mOutputFuture;

    private <E> void putUninterruptibly(BlockingQueue<E> blockingQueue, E e11) {
        boolean z11 = false;
        while (true) {
            try {
                blockingQueue.put(e11);
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E takeUninterruptibly(BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z11 = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        if (!super.cancel(z11)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z11));
        cancel(this.mInputFuture, z11);
        cancel(this.mOutputFuture, z11);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.mOutputCreated.await();
            ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends I>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r11;
        ?? r12 = (AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                final ListenableFuture<? extends O> listenableFutureApply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                this.mOutputFuture = listenableFutureApply;
                if (isCancelled()) {
                    listenableFutureApply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                    this.mOutputFuture = null;
                } else {
                    listenableFutureApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                try {
                                    try {
                                        ChainingListenableFuture.this.set(Futures.getUninterruptibly(listenableFutureApply));
                                    } catch (CancellationException unused) {
                                        ChainingListenableFuture.this.cancel(false);
                                    }
                                } catch (ExecutionException e11) {
                                    ChainingListenableFuture.this.setException(e11.getCause());
                                }
                            } finally {
                                ChainingListenableFuture.this.mOutputFuture = null;
                            }
                        }
                    }, CameraXExecutors.directExecutor());
                }
            } catch (UndeclaredThrowableException e11) {
                setException(e11.getCause());
                r11 = r12;
            } catch (Exception e12) {
                setException(e12);
                r11 = r12;
            } catch (Error e13) {
                setException(e13);
                r11 = r12;
            } finally {
                this.mFunction = (AsyncFunction<? super I, ? extends O>) r12;
                this.mInputFuture = (ListenableFuture<? extends I>) r12;
                this.mOutputCreated.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e14) {
            setException(e14.getCause());
        }
    }

    public ChainingListenableFuture(AsyncFunction<? super I, ? extends O> asyncFunction, ListenableFuture<? extends I> listenableFuture) {
        this.mFunction = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.mInputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    private void cancel(Future<?> future, boolean z11) {
        if (future != null) {
            future.cancel(z11);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public O get(long j11, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j11 = timeUnit2.convert(j11, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j11, timeUnit);
                j11 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j11, timeUnit)) {
                j11 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j11, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j11, timeUnit);
    }
}
