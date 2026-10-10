package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableThrottleLatest<T> extends AbstractObservableWithUpstream<T, T> {
    final boolean emitLast;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    public static final class ThrottleLatestObserver<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final Observer<? super T> downstream;
        final boolean emitLast;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        Disposable upstream;
        final Scheduler.Worker worker;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.latest.set(t11);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public ThrottleLatestObserver(Observer<? super T> observer, long j11, TimeUnit timeUnit, Scheduler.Worker worker, boolean z11) {
            this.downstream = observer;
            this.timeout = j11;
            this.unit = timeUnit;
            this.worker = worker;
            this.emitLast = z11;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.latest;
                Observer<? super T> observer = this.downstream;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    boolean z12 = this.done;
                    if (z12 && this.error != null) {
                        atomicReference.lazySet(null);
                        observer.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                    if (atomicReference.get() == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12) {
                        T andSet = atomicReference.getAndSet(null);
                        if (!z11 && this.emitLast) {
                            observer.onNext(andSet);
                        }
                        observer.onComplete();
                        this.worker.dispose();
                        return;
                    }
                    if (z11) {
                        if (this.timerFired) {
                            this.timerRunning = false;
                            this.timerFired = false;
                        }
                    } else if (!this.timerRunning || this.timerFired) {
                        observer.onNext(atomicReference.getAndSet(null));
                        this.timerFired = false;
                        this.timerRunning = true;
                        this.worker.schedule(this, this.timeout, this.unit);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new ThrottleLatestObserver(observer, this.timeout, this.unit, this.scheduler.createWorker(), this.emitLast));
    }

    public ObservableThrottleLatest(Observable<T> observable, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        super(observable);
        this.timeout = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z11;
    }
}
