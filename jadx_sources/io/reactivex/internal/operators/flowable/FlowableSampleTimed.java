package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSampleTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class SampleTimedEmitLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                emit();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onComplete();
                }
            }
        }

        public SampleTimedEmitLast(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            super(interfaceC44417c, j11, timeUnit, scheduler);
            this.wip = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void complete() {
            emit();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onComplete();
            }
        }
    }

    public static final class SampleTimedNoLast<T> extends SampleTimedSubscriber<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        @Override // io.reactivex.internal.operators.flowable.FlowableSampleTimed.SampleTimedSubscriber
        public void complete() {
            this.downstream.onComplete();
        }

        public SampleTimedNoLast(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            super(interfaceC44417c, j11, timeUnit, scheduler);
        }

        @Override // java.lang.Runnable
        public void run() {
            emit();
        }
    }

    public static abstract class SampleTimedSubscriber<T> extends AtomicReference<T> implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final InterfaceC44417c<? super T> downstream;
        final long period;
        final Scheduler scheduler;
        final TimeUnit unit;
        InterfaceC44418d upstream;
        final AtomicLong requested = new AtomicLong();
        final SequentialDisposable timer = new SequentialDisposable();

        public abstract void complete();

        public void emit() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(andSet);
                    BackpressureHelper.produced(this.requested, 1L);
                } else {
                    cancel();
                    this.downstream.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
                }
            }
        }

        public void cancelTimer() {
            DisposableHelper.dispose(this.timer);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                SequentialDisposable sequentialDisposable = this.timer;
                Scheduler scheduler = this.scheduler;
                long j11 = this.period;
                sequentialDisposable.replace(scheduler.schedulePeriodicallyDirect(this, j11, j11, this.unit));
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public SampleTimedSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = interfaceC44417c;
            this.period = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            cancelTimer();
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            cancelTimer();
            complete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            cancelTimer();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            lazySet(t11);
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
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC44417c);
        if (this.emitLast) {
            this.source.subscribe((FlowableSubscriber) new SampleTimedEmitLast(serializedSubscriber, this.period, this.unit, this.scheduler));
        } else {
            this.source.subscribe((FlowableSubscriber) new SampleTimedNoLast(serializedSubscriber, this.period, this.unit, this.scheduler));
        }
    }

    public FlowableSampleTimed(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        super(flowable);
        this.period = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z11;
    }
}
