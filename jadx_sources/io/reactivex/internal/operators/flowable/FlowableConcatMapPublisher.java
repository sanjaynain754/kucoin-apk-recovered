package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final int prefetch;
    final InterfaceC44416b<T> source;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC44417c, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(interfaceC44417c, this.mapper, this.prefetch, this.errorMode));
    }

    public FlowableConcatMapPublisher(InterfaceC44416b<T> interfaceC44416b, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, ErrorMode errorMode) {
        this.source = interfaceC44416b;
        this.mapper = function;
        this.prefetch = i11;
        this.errorMode = errorMode;
    }
}
