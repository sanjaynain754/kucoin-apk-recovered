package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final InterfaceC44416b<T> source;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(interfaceC44417c, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }

    public FlowableConcatMapEagerPublisher(InterfaceC44416b<T> interfaceC44416b, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, int i12, ErrorMode errorMode) {
        this.source = interfaceC44416b;
        this.mapper = function;
        this.maxConcurrency = i11;
        this.prefetch = i12;
        this.errorMode = errorMode;
    }
}
