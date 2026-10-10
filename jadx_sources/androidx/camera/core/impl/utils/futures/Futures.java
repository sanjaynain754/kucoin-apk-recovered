package androidx.camera.core.impl.utils.futures;

import androidx.arch.core.util.Function;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes23.dex */
public final class Futures {
    private static final Function<?, ?> IDENTITY_FUNCTION = new Function<Object, Object>() { // from class: androidx.camera.core.impl.utils.futures.Futures.2
        @Override // androidx.arch.core.util.Function
        public Object apply(Object obj) {
            return obj;
        }
    };

    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> mCallback;
        final Future<V> mFuture;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (Error e11) {
                e = e11;
                this.mCallback.onFailure(e);
            } catch (RuntimeException e12) {
                e = e12;
                this.mCallback.onFailure(e);
            } catch (ExecutionException e13) {
                Throwable cause = e13.getCause();
                if (cause == null) {
                    this.mCallback.onFailure(e13);
                } else {
                    this.mCallback.onFailure(cause);
                }
            }
        }

        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v11;
        boolean z11 = false;
        while (true) {
            try {
                v11 = future.get();
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
        return v11;
    }

    public static <V> ListenableFuture<V> makeTimeoutFuture(final long j11, final ScheduledExecutorService scheduledExecutorService, final ListenableFuture<V> listenableFuture) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.m1984d(listenableFuture, scheduledExecutorService, j11, completer);
            }
        });
    }

    public static <I, O> void propagateTransform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, CallbackToFutureAdapter.Completer<O> completer, Executor executor) {
        propagateTransform(true, listenableFuture, function, completer, executor);
    }

    public static <V> ListenableFuture<List<V>> allAsList(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m1983c(ListenableFuture listenableFuture, CallbackToFutureAdapter.Completer completer) {
        propagateTransform(false, listenableFuture, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m1986f(ListenableFuture listenableFuture, final CallbackToFutureAdapter.Completer completer) {
        listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.c
            @Override // java.lang.Runnable
            public final void run() {
                completer.set(null);
            }
        }, CameraXExecutors.directExecutor());
        return "transformVoidFuture [" + listenableFuture + "]";
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th2) {
        return new ImmediateFuture.ImmediateFailedFuture(th2);
    }

    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(Throwable th2) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th2);
    }

    public static <V> ListenableFuture<V> immediateFuture(V v11) {
        return v11 == null ? ImmediateFuture.nullFuture() : new ImmediateFuture.ImmediateSuccessfulFuture(v11);
    }

    public static <V> ListenableFuture<V> makeTimeoutFuture(final long j11, final ScheduledExecutorService scheduledExecutorService, final V v11, final boolean z11, final ListenableFuture<V> listenableFuture) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.e
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.m1981a(listenableFuture, scheduledExecutorService, v11, z11, j11, completer);
            }
        });
    }

    public static <V> void propagate(ListenableFuture<V> listenableFuture, CallbackToFutureAdapter.Completer<V> completer) {
        propagateTransform(listenableFuture, IDENTITY_FUNCTION, completer, CameraXExecutors.directExecutor());
    }

    private static <I, O> void propagateTransform(boolean z11, final ListenableFuture<I> listenableFuture, final Function<? super I, ? extends O> function, final CallbackToFutureAdapter.Completer<O> completer, Executor executor) {
        Preconditions.checkNotNull(listenableFuture);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(completer);
        Preconditions.checkNotNull(executor);
        addCallback(listenableFuture, new FutureCallback<I>() { // from class: androidx.camera.core.impl.utils.futures.Futures.3
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th2) {
                completer.setException(th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(I i11) {
                try {
                    completer.set(function.apply(i11));
                } catch (Throwable th2) {
                    completer.setException(th2);
                }
            }
        }, executor);
        if (z11) {
            completer.addCancellationListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.Futures.4
                @Override // java.lang.Runnable
                public void run() {
                    listenableFuture.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
    }

    public static <V> ListenableFuture<List<V>> successfulAsList(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, listenableFuture);
        listenableFuture.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <V> ListenableFuture<Void> transformAsyncOnCompletion(final ListenableFuture<V> listenableFuture) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.b
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.m1986f(listenableFuture, completer);
            }
        });
    }

    private Futures() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m1981a(final ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z11, long j11, final CallbackToFutureAdapter.Completer completer) {
        propagate(listenableFuture, completer);
        if (!listenableFuture.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.f
                @Override // java.lang.Runnable
                public final void run() {
                    Futures.m1988h(completer, obj, z11, listenableFuture);
                }
            }, j11, TimeUnit.MILLISECONDS);
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.g
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + listenableFuture + "]";
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m1984d(final ListenableFuture listenableFuture, ScheduledExecutorService scheduledExecutorService, final long j11, final CallbackToFutureAdapter.Completer completer) {
        propagate(listenableFuture, completer);
        if (!listenableFuture.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: androidx.camera.core.impl.utils.futures.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(completer.setException(new TimeoutException("Future[" + listenableFuture + "] is not done within " + j11 + " ms.")));
                }
            }, j11, TimeUnit.MILLISECONDS);
            listenableFuture.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.i
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "TimeoutFuture[" + listenableFuture + "]";
    }

    public static <V> V getDone(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done, " + future);
        return (V) getUninterruptibly(future);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m1988h(CallbackToFutureAdapter.Completer completer, Object obj, boolean z11, ListenableFuture listenableFuture) {
        completer.set(obj);
        if (z11) {
            listenableFuture.cancel(true);
        }
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(final ListenableFuture<V> listenableFuture) {
        Preconditions.checkNotNull(listenableFuture);
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.utils.futures.d
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Futures.m1983c(listenableFuture, completer);
            }
        });
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, final Function<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        return transformAsync(listenableFuture, new AsyncFunction<I, O>() { // from class: androidx.camera.core.impl.utils.futures.Futures.1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public ListenableFuture<O> apply(I i11) {
                return Futures.immediateFuture(function.apply(i11));
            }
        }, executor);
    }
}
