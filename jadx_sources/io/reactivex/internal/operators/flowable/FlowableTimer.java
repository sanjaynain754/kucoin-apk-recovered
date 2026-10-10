package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTimer extends Flowable<Long> {
    final long delay;
    final Scheduler scheduler;
    final TimeUnit unit;

    public static final class TimerSubscriber extends AtomicReference<Disposable> implements InterfaceC44418d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final InterfaceC44417c<? super Long> downstream;
        volatile boolean requested;

        public TimerSubscriber(InterfaceC44417c<? super Long> interfaceC44417c) {
            this.downstream = interfaceC44417c;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (this.requested) {
                    this.downstream.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                } else {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Long> interfaceC44417c) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(interfaceC44417c);
        interfaceC44417c.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.scheduler.scheduleDirect(timerSubscriber, this.delay, this.unit));
    }

    public FlowableTimer(long j11, TimeUnit timeUnit, Scheduler scheduler) {
        this.delay = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }
}
