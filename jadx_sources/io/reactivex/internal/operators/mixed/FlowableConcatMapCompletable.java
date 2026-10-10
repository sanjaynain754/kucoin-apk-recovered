package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableConcatMapCompletable<T> extends Completable {
    final ErrorMode errorMode;
    final Function<? super T, ? extends CompletableSource> mapper;
    final int prefetch;
    final Flowable<T> source;

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        int consumed;
        volatile boolean disposed;
        volatile boolean done;
        final CompletableObserver downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
        final Function<? super T, ? extends CompletableSource> mapper;
        final int prefetch;
        final SimplePlainQueue<T> queue;
        InterfaceC44418d upstream;

        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = 5638352172918776687L;
            final ConcatMapCompletableObserver<?> parent;

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                this.parent.innerError(th2);
            }

            public ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.parent = concatMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.active = false;
                drain();
                return;
            }
            this.upstream.cancel();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.done = true;
                drain();
                return;
            }
            this.inner.dispose();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.TERMINATED) {
                this.downstream.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.queue.offer(t11)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(this.prefetch);
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i11) {
            this.downstream = completableObserver;
            this.mapper = function;
            this.errorMode = errorMode;
            this.prefetch = i11;
            this.queue = new SpscArrayQueue(i11);
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        if (this.errorMode == ErrorMode.BOUNDARY && this.errors.get() != null) {
                            this.queue.clear();
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                        boolean z12 = this.done;
                        T tPoll = this.queue.poll();
                        if (tPoll == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 && z11) {
                            Throwable thTerminate = this.errors.terminate();
                            if (thTerminate != null) {
                                this.downstream.onError(thTerminate);
                                return;
                            } else {
                                this.downstream.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            int i11 = this.prefetch;
                            int i12 = i11 - (i11 >> 1);
                            int i13 = this.consumed + 1;
                            if (i13 == i12) {
                                this.consumed = 0;
                                this.upstream.request(i12);
                            } else {
                                this.consumed = i13;
                            }
                            try {
                                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null CompletableSource");
                                this.active = true;
                                completableSource.subscribe(this.inner);
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.queue.clear();
                                this.upstream.cancel();
                                this.errors.addThrowable(th2);
                                this.downstream.onError(this.errors.terminate());
                                return;
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                this.queue.clear();
            }
        }
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapCompletableObserver(completableObserver, this.mapper, this.errorMode, this.prefetch));
    }

    public FlowableConcatMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i11) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i11;
    }
}
