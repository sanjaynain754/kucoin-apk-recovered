package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    volatile boolean cancelled;
    Throwable error;
    InterfaceC44418d upstream;
    T value;

    public BlockingBaseSubscriber() {
        super(1);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public final void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
            this.upstream = interfaceC44418d;
            if (this.cancelled) {
                return;
            }
            interfaceC44418d.request(Long.MAX_VALUE);
            if (this.cancelled) {
                this.upstream = SubscriptionHelper.CANCELLED;
                interfaceC44418d.cancel();
            }
        }
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e11) {
                InterfaceC44418d interfaceC44418d = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (interfaceC44418d != null) {
                    interfaceC44418d.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e11);
            }
        }
        Throwable th2 = this.error;
        if (th2 == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th2);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public final void onComplete() {
        countDown();
    }
}
