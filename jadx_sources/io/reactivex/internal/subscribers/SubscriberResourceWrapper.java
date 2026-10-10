package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class SubscriberResourceWrapper<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, Disposable, InterfaceC44418d {
    private static final long serialVersionUID = -8612022020200669122L;
    final InterfaceC44417c<? super T> downstream;
    final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.upstream);
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        this.downstream.onNext(t11);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.setOnce(this.upstream, interfaceC44418d)) {
            this.downstream.onSubscribe(this);
        }
    }

    public SubscriberResourceWrapper(InterfaceC44417c<? super T> interfaceC44417c) {
        this.downstream = interfaceC44417c;
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        dispose();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        DisposableHelper.dispose(this);
        this.downstream.onComplete();
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        DisposableHelper.dispose(this);
        this.downstream.onError(th2);
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        if (SubscriptionHelper.validate(j11)) {
            this.upstream.get().request(j11);
        }
    }

    public void setResource(Disposable disposable) {
        DisposableHelper.set(this, disposable);
    }
}
