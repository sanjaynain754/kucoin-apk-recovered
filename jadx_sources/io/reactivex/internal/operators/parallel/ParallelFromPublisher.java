package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final InterfaceC44416b<? extends T> source;

    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        SimpleQueue<T> queue;
        final AtomicLongArray requests;
        int sourceMode;
        final AtomicInteger subscriberCount = new AtomicInteger();
        final InterfaceC44417c<? super T>[] subscribers;
        InterfaceC44418d upstream;

        public final class RailSubscription implements InterfaceC44418d {

            /* JADX INFO: renamed from: j */
            final int f87192j;

            /* JADX INFO: renamed from: m */
            final int f87193m;

            public RailSubscription(int i11, int i12) {
                this.f87192j = i11;
                this.f87193m = i12;
            }

            @Override // sh0.InterfaceC44418d
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f87192j + this.f87193m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i11 = this.f87193m;
                    parallelDispatcher.cancel(i11 + i11);
                }
            }

            @Override // sh0.InterfaceC44418d
            public void request(long j11) {
                long j12;
                if (SubscriptionHelper.validate(j11)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j12 = atomicLongArray.get(this.f87192j);
                        if (j12 != Long.MAX_VALUE) {
                        } else {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f87192j, j12, BackpressureHelper.addCap(j12, j11)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f87193m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        public void cancel(int i11) {
            if (this.requests.decrementAndGet(i11) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drainAsync() {
            Throwable th2;
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC44417c<? super T>[] interfaceC44417cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i11 = this.index;
            int i12 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                int i13 = 0;
                int i14 = 0;
                do {
                    if (this.cancelled) {
                        simpleQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    if (z11 && (th2 = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = interfaceC44417cArr.length;
                        while (i13 < length2) {
                            interfaceC44417cArr[i13].onError(th2);
                            i13++;
                        }
                        return;
                    }
                    boolean zIsEmpty = simpleQueue.isEmpty();
                    if (z11 && zIsEmpty) {
                        int length3 = interfaceC44417cArr.length;
                        while (i13 < length3) {
                            interfaceC44417cArr[i13].onComplete();
                            i13++;
                        }
                        return;
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    long j11 = atomicLongArray.get(i11);
                    long j12 = jArr[i11];
                    if (j11 == j12 || atomicLongArray.get(length + i11) != 0) {
                        i14++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                break;
                            }
                            interfaceC44417cArr[i11].onNext(tPoll);
                            jArr[i11] = j12 + 1;
                            i12++;
                            if (i12 == this.limit) {
                                this.upstream.request(i12);
                                i12 = 0;
                            }
                            i14 = 0;
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            this.upstream.cancel();
                            int length4 = interfaceC44417cArr.length;
                            while (i13 < length4) {
                                interfaceC44417cArr[i13].onError(th3);
                                i13++;
                            }
                            return;
                        }
                    }
                    i11++;
                    if (i11 == length) {
                        i11 = 0;
                    }
                } while (i14 != length);
                int i15 = get();
                if (i15 == iAddAndGet) {
                    this.index = i11;
                    this.produced = i12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i15;
                }
            }
        }

        public void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            InterfaceC44417c<? super T>[] interfaceC44417cArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i11 = this.index;
            int iAddAndGet = 1;
            while (true) {
                int i12 = 0;
                int i13 = 0;
                do {
                    if (this.cancelled) {
                        simpleQueue.clear();
                        return;
                    }
                    if (simpleQueue.isEmpty()) {
                        int length2 = interfaceC44417cArr.length;
                        while (i12 < length2) {
                            interfaceC44417cArr[i12].onComplete();
                            i12++;
                        }
                        return;
                    }
                    long j11 = atomicLongArray.get(i11);
                    long j12 = jArr[i11];
                    if (j11 == j12 || atomicLongArray.get(length + i11) != 0) {
                        i13++;
                    } else {
                        try {
                            T tPoll = simpleQueue.poll();
                            if (tPoll == null) {
                                int length3 = interfaceC44417cArr.length;
                                while (i12 < length3) {
                                    interfaceC44417cArr[i12].onComplete();
                                    i12++;
                                }
                                return;
                            }
                            interfaceC44417cArr[i11].onNext(tPoll);
                            jArr[i11] = j12 + 1;
                            i13 = 0;
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.upstream.cancel();
                            int length4 = interfaceC44417cArr.length;
                            while (i12 < length4) {
                                interfaceC44417cArr[i12].onError(th2);
                                i12++;
                            }
                            return;
                        }
                    }
                    i11++;
                    if (i11 == length) {
                        i11 = 0;
                    }
                } while (i13 != length);
                int i14 = get();
                if (i14 == iAddAndGet) {
                    this.index = i11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i14;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.sourceMode != 0 || this.queue.offer(t11)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        interfaceC44418d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                interfaceC44418d.request(this.prefetch);
            }
        }

        public void setupSubscribers() {
            InterfaceC44417c<? super T>[] interfaceC44417cArr = this.subscribers;
            int length = interfaceC44417cArr.length;
            int i11 = 0;
            while (i11 < length && !this.cancelled) {
                int i12 = i11 + 1;
                this.subscriberCount.lazySet(i12);
                interfaceC44417cArr[i11].onSubscribe(new RailSubscription(i11, length));
                i11 = i12;
            }
        }

        public ParallelDispatcher(InterfaceC44417c<? super T>[] interfaceC44417cArr, int i11) {
            this.subscribers = interfaceC44417cArr;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
            int length = interfaceC44417cArr.length;
            int i12 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i12 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i12, length);
            this.emissions = new long[length];
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    public ParallelFromPublisher(InterfaceC44416b<? extends T> interfaceC44416b, int i11, int i12) {
        this.source = interfaceC44416b;
        this.parallelism = i11;
        this.prefetch = i12;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super T>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        this.source.subscribe(new ParallelDispatcher(interfaceC44417cArr, this.prefetch));
    }
}
