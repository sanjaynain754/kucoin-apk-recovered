package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableIgnoreElements<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, QueueSubscription<T> {
        final InterfaceC44417c<? super T> downstream;
        InterfaceC44418d upstream;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11, T t12) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return i11 & 2;
        }

        public IgnoreElementsSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
            this.downstream = interfaceC44417c;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
        }

        @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new IgnoreElementsSubscriber(interfaceC44417c));
    }

    public FlowableIgnoreElements(Flowable<T> flowable) {
        super(flowable);
    }
}
