package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTimeoutTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC44416b<? extends T> other;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class FallbackSubscriber<T> implements FlowableSubscriber<T> {
        final SubscriptionArbiter arbiter;
        final InterfaceC44417c<? super T> downstream;

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
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            this.arbiter.setSubscription(interfaceC44418d);
        }

        public FallbackSubscriber(InterfaceC44417c<? super T> interfaceC44417c, SubscriptionArbiter subscriptionArbiter) {
            this.downstream = interfaceC44417c;
            this.arbiter = subscriptionArbiter;
        }
    }

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final InterfaceC44417c<? super T> downstream;
        InterfaceC44416b<? extends T> fallback;
        final AtomicLong index;
        final SequentialDisposable task;
        final long timeout;
        final TimeUnit unit;
        final AtomicReference<InterfaceC44418d> upstream;
        final Scheduler.Worker worker;

        public TimeoutFallbackSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler.Worker worker, InterfaceC44416b<? extends T> interfaceC44416b) {
            super(true);
            this.downstream = interfaceC44417c;
            this.timeout = j11;
            this.unit = timeUnit;
            this.worker = worker;
            this.fallback = interfaceC44416b;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<>();
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th2);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            long j11 = this.index.get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = j11 + 1;
                if (this.index.compareAndSet(j11, j12)) {
                    this.task.get().dispose();
                    this.consumed++;
                    this.downstream.onNext(t11);
                    startTimeout(j12);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
                setSubscription(interfaceC44418d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j11) {
            if (this.index.compareAndSet(j11, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                long j12 = this.consumed;
                if (j12 != 0) {
                    produced(j12);
                }
                InterfaceC44416b<? extends T> interfaceC44416b = this.fallback;
                this.fallback = null;
                interfaceC44416b.subscribe(new FallbackSubscriber(this.downstream, this));
                this.worker.dispose();
            }
        }

        public void startTimeout(long j11) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j11, this), this.timeout, this.unit));
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, sh0.InterfaceC44418d
        public void cancel() {
            super.cancel();
            this.worker.dispose();
        }
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d, TimeoutSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final InterfaceC44417c<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final Scheduler.Worker worker;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
        }

        public void startTimeout(long j11) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j11, this), this.timeout, this.unit));
        }

        public TimeoutSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.downstream = interfaceC44417c;
            this.timeout = j11;
            this.unit = timeUnit;
            this.worker = worker;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            long j11 = get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = 1 + j11;
                if (compareAndSet(j11, j12)) {
                    this.task.get().dispose();
                    this.downstream.onNext(t11);
                    startTimeout(j12);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.worker.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th2);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j11) {
            if (compareAndSet(j11, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException(ExceptionHelper.timeoutMessage(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }
    }

    public interface TimeoutSupport {
        void onTimeout(long j11);
    }

    public static final class TimeoutTask implements Runnable {
        final long idx;
        final TimeoutSupport parent;

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onTimeout(this.idx);
        }

        public TimeoutTask(long j11, TimeoutSupport timeoutSupport) {
            this.idx = j11;
            this.parent = timeoutSupport;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(interfaceC44417c, this.timeout, this.unit, this.scheduler.createWorker());
            interfaceC44417c.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startTimeout(0L);
            this.source.subscribe((FlowableSubscriber) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(interfaceC44417c, this.timeout, this.unit, this.scheduler.createWorker(), this.other);
        interfaceC44417c.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startTimeout(0L);
        this.source.subscribe((FlowableSubscriber) timeoutFallbackSubscriber);
    }

    public FlowableTimeoutTimed(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler, InterfaceC44416b<? extends T> interfaceC44416b) {
        super(flowable);
        this.timeout = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.other = interfaceC44416b;
    }
}
