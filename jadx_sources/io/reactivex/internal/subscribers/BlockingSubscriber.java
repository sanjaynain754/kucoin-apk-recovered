package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class BlockingSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T>, InterfaceC44418d {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        this.queue.offer(NotificationLite.error(th2));
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        this.queue.offer(NotificationLite.next(t11));
    }

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        get().request(j11);
    }
}
