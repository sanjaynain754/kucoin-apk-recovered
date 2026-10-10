package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableWithLatestFromMany<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super Object[], R> combiner;

    @Nullable
    final InterfaceC44416b<?>[] otherArray;

    @Nullable
    final Iterable<? extends InterfaceC44416b<?>> otherIterable;

    public final class SingletonArrayFunc implements Function<T, R> {
        public SingletonArrayFunc() {
        }

        @Override // io.reactivex.functions.Function
        public R apply(T t11) throws Exception {
            return (R) ObjectHelper.requireNonNull(FlowableWithLatestFromMany.this.combiner.apply(new Object[]{t11}), "The combiner returned a null value");
        }
    }

    public static final class WithLatestFromSubscriber<T, R> extends AtomicInteger implements ConditionalSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 1577321883966341961L;
        final Function<? super Object[], R> combiner;
        volatile boolean done;
        final InterfaceC44417c<? super R> downstream;
        final AtomicThrowable error;
        final AtomicLong requested;
        final WithLatestInnerSubscriber[] subscribers;
        final AtomicReference<InterfaceC44418d> upstream;
        final AtomicReferenceArray<Object> values;

        public void innerError(int i11, Throwable th2) {
            this.done = true;
            SubscriptionHelper.cancel(this.upstream);
            cancelAllBut(i11);
            HalfSerializer.onError(this.downstream, th2, this, this.error);
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            for (WithLatestInnerSubscriber withLatestInnerSubscriber : this.subscribers) {
                withLatestInnerSubscriber.dispose();
            }
        }

        public void cancelAllBut(int i11) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.subscribers;
            for (int i12 = 0; i12 < withLatestInnerSubscriberArr.length; i12++) {
                if (i12 != i11) {
                    withLatestInnerSubscriberArr[i12].dispose();
                }
            }
        }

        public void innerComplete(int i11, boolean z11) {
            if (z11) {
                return;
            }
            this.done = true;
            SubscriptionHelper.cancel(this.upstream);
            cancelAllBut(i11);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        public void innerNext(int i11, Object obj) {
            this.values.set(i11, obj);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            HalfSerializer.onComplete(this.downstream, this, this.error);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            HalfSerializer.onError(this.downstream, th2, this, this.error);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
        }

        public void subscribe(InterfaceC44416b<?>[] interfaceC44416bArr, int i11) {
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = this.subscribers;
            AtomicReference<InterfaceC44418d> atomicReference = this.upstream;
            for (int i12 = 0; i12 < i11 && atomicReference.get() != SubscriptionHelper.CANCELLED; i12++) {
                interfaceC44416bArr[i12].subscribe(withLatestInnerSubscriberArr[i12]);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (this.done) {
                return false;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = t11;
            int i11 = 0;
            while (i11 < length) {
                Object obj = atomicReferenceArray.get(i11);
                if (obj == null) {
                    return false;
                }
                i11++;
                objArr[i11] = obj;
            }
            try {
                HalfSerializer.onNext(this.downstream, ObjectHelper.requireNonNull(this.combiner.apply(objArr), "The combiner returned a null value"), this, this.error);
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        public WithLatestFromSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super Object[], R> function, int i11) {
            this.downstream = interfaceC44417c;
            this.combiner = function;
            WithLatestInnerSubscriber[] withLatestInnerSubscriberArr = new WithLatestInnerSubscriber[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                withLatestInnerSubscriberArr[i12] = new WithLatestInnerSubscriber(this, i12);
            }
            this.subscribers = withLatestInnerSubscriberArr;
            this.values = new AtomicReferenceArray<>(i11);
            this.upstream = new AtomicReference<>();
            this.requested = new AtomicLong();
            this.error = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (!tryOnNext(t11) && !this.done) {
                this.upstream.get().request(1L);
            }
        }
    }

    public static final class WithLatestInnerSubscriber extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final WithLatestFromSubscriber<?, ?> parent;

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        public WithLatestInnerSubscriber(WithLatestFromSubscriber<?, ?> withLatestFromSubscriber, int i11) {
            this.parent = withLatestFromSubscriber;
            this.index = i11;
        }

        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            SubscriptionHelper.setOnce(this, interfaceC44418d, Long.MAX_VALUE);
        }
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull InterfaceC44416b<?>[] interfaceC44416bArr, Function<? super Object[], R> function) {
        super(flowable);
        this.otherArray = interfaceC44416bArr;
        this.otherIterable = null;
        this.combiner = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super R> interfaceC44417c) {
        int length;
        InterfaceC44416b<?>[] interfaceC44416bArr = this.otherArray;
        if (interfaceC44416bArr == null) {
            interfaceC44416bArr = new InterfaceC44416b[8];
            try {
                length = 0;
                for (InterfaceC44416b<?> interfaceC44416b : this.otherIterable) {
                    if (length == interfaceC44416bArr.length) {
                        interfaceC44416bArr = (InterfaceC44416b[]) Arrays.copyOf(interfaceC44416bArr, (length >> 1) + length);
                    }
                    int i11 = length + 1;
                    interfaceC44416bArr[length] = interfaceC44416b;
                    length = i11;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, interfaceC44417c);
                return;
            }
        } else {
            length = interfaceC44416bArr.length;
        }
        if (length == 0) {
            new FlowableMap(this.source, new SingletonArrayFunc()).subscribeActual(interfaceC44417c);
            return;
        }
        WithLatestFromSubscriber withLatestFromSubscriber = new WithLatestFromSubscriber(interfaceC44417c, this.combiner, length);
        interfaceC44417c.onSubscribe(withLatestFromSubscriber);
        withLatestFromSubscriber.subscribe(interfaceC44416bArr, length);
        this.source.subscribe((FlowableSubscriber) withLatestFromSubscriber);
    }

    public FlowableWithLatestFromMany(@NonNull Flowable<T> flowable, @NonNull Iterable<? extends InterfaceC44416b<?>> iterable, @NonNull Function<? super Object[], R> function) {
        super(flowable);
        this.otherArray = null;
        this.otherIterable = iterable;
        this.combiner = function;
    }
}
