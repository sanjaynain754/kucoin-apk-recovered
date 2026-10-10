package io.reactivex.internal.operators.mixed;

import androidx.camera.view.C1454t;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSwitchMapCompletable<T> extends Completable {
    final boolean delayErrors;
    final Function<? super T, ? extends CompletableSource> mapper;
    final Flowable<T> source;

    public static final class SwitchMapCompletableObserver<T> implements FlowableSubscriber<T>, Disposable {
        static final SwitchMapInnerObserver INNER_DISPOSED = new SwitchMapInnerObserver(null);
        final boolean delayErrors;
        volatile boolean done;
        final CompletableObserver downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapInnerObserver> inner = new AtomicReference<>();
        final Function<? super T, ? extends CompletableSource> mapper;
        InterfaceC44418d upstream;

        public static final class SwitchMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -8003404460084760287L;
            final SwitchMapCompletableObserver<?> parent;

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                this.parent.innerError(this, th2);
            }

            public SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            if (this.inner.get() == null) {
                Throwable thTerminate = this.errors.terminate();
                if (thTerminate == null) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(thTerminate);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            disposeInner();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.inner;
            SwitchMapInnerObserver switchMapInnerObserver = INNER_DISPOSED;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        public void innerComplete(SwitchMapInnerObserver switchMapInnerObserver) {
            if (C1454t.m2255a(this.inner, switchMapInnerObserver, null) && this.done) {
                Throwable thTerminate = this.errors.terminate();
                if (thTerminate == null) {
                    this.downstream.onComplete();
                } else {
                    this.downstream.onError(thTerminate);
                }
            }
        }

        public void innerError(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (!C1454t.m2255a(this.inner, switchMapInnerObserver, null) || !this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.delayErrors) {
                if (this.done) {
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                return;
            }
            dispose();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.inner.get() == INNER_DISPOSED;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.delayErrors) {
                onComplete();
                return;
            }
            disposeInner();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.inner.get();
                    if (switchMapInnerObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!C1454t.m2255a(this.inner, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                completableSource.subscribe(switchMapInnerObserver2);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public SwitchMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z11) {
            this.downstream = completableObserver;
            this.mapper = function;
            this.delayErrors = z11;
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe((FlowableSubscriber) new SwitchMapCompletableObserver(completableObserver, this.mapper, this.delayErrors));
    }

    public FlowableSwitchMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z11) {
        this.source = flowable;
        this.mapper = function;
        this.delayErrors = z11;
    }
}
