package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class CompletableAndThenObservable<R> extends Observable<R> {
    final ObservableSource<? extends R> other;
    final CompletableSource source;

    public static final class AndThenObservableObserver<R> extends AtomicReference<Disposable> implements Observer<R>, CompletableObserver, Disposable {
        private static final long serialVersionUID = -8948264376121066672L;
        final Observer<? super R> downstream;
        ObservableSource<? extends R> other;

        @Override // io.reactivex.Observer
        public void onComplete() {
            ObservableSource<? extends R> observableSource = this.other;
            if (observableSource == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                observableSource.subscribe(this);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(R r11) {
            this.downstream.onNext(r11);
        }

        public AndThenObservableObserver(Observer<? super R> observer, ObservableSource<? extends R> observableSource) {
            this.other = observableSource;
            this.downstream = observer;
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

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this, disposable);
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        AndThenObservableObserver andThenObservableObserver = new AndThenObservableObserver(observer, this.other);
        observer.onSubscribe(andThenObservableObserver);
        this.source.subscribe(andThenObservableObserver);
    }

    public CompletableAndThenObservable(CompletableSource completableSource, ObservableSource<? extends R> observableSource) {
        this.source = completableSource;
        this.other = observableSource;
    }
}
