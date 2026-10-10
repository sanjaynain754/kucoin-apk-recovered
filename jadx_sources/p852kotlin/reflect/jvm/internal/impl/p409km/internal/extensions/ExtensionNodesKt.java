package p852kotlin.reflect.jvm.internal.impl.p409km.internal.extensions;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmClass;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmConstructor;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmFunction;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmPackage;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmProperty;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmType;
import p852kotlin.reflect.jvm.internal.impl.p409km.KmTypeParameter;

/* JADX INFO: compiled from: ExtensionNodes.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ExtensionNodesKt {
    @NotNull
    public static final KmClassExtension getExtension(@NotNull KmClass kmClass, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmClassExtension) singleOfType(kmClass.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmPackageExtension getExtension(@NotNull KmPackage kmPackage, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmPackage, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmPackageExtension) singleOfType(kmPackage.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmFunctionExtension getExtension(@NotNull KmFunction kmFunction, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmFunction, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmFunctionExtension) singleOfType(kmFunction.getExtensions$kotlin_metadata(), type);
    }

    private static final <N extends KmExtension> N singleOfType(Collection<? extends N> collection, KmExtensionType kmExtensionType) {
        N n11 = null;
        for (N n12 : collection) {
            if (Intrinsics.areEqual(n12.getType(), kmExtensionType)) {
                if (n11 == null) {
                    n11 = n12;
                } else {
                    throw new IllegalStateException("Multiple extensions handle the same extension type: " + kmExtensionType);
                }
            }
        }
        if (n11 != null) {
            return n11;
        }
        throw new IllegalStateException("No extensions handle the extension type: " + kmExtensionType);
    }

    @NotNull
    public static final KmPropertyExtension getExtension(@NotNull KmProperty kmProperty, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmProperty, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmPropertyExtension) singleOfType(kmProperty.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmConstructorExtension getExtension(@NotNull KmConstructor kmConstructor, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmConstructor, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmConstructorExtension) singleOfType(kmConstructor.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmTypeParameterExtension getExtension(@NotNull KmTypeParameter kmTypeParameter, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmTypeParameterExtension) singleOfType(kmTypeParameter.getExtensions$kotlin_metadata(), type);
    }

    @NotNull
    public static final KmTypeExtension getExtension(@NotNull KmType kmType, @NotNull KmExtensionType type) {
        Intrinsics.checkNotNullParameter(kmType, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return (KmTypeExtension) singleOfType(kmType.getExtensions$kotlin_metadata(), type);
    }
}
