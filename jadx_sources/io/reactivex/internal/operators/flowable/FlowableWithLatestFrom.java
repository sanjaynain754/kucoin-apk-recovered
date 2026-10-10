package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableWithLatestFrom<T, U, R> extends AbstractFlowableWithUpstream<T, R> {
    final BiFunction<? super T, ? super U, ? extends R> combiner;
    final InterfaceC44416b<? extends U> other;

    public final class FlowableWithLatestSubscriber implements FlowableSubscriber<U> {
        private final WithLatestFromSubscriber<T, U, R> wlf;

        public FlowableWithLatestSubscriber(WithLatestFromSubscriber<T, U, R> withLatestFromSubscriber) {
            this.wlf = withLatestFromSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.wlf.otherError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(U u11) {
            this.wlf.lazySet(u11);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (this.wlf.setOther(interfaceC44418d)) {
                interfaceC44418d.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
        }
    }

    public static final class WithLatestFromSubscriber<T, U, R> extends AtomicReference<U> implements ConditionalSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = -312246233408980075L;
        final BiFunction<? super T, ? super U, ? extends R> combiner;
        final InterfaceC44417c<? super R> downstream;
        final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<InterfaceC44418d> other = new AtomicReference<>();

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            SubscriptionHelper.cancel(this.other);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            SubscriptionHelper.cancel(this.other);
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        }

        public void otherError(Throwable th2) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th2);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
        }

        public boolean setOther(InterfaceC44418d interfaceC44418d) {
            return SubscriptionHelper.setOnce(this.other, interfaceC44418d);
        }

        public WithLatestFromSubscriber(InterfaceC44417c<? super R> interfaceC44417c, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.downstream = interfaceC44417c;
            this.combiner = biFunction;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (!tryOnNext(t11)) {
                this.upstream.get().request(1L);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            U u11 = get();
            if (u11 != null) {
                try {
                    this.downstream.onNext(ObjectHelper.requireNonNull(this.combiner.apply(t11, u11), "The combiner returned a null value"));
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    this.downstream.onError(th2);
                }
            }
            return false;
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(interfaceC44417c);
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(serializedSubscriber, this.combiner);
        serializedSubscriber.onSubscribe(withLatestFromSubscriber);
        this.other.subscribe(new FlowableWithLatestSubscriber(withLatestFromSubscriber));
        this.source.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }

    public FlowableWithLatestFrom(Flowable<T> flowable, BiFunction<? super T, ? super U, ? extends R> biFunction, InterfaceC44416b<? extends U> interfaceC44416b) {
        super(flowable);
        this.combiner = biFunction;
        this.other = interfaceC44416b;
    }
}
