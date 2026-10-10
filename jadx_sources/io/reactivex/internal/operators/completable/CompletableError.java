package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableError extends Completable {
    final Throwable error;

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        EmptyDisposable.error(this.error, completableObserver);
    }

    public CompletableError(Throwable th2) {
        this.error = th2;
    }
}
