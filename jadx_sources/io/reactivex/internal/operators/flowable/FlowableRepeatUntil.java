package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {
    final BooleanSupplier until;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final InterfaceC44417c<? super T> downstream;
        long produced;

        /* JADX INFO: renamed from: sa */
        final SubscriptionArbiter f87151sa;
        final InterfaceC44416b<? extends T> source;
        final BooleanSupplier stop;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            try {
                if (this.stop.getAsBoolean()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
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
            this.f87151sa.setSubscription(interfaceC44418d);
        }

        public RepeatSubscriber(InterfaceC44417c<? super T> interfaceC44417c, BooleanSupplier booleanSupplier, SubscriptionArbiter subscriptionArbiter, InterfaceC44416b<? extends T> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.f87151sa = subscriptionArbiter;
            this.source = interfaceC44416b;
            this.stop = booleanSupplier;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f87151sa.isCancelled()) {
                    long j11 = this.produced;
                    if (j11 != 0) {
                        this.produced = 0L;
                        this.f87151sa.produced(j11);
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
        new RepeatSubscriber(interfaceC44417c, this.until, subscriptionArbiter, this.source).subscribeNext();
    }

    public FlowableRepeatUntil(Flowable<T> flowable, BooleanSupplier booleanSupplier) {
        super(flowable);
        this.until = booleanSupplier;
    }
}
