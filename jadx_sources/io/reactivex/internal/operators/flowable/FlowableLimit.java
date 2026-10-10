package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: n */
    final long f87148n;

    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 2288246011222124525L;
        final InterfaceC44417c<? super T> downstream;
        long remaining;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.remaining <= 0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.remaining = 0L;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            long j11 = this.remaining;
            if (j11 > 0) {
                long j12 = j11 - 1;
                this.remaining = j12;
                this.downstream.onNext(t11);
                if (j12 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                if (this.remaining == 0) {
                    interfaceC44418d.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = interfaceC44418d;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        public LimitSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11) {
            this.downstream = interfaceC44417c;
            this.remaining = j11;
            lazySet(j11);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            long j12;
            long j13;
            if (SubscriptionHelper.validate(j11)) {
                do {
                    j12 = get();
                    if (j12 != 0) {
                        if (j12 <= j11) {
                            j13 = j12;
                        } else {
                            j13 = j11;
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j12, j12 - j13));
                this.upstream.request(j13);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(interfaceC44417c, this.f87148n));
    }

    public FlowableLimit(Flowable<T> flowable, long j11) {
        super(flowable);
        this.f87148n = j11;
    }
}
