package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeZipArray<T, R> extends Maybe<R> {
    final MaybeSource<? extends T>[] sources;
    final Function<? super Object[], ? extends R> zipper;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t11) throws Exception {
            return (R) ObjectHelper.requireNonNull(MaybeZipArray.this.zipper.apply(new Object[]{t11}), "The zipper returned a null value");
        }
    }

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = -5556924161382950569L;
        final MaybeObserver<? super R> downstream;
        final ZipMaybeObserver<T>[] observers;
        final Object[] values;
        final Function<? super Object[], ? extends R> zipper;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver<T> zipMaybeObserver : this.observers) {
                    zipMaybeObserver.dispose();
                }
            }
        }

        public void innerComplete(int i11) {
            if (getAndSet(0) > 0) {
                disposeExcept(i11);
                this.downstream.onComplete();
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
            ZipMaybeObserver<T>[] zipMaybeObserverArr = this.observers;
            int length = zipMaybeObserverArr.length;
            for (int i12 = 0; i12 < i11; i12++) {
                zipMaybeObserverArr[i12].dispose();
            }
            while (true) {
                i11++;
                if (i11 >= length) {
                    return;
                } else {
                    zipMaybeObserverArr[i11].dispose();
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

        public ZipCoordinator(MaybeObserver<? super R> maybeObserver, int i11, Function<? super Object[], ? extends R> function) {
            super(i11);
            this.downstream = maybeObserver;
            this.zipper = function;
            ZipMaybeObserver<T>[] zipMaybeObserverArr = new ZipMaybeObserver[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                zipMaybeObserverArr[i12] = new ZipMaybeObserver<>(this, i12);
            }
            this.observers = zipMaybeObserverArr;
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

    public static final class ZipMaybeObserver<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.parent.innerError(th2, this.index);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            this.parent.innerSuccess(t11, this.index);
        }

        public ZipMaybeObserver(ZipCoordinator<T, ?> zipCoordinator, int i11) {
            this.parent = zipCoordinator;
            this.index = i11;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        MaybeSource<? extends T>[] maybeSourceArr = this.sources;
        int length = maybeSourceArr.length;
        if (length == 1) {
            maybeSourceArr[0].subscribe(new MaybeMap.MapMaybeObserver(maybeObserver, new SingletonArrayFunc()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(maybeObserver, length, this.zipper);
        maybeObserver.onSubscribe(zipCoordinator);
        for (int i11 = 0; i11 < length && !zipCoordinator.getDisposed(); i11++) {
            MaybeSource<? extends T> maybeSource = maybeSourceArr[i11];
            if (maybeSource == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i11);
                return;
            }
            maybeSource.subscribe(zipCoordinator.observers[i11]);
        }
    }

    public MaybeZipArray(MaybeSource<? extends T>[] maybeSourceArr, Function<? super Object[], ? extends R> function) {
        this.sources = maybeSourceArr;
        this.zipper = function;
    }
}
