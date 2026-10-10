package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Arrays;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeZipIterable<T, R> extends Maybe<R> {
    final Iterable<? extends MaybeSource<? extends T>> sources;
    final Function<? super Object[], ? extends R> zipper;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t11) throws Exception {
            return (R) ObjectHelper.requireNonNull(MaybeZipIterable.this.zipper.apply(new Object[]{t11}), "The zipper returned a null value");
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        MaybeSource[] maybeSourceArr = new MaybeSource[8];
        try {
            int i11 = 0;
            for (MaybeSource<? extends T> maybeSource : this.sources) {
                if (maybeSource == null) {
                    EmptyDisposable.error(new NullPointerException("One of the sources is null"), maybeObserver);
                    return;
                }
                if (i11 == maybeSourceArr.length) {
                    maybeSourceArr = (MaybeSource[]) Arrays.copyOf(maybeSourceArr, (i11 >> 2) + i11);
                }
                int i12 = i11 + 1;
                maybeSourceArr[i11] = maybeSource;
                i11 = i12;
            }
            if (i11 == 0) {
                EmptyDisposable.complete(maybeObserver);
                return;
            }
            if (i11 == 1) {
                maybeSourceArr[0].subscribe(new MaybeMap.MapMaybeObserver(maybeObserver, new SingletonArrayFunc()));
                return;
            }
            MaybeZipArray.ZipCoordinator zipCoordinator = new MaybeZipArray.ZipCoordinator(maybeObserver, i11, this.zipper);
            maybeObserver.onSubscribe(zipCoordinator);
            for (int i13 = 0; i13 < i11 && !zipCoordinator.getDisposed(); i13++) {
                maybeSourceArr[i13].subscribe(zipCoordinator.observers[i13]);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, maybeObserver);
        }
    }

    public MaybeZipIterable(Iterable<? extends MaybeSource<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        this.sources = iterable;
        this.zipper = function;
    }
}
