package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0006b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFlatMapSingle<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final boolean delayErrors;
    final Function<? super T, ? extends SingleSource<? extends R>> mapper;
    final int maxConcurrency;

    public static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final InterfaceC44417c<? super R> downstream;
        final Function<? super T, ? extends SingleSource<? extends R>> mapper;
        final int maxConcurrency;
        InterfaceC44418d upstream;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable set = new CompositeDisposable();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<SpscLinkedArrayQueue<R>> queue = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th2) {
                FlatMapSingleSubscriber.this.innerError(this, th2);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r11) {
                FlatMapSingleSubscriber.this.innerSuccess(this, r11);
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

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.set.dispose();
        }

        public void clear() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue = this.queue.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        public void drainLoop() {
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<SpscLinkedArrayQueue<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j11 = this.requested.get();
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        break;
                    }
                    if (this.cancelled) {
                        clear();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        Throwable thTerminate = this.errors.terminate();
                        clear();
                        interfaceC44417c.onError(thTerminate);
                        return;
                    }
                    boolean z11 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue = atomicReference.get();
                    C0006b c0006bPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z12 = c0006bPoll == null;
                    if (z11 && z12) {
                        Throwable thTerminate2 = this.errors.terminate();
                        if (thTerminate2 != null) {
                            interfaceC44417c.onError(thTerminate2);
                            return;
                        } else {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    interfaceC44417c.onNext(c0006bPoll);
                    j12++;
                }
                if (j12 == j11) {
                    if (this.cancelled) {
                        clear();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        Throwable thTerminate3 = this.errors.terminate();
                        clear();
                        interfaceC44417c.onError(thTerminate3);
                        return;
                    }
                    boolean z13 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = atomicReference.get();
                    boolean z14 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z13 && z14) {
                        Throwable thTerminate4 = this.errors.terminate();
                        if (thTerminate4 != null) {
                            interfaceC44417c.onError(thTerminate4);
                            return;
                        } else {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    BackpressureHelper.produced(this.requested, j12);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.request(j12);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public SpscLinkedArrayQueue<R> getOrCreateQueue() {
            SpscLinkedArrayQueue<R> spscLinkedArrayQueue;
            do {
                SpscLinkedArrayQueue<R> spscLinkedArrayQueue2 = this.queue.get();
                if (spscLinkedArrayQueue2 != null) {
                    return spscLinkedArrayQueue2;
                }
                spscLinkedArrayQueue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
            } while (!C1454t.m2255a(this.queue, null, spscLinkedArrayQueue));
            return spscLinkedArrayQueue;
        }

        public void innerError(FlatMapSingleSubscriber<T, R>.InnerObserver innerObserver, Throwable th2) {
            this.set.delete(innerObserver);
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.cancel();
                this.set.dispose();
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
            this.active.decrementAndGet();
            drain();
        }

        /* JADX WARN: Code duplicated, block: B:35:0x007a  */
        /* JADX WARN: Code duplicated, block: B:41:0x008e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public void innerSuccess(FlatMapSingleSubscriber<T, R>.InnerObserver innerObserver, R r11) {
            SpscLinkedArrayQueue<R> orCreateQueue;
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z11 = this.active.decrementAndGet() == 0;
                    if (this.requested.get() != 0) {
                        this.downstream.onNext(r11);
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
                        BackpressureHelper.produced(this.requested, 1L);
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            this.upstream.request(1L);
                        }
                    } else {
                        SpscLinkedArrayQueue<R> orCreateQueue2 = getOrCreateQueue();
                        synchronized (orCreateQueue2) {
                            orCreateQueue2.offer(r11);
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

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
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

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            try {
                SingleSource singleSource = (SingleSource) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null SingleSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.add(innerObserver)) {
                    return;
                }
                singleSource.subscribe(innerObserver);
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
                int i11 = this.maxConcurrency;
                if (i11 == Integer.MAX_VALUE) {
                    interfaceC44418d.request(Long.MAX_VALUE);
                } else {
                    interfaceC44418d.request(i11);
                }
            }
        }

        public FlatMapSingleSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11, int i11) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.delayErrors = z11;
            this.maxConcurrency = i11;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new FlatMapSingleSubscriber(interfaceC44417c, this.mapper, this.delayErrors, this.maxConcurrency));
    }

    public FlowableFlatMapSingle(Flowable<T> flowable, Function<? super T, ? extends SingleSource<? extends R>> function, boolean z11, int i11) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z11;
        this.maxConcurrency = i11;
    }
}
