package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC44417c<? super T> downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        InterfaceC44418d upstream;
        final Scheduler.Worker worker;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.latest.set(t11);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public ThrottleLatestSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler.Worker worker, boolean z11) {
            this.downstream = interfaceC44417c;
            this.timeout = j11;
            this.unit = timeUnit;
            this.worker = worker;
            this.emitLast = z11;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.latest;
                AtomicLong atomicLong = this.requested;
                InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z12 = this.done;
                    if (z12 && this.error != null) {
                        atomicReference.lazySet(null);
                        interfaceC44417c.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                    if (atomicReference.get() == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12) {
                        if (!z11 && this.emitLast) {
                            T andSet = atomicReference.getAndSet(null);
                            long j11 = this.emitted;
                            if (j11 != atomicLong.get()) {
                                this.emitted = j11 + 1;
                                interfaceC44417c.onNext(andSet);
                                interfaceC44417c.onComplete();
                            } else {
                                interfaceC44417c.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                            }
                        } else {
                            atomicReference.lazySet(null);
                            interfaceC44417c.onComplete();
                        }
                        this.worker.dispose();
                        return;
                    }
                    if (z11) {
                        if (this.timerFired) {
                            this.timerRunning = false;
                            this.timerFired = false;
                        }
                    } else if (!this.timerRunning || this.timerFired) {
                        T andSet2 = atomicReference.getAndSet(null);
                        long j12 = this.emitted;
                        if (j12 != atomicLong.get()) {
                            interfaceC44417c.onNext(andSet2);
                            this.emitted = j12 + 1;
                            this.timerFired = false;
                            this.timerRunning = true;
                            this.worker.schedule(this, this.timeout, this.unit);
                        } else {
                            this.upstream.cancel();
                            interfaceC44417c.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                            this.worker.dispose();
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new ThrottleLatestSubscriber(interfaceC44417c, this.timeout, this.unit, this.scheduler.createWorker(), this.emitLast));
    }

    public FlowableThrottleLatest(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        super(flowable);
        this.timeout = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z11;
    }
}
