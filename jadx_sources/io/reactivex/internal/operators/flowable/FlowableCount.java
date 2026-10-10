package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableCount<T> extends AbstractFlowableWithUpstream<T, Long> {

    public static final class CountSubscriber extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        long count;
        InterfaceC44418d upstream;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            complete(Long.valueOf(this.count));
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            this.count++;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public CountSubscriber(InterfaceC44417c<? super Long> interfaceC44417c) {
            super(interfaceC44417c);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Long> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new CountSubscriber(interfaceC44417c));
    }

    public FlowableCount(Flowable<T> flowable) {
        super(flowable);
    }
}
