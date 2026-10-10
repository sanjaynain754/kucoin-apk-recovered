package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {
    final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
    final MaybeSource<T> source;

    public static final class FlatMapPublisherSubscriber<T, R> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<R>, MaybeObserver<T>, InterfaceC44418d {
        private static final long serialVersionUID = -8948264376121066672L;
        final InterfaceC44417c<? super R> downstream;
        final Function<? super T, ? extends InterfaceC44416b<? extends R>> mapper;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(R r11) {
            this.downstream.onNext(r11);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t11) {
            try {
                ((InterfaceC44416b) ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this, this.requested, j11);
        }

        public FlatMapPublisherSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends InterfaceC44416b<? extends R>> function) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, interfaceC44418d);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        this.source.subscribe(new FlatMapPublisherSubscriber(interfaceC44417c, this.mapper));
    }

    public MaybeFlatMapPublisher(MaybeSource<T> maybeSource, Function<? super T, ? extends InterfaceC44416b<? extends R>> function) {
        this.source = maybeSource;
        this.mapper = function;
    }
}
