package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, boolean z11, int i11, int i12) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z11;
        this.maxConcurrency = i11;
        this.prefetch = i12;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super R>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<? super T>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        for (int i11 = 0; i11 < length; i11++) {
            interfaceC44417cArr2[i11] = FlowableFlatMap.subscribe(interfaceC44417cArr[i11], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
