package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<InterfaceC44418d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        InterfaceC44418d andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i11 = 0; i11 < length; i11++) {
                InterfaceC44418d interfaceC44418d = get(i11);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (interfaceC44418d != subscriptionHelper && (andSet = getAndSet(i11, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }

    public ArrayCompositeSubscription(int i11) {
        super(i11);
    }

    public InterfaceC44418d replaceResource(int i11, InterfaceC44418d interfaceC44418d) {
        InterfaceC44418d interfaceC44418d2;
        do {
            interfaceC44418d2 = get(i11);
            if (interfaceC44418d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC44418d != null) {
                    interfaceC44418d.cancel();
                    return null;
                }
                return null;
            }
        } while (!compareAndSet(i11, interfaceC44418d2, interfaceC44418d));
        return interfaceC44418d2;
    }

    public boolean setResource(int i11, InterfaceC44418d interfaceC44418d) {
        InterfaceC44418d interfaceC44418d2;
        do {
            interfaceC44418d2 = get(i11);
            if (interfaceC44418d2 == SubscriptionHelper.CANCELLED) {
                if (interfaceC44418d != null) {
                    interfaceC44418d.cancel();
                    return false;
                }
                return false;
            }
        } while (!compareAndSet(i11, interfaceC44418d2, interfaceC44418d));
        if (interfaceC44418d2 != null) {
            interfaceC44418d2.cancel();
            return true;
        }
        return true;
    }
}
