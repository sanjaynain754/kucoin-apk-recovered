package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.parallel.ParallelFlowable;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelConcatMap<T, R> extends ParallelFlowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final int prefetch;
    final ParallelFlowable<T> source;

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public ParallelConcatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, ErrorMode errorMode) {
        this.source = parallelFlowable;
        this.mapper = (Function) ObjectHelper.requireNonNull(function, "mapper");
        this.prefetch = i11;
        this.errorMode = (ErrorMode) ObjectHelper.requireNonNull(errorMode, "errorMode");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super R>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<? super T>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        for (int i11 = 0; i11 < length; i11++) {
            interfaceC44417cArr2[i11] = FlowableConcatMap.subscribe(interfaceC44417cArr[i11], this.mapper, this.prefetch, this.errorMode);
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
