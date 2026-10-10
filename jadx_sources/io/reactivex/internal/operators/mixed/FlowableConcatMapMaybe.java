package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    final int prefetch;
    final Flowable<T> source;

    public static final class ConcatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        static final int STATE_ACTIVE = 1;
        static final int STATE_INACTIVE = 0;
        static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        long emitted;
        final ErrorMode errorMode;
        R item;
        final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        final int prefetch;
        final SimplePlainQueue<T> queue;
        volatile int state;
        InterfaceC44418d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapMaybeObserver<R> inner = new ConcatMapMaybeObserver<>(this);

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            final ConcatMapMaybeSubscriber<?, R> parent;

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

            public ConcatMapMaybeObserver(ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber) {
                this.parent = concatMapMaybeSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
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
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            this.state = 0;
            drain();
        }

        public void innerSuccess(R r11) {
            this.item = r11;
            this.state = 2;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
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

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.queue.offer(t11)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("queue full?!"));
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

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            BackpressureHelper.add(this.requested, j11);
            drain();
        }

        public ConcatMapMaybeSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends MaybeSource<? extends R>> function, int i11, ErrorMode errorMode) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.prefetch = i11;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i11);
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
                ErrorMode errorMode = this.errorMode;
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                AtomicLong atomicLong = this.requested;
                int i11 = this.prefetch;
                int i12 = i11 - (i11 >> 1);
                int iAddAndGet = 1;
                while (true) {
                    if (this.cancelled) {
                        simplePlainQueue.clear();
                        this.item = null;
                    } else {
                        int i13 = this.state;
                        if (atomicThrowable.get() != null && (errorMode == ErrorMode.IMMEDIATE || (errorMode == ErrorMode.BOUNDARY && i13 == 0))) {
                            break;
                        }
                        if (i13 == 0) {
                            boolean z12 = this.done;
                            T tPoll = simplePlainQueue.poll();
                            if (tPoll == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z12 && z11) {
                                Throwable thTerminate = atomicThrowable.terminate();
                                if (thTerminate == null) {
                                    interfaceC44417c.onComplete();
                                    return;
                                } else {
                                    interfaceC44417c.onError(thTerminate);
                                    return;
                                }
                            }
                            if (!z11) {
                                int i14 = this.consumed + 1;
                                if (i14 == i12) {
                                    this.consumed = 0;
                                    this.upstream.request(i12);
                                } else {
                                    this.consumed = i14;
                                }
                                try {
                                    MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null MaybeSource");
                                    this.state = 1;
                                    maybeSource.subscribe(this.inner);
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.upstream.cancel();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th2);
                                    interfaceC44417c.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i13 == 2) {
                            long j11 = this.emitted;
                            if (j11 != atomicLong.get()) {
                                R r11 = this.item;
                                this.item = null;
                                interfaceC44417c.onNext(r11);
                                this.emitted = j11 + 1;
                                this.state = 0;
                            }
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                simplePlainQueue.clear();
                this.item = null;
                interfaceC44417c.onError(atomicThrowable.terminate());
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapMaybeSubscriber(interfaceC44417c, this.mapper, this.prefetch, this.errorMode));
    }

    public FlowableConcatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i11) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i11;
    }
}
