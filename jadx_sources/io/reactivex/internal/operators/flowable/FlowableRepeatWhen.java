package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Flowable<Object>, ? extends InterfaceC44416b<?>> handler;

    public static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            again(0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.receiver.cancel();
            this.downstream.onError(th2);
        }

        public RepeatWhenSubscriber(InterfaceC44417c<? super T> interfaceC44417c, FlowableProcessor<Object> flowableProcessor, InterfaceC44418d interfaceC44418d) {
            super(interfaceC44417c, flowableProcessor, interfaceC44418d);
        }
    }

    public static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, InterfaceC44418d {
        private static final long serialVersionUID = 2827772011130406689L;
        final InterfaceC44416b<T> source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
        }

        public WhenReceiver(InterfaceC44416b<T> interfaceC44416b) {
            this.source = interfaceC44416b;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final InterfaceC44417c<? super T> downstream;
        protected final FlowableProcessor<U> processor;
        private long produced;
        protected final InterfaceC44418d receiver;

        public WhenSourceSubscriber(InterfaceC44417c<? super T> interfaceC44417c, FlowableProcessor<U> flowableProcessor, InterfaceC44418d interfaceC44418d) {
            super(false);
            this.downstream = interfaceC44417c;
            this.processor = flowableProcessor;
            this.receiver = interfaceC44418d;
        }

        public abstract /* synthetic */ void onComplete();

        public abstract /* synthetic */ void onError(Throwable th2);

        public final void again(U u11) {
            setSubscription(EmptySubscription.INSTANCE);
            long j11 = this.produced;
            if (j11 != 0) {
                this.produced = 0L;
                produced(j11);
            }
            this.receiver.request(1L);
            this.processor.onNext(u11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onNext(T t11) {
            this.produced++;
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, sh0.InterfaceC44418d
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onSubscribe(InterfaceC44418d interfaceC44418d) {
            setSubscription(interfaceC44418d);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC44417c);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.source);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            interfaceC44417c.onSubscribe(repeatWhenSubscriber);
            interfaceC44416b.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends InterfaceC44416b<?>> function) {
        super(flowable);
        this.handler = function;
    }
}
