package io.reactivex.internal.operators.flowable;

import androidx.camera.view.C1454t;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0006b;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long index;
        final SwitchMapSubscriber<T, R> parent;
        volatile SimpleQueue<R> queue;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                this.done = true;
                switchMapSubscriber.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index != switchMapSubscriber.unique || !switchMapSubscriber.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!switchMapSubscriber.delayErrors) {
                switchMapSubscriber.upstream.cancel();
            }
            this.done = true;
            switchMapSubscriber.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(R r11) {
            SwitchMapSubscriber<T, R> switchMapSubscriber = this.parent;
            if (this.index == switchMapSubscriber.unique) {
                if (this.fusionMode != 0 || this.queue.offer(r11)) {
                    switchMapSubscriber.drain();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        public SwitchMapInnerSubscriber(SwitchMapSubscriber<T, R> switchMapSubscriber, long j11, int i11) {
            this.parent = switchMapSubscriber;
            this.index = j11;
            this.bufferSize = i11;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = queueSubscription;
                        interfaceC44418d.request(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                interfaceC44418d.request(this.bufferSize);
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        static final SwitchMapInnerSubscriber<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
        volatile long unique;
        InterfaceC44418d upstream;
        final AtomicReference<SwitchMapInnerSubscriber<T, R>> active = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicThrowable error = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber = new SwitchMapInnerSubscriber<>(null, -1L, 1);
            CANCELLED = switchMapInnerSubscriber;
            switchMapInnerSubscriber.cancel();
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            disposeInner();
        }

        public void disposeInner() {
            SwitchMapInnerSubscriber<T, R> andSet;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
            SwitchMapInnerSubscriber<Object, Object> switchMapInnerSubscriber2 = CANCELLED;
            if (switchMapInnerSubscriber == switchMapInnerSubscriber2 || (andSet = this.active.getAndSet((SwitchMapInnerSubscriber<T, R>) switchMapInnerSubscriber2)) == switchMapInnerSubscriber2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        public void drain() {
            boolean z11;
            C0006b c0006bPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.done) {
                    if (this.delayErrors) {
                        if (this.active.get() == null) {
                            if (this.error.get() != null) {
                                interfaceC44417c.onError(this.error.terminate());
                                return;
                            } else {
                                interfaceC44417c.onComplete();
                                return;
                            }
                        }
                    } else if (this.error.get() != null) {
                        disposeInner();
                        interfaceC44417c.onError(this.error.terminate());
                        return;
                    } else if (this.active.get() == null) {
                        interfaceC44417c.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber = this.active.get();
                SimpleQueue<R> simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.queue : null;
                if (simpleQueue != null) {
                    if (switchMapInnerSubscriber.done) {
                        if (this.delayErrors) {
                            if (simpleQueue.isEmpty()) {
                                C1454t.m2255a(this.active, switchMapInnerSubscriber, null);
                            }
                        } else if (this.error.get() != null) {
                            disposeInner();
                            interfaceC44417c.onError(this.error.terminate());
                            return;
                        } else if (simpleQueue.isEmpty()) {
                            C1454t.m2255a(this.active, switchMapInnerSubscriber, null);
                        }
                    }
                    long j11 = this.requested.get();
                    long j12 = 0;
                    while (true) {
                        z11 = false;
                        if (j12 != j11) {
                            if (!this.cancelled) {
                                boolean z12 = switchMapInnerSubscriber.done;
                                try {
                                    c0006bPoll = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    switchMapInnerSubscriber.cancel();
                                    this.error.addThrowable(th2);
                                    c0006bPoll = null;
                                    z12 = true;
                                }
                                boolean z13 = c0006bPoll == null;
                                if (switchMapInnerSubscriber == this.active.get()) {
                                    if (z12) {
                                        if (this.delayErrors) {
                                            if (z13) {
                                                C1454t.m2255a(this.active, switchMapInnerSubscriber, null);
                                            }
                                        } else if (this.error.get() != null) {
                                            interfaceC44417c.onError(this.error.terminate());
                                            return;
                                        } else if (z13) {
                                            C1454t.m2255a(this.active, switchMapInnerSubscriber, null);
                                        }
                                    }
                                    if (z13) {
                                        break;
                                    }
                                    interfaceC44417c.onNext(c0006bPoll);
                                    j12++;
                                }
                                z11 = true;
                                break;
                            }
                            return;
                        }
                        break;
                    }
                    if (j12 != 0 && !this.cancelled) {
                        if (j11 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j12);
                        }
                        switchMapInnerSubscriber.get().request(j12);
                    }
                    if (z11) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.active.lazySet(null);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done || !this.error.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.delayErrors) {
                disposeInner();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber;
            if (this.done) {
                return;
            }
            long j11 = this.unique + 1;
            this.unique = j11;
            SwitchMapInnerSubscriber<T, R> switchMapInnerSubscriber2 = this.active.get();
            if (switchMapInnerSubscriber2 != null) {
                switchMapInnerSubscriber2.cancel();
            }
            try {
                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The publisher returned is null");
                SwitchMapInnerSubscriber switchMapInnerSubscriber3 = new SwitchMapInnerSubscriber(this, j11, this.bufferSize);
                do {
                    switchMapInnerSubscriber = this.active.get();
                    if (switchMapInnerSubscriber == CANCELLED) {
                        return;
                    }
                } while (!C1454t.m2255a(this.active, switchMapInnerSubscriber, switchMapInnerSubscriber3));
                interfaceC44416b.subscribe(switchMapInnerSubscriber3);
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
            }
        }

        public SwitchMapSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, boolean z11) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
            this.bufferSize = i11;
            this.delayErrors = z11;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
                if (this.unique == 0) {
                    this.upstream.request(Long.MAX_VALUE);
                } else {
                    drain();
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC44417c, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) new SwitchMapSubscriber(interfaceC44417c, this.mapper, this.bufferSize, this.delayErrors));
    }

    public FlowableSwitchMap(Flowable<T> flowable, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, boolean z11) {
        super(flowable);
        this.mapper = function;
        this.bufferSize = i11;
        this.delayErrors = z11;
    }
}
