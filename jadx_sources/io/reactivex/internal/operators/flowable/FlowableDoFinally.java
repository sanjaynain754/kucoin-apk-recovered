package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDoFinally<T> extends AbstractFlowableWithUpstream<T, T> {
    final Action onFinally;

    public static final class DoFinallyConditionalSubscriber<T> extends BasicIntQueueSubscription<T> implements ConditionalSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final ConditionalSubscriber<? super T> downstream;
        final Action onFinally;

        /* JADX INFO: renamed from: qs */
        QueueSubscription<T> f87143qs;
        boolean syncFused;
        InterfaceC44418d upstream;

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f87143qs.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f87143qs.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
            runFinally();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                if (interfaceC44418d instanceof QueueSubscription) {
                    this.f87143qs = (QueueSubscription) interfaceC44418d;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.f87143qs.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            QueueSubscription<T> queueSubscription = this.f87143qs;
            if (queueSubscription == null || (i11 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i11);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            return this.downstream.tryOnNext(t11);
        }

        public DoFinallyConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Action action) {
            this.downstream = conditionalSubscriber;
            this.onFinally = action;
        }
    }

    public static final class DoFinallySubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final InterfaceC44417c<? super T> downstream;
        final Action onFinally;

        /* JADX INFO: renamed from: qs */
        QueueSubscription<T> f87144qs;
        boolean syncFused;
        InterfaceC44418d upstream;

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
            runFinally();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f87144qs.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.f87144qs.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
            runFinally();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                if (interfaceC44418d instanceof QueueSubscription) {
                    this.f87144qs = (QueueSubscription) interfaceC44418d;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll = this.f87144qs.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            QueueSubscription<T> queueSubscription = this.f87144qs;
            if (queueSubscription == null || (i11 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueSubscription.requestFusion(i11);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        public DoFinallySubscriber(InterfaceC44417c<? super T> interfaceC44417c, Action action) {
            this.downstream = interfaceC44417c;
            this.onFinally = action;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        if (interfaceC44417c instanceof ConditionalSubscriber) {
            this.source.subscribe((FlowableSubscriber) new DoFinallyConditionalSubscriber((ConditionalSubscriber) interfaceC44417c, this.onFinally));
        } else {
            this.source.subscribe((FlowableSubscriber) new DoFinallySubscriber(interfaceC44417c, this.onFinally));
        }
    }

    public FlowableDoFinally(Flowable<T> flowable, Action action) {
        super(flowable);
        this.onFinally = action;
    }
}
