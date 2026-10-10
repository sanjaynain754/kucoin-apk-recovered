package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleZipArray<T, R> extends Single<R> {
    final SingleSource<? extends T>[] sources;
    final Function<? super Object[], ? extends R> zipper;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t11) throws Exception {
            return (R) ObjectHelper.requireNonNull(SingleZipArray.this.zipper.apply(new Object[]{t11}), "The zipper returned a null value");
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final SingleObserver<? super R> downstream;
        final ZipSingleObserver<T>[] observers;
        final Object[] values;
        final Function<? super Object[], ? extends R> zipper;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipSingleObserver<T> zipSingleObserver : this.observers) {
                    zipSingleObserver.dispose();
                }
            }
        }

        public void innerError(Throwable th2, int i11) {
            if (getAndSet(0) <= 0) {
                RxJavaPlugins.onError(th2);
            } else {
                disposeExcept(i11);
                this.downstream.onError(th2);
            }
        }

        public void disposeExcept(int i11) {
            ZipSingleObserver<T>[] zipSingleObserverArr = this.observers;
            int length = zipSingleObserverArr.length;
            for (int i12 = 0; i12 < i11; i12++) {
                zipSingleObserverArr[i12].dispose();
            }
            while (true) {
                i11++;
                if (i11 >= length) {
                    return;
                } else {
                    zipSingleObserverArr[i11].dispose();
                }
            }
        }

        public void innerSuccess(T t11, int i11) {
            this.values[i11] = t11;
            if (decrementAndGet() == 0) {
                try {
                    this.downstream.onSuccess(ObjectHelper.requireNonNull(this.zipper.apply(this.values), "The zipper returned a null value"));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                }
            }
        }

        public ZipCoordinator(SingleObserver<? super R> singleObserver, int i11, Function<? super Object[], ? extends R> function) {
            super(i11);
            this.downstream = singleObserver;
            this.zipper = function;
            ZipSingleObserver<T>[] zipSingleObserverArr = new ZipSingleObserver[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                zipSingleObserverArr[i12] = new ZipSingleObserver<>(this, i12);
            }
            this.observers = zipSingleObserverArr;
            this.values = new Object[i11];
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() <= 0) {
                return true;
            }
            return false;
        }
    }

    public static final class ZipSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.parent.innerError(th2, this.index);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t11) {
            this.parent.innerSuccess(t11, this.index);
        }

        public ZipSingleObserver(ZipCoordinator<T, ?> zipCoordinator, int i11) {
            this.parent = zipCoordinator;
            this.index = i11;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        SingleSource<? extends T>[] singleSourceArr = this.sources;
        int length = singleSourceArr.length;
        if (length == 1) {
            singleSourceArr[0].subscribe(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(singleObserver, length, this.zipper);
        singleObserver.onSubscribe(zipCoordinator);
        for (int i11 = 0; i11 < length && !zipCoordinator.getDisposed(); i11++) {
            SingleSource<? extends T> singleSource = singleSourceArr[i11];
            if (singleSource == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i11);
                return;
            }
            singleSource.subscribe(zipCoordinator.observers[i11]);
        }
    }

    public SingleZipArray(SingleSource<? extends T>[] singleSourceArr, Function<? super Object[], ? extends R> function) {
        this.sources = singleSourceArr;
        this.zipper = function;
    }
}
