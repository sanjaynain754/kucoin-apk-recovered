package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes23.dex */
public final class MaybeObserveOn<T> extends AbstractMaybeWithUpstream<T, T> {
    final Scheduler scheduler;

    public static final class ObserveOnMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final MaybeObserver<? super T> downstream;
        Throwable error;
        final Scheduler scheduler;
        T value;

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.error = th2;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            this.value = t11;
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.error;
            if (th2 != null) {
                this.error = null;
                this.downstream.onError(th2);
                return;
            }
            T t11 = this.value;
            if (t11 == null) {
                this.downstream.onComplete();
            } else {
                this.value = null;
                this.downstream.onSuccess(t11);
            }
        }

        public ObserveOnMaybeObserver(MaybeObserver<? super T> maybeObserver, Scheduler scheduler) {
            this.downstream = maybeObserver;
            this.scheduler = scheduler;
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

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new ObserveOnMaybeObserver(maybeObserver, this.scheduler));
    }

    public MaybeObserveOn(MaybeSource<T> maybeSource, Scheduler scheduler) {
        super(maybeSource);
        this.scheduler = scheduler;
    }
}
