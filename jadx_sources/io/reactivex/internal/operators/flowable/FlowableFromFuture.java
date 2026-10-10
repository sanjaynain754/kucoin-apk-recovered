package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    final Future<? extends T> future;
    final long timeout;
    final TimeUnit unit;

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(interfaceC44417c);
        interfaceC44417c.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            T t11 = timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get();
            if (t11 == null) {
                interfaceC44417c.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t11);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            interfaceC44417c.onError(th2);
        }
    }

    public FlowableFromFuture(Future<? extends T> future, long j11, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j11;
        this.unit = timeUnit;
    }
}
