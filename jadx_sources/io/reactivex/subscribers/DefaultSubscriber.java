package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    InterfaceC44418d upstream;

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onNext(Object obj);

    public final void cancel() {
        InterfaceC44418d interfaceC44418d = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        interfaceC44418d.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public final void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (EndConsumerHelper.validate(this.upstream, interfaceC44418d, getClass())) {
            this.upstream = interfaceC44418d;
            onStart();
        }
    }

    public final void request(long j11) {
        InterfaceC44418d interfaceC44418d = this.upstream;
        if (interfaceC44418d != null) {
            interfaceC44418d.request(j11);
        }
    }

    public void onStart() {
        request(Long.MAX_VALUE);
    }
}
