package com.google.firebase.components;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public class Lazy<T> implements Provider<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile Object instance;
    private volatile Provider<T> provider;

    public Lazy(T t11) {
        this.instance = UNINITIALIZED;
        this.instance = t11;
    }

    @Override // com.google.firebase.inject.Provider
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
                    this.instance = t11;
                    this.provider = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    @VisibleForTesting
    public boolean isInitialized() {
        return this.instance != UNINITIALIZED;
    }

    public Lazy(Provider<T> provider) {
        this.instance = UNINITIALIZED;
        this.provider = provider;
    }
}
