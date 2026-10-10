package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p852kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: compiled from: ConstUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ConstUtilKt {
    public static final boolean canBeUsedForConstVal(@NotNull KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return ((KotlinBuiltIns.isPrimitiveType(kotlinType) || UnsignedTypes.isUnsignedType(kotlinType)) && !TypeUtils.isNullableType(kotlinType)) || KotlinBuiltIns.isString(kotlinType);
    }
}
