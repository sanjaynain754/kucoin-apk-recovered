package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final int prefetch;

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, InterfaceC44418d {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
        final int prefetch;
        SimpleQueue<T> queue;
        int sourceMode;
        InterfaceC44418d upstream;
        final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        final AtomicThrowable errors = new AtomicThrowable();

        @Override // sh0.InterfaceC44418d
        public abstract /* synthetic */ void cancel();

        public abstract void drain();

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void innerComplete() {
            this.active = false;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public abstract /* synthetic */ void onError(Throwable th2);

        @Override // sh0.InterfaceC44418d
        public abstract /* synthetic */ void request(long j11);

        public abstract void subscribeActual();

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onNext(T t11) {
            if (this.sourceMode == 2 || this.queue.offer(t11)) {
                drain();
            } else {
                this.upstream.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                if (interfaceC44418d instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                    int iRequestFusion = queueSubscription.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        subscribeActual();
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = queueSubscription;
                        subscribeActual();
                        interfaceC44418d.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                subscribeActual();
                interfaceC44418d.request(this.prefetch);
            }
        }

        public BaseConcatMapSubscriber(Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11) {
            this.mapper = function;
            this.prefetch = i11;
            this.limit = i11 - (i11 >> 2);
        }
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final InterfaceC44417c<? super R> downstream;
        final boolean veryEnd;

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (!this.veryEnd) {
                this.upstream.cancel();
                this.done = true;
            }
            this.active = false;
            drain();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r11) {
            this.downstream.onNext(r11);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, sh0.InterfaceC44418d
        public void request(long j11) {
            this.inner.request(j11);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        public ConcatMapDelayed(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, boolean z11) {
            super(function, i11);
            this.downstream = interfaceC44417c;
            this.veryEnd = z11;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            boolean z11;
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z12 = this.done;
                        if (z12 && !this.veryEnd && this.errors.get() != null) {
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                        try {
                            T tPoll = this.queue.poll();
                            if (tPoll == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z12 && z11) {
                                Throwable thTerminate = this.errors.terminate();
                                if (thTerminate != null) {
                                    this.downstream.onError(thTerminate);
                                    return;
                                } else {
                                    this.downstream.onComplete();
                                    return;
                                }
                            }
                            if (!z11) {
                                try {
                                    InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i11 = this.consumed + 1;
                                        if (i11 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i11);
                                        } else {
                                            this.consumed = i11;
                                        }
                                    }
                                    if (interfaceC44416b instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) interfaceC44416b).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.inner.isUnbounded()) {
                                                this.downstream.onNext(objCall);
                                            } else {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.setSubscription(new WeakScalarSubscription(objCall, concatMapInner));
                                            }
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th2);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        interfaceC44416b.subscribe(this.inner);
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th3);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.upstream.cancel();
                            this.errors.addThrowable(th4);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final InterfaceC44417c<? super R> downstream;
        final AtomicInteger wip;

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, sh0.InterfaceC44418d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z11 = this.done;
                        try {
                            T tPoll = this.queue.poll();
                            boolean z12 = tPoll == null;
                            if (z11 && z12) {
                                this.downstream.onComplete();
                                return;
                            }
                            if (!z12) {
                                try {
                                    InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(tPoll), "The mapper returned a null Publisher");
                                    if (this.sourceMode != 1) {
                                        int i11 = this.consumed + 1;
                                        if (i11 == this.limit) {
                                            this.consumed = 0;
                                            this.upstream.request(i11);
                                        } else {
                                            this.consumed = i11;
                                        }
                                    }
                                    if (interfaceC44416b instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) interfaceC44416b).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.inner.isUnbounded()) {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.setSubscription(new WeakScalarSubscription(objCall, concatMapInner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.downstream.onNext(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    this.downstream.onError(this.errors.terminate());
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            Exceptions.throwIfFatal(th2);
                                            this.upstream.cancel();
                                            this.errors.addThrowable(th2);
                                            this.downstream.onError(this.errors.terminate());
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        interfaceC44416b.subscribe(this.inner);
                                    }
                                } catch (Throwable th3) {
                                    Exceptions.throwIfFatal(th3);
                                    this.upstream.cancel();
                                    this.errors.addThrowable(th3);
                                    this.downstream.onError(this.errors.terminate());
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            Exceptions.throwIfFatal(th4);
                            this.upstream.cancel();
                            this.errors.addThrowable(th4);
                            this.downstream.onError(this.errors.terminate());
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.inner.cancel();
            if (getAndIncrement() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber, sh0.InterfaceC44418d
        public void request(long j11) {
            this.inner.request(j11);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public void subscribeActual() {
            this.downstream.onSubscribe(this);
        }

        public ConcatMapImmediate(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11) {
            super(function, i11);
            this.downstream = interfaceC44417c;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public void innerNext(R r11) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(r11);
                if (!compareAndSet(1, 0)) {
                    this.downstream.onError(this.errors.terminate());
                }
            }
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final ConcatMapSupport<R> parent;
        long produced;

        public ConcatMapInner(ConcatMapSupport<R> concatMapSupport) {
            super(false);
            this.parent = concatMapSupport;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            long j11 = this.produced;
            if (j11 != 0) {
                this.produced = 0L;
                produced(j11);
            }
            this.parent.innerComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            long j11 = this.produced;
            if (j11 != 0) {
                this.produced = 0L;
                produced(j11);
            }
            this.parent.innerError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(R r11) {
            this.produced++;
            this.parent.innerNext(r11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            setSubscription(interfaceC44418d);
        }
    }

    public interface ConcatMapSupport<T> {
        void innerComplete();

        void innerError(Throwable th2);

        void innerNext(T t11);
    }

    public static final class WeakScalarSubscription<T> implements InterfaceC44418d {
        final InterfaceC44417c<? super T> downstream;
        boolean once;
        final T value;

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (j11 <= 0 || this.once) {
                return;
            }
            this.once = true;
            InterfaceC44417c<? super T> interfaceC44417c = this.downstream;
            interfaceC44417c.onNext(this.value);
            interfaceC44417c.onComplete();
        }

        public WeakScalarSubscription(T t11, InterfaceC44417c<? super T> interfaceC44417c) {
            this.value = t11;
            this.downstream = interfaceC44417c;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1 */
    public static /* synthetic */ class C392251 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$internal$util$ErrorMode;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            $SwitchMap$io$reactivex$internal$util$ErrorMode = iArr;
            try {
                iArr[ErrorMode.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$reactivex$internal$util$ErrorMode[ErrorMode.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static <T, R> InterfaceC44417c<T> subscribe(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, ErrorMode errorMode) {
        int i12 = C392251.$SwitchMap$io$reactivex$internal$util$ErrorMode[errorMode.ordinal()];
        if (i12 != 1) {
            return i12 != 2 ? new ConcatMapImmediate(interfaceC44417c, function, i11) : new ConcatMapDelayed(interfaceC44417c, function, i11, true);
        }
        return new ConcatMapDelayed(interfaceC44417c, function, i11, false);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, interfaceC44417c, this.mapper)) {
            return;
        }
        this.source.subscribe(subscribe(interfaceC44417c, this.mapper, this.prefetch, this.errorMode));
    }

    public FlowableConcatMap(Flowable<T> flowable, Function<? super T, ? extends InterfaceC44416b<? extends R>> function, int i11, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.prefetch = i11;
        this.errorMode = errorMode;
    }
}
