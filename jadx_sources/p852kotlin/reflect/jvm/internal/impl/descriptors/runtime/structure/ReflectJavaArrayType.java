package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;

/* JADX INFO: compiled from: ReflectJavaArrayType.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {

    @NotNull
    private final Collection<JavaAnnotation> annotations;

    @NotNull
    private final ReflectJavaType componentType;
    private final boolean isDeprecatedInJavaDoc;

    @NotNull
    private final Type reflectType;

    public ReflectJavaArrayType(@NotNull Type reflectType) {
        ReflectJavaType reflectJavaTypeCreate;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.reflectType = reflectType;
        Type reflectType2 = getReflectType();
        if (!(reflectType2 instanceof GenericArrayType)) {
            if (reflectType2 instanceof Class) {
                Class cls = (Class) reflectType2;
                if (cls.isArray()) {
                    ReflectJavaType.Factory factory = ReflectJavaType.Factory;
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    reflectJavaTypeCreate = factory.create(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + getReflectType().getClass() + "): " + getReflectType());
        }
        ReflectJavaType.Factory factory2 = ReflectJavaType.Factory;
        Type genericComponentType = ((GenericArrayType) reflectType2).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
        reflectJavaTypeCreate = factory2.create(genericComponentType);
        this.componentType = reflectJavaTypeCreate;
        this.annotations = CollectionsKt.emptyList();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public Collection<JavaAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType
    @NotNull
    public ReflectJavaType getComponentType() {
        return this.componentType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    @NotNull
    public Type getReflectType() {
        return this.reflectType;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }
}
