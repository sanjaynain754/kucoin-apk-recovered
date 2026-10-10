package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableUsing<T, D> extends Observable<T> {
    final Consumer<? super D> disposer;
    final boolean eager;
    final Callable<? extends D> resourceSupplier;
    final Function<? super D, ? extends ObservableSource<? extends T>> sourceSupplier;

    public static final class UsingObserver<T, D> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = 5904473792286235046L;
        final Consumer<? super D> disposer;
        final Observer<? super T> downstream;
        final boolean eager;
        final D resource;
        Disposable upstream;

        public void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.eager) {
                this.downstream.onComplete();
                this.upstream.dispose();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
            this.upstream.dispose();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!this.eager) {
                this.downstream.onError(th2);
                this.upstream.dispose();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.upstream.dispose();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public UsingObserver(Observer<? super T> observer, D d11, Consumer<? super D> consumer, boolean z11) {
            this.downstream = observer;
            this.resource = d11;
            this.disposer = consumer;
            this.eager = z11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            disposeAfter();
            this.upstream.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return get();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        try {
            D dCall = this.resourceSupplier.call();
            try {
                ((ObservableSource) ObjectHelper.requireNonNull(this.sourceSupplier.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new UsingObserver(observer, dCall, this.disposer, this.eager));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    this.disposer.accept(dCall);
                    EmptyDisposable.error(th2, observer);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    EmptyDisposable.error(new CompositeException(th2, th3), observer);
                }
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptyDisposable.error(th4, observer);
        }
    }

    public ObservableUsing(Callable<? extends D> callable, Function<? super D, ? extends ObservableSource<? extends T>> function, Consumer<? super D> consumer, boolean z11) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.disposer = consumer;
        this.eager = z11;
    }
}
