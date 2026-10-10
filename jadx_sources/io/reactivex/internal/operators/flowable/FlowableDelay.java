package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, InterfaceC44418d {
        final long delay;
        final boolean delayError;
        final InterfaceC44417c<? super T> downstream;
        final TimeUnit unit;
        InterfaceC44418d upstream;

        /* JADX INFO: renamed from: w */
        final Scheduler.Worker f87140w;

        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f87140w.dispose();
                }
            }
        }

        public final class OnError implements Runnable {

            /* JADX INFO: renamed from: t */
            private final Throwable f87141t;

            public OnError(Throwable th2) {
                this.f87141t = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f87141t);
                } finally {
                    DelaySubscriber.this.f87140w.dispose();
                }
            }
        }

        public final class OnNext implements Runnable {

            /* JADX INFO: renamed from: t */
            private final T f87142t;

            public OnNext(T t11) {
                this.f87142t = t11;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext(this.f87142t);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
            this.f87140w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.f87140w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.f87140w.schedule(new OnError(th2), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.f87140w.schedule(new OnNext(t11), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        public DelaySubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler.Worker worker, boolean z11) {
            this.downstream = interfaceC44417c;
            this.delay = j11;
            this.unit = timeUnit;
            this.f87140w = worker;
            this.delayError = z11;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? interfaceC44417c : new SerializedSubscriber(interfaceC44417c), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }

    public FlowableDelay(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        super(flowable);
        this.delay = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z11;
    }
}
