package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class UShortValue extends UnsignedValueConstant<Short> {
    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor module) {
        SimpleType defaultType;
        Intrinsics.checkNotNullParameter(module, "module");
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.uShort);
        return (classDescriptorFindClassAcrossModuleDependencies == null || (defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType()) == null) ? ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UShort") : defaultType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return getValue().intValue() + ".toUShort()";
    }

    public UShortValue(short s11) {
        super(Short.valueOf(s11));
    }
}
