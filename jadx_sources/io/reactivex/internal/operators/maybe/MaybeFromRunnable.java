package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeFromRunnable<T> extends Maybe<T> implements Callable<T> {
    final Runnable runnable;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        this.runnable.run();
        return null;
    }

    public MaybeFromRunnable(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableEmpty = Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (!disposableEmpty.getDisposed()) {
            try {
                this.runnable.run();
                if (!disposableEmpty.getDisposed()) {
                    maybeObserver.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (!disposableEmpty.getDisposed()) {
                    maybeObserver.onError(th2);
                } else {
                    RxJavaPlugins.onError(th2);
                }
            }
        }
    }
}
