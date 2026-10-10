package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {
    final Callable<U> collectionSupplier;
    final ObservableSource<T> source;

    public static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        U collection;
        final SingleObserver<? super U> downstream;
        Disposable upstream;

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.collection = null;
            this.downstream.onError(th2);
        }

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
            U u11 = this.collection;
            this.collection = null;
            this.downstream.onSuccess(u11);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.collection.add(t11);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public ToListObserver(SingleObserver<? super U> singleObserver, U u11) {
            this.downstream = singleObserver;
            this.collection = u11;
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, int i11) {
        this.source = observableSource;
        this.collectionSupplier = Functions.createArrayList(i11);
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableToList(this.source, this.collectionSupplier));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.source.subscribe(new ToListObserver(singleObserver, (Collection) ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }

    public ObservableToListSingle(ObservableSource<T> observableSource, Callable<U> callable) {
        this.source = observableSource;
        this.collectionSupplier = callable;
    }
}
