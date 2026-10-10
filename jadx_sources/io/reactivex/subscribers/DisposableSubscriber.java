package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    public void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public final void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (EndConsumerHelper.setOnce(this.upstream, interfaceC44418d, getClass())) {
            onStart();
        }
    }

    public final void request(long j11) {
        this.upstream.get().request(j11);
    }

    public final void cancel() {
        dispose();
    }
}
