package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class BooleanValue extends ConstantValue<Boolean> {
    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType booleanType = module.getBuiltIns().getBooleanType();
        Intrinsics.checkNotNullExpressionValue(booleanType, "getBooleanType(...)");
        return booleanType;
    }

    public BooleanValue(boolean z11) {
        super(Boolean.valueOf(z11));
    }
}
