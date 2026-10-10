package p852kotlin.reflect.jvm.internal.impl.p409km.jvm.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmClass;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmConstructor;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmFunction;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmPackage;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmType;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.ExtensionNodesKt;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmClassExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmConstructorExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmFunctionExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPackageExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmPropertyExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeExtension;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions.KmTypeParameterExtension;

/* JADX INFO: compiled from: JvmExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JvmExtensionNodesKt {
    @NotNull
    public static final JvmClassExtension getJvm(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        KmClassExtension extension = ExtensionNodesKt.getExtension(kmClass, JvmClassExtension.Companion.getTYPE());
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmClassExtension");
        return (JvmClassExtension) extension;
    }

    @NotNull
    public static final JvmPackageExtension getJvm(@NotNull KmPackage kmPackage) {
        Intrinsics.checkNotNullParameter(kmPackage, "<this>");
        KmPackageExtension extension = ExtensionNodesKt.getExtension(kmPackage, JvmPackageExtension.TYPE);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmPackageExtension");
        return (JvmPackageExtension) extension;
    }

    @NotNull
    public static final JvmFunctionExtension getJvm(@NotNull KmFunction kmFunction) {
        Intrinsics.checkNotNullParameter(kmFunction, "<this>");
        KmFunctionExtension extension = ExtensionNodesKt.getExtension(kmFunction, JvmFunctionExtension.TYPE);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmFunctionExtension");
        return (JvmFunctionExtension) extension;
    }

    @NotNull
    public static final JvmPropertyExtension getJvm(@NotNull KmProperty kmProperty) {
        Intrinsics.checkNotNullParameter(kmProperty, "<this>");
        KmPropertyExtension extension = ExtensionNodesKt.getExtension(kmProperty, JvmPropertyExtension.TYPE);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmPropertyExtension");
        return (JvmPropertyExtension) extension;
    }

    @NotNull
    public static final JvmConstructorExtension getJvm(@NotNull KmConstructor kmConstructor) {
        Intrinsics.checkNotNullParameter(kmConstructor, "<this>");
        KmConstructorExtension extension = ExtensionNodesKt.getExtension(kmConstructor, JvmConstructorExtension.TYPE);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmConstructorExtension");
        return (JvmConstructorExtension) extension;
    }

    @NotNull
    public static final JvmTypeParameterExtension getJvm(@NotNull KmTypeParameter kmTypeParameter) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "<this>");
        KmTypeParameterExtension extension = ExtensionNodesKt.getExtension(kmTypeParameter, JvmTypeParameterExtension.TYPE);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeParameterExtension");
        return (JvmTypeParameterExtension) extension;
    }

    @NotNull
    public static final JvmTypeExtension getJvm(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<this>");
        KmTypeExtension extension = ExtensionNodesKt.getExtension(kmType, JvmTypeExtension.TYPE);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        return (JvmTypeExtension) extension;
    }
}
