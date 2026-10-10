package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleDoOnTerminate<T> extends Single<T> {
    final Action onTerminate;
    final SingleSource<T> source;

    public final class DoOnTerminate implements SingleObserver<T> {
        final SingleObserver<? super T> downstream;

        public DoOnTerminate(SingleObserver<? super T> singleObserver) {
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            try {
                SingleDoOnTerminate.this.onTerminate.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.downstream.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t11) {
            try {
                SingleDoOnTerminate.this.onTerminate.run();
                this.downstream.onSuccess(t11);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new DoOnTerminate(singleObserver));
    }

    public SingleDoOnTerminate(SingleSource<T> singleSource, Action action) {
        this.source = singleSource;
        this.onTerminate = action;
    }
}
