package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    final Callable<C> bufferSupplier;
    final int size;
    final int skip;

    public static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, InterfaceC44418d {
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final InterfaceC44417c<? super C> downstream;
        int index;
        final int size;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c11 = this.buffer;
            if (c11 != null && !c11.isEmpty()) {
                this.downstream.onNext(c11);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            C c11 = this.buffer;
            if (c11 == null) {
                try {
                    c11 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c11;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            c11.add(t11);
            int i11 = this.index + 1;
            if (i11 != this.size) {
                this.index = i11;
                return;
            }
            this.index = 0;
            this.buffer = null;
            this.downstream.onNext(c11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        public PublisherBufferExactSubscriber(InterfaceC44417c<? super C> interfaceC44417c, int i11, Callable<C> callable) {
            this.downstream = interfaceC44417c;
            this.size = i11;
            this.bufferSupplier = callable;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                this.upstream.request(BackpressureHelper.multiplyCap(j11, this.size));
            }
        }
    }

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d, BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final InterfaceC44417c<? super C> downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        InterfaceC44418d upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public boolean getAsBoolean() {
            return this.cancelled;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j11 = this.produced;
            if (j11 != 0) {
                BackpressureHelper.produced(this, j11);
            }
            QueueDrainHelper.postComplete(this.downstream, this.buffers, this, this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i11 = this.index;
            int i12 = i11 + 1;
            if (i11 == 0) {
                try {
                    arrayDeque.offer((C) ((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer")));
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            C cPeek = arrayDeque.peek();
            if (cPeek != null && cPeek.size() + 1 == this.size) {
                arrayDeque.poll();
                cPeek.add(t11);
                this.produced++;
                this.downstream.onNext(cPeek);
            }
            Iterator<C> it = arrayDeque.iterator();
            while (it.hasNext()) {
                it.next().add(t11);
            }
            if (i12 == this.skip) {
                i12 = 0;
            }
            this.index = i12;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        public PublisherBufferOverlappingSubscriber(InterfaceC44417c<? super C> interfaceC44417c, int i11, int i12, Callable<C> callable) {
            this.downstream = interfaceC44417c;
            this.size = i11;
            this.skip = i12;
            this.bufferSupplier = callable;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11) && !QueueDrainHelper.postCompleteRequest(j11, this.downstream, this.buffers, this, this)) {
                if (!this.once.get() && this.once.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j11 - 1)));
                } else {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j11));
                }
            }
        }
    }

    public static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final InterfaceC44417c<? super C> downstream;
        int index;
        final int size;
        final int skip;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c11 = this.buffer;
            this.buffer = null;
            if (c11 != null) {
                this.downstream.onNext(c11);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            C c11 = this.buffer;
            int i11 = this.index;
            int i12 = i11 + 1;
            if (i11 == 0) {
                try {
                    c11 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c11;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                    return;
                }
            }
            if (c11 != null) {
                c11.add(t11);
                if (c11.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c11);
                }
            }
            if (i12 == this.skip) {
                i12 = 0;
            }
            this.index = i12;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        public PublisherBufferSkipSubscriber(InterfaceC44417c<? super C> interfaceC44417c, int i11, int i12, Callable<C> callable) {
            this.downstream = interfaceC44417c;
            this.size = i11;
            this.skip = i12;
            this.bufferSupplier = callable;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j11, this.size), BackpressureHelper.multiplyCap(this.skip - this.size, j11 - 1)));
                    return;
                }
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j11));
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super C> interfaceC44417c) {
        int i11 = this.size;
        int i12 = this.skip;
        if (i11 == i12) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(interfaceC44417c, i11, this.bufferSupplier));
        } else if (i12 > i11) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(interfaceC44417c, this.size, this.skip, this.bufferSupplier));
        } else {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(interfaceC44417c, this.size, this.skip, this.bufferSupplier));
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i11, int i12, Callable<C> callable) {
        super(flowable);
        this.size = i11;
        this.skip = i12;
        this.bufferSupplier = callable;
    }
}
