package io.reactivex.internal.operators.mixed;

import androidx.camera.view.C1454t;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableSwitchMapSingle<T, R> extends Observable<R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final Observable<T> source;

    public static final class SwitchMapSingleMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final SwitchMapSingleObserver<Object> INNER_DISPOSED = new SwitchMapSingleObserver<>(null);
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicReference<SwitchMapSingleObserver<R>> inner = new AtomicReference<>();
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        Disposable upstream;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final SwitchMapSingleMainObserver<?, R> parent;

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th2) {
                this.parent.innerError(this, th2);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r11) {
                this.item = r11;
                this.parent.drain();
            }

            public SwitchMapSingleObserver(SwitchMapSingleMainObserver<?, R> switchMapSingleMainObserver) {
                this.parent = switchMapSingleMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            disposeInner();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void disposeInner() {
            AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
            SwitchMapSingleObserver<Object> switchMapSingleObserver = INNER_DISPOSED;
            SwitchMapSingleObserver<R> andSet = atomicReference.getAndSet((SwitchMapSingleObserver<R>) switchMapSingleObserver);
            if (andSet == null || andSet == switchMapSingleObserver) {
                return;
            }
            andSet.dispose();
        }

        public void innerError(SwitchMapSingleObserver<R> switchMapSingleObserver, Throwable th2) {
            if (!C1454t.m2255a(this.inner, switchMapSingleObserver, null) || !this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                disposeInner();
            }
            drain();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            SwitchMapSingleObserver<R> switchMapSingleObserver;
            SwitchMapSingleObserver<R> switchMapSingleObserver2 = this.inner.get();
            if (switchMapSingleObserver2 != null) {
                switchMapSingleObserver2.dispose();
            }
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null SingleSource");
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                do {
                    switchMapSingleObserver = this.inner.get();
                    if (switchMapSingleObserver == INNER_DISPOSED) {
                        return;
                    }
                } while (!C1454t.m2255a(this.inner, switchMapSingleObserver, switchMapSingleObserver3));
                singleSource.subscribe(switchMapSingleObserver3);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.dispose();
                this.inner.getAndSet((SwitchMapSingleObserver<R>) INNER_DISPOSED);
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public SwitchMapSingleMainObserver(Observer<? super R> observer, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z11;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.downstream;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicReference<SwitchMapSingleObserver<R>> atomicReference = this.inner;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (atomicThrowable.get() != null && !this.delayErrors) {
                        observer.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z12 = this.done;
                    SwitchMapSingleObserver<R> switchMapSingleObserver = atomicReference.get();
                    if (switchMapSingleObserver == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z12 && z11) {
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (thTerminate != null) {
                            observer.onError(thTerminate);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    if (!z11 && switchMapSingleObserver.item != null) {
                        C1454t.m2255a(atomicReference, switchMapSingleObserver, null);
                        observer.onNext(switchMapSingleObserver.item);
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ScalarXMapZHelper.tryAsSingle(this.source, this.mapper, observer)) {
            return;
        }
        this.source.subscribe(new SwitchMapSingleMainObserver(observer, this.mapper, this.delayErrors));
    }

    public ObservableSwitchMapSingle(Observable<T> observable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11) {
        this.source = observable;
        this.mapper = function;
        this.delayErrors = z11;
    }
}
