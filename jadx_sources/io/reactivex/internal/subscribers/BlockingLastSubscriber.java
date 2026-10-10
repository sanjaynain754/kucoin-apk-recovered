package io.reactivex.internal.subscribers;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingLastSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        this.value = null;
        this.error = th2;
        countDown();
    }

    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        this.value = t11;
    }
}
