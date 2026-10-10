package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableWithLatestFromMany<T, R> extends AbstractObservableWithUpstream<T, R> {

    @NonNull
    final Function<? super Object[], R> combiner;

    @Nullable
    final ObservableSource<?>[] otherArray;

    @Nullable
    final Iterable<? extends ObservableSource<?>> otherIterable;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t11) throws Exception {
            return (R) ObjectHelper.requireNonNull(ObservableWithLatestFromMany.this.combiner.apply(new Object[]{t11}), "The combiner returned a null value");
        }
    }

    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 1577321883966341961L;
        final Function<? super Object[], R> combiner;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable error;
        final WithLatestInnerObserver[] observers;
        final AtomicReference<Disposable> upstream;
        final AtomicReferenceArray<Object> values;

        public void innerError(int i11, Throwable th2) {
            this.done = true;
            DisposableHelper.dispose(this.upstream);
            cancelAllBut(i11);
            HalfSerializer.onError(this.downstream, th2, this, this.error);
        }

        public void cancelAllBut(int i11) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.observers;
            for (int i12 = 0; i12 < withLatestInnerObserverArr.length; i12++) {
                if (i12 != i11) {
                    withLatestInnerObserverArr[i12].dispose();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            for (WithLatestInnerObserver withLatestInnerObserver : this.observers) {
                withLatestInnerObserver.dispose();
            }
        }

        public void innerComplete(int i11, boolean z11) {
            if (z11) {
                return;
            }
            this.done = true;
            cancelAllBut(i11);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        public void innerNext(int i11, Object obj) {
            this.values.set(i11, obj);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            HalfSerializer.onError(this.downstream, th2, this, this.error);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i11 = 0;
            objArr[0] = t11;
            while (i11 < length) {
                Object obj = atomicReferenceArray.get(i11);
                if (obj == null) {
                    return;
                }
                i11++;
                objArr[i11] = obj;
            }
            try {
                HalfSerializer.onNext(this.downstream, ObjectHelper.requireNonNull(this.combiner.apply(objArr), "combiner returned a null value"), this, this.error);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        public void subscribe(ObservableSource<?>[] observableSourceArr, int i11) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.observers;
            AtomicReference<Disposable> atomicReference = this.upstream;
            for (int i12 = 0; i12 < i11 && !DisposableHelper.isDisposed(atomicReference.get()) && !this.done; i12++) {
                observableSourceArr[i12].subscribe(withLatestInnerObserverArr[i12]);
            }
        }

        public WithLatestFromObserver(Observer<? super R> observer, Function<? super Object[], R> function, int i11) {
            this.downstream = observer;
            this.combiner = function;
            WithLatestInnerObserver[] withLatestInnerObserverArr = new WithLatestInnerObserver[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                withLatestInnerObserverArr[i12] = new WithLatestInnerObserver(this, i12);
            }
            this.observers = withLatestInnerObserverArr;
            this.values = new AtomicReferenceArray<>(i11);
            this.upstream = new AtomicReference<>();
            this.error = new AtomicThrowable();
        }
    }

    public static final class WithLatestInnerObserver extends AtomicReference<Disposable> implements Observer<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final WithLatestFromObserver<?, ?> parent;

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        public WithLatestInnerObserver(WithLatestFromObserver<?, ?> withLatestFromObserver, int i11) {
            this.parent = withLatestFromObserver;
            this.index = i11;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    public ObservableWithLatestFromMany(@NonNull ObservableSource<T> observableSource, @NonNull ObservableSource<?>[] observableSourceArr, @NonNull Function<? super Object[], R> function) {
        super(observableSource);
        this.otherArray = observableSourceArr;
        this.otherIterable = null;
        this.combiner = function;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        int length;
        ObservableSource<?>[] observableSourceArr = this.otherArray;
        if (observableSourceArr == null) {
            observableSourceArr = new ObservableSource[8];
            try {
                length = 0;
                for (ObservableSource<?> observableSource : this.otherIterable) {
                    if (length == observableSourceArr.length) {
                        observableSourceArr = (ObservableSource[]) Arrays.copyOf(observableSourceArr, (length >> 1) + length);
                    }
                    int i11 = length + 1;
                    observableSourceArr[length] = observableSource;
                    length = i11;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
                return;
            }
        } else {
            length = observableSourceArr.length;
        }
        if (length == 0) {
            new ObservableMap(this.source, new SingletonArrayFunc()).subscribeActual(observer);
            return;
        }
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(observer, this.combiner, length);
        observer.onSubscribe(withLatestFromObserver);
        withLatestFromObserver.subscribe(observableSourceArr, length);
        this.source.subscribe(withLatestFromObserver);
    }

    public ObservableWithLatestFromMany(@NonNull ObservableSource<T> observableSource, @NonNull Iterable<? extends ObservableSource<?>> iterable, @NonNull Function<? super Object[], R> function) {
        super(observableSource);
        this.otherArray = null;
        this.otherIterable = iterable;
        this.combiner = function;
    }
}
