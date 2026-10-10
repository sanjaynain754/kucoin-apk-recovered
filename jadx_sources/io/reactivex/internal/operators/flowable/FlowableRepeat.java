package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC44417c<? super T> downstream;
        long produced;
        long remaining;

        /* JADX INFO: renamed from: sa */
        final SubscriptionArbiter f87150sa;
        final InterfaceC44416b<? extends T> source;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            long j11 = this.remaining;
            if (j11 != Long.MAX_VALUE) {
                this.remaining = j11 - 1;
            }
            if (j11 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.produced++;
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            this.f87150sa.setSubscription(interfaceC44418d);
        }

        public RepeatSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, SubscriptionArbiter subscriptionArbiter, InterfaceC44416b<? extends T> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.f87150sa = subscriptionArbiter;
            this.source = interfaceC44416b;
            this.remaining = j11;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f87150sa.isCancelled()) {
                    long j11 = this.produced;
                    if (j11 != 0) {
                        this.produced = 0L;
                        this.f87150sa.produced(j11);
                    }
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        interfaceC44417c.onSubscribe(subscriptionArbiter);
        long j11 = this.count;
        new RepeatSubscriber(interfaceC44417c, j11 != Long.MAX_VALUE ? j11 - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).subscribeNext();
    }

    public FlowableRepeat(Flowable<T> flowable, long j11) {
        super(flowable);
        this.count = j11;
    }
}
