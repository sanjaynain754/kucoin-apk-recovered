package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class AsyncSubscription extends AtomicLong implements InterfaceC44418d, Disposable {
    private static final long serialVersionUID = 7028635084060361255L;
    final AtomicReference<InterfaceC44418d> actual;
    final AtomicReference<Disposable> resource;

    public AsyncSubscription() {
        this.resource = new AtomicReference<>();
        this.actual = new AtomicReference<>();
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this.actual);
        DisposableHelper.dispose(this.resource);
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.actual.get() == SubscriptionHelper.CANCELLED;
    }

    public boolean replaceResource(Disposable disposable) {
        return DisposableHelper.replace(this.resource, disposable);
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        SubscriptionHelper.deferredRequest(this.actual, this, j11);
    }

    public boolean setResource(Disposable disposable) {
        return DisposableHelper.set(this.resource, disposable);
    }

    public void setSubscription(InterfaceC44418d interfaceC44418d) {
        SubscriptionHelper.deferredSetOnce(this.actual, this, interfaceC44418d);
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        dispose();
    }

    public AsyncSubscription(Disposable disposable) {
        this();
        this.resource.lazySet(disposable);
    }
}
