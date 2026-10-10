package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        volatile boolean done;
        final InterfaceC44417c<? super T> downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean checkTerminated(boolean z11, InterfaceC44417c<? super T> interfaceC44417c, boolean z12) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = this.error;
                if (th2 != null) {
                    interfaceC44417c.onError(th2);
                } else {
                    interfaceC44417c.onComplete();
                }
                return true;
            }
            Throwable th3 = this.error;
            if (th3 != null) {
                this.queue.clear();
                interfaceC44417c.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            interfaceC44417c.onComplete();
            return true;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            trim(this.scheduler.now(this.unit), this.queue);
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.delayError) {
                trim(this.scheduler.now(this.unit), this.queue);
            }
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long jNow = this.scheduler.now(this.unit);
            spscLinkedArrayQueue.offer(Long.valueOf(jNow), t11);
            trim(jNow, spscLinkedArrayQueue);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public void trim(long j11, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            long j12 = this.time;
            long j13 = this.count;
            boolean z11 = j13 == Long.MAX_VALUE;
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() >= j11 - j12 && (z11 || (spscLinkedArrayQueue.size() >> 1) <= j13)) {
                    return;
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        public TakeLastTimedSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, int i11, boolean z11) {
            this.downstream = interfaceC44417c;
            this.count = j11;
            this.time = j12;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.delayError = z11;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                boolean z12 = this.delayError;
                int iAddAndGet = 1;
                do {
                    if (this.done) {
                        if (!checkTerminated(spscLinkedArrayQueue.isEmpty(), interfaceC44417c, z12)) {
                            long j11 = this.requested.get();
                            long j12 = 0;
                            while (true) {
                                if (spscLinkedArrayQueue.peek() == null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!checkTerminated(z11, interfaceC44417c, z12)) {
                                    if (j11 == j12) {
                                        if (j12 == 0) {
                                            break;
                                        }
                                        BackpressureHelper.produced(this.requested, j12);
                                        break;
                                    } else {
                                        spscLinkedArrayQueue.poll();
                                        interfaceC44417c.onNext(spscLinkedArrayQueue.poll());
                                        j12++;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                drain();
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new TakeLastTimedSubscriber(interfaceC44417c, this.count, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }

    public FlowableTakeLastTimed(Flowable<T> flowable, long j11, long j12, TimeUnit timeUnit, Scheduler scheduler, int i11, boolean z11) {
        super(flowable);
        this.count = j11;
        this.time = j12;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i11;
        this.delayError = z11;
    }
}
