package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableToSingle<T> extends Single<T> {
    final T completionValue;
    final Callable<? extends T> completionValueSupplier;
    final CompletableSource source;

    public final class ToSingle implements CompletableObserver {
        private final SingleObserver<? super T> observer;

        public ToSingle(SingleObserver<? super T> singleObserver) {
            this.observer = singleObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            T tCall;
            CompletableToSingle completableToSingle = CompletableToSingle.this;
            Callable<? extends T> callable = completableToSingle.completionValueSupplier;
            if (callable != null) {
                try {
                    tCall = callable.call();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.observer.onError(th2);
                    return;
                }
            } else {
                tCall = completableToSingle.completionValue;
            }
            if (tCall == null) {
                this.observer.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.observer.onSuccess(tCall);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.observer.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new ToSingle(singleObserver));
    }

    public CompletableToSingle(CompletableSource completableSource, Callable<? extends T> callable, T t11) {
        this.source = completableSource;
        this.completionValue = t11;
        this.completionValueSupplier = callable;
    }
}
