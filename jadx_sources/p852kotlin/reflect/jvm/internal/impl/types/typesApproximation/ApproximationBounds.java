package p852kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ApproximationBounds<T> {
    private final T lower;
    private final T upper;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return Intrinsics.areEqual(this.lower, approximationBounds.lower) && Intrinsics.areEqual(this.upper, approximationBounds.upper);
    }

    public final T component1() {
        return this.lower;
    }

    public final T component2() {
        return this.upper;
    }

    public final T getLower() {
        return this.lower;
    }

    public final T getUpper() {
        return this.upper;
    }

    public int hashCode() {
        T t11 = this.lower;
        int iHashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.upper;
        return iHashCode + (t12 != null ? t12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApproximationBounds(lower=" + this.lower + ", upper=" + this.upper + ')';
    }

    public ApproximationBounds(T t11, T t12) {
        this.lower = t11;
        this.upper = t12;
    }
}
