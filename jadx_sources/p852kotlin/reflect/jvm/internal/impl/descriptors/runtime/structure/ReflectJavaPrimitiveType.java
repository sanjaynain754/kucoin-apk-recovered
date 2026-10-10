package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: ReflectJavaPrimitiveType.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectJavaPrimitiveType extends ReflectJavaType implements JavaPrimitiveType {

    @NotNull
    private final Collection<JavaAnnotation> annotations;
    private final boolean isDeprecatedInJavaDoc;

    @NotNull
    private final Class<?> reflectType;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Class<?> getReflectType() {
        return this.reflectType;
    }

    public ReflectJavaPrimitiveType(@NotNull Class<?> reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.reflectType = reflectType;
        this.annotations = CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
    @Nullable
    public PrimitiveType getType() {
        if (Intrinsics.areEqual(getReflectType(), Void.TYPE)) {
            return null;
        }
        return JvmPrimitiveType.get(getReflectType().getName()).getPrimitiveType();
    }
}
