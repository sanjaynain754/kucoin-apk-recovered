package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractFlowableWithUpstream<T, U> {
    final Function<? super Open, ? extends InterfaceC44416b<? extends Close>> bufferClose;
    final InterfaceC44416b<? extends Open> bufferOpen;
    final Callable<U> bufferSupplier;

    public static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -8466418554264089604L;
        final Function<? super Open, ? extends InterfaceC44416b<? extends Close>> bufferClose;
        final InterfaceC44416b<? extends Open> bufferOpen;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC44417c<? super C> downstream;
        long emitted;
        long index;
        final SpscLinkedArrayQueue<C> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final CompositeDisposable subscribers = new CompositeDisposable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        Map<Long, C> buffers = new LinkedHashMap();
        final AtomicThrowable errors = new AtomicThrowable();

        public static final class BufferOpenSubscriber<Open> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Open>, Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            final BufferBoundarySubscriber<?, ?, Open, ?> parent;

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onComplete() {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.openComplete(this);
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onError(Throwable th2) {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.boundaryError(this, th2);
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onNext(Open open) {
                this.parent.open(open);
            }

            public BufferOpenSubscriber(BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.parent = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                SubscriptionHelper.cancel(this);
            }

            @Override // io.reactivex.disposables.Disposable
            /* JADX INFO: renamed from: isDisposed */
            public boolean getDisposed() {
                if (get() == SubscriptionHelper.CANCELLED) {
                    return true;
                }
                return false;
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onSubscribe(InterfaceC44418d interfaceC44418d) {
                SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().add(t11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void boundaryError(Disposable disposable, Throwable th2) {
            SubscriptionHelper.cancel(this.upstream);
            this.subscribers.delete(disposable);
            onError(th2);
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (SubscriptionHelper.cancel(this.upstream)) {
                this.cancelled = true;
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        public void close(BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j11) {
            boolean z11;
            this.subscribers.delete(bufferCloseSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                z11 = true;
            } else {
                z11 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    this.queue.offer(map.remove(Long.valueOf(j11)));
                    if (z11) {
                        this.done = true;
                    }
                    drain();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.subscribers.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.queue.offer(it.next());
                    }
                    this.buffers = null;
                    this.done = true;
                    drain();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
                BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
                this.subscribers.add(bufferOpenSubscriber);
                this.bufferOpen.subscribe(bufferOpenSubscriber);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public void open(Open open) {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.bufferClose.apply(open), "The bufferClose returned a null Publisher");
                long j11 = this.index;
                this.index = 1 + j11;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.buffers;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j11), (C) collection);
                        BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber(this, j11);
                        this.subscribers.add(bufferCloseSubscriber);
                        interfaceC44416b.subscribe(bufferCloseSubscriber);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                SubscriptionHelper.cancel(this.upstream);
                onError(th3);
            }
        }

        public void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
            this.subscribers.delete(bufferOpenSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                this.done = true;
                drain();
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            BackpressureHelper.add(this.requested, j11);
            drain();
        }

        public BufferBoundarySubscriber(InterfaceC44417c<? super C> interfaceC44417c, InterfaceC44416b<? extends Open> interfaceC44416b, Function<? super Open, ? extends InterfaceC44416b<? extends Close>> function, Callable<C> callable) {
            this.downstream = interfaceC44417c;
            this.bufferSupplier = callable;
            this.bufferOpen = interfaceC44416b;
            this.bufferClose = function;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                long j11 = this.emitted;
                InterfaceC44417c<? super C> interfaceC44417c = this.downstream;
                SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.queue;
                int iAddAndGet = 1;
                do {
                    long j12 = this.requested.get();
                    while (j11 != j12) {
                        if (this.cancelled) {
                            spscLinkedArrayQueue.clear();
                            return;
                        }
                        boolean z12 = this.done;
                        if (z12 && this.errors.get() != null) {
                            spscLinkedArrayQueue.clear();
                            interfaceC44417c.onError(this.errors.terminate());
                            return;
                        }
                        C cPoll = spscLinkedArrayQueue.poll();
                        if (cPoll == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12 && z11) {
                            interfaceC44417c.onComplete();
                            return;
                        } else {
                            if (z11) {
                                break;
                            }
                            interfaceC44417c.onNext(cPoll);
                            j11++;
                        }
                    }
                    if (j11 == j12) {
                        if (this.cancelled) {
                            spscLinkedArrayQueue.clear();
                            return;
                        }
                        if (this.done) {
                            if (this.errors.get() != null) {
                                spscLinkedArrayQueue.clear();
                                interfaceC44417c.onError(this.errors.terminate());
                                return;
                            } else if (spscLinkedArrayQueue.isEmpty()) {
                                interfaceC44417c.onComplete();
                                return;
                            }
                        }
                    }
                    this.emitted = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    public static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final BufferBoundarySubscriber<T, C, ?, ?> parent;

        public BufferCloseSubscriber(BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j11) {
            this.parent = bufferBoundarySubscriber;
            this.index = j11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            InterfaceC44418d interfaceC44418d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC44418d != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            InterfaceC44418d interfaceC44418d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC44418d != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.boundaryError(this, th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            InterfaceC44418d interfaceC44418d = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC44418d != subscriptionHelper) {
                lazySet(subscriptionHelper);
                interfaceC44418d.cancel();
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super U> interfaceC44417c) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(interfaceC44417c, this.bufferOpen, this.bufferClose, this.bufferSupplier);
        interfaceC44417c.onSubscribe(bufferBoundarySubscriber);
        this.source.subscribe((FlowableSubscriber) bufferBoundarySubscriber);
    }

    public FlowableBufferBoundary(Flowable<T> flowable, InterfaceC44416b<? extends Open> interfaceC44416b, Function<? super Open, ? extends InterfaceC44416b<? extends Close>> function, Callable<U> callable) {
        super(flowable);
        this.bufferOpen = interfaceC44416b;
        this.bufferClose = function;
        this.bufferSupplier = callable;
    }
}
