package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
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
public final class FlowableSkipUntil<T, U> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC44416b<U> other;

    public static final class SkipUntilMainSubscriber<T> extends AtomicInteger implements ConditionalSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -6270983465606289181L;
        final InterfaceC44417c<? super T> downstream;
        volatile boolean gate;
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final SkipUntilMainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicThrowable error = new AtomicThrowable();

        public final class OtherSubscriber extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -5592042965931999169L;

            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onComplete() {
                SkipUntilMainSubscriber.this.gate = true;
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onError(Throwable th2) {
                SubscriptionHelper.cancel(SkipUntilMainSubscriber.this.upstream);
                SkipUntilMainSubscriber skipUntilMainSubscriber = SkipUntilMainSubscriber.this;
                HalfSerializer.onError(skipUntilMainSubscriber.downstream, th2, skipUntilMainSubscriber, skipUntilMainSubscriber.error);
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onNext(Object obj) {
                SkipUntilMainSubscriber.this.gate = true;
                get().cancel();
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

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.other);
            HalfSerializer.onError(this.downstream, th2, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (!this.gate) {
                return false;
            }
            HalfSerializer.onNext(this.downstream, t11, this, this.error);
            return true;
        }

        public SkipUntilMainSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
            this.downstream = interfaceC44417c;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (!tryOnNext(t11)) {
                this.upstream.get().request(1L);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        SkipUntilMainSubscriber skipUntilMainSubscriber = new SkipUntilMainSubscriber(interfaceC44417c);
        interfaceC44417c.onSubscribe(skipUntilMainSubscriber);
        this.other.subscribe(skipUntilMainSubscriber.other);
        this.source.subscribe((FlowableSubscriber) skipUntilMainSubscriber);
    }

    public FlowableSkipUntil(Flowable<T> flowable, InterfaceC44416b<U> interfaceC44416b) {
        super(flowable);
        this.other = interfaceC44416b;
    }
}
