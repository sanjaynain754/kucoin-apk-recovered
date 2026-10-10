package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC44416b<? extends U>> mapper;
    final int maxConcurrency;
    final InterfaceC44416b<T> source;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super U> interfaceC44417c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC44417c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(interfaceC44417c, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }

    public FlowableFlatMapPublisher(InterfaceC44416b<T> interfaceC44416b, Function<? super T, ? extends InterfaceC44416b<? extends U>> function, boolean z11, int i11, int i12) {
        this.source = interfaceC44416b;
        this.mapper = function;
        this.delayErrors = z11;
        this.maxConcurrency = i11;
        this.bufferSize = i12;
    }
}
