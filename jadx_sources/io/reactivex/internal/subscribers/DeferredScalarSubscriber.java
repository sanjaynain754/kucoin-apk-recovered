package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public abstract class DeferredScalarSubscriber<T, R> extends DeferredScalarSubscription<R> implements FlowableSubscriber<T> {
    private static final long serialVersionUID = 2984505488220891551L;
    protected boolean hasValue;
    protected InterfaceC44418d upstream;

    public void onError(Throwable th2) {
        this.value = null;
        this.downstream.onError(th2);
    }

    public abstract /* synthetic */ void onNext(Object obj);

    public void onComplete() {
        if (this.hasValue) {
            complete(this.value);
        } else {
            this.downstream.onComplete();
        }
    }

    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
            this.upstream = interfaceC44418d;
            this.downstream.onSubscribe(this);
            interfaceC44418d.request(Long.MAX_VALUE);
        }
    }

    public DeferredScalarSubscriber(InterfaceC44417c<? super R> interfaceC44417c) {
        super(interfaceC44417c);
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }
}
