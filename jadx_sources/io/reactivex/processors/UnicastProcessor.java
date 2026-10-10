package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<InterfaceC44417c<? super T>> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicLong requested;
    final BasicIntQueueSubscription<T> wip;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.enableOperatorFusion || unicastProcessor.wip.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.queue.clear();
            UnicastProcessor.this.downstream.lazySet(null);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j11);
                UnicastProcessor.this.drain();
            }
        }
    }

    public UnicastProcessor(int i11) {
        this(i11, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    public UnicastProcessor(int i11, Runnable runnable) {
        this(i11, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i11) {
        return new UnicastProcessor<>(i11);
    }

    public boolean checkTerminated(boolean z11, boolean z12, boolean z13, InterfaceC44417c<? super T> interfaceC44417c, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (!z12) {
            return false;
        }
        if (z11 && this.error != null) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            interfaceC44417c.onError(this.error);
            return true;
        }
        if (!z13) {
            return false;
        }
        Throwable th2 = this.error;
        this.downstream.lazySet(null);
        if (th2 != null) {
            interfaceC44417c.onError(th2);
        } else {
            interfaceC44417c.onComplete();
        }
        return true;
    }

    public void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        InterfaceC44417c<? super T> interfaceC44417c = this.downstream.get();
        int iAddAndGet = 1;
        while (interfaceC44417c == null) {
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                interfaceC44417c = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(interfaceC44417c);
        } else {
            drainRegular(interfaceC44417c);
        }
    }

    public void drainFused(InterfaceC44417c<? super T> interfaceC44417c) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z11 = this.delayError;
        int iAddAndGet = 1;
        while (!this.cancelled) {
            boolean z12 = this.done;
            if (!z11 && z12 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                interfaceC44417c.onError(this.error);
                return;
            }
            interfaceC44417c.onNext(null);
            if (z12) {
                this.downstream.lazySet(null);
                Throwable th2 = this.error;
                if (th2 != null) {
                    interfaceC44417c.onError(th2);
                    return;
                } else {
                    interfaceC44417c.onComplete();
                    return;
                }
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        spscLinkedArrayQueue.clear();
        this.downstream.lazySet(null);
    }

    public void drainRegular(InterfaceC44417c<? super T> interfaceC44417c) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z11 = !this.delayError;
        int iAddAndGet = 1;
        do {
            long j11 = this.requested.get();
            long j12 = 0;
            while (j11 != j12) {
                boolean z12 = this.done;
                T tPoll = spscLinkedArrayQueue.poll();
                boolean z13 = tPoll == null;
                if (checkTerminated(z11, z12, z13, interfaceC44417c, spscLinkedArrayQueue)) {
                    return;
                }
                if (z13) {
                    break;
                }
                interfaceC44417c.onNext(tPoll);
                j12++;
            }
            if (j11 == j12 && checkTerminated(z11, this.done, spscLinkedArrayQueue.isEmpty(), interfaceC44417c, spscLinkedArrayQueue)) {
                return;
            }
            if (j12 != 0 && j11 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j12);
            }
            iAddAndGet = this.wip.addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.error = th2;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, sh0.InterfaceC44417c
    public void onNext(T t11) {
        ObjectHelper.requireNonNull(t11, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t11);
        drain();
    }

    @Override // sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (this.done || this.cancelled) {
            interfaceC44418d.cancel();
        } else {
            interfaceC44418d.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), interfaceC44417c);
            return;
        }
        interfaceC44417c.onSubscribe(this.wip);
        this.downstream.set(interfaceC44417c);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    public UnicastProcessor(int i11, Runnable runnable, boolean z11) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i11, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z11;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z11) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z11);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i11, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i11, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i11, Runnable runnable, boolean z11) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i11, runnable, z11);
    }
}
