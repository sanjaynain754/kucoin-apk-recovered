package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final SingleSource<T> source;

    public static final class SingleFlatMapPublisherObserver<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 7759721921468635667L;
        Disposable disposable;
        final InterfaceC44417c<? super T> downstream;
        final Function<? super S, ? extends InterfaceC44416b<? extends T>> mapper;
        final AtomicReference<InterfaceC44418d> parent = new AtomicReference<>();

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.disposable = disposable;
            this.downstream.onSubscribe(this);
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.disposable.dispose();
            SubscriptionHelper.cancel(this.parent);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(S s11) {
            try {
                ((InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(s11), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.parent, this, j11);
        }

        public SingleFlatMapPublisherObserver(InterfaceC44417c<? super T> interfaceC44417c, Function<? super S, ? extends InterfaceC44416b<? extends T>> function) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.parent, this, interfaceC44418d);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe(new SingleFlatMapPublisherObserver(interfaceC44417c, this.mapper));
    }

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends InterfaceC44416b<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }
}
