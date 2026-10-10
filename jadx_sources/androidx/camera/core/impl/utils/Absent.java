package androidx.camera.core.impl.utils;

import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes23.dex */
final class Absent<T> extends Optional<T> {
    static final Absent<Object> sInstance = new Absent<>();
    private static final long serialVersionUID = 0;

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    /* JADX INFO: renamed from: or */
    public T mo1973or(T t11) {
        return (T) Preconditions.checkNotNull(t11, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return null;
    }

    private Object readResolve() {
        return sInstance;
    }

    public static <T> Optional<T> withType() {
        return sInstance;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    /* JADX INFO: renamed from: or */
    public Optional<T> mo1971or(Optional<? extends T> optional) {
        return (Optional) Preconditions.checkNotNull(optional);
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public String toString() {
        return "Optional.absent()";
    }

    private Absent() {
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    /* JADX INFO: renamed from: or */
    public T mo1972or(Supplier<? extends T> supplier) {
        return (T) Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
