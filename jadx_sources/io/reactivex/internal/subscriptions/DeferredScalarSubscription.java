package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final InterfaceC44417c<? super T> downstream;
    protected T value;

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void cancel() {
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

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public DeferredScalarSubscription(InterfaceC44417c<? super T> interfaceC44417c) {
        this.downstream = interfaceC44417c;
    }

    public final void complete(T t11) {
        int i11 = get();
        while (i11 != 8) {
            if ((i11 & (-3)) == 0) {
                if (i11 == 2) {
                    lazySet(3);
                    InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                    interfaceC44417c.onNext(t11);
                    if (get() != 4) {
                        interfaceC44417c.onComplete();
                        return;
                    }
                    return;
                }
                this.value = t11;
                if (compareAndSet(0, 1)) {
                    return;
                }
                i11 = get();
                if (i11 == 4) {
                    this.value = null;
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t11;
        lazySet(16);
        InterfaceC44417c<? super T> interfaceC44417c2 = this.downstream;
        interfaceC44417c2.onNext(t11);
        if (get() != 4) {
            interfaceC44417c2.onComplete();
        }
    }

    public final boolean isCancelled() {
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
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t11 = this.value;
        this.value = null;
        return t11;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public final void request(long j11) {
        T t11;
        if (SubscriptionHelper.validate(j11)) {
            do {
                int i11 = get();
                if ((i11 & (-2)) == 0) {
                    if (i11 == 1) {
                        if (compareAndSet(1, 3) && (t11 = this.value) != null) {
                            this.value = null;
                            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                            interfaceC44417c.onNext(t11);
                            if (get() != 4) {
                                interfaceC44417c.onComplete();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
