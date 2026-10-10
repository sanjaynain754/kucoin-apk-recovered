package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {
    final long limit;

    public static final class TakeObserver<T> implements Observer<T>, Disposable {
        boolean done;
        final Observer<? super T> downstream;
        long remaining;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream.getDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.upstream.dispose();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.upstream.dispose();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            long j11 = this.remaining;
            long j12 = j11 - 1;
            this.remaining = j12;
            if (j11 > 0) {
                boolean z11 = j12 == 0;
                this.downstream.onNext(t11);
                if (z11) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                if (this.remaining != 0) {
                    this.downstream.onSubscribe(this);
                    return;
                }
                this.done = true;
                disposable.dispose();
                EmptyDisposable.complete(this.downstream);
            }
        }

        public TakeObserver(Observer<? super T> observer, long j11) {
            this.downstream = observer;
            this.remaining = j11;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new TakeObserver(observer, this.limit));
    }

    public ObservableTake(ObservableSource<T> observableSource, long j11) {
        super(observableSource);
        this.limit = j11;
    }
}
