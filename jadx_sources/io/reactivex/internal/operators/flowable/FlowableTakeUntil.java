package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTakeUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC44416b<? extends U> other;

    public static final class TakeUntilMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -4945480365982832967L;
        final InterfaceC44417c<? super T> downstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final TakeUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicThrowable error = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3592821756711087922L;

            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onComplete() {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                HalfSerializer.onComplete(takeUntilMainSubscriber.downstream, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onError(Throwable th2) {
                SubscriptionHelper.cancel(TakeUntilMainSubscriber.this.upstream);
                TakeUntilMainSubscriber takeUntilMainSubscriber = TakeUntilMainSubscriber.this;
                HalfSerializer.onError(takeUntilMainSubscriber.downstream, th2, takeUntilMainSubscriber, takeUntilMainSubscriber.error);
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                onComplete();
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onSubscribe(InterfaceC44418d interfaceC44418d) {
                SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onError(this.downstream, th2, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            HalfSerializer.onNext(this.downstream, t11, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
        }

        public TakeUntilMainSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
            this.downstream = interfaceC44417c;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        TakeUntilMainSubscriber takeUntilMainSubscriber = new TakeUntilMainSubscriber(interfaceC44417c);
        interfaceC44417c.onSubscribe(takeUntilMainSubscriber);
        this.other.subscribe(takeUntilMainSubscriber.other);
        this.source.subscribe((FlowableSubscriber) takeUntilMainSubscriber);
    }

    public FlowableTakeUntil(Flowable<T> flowable, InterfaceC44416b<? extends U> interfaceC44416b) {
        super(flowable);
        this.other = interfaceC44416b;
    }
}
