package io.reactivex.internal.subscribers;

import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingFirstSubscriber<T> extends BlockingBaseSubscriber<T> {
    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        if (this.value == null) {
            this.error = th2;
        } else {
            RxJavaPlugins.onError(th2);
        }
        countDown();
    }

    @Override // io.reactivex.internal.subscribers.BlockingBaseSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (this.value == null) {
            this.value = t11;
            this.upstream.cancel();
            countDown();
        }
    }
}
