package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableTimeout<T, U, V> extends AbstractFlowableWithUpstream<T, T> {
    final InterfaceC44416b<U> firstTimeoutIndicator;
    final Function<? super T, ? extends InterfaceC44416b<V>> itemTimeoutIndicator;
    final InterfaceC44416b<? extends T> other;

    public static final class TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T>, TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        long consumed;
        final InterfaceC44417c<? super T> downstream;
        InterfaceC44416b<? extends T> fallback;
        final AtomicLong index;
        final Function<? super T, ? extends InterfaceC44416b<?>> itemTimeoutIndicator;
        final SequentialDisposable task;
        final AtomicReference<InterfaceC44418d> upstream;

        public TimeoutFallbackSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<?>> function, InterfaceC44416b<? extends T> interfaceC44416b) {
            super(true);
            this.downstream = interfaceC44417c;
            this.itemTimeoutIndicator = function;
            this.task = new SequentialDisposable();
            this.upstream = new AtomicReference<>();
            this.fallback = interfaceC44416b;
            this.index = new AtomicLong();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.task.dispose();
            this.downstream.onError(th2);
            this.task.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            long j11 = this.index.get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = j11 + 1;
                if (this.index.compareAndSet(j11, j12)) {
                    Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.consumed++;
                    this.downstream.onNext(t11);
                    try {
                        InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t11), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j12, this);
                        if (this.task.replace(timeoutConsumer)) {
                            interfaceC44416b.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.upstream.get().cancel();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
                setSubscription(interfaceC44418d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j11) {
            if (this.index.compareAndSet(j11, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                InterfaceC44416b<? extends T> interfaceC44416b = this.fallback;
                this.fallback = null;
                long j12 = this.consumed;
                if (j12 != 0) {
                    produced(j12);
                }
                interfaceC44416b.subscribe(new FlowableTimeoutTimed.FallbackSubscriber(this.downstream, this));
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j11, Throwable th2) {
            if (!this.index.compareAndSet(j11, Long.MAX_VALUE)) {
                RxJavaPlugins.onError(th2);
            } else {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th2);
            }
        }

        public void startFirstTimeout(InterfaceC44416b<?> interfaceC44416b) {
            if (interfaceC44416b != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    interfaceC44416b.subscribe(timeoutConsumer);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, sh0.InterfaceC44418d
        public void cancel() {
            super.cancel();
            this.task.dispose();
        }
    }

    public interface TimeoutSelectorSupport extends FlowableTimeoutTimed.TimeoutSupport {
        void onTimeoutError(long j11, Throwable th2);
    }

    public static final class TimeoutSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d, TimeoutSelectorSupport {
        private static final long serialVersionUID = 3764492702657003550L;
        final InterfaceC44417c<? super T> downstream;
        final Function<? super T, ? extends InterfaceC44416b<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.task.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
        }

        public void startFirstTimeout(InterfaceC44416b<?> interfaceC44416b) {
            if (interfaceC44416b != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, this);
                if (this.task.replace(timeoutConsumer)) {
                    interfaceC44416b.subscribe(timeoutConsumer);
                }
            }
        }

        public TimeoutSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<?>> function) {
            this.downstream = interfaceC44417c;
            this.itemTimeoutIndicator = function;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            long j11 = get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = 1 + j11;
                if (compareAndSet(j11, j12)) {
                    Disposable disposable = this.task.get();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    this.downstream.onNext(t11);
                    try {
                        InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.itemTimeoutIndicator.apply(t11), "The itemTimeoutIndicator returned a null Publisher.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j12, this);
                        if (this.task.replace(timeoutConsumer)) {
                            interfaceC44416b.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.upstream.get().cancel();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th2);
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeoutTimed.TimeoutSupport
        public void onTimeout(long j11) {
            if (compareAndSet(j11, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableTimeout.TimeoutSelectorSupport
        public void onTimeoutError(long j11, Throwable th2) {
            if (compareAndSet(j11, Long.MAX_VALUE)) {
                SubscriptionHelper.cancel(this.upstream);
                this.downstream.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public static final class TimeoutConsumer extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final TimeoutSelectorSupport parent;

        public TimeoutConsumer(long j11, TimeoutSelectorSupport timeoutSelectorSupport) {
            this.idx = j11;
            this.parent = timeoutSelectorSupport;
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
        public void onComplete() {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            Object obj = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (obj != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.onTimeoutError(this.idx, th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            InterfaceC44418d interfaceC44418d = (InterfaceC44418d) get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC44418d != subscriptionHelper) {
                interfaceC44418d.cancel();
                lazySet(subscriptionHelper);
                this.parent.onTimeout(this.idx);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        if (this.other == null) {
            TimeoutSubscriber timeoutSubscriber = new TimeoutSubscriber(interfaceC44417c, this.itemTimeoutIndicator);
            interfaceC44417c.onSubscribe(timeoutSubscriber);
            timeoutSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
            this.source.subscribe((FlowableSubscriber) timeoutSubscriber);
            return;
        }
        TimeoutFallbackSubscriber timeoutFallbackSubscriber = new TimeoutFallbackSubscriber(interfaceC44417c, this.itemTimeoutIndicator, this.other);
        interfaceC44417c.onSubscribe(timeoutFallbackSubscriber);
        timeoutFallbackSubscriber.startFirstTimeout(this.firstTimeoutIndicator);
        this.source.subscribe((FlowableSubscriber) timeoutFallbackSubscriber);
    }

    public FlowableTimeout(Flowable<T> flowable, InterfaceC44416b<U> interfaceC44416b, Function<? super T, ? extends InterfaceC44416b<V>> function, InterfaceC44416b<? extends T> interfaceC44416b2) {
        super(flowable);
        this.firstTimeoutIndicator = interfaceC44416b;
        this.itemTimeoutIndicator = function;
        this.other = interfaceC44416b2;
    }
}
