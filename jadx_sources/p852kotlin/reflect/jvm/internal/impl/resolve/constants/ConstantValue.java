package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class ConstantValue<T> {
    private final T value;

    @NotNull
    public abstract KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor);

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        T value = getValue();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return Intrinsics.areEqual(value, constantValue != null ? constantValue.getValue() : null);
    }

    public T getValue() {
        return this.value;
    }

    public ConstantValue(T t11) {
        this.value = t11;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
