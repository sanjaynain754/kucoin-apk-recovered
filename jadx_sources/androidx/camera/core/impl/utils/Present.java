package androidx.camera.core.impl.utils;

import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes23.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T mReference;

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    /* JADX INFO: renamed from: or */
    public T mo1973or(T t11) {
        Preconditions.checkNotNull(t11, "use Optional.orNull() instead of Optional.or(null)");
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.mReference.equals(((Present) obj).mReference);
        }
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return this.mReference.hashCode() + 1502476572;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return this.mReference;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public String toString() {
        return "Optional.of(" + this.mReference + ")";
    }

    public Present(T t11) {
        this.mReference = t11;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    /* JADX INFO: renamed from: or */
    public Optional<T> mo1971or(Optional<? extends T> optional) {
        Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    /* JADX INFO: renamed from: or */
    public T mo1972or(Supplier<? extends T> supplier) {
        Preconditions.checkNotNull(supplier);
        return this.mReference;
    }
}
