package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> implements HasUpstreamPublisher<T> {
    static final long CANCELLED = Long.MIN_VALUE;
    final int bufferSize;
    final AtomicReference<PublishSubscriber<T>> current;
    final InterfaceC44416b<T> onSubscribe;
    final Flowable<T> source;

    public static final class FlowablePublisher<T> implements InterfaceC44416b<T> {
        private final int bufferSize;
        private final AtomicReference<PublishSubscriber<T>> curr;

        @Override // sh0.InterfaceC44416b
        public void subscribe(InterfaceC44417c<? super T> interfaceC44417c) {
            PublishSubscriber<T> publishSubscriber;
            InnerSubscriber<T> innerSubscriber = new InnerSubscriber<>(interfaceC44417c);
            interfaceC44417c.onSubscribe(innerSubscriber);
            while (true) {
                publishSubscriber = this.curr.get();
                if (publishSubscriber == null || publishSubscriber.getDisposed()) {
                    PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.curr, this.bufferSize);
                    if (C1454t.m2255a(this.curr, publishSubscriber, publishSubscriber2)) {
                        publishSubscriber = publishSubscriber2;
                    } else {
                        continue;
                    }
                }
                if (publishSubscriber.add(innerSubscriber)) {
                    break;
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.remove(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.dispatch();
        }

        public FlowablePublisher(AtomicReference<PublishSubscriber<T>> atomicReference, int i11) {
            this.curr = atomicReference;
            this.bufferSize = i11;
        }
    }

    public static final class PublishSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        static final InnerSubscriber[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber[] TERMINATED = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        volatile Object terminalEvent;
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference<>(EMPTY);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public boolean checkTerminated(Object obj, boolean z11) {
            int i11 = 0;
            if (obj != null) {
                if (!NotificationLite.isComplete(obj)) {
                    Throwable error = NotificationLite.getError(obj);
                    C1454t.m2255a(this.current, this, null);
                    InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(TERMINATED);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i11 < length) {
                            andSet[i11].child.onError(error);
                            i11++;
                        }
                    } else {
                        RxJavaPlugins.onError(error);
                    }
                    return true;
                }
                if (z11) {
                    C1454t.m2255a(this.current, this, null);
                    InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(TERMINATED);
                    int length2 = andSet2.length;
                    while (i11 < length2) {
                        andSet2[i11].child.onComplete();
                        i11++;
                    }
                    return true;
                }
            }
            return false;
        }

        public boolean add(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == TERMINATED) {
                    return false;
                }
                int length = innerSubscriberArr.length;
                innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
            } while (!C1454t.m2255a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
            return true;
        }

        public void dispatch() {
            boolean z11;
            T tPoll;
            InnerSubscriber<T>[] innerSubscriberArr;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
            boolean z12 = true;
            InnerSubscriber<T>[] innerSubscriberArr2 = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.terminalEvent;
                SimpleQueue<T> simpleQueue = this.queue;
                boolean z13 = (simpleQueue == null || simpleQueue.isEmpty()) ? z12 : false;
                if (checkTerminated(obj, z13)) {
                    return;
                }
                if (z13) {
                    z11 = z12;
                } else {
                    int length = innerSubscriberArr2.length;
                    int i11 = 0;
                    long jMin = Long.MAX_VALUE;
                    for (InnerSubscriber<T> innerSubscriber : innerSubscriberArr2) {
                        long j11 = innerSubscriber.get();
                        if (j11 != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j11 - innerSubscriber.emitted);
                        } else {
                            i11++;
                        }
                    }
                    long j12 = 1;
                    if (length == i11) {
                        Object objError = this.terminalEvent;
                        try {
                            tPoll = simpleQueue.poll();
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            this.upstream.get().cancel();
                            objError = NotificationLite.error(th2);
                            this.terminalEvent = objError;
                            tPoll = null;
                        }
                        if (checkTerminated(objError, tPoll == null ? z12 : false)) {
                            return;
                        }
                        if (this.sourceMode != z12) {
                            this.upstream.get().request(1L);
                        }
                        z11 = z12;
                        innerSubscriberArr = innerSubscriberArr2;
                    } else {
                        int i12 = 0;
                        while (true) {
                            long j13 = i12;
                            if (j13 < jMin) {
                                Object objError2 = this.terminalEvent;
                                try {
                                    tPoll2 = simpleQueue.poll();
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.upstream.get().cancel();
                                    objError2 = NotificationLite.error(th3);
                                    this.terminalEvent = objError2;
                                    tPoll2 = null;
                                }
                                boolean z14 = tPoll2 == null ? z12 : false;
                                if (checkTerminated(objError2, z14)) {
                                    return;
                                }
                                if (z14) {
                                    z13 = z14;
                                } else {
                                    Object value = NotificationLite.getValue(tPoll2);
                                    int length2 = innerSubscriberArr2.length;
                                    int i13 = 0;
                                    boolean z15 = false;
                                    while (i13 < length2) {
                                        long j14 = j12;
                                        InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr2[i13];
                                        long j15 = innerSubscriber2.get();
                                        if (j15 != Long.MIN_VALUE) {
                                            if (j15 != Long.MAX_VALUE) {
                                                innerSubscriber2.emitted += j14;
                                            }
                                            innerSubscriber2.child.onNext(value);
                                        } else {
                                            z15 = true;
                                        }
                                        i13++;
                                        innerSubscriberArr2 = innerSubscriberArr2;
                                        j12 = j14;
                                    }
                                    InnerSubscriber<T>[] innerSubscriberArr3 = innerSubscriberArr2;
                                    long j16 = j12;
                                    i12++;
                                    InnerSubscriber<T>[] innerSubscriberArr4 = atomicReference.get();
                                    if (z15 || innerSubscriberArr4 != innerSubscriberArr3) {
                                        if (i12 != 0 && this.sourceMode != 1) {
                                            this.upstream.get().request(i12);
                                        }
                                        innerSubscriberArr2 = innerSubscriberArr4;
                                        z12 = true;
                                    } else {
                                        innerSubscriberArr2 = innerSubscriberArr3;
                                        z13 = z14;
                                        j12 = j16;
                                        z12 = true;
                                    }
                                }
                            }
                            innerSubscriberArr = innerSubscriberArr2;
                            if (i12 != 0) {
                                z11 = true;
                                if (this.sourceMode != 1) {
                                    this.upstream.get().request(j13);
                                }
                            } else {
                                z11 = true;
                            }
                            if (jMin == 0 || z13) {
                            }
                            z12 = z11;
                        }
                    }
                    innerSubscriberArr2 = innerSubscriberArr;
                    z12 = z11;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                innerSubscriberArr2 = atomicReference.get();
                z12 = z11;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = TERMINATED;
            if (innerSubscriberArr == innerSubscriberArr2 || this.subscribers.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            C1454t.m2255a(this.current, this, null);
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.subscribers.get() == TERMINATED;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.complete();
                dispatch();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.terminalEvent != null) {
                RxJavaPlugins.onError(th2);
            } else {
                this.terminalEvent = NotificationLite.error(th2);
                dispatch();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.sourceMode != 0 || this.queue.offer(t11)) {
                dispatch();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.terminalEvent = NotificationLite.complete();
                        dispatch();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        interfaceC44418d.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                interfaceC44418d.request(this.bufferSize);
            }
        }

        public void remove(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            InnerSubscriber[] innerSubscriberArr2;
            do {
                innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (length == 0) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (innerSubscriberArr[i11].equals(innerSubscriber)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr2 = EMPTY;
                } else {
                    InnerSubscriber[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr3, 0, i11);
                    System.arraycopy(innerSubscriberArr, i11 + 1, innerSubscriberArr3, i11, (length - i11) - 1);
                    innerSubscriberArr2 = innerSubscriberArr3;
                }
            } while (!C1454t.m2255a(this.subscribers, innerSubscriberArr, innerSubscriberArr2));
        }

        public PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i11) {
            this.current = atomicReference;
            this.bufferSize = i11;
        }
    }

    public static final class InnerSubscriber<T> extends AtomicLong implements InterfaceC44418d {
        private static final long serialVersionUID = -4453897557930727610L;
        final InterfaceC44417c<? super T> child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        public InnerSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
            this.child = interfaceC44417c;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            PublishSubscriber<T> publishSubscriber;
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE && (publishSubscriber = this.parent) != null) {
                publishSubscriber.remove(this);
                publishSubscriber.dispatch();
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.addCancel(this, j11);
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.dispatch();
                }
            }
        }
    }

    public static <T> ConnectableFlowable<T> create(Flowable<T> flowable, int i11) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableFlowable) new FlowablePublish(new FlowablePublisher(atomicReference, i11), flowable, atomicReference, i11));
    }

    @Override // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishSubscriber<T> publishSubscriber;
        while (true) {
            publishSubscriber = this.current.get();
            if (publishSubscriber != null && !publishSubscriber.getDisposed()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(this.current, this.bufferSize);
            if (C1454t.m2255a(this.current, publishSubscriber, publishSubscriber2)) {
                publishSubscriber = publishSubscriber2;
                break;
            }
        }
        boolean z11 = false;
        if (!publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true)) {
            z11 = true;
        }
        try {
            consumer.accept(publishSubscriber);
            if (z11) {
                this.source.subscribe((FlowableSubscriber) publishSubscriber);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public InterfaceC44416b<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.onSubscribe.subscribe(interfaceC44417c);
    }

    private FlowablePublish(InterfaceC44416b<T> interfaceC44416b, Flowable<T> flowable, AtomicReference<PublishSubscriber<T>> atomicReference, int i11) {
        this.onSubscribe = interfaceC44416b;
        this.source = flowable;
        this.current = atomicReference;
        this.bufferSize = i11;
    }
}
