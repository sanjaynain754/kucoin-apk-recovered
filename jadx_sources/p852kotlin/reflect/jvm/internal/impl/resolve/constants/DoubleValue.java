package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class DoubleValue extends ConstantValue<Double> {
    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType doubleType = module.getBuiltIns().getDoubleType();
        Intrinsics.checkNotNullExpressionValue(doubleType, "getDoubleType(...)");
        return doubleType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return getValue().doubleValue() + ".toDouble()";
    }

    public DoubleValue(double d11) {
        super(Double.valueOf(d11));
    }
}
