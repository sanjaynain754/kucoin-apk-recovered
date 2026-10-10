package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableDetach<T> extends AbstractObservableWithUpstream<T, T> {

    public static final class DetachObserver<T> implements Observer<T>, Disposable {
        Observer<? super T> downstream;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.upstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Observer<? super T> observer = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asObserver();
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            Observer<? super T> observer = this.downstream;
            this.upstream = EmptyComponent.INSTANCE;
            this.downstream = EmptyComponent.asObserver();
            observer.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public DetachObserver(Observer<? super T> observer) {
            this.downstream = observer;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DetachObserver(observer));
    }

    public ObservableDetach(ObservableSource<T> observableSource) {
        super(observableSource);
    }
}
