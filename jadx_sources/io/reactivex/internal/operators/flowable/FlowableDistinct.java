package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDistinct<T, K> extends AbstractFlowableWithUpstream<T, T> {
    final Callable<? extends Collection<? super K>> collectionSupplier;
    final Function<? super T, K> keySelector;

    public static final class DistinctSubscriber<T, K> extends BasicFuseableSubscriber<T, T> {
        final Collection<? super K> collection;
        final Function<? super T, K> keySelector;

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.collection.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.collection.clear();
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                if (this.collection.add(ObjectHelper.requireNonNull(this.keySelector.apply(t11), "The keySelector returned a null key"))) {
                    this.downstream.onNext((Object) t11);
                } else {
                    this.upstream.request(1L);
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T tPoll;
            while (true) {
                tPoll = this.f87203qs.poll();
                if (tPoll == null || this.collection.add((Object) ObjectHelper.requireNonNull(this.keySelector.apply(tPoll), "The keySelector returned a null key"))) {
                    break;
                }
                if (this.sourceMode == 2) {
                    this.upstream.request(1L);
                }
            }
            return tPoll;
        }

        public DistinctSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Function<? super T, K> function, Collection<? super K> collection) {
            super(interfaceC44417c);
            this.keySelector = function;
            this.collection = collection;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i11) {
            return transitiveBoundaryFusion(i11);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        try {
            this.source.subscribe((FlowableSubscriber) new DistinctSubscriber(interfaceC44417c, this.keySelector, (Collection) ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, interfaceC44417c);
        }
    }

    public FlowableDistinct(Flowable<T> flowable, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(flowable);
        this.keySelector = function;
        this.collectionSupplier = callable;
    }
}
