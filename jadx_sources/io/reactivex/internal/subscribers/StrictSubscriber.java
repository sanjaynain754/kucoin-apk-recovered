package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, InterfaceC44418d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final InterfaceC44417c<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<InterfaceC44418d> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        this.done = true;
        HalfSerializer.onError(this.downstream, th2, this, this.error);
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        HalfSerializer.onNext(this.downstream, t11, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, interfaceC44418d);
        } else {
            interfaceC44418d.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        if (j11 > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j11);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j11));
    }

    public StrictSubscriber(InterfaceC44417c<? super T> interfaceC44417c) {
        this.downstream = interfaceC44417c;
    }
}
