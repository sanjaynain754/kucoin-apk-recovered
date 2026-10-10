package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    final long limit;

    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final InterfaceC44417c<? super T> downstream;
        final long limit;
        long remaining;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            long j11 = this.remaining;
            long j12 = j11 - 1;
            this.remaining = j12;
            if (j11 > 0) {
                boolean z11 = j12 == 0;
                this.downstream.onNext(t11);
                if (z11) {
                    this.upstream.cancel();
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                if (this.limit != 0) {
                    this.downstream.onSubscribe(this);
                    return;
                }
                interfaceC44418d.cancel();
                this.done = true;
                EmptySubscription.complete(this.downstream);
            }
        }

        public TakeSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11) {
            this.downstream = interfaceC44417c;
            this.limit = j11;
            this.remaining = j11;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (!SubscriptionHelper.validate(j11)) {
                return;
            }
            if (!get() && compareAndSet(false, true) && j11 >= this.limit) {
                this.upstream.request(Long.MAX_VALUE);
            } else {
                this.upstream.request(j11);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(interfaceC44417c, this.limit));
    }

    public FlowableTake(Flowable<T> flowable, long j11) {
        super(flowable);
        this.limit = j11;
    }
}
