package p852kotlin.reflect.jvm.internal.impl.p409km;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.contracts.ExperimentalContracts;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Contracts.kt */
/* JADX INFO: loaded from: classes61.dex */
@ExperimentalContracts
public final class KmConstantValue {

    @Nullable
    private final Object value;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KmConstantValue) && Intrinsics.areEqual(this.value, ((KmConstantValue) obj).value);
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public String toString() {
        return "KmConstantValue(value=" + this.value + ')';
    }

    public KmConstantValue(@Nullable Object obj) {
        this.value = obj;
    }
}
