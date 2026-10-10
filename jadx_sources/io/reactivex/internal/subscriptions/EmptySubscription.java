package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public Object poll() {
        return null;
    }

    public static void complete(InterfaceC44417c<?> interfaceC44417c) {
        interfaceC44417c.onSubscribe(INSTANCE);
        interfaceC44417c.onComplete();
    }

    public static void error(Throwable th2, InterfaceC44417c<?> interfaceC44417c) {
        interfaceC44417c.onSubscribe(INSTANCE);
        interfaceC44417c.onError(th2);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i11) {
        return i11 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void request(long j11) {
        SubscriptionHelper.validate(j11);
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void cancel() {
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }
}
