package io.reactivex.processors;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
@SchedulerSupport("none")
@BackpressureSupport(BackpressureKind.FULL)
public final class MulticastProcessor<T> extends FlowableProcessor<T> {
    static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
    static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
    final int bufferSize;
    int consumed;
    volatile boolean done;
    volatile Throwable error;
    int fusionMode;
    final int limit;
    final AtomicBoolean once;
    volatile SimpleQueue<T> queue;
    final boolean refcount;
    final AtomicReference<MulticastSubscription<T>[]> subscribers;
    final AtomicReference<InterfaceC44418d> upstream;
    final AtomicInteger wip;

    public static final class MulticastSubscription<T> extends AtomicLong implements InterfaceC44418d {
        private static final long serialVersionUID = -363282618957264509L;
        final InterfaceC44417c<? super T> downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }

        public MulticastSubscription(InterfaceC44417c<? super T> interfaceC44417c, MulticastProcessor<T> multicastProcessor) {
            this.downstream = interfaceC44417c;
            this.parent = multicastProcessor;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th2);
            }
        }

        public void onNext(T t11) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t11);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            long j12;
            long j13;
            if (SubscriptionHelper.validate(j11)) {
                do {
                    j12 = get();
                    if (j12 != Long.MIN_VALUE) {
                        j13 = Long.MAX_VALUE;
                        if (j12 != Long.MAX_VALUE) {
                            long j14 = j12 + j11;
                            if (j14 >= 0) {
                                j13 = j14;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j12, j13));
                this.parent.drain();
            }
        }
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create() {
        return new MulticastProcessor<>(Flowable.bufferSize(), false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(boolean z11) {
        return new MulticastProcessor<>(Flowable.bufferSize(), z11);
    }

    public boolean add(MulticastSubscription<T> multicastSubscription) {
        MulticastSubscription<T>[] multicastSubscriptionArr;
        MulticastSubscription[] multicastSubscriptionArr2;
        do {
            multicastSubscriptionArr = this.subscribers.get();
            if (multicastSubscriptionArr == TERMINATED) {
                return false;
            }
            int length = multicastSubscriptionArr.length;
            multicastSubscriptionArr2 = new MulticastSubscription[length + 1];
            System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, length);
            multicastSubscriptionArr2[length] = multicastSubscription;
        } while (!C1454t.m2255a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2));
        return true;
    }

    public void drain() {
        T tPoll;
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        AtomicReference<MulticastSubscription<T>[]> atomicReference = this.subscribers;
        int i11 = this.consumed;
        int i12 = this.limit;
        int i13 = this.fusionMode;
        int iAddAndGet = 1;
        while (true) {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference.get();
                if (multicastSubscriptionArr.length != 0) {
                    int i14 = 0;
                    long jMin = -1;
                    for (MulticastSubscription<T> multicastSubscription : multicastSubscriptionArr) {
                        long j11 = multicastSubscription.get();
                        if (j11 >= 0) {
                            jMin = jMin == -1 ? j11 - multicastSubscription.emitted : Math.min(jMin, j11 - multicastSubscription.emitted);
                        }
                    }
                    int i15 = i11;
                    while (true) {
                        if (jMin > 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                            if (multicastSubscriptionArr2 == TERMINATED) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr == multicastSubscriptionArr2) {
                                boolean z11 = this.done;
                                try {
                                    tPoll = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    SubscriptionHelper.cancel(this.upstream);
                                    this.error = th2;
                                    this.done = true;
                                    tPoll = null;
                                    z11 = true;
                                }
                                boolean z12 = tPoll == null;
                                if (z11 && z12) {
                                    Throwable th3 = this.error;
                                    if (th3 != null) {
                                        MulticastSubscription<T>[] andSet = atomicReference.getAndSet(TERMINATED);
                                        int length = andSet.length;
                                        while (i14 < length) {
                                            andSet[i14].onError(th3);
                                            i14++;
                                        }
                                        return;
                                    }
                                    MulticastSubscription<T>[] andSet2 = atomicReference.getAndSet(TERMINATED);
                                    int length2 = andSet2.length;
                                    while (i14 < length2) {
                                        andSet2[i14].onComplete();
                                        i14++;
                                    }
                                    return;
                                }
                                if (!z12) {
                                    for (MulticastSubscription<T> multicastSubscription2 : multicastSubscriptionArr) {
                                        multicastSubscription2.onNext(tPoll);
                                    }
                                    jMin--;
                                    if (i13 != 1 && (i15 = i15 + 1) == i12) {
                                        this.upstream.get().request(i12);
                                        i15 = 0;
                                    }
                                }
                            }
                            i11 = i15;
                        }
                        if (jMin == 0) {
                            MulticastSubscription<T>[] multicastSubscriptionArr3 = atomicReference.get();
                            MulticastSubscription<T>[] multicastSubscriptionArr4 = TERMINATED;
                            if (multicastSubscriptionArr3 == multicastSubscriptionArr4) {
                                simpleQueue.clear();
                                return;
                            }
                            if (multicastSubscriptionArr != multicastSubscriptionArr3) {
                                i11 = i15;
                            } else if (this.done && simpleQueue.isEmpty()) {
                                Throwable th4 = this.error;
                                if (th4 != null) {
                                    MulticastSubscription<T>[] andSet3 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                    int length3 = andSet3.length;
                                    while (i14 < length3) {
                                        andSet3[i14].onError(th4);
                                        i14++;
                                    }
                                    return;
                                }
                                MulticastSubscription<T>[] andSet4 = atomicReference.getAndSet(multicastSubscriptionArr4);
                                int length4 = andSet4.length;
                                while (i14 < length4) {
                                    andSet4[i14].onComplete();
                                    i14++;
                                }
                                return;
                            }
                        }
                        i11 = i15;
                    }
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public Throwable getThrowable() {
        if (this.once.get()) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.once.get() && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.once.get() && this.error != null;
    }

    public boolean offer(T t11) {
        if (this.once.get()) {
            return false;
        }
        ObjectHelper.requireNonNull(t11, "offer called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.fusionMode != 0 || !this.queue.offer(t11)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onComplete() {
        if (this.once.compareAndSet(false, true)) {
            this.done = true;
            drain();
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.once.compareAndSet(false, true)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.error = th2;
        this.done = true;
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (this.once.get()) {
            return;
        }
        if (this.fusionMode == 0) {
            ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!this.queue.offer(t11)) {
                SubscriptionHelper.cancel(this.upstream);
                onError(new MissingBackpressureException());
                return;
            }
        }
        drain();
    }

    @Override // sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
            if (interfaceC44418d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    interfaceC44418d.request(this.bufferSize);
                    return;
                }
            }
            this.queue = new SpscArrayQueue(this.bufferSize);
            interfaceC44418d.request(this.bufferSize);
        }
    }

    public void remove(MulticastSubscription<T> multicastSubscription) {
        while (true) {
            MulticastSubscription<T>[] multicastSubscriptionArr = this.subscribers.get();
            int length = multicastSubscriptionArr.length;
            if (length == 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                } else if (multicastSubscriptionArr[i11] == multicastSubscription) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 < 0) {
                return;
            }
            if (length != 1) {
                MulticastSubscription[] multicastSubscriptionArr2 = new MulticastSubscription[length - 1];
                System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr2, 0, i11);
                System.arraycopy(multicastSubscriptionArr, i11 + 1, multicastSubscriptionArr2, i11, (length - i11) - 1);
                if (C1454t.m2255a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2)) {
                    return;
                }
            } else if (this.refcount) {
                if (C1454t.m2255a(this.subscribers, multicastSubscriptionArr, TERMINATED)) {
                    SubscriptionHelper.cancel(this.upstream);
                    this.once.set(true);
                    return;
                }
            } else if (C1454t.m2255a(this.subscribers, multicastSubscriptionArr, EMPTY)) {
                return;
            }
        }
    }

    public void start() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscArrayQueue(this.bufferSize);
        }
    }

    public void startUnbounded() {
        if (SubscriptionHelper.setOnce(this.upstream, EmptySubscription.INSTANCE)) {
            this.queue = new SpscLinkedArrayQueue(this.bufferSize);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        Throwable th2;
        MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(interfaceC44417c, this);
        interfaceC44417c.onSubscribe(multicastSubscription);
        if (add(multicastSubscription)) {
            if (multicastSubscription.get() == Long.MIN_VALUE) {
                remove(multicastSubscription);
                return;
            } else {
                drain();
                return;
            }
        }
        if ((this.once.get() || !this.refcount) && (th2 = this.error) != null) {
            interfaceC44417c.onError(th2);
        } else {
            interfaceC44417c.onComplete();
        }
    }

    public MulticastProcessor(int i11, boolean z11) {
        ObjectHelper.verifyPositive(i11, "bufferSize");
        this.bufferSize = i11;
        this.limit = i11 - (i11 >> 2);
        this.wip = new AtomicInteger();
        this.subscribers = new AtomicReference<>(EMPTY);
        this.upstream = new AtomicReference<>();
        this.refcount = z11;
        this.once = new AtomicBoolean();
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i11) {
        return new MulticastProcessor<>(i11, false);
    }

    @CheckReturnValue
    @NonNull
    public static <T> MulticastProcessor<T> create(int i11, boolean z11) {
        return new MulticastProcessor<>(i11, z11);
    }
}
