package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleZipIterable<T, R> extends Single<R> {
    final Iterable<? extends SingleSource<? extends T>> sources;
    final Function<? super Object[], ? extends R> zipper;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t11) throws Exception {
            return (R) ObjectHelper.requireNonNull(SingleZipIterable.this.zipper.apply(new Object[]{t11}), "The zipper returned a null value");
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        SingleSource[] singleSourceArr = new SingleSource[8];
        try {
            int i11 = 0;
            for (SingleSource<? extends T> singleSource : this.sources) {
                if (singleSource == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), singleObserver);
                    return;
                }
                if (i11 == singleSourceArr.length) {
                    singleSourceArr = (SingleSource[]) Arrays.copyOf(singleSourceArr, (i11 >> 2) + i11);
                }
                int i12 = i11 + 1;
                singleSourceArr[i11] = singleSource;
                i11 = i12;
            }
            if (i11 == 0) {
                EmptyDisposable.error(new NoSuchElementException(), singleObserver);
                return;
            }
            if (i11 == 1) {
                singleSourceArr[0].subscribe(new SingleMap.MapSingleObserver(singleObserver, new SingletonArrayFunc()));
                return;
            }
            SingleZipArray.ZipCoordinator zipCoordinator = new SingleZipArray.ZipCoordinator(singleObserver, i11, this.zipper);
            singleObserver.onSubscribe(zipCoordinator);
            for (int i13 = 0; i13 < i11 && !zipCoordinator.getDisposed(); i13++) {
                singleSourceArr[i13].subscribe(zipCoordinator.observers[i13]);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public SingleZipIterable(Iterable<? extends SingleSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        this.sources = iterable;
        this.zipper = function;
    }
}
