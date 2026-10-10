package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableRepeat<T> extends AbstractObservableWithUpstream<T, T> {
    final long count;

    public static final class RepeatObserver<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final Observer<? super T> downstream;
        long remaining;

        /* JADX INFO: renamed from: sd */
        final SequentialDisposable f87180sd;
        final ObservableSource<? extends T> source;

        @Override // io.reactivex.Observer
        public void onComplete() {
            long j11 = this.remaining;
            if (j11 != Long.MAX_VALUE) {
                this.remaining = j11 - 1;
            }
            if (j11 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f87180sd.replace(disposable);
        }

        public RepeatObserver(Observer<? super T> observer, long j11, SequentialDisposable sequentialDisposable, ObservableSource<? extends T> observableSource) {
            this.downstream = observer;
            this.f87180sd = sequentialDisposable;
            this.source = observableSource;
            this.remaining = j11;
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.f87180sd.getDisposed()) {
                    this.source.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        long j11 = this.count;
        new RepeatObserver(observer, j11 != Long.MAX_VALUE ? j11 - 1 : Long.MAX_VALUE, sequentialDisposable, this.source).subscribeNext();
    }

    public ObservableRepeat(Observable<T> observable, long j11) {
        super(observable);
        this.count = j11;
    }
}
