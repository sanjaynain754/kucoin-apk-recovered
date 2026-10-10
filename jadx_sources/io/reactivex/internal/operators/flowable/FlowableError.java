package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableError<T> extends Flowable<T> {
    final Callable<? extends Throwable> errorSupplier;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        try {
            th = (Throwable) ObjectHelper.requireNonNull(this.errorSupplier.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
        }
        EmptySubscription.error(th, interfaceC44417c);
    }

    public FlowableError(Callable<? extends Throwable> callable) {
        this.errorSupplier = callable;
    }
}
