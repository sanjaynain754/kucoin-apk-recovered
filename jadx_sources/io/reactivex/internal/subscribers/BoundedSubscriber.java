package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.observers.LambdaConsumerIntrospection;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class BoundedSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T>, InterfaceC44418d, Disposable, LambdaConsumerIntrospection {
    private static final long serialVersionUID = -7251123623727029452L;
    final int bufferSize;
    int consumed;
    final int limit;
    final Action onComplete;
    final Consumer<? super Throwable> onError;
    final Consumer<? super T> onNext;
    final Consumer<? super InterfaceC44418d> onSubscribe;

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        return this.onError != Functions.ON_ERROR_MISSING;
    }

    public BoundedSubscriber(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super InterfaceC44418d> consumer3, int i11) {
        this.onNext = consumer;
        this.onError = consumer2;
        this.onComplete = action;
        this.onSubscribe = consumer3;
        this.bufferSize = i11;
        this.limit = i11 - (i11 >> 2);
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        cancel();
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public boolean getDisposed() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        InterfaceC44418d interfaceC44418d = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (interfaceC44418d != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        InterfaceC44418d interfaceC44418d = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (interfaceC44418d != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onError.accept(th2);
                return;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(th2, th3));
                return;
            }
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (!getDisposed()) {
            try {
                this.onNext.accept(t11);
                int i11 = this.consumed + 1;
                if (i11 == this.limit) {
                    this.consumed = 0;
                    get().request(this.limit);
                } else {
                    this.consumed = i11;
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                get().cancel();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                interfaceC44418d.cancel();
                onError(th2);
            }
        }
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        get().request(j11);
    }
}
