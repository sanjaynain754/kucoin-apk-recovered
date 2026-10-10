package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSerialized<T> extends AbstractFlowableWithUpstream<T, T> {
    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new SerializedSubscriber(interfaceC44417c));
    }

    public FlowableSerialized(Flowable<T> flowable) {
        super(flowable);
    }
}
