package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableThrottleFirstTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = -9102637559663639004L;
        boolean done;
        final InterfaceC44417c<? super T> downstream;
        volatile boolean gate;
        final long timeout;
        final SequentialDisposable timer = new SequentialDisposable();
        final TimeUnit unit;
        InterfaceC44418d upstream;
        final Scheduler.Worker worker;

        @Override // java.lang.Runnable
        public void run() {
            this.gate = false;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.downstream.onError(th2);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done || this.gate) {
                return;
            }
            this.gate = true;
            if (get() == 0) {
                this.done = true;
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            } else {
                this.downstream.onNext(t11);
                BackpressureHelper.produced(this, 1L);
                Disposable disposable = this.timer.get();
                if (disposable != null) {
                    disposable.dispose();
                }
                this.timer.replace(this.worker.schedule(this, this.timeout, this.unit));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public DebounceTimedSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.downstream = interfaceC44417c;
            this.timeout = j11;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this, j11);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new DebounceTimedSubscriber(new SerializedSubscriber(interfaceC44417c), this.timeout, this.unit, this.scheduler.createWorker()));
    }

    public FlowableThrottleFirstTimed(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.timeout = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }
}
