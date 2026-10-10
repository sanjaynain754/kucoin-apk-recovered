package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelJoin<T> extends Flowable<T> {
    final boolean delayErrors;
    final int prefetch;
    final ParallelFlowable<? extends T> source;

    public static final class JoinInnerSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        final int limit;
        final JoinSubscriptionBase<T> parent;
        final int prefetch;
        long produced;
        volatile SimplePlainQueue<T> queue;

        public SimplePlainQueue<T> getQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.parent.onNext(this, t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, this.prefetch);
        }

        public void request(long j11) {
            long j12 = this.produced + j11;
            if (j12 < this.limit) {
                this.produced = j12;
            } else {
                this.produced = 0L;
                get().request(j12);
            }
        }

        public void requestOne() {
            long j11 = this.produced + 1;
            if (j11 != this.limit) {
                this.produced = j11;
            } else {
                this.produced = 0L;
                get().request(j11);
            }
        }

        public JoinInnerSubscriber(JoinSubscriptionBase<T> joinSubscriptionBase, int i11) {
            this.parent = joinSubscriptionBase;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        public boolean cancel() {
            return SubscriptionHelper.cancel(this);
        }
    }

    public static final class JoinSubscription<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public void drainLoop() {
            boolean z11;
            long j11;
            boolean z12;
            T tPoll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            int i11 = 1;
            while (true) {
                long j12 = this.requested.get();
                long j13 = 0;
                do {
                    z11 = false;
                    if (j13 == j12) {
                        j11 = 0;
                        break;
                    }
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    Throwable th2 = this.errors.get();
                    if (th2 != null) {
                        cleanup();
                        interfaceC44417c.onError(th2);
                        return;
                    }
                    boolean z13 = this.done.get() == 0;
                    z12 = true;
                    for (JoinInnerSubscriber<T> joinInnerSubscriber : joinInnerSubscriberArr) {
                        j11 = 0;
                        SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            interfaceC44417c.onNext(tPoll);
                            joinInnerSubscriber.requestOne();
                            j13++;
                            if (j13 == j12) {
                                break;
                            } else {
                                z12 = false;
                            }
                        }
                    }
                    j11 = 0;
                    if (z13 && z12) {
                        interfaceC44417c.onComplete();
                        return;
                    }
                } while (!z12);
                if (j13 == j12) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    Throwable th3 = this.errors.get();
                    if (th3 != null) {
                        cleanup();
                        interfaceC44417c.onError(th3);
                        return;
                    }
                    boolean z14 = this.done.get() == 0;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            z11 = true;
                            break;
                        }
                        SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i12].queue;
                        if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (z14 && z11) {
                        interfaceC44417c.onComplete();
                        return;
                    }
                }
                if (j13 != j11 && j12 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j13);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i11 && (iAddAndGet = addAndGet(-i11)) == 0) {
                    return;
                } else {
                    i11 = iAddAndGet;
                }
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable th2) {
            if (this.errors.compareAndSet(null, th2)) {
                cancelAll();
                drain();
            } else if (th2 != this.errors.get()) {
                RxJavaPlugins.onError(th2);
            }
        }

        public JoinSubscription(InterfaceC44417c<? super T> interfaceC44417c, int i11, int i12) {
            super(interfaceC44417c, i11, i12);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t11) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t11);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t11)) {
                    cancelAll();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Queue full?!");
                    if (this.errors.compareAndSet(null, missingBackpressureException)) {
                        this.downstream.onError(missingBackpressureException);
                        return;
                    } else {
                        RxJavaPlugins.onError(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!joinInnerSubscriber.getQueue().offer(t11)) {
                cancelAll();
                onError(new MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public static abstract class JoinSubscriptionBase<T> extends AtomicInteger implements InterfaceC44418d {
        private static final long serialVersionUID = 3100232009247827843L;
        volatile boolean cancelled;
        final InterfaceC44417c<? super T> downstream;
        final JoinInnerSubscriber<T>[] subscribers;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger done = new AtomicInteger();

        public abstract void drain();

        public abstract void onComplete();

        public abstract void onError(Throwable th2);

        public abstract void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t11);

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                cleanup();
            }
        }

        public void cancelAll() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.cancel();
            }
        }

        public void cleanup() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.queue = null;
            }
        }

        public JoinSubscriptionBase(InterfaceC44417c<? super T> interfaceC44417c, int i11, int i12) {
            this.downstream = interfaceC44417c;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = new JoinInnerSubscriber[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                joinInnerSubscriberArr[i13] = new JoinInnerSubscriber<>(this, i12);
            }
            this.subscribers = joinInnerSubscriberArr;
            this.done.lazySet(i11);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public void drainLoop() {
            boolean z11;
            long j11;
            boolean z12;
            T tPoll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            int i11 = 1;
            while (true) {
                long j12 = this.requested.get();
                long j13 = 0;
                do {
                    z11 = false;
                    if (j13 == j12) {
                        j11 = 0;
                        break;
                    }
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    boolean z13 = this.done.get() == 0;
                    z12 = true;
                    for (JoinInnerSubscriber<T> joinInnerSubscriber : joinInnerSubscriberArr) {
                        j11 = 0;
                        SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                        if (simplePlainQueue != null && (tPoll = simplePlainQueue.poll()) != null) {
                            interfaceC44417c.onNext(tPoll);
                            joinInnerSubscriber.requestOne();
                            j13++;
                            if (j13 == j12) {
                                break;
                            } else {
                                z12 = false;
                            }
                        }
                    }
                    j11 = 0;
                    if (z13 && z12) {
                        if (this.errors.get() != null) {
                            interfaceC44417c.onError(this.errors.terminate());
                            return;
                        } else {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                } while (!z12);
                if (j13 == j12) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    boolean z14 = this.done.get() == 0;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            z11 = true;
                            break;
                        }
                        SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i12].queue;
                        if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (z14 && z11) {
                        if (this.errors.get() != null) {
                            interfaceC44417c.onError(this.errors.terminate());
                            return;
                        } else {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                }
                if (j13 != j11 && j12 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j13);
                }
                int iAddAndGet = get();
                if (iAddAndGet == i11 && (iAddAndGet = addAndGet(-i11)) == 0) {
                    return;
                } else {
                    i11 = iAddAndGet;
                }
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable th2) {
            this.errors.addThrowable(th2);
            this.done.decrementAndGet();
            drain();
        }

        public JoinSubscriptionDelayError(InterfaceC44417c<? super T> interfaceC44417c, int i11, int i12) {
            super(interfaceC44417c, i11, i12);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t11) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t11);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t11)) {
                    joinInnerSubscriber.cancel();
                    this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                    drainLoop();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!joinInnerSubscriber.getQueue().offer(t11) && joinInnerSubscriber.cancel()) {
                    this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        JoinSubscriptionBase joinSubscriptionDelayError = this.delayErrors ? new JoinSubscriptionDelayError(interfaceC44417c, this.source.parallelism(), this.prefetch) : new JoinSubscription(interfaceC44417c, this.source.parallelism(), this.prefetch);
        interfaceC44417c.onSubscribe(joinSubscriptionDelayError);
        this.source.subscribe(joinSubscriptionDelayError.subscribers);
    }

    public ParallelJoin(ParallelFlowable<? extends T> parallelFlowable, int i11, boolean z11) {
        this.source = parallelFlowable;
        this.prefetch = i11;
        this.delayErrors = z11;
    }
}
