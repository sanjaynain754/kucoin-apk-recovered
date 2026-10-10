package io.reactivex.internal.operators.observable;

import androidx.camera.view.C1454t;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0006b;

/* JADX INFO: loaded from: classes60.dex */
public final class ObservableFlatMapMaybe<T, R> extends AbstractObservableWithUpstream<T, R> {
    final boolean delayErrors;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final Observer<? super R> downstream;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        Disposable upstream;
        final CompositeDisposable set = new CompositeDisposable();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<Disposable> implements MaybeObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapMaybeObserver.this.innerComplete(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th2) {
                FlatMapMaybeObserver.this.innerError(this, th2);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r11) {
                FlatMapMaybeObserver.this.innerSuccess(this, r11);
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            /* JADX INFO: renamed from: isDisposed */
            public boolean getDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public void clear() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public void drainLoop() {
            Observer<? super R> observer = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!this.delayErrors && this.errors.get() != null) {
                    Throwable thTerminate = this.errors.terminate();
                    clear();
                    observer.onError(thTerminate);
                    return;
                }
                boolean z11 = atomicInteger.get() == 0;
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                C0006b c0006bPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                boolean z12 = c0006bPoll == null;
                if (z11 && z12) {
                    Throwable thTerminate2 = this.errors.terminate();
                    if (thTerminate2 != null) {
                        observer.onError(thTerminate2);
                        return;
                    } else {
                        observer.onComplete();
                        return;
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    observer.onNext(c0006bPoll);
                }
            }
            clear();
        }

        public SpscLinkedArrayQueue<R> getOrCreateQueue() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.queue.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Observable.bufferSize());
            } while (!C1454t.m2255a(this.queue, null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        public void innerComplete(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z11 = this.active.decrementAndGet() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
                    if (!z11 || (spscLinkedArrayQueue != null && !spscLinkedArrayQueue.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        drainLoop();
                        return;
                    } else {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            this.downstream.onError(thTerminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                }
            }
            this.active.decrementAndGet();
            drain();
        }

        public void innerError(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver, Throwable th2) {
            this.set.delete(innerObserver);
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                this.set.dispose();
            }
            this.active.decrementAndGet();
            drain();
        }

        /* JADX WARN: Code duplicated, block: B:23:0x004e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void innerSuccess(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver, R r11) {
            SpscLinkedArrayQueue<R> orCreateQueue;
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.downstream.onNext(r11);
                    boolean z11 = this.active.decrementAndGet() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
                    if (z11 && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            this.downstream.onError(thTerminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    orCreateQueue = getOrCreateQueue();
                    synchronized (orCreateQueue) {
                        orCreateQueue.offer(r11);
                    }
                    this.active.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            } else {
                orCreateQueue = getOrCreateQueue();
                synchronized (orCreateQueue) {
                    orCreateQueue.offer(r11);
                    this.active.decrementAndGet();
                    if (getAndIncrement() != 0) {
                        return;
                    }
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.active.decrementAndGet();
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                this.set.dispose();
            }
            drain();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t11) {
            try {
                MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.add(innerObserver)) {
                    return;
                }
                maybeSource.subscribe(innerObserver);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.dispose();
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

        public FlatMapMaybeObserver(Observer<? super R> observer, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z11) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z11;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new FlatMapMaybeObserver(observer, this.mapper, this.delayErrors));
    }

    public ObservableFlatMapMaybe(ObservableSource<T> observableSource, Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z11) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = z11;
    }
}
