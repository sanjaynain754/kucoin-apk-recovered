package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0006b;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    final Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> leftEnd;
    final InterfaceC44416b<? extends TRight> other;
    final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
    final Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> rightEnd;

    public static final class JoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC44418d, FlowableGroupJoin.JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final InterfaceC44417c<? super R> downstream;
        final Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> leftEnd;
        int leftIndex;
        final BiFunction<? super TLeft, ? super TRight, ? extends R> resultSelector;
        final Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable disposables = new CompositeDisposable();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final Map<Integer, TLeft> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerClose(boolean z11, FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber) {
            synchronized (this) {
                try {
                    this.queue.offer(z11 ? LEFT_CLOSE : RIGHT_CLOSE, leftRightEndSubscriber);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerValue(boolean z11, Object obj) {
            synchronized (this) {
                try {
                    this.queue.offer(z11 ? LEFT_VALUE : RIGHT_VALUE, obj);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            drain();
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void cancelAll() {
            this.disposables.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
            boolean z11 = true;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    spscLinkedArrayQueue.clear();
                    cancelAll();
                    errorAll(interfaceC44417c);
                    return;
                }
                boolean z12 = this.active.get() == 0 ? z11 : false;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z13 = num == null ? z11 : false;
                if (z12 && z13) {
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    interfaceC44417c.onComplete();
                    return;
                }
                if (z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == LEFT_VALUE) {
                        int i11 = this.leftIndex;
                        this.leftIndex = i11 + 1;
                        this.lefts.put(Integer.valueOf(i11), (TLeft) objPoll);
                        try {
                            InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.leftEnd.apply(objPoll), "The leftEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber = new FlowableGroupJoin.LeftRightEndSubscriber(this, z11, i11);
                            this.disposables.add(leftRightEndSubscriber);
                            interfaceC44416b.subscribe(leftRightEndSubscriber);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(interfaceC44417c);
                                return;
                            }
                            long j11 = this.requested.get();
                            Iterator<TRight> it = this.rights.values().iterator();
                            long j12 = 0;
                            while (it.hasNext()) {
                                try {
                                    C0006b c0006b = (Object) ObjectHelper.requireNonNull(this.resultSelector.apply(objPoll, it.next()), "The resultSelector returned a null value");
                                    if (j12 == j11) {
                                        ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        cancelAll();
                                        errorAll(interfaceC44417c);
                                        return;
                                    }
                                    interfaceC44417c.onNext(c0006b);
                                    j12++;
                                } catch (Throwable th2) {
                                    fail(th2, interfaceC44417c, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j12 != 0) {
                                BackpressureHelper.produced(this.requested, j12);
                            }
                        } catch (Throwable th3) {
                            fail(th3, interfaceC44417c, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i12 = this.rightIndex;
                        this.rightIndex = i12 + 1;
                        this.rights.put(Integer.valueOf(i12), (TRight) objPoll);
                        try {
                            InterfaceC44416b interfaceC44416b2 = (InterfaceC44416b) ObjectHelper.requireNonNull(this.rightEnd.apply(objPoll), "The rightEnd returned a null Publisher");
                            FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber2 = new FlowableGroupJoin.LeftRightEndSubscriber(this, false, i12);
                            this.disposables.add(leftRightEndSubscriber2);
                            interfaceC44416b2.subscribe(leftRightEndSubscriber2);
                            if (this.error.get() != null) {
                                spscLinkedArrayQueue.clear();
                                cancelAll();
                                errorAll(interfaceC44417c);
                                return;
                            }
                            long j13 = this.requested.get();
                            Iterator<TLeft> it2 = this.lefts.values().iterator();
                            long j14 = 0;
                            while (it2.hasNext()) {
                                try {
                                    C0006b c0006b2 = (Object) ObjectHelper.requireNonNull(this.resultSelector.apply(it2.next(), objPoll), "The resultSelector returned a null value");
                                    if (j14 == j13) {
                                        ExceptionHelper.addThrowable(this.error, new MissingBackpressureException("Could not emit value due to lack of requests"));
                                        spscLinkedArrayQueue.clear();
                                        cancelAll();
                                        errorAll(interfaceC44417c);
                                        return;
                                    }
                                    interfaceC44417c.onNext(c0006b2);
                                    j14++;
                                } catch (Throwable th4) {
                                    fail(th4, interfaceC44417c, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                            if (j14 != 0) {
                                BackpressureHelper.produced(this.requested, j14);
                            }
                        } catch (Throwable th5) {
                            fail(th5, interfaceC44417c, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber3 = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                        this.disposables.remove(leftRightEndSubscriber3);
                    } else if (num == RIGHT_CLOSE) {
                        FlowableGroupJoin.LeftRightEndSubscriber leftRightEndSubscriber4 = (FlowableGroupJoin.LeftRightEndSubscriber) objPoll;
                        this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                        this.disposables.remove(leftRightEndSubscriber4);
                    }
                    z11 = true;
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public void errorAll(InterfaceC44417c<?> interfaceC44417c) {
            Throwable thTerminate = ExceptionHelper.terminate(this.error);
            this.lefts.clear();
            this.rights.clear();
            interfaceC44417c.onError(thTerminate);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerCloseError(Throwable th2) {
            if (ExceptionHelper.addThrowable(this.error, th2)) {
                drain();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerComplete(FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber) {
            this.disposables.delete(leftRightSubscriber);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerError(Throwable th2) {
            if (!ExceptionHelper.addThrowable(this.error, th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.active.decrementAndGet();
                drain();
            }
        }

        public JoinSubscription(InterfaceC44417c<? super R> interfaceC44417c, Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> function, Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
            this.downstream = interfaceC44417c;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        public void fail(Throwable th2, InterfaceC44417c<?> interfaceC44417c, SimpleQueue<?> simpleQueue) {
            Exceptions.throwIfFatal(th2);
            ExceptionHelper.addThrowable(this.error, th2);
            simpleQueue.clear();
            cancelAll();
            errorAll(interfaceC44417c);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                BackpressureHelper.add(this.requested, j11);
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        JoinSubscription joinSubscription = new JoinSubscription(interfaceC44417c, this.leftEnd, this.rightEnd, this.resultSelector);
        interfaceC44417c.onSubscribe(joinSubscription);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, true);
        joinSubscription.disposables.add(leftRightSubscriber);
        FlowableGroupJoin.LeftRightSubscriber leftRightSubscriber2 = new FlowableGroupJoin.LeftRightSubscriber(joinSubscription, false);
        joinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }

    public FlowableJoin(Flowable<TLeft> flowable, InterfaceC44416b<? extends TRight> interfaceC44416b, Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> function, Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> function2, BiFunction<? super TLeft, ? super TRight, ? extends R> biFunction) {
        super(flowable);
        this.other = interfaceC44416b;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }
}
