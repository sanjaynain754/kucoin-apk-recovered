package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableReduceSeedSingle<T, R> extends Single<R> {
    final BiFunction<R, ? super T, R> reducer;
    final R seed;
    final InterfaceC44416b<T> source;

    public static final class ReduceSeedObserver<T, R> implements FlowableSubscriber<T>, Disposable {
        final SingleObserver<? super R> downstream;
        final BiFunction<R, ? super T, R> reducer;
        InterfaceC44418d upstream;
        R value;

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
            R r11 = this.value;
            if (r11 != null) {
                this.value = null;
                this.upstream = SubscriptionHelper.CANCELLED;
                this.downstream.onSuccess(r11);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.value == null) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.value = null;
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            R r11 = this.value;
            if (r11 != null) {
                try {
                    this.value = (R) ObjectHelper.requireNonNull(this.reducer.apply(r11, t11), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        public ReduceSeedObserver(SingleObserver<? super R> singleObserver, BiFunction<R, ? super T, R> biFunction, R r11) {
            this.downstream = singleObserver;
            this.value = r11;
            this.reducer = biFunction;
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.source.subscribe(new ReduceSeedObserver(singleObserver, this.reducer, this.seed));
    }

    public FlowableReduceSeedSingle(InterfaceC44416b<T> interfaceC44416b, R r11, BiFunction<R, ? super T, R> biFunction) {
        this.source = interfaceC44416b;
        this.seed = r11;
        this.reducer = biFunction;
    }
}
