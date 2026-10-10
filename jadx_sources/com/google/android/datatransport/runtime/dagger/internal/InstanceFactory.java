package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {
    private static final InstanceFactory<Object> NULL_INSTANCE_FACTORY = new InstanceFactory<>(null);
    private final T instance;

    public static <T> Factory<T> create(T t11) {
        return new InstanceFactory(Preconditions.checkNotNull(t11, "instance cannot be null"));
    }

    public static <T> Factory<T> createNullable(T t11) {
        return t11 == null ? nullInstanceFactory() : new InstanceFactory(t11);
    }

    private static <T> InstanceFactory<T> nullInstanceFactory() {
        return (InstanceFactory<T>) NULL_INSTANCE_FACTORY;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, javax.inject.Provider
    public T get() {
        return this.instance;
    }

    private InstanceFactory(T t11) {
        this.instance = t11;
    }
}
