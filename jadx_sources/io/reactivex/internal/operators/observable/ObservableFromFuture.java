package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableFromFuture<T> extends Observable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (deferredScalarDisposable.getDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.unit;
            deferredScalarDisposable.complete(ObjectHelper.requireNonNull(timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get(), "Future returned null"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarDisposable.getDisposed()) {
                return;
            }
            observer.onError(th2);
        }
    }

    public ObservableFromFuture(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j11;
        this.unit = timeUnit;
    }
}
