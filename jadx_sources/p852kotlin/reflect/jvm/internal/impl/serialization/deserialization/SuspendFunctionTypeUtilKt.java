package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p852kotlin.reflect.jvm.internal.impl.name.CallableId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: suspendFunctionTypeUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class SuspendFunctionTypeUtilKt {

    @JvmField
    @NotNull
    public static final FqName KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME = new FqName("kotlin.suspend");

    @JvmField
    @NotNull
    public static final CallableId KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME_CALLABLE_ID;

    static {
        FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier("suspend");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME_CALLABLE_ID = new CallableId(fqName, nameIdentifier);
    }
}
