package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        long count;
        final T defaultValue;
        boolean done;
        final Observer<? super T> downstream;
        final boolean errorOnFewer;
        final long index;
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
            T t11 = this.defaultValue;
            if (t11 == null && this.errorOnFewer) {
                this.downstream.onError(new NoSuchElementException());
                return;
            }
            if (t11 != null) {
                this.downstream.onNext(t11);
            }
            this.downstream.onComplete();
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
            long j11 = this.count;
            if (j11 != this.index) {
                this.count = j11 + 1;
                return;
            }
            this.done = true;
            this.upstream.dispose();
            this.downstream.onNext(t11);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public ElementAtObserver(Observer<? super T> observer, long j11, T t11, boolean z11) {
            this.downstream = observer;
            this.index = j11;
            this.defaultValue = t11;
            this.errorOnFewer = z11;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new ElementAtObserver(observer, this.index, this.defaultValue, this.errorOnFewer));
    }

    public ObservableElementAt(ObservableSource<T> observableSource, long j11, T t11, boolean z11) {
        super(observableSource);
        this.index = j11;
        this.defaultValue = t11;
        this.errorOnFewer = z11;
    }
}
