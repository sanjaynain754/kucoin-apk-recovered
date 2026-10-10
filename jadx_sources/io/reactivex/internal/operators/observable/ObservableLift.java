package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableOperator;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableLift<R, T> extends AbstractObservableWithUpstream<T, R> {
    final ObservableOperator<? extends R, ? super T> operator;

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        try {
            this.source.subscribe((Observer) ObjectHelper.requireNonNull(this.operator.apply(observer), "Operator " + this.operator + " returned a null Observer"));
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public ObservableLift(ObservableSource<T> observableSource, ObservableOperator<? extends R, ? super T> observableOperator) {
        super(observableSource);
        this.operator = observableOperator;
    }
}
