package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;
    final Predicate<? super Throwable> predicate;

    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC44417c<? super T> downstream;
        final Predicate<? super Throwable> predicate;
        long produced;
        long remaining;

        /* JADX INFO: renamed from: sa */
        final SubscriptionArbiter f87154sa;
        final InterfaceC44416b<? extends T> source;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            long j11 = this.remaining;
            if (j11 != Long.MAX_VALUE) {
                this.remaining = j11 - 1;
            }
            if (j11 == 0) {
                this.downstream.onError(th2);
                return;
            }
            try {
                if (this.predicate.test(th2)) {
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
            this.f87154sa.setSubscription(interfaceC44418d);
        }

        public RetrySubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, Predicate<? super Throwable> predicate, SubscriptionArbiter subscriptionArbiter, InterfaceC44416b<? extends T> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.f87154sa = subscriptionArbiter;
            this.source = interfaceC44416b;
            this.predicate = predicate;
            this.remaining = j11;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f87154sa.isCancelled()) {
                    long j11 = this.produced;
                    if (j11 != 0) {
                        this.produced = 0L;
                        this.f87154sa.produced(j11);
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
        new RetrySubscriber(interfaceC44417c, this.count, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }

    public FlowableRetryPredicate(Flowable<T> flowable, long j11, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.predicate = predicate;
        this.count = j11;
    }
}
