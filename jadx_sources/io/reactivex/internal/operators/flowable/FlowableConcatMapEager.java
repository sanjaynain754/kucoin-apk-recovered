package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final int maxConcurrency;
    final int prefetch;

    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d, InnerQueuedSubscriberSupport<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        volatile boolean cancelled;
        volatile InnerQueuedSubscriber<R> current;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        final ErrorMode errorMode;
        final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
        final int maxConcurrency;
        final int prefetch;
        final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> subscribers;
        InterfaceC44418d upstream;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

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
            drainAndCancel();
        }

        public void cancelAll() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            this.current = null;
            if (innerQueuedSubscriber != null) {
                innerQueuedSubscriber.cancel();
            }
            while (true) {
                InnerQueuedSubscriber<R> innerQueuedSubscriberPoll = this.subscribers.poll();
                if (innerQueuedSubscriberPoll == null) {
                    return;
                } else {
                    innerQueuedSubscriberPoll.cancel();
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void drain() {
            InnerQueuedSubscriber<R> innerQueuedSubscriberPoll;
            long j11;
            long j12;
            boolean z11;
            SimpleQueue<R> simpleQueueQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            ErrorMode errorMode = this.errorMode;
            int iAddAndGet = 1;
            while (true) {
                long j13 = this.requested.get();
                if (innerQueuedSubscriber != null) {
                    innerQueuedSubscriberPoll = innerQueuedSubscriber;
                } else {
                    if (errorMode != ErrorMode.END && this.errors.get() != null) {
                        cancelAll();
                        interfaceC44417c.onError(this.errors.terminate());
                        return;
                    }
                    boolean z12 = this.done;
                    innerQueuedSubscriberPoll = this.subscribers.poll();
                    if (z12 && innerQueuedSubscriberPoll == null) {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            interfaceC44417c.onError(thTerminate);
                            return;
                        } else {
                            interfaceC44417c.onComplete();
                            return;
                        }
                    }
                    if (innerQueuedSubscriberPoll != null) {
                        this.current = innerQueuedSubscriberPoll;
                    }
                }
                if (innerQueuedSubscriberPoll == null || (simpleQueueQueue = innerQueuedSubscriberPoll.queue()) == null) {
                    j11 = 0;
                    j12 = 0;
                    z11 = false;
                } else {
                    j12 = 0;
                    while (true) {
                        if (j12 == j13) {
                            j11 = 0;
                        } else {
                            if (this.cancelled) {
                                cancelAll();
                                return;
                            }
                            if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                                this.current = null;
                                innerQueuedSubscriberPoll.cancel();
                                cancelAll();
                                interfaceC44417c.onError(this.errors.terminate());
                                return;
                            }
                            boolean zIsDone = innerQueuedSubscriberPoll.isDone();
                            j11 = 0;
                            try {
                                R rPoll = simpleQueueQueue.poll();
                                boolean z13 = rPoll == null;
                                if (zIsDone && z13) {
                                    this.current = null;
                                    this.upstream.request(1L);
                                    innerQueuedSubscriberPoll = null;
                                    z11 = true;
                                    break;
                                }
                                if (!z13) {
                                    interfaceC44417c.onNext(rPoll);
                                    j12++;
                                    innerQueuedSubscriberPoll.requestOne();
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.current = null;
                                innerQueuedSubscriberPoll.cancel();
                                cancelAll();
                                interfaceC44417c.onError(th2);
                                return;
                            }
                        }
                        z11 = false;
                        break;
                    }
                    if (j12 == j13) {
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        }
                        if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            innerQueuedSubscriberPoll.cancel();
                            cancelAll();
                            interfaceC44417c.onError(this.errors.terminate());
                            return;
                        }
                        boolean zIsDone2 = innerQueuedSubscriberPoll.isDone();
                        boolean zIsEmpty = simpleQueueQueue.isEmpty();
                        if (zIsDone2 && zIsEmpty) {
                            this.current = null;
                            this.upstream.request(1L);
                            innerQueuedSubscriberPoll = null;
                            z11 = true;
                        }
                    }
                }
                if (j12 != j11 && j13 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j12);
                }
                if (!z11 && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                } else {
                    innerQueuedSubscriber = innerQueuedSubscriberPoll;
                }
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            innerQueuedSubscriber.setDone();
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            try {
                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null Publisher");
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.prefetch);
                if (this.cancelled) {
                    return;
                }
                this.subscribers.offer(innerQueuedSubscriber);
                interfaceC44416b.subscribe(innerQueuedSubscriber);
                if (this.cancelled) {
                    innerQueuedSubscriber.cancel();
                    drainAndCancel();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                int i11 = this.maxConcurrency;
                interfaceC44418d.request(i11 == Integer.MAX_VALUE ? Long.MAX_VALUE : i11);
            }
        }

        public ConcatMapEagerDelayErrorSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, int i12, ErrorMode errorMode) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.maxConcurrency = i11;
            this.prefetch = i12;
            this.errorMode = errorMode;
            this.subscribers = new SpscLinkedArrayQueue<>(Math.min(i12, i11));
        }

        public void drainAndCancel() {
            if (getAndIncrement() == 0) {
                do {
                    cancelAll();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r11) {
            if (innerQueuedSubscriber.queue().offer(r11)) {
                drain();
            } else {
                innerQueuedSubscriber.cancel();
                innerError(innerQueuedSubscriber, new MissingBackpressureException());
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
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapEagerDelayErrorSubscriber(interfaceC44417c, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }

    public FlowableConcatMapEager(Flowable<T> flowable, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, int i12, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.maxConcurrency = i11;
        this.prefetch = i12;
        this.errorMode = errorMode;
    }
}
