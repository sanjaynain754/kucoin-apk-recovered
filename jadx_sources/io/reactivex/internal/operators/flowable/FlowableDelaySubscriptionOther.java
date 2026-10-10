package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final InterfaceC44416b<? extends T> main;
    final InterfaceC44416b<U> other;

    public static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 2259811067697317255L;
        final InterfaceC44417c<? super T> downstream;
        final InterfaceC44416b<? extends T> main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();

        public final class OtherSubscriber extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            public OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onError(Throwable th2) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th2);
                } else {
                    RxJavaPlugins.onError(th2);
                }
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onNext(Object obj) {
                InterfaceC44418d interfaceC44418d = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC44418d != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    interfaceC44418d.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
            public void onSubscribe(InterfaceC44418d interfaceC44418d) {
                if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
                    interfaceC44418d.request(Long.MAX_VALUE);
                }
            }
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        public void next() {
            this.main.subscribe(this);
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
        public void onNext(T t11) {
            this.downstream.onNext(t11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, interfaceC44418d);
        }

        public MainSubscriber(InterfaceC44417c<? super T> interfaceC44417c, InterfaceC44416b<? extends T> interfaceC44416b) {
            this.downstream = interfaceC44417c;
            this.main = interfaceC44416b;
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            if (SubscriptionHelper.validate(j11)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j11);
            }
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        MainSubscriber mainSubscriber = new MainSubscriber(interfaceC44417c, this.main);
        interfaceC44417c.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }

    public FlowableDelaySubscriptionOther(InterfaceC44416b<? extends T> interfaceC44416b, InterfaceC44416b<U> interfaceC44416b2) {
        this.main = interfaceC44416b;
        this.other = interfaceC44416b2;
    }
}
