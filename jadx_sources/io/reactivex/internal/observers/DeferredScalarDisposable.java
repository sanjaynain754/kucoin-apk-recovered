package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes23.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    static final int DISPOSED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int TERMINATED = 2;
    private static final long serialVersionUID = -5502432239815349361L;
    protected final Observer<? super T> downstream;
    protected T value;

    public final void complete(T t11) {
        int i11 = get();
        if ((i11 & 54) != 0) {
            return;
        }
        Observer<? super T> observer = this.downstream;
        if (i11 == 8) {
            this.value = t11;
            lazySet(16);
            observer.onNext(null);
        } else {
            lazySet(2);
            observer.onNext(t11);
        }
        if (get() != 4) {
            observer.onComplete();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i11) {
        if ((i11 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryDispose() {
        return getAndSet(4) != 4;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public DeferredScalarDisposable(Observer<? super T> observer) {
        this.downstream = observer;
    }

    public final void error(Throwable th2) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.onError(th2);
        } else {
            lazySet(2);
            this.downstream.onError(th2);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t11 = this.value;
        this.value = null;
        lazySet(32);
        return t11;
    }

    public final void complete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }
}
