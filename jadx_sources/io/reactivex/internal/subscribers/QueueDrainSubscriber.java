package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import sh0.InterfaceC44417c;

/* JADX INFO: loaded from: classes60.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final InterfaceC44417c<? super V> downstream;
    protected Throwable error;
    protected final SimplePlainQueue<U> queue;

    public boolean accept(InterfaceC44417c<? super V> interfaceC44417c, U u11) {
        return false;
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th2);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.requested.get();
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
        return this.wip.getAndIncrement() == 0;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        return this.wip.get() == 0 && this.wip.compareAndSet(0, 1);
    }

    public final void fastPathEmitMax(U u11, boolean z11, Disposable disposable) {
        InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j11 = this.requested.get();
            if (j11 == 0) {
                disposable.dispose();
                interfaceC44417c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else {
                if (accept(interfaceC44417c, u11) && j11 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            }
        } else {
            simplePlainQueue.offer(u11);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC44417c, z11, disposable, this);
    }

    public final void fastPathOrderedEmitMax(U u11, boolean z11, Disposable disposable) {
        InterfaceC44417c<? super V> interfaceC44417c = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j11 = this.requested.get();
            if (j11 == 0) {
                this.cancelled = true;
                disposable.dispose();
                interfaceC44417c.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            } else if (simplePlainQueue.isEmpty()) {
                if (accept(interfaceC44417c, u11) && j11 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                simplePlainQueue.offer(u11);
            }
        } else {
            simplePlainQueue.offer(u11);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, interfaceC44417c, z11, disposable, this);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int i11) {
        return this.wip.addAndGet(i11);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long j11) {
        return this.requested.addAndGet(-j11);
    }

    public final void requested(long j11) {
        if (SubscriptionHelper.validate(j11)) {
            BackpressureHelper.add(this.requested, j11);
        }
    }

    public QueueDrainSubscriber(InterfaceC44417c<? super V> interfaceC44417c, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = interfaceC44417c;
        this.queue = simplePlainQueue;
    }
}
