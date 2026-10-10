package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
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
import io.reactivex.processors.UnicastProcessor;
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
public final class FlowableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractFlowableWithUpstream<TLeft, R> {
    final Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> leftEnd;
    final InterfaceC44416b<? extends TRight> other;
    final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
    final Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> rightEnd;

    public static final class GroupJoinSubscription<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements InterfaceC44418d, JoinSupport {
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final InterfaceC44417c<? super R> downstream;
        final Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> leftEnd;
        int leftIndex;
        final BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> resultSelector;
        final Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> rightEnd;
        int rightIndex;
        static final Integer LEFT_VALUE = 1;
        static final Integer RIGHT_VALUE = 2;
        static final Integer LEFT_CLOSE = 3;
        static final Integer RIGHT_CLOSE = 4;
        final AtomicLong requested = new AtomicLong();
        final CompositeDisposable disposables = new CompositeDisposable();
        final SpscLinkedArrayQueue<Object> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final Map<Integer, UnicastProcessor<TRight>> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        @Override // io.reactivex.internal.operators.flowable.FlowableGroupJoin.JoinSupport
        public void innerClose(boolean z11, LeftRightEndSubscriber leftRightEndSubscriber) {
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

        public void errorAll(InterfaceC44417c<?> interfaceC44417c) {
            Throwable thTerminate = ExceptionHelper.terminate(this.error);
            Iterator<UnicastProcessor<TRight>> it = this.lefts.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
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
        public void innerComplete(LeftRightSubscriber leftRightSubscriber) {
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

        public GroupJoinSubscription(InterfaceC44417c<? super R> interfaceC44417c, Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> function, Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
            this.downstream = interfaceC44417c;
            this.leftEnd = function;
            this.rightEnd = function2;
            this.resultSelector = biFunction;
        }

        public void drain() {
            boolean z11;
            boolean z12;
            if (getAndIncrement() == 0) {
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                InterfaceC44417c<? super R> interfaceC44417c = this.downstream;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    if (this.error.get() != null) {
                        spscLinkedArrayQueue.clear();
                        cancelAll();
                        errorAll(interfaceC44417c);
                        return;
                    }
                    if (this.active.get() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Integer num = (Integer) spscLinkedArrayQueue.poll();
                    if (num == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 && z12) {
                        Iterator<UnicastProcessor<TRight>> it = this.lefts.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        interfaceC44417c.onComplete();
                        return;
                    }
                    if (z12) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        Object objPoll = spscLinkedArrayQueue.poll();
                        if (num == LEFT_VALUE) {
                            UnicastProcessor unicastProcessorCreate = UnicastProcessor.create();
                            int i11 = this.leftIndex;
                            this.leftIndex = i11 + 1;
                            this.lefts.put(Integer.valueOf(i11), (UnicastProcessor<TRight>) unicastProcessorCreate);
                            try {
                                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.leftEnd.apply(objPoll), "The leftEnd returned a null Publisher");
                                LeftRightEndSubscriber leftRightEndSubscriber = new LeftRightEndSubscriber(this, true, i11);
                                this.disposables.add(leftRightEndSubscriber);
                                interfaceC44416b.subscribe(leftRightEndSubscriber);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(interfaceC44417c);
                                    return;
                                }
                                try {
                                    C0006b c0006b = (Object) ObjectHelper.requireNonNull(this.resultSelector.apply(objPoll, unicastProcessorCreate), "The resultSelector returned a null value");
                                    if (this.requested.get() != 0) {
                                        interfaceC44417c.onNext(c0006b);
                                        BackpressureHelper.produced(this.requested, 1L);
                                        Iterator<TRight> it2 = this.rights.values().iterator();
                                        while (it2.hasNext()) {
                                            unicastProcessorCreate.onNext(it2.next());
                                        }
                                    } else {
                                        fail(new MissingBackpressureException("Could not emit value due to lack of requests"), interfaceC44417c, spscLinkedArrayQueue);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    fail(th2, interfaceC44417c, spscLinkedArrayQueue);
                                    return;
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
                                LeftRightEndSubscriber leftRightEndSubscriber2 = new LeftRightEndSubscriber(this, false, i12);
                                this.disposables.add(leftRightEndSubscriber2);
                                interfaceC44416b2.subscribe(leftRightEndSubscriber2);
                                if (this.error.get() != null) {
                                    spscLinkedArrayQueue.clear();
                                    cancelAll();
                                    errorAll(interfaceC44417c);
                                    return;
                                } else {
                                    Iterator<UnicastProcessor<TRight>> it3 = this.lefts.values().iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onNext(objPoll);
                                    }
                                }
                            } catch (Throwable th4) {
                                fail(th4, interfaceC44417c, spscLinkedArrayQueue);
                                return;
                            }
                        } else if (num == LEFT_CLOSE) {
                            LeftRightEndSubscriber leftRightEndSubscriber3 = (LeftRightEndSubscriber) objPoll;
                            UnicastProcessor<TRight> unicastProcessorRemove = this.lefts.remove(Integer.valueOf(leftRightEndSubscriber3.index));
                            this.disposables.remove(leftRightEndSubscriber3);
                            if (unicastProcessorRemove != null) {
                                unicastProcessorRemove.onComplete();
                            }
                        } else if (num == RIGHT_CLOSE) {
                            LeftRightEndSubscriber leftRightEndSubscriber4 = (LeftRightEndSubscriber) objPoll;
                            this.rights.remove(Integer.valueOf(leftRightEndSubscriber4.index));
                            this.disposables.remove(leftRightEndSubscriber4);
                        }
                    }
                }
                spscLinkedArrayQueue.clear();
            }
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

    public interface JoinSupport {
        void innerClose(boolean z11, LeftRightEndSubscriber leftRightEndSubscriber);

        void innerCloseError(Throwable th2);

        void innerComplete(LeftRightSubscriber leftRightSubscriber);

        void innerError(Throwable th2);

        void innerValue(boolean z11, Object obj);
    }

    public static final class LeftRightEndSubscriber extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final JoinSupport parent;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.innerClose(this.isLeft, this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.innerCloseError(th2);
        }

        public LeftRightEndSubscriber(JoinSupport joinSupport, boolean z11, int i11) {
            this.parent = joinSupport;
            this.isLeft = z11;
            this.index = i11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            if (SubscriptionHelper.cancel(this)) {
                this.parent.innerClose(this.isLeft, this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    public static final class LeftRightSubscriber extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final JoinSupport parent;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.innerComplete(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.innerError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            this.parent.innerValue(this.isLeft, obj);
        }

        public LeftRightSubscriber(JoinSupport joinSupport, boolean z11) {
            this.parent = joinSupport;
            this.isLeft = z11;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        GroupJoinSubscription groupJoinSubscription = new GroupJoinSubscription(interfaceC44417c, this.leftEnd, this.rightEnd, this.resultSelector);
        interfaceC44417c.onSubscribe(groupJoinSubscription);
        LeftRightSubscriber leftRightSubscriber = new LeftRightSubscriber(groupJoinSubscription, true);
        groupJoinSubscription.disposables.add(leftRightSubscriber);
        LeftRightSubscriber leftRightSubscriber2 = new LeftRightSubscriber(groupJoinSubscription, false);
        groupJoinSubscription.disposables.add(leftRightSubscriber2);
        this.source.subscribe((FlowableSubscriber) leftRightSubscriber);
        this.other.subscribe(leftRightSubscriber2);
    }

    public FlowableGroupJoin(Flowable<TLeft> flowable, InterfaceC44416b<? extends TRight> interfaceC44416b, Function<? super TLeft, ? extends InterfaceC44416b<TLeftEnd>> function, Function<? super TRight, ? extends InterfaceC44416b<TRightEnd>> function2, BiFunction<? super TLeft, ? super Flowable<TRight>, ? extends R> biFunction) {
        super(flowable);
        this.other = interfaceC44416b;
        this.leftEnd = function;
        this.rightEnd = function2;
        this.resultSelector = biFunction;
    }
}
