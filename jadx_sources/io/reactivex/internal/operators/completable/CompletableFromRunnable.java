package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableFromRunnable extends Completable {
    final Runnable runnable;

    public CompletableFromRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        Disposable disposableEmpty = Disposables.empty();
        completableObserver.onSubscribe(disposableEmpty);
        try {
            this.runnable.run();
            if (!disposableEmpty.getDisposed()) {
                completableObserver.onComplete();
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (!disposableEmpty.getDisposed()) {
                completableObserver.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }
    }
}
