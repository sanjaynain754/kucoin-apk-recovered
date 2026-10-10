package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.internal.operators.mixed.MaterializeSingleObserver;

/* JADX INFO: loaded from: classes60.dex */
@Experimental
public final class CompletableMaterialize<T> extends Single<Notification<T>> {
    final Completable source;

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Notification<T>> singleObserver) {
        this.source.subscribe(new MaterializeSingleObserver(singleObserver));
    }

    public CompletableMaterialize(Completable completable) {
        this.source = completable;
    }
}
