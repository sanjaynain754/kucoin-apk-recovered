package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleFromUnsafeSource<T> extends Single<T> {
    final SingleSource<T> source;

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(singleObserver);
    }

    public SingleFromUnsafeSource(SingleSource<T> singleSource) {
        this.source = singleSource;
    }
}
