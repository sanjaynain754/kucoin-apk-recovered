package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleDelay<T> extends Single<T> {
    final boolean delayError;
    final Scheduler scheduler;
    final SingleSource<? extends T> source;
    final long time;
    final TimeUnit unit;

    public final class Delay implements SingleObserver<T> {
        final SingleObserver<? super T> downstream;

        /* JADX INFO: renamed from: sd */
        private final SequentialDisposable f87194sd;

        public final class OnError implements Runnable {

            /* JADX INFO: renamed from: e */
            private final Throwable f87195e;

            public OnError(Throwable th2) {
                this.f87195e = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onError(this.f87195e);
            }
        }

        public final class OnSuccess implements Runnable {
            private final T value;

            public OnSuccess(T t11) {
                this.value = t11;
            }

            @Override // java.lang.Runnable
            public void run() {
                Delay.this.downstream.onSuccess(this.value);
            }
        }

        public Delay(SequentialDisposable sequentialDisposable, SingleObserver<? super T> singleObserver) {
            this.f87194sd = sequentialDisposable;
            this.downstream = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            SequentialDisposable sequentialDisposable = this.f87194sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnError onError = new OnError(th2);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onError, singleDelay.delayError ? singleDelay.time : 0L, singleDelay.unit));
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f87194sd.replace(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t11) {
            SequentialDisposable sequentialDisposable = this.f87194sd;
            Scheduler scheduler = SingleDelay.this.scheduler;
            OnSuccess onSuccess = new OnSuccess(t11);
            SingleDelay singleDelay = SingleDelay.this;
            sequentialDisposable.replace(scheduler.scheduleDirect(onSuccess, singleDelay.time, singleDelay.unit));
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        singleObserver.onSubscribe(sequentialDisposable);
        this.source.subscribe(new Delay(sequentialDisposable, singleObserver));
    }

    public SingleDelay(SingleSource<? extends T> singleSource, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        this.source = singleSource;
        this.time = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z11;
    }
}
