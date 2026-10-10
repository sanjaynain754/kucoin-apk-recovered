package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeFromAction<T> extends Maybe<T> implements Callable<T> {
    final Action action;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        this.action.run();
        return null;
    }

    public MaybeFromAction(Action action) {
        this.action = action;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableEmpty = Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (!disposableEmpty.getDisposed()) {
            try {
                this.action.run();
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
