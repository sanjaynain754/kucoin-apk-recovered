package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
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
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    final SingleSource<? extends T> other;

    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final InterfaceC44417c<? super T> downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<InterfaceC44418d> mainSubscription = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t11) {
                this.parent.otherSuccess(t11);
            }

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (compareAndSet(0, 1)) {
                long j11 = this.emitted;
                if (this.requested.get() != j11) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null || simplePlainQueue.isEmpty()) {
                        this.emitted = j11 + 1;
                        this.downstream.onNext(t11);
                        int i11 = this.consumed + 1;
                        if (i11 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i11);
                        } else {
                            this.consumed = i11;
                        }
                    } else {
                        simplePlainQueue.offer(t11);
                    }
                } else {
                    getOrCreateQueue().offer(t11);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t11);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void otherSuccess(T t11) {
            if (compareAndSet(0, 1)) {
                long j11 = this.emitted;
                if (this.requested.get() != j11) {
                    this.emitted = j11 + 1;
                    this.downstream.onNext(t11);
                    this.otherState = 2;
                } else {
                    this.singleItem = t11;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t11;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void drainLoop() {
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            long j11 = this.emitted;
            int i11 = this.consumed;
            int i12 = this.limit;
            int i13 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.requested.get();
                while (j11 != j12) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC44417c.onError(this.error.terminate());
                        return;
                    }
                    int i14 = this.otherState;
                    if (i14 == i13) {
                        T t11 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        interfaceC44417c.onNext(t11);
                        j11++;
                    } else {
                        boolean z11 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue = this.queue;
                        C0006b c0006bPoll = simplePlainQueue != null ? simplePlainQueue.poll() : null;
                        boolean z12 = c0006bPoll == null;
                        if (z11 && z12 && i14 == 2) {
                            this.queue = null;
                            interfaceC44417c.onComplete();
                            return;
                        } else {
                            if (z12) {
                                break;
                            }
                            interfaceC44417c.onNext(c0006bPoll);
                            j11++;
                            i11++;
                            if (i11 == i12) {
                                this.mainSubscription.get().request(i12);
                                i11 = 0;
                            }
                            i13 = 1;
                        }
                    }
                }
                if (j11 == j12) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        interfaceC44417c.onError(this.error.terminate());
                        return;
                    }
                    boolean z13 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                    boolean z14 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                    if (z13 && z14 && this.otherState == 2) {
                        this.queue = null;
                        interfaceC44417c.onComplete();
                        return;
                    }
                }
                this.emitted = j11;
                this.consumed = i11;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i13 = 1;
                }
            }
        }

        public SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                return simplePlainQueue;
            }
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(Flowable.bufferSize());
            this.queue = spscArrayQueue;
            return spscArrayQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this.mainSubscription, interfaceC44418d, this.prefetch);
        }

        public void otherError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            BackpressureHelper.add(this.requested, j11);
            drain();
        }

        public MergeWithObserver(InterfaceC44417c<? super T> interfaceC44417c) {
            this.downstream = interfaceC44417c;
            int iBufferSize = Flowable.bufferSize();
            this.prefetch = iBufferSize;
            this.limit = iBufferSize - (iBufferSize >> 2);
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(interfaceC44417c);
        interfaceC44417c.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }

    public FlowableMergeWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.other = singleSource;
    }
}
