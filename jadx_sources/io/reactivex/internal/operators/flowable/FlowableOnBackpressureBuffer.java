package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableOnBackpressureBuffer<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Action onOverflow;
    final boolean unbounded;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final InterfaceC44417c<? super T> downstream;
        Throwable error;
        final Action onOverflow;
        boolean outputFused;
        final SimplePlainQueue<T> queue;
        final AtomicLong requested = new AtomicLong();
        InterfaceC44418d upstream;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            if ((i11 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
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

        public boolean checkTerminated(boolean z11, boolean z12, InterfaceC44417c<? super T> interfaceC44417c) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            if (this.delayError) {
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

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.error = th2;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th2);
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.queue.offer(t11)) {
                if (this.outputFused) {
                    this.downstream.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.upstream.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                missingBackpressureException.initCause(th2);
            }
            onError(missingBackpressureException);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            if (this.outputFused || !SubscriptionHelper.validate(j11)) {
                return;
            }
            BackpressureHelper.add(this.requested, j11);
            drain();
        }

        public BackpressureBufferSubscriber(InterfaceC44417c<? super T> interfaceC44417c, int i11, boolean z11, boolean z12, Action action) {
            SimplePlainQueue<T> spscArrayQueue;
            this.downstream = interfaceC44417c;
            this.onOverflow = action;
            this.delayError = z12;
            if (z11) {
                spscArrayQueue = new SpscLinkedArrayQueue<>(i11);
            } else {
                spscArrayQueue = new SpscArrayQueue<>(i11);
            }
            this.queue = spscArrayQueue;
        }

        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                SimplePlainQueue<T> simplePlainQueue = this.queue;
                InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC44417c)) {
                    long j11 = this.requested.get();
                    long j12 = 0;
                    while (j12 != j11) {
                        boolean z12 = this.done;
                        T tPoll = simplePlainQueue.poll();
                        if (tPoll == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!checkTerminated(z12, z11, interfaceC44417c)) {
                            if (z11) {
                                break;
                            }
                            interfaceC44417c.onNext(tPoll);
                            j12++;
                        } else {
                            return;
                        }
                    }
                    if (j12 != j11 || !checkTerminated(this.done, simplePlainQueue.isEmpty(), interfaceC44417c)) {
                        if (j12 != 0 && j11 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j12);
                        }
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new BackpressureBufferSubscriber(interfaceC44417c, this.bufferSize, this.unbounded, this.delayError, this.onOverflow));
    }

    public FlowableOnBackpressureBuffer(Flowable<T> flowable, int i11, boolean z11, boolean z12, Action action) {
        super(flowable);
        this.bufferSize = i11;
        this.unbounded = z11;
        this.delayError = z12;
        this.onOverflow = action;
    }
}
