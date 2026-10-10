package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableFlattenIterable<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final int prefetch;

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        int fusionMode;
        final int limit;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        InterfaceC44418d upstream;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.current = null;
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return ((i11 & 1) == 0 || this.fusionMode != 1) ? 0 : 1;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<?> interfaceC44417c, SimpleQueue<?> simpleQueue) {
            if (this.cancelled) {
                this.current = null;
                simpleQueue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (this.error.get() == null) {
                if (!z12) {
                    return false;
                }
                interfaceC44417c.onComplete();
                return true;
            }
            Throwable thTerminate = ExceptionHelper.terminate(this.error);
            this.current = null;
            simpleQueue.clear();
            interfaceC44417c.onError(thTerminate);
            return true;
        }

        public void consumedOne(boolean z11) {
            if (z11) {
                int i11 = this.consumed + 1;
                if (i11 != this.limit) {
                    this.consumed = i11;
                } else {
                    this.consumed = 0;
                    this.upstream.request(i11);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0128 A[PHI: r6
          0x0128: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:31:0x0081, B:68:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:89:0x012f A[SYNTHETIC] */
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<?> interfaceC44417c = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            boolean z11 = true;
            boolean z12 = this.fusionMode != 1;
            Iterator<? extends R> it = this.current;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z13 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        if (checkTerminated(z13, tPoll == null ? z11 : false, interfaceC44417c, simpleQueue)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.mapper.apply(tPoll).iterator();
                                if (it.hasNext()) {
                                    this.current = it;
                                } else {
                                    consumedOne(z12);
                                    it = null;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                ExceptionHelper.addThrowable(this.error, th2);
                                interfaceC44417c.onError(ExceptionHelper.terminate(this.error));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        this.upstream.cancel();
                        ExceptionHelper.addThrowable(this.error, th3);
                        Throwable thTerminate = ExceptionHelper.terminate(this.error);
                        this.current = null;
                        simpleQueue.clear();
                        interfaceC44417c.onError(thTerminate);
                        return;
                    }
                }
                if (it != null) {
                    long j11 = this.requested.get();
                    long j12 = 0;
                    while (j12 != j11) {
                        if (checkTerminated(this.done, false, interfaceC44417c, simpleQueue)) {
                            return;
                        }
                        try {
                            interfaceC44417c.onNext((Object) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (checkTerminated(this.done, false, interfaceC44417c, simpleQueue)) {
                                return;
                            }
                            j12++;
                            try {
                                if (!it.hasNext()) {
                                    consumedOne(z12);
                                    this.current = null;
                                    it = null;
                                    break;
                                }
                            } catch (Throwable th4) {
                                Exceptions.throwIfFatal(th4);
                                this.current = null;
                                this.upstream.cancel();
                                ExceptionHelper.addThrowable(this.error, th4);
                                interfaceC44417c.onError(ExceptionHelper.terminate(this.error));
                                return;
                            }
                        } catch (Throwable th5) {
                            Exceptions.throwIfFatal(th5);
                            this.current = null;
                            this.upstream.cancel();
                            ExceptionHelper.addThrowable(this.error, th5);
                            interfaceC44417c.onError(ExceptionHelper.terminate(this.error));
                            return;
                        }
                    }
                    if (j12 == j11) {
                        if (checkTerminated(this.done, simpleQueue.isEmpty() && it == null, interfaceC44417c, simpleQueue)) {
                            return;
                        }
                    }
                    if (j12 != 0 && j11 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j12);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                z11 = true;
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done || !ExceptionHelper.addThrowable(this.error, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.fusionMode != 0 || this.queue.offer(t11)) {
                drain();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        interfaceC44418d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(this.prefetch);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() throws Exception {
            Iterator<? extends R> it = this.current;
            while (it == null) {
                T tPoll = this.queue.poll();
                if (tPoll != null) {
                    it = this.mapper.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.current = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R r11 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return r11;
        }

        public FlattenIterableSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends Iterable<? extends R>> function, int i11) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        Flowable<T> flowable = this.source;
        if (!(flowable instanceof Callable)) {
            flowable.subscribe((FlowableSubscriber) new FlattenIterableSubscriber(interfaceC44417c, this.mapper, this.prefetch));
            return;
        }
        try {
            Object objCall = ((Callable) flowable).call();
            if (objCall == null) {
                EmptySubscription.complete(interfaceC44417c);
                return;
            }
            try {
                FlowableFromIterable.subscribe(interfaceC44417c, this.mapper.apply(objCall).iterator());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, interfaceC44417c);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, interfaceC44417c);
        }
    }

    public FlowableFlattenIterable(Flowable<T> flowable, Function<? super T, ? extends Iterable<? extends R>> function, int i11) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i11;
    }
}
