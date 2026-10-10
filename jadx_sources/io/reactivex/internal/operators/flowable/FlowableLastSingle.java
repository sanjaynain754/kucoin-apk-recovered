package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableLastSingle<T> extends Single<T> {
    final T defaultItem;
    final InterfaceC44416b<T> source;

    public static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final T defaultItem;
        final SingleObserver<? super T> downstream;
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
            if (t11 != null) {
                this.item = null;
                this.downstream.onSuccess(t11);
                return;
            }
            T t12 = this.defaultItem;
            if (t12 != null) {
                this.downstream.onSuccess(t12);
            } else {
                this.downstream.onError(new NoSuchElementException());
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

        public LastSubscriber(SingleObserver<? super T> singleObserver, T t11) {
            this.downstream = singleObserver;
            this.defaultItem = t11;
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new LastSubscriber(singleObserver, this.defaultItem));
    }

    public FlowableLastSingle(InterfaceC44416b<T> interfaceC44416b, T t11) {
        this.source = interfaceC44416b;
        this.defaultItem = t11;
    }
}
