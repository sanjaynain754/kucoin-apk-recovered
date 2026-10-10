package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableDelay extends Completable {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final CompletableSource source;
    final TimeUnit unit;

    public static final class Delay extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final CompletableObserver downstream;
        Throwable error;
        final Scheduler scheduler;
        final TimeUnit unit;

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delay, this.unit));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.error = th2;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delayError ? this.delay : 0L, this.unit));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.error;
            this.error = null;
            if (th2 != null) {
                this.downstream.onError(th2);
            } else {
                this.downstream.onComplete();
            }
        }

        public Delay(CompletableObserver completableObserver, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
            this.downstream = completableObserver;
            this.delay = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.delayError = z11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new Delay(completableObserver, this.delay, this.unit, this.scheduler, this.delayError));
    }

    public CompletableDelay(CompletableSource completableSource, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z11) {
        this.source = completableSource;
        this.delay = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z11;
    }
}
