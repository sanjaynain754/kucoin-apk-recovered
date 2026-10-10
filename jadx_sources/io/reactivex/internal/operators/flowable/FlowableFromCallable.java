package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFromCallable<T> extends Flowable<T> implements Callable<T> {
    final Callable<? extends T> callable;

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return (T) ObjectHelper.requireNonNull(this.callable.call(), "The callable returned a null value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(interfaceC44417c);
        interfaceC44417c.onSubscribe(deferredScalarSubscription);
        try {
            deferredScalarSubscription.complete(ObjectHelper.requireNonNull(this.callable.call(), "The callable returned a null value"));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarSubscription.isCancelled()) {
                RxJavaPlugins.onError(th2);
            } else {
                interfaceC44417c.onError(th2);
            }
        }
    }

    public FlowableFromCallable(Callable<? extends T> callable) {
        this.callable = callable;
    }
}
