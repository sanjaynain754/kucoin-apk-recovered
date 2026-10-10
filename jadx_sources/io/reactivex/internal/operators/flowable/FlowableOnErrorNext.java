package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableOnErrorNext<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean allowFatal;
    final Function<? super Throwable, ? extends InterfaceC44416b<? extends T>> nextSupplier;

    public static final class OnErrorNextSubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4063763155303814625L;
        final boolean allowFatal;
        boolean done;
        final InterfaceC44417c<? super T> downstream;
        final Function<? super Throwable, ? extends InterfaceC44416b<? extends T>> nextSupplier;
        boolean once;
        long produced;

        public OnErrorNextSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super Throwable, ? extends InterfaceC44416b<? extends T>> function, boolean z11) {
            super(false);
            this.downstream = interfaceC44417c;
            this.nextSupplier = function;
            this.allowFatal = z11;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.once = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.once) {
                if (this.done) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    this.downstream.onError(th2);
                    return;
                }
            }
            this.once = true;
            if (this.allowFatal && !(th2 instanceof Exception)) {
                this.downstream.onError(th2);
                return;
            }
            try {
                InterfaceC44416b interfaceC44416b = (InterfaceC44416b) ObjectHelper.requireNonNull(this.nextSupplier.apply(th2), "The nextSupplier returned a null Publisher");
                long j11 = this.produced;
                if (j11 != 0) {
                    produced(j11);
                }
                interfaceC44416b.subscribe(this);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (!this.once) {
                this.produced++;
            }
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            setSubscription(interfaceC44418d);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        OnErrorNextSubscriber onErrorNextSubscriber = new OnErrorNextSubscriber(interfaceC44417c, this.nextSupplier, this.allowFatal);
        interfaceC44417c.onSubscribe(onErrorNextSubscriber);
        this.source.subscribe((FlowableSubscriber) onErrorNextSubscriber);
    }

    public FlowableOnErrorNext(Flowable<T> flowable, Function<? super Throwable, ? extends InterfaceC44416b<? extends T>> function, boolean z11) {
        super(flowable);
        this.nextSupplier = function;
        this.allowFatal = z11;
    }
}
