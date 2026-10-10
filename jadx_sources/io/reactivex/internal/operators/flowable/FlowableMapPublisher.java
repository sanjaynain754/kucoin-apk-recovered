package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    final Function<? super T, ? extends U> mapper;
    final InterfaceC44416b<T> source;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super U> interfaceC44417c) {
        this.source.subscribe(new FlowableMap.MapSubscriber(interfaceC44417c, this.mapper));
    }

    public FlowableMapPublisher(InterfaceC44416b<T> interfaceC44416b, Function<? super T, ? extends U> function) {
        this.source = interfaceC44416b;
        this.mapper = function;
    }
}
