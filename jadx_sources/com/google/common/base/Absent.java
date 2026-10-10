package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Absent<T> extends Optional<T> {
    static final Absent<Object> INSTANCE = new Absent<>();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo13368or(T t11) {
        return (T) Preconditions.checkNotNull(t11, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return null;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static <T> Optional<T> withType() {
        return INSTANCE;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.EMPTY_SET;
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public Optional<T> mo13366or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    private Absent() {
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    /* JADX INFO: renamed from: or */
    public T mo13367or(Supplier<? extends T> supplier) {
        return (T) Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(Function<? super T, V> function) {
        Preconditions.checkNotNull(function);
        return Optional.absent();
    }
}
