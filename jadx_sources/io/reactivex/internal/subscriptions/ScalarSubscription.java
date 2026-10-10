package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final InterfaceC44417c<? super T> subscriber;
    final T value;

    @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t11, T t12) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i11) {
        return i11 & 1;
    }

    public ScalarSubscription(InterfaceC44417c<? super T> interfaceC44417c, T t11) {
        this.subscriber = interfaceC44417c;
        this.value = t11;
    }

    public boolean isCancelled() {
        if (get() == 2) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        if (get() != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        if (get() == 0) {
            lazySet(1);
            return this.value;
        }
        return null;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void request(long j11) {
        if (SubscriptionHelper.validate(j11) && compareAndSet(0, 1)) {
            InterfaceC44417c<? super T> interfaceC44417c = this.subscriber;
            interfaceC44417c.onNext(this.value);
            if (get() != 2) {
                interfaceC44417c.onComplete();
            }
        }
    }
}
