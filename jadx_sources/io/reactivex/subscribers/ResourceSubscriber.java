package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public abstract class ResourceSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    private final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
    private final ListCompositeDisposable resources = new ListCompositeDisposable();
    private final AtomicLong missedRequested = new AtomicLong();

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onNext(Object obj);

    public final void add(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "resource is null");
        this.resources.add(disposable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (SubscriptionHelper.cancel(this.upstream)) {
            this.resources.dispose();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: isDisposed */
    public final boolean getDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public final void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (EndConsumerHelper.setOnce(this.upstream, interfaceC44418d, getClass())) {
            long andSet = this.missedRequested.getAndSet(0L);
            if (andSet != 0) {
                interfaceC44418d.request(andSet);
            }
            onStart();
        }
    }

    public final void request(long j11) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j11);
    }

    public void onStart() {
        request(Long.MAX_VALUE);
    }
}
