package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeFromCallable<T> extends Maybe<T> implements Callable<T> {
    final Callable<? extends T> callable;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.callable.call();
    }

    public MaybeFromCallable(Callable<? extends T> callable) {
        this.callable = callable;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableEmpty = Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (!disposableEmpty.getDisposed()) {
            try {
                T tCall = this.callable.call();
                if (!disposableEmpty.getDisposed()) {
                    if (tCall == null) {
                        maybeObserver.onComplete();
                    } else {
                        maybeObserver.onSuccess(tCall);
                    }
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
