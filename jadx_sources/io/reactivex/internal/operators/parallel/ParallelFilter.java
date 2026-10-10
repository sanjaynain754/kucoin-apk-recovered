package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelFilter<T> extends ParallelFlowable<T> {
    final Predicate<? super T> predicate;
    final ParallelFlowable<T> source;

    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, InterfaceC44418d {
        boolean done;
        final Predicate<? super T> predicate;
        InterfaceC44418d upstream;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public abstract /* synthetic */ void onComplete();

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public abstract /* synthetic */ void onError(Throwable th2);

        @Override // sh0.InterfaceC44418d
        public final void cancel() {
            this.upstream.cancel();
        }

        @Override // sh0.InterfaceC44418d
        public final void request(long j11) {
            this.upstream.request(j11);
        }

        public BaseFilterSubscriber(Predicate<? super T> predicate) {
            this.predicate = predicate;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public final void onNext(T t11) {
            if (!tryOnNext(t11) && !this.done) {
                this.upstream.request(1L);
            }
        }
    }

    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {
        final ConditionalSubscriber<? super T> downstream;

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (!this.done) {
                try {
                    if (this.predicate.test(t11)) {
                        return this.downstream.tryOnNext(t11);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }

        public ParallelFilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(predicate);
            this.downstream = conditionalSubscriber;
        }
    }

    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {
        final InterfaceC44417c<? super T> downstream;

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber, io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T t11) {
            if (!this.done) {
                try {
                    if (this.predicate.test(t11)) {
                        this.downstream.onNext(t11);
                        return true;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cancel();
                    onError(th2);
                }
            }
            return false;
        }

        public ParallelFilterSubscriber(InterfaceC44417c<? super T> interfaceC44417c, Predicate<? super T> predicate) {
            super(predicate);
            this.downstream = interfaceC44417c;
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public ParallelFilter(ParallelFlowable<T> parallelFlowable, Predicate<? super T> predicate) {
        this.source = parallelFlowable;
        this.predicate = predicate;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super T>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<? super T>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        for (int i11 = 0; i11 < length; i11++) {
            InterfaceC44417c<? super T> interfaceC44417c = interfaceC44417cArr[i11];
            if (interfaceC44417c instanceof ConditionalSubscriber) {
                interfaceC44417cArr2[i11] = new ParallelFilterConditionalSubscriber((ConditionalSubscriber) interfaceC44417c, this.predicate);
            } else {
                interfaceC44417cArr2[i11] = new ParallelFilterSubscriber(interfaceC44417c, this.predicate);
            }
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
