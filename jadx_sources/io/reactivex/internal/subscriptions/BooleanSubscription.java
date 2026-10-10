package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class BooleanSubscription extends AtomicBoolean implements InterfaceC44418d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // sh0.InterfaceC44418d
    public void cancel() {
        lazySet(true);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
        SubscriptionHelper.validate(j11);
    }
}
