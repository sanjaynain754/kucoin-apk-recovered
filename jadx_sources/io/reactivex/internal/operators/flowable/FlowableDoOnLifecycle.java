package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDoOnLifecycle<T> extends AbstractFlowableWithUpstream<T, T> {
    private final Action onCancel;
    private final LongConsumer onRequest;
    private final Consumer<? super InterfaceC44418d> onSubscribe;

    public static final class SubscriptionLambdaSubscriber<T> implements FlowableSubscriber<T>, InterfaceC44418d {
        final InterfaceC44417c<? super T> downstream;
        final Action onCancel;
        final LongConsumer onRequest;
        final Consumer<? super InterfaceC44418d> onSubscribe;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            InterfaceC44418d interfaceC44418d = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (interfaceC44418d != subscriptionHelper) {
                this.upstream = subscriptionHelper;
                try {
                    this.onCancel.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
                interfaceC44418d.cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.upstream != SubscriptionHelper.CANCELLED) {
                this.downstream.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            try {
                this.onSubscribe.accept(interfaceC44418d);
                if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                    this.upstream = interfaceC44418d;
                    this.downstream.onSubscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                interfaceC44418d.cancel();
                this.upstream = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th2, this.downstream);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            try {
                this.onRequest.accept(j11);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.upstream.request(j11);
        }

        public SubscriptionLambdaSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Consumer<? super InterfaceC44418d> consumer, LongConsumer longConsumer, Action action) {
            this.downstream = interfaceC44417c;
            this.onSubscribe = consumer;
            this.onCancel = action;
            this.onRequest = longConsumer;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new SubscriptionLambdaSubscriber(interfaceC44417c, this.onSubscribe, this.onRequest, this.onCancel));
    }

    public FlowableDoOnLifecycle(Flowable<T> flowable, Consumer<? super InterfaceC44418d> consumer, LongConsumer longConsumer, Action action) {
        super(flowable);
        this.onSubscribe = consumer;
        this.onRequest = longConsumer;
        this.onCancel = action;
    }
}
