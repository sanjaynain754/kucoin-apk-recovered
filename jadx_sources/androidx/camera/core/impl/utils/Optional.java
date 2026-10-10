package androidx.camera.core.impl.utils;

import androidx.core.util.Preconditions;
import androidx.core.util.Supplier;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public abstract boolean equals(Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    /* JADX INFO: renamed from: or */
    public abstract Optional<T> mo1971or(Optional<? extends T> optional);

    /* JADX INFO: renamed from: or */
    public abstract T mo1972or(Supplier<? extends T> supplier);

    /* JADX INFO: renamed from: or */
    public abstract T mo1973or(T t11);

    public abstract T orNull();

    public abstract String toString();

    public static <T> Optional<T> fromNullable(T t11) {
        return t11 == null ? absent() : new Present(t11);
    }

    /* JADX INFO: renamed from: of */
    public static <T> Optional<T> m1977of(T t11) {
        return new Present(Preconditions.checkNotNull(t11));
    }

    public static <T> Optional<T> absent() {
        return Absent.withType();
    }
}
