package io.reactivex.internal.operators.flowable;

import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Action;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends AbstractFlowableWithUpstream<T, T> {
    final long bufferSize;
    final Action onOverflow;
    final BackpressureOverflowStrategy strategy;

    public static final class OnBackpressureBufferStrategySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 3240706908776709697L;
        final long bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final InterfaceC44417c<? super T> downstream;
        Throwable error;
        final Action onOverflow;
        final BackpressureOverflowStrategy strategy;
        InterfaceC44418d upstream;
        final AtomicLong requested = new AtomicLong();
        final Deque<T> deque = new ArrayDeque();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                clear(this.deque);
            }
        }

        public void clear(Deque<T> deque) {
            synchronized (deque) {
                deque.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            boolean z11;
            boolean z12;
            if (this.done) {
                return;
            }
            Deque<T> deque = this.deque;
            synchronized (deque) {
                try {
                    z11 = false;
                    if (deque.size() == this.bufferSize) {
                        int i11 = C392271.$SwitchMap$io$reactivex$BackpressureOverflowStrategy[this.strategy.ordinal()];
                        z12 = true;
                        if (i11 == 1) {
                            deque.pollLast();
                            deque.offer(t11);
                        } else if (i11 == 2) {
                            deque.poll();
                            deque.offer(t11);
                        }
                        z12 = false;
                        z11 = true;
                    } else {
                        deque.offer(t11);
                        z12 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z11) {
                if (!z12) {
                    drain();
                    return;
                } else {
                    this.upstream.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            Action action = this.onOverflow;
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.upstream.cancel();
                    onError(th3);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public OnBackpressureBufferStrategySubscriber(InterfaceC44417c<? super T> interfaceC44417c, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j11) {
            this.downstream = interfaceC44417c;
            this.onOverflow = action;
            this.strategy = backpressureOverflowStrategy;
            this.bufferSize = j11;
        }

        public void drain() {
            boolean zIsEmpty;
            T tPoll;
            boolean z11;
            if (getAndIncrement() == 0) {
                Deque<T> deque = this.deque;
                InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
                int iAddAndGet = 1;
                do {
                    long j11 = this.requested.get();
                    long j12 = 0;
                    while (j12 != j11) {
                        if (this.cancelled) {
                            clear(deque);
                            return;
                        }
                        boolean z12 = this.done;
                        synchronized (deque) {
                            tPoll = deque.poll();
                        }
                        if (tPoll == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z12) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                clear(deque);
                                interfaceC44417c.onError(th2);
                                return;
                            } else if (z11) {
                                interfaceC44417c.onComplete();
                                return;
                            }
                        }
                        if (z11) {
                            break;
                        }
                        interfaceC44417c.onNext(tPoll);
                        j12++;
                    }
                    if (j12 == j11) {
                        if (this.cancelled) {
                            clear(deque);
                            return;
                        }
                        boolean z13 = this.done;
                        synchronized (deque) {
                            zIsEmpty = deque.isEmpty();
                        }
                        if (z13) {
                            Throwable th3 = this.error;
                            if (th3 != null) {
                                clear(deque);
                                interfaceC44417c.onError(th3);
                                return;
                            } else if (zIsEmpty) {
                                interfaceC44417c.onComplete();
                                return;
                            }
                        }
                    }
                    if (j12 != 0) {
                        BackpressureHelper.produced(this.requested, j12);
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

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy$1 */
    public static /* synthetic */ class C392271 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$BackpressureOverflowStrategy;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            $SwitchMap$io$reactivex$BackpressureOverflowStrategy = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$BackpressureOverflowStrategy[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new OnBackpressureBufferStrategySubscriber(interfaceC44417c, this.onOverflow, this.strategy, this.bufferSize));
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j11, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.bufferSize = j11;
        this.onOverflow = action;
        this.strategy = backpressureOverflowStrategy;
    }
}
