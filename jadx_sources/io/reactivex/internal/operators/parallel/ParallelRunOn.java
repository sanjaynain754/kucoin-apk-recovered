package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    final int prefetch;
    final Scheduler scheduler;
    final ParallelFlowable<? extends T> source;

    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        Throwable error;
        final int limit;
        final int prefetch;
        final SpscArrayQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC44418d upstream;
        final Scheduler.Worker worker;

        @Override // sh0.InterfaceC44418d
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

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.queue.offer(t11)) {
                schedule();
            } else {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        public BaseRunOnSubscriber(int i11, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i11;
            this.queue = spscArrayQueue;
            this.limit = i11 - (i11 >> 2);
            this.worker = worker;
        }

        @Override // sh0.InterfaceC44418d
        public final void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                schedule();
            }
        }

        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    public final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        final InterfaceC44417c<T>[] parents;
        final InterfaceC44417c<? super T>[] subscribers;

        public MultiWorkerCallback(InterfaceC44417c<? super T>[] interfaceC44417cArr, InterfaceC44417c<T>[] interfaceC44417cArr2) {
            this.subscribers = interfaceC44417cArr;
            this.parents = interfaceC44417cArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i11, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i11, this.subscribers, this.parents, worker);
        }
    }

    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final ConditionalSubscriber<? super T> downstream;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            int i11 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            int i12 = this.limit;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    if (z11 && (th2 = this.error) != null) {
                        spscArrayQueue.clear();
                        conditionalSubscriber.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z12 = tPoll == null;
                    if (z11 && z12) {
                        conditionalSubscriber.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z12) {
                            break;
                        }
                        if (conditionalSubscriber.tryOnNext(tPoll)) {
                            j12++;
                        }
                        i11++;
                        if (i11 == i12) {
                            this.upstream.request(i11);
                            i11 = 0;
                        }
                    }
                }
                if (j12 == j11) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            spscArrayQueue.clear();
                            conditionalSubscriber.onError(th3);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            conditionalSubscriber.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j12);
                }
                int i13 = get();
                if (i13 == iAddAndGet) {
                    this.consumed = i11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i13;
                }
            }
        }

        public RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i11, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i11, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }
    }

    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        final InterfaceC44417c<? super T> downstream;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(this.prefetch);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2;
            int i11 = this.consumed;
            SpscArrayQueue<T> spscArrayQueue = this.queue;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            int i12 = this.limit;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.requested.get();
                long j12 = 0;
                while (j12 != j11) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z11 = this.done;
                    if (z11 && (th2 = this.error) != null) {
                        spscArrayQueue.clear();
                        interfaceC44417c.onError(th2);
                        this.worker.dispose();
                        return;
                    }
                    T tPoll = spscArrayQueue.poll();
                    boolean z12 = tPoll == null;
                    if (z11 && z12) {
                        interfaceC44417c.onComplete();
                        this.worker.dispose();
                        return;
                    } else {
                        if (z12) {
                            break;
                        }
                        interfaceC44417c.onNext(tPoll);
                        j12++;
                        i11++;
                        if (i11 == i12) {
                            this.upstream.request(i11);
                            i11 = 0;
                        }
                    }
                }
                if (j12 == j11) {
                    if (this.cancelled) {
                        spscArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        Throwable th3 = this.error;
                        if (th3 != null) {
                            spscArrayQueue.clear();
                            interfaceC44417c.onError(th3);
                            this.worker.dispose();
                            return;
                        } else if (spscArrayQueue.isEmpty()) {
                            interfaceC44417c.onComplete();
                            this.worker.dispose();
                            return;
                        }
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j12);
                }
                int i13 = get();
                if (i13 == iAddAndGet) {
                    this.consumed = i11;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i13;
                }
            }
        }

        public RunOnSubscriber(InterfaceC44417c<? super T> interfaceC44417c, int i11, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i11, spscArrayQueue, worker);
            this.downstream = interfaceC44417c;
        }
    }

    public void createSubscriber(int i11, InterfaceC44417c<? super T>[] interfaceC44417cArr, InterfaceC44417c<T>[] interfaceC44417cArr2, Scheduler.Worker worker) {
        InterfaceC44417c<? super T> interfaceC44417c = interfaceC44417cArr[i11];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            interfaceC44417cArr2[i11] = new RunOnConditionalSubscriber((ConditionalSubscriber) interfaceC44417c, this.prefetch, spscArrayQueue, worker);
        } else {
            interfaceC44417cArr2[i11] = new RunOnSubscriber(interfaceC44417c, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i11) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i11;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super T>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<T>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        Object obj = this.scheduler;
        if (obj instanceof SchedulerMultiWorkerSupport) {
            ((SchedulerMultiWorkerSupport) obj).createWorkers(length, new MultiWorkerCallback(interfaceC44417cArr, interfaceC44417cArr2));
        } else {
            for (int i11 = 0; i11 < length; i11++) {
                createSubscriber(i11, interfaceC44417cArr, interfaceC44417cArr2, this.scheduler.createWorker());
            }
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
