package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.EmptySubscription;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableNever extends Flowable<Object> {
    public static final Flowable<Object> INSTANCE = new FlowableNever();

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Object> interfaceC44417c) {
        interfaceC44417c.onSubscribe(EmptySubscription.INSTANCE);
    }

    private FlowableNever() {
    }
}
