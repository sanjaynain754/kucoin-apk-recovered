package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableFromArray<T> extends Observable<T> {
    final T[] array;

    public static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {
        final T[] array;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        boolean fusionMode;
        int index;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.array.length;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i11 = this.index;
            T[] tArr = this.array;
            if (i11 == tArr.length) {
                return null;
            }
            this.index = i11 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i11], "The array element is null");
        }

        public void run() {
            T[] tArr = this.array;
            int length = tArr.length;
            for (int i11 = 0; i11 < length && !getDisposed(); i11++) {
                T t11 = tArr[i11];
                if (t11 == null) {
                    this.downstream.onError(new NullPointerException("The element at index " + i11 + " is null"));
                    return;
                }
                this.downstream.onNext(t11);
            }
            if (getDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }

        public FromArrayDisposable(Observer<? super T> observer, T[] tArr) {
            this.downstream = observer;
            this.array = tArr;
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, this.array);
        observer.onSubscribe(fromArrayDisposable);
        if (fromArrayDisposable.fusionMode) {
            return;
        }
        fromArrayDisposable.run();
    }

    public ObservableFromArray(T[] tArr) {
        this.array = tArr;
    }
}
