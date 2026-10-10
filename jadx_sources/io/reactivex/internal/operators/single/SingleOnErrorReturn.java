package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {
    final SingleSource<? extends T> source;
    final T value;
    final Function<? super Throwable, ? extends T> valueSupplier;

    public final class OnErrorReturn implements SingleObserver<T> {
        private final SingleObserver<? super T> observer;

        public OnErrorReturn(SingleObserver<? super T> singleObserver) {
            this.observer = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            T tApply;
            SingleOnErrorReturn singleOnErrorReturn = SingleOnErrorReturn.this;
            Function<? super Throwable, ? extends T> function = singleOnErrorReturn.valueSupplier;
            if (function != null) {
                try {
                    tApply = function.apply(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.observer.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                tApply = singleOnErrorReturn.value;
            }
            if (tApply != null) {
                this.observer.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th2);
            this.observer.onError(nullPointerException);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t11) {
            this.observer.onSuccess(t11);
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new OnErrorReturn(singleObserver));
    }

    public SingleOnErrorReturn(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends T> function, T t11) {
        this.source = singleSource;
        this.valueSupplier = function;
        this.value = t11;
    }
}
