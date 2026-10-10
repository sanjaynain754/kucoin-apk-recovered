package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleNever extends Single<Object> {
    public static final Single<Object> INSTANCE = new SingleNever();

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Object> singleObserver) {
        singleObserver.onSubscribe(EmptyDisposable.NEVER);
    }

    private SingleNever() {
    }
}
