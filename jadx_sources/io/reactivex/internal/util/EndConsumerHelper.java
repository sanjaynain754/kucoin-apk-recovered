package io.reactivex.internal.util;

import androidx.camera.view.C1454t;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import sh0.InterfaceC44418d;

/* JADX INFO: loaded from: classes60.dex */
public final class EndConsumerHelper {
    public static boolean setOnce(AtomicReference<Disposable> atomicReference, Disposable disposable, Class<?> cls) {
        ObjectHelper.requireNonNull(disposable, "next is null");
        if (C1454t.m2255a(atomicReference, null, disposable)) {
            return true;
        }
        disposable.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean validate(Disposable disposable, Disposable disposable2, Class<?> cls) {
        ObjectHelper.requireNonNull(disposable2, "next is null");
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        if (disposable == DisposableHelper.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static String composeMessage(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void reportDoubleSubscription(Class<?> cls) {
        RxJavaPlugins.onError(new ProtocolViolationException(composeMessage(cls.getName())));
    }

    private EndConsumerHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean validate(InterfaceC44418d interfaceC44418d, InterfaceC44418d interfaceC44418d2, Class<?> cls) {
        ObjectHelper.requireNonNull(interfaceC44418d2, "next is null");
        if (interfaceC44418d == null) {
            return true;
        }
        interfaceC44418d2.cancel();
        if (interfaceC44418d == SubscriptionHelper.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC44418d> atomicReference, InterfaceC44418d interfaceC44418d, Class<?> cls) {
        ObjectHelper.requireNonNull(interfaceC44418d, "next is null");
        if (C1454t.m2255a(atomicReference, null, interfaceC44418d)) {
            return true;
        }
        interfaceC44418d.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }
}
