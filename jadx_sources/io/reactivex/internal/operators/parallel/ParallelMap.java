package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelMap<T, R> extends ParallelFlowable<R> {
    final Function<? super T, ? extends R> mapper;
    final ParallelFlowable<T> source;

    public static final class ParallelMapConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, InterfaceC44418d {
        boolean done;
        final ConditionalSubscriber<? super R> downstream;
        final Function<? super T, ? extends R> mapper;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (this.done) {
                return false;
            }
            try {
                return this.downstream.tryOnNext(ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
                return false;
            }
        }

        public ParallelMapConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, ? extends R> function) {
            this.downstream = conditionalSubscriber;
            this.mapper = function;
        }
    }

    public static final class ParallelMapSubscriber<T, R> implements FlowableSubscriber<T>, InterfaceC44418d {
        boolean done;
        final InterfaceC44417c<? super R> downstream;
        final Function<? super T, ? extends R> mapper;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                this.downstream.onNext(ObjectHelper.requireNonNull(this.mapper.apply(t11), "The mapper returned a null value"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            this.upstream.request(j11);
        }

        public ParallelMapSubscriber(InterfaceC44417c<? super R> interfaceC44417c, Function<? super T, ? extends R> function) {
            this.downstream = interfaceC44417c;
            this.mapper = function;
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public ParallelMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends R> function) {
        this.source = parallelFlowable;
        this.mapper = function;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super R>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<? super T>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        for (int i11 = 0; i11 < length; i11++) {
            InterfaceC44417c<? super R> interfaceC44417c = interfaceC44417cArr[i11];
            if (interfaceC44417c instanceof ConditionalSubscriber) {
                interfaceC44417cArr2[i11] = new ParallelMapConditionalSubscriber((ConditionalSubscriber) interfaceC44417c, this.mapper);
            } else {
                interfaceC44417cArr2[i11] = new ParallelMapSubscriber(interfaceC44417c, this.mapper);
            }
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
