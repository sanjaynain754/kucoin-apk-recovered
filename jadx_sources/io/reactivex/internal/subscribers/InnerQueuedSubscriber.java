package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<InterfaceC44418d> implements FlowableSubscriber<T>, InterfaceC44418d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    volatile SimpleQueue<T> queue;

    public void setDone() {
        this.done = true;
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        this.parent.innerError(this, th2);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onNext(T t11) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t11);
        } else {
            this.parent.drain();
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        if (this.fusionMode != 1) {
            long j12 = this.produced + j11;
            if (j12 < this.limit) {
                this.produced = j12;
            } else {
                this.produced = 0L;
                get().request(j12);
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j11 = this.produced + 1;
            if (j11 != this.limit) {
                this.produced = j11;
            } else {
                this.produced = 0L;
                get().request(j11);
            }
        }
    }

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i11) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i11;
        this.limit = i11 - (i11 >> 2);
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.setOnce(this, interfaceC44418d)) {
            if (interfaceC44418d instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) interfaceC44418d;
                int iRequestFusion = queueSubscription.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = queueSubscription;
                    QueueDrainHelper.request(interfaceC44418d, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(interfaceC44418d, this.prefetch);
        }
    }
}
