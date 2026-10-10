package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class SafeSubscriber<T> implements FlowableSubscriber<T>, InterfaceC44418d {
    boolean done;
    final InterfaceC44417c<? super T> downstream;
    InterfaceC44418d upstream;

    public void onCompleteNoSubscription() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.downstream.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.downstream.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaPlugins.onError(th2);
            return;
        }
        this.done = true;
        if (this.upstream != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.downstream.onError(th2);
                return;
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.downstream.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.downstream.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            Exceptions.throwIfFatal(th5);
            RxJavaPlugins.onError(new CompositeException(th2, nullPointerException, th5));
        }
    }

    public void onNextNoSubscription() {
        this.done = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.downstream.onSubscribe(EmptySubscription.INSTANCE);
            try {
                this.downstream.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            RxJavaPlugins.onError(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        try {
            this.upstream.cancel();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        if (this.upstream == null) {
            onCompleteNoSubscription();
            return;
        }
        try {
            this.downstream.onComplete();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            RxJavaPlugins.onError(th2);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (this.done) {
            return;
        }
        if (this.upstream == null) {
            onNextNoSubscription();
            return;
        }
        if (t11 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.upstream.cancel();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        try {
            this.downstream.onNext(t11);
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            try {
                this.upstream.cancel();
                onError(th3);
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
            this.upstream = interfaceC44418d;
            try {
                this.downstream.onSubscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.done = true;
                try {
                    interfaceC44418d.cancel();
                    RxJavaPlugins.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        try {
            this.upstream.request(j11);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            try {
                this.upstream.cancel();
                RxJavaPlugins.onError(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                RxJavaPlugins.onError(new CompositeException(th2, th3));
            }
        }
    }

    public SafeSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
        this.downstream = interfaceC44417c;
    }
}
