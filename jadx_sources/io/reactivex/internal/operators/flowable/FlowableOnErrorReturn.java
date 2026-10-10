package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Throwable, ? extends T> valueSupplier;

    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;
        final Function<? super Throwable, ? extends T> valueSupplier;

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            try {
                complete(ObjectHelper.requireNonNull(this.valueSupplier.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.produced++;
            this.downstream.onNext((Object) t11);
        }

        public OnErrorReturnSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super Throwable, ? extends T> function) {
            super(interfaceC44417c);
            this.valueSupplier = function;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        this.source.subscribe((FlowableSubscriber) new OnErrorReturnSubscriber(interfaceC44417c, this.valueSupplier));
    }

    public FlowableOnErrorReturn(Flowable<T> flowable, Function<? super Throwable, ? extends T> function) {
        super(flowable);
        this.valueSupplier = function;
    }
}
