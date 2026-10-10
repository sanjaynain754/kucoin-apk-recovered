package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    public MaybeFromFuture(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j11;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        T t11;
        Disposable disposableEmpty = Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (!disposableEmpty.getDisposed()) {
            try {
                long j11 = this.timeout;
                if (j11 <= 0) {
                    t11 = this.future.get();
                } else {
                    t11 = this.future.get(j11, this.unit);
                }
                if (!disposableEmpty.getDisposed()) {
                    if (t11 == null) {
                        maybeObserver.onComplete();
                    } else {
                        maybeObserver.onSuccess(t11);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof ExecutionException) {
                    th = th.getCause();
                }
                Exceptions.throwIfFatal(th);
                if (!disposableEmpty.getDisposed()) {
                    maybeObserver.onError(th);
                }
            }
        }
    }
}
