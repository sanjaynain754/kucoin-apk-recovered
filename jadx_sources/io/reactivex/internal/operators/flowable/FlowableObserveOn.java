package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean delayError;
    final int prefetch;
    final Scheduler scheduler;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        SimpleQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        int sourceMode;
        InterfaceC44418d upstream;
        final Scheduler.Worker worker;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public abstract void runAsync();

        public abstract void runBackfused();

        public abstract void runSync();

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public final boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<?> interfaceC44417c) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (this.delayError) {
                if (!z12) {
                    return false;
                }
                this.cancelled = true;
                Throwable th2 = this.error;
                if (th2 != null) {
                    interfaceC44417c.onError(th2);
                } else {
                    interfaceC44417c.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                this.cancelled = true;
                clear();
                interfaceC44417c.onError(th3);
                this.worker.dispose();
                return true;
            }
            if (!z12) {
                return false;
            }
            this.cancelled = true;
            interfaceC44417c.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            trySchedule();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            trySchedule();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                trySchedule();
                return;
            }
            if (!this.queue.offer(t11)) {
                this.upstream.cancel();
                this.error = new MissingBackpressureException("Queue is full?!");
                this.done = true;
            }
            trySchedule();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                runBackfused();
            } else if (this.sourceMode == 1) {
                runSync();
            } else {
                runAsync();
            }
        }

        public BaseObserveOnSubscriber(Scheduler.Worker worker, boolean z11, int i11) {
            this.worker = worker;
            this.delayError = z11;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public final void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                trySchedule();
            }
        }

        public final void trySchedule() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.schedule(this);
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        long consumed;
        final ConditionalSubscriber<? super T> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z11 = this.done;
                this.downstream.onNext(null);
                if (z11) {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        this.downstream.onError(th2);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
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
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
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
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j11 = this.consumed + 1;
                if (j11 == this.limit) {
                    this.consumed = 0L;
                    this.upstream.request(j11);
                    return tPoll;
                }
                this.consumed = j11;
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j11 = this.produced;
            long j12 = this.consumed;
            int iAddAndGet = 1;
            while (true) {
                long j13 = this.requested.get();
                while (j11 != j13) {
                    boolean z11 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z12 = tPoll == null;
                        if (checkTerminated(z11, z12, conditionalSubscriber)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j11++;
                        }
                        j12++;
                        if (j12 == this.limit) {
                            this.upstream.request(j12);
                            j12 = 0;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j11 == j13 && checkTerminated(this.done, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                int i11 = get();
                if (iAddAndGet == i11) {
                    this.produced = j11;
                    this.consumed = j12;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i11;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j11 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.requested.get();
                while (j11 != j12) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            this.cancelled = true;
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        } else if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j11++;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.cancelled = true;
                        this.upstream.cancel();
                        conditionalSubscriber.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.cancelled = true;
                    conditionalSubscriber.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    int i11 = get();
                    if (iAddAndGet == i11) {
                        this.produced = j11;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i11;
                    }
                }
            }
        }

        public ObserveOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Scheduler.Worker worker, boolean z11, int i11) {
            super(worker, z11, i11);
            this.downstream = conditionalSubscriber;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final InterfaceC44417c<? super T> downstream;

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runBackfused() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z11 = this.done;
                this.downstream.onNext(null);
                if (z11) {
                    this.cancelled = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        this.downstream.onError(th2);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
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
                        this.sourceMode = 1;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = 2;
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
        public T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j11 = this.produced + 1;
                if (j11 == this.limit) {
                    this.produced = 0L;
                    this.upstream.request(j11);
                    return tPoll;
                }
                this.produced = j11;
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runAsync() {
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j11 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.requested.get();
                while (j11 != jAddAndGet) {
                    boolean z11 = this.done;
                    try {
                        T tPoll = simpleQueue.poll();
                        boolean z12 = tPoll == null;
                        if (checkTerminated(z11, z12, interfaceC44417c)) {
                            return;
                        }
                        if (z12) {
                            break;
                        }
                        interfaceC44417c.onNext(tPoll);
                        j11++;
                        if (j11 == this.limit) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.requested.addAndGet(-j11);
                            }
                            this.upstream.request(j11);
                            j11 = 0;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.cancelled = true;
                        this.upstream.cancel();
                        simpleQueue.clear();
                        interfaceC44417c.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j11 == jAddAndGet && checkTerminated(this.done, simpleQueue.isEmpty(), interfaceC44417c)) {
                    return;
                }
                int i11 = get();
                if (iAddAndGet == i11) {
                    this.produced = j11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i11;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public void runSync() {
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            SimpleQueue<T> simpleQueue = this.queue;
            long j11 = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j12 = this.requested.get();
                while (j11 != j12) {
                    try {
                        T tPoll = simpleQueue.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            this.cancelled = true;
                            interfaceC44417c.onComplete();
                            this.worker.dispose();
                            return;
                        }
                        interfaceC44417c.onNext(tPoll);
                        j11++;
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.cancelled = true;
                        this.upstream.cancel();
                        interfaceC44417c.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.cancelled = true;
                    interfaceC44417c.onComplete();
                    this.worker.dispose();
                    return;
                } else {
                    int i11 = get();
                    if (iAddAndGet == i11) {
                        this.produced = j11;
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        iAddAndGet = i11;
                    }
                }
            }
        }

        public ObserveOnSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Scheduler.Worker worker, boolean z11, int i11) {
            super(worker, z11, i11);
            this.downstream = interfaceC44417c;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        Scheduler.Worker workerCreateWorker = this.scheduler.createWorker();
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new ObserveOnConditionalSubscriber((ConditionalSubscriber) interfaceC44417c, workerCreateWorker, this.delayError, this.prefetch));
        } else {
            this.source.subscribe((FlowableSubscriber) new ObserveOnSubscriber(interfaceC44417c, workerCreateWorker, this.delayError, this.prefetch));
        }
    }

    public FlowableObserveOn(Flowable<T> flowable, Scheduler scheduler, boolean z11, int i11) {
        super(flowable);
        this.scheduler = scheduler;
        this.delayError = z11;
        this.prefetch = i11;
    }
}
