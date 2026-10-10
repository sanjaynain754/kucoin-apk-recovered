package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance = UNINITIALIZED;
    private volatile Provider<T> provider;

    public static <P extends Provider<T>, T> Lazy<T> lazy(P p11) {
        return p11 instanceof Lazy ? (Lazy) p11 : new DoubleCheck((Provider) Preconditions.checkNotNull(p11));
    }

    private static Object reentrantCheck(Object obj, Object obj2) {
        if (obj == UNINITIALIZED || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t11;
        T t12 = (T) this.instance;
        Object obj = UNINITIALIZED;
        if (t12 != obj) {
            return t12;
        }
        synchronized (this) {
            try {
                t11 = (T) this.instance;
                if (t11 == obj) {
                    t11 = this.provider.get();
                    this.instance = reentrantCheck(this.instance, t11);
                    this.provider = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    private DoubleCheck(Provider<T> provider) {
        this.provider = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> provider(P p11) {
        Preconditions.checkNotNull(p11);
        if (p11 instanceof DoubleCheck) {
            return p11;
        }
        return new DoubleCheck(p11);
    }
}
