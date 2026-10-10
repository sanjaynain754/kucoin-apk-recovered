package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {
        final Observer<? super T> downstream;
        Disposable upstream;
        T value;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.value = null;
            this.upstream.dispose();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.value = null;
            this.downstream.onError(th2);
        }

        public void emit() {
            T t11 = this.value;
            if (t11 != null) {
                this.value = null;
                this.downstream.onNext(t11);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.value = t11;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public TakeLastOneObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            emit();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new TakeLastOneObserver(observer));
    }

    public ObservableTakeLastOne(ObservableSource<T> observableSource) {
        super(observableSource);
    }
}
