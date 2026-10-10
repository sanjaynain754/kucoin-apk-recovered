package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {
    final BiPredicate<? super T, ? super T> comparer;
    final InterfaceC44416b<? extends T> first;
    final int prefetch;
    final InterfaceC44416b<? extends T> second;

    public static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final BiPredicate<? super T, ? super T> comparer;
        final AtomicThrowable error;
        final EqualSubscriber<T> first;
        final EqualSubscriber<T> second;

        /* JADX INFO: renamed from: v1 */
        T f87155v1;

        /* JADX INFO: renamed from: v2 */
        T f87156v2;
        final AtomicInteger wip;

        public void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            int iAddAndGet = 1;
            do {
                SimpleQueue<T> simpleQueue = this.first.queue;
                SimpleQueue<T> simpleQueue2 = this.second.queue;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (true) {
                        if (isCancelled()) {
                            this.first.clear();
                            this.second.clear();
                            return;
                        }
                        if (this.error.get() != null) {
                            cancelAndClear();
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                        boolean z11 = this.first.done;
                        T tPoll = this.f87155v1;
                        if (tPoll == null) {
                            try {
                                tPoll = simpleQueue.poll();
                                this.f87155v1 = tPoll;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                cancelAndClear();
                                this.error.addThrowable(th2);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z12 = tPoll == null;
                        boolean z13 = this.second.done;
                        T tPoll2 = this.f87156v2;
                        if (tPoll2 == null) {
                            try {
                                tPoll2 = simpleQueue2.poll();
                                this.f87156v2 = tPoll2;
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                cancelAndClear();
                                this.error.addThrowable(th3);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z14 = tPoll2 == null;
                        if (z11 && z13 && z12 && z14) {
                            complete(Boolean.TRUE);
                            return;
                        }
                        if (z11 && z13 && z12 != z14) {
                            cancelAndClear();
                            complete(Boolean.FALSE);
                            return;
                        }
                        if (z12 || z14) {
                            break;
                        }
                        try {
                            if (!this.comparer.test(tPoll, tPoll2)) {
                                cancelAndClear();
                                complete(Boolean.FALSE);
                                return;
                            } else {
                                this.f87155v1 = null;
                                this.f87156v2 = null;
                                this.first.request();
                                this.second.request();
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            cancelAndClear();
                            this.error.addThrowable(th4);
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                    }
                } else if (isCancelled()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (this.error.get() != null) {
                    cancelAndClear();
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(Throwable th2) {
            if (this.error.addThrowable(th2)) {
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        public void subscribe(InterfaceC44416b<? extends T> interfaceC44416b, InterfaceC44416b<? extends T> interfaceC44416b2) {
            interfaceC44416b.subscribe(this.first);
            interfaceC44416b2.subscribe(this.second);
        }

        public EqualCoordinator(InterfaceC44417c<? super Boolean> interfaceC44417c, int i11, BiPredicate<? super T, ? super T> biPredicate) {
            super(interfaceC44417c);
            this.comparer = biPredicate;
            this.wip = new AtomicInteger();
            this.first = new EqualSubscriber<>(this, i11);
            this.second = new EqualSubscriber<>(this, i11);
            this.error = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            super.cancel();
            this.first.cancel();
            this.second.cancel();
            if (this.wip.getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }
    }

    public interface EqualCoordinatorHelper {
        void drain();

        void innerError(Throwable th2);
    }

    public static final class EqualSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        volatile boolean done;
        final int limit;
        final EqualCoordinatorHelper parent;
        final int prefetch;
        long produced;
        volatile SimpleQueue<T> queue;
        int sourceMode;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        public void clear() {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.innerError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.sourceMode != 0 || this.queue.offer(t11)) {
                this.parent.drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        public void request() {
            if (this.sourceMode != 1) {
                long j11 = this.produced + 1;
                if (j11 < this.limit) {
                    this.produced = j11;
                } else {
                    this.produced = 0L;
                    get().request(j11);
                }
            }
        }

        public EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper, int i11) {
            this.parent = equalCoordinatorHelper;
            this.limit = i11 - (i11 >> 2);
            this.prefetch = i11;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        interfaceC44418d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                interfaceC44418d.request(this.prefetch);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super Boolean> interfaceC44417c) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(interfaceC44417c, this.prefetch, this.comparer);
        interfaceC44417c.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.first, this.second);
    }

    public FlowableSequenceEqual(InterfaceC44416b<? extends T> interfaceC44416b, InterfaceC44416b<? extends T> interfaceC44416b2, BiPredicate<? super T, ? super T> biPredicate, int i11) {
        this.first = interfaceC44416b;
        this.second = interfaceC44416b2;
        this.comparer = biPredicate;
        this.prefetch = i11;
    }
}
