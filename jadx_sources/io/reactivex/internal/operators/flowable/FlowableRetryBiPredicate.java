package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final BiPredicate<? super Integer, ? super Throwable> predicate;

    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC44417c<? super T> downstream;
        final BiPredicate<? super Integer, ? super Throwable> predicate;
        long produced;
        int retries;

        /* JADX INFO: renamed from: sa */
        final SubscriptionArbiter f87153sa;
        final InterfaceC44416b<? extends T> source;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.predicate;
                int i11 = this.retries + 1;
                this.retries = i11;
                if (biPredicate.test(Integer.valueOf(i11), th2)) {
                    subscribeNext();
                } else {
                    this.downstream.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.produced++;
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            this.f87153sa.setSubscription(interfaceC44418d);
        }

        public RetryBiSubscriber(InterfaceC44417c<? super T> interfaceC44417c, BiPredicate<? super Integer, ? super Throwable> biPredicate, SubscriptionArbiter subscriptionArbiter, InterfaceC44416b<? extends T> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.f87153sa = subscriptionArbiter;
            this.source = interfaceC44416b;
            this.predicate = biPredicate;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f87153sa.isCancelled()) {
                    long j11 = this.produced;
                    if (j11 != 0) {
                        this.produced = 0L;
                        this.f87153sa.produced(j11);
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
        new RetryBiSubscriber(interfaceC44417c, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }

    public FlowableRetryBiPredicate(Flowable<T> flowable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(flowable);
        this.predicate = biPredicate;
    }
}
