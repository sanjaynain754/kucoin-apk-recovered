package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import sh0.InterfaceC44416b;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class FlowableUsing<T, D> extends Flowable<T> {
    final Consumer<? super D> disposer;
    final boolean eager;
    final Callable<? extends D> resourceSupplier;
    final Function<? super D, ? extends InterfaceC44416b<? extends T>> sourceSupplier;

    public static final class UsingSubscriber<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, InterfaceC44418d {
        private static final long serialVersionUID = 5904473792286235046L;
        final Consumer<? super D> disposer;
        final InterfaceC44417c<? super T> downstream;
        final boolean eager;
        final D resource;
        InterfaceC44418d upstream;

        public void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onComplete() {
            if (!this.eager) {
                this.downstream.onComplete();
                this.upstream.cancel();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
            this.upstream.cancel();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onError(Throwable th2) {
            if (!this.eager) {
                this.downstream.onError(th2);
                this.upstream.cancel();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th3) {
                    th = th3;
                    Exceptions.throwIfFatal(th);
                }
            }
            th = null;
            this.upstream.cancel();
            if (th != null) {
                this.downstream.onError(new CompositeException(th2, th));
            } else {
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
        public void onNext(T t11) {
            this.downstream.onNext(t11);
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

        public UsingSubscriber(InterfaceC44417c<? super T> interfaceC44417c, D d11, Consumer<? super D> consumer, boolean z11) {
            this.downstream = interfaceC44417c;
            this.resource = d11;
            this.disposer = consumer;
            this.eager = z11;
        }

        @Override // sh0.InterfaceC44418d
        public void cancel() {
            disposeAfter();
            this.upstream.cancel();
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(InterfaceC44417c<? super T> interfaceC44417c) {
        try {
            D dCall = this.resourceSupplier.call();
            try {
                ((InterfaceC44416b) ObjectHelper.requireNonNull(this.sourceSupplier.apply(dCall), "The sourceSupplier returned a null Publisher")).subscribe(new UsingSubscriber(interfaceC44417c, dCall, this.disposer, this.eager));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    this.disposer.accept(dCall);
                    EmptySubscription.error(th2, interfaceC44417c);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    EmptySubscription.error(new CompositeException(th2, th3), interfaceC44417c);
                }
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptySubscription.error(th4, interfaceC44417c);
        }
    }

    public FlowableUsing(Callable<? extends D> callable, Function<? super D, ? extends InterfaceC44416b<? extends T>> function, Consumer<? super D> consumer, boolean z11) {
        this.resourceSupplier = callable;
        this.sourceSupplier = function;
        this.disposer = consumer;
        this.eager = z11;
    }
}
