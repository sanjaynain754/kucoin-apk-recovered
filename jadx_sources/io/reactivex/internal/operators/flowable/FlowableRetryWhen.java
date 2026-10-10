package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableRetryWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Flowable<Throwable>, ? extends InterfaceC44416b<?>> handler;

    public static final class RetryWhenSubscriber<T> extends FlowableRepeatWhen.WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.receiver.cancel();
            this.downstream.onComplete();
        }

        public RetryWhenSubscriber(InterfaceC44417c<? super T> interfaceC44417c, FlowableProcessor<Throwable> flowableProcessor, InterfaceC44418d interfaceC44418d) {
            super(interfaceC44417c, flowableProcessor, interfaceC44418d);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            again(th2);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC44417c);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            FlowableRepeatWhen.WhenReceiver whenReceiver = new FlowableRepeatWhen.WhenReceiver(this.source);
            RetryWhenSubscriber retryWhenSubscriber = new RetryWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = retryWhenSubscriber;
            interfaceC44417c.onSubscribe(retryWhenSubscriber);
            interfaceC44416b.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowableRetryWhen(Flowable<T> flowable, Function<? super Flowable<Throwable>, ? extends InterfaceC44416b<?>> function) {
        super(flowable);
        this.handler = function;
    }
}
