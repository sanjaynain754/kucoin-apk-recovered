package io.reactivex.internal.subscriptions;

import androidx.camera.view.C1454t;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public enum SubscriptionHelper implements InterfaceC44418d {
    CANCELLED;

    public static boolean setOnce(AtomicReference<InterfaceC44418d> atomicReference, InterfaceC44418d interfaceC44418d) {
        ObjectHelper.requireNonNull(interfaceC44418d, "s is null");
        if (C1454t.m2255a(atomicReference, null, interfaceC44418d)) {
            return true;
        }
        interfaceC44418d.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(InterfaceC44418d interfaceC44418d, InterfaceC44418d interfaceC44418d2) {
        if (interfaceC44418d2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC44418d == null) {
            return true;
        }
        interfaceC44418d2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // sh0.InterfaceC44418d
    public void cancel() {
    }

    public static boolean cancel(AtomicReference<InterfaceC44418d> atomicReference) {
        InterfaceC44418d andSet;
        InterfaceC44418d interfaceC44418d = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (interfaceC44418d == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void reportMoreProduced(long j11) {
        RxJavaPlugins.onError(new ProtocolViolationException("More produced than requested: " + j11));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static void deferredRequest(AtomicReference<InterfaceC44418d> atomicReference, AtomicLong atomicLong, long j11) {
        InterfaceC44418d interfaceC44418d = atomicReference.get();
        if (interfaceC44418d != null) {
            interfaceC44418d.request(j11);
            return;
        }
        if (validate(j11)) {
            BackpressureHelper.add(atomicLong, j11);
            InterfaceC44418d interfaceC44418d2 = atomicReference.get();
            if (interfaceC44418d2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    interfaceC44418d2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<InterfaceC44418d> atomicReference, AtomicLong atomicLong, InterfaceC44418d interfaceC44418d) {
        if (setOnce(atomicReference, interfaceC44418d)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC44418d.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<InterfaceC44418d> atomicReference, InterfaceC44418d interfaceC44418d) {
        InterfaceC44418d interfaceC44418d2;
        do {
            interfaceC44418d2 = atomicReference.get();
            if (interfaceC44418d2 == CANCELLED) {
                if (interfaceC44418d != null) {
                    interfaceC44418d.cancel();
                    return false;
                }
                return false;
            }
        } while (!C1454t.m2255a(atomicReference, interfaceC44418d2, interfaceC44418d));
        return true;
    }

    public static boolean set(AtomicReference<InterfaceC44418d> atomicReference, InterfaceC44418d interfaceC44418d) {
        InterfaceC44418d interfaceC44418d2;
        do {
            interfaceC44418d2 = atomicReference.get();
            if (interfaceC44418d2 == CANCELLED) {
                if (interfaceC44418d != null) {
                    interfaceC44418d.cancel();
                    return false;
                }
                return false;
            }
        } while (!C1454t.m2255a(atomicReference, interfaceC44418d2, interfaceC44418d));
        if (interfaceC44418d2 != null) {
            interfaceC44418d2.cancel();
            return true;
        }
        return true;
    }

    public static boolean validate(long j11) {
        if (j11 > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException("n > 0 required but it was " + j11));
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC44418d> atomicReference, InterfaceC44418d interfaceC44418d, long j11) {
        if (!setOnce(atomicReference, interfaceC44418d)) {
            return false;
        }
        interfaceC44418d.request(j11);
        return true;
    }

    @Override // sh0.InterfaceC44418d
    public void request(long j11) {
    }
}
