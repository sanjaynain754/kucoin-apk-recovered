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
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
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

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

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

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<? super T> interfaceC44417c, boolean z13) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (z13) {
                if (!z12) {
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
            if (!z12) {
                return false;
            }
            interfaceC44417c.onComplete();
            return true;
        }

        public void drain() {
            long j11;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z11 = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j12 = this.time;
            int iAddAndGet = 1;
            do {
                long j13 = this.requested.get();
                long j14 = 0;
                while (true) {
                    if (j14 == j13) {
                        j11 = 0;
                        break;
                    }
                    boolean z12 = this.done;
                    Long l11 = (Long) spscLinkedArrayQueue.peek();
                    boolean z13 = l11 == null;
                    boolean z14 = (z13 || l11.longValue() <= scheduler.now(timeUnit) - j12) ? z13 : true;
                    j11 = 0;
                    if (checkTerminated(z12, z14, interfaceC44417c, z11)) {
                        return;
                    }
                    if (z14) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    interfaceC44417c.onNext(spscLinkedArrayQueue.poll());
                    j14++;
                }
                if (j14 != j11) {
                    BackpressureHelper.produced(this.requested, j14);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t11);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public SkipLastTimedSubscriber(InterfaceC44417c<? super T> interfaceC44417c, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11, boolean z11) {
            this.downstream = interfaceC44417c;
            this.time = j11;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i11);
            this.delayError = z11;
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
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(interfaceC44417c, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j11, TimeUnit timeUnit, Scheduler scheduler, int i11, boolean z11) {
        super(flowable);
        this.time = j11;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i11;
        this.delayError = z11;
    }
}
