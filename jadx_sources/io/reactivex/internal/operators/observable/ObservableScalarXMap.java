package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p002a0.C0005a;

/* JADX INFO: loaded from: classes23.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
        static final int FUSED = 1;
        static final int ON_COMPLETE = 3;
        static final int ON_NEXT = 2;
        static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        final Observer<? super T> observer;
        final T value;

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(T t11, T t12) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public ScalarDisposable(Observer<? super T> observer, T t11) {
            this.observer = observer;
            this.value = t11;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == 3) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (get() != 1) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            if (get() == 1) {
                lazySet(3);
                return this.value;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static final class ScalarXMapObservable<T, R> extends Observable<R> {
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        final T value;

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer<? super R> observer) {
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null ObservableSource");
                if (!(observableSource instanceof Callable)) {
                    observableSource.subscribe(observer);
                    return;
                }
                try {
                    Object objCall = ((Callable) observableSource).call();
                    if (objCall == null) {
                        EmptyDisposable.complete(observer);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(observer, objCall);
                    observer.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptyDisposable.error(th2, observer);
                }
            } catch (Throwable th3) {
                EmptyDisposable.error(th3, observer);
            }
        }

        public ScalarXMapObservable(T t11, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.value = t11;
            this.mapper = function;
        }
    }

    public static <T, U> Observable<U> scalarXMap(T t11, Function<? super T, ? extends ObservableSource<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapObservable(t11, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(ObservableSource<T> observableSource, Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            C0005a c0005a = (Object) ((Callable) observableSource).call();
            if (c0005a == null) {
                EmptyDisposable.complete(observer);
                return true;
            }
            try {
                ObservableSource observableSource2 = (ObservableSource) ObjectHelper.requireNonNull(function.apply(c0005a), "The mapper returned a null ObservableSource");
                if (observableSource2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) observableSource2).call();
                        if (objCall == null) {
                            EmptyDisposable.complete(observer);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(observer, objCall);
                        observer.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        EmptyDisposable.error(th2, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptyDisposable.error(th3, observer);
                return true;
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptyDisposable.error(th4, observer);
            return true;
        }
    }

    private ObservableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }
}
