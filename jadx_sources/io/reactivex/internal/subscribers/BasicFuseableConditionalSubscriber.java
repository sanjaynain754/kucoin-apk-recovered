package io.reactivex.internal.subscribers;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public abstract class BasicFuseableConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, QueueSubscription<R> {
    protected boolean done;
    protected final ConditionalSubscriber<? super R> downstream;

    /* JADX INFO: renamed from: qs */
    protected QueueSubscription<T> f87202qs;
    protected int sourceMode;
    protected InterfaceC44418d upstream;

    public boolean beforeDownstream() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r11) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void cancel() {
        this.upstream.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        this.f87202qs.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.f87202qs.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r11, R r12) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // io.reactivex.internal.fuseable.ConditionalSubscriber, io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onError(Throwable th2) {
        if (this.done) {
            RxJavaPlugins.onError(th2);
        } else {
            this.done = true;
            this.downstream.onError(th2);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public final void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
            this.upstream = interfaceC44418d;
            if (interfaceC44418d instanceof QueueSubscription) {
                this.f87202qs = (QueueSubscription) interfaceC44418d;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, sh0.InterfaceC44418d
    public void request(long j11) {
        this.upstream.request(j11);
    }

    public final int transitiveBoundaryFusion(int i11) {
        QueueSubscription<T> queueSubscription = this.f87202qs;
        if (queueSubscription == null || (i11 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i11);
        if (iRequestFusion != 0) {
            this.sourceMode = iRequestFusion;
        }
        return iRequestFusion;
    }

    public BasicFuseableConditionalSubscriber(ConditionalSubscriber<? super R> conditionalSubscriber) {
        this.downstream = conditionalSubscriber;
    }

    public final void fail(Throwable th2) {
        Exceptions.throwIfFatal(th2);
        this.upstream.cancel();
        onError(th2);
    }

    public void afterDownstream() {
    }
}
