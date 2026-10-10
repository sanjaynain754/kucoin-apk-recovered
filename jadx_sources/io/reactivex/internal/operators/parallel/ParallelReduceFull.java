package io.reactivex.internal.operators.parallel;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {
    final BiFunction<T, T, T> reducer;
    final ParallelFlowable<? extends T> source;

    public static final class ParallelReduceFullInnerSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        boolean done;
        final ParallelReduceFullMainSubscriber<T> parent;
        final BiFunction<T, T, T> reducer;
        T value;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete(this.value);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.parent.innerError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            T t12 = this.value;
            if (t12 == null) {
                this.value = t11;
                return;
            }
            try {
                this.value = (T) ObjectHelper.requireNonNull(this.reducer.apply(t12, t11), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                get().cancel();
                onError(th2);
            }
        }

        public ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parallelReduceFullMainSubscriber, BiFunction<T, T, T> biFunction) {
            this.parent = parallelReduceFullMainSubscriber;
            this.reducer = biFunction;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    public static final class ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        final AtomicReference<SlotPair<T>> current;
        final AtomicReference<Throwable> error;
        final BiFunction<T, T, T> reducer;
        final AtomicInteger remaining;
        final ParallelReduceFullInnerSubscriber<T>[] subscribers;

        public SlotPair<T> addValue(T t11) {
            SlotPair<T> slotPair;
            int iTryAcquireSlot;
            while (true) {
                slotPair = this.current.get();
                if (slotPair == null) {
                    slotPair = new SlotPair<>();
                    if (!C1454t.m2255a(this.current, null, slotPair)) {
                        continue;
                    }
                }
                iTryAcquireSlot = slotPair.tryAcquireSlot();
                if (iTryAcquireSlot >= 0) {
                    break;
                }
                C1454t.m2255a(this.current, slotPair, null);
            }
            if (iTryAcquireSlot == 0) {
                slotPair.first = t11;
            } else {
                slotPair.second = t11;
            }
            if (!slotPair.releaseSlot()) {
                return null;
            }
            C1454t.m2255a(this.current, slotPair, null);
            return slotPair;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            for (ParallelReduceFullInnerSubscriber<T> parallelReduceFullInnerSubscriber : this.subscribers) {
                parallelReduceFullInnerSubscriber.cancel();
            }
        }

        public void innerComplete(T t11) {
            if (t11 != null) {
                while (true) {
                    SlotPair<T> slotPairAddValue = addValue(t11);
                    if (slotPairAddValue == null) {
                        break;
                    }
                    try {
                        t11 = (T) ObjectHelper.requireNonNull(this.reducer.apply(slotPairAddValue.first, slotPairAddValue.second), "The reducer returned a null value");
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        innerError(th2);
                        return;
                    }
                }
            }
            if (this.remaining.decrementAndGet() == 0) {
                SlotPair<T> slotPair = this.current.get();
                this.current.lazySet(null);
                if (slotPair != null) {
                    complete(slotPair.first);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public void innerError(Throwable th2) {
            if (C1454t.m2255a(this.error, null, th2)) {
                cancel();
                this.downstream.onError(th2);
            } else if (th2 != this.error.get()) {
                RxJavaPlugins.onError(th2);
            }
        }

        public ParallelReduceFullMainSubscriber(InterfaceC44417c<? super T> interfaceC44417c, int i11, BiFunction<T, T, T> biFunction) {
            super(interfaceC44417c);
            this.current = new AtomicReference<>();
            this.remaining = new AtomicInteger();
            this.error = new AtomicReference<>();
            ParallelReduceFullInnerSubscriber<T>[] parallelReduceFullInnerSubscriberArr = new ParallelReduceFullInnerSubscriber[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                parallelReduceFullInnerSubscriberArr[i12] = new ParallelReduceFullInnerSubscriber<>(this, biFunction);
            }
            this.subscribers = parallelReduceFullInnerSubscriberArr;
            this.reducer = biFunction;
            this.remaining.lazySet(i11);
        }
    }

    public static final class SlotPair<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        T first;
        final AtomicInteger releaseIndex = new AtomicInteger();
        T second;

        public boolean releaseSlot() {
            return this.releaseIndex.incrementAndGet() == 2;
        }

        public int tryAcquireSlot() {
            int i11;
            do {
                i11 = get();
                if (i11 >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i11, i11 + 1));
            return i11;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        ParallelReduceFullMainSubscriber parallelReduceFullMainSubscriber = new ParallelReduceFullMainSubscriber(interfaceC44417c, this.source.parallelism(), this.reducer);
        interfaceC44417c.onSubscribe(parallelReduceFullMainSubscriber);
        this.source.subscribe(parallelReduceFullMainSubscriber.subscribers);
    }

    public ParallelReduceFull(ParallelFlowable<? extends T> parallelFlowable, BiFunction<T, T, T> biFunction) {
        this.source = parallelFlowable;
        this.reducer = biFunction;
    }
}
