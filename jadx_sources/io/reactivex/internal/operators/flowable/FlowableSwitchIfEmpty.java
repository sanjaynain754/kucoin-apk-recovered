package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC44416b<? extends T> other;

    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        final InterfaceC44417c<? super T> downstream;
        final InterfaceC44416b<? extends T> other;
        boolean empty = true;
        final SubscriptionArbiter arbiter = new SubscriptionArbiter(false);

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (!this.empty) {
                this.downstream.onComplete();
            } else {
                this.empty = false;
                this.other.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            this.arbiter.setSubscription(interfaceC44418d);
        }

        public SwitchIfEmptySubscriber(InterfaceC44417c<? super T> interfaceC44417c, InterfaceC44416b<? extends T> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.other = interfaceC44416b;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(interfaceC44417c, this.other);
        interfaceC44417c.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, InterfaceC44416b<? extends T> interfaceC44416b) {
        super(flowable);
        this.other = interfaceC44416b;
    }
}
