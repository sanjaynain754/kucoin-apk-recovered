package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    final Callable<? extends InterfaceC44416b<? extends T>> supplier;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        try {
            ((InterfaceC44416b) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(interfaceC44417c);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowableDefer(Callable<? extends InterfaceC44416b<? extends T>> callable) {
        this.supplier = callable;
    }
}
