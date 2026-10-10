package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelReduce<T, R> extends ParallelFlowable<R> {
    final Callable<R> initialSupplier;
    final BiFunction<R, ? super T, R> reducer;
    final ParallelFlowable<? extends T> source;

    public static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {
        private static final long serialVersionUID = 8200530050639449080L;
        R accumulator;
        boolean done;
        final BiFunction<R, ? super T, R> reducer;

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            R r11 = this.accumulator;
            this.accumulator = null;
            complete(r11);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.accumulator = null;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                this.accumulator = (R) ObjectHelper.requireNonNull(this.reducer.apply(this.accumulator, t11), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public ParallelReduceSubscriber(InterfaceC44417c<? super R> interfaceC44417c, R r11, BiFunction<R, ? super T, R> biFunction) {
            super(interfaceC44417c);
            this.accumulator = r11;
            this.reducer = biFunction;
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }
    }

    public void reportError(InterfaceC44417c<?>[] interfaceC44417cArr, Throwable th2) {
        for (InterfaceC44417c<?> interfaceC44417c : interfaceC44417cArr) {
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public ParallelReduce(ParallelFlowable<? extends T> parallelFlowable, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.source = parallelFlowable;
        this.initialSupplier = callable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super R>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<? super Object>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                interfaceC44417cArr2[i11] = new ParallelReduceSubscriber(interfaceC44417cArr[i11], ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initialSupplier returned a null value"), this.reducer);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                reportError(interfaceC44417cArr, th2);
                return;
            }
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
