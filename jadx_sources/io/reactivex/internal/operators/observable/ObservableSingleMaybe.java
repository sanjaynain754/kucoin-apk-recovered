package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {
    final ObservableSource<T> source;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        boolean done;
        final MaybeObserver<? super T> downstream;
        Disposable upstream;
        T value;

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
            T t11 = this.value;
            this.value = null;
            if (t11 == null) {
                this.downstream.onComplete();
            } else {
                this.downstream.onSuccess(t11);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.value == null) {
                this.value = t11;
                return;
            }
            this.done = true;
            this.upstream.dispose();
            this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public SingleElementObserver(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new SingleElementObserver(maybeObserver));
    }

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }
}
