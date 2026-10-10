package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, InterfaceC44418d {
        final InterfaceC44417c<? super Timed<T>> downstream;
        long lastTime;
        final Scheduler scheduler;
        final TimeUnit unit;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
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
        public void onNext(T t11) {
            long jNow = this.scheduler.now(this.unit);
            long j11 = this.lastTime;
            this.lastTime = jNow;
            this.downstream.onNext(new Timed(t11, jNow - j11, this.unit));
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        public TimeIntervalSubscriber(InterfaceC44417c<? super Timed<T>> interfaceC44417c, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = interfaceC44417c;
            this.scheduler = scheduler;
            this.unit = timeUnit;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Timed<T>> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new TimeIntervalSubscriber(interfaceC44417c, this.unit, this.scheduler));
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }
}
