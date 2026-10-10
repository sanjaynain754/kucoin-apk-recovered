package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {
    final ObservableSource<T> source;

    public static final class LastObserver<T> implements Observer<T>, Disposable {
        final MaybeObserver<? super T> downstream;
        T item;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            T t11 = this.item;
            if (t11 == null) {
                this.downstream.onComplete();
            } else {
                this.item = null;
                this.downstream.onSuccess(t11);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.upstream = DisposableHelper.DISPOSED;
            this.item = null;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.item = t11;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public LastObserver(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new LastObserver(maybeObserver));
    }

    public ObservableLastMaybe(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }
}
