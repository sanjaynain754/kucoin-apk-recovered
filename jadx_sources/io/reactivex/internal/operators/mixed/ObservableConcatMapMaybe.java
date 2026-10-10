package io.reactivex.internal.operators.mixed;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableConcatMapMaybe<T, R> extends Observable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final int prefetch;
    final Observable<T> source;

    public static final class ConcatMapMaybeMainObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        volatile boolean done;
        final Observer<? super R> downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapMaybeObserver<R> inner = new ConcatMapMaybeObserver<>(this);
        R item;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        final SimplePlainQueue<T> queue;
        volatile int state;
        Disposable upstream;

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapMaybeMainObserver<?, R> parent;

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th2) {
                this.parent.innerError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r11) {
                this.parent.innerSuccess(r11);
            }

            public ConcatMapMaybeObserver(ConcatMapMaybeMainObserver<?, R> concatMapMaybeMainObserver) {
                this.parent = concatMapMaybeMainObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        public void innerComplete() {
            this.state = 0;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.dispose();
            }
            this.state = 0;
            drain();
        }

        public void innerSuccess(R r11) {
            this.item = r11;
            this.state = 2;
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
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            this.queue.offer(t11);
            drain();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        public ConcatMapMaybeMainObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, int i11, ErrorMode errorMode) {
            this.downstream = observer;
            this.mapper = function;
            this.errorMode = errorMode;
            this.queue = new SpscLinkedArrayQueue(i11);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.downstream;
                ErrorMode errorMode = this.errorMode;
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                int iAddAndGet = 1;
                while (true) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        this.item = null;
                    } else {
                        int i11 = this.state;
                        if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i11 == 0))) {
                            break;
                        }
                        boolean z11 = false;
                        if (i11 == 0) {
                            boolean z12 = this.done;
                            T tPoll = simplePlainQueue.poll();
                            if (tPoll == null) {
                                z11 = true;
                            }
                            if (z12 && z11) {
                                Throwable thTerminate = atomicThrowable.terminate();
                                if (thTerminate == null) {
                                    observer.onComplete();
                                    return;
                                } else {
                                    observer.onError(thTerminate);
                                    return;
                                }
                            }
                            if (!z11) {
                                try {
                                    MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null MaybeSource");
                                    this.state = 1;
                                    maybeSource.subscribe(this.inner);
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.dispose();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th2);
                                    observer.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i11 == 2) {
                            R r11 = this.item;
                            this.item = null;
                            observer.onNext(r11);
                            this.state = 0;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                simplePlainQueue.clear();
                this.item = null;
                observer.onError(atomicThrowable.terminate());
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ScalarXMapZHelper.tryAsMaybe(this.source, this.mapper, observer)) {
            return;
        }
        this.source.subscribe(new ConcatMapMaybeMainObserver(observer, this.mapper, this.prefetch, this.errorMode));
    }

    public ObservableConcatMapMaybe(Observable<T> observable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i11) {
        this.source = observable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i11;
    }
}
