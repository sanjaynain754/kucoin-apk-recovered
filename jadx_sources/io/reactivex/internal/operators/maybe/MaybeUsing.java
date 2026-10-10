package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeUsing<T, D> extends Maybe<T> {
    final boolean eager;
    final Consumer<? super D> resourceDisposer;
    final Callable<? extends D> resourceSupplier;
    final Function<? super D, ? extends MaybeSource<? extends T>> sourceSupplier;

    public static final class UsingObserver<T, D> extends AtomicReference<Object> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = -674404550052917487L;
        final Consumer<? super D> disposer;
        final MaybeObserver<? super T> downstream;
        final boolean eager;
        Disposable upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            disposeResourceAfter();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream.getDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.upstream = DisposableHelper.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
            this.downstream.onComplete();
            if (this.eager) {
                return;
            }
            disposeResourceAfter();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.upstream = DisposableHelper.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.downstream.onError(th2);
            if (this.eager) {
                return;
            }
            disposeResourceAfter();
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            this.upstream = DisposableHelper.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
            this.downstream.onSuccess(t11);
            if (this.eager) {
                return;
            }
            disposeResourceAfter();
        }

        public UsingObserver(MaybeObserver<? super T> maybeObserver, D d11, Consumer<? super D> consumer, boolean z11) {
            super(d11);
            this.downstream = maybeObserver;
            this.disposer = consumer;
            this.eager = z11;
        }

        public void disposeResourceAfter() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        try {
            D dCall = this.resourceSupplier.call();
            try {
                ((MaybeSource) ObjectHelper.requireNonNull(this.sourceSupplier.apply(dCall), "The sourceSupplier returned a null MaybeSource")).subscribe(new UsingObserver(maybeObserver, dCall, this.resourceDisposer, this.eager));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                if (this.eager) {
                    try {
                        this.resourceDisposer.accept(dCall);
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        EmptyDisposable.error(new CompositeException(th2, th3), maybeObserver);
                        return;
                    }
                }
                EmptyDisposable.error(th2, maybeObserver);
                if (this.eager) {
                    return;
                }
                try {
                    this.resourceDisposer.accept(dCall);
                } catch (Throwable th4) {
                    Exceptions.throwIfFatal(th4);
                    RxJavaPlugins.onError(th4);
                }
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            EmptyDisposable.error(th5, maybeObserver);
        }
    }

    public MaybeUsing(Callable<? extends D> callable, Function<? super D, ? extends MaybeSource<? extends T>> function, Consumer<? super D> consumer, boolean z11) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.resourceDisposer = consumer;
        this.eager = z11;
    }
}
