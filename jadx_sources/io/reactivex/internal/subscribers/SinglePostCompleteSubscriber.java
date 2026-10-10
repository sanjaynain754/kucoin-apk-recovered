package io.reactivex.internal.subscribers;

import androidx.media3.common.C2711C;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import sh0.InterfaceC44417c;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, InterfaceC44418d {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final InterfaceC44417c<? super R> downstream;
    protected long produced;
    protected InterfaceC44418d upstream;
    protected R value;

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th2);

    public abstract /* synthetic */ void onNext(Object obj);

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r11) {
        long j11 = this.produced;
        if (j11 != 0) {
            BackpressureHelper.produced(this, j11);
        }
        while (true) {
            long j12 = get();
            if ((j12 & Long.MIN_VALUE) != 0) {
                onDrop(r11);
                return;
            }
            if ((j12 & Long.MAX_VALUE) != 0) {
                lazySet(C2711C.TIME_UNSET);
                this.downstream.onNext(r11);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r11;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, sh0.InterfaceC44417c
    public void onSubscribe(InterfaceC44418d interfaceC44418d) {
        if (SubscriptionHelper.validate(this.upstream, interfaceC44418d)) {
            this.upstream = interfaceC44418d;
            this.downstream.onSubscribe(this);
        }
    }

    public SinglePostCompleteSubscriber(InterfaceC44417c<? super R> interfaceC44417c) {
        this.downstream = interfaceC44417c;
    }

    @Override // sh0.InterfaceC44418d
    public final void request(long j11) {
        long j12;
        if (SubscriptionHelper.validate(j11)) {
            do {
                j12 = get();
                if ((j12 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, C2711C.TIME_UNSET)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j12, BackpressureHelper.addCap(j12, j11)));
            this.upstream.request(j11);
        }
    }

    public void onDrop(R r11) {
    }
}
