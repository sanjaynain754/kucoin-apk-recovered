package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableJust<T> extends Flowable<T> implements ScalarCallable<T> {
    private final T value;

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
        return this.value;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        interfaceC44417c.onSubscribe(new ScalarSubscription(interfaceC44417c, this.value));
    }

    public FlowableJust(T t11) {
        this.value = t11;
    }
}
