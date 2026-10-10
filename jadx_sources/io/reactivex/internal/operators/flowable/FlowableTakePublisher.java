package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final InterfaceC44416b<T> source;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(interfaceC44417c, this.limit));
    }

    public FlowableTakePublisher(InterfaceC44416b<T> interfaceC44416b, long j11) {
        this.source = interfaceC44416b;
        this.limit = j11;
    }
}
