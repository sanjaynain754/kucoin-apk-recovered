package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {
    final Consumer<? super T> onAfterNext;
    final Action onAfterTerminated;
    final Action onCancel;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;
    final LongConsumer onRequest;
    final Consumer<? super InterfaceC44418d> onSubscribe;
    final ParallelFlowable<T> source;

    public static final class ParallelPeekSubscriber<T> implements FlowableSubscriber<T>, InterfaceC44418d {
        boolean done;
        final InterfaceC44417c<? super T> downstream;
        final ParallelPeek<T> parent;
        InterfaceC44418d upstream;

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            try {
                this.parent.onCancel.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            try {
                this.parent.onComplete.run();
                this.downstream.onComplete();
                try {
                    this.parent.onAfterTerminated.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(th3);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            try {
                this.parent.onError.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.downstream.onError(th2);
            try {
                this.parent.onAfterTerminated.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            if (this.done) {
                return;
            }
            try {
                this.parent.onNext.accept(t11);
                this.downstream.onNext(t11);
                try {
                    this.parent.onAfterNext.accept(t11);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onSubscribe(InterfaceC44418d interfaceC44418d) {
            if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
                this.upstream = interfaceC44418d;
                try {
                    this.parent.onSubscribe.accept(interfaceC44418d);
                    this.downstream.onSubscribe(this);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    interfaceC44418d.cancel();
                    this.downstream.onSubscribe(EmptySubscription.INSTANCE);
                    onError(th2);
                }
            }
        }

        @Override // sh0.InterfaceC44418d
        public void request(long j11) {
            try {
                this.parent.onRequest.accept(j11);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
            this.upstream.request(j11);
        }

        public ParallelPeekSubscriber(InterfaceC44417c<? super T> interfaceC44417c, ParallelPeek<T> parallelPeek) {
            this.downstream = interfaceC44417c;
            this.parent = parallelPeek;
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    public ParallelPeek(ParallelFlowable<T> parallelFlowable, Consumer<? super T> consumer, Consumer<? super T> consumer2, Consumer<? super Throwable> consumer3, Action action, Action action2, Consumer<? super InterfaceC44418d> consumer4, LongConsumer longConsumer, Action action3) {
        this.source = parallelFlowable;
        this.onNext = (Consumer) ObjectHelper.requireNonNull(consumer, "onNext is null");
        this.onAfterNext = (Consumer) ObjectHelper.requireNonNull(consumer2, "onAfterNext is null");
        this.onError = (Consumer) ObjectHelper.requireNonNull(consumer3, "onError is null");
        this.onComplete = (Action) ObjectHelper.requireNonNull(action, "onComplete is null");
        this.onAfterTerminated = (Action) ObjectHelper.requireNonNull(action2, "onAfterTerminated is null");
        this.onSubscribe = (Consumer) ObjectHelper.requireNonNull(consumer4, "onSubscribe is null");
        this.onRequest = (LongConsumer) ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        this.onCancel = (Action) ObjectHelper.requireNonNull(action3, "onCancel is null");
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(InterfaceC44417c<? super T>[] interfaceC44417cArr) {
        if (!validate(interfaceC44417cArr)) {
            return;
        }
        int length = interfaceC44417cArr.length;
        InterfaceC44417c<? super T>[] interfaceC44417cArr2 = new InterfaceC44417c[length];
        for (int i11 = 0; i11 < length; i11++) {
            interfaceC44417cArr2[i11] = new ParallelPeekSubscriber(interfaceC44417cArr[i11], this);
        }
        this.source.subscribe(interfaceC44417cArr2);
    }
}
