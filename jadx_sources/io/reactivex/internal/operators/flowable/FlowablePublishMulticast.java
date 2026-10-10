package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowablePublishMulticast<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final boolean delayError;
    final int prefetch;
    final Function<? super Flowable<T>, ? extends InterfaceC44416b<? extends R>> selector;

    public static final class MulticastProcessor<T> extends Flowable<T> implements FlowableSubscriber<T>, Disposable {
        static final MulticastSubscription[] EMPTY = new MulticastSubscription[0];
        static final MulticastSubscription[] TERMINATED = new MulticastSubscription[0];
        int consumed;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        volatile SimpleQueue<T> queue;
        int sourceMode;
        final AtomicInteger wip = new AtomicInteger();
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicReference<MulticastSubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);

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

        public void completeAll() {
            for (MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SimpleQueue<T> simpleQueue;
            SubscriptionHelper.cancel(this.upstream);
            if (this.wip.getAndIncrement() != 0 || (simpleQueue = this.queue) == null) {
                return;
            }
            simpleQueue.clear();
        }

        public void drain() {
            AtomicReference<MulticastSubscription<T>[]> atomicReference;
            Throwable th2;
            Throwable th3;
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            SimpleQueue<T> simpleQueue = this.queue;
            int i11 = this.consumed;
            int i12 = this.limit;
            boolean z11 = this.sourceMode != 1;
            AtomicReference<MulticastSubscription<T>[]> atomicReference2 = this.subscribers;
            MulticastSubscription<T>[] multicastSubscriptionArr = atomicReference2.get();
            int iAddAndGet = 1;
            while (true) {
                int length = multicastSubscriptionArr.length;
                if (simpleQueue == null || length == 0) {
                    atomicReference = atomicReference2;
                } else {
                    int length2 = multicastSubscriptionArr.length;
                    long j11 = Long.MAX_VALUE;
                    long j12 = Long.MAX_VALUE;
                    int i13 = 0;
                    while (i13 < length2) {
                        MulticastSubscription<T> multicastSubscription = multicastSubscriptionArr[i13];
                        AtomicReference<MulticastSubscription<T>[]> atomicReference3 = atomicReference2;
                        long j13 = multicastSubscription.get() - multicastSubscription.emitted;
                        if (j13 == Long.MIN_VALUE) {
                            length--;
                        } else if (j12 > j13) {
                            j12 = j13;
                        }
                        i13++;
                        atomicReference2 = atomicReference3;
                    }
                    atomicReference = atomicReference2;
                    long j14 = 0;
                    if (length == 0) {
                        j12 = 0;
                    }
                    while (true) {
                        if (j12 != j14) {
                            if (getDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z12 = this.done;
                            if (z12 && !this.delayError && (th3 = this.error) != null) {
                                errorAll(th3);
                                return;
                            }
                            try {
                                T tPoll = simpleQueue.poll();
                                boolean z13 = tPoll == null;
                                if (z12 && z13) {
                                    Throwable th4 = this.error;
                                    if (th4 != null) {
                                        errorAll(th4);
                                        return;
                                    } else {
                                        completeAll();
                                        return;
                                    }
                                }
                                if (!z13) {
                                    int length3 = multicastSubscriptionArr.length;
                                    int i14 = 0;
                                    boolean z14 = false;
                                    while (i14 < length3) {
                                        MulticastSubscription<T> multicastSubscription2 = multicastSubscriptionArr[i14];
                                        long j15 = multicastSubscription2.get();
                                        if (j15 != Long.MIN_VALUE) {
                                            if (j15 != j11) {
                                                multicastSubscription2.emitted++;
                                            }
                                            multicastSubscription2.downstream.onNext(tPoll);
                                        } else {
                                            z14 = true;
                                        }
                                        i14++;
                                        j11 = Long.MAX_VALUE;
                                    }
                                    j12--;
                                    if (z11 && (i11 = i11 + 1) == i12) {
                                        this.upstream.get().request(i12);
                                        i11 = 0;
                                    }
                                    MulticastSubscription<T>[] multicastSubscriptionArr2 = atomicReference.get();
                                    if (z14 || multicastSubscriptionArr2 != multicastSubscriptionArr) {
                                        multicastSubscriptionArr = multicastSubscriptionArr2;
                                    } else {
                                        j14 = 0;
                                        j11 = Long.MAX_VALUE;
                                    }
                                }
                                atomicReference2 = atomicReference;
                            } catch (Throwable th5) {
                                Exceptions.throwIfFatal(th5);
                                SubscriptionHelper.cancel(this.upstream);
                                errorAll(th5);
                                return;
                            }
                        }
                        if (j12 == j14) {
                            if (getDisposed()) {
                                simpleQueue.clear();
                                return;
                            }
                            boolean z15 = this.done;
                            if (z15 && !this.delayError && (th2 = this.error) != null) {
                                errorAll(th2);
                                return;
                            }
                            if (z15 && simpleQueue.isEmpty()) {
                                Throwable th6 = this.error;
                                if (th6 != null) {
                                    errorAll(th6);
                                    return;
                                } else {
                                    completeAll();
                                    return;
                                }
                            }
                        }
                    }
                }
                this.consumed = i11;
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue == null) {
                    simpleQueue = this.queue;
                }
                multicastSubscriptionArr = atomicReference.get();
                atomicReference2 = atomicReference;
            }
        }

        public void errorAll(Throwable th2) {
            for (MulticastSubscription<T> multicastSubscription : this.subscribers.getAndSet(TERMINATED)) {
                if (multicastSubscription.get() != Long.MIN_VALUE) {
                    multicastSubscription.downstream.onError(th2);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream.get() == SubscriptionHelper.CANCELLED;
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
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0 || this.queue.offer(t11)) {
                drain();
            } else {
                this.upstream.get().cancel();
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        QueueDrainHelper.request(interfaceC44418d, this.prefetch);
                        return;
                    }
                }
                this.queue = QueueDrainHelper.createQueue(this.prefetch);
                QueueDrainHelper.request(interfaceC44418d, this.prefetch);
            }
        }

        public void remove(MulticastSubscription<T> multicastSubscription) {
            MulticastSubscription<T>[] multicastSubscriptionArr;
            MulticastSubscription[] multicastSubscriptionArr2;
            do {
                multicastSubscriptionArr = this.subscribers.get();
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
                if (length == 1) {
                    multicastSubscriptionArr2 = EMPTY;
                } else {
                    MulticastSubscription[] multicastSubscriptionArr3 = new MulticastSubscription[length - 1];
                    System.arraycopy(multicastSubscriptionArr, 0, multicastSubscriptionArr3, 0, i11);
                    System.arraycopy(multicastSubscriptionArr, i11 + 1, multicastSubscriptionArr3, i11, (length - i11) - 1);
                    multicastSubscriptionArr2 = multicastSubscriptionArr3;
                }
            } while (!C1454t.m2255a(this.subscribers, multicastSubscriptionArr, multicastSubscriptionArr2));
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
            MulticastSubscription<T> multicastSubscription = new MulticastSubscription<>(interfaceC44417c, this);
            interfaceC44417c.onSubscribe(multicastSubscription);
            if (add(multicastSubscription)) {
                if (multicastSubscription.isCancelled()) {
                    remove(multicastSubscription);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                interfaceC44417c.onError(th2);
            } else {
                interfaceC44417c.onComplete();
            }
        }

        public MulticastProcessor(int i11, boolean z11) {
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
            this.delayError = z11;
        }
    }

    public static final class MulticastSubscription<T> extends AtomicLong implements InterfaceC44418d {
        private static final long serialVersionUID = 8664815189257569791L;
        final InterfaceC44417c<? super T> downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
                this.parent.drain();
            }
        }

        public MulticastSubscription(InterfaceC44417c<? super T> interfaceC44417c, MulticastProcessor<T> multicastProcessor) {
            this.downstream = interfaceC44417c;
            this.parent = multicastProcessor;
        }

        public boolean isCancelled() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.addCancel(this, j11);
                this.parent.drain();
            }
        }
    }

    public static final class OutputCanceller<R> implements FlowableSubscriber<R>, InterfaceC44418d {
        final InterfaceC44417c<? super R> downstream;
        final MulticastProcessor<?> processor;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
            this.processor.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(R r11) {
            this.downstream.onNext(r11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        public OutputCanceller(InterfaceC44417c<? super R> interfaceC44417c, MulticastProcessor<?> multicastProcessor) {
            this.downstream = interfaceC44417c;
            this.processor = multicastProcessor;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        MulticastProcessor multicastProcessor = new MulticastProcessor(this.prefetch, this.delayError);
        try {
            ((InterfaceC44416b) ObjectHelper.requireNonNull(this.selector.apply(multicastProcessor), "selector returned a null Publisher")).subscribe(new OutputCanceller(interfaceC44417c, multicastProcessor));
            this.source.subscribe((FlowableSubscriber) multicastProcessor);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowablePublishMulticast(Flowable<T> flowable, Function<? super Flowable<T>, ? extends InterfaceC44416b<? extends R>> function, int i11, boolean z11) {
        super(flowable);
        this.selector = function;
        this.prefetch = i11;
        this.delayError = z11;
    }
}
