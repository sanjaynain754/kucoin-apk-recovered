package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableFromUnsafeSource extends Completable {
    final CompletableSource source;

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(completableObserver);
    }

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.source = completableSource;
    }
}
