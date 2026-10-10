package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableFromObservable<T> extends Completable {
    final ObservableSource<T> observable;

    public static final class CompletableFromObservableObserver<T> implements Observer<T> {

        /* JADX INFO: renamed from: co */
        final CompletableObserver f87134co;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f87134co.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f87134co.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f87134co.onSubscribe(disposable);
        }

        public CompletableFromObservableObserver(CompletableObserver completableObserver) {
            this.f87134co = completableObserver;
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.observable.subscribe(new CompletableFromObservableObserver(completableObserver));
    }

    public CompletableFromObservable(ObservableSource<T> observableSource) {
        this.observable = observableSource;
    }
}
