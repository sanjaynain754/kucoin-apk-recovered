package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableLastMaybe<T> extends Maybe<T> {
    final InterfaceC44416b<T> source;

    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final MaybeObserver<? super T> downstream;
        T item;
        InterfaceC44418d upstream;

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        /* JADX INFO: renamed from: isDisposed */
        public boolean getDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            T t11 = this.item;
            if (t11 == null) {
                this.downstream.onComplete();
            } else {
                this.item = null;
                this.downstream.onSuccess(t11);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.upstream = SubscriptionHelper.CANCELLED;
            this.item = null;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.item = t11;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public LastSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new LastSubscriber(maybeObserver));
    }

    public FlowableLastMaybe(InterfaceC44416b<T> interfaceC44416b) {
        this.source = interfaceC44416b;
    }
}
