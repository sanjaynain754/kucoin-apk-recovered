package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableReduceSeedSingle<T, R> extends Single<R> {
    final BiFunction<R, ? super T, R> reducer;
    final R seed;
    final ObservableSource<T> source;

    public static final class ReduceSeedObserver<T, R> implements Observer<T>, Disposable {
        final SingleObserver<? super R> downstream;
        final BiFunction<R, ? super T, R> reducer;
        Disposable upstream;
        R value;

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
            R r11 = this.value;
            if (r11 != null) {
                this.value = null;
                this.downstream.onSuccess(r11);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.value == null) {
                RxJavaPlugins.onError(th2);
            } else {
                this.value = null;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            R r11 = this.value;
            if (r11 != null) {
                try {
                    this.value = (R) ObjectHelper.requireNonNull(this.reducer.apply(r11, t11), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public ReduceSeedObserver(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r11) {
            this.downstream = singleObserver;
            this.value = r11;
            this.reducer = biFunction;
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new ReduceSeedObserver(singleObserver, this.reducer, this.seed));
    }

    public ObservableReduceSeedSingle(ObservableSource<T> observableSource, R r11, BiFunction<R, ? super T, R> biFunction) {
        this.source = observableSource;
        this.seed = r11;
        this.reducer = biFunction;
    }
}
