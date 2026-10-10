package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import p002a0.C0006b;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleFromCallable<T> extends Single<T> {
    final Callable<? extends T> callable;

    public SingleFromCallable(Callable<? extends T> callable) {
        this.callable = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        Disposable disposableEmpty = Disposables.empty();
        singleObserver.onSubscribe(disposableEmpty);
        if (!disposableEmpty.getDisposed()) {
            try {
                C0006b c0006b = (Object) ObjectHelper.requireNonNull(this.callable.call(), "The callable returned a null value");
                if (!disposableEmpty.getDisposed()) {
                    singleObserver.onSuccess(c0006b);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (!disposableEmpty.getDisposed()) {
                    singleObserver.onError(th2);
                } else {
                    RxJavaPlugins.onError(th2);
                }
            }
        }
    }
}
