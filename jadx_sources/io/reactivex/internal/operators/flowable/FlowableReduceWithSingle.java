package io.reactivex.internal.operators.flowable;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Callable;
import sh0.InterfaceC44416b;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableReduceWithSingle<T, R> extends Single<R> {
    final BiFunction<R, ? super T, R> reducer;
    final Callable<R> seedSupplier;
    final InterfaceC44416b<T> source;

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.source.subscribe(new FlowableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.reducer, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public FlowableReduceWithSingle(InterfaceC44416b<T> interfaceC44416b, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.source = interfaceC44416b;
        this.seedSupplier = callable;
        this.reducer = biFunction;
    }
}
