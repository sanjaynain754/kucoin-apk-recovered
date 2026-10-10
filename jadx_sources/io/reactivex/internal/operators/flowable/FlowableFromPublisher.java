package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    final InterfaceC44416b<? extends T> publisher;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.publisher.subscribe(interfaceC44417c);
    }

    public FlowableFromPublisher(InterfaceC44416b<? extends T> interfaceC44416b) {
        this.publisher = interfaceC44416b;
    }
}
