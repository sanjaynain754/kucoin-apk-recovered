package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
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
public final class ParallelCollect<T, C> extends ParallelFlowable<C> {
    final BiConsumer<? super C, ? super T> collector;
    final Callable<? extends C> initialCollection;
    final ParallelFlowable<? extends T> source;

    public static final class ParallelCollectSubscriber<T, C> extends DeferredScalarSubscriber<T, C> {
        private static final long serialVersionUID = -4767392946044436228L;
        C collection;
        final BiConsumer<? super C, ? super T> collector;
        boolean done;

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c11 = this.collection;
            this.collection = null;
            complete(c11);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.collection = null;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.internal.subscribers.DeferredScalarSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                this.collector.accept(this.collection, t11);
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

        public ParallelCollectSubscriber(InterfaceC44417c<? super C> interfaceC44417c, C c11, BiConsumer<? super C, ? super T> biConsumer) {
            super(interfaceC44417c);
            this.collection = c11;
            this.collector = biConsumer;
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

    public ParallelCollect(ParallelFlowable<? extends T> parallelFlowable, Callable<? extends C> callable, BiConsumer<? super C, ? super T> biConsumer) {
        this.source = parallelFlowable;
        this.initialCollection = callable;
        this.collector = biConsumer;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super C>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<? super Object>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                interfaceC44417cArr2[i11] = new ParallelCollectSubscriber(interfaceC44417cArr[i11], ObjectHelper.requireNonNull(this.initialCollection.call(), "The initialSupplier returned a null value"), this.collector);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                reportError(interfaceC44417cArr, th2);
                return;
            }
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
