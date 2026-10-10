package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: ReflectJavaType.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class ReflectJavaType implements JavaType {

    @NotNull
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: compiled from: ReflectJavaType.kt */
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        @NotNull
        public final ReflectJavaType create(@NotNull Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z11 = type instanceof Class;
            if (z11) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new ReflectJavaPrimitiveType(cls);
                }
            }
            if (!(type instanceof GenericArrayType) && (!z11 || !((Class) type).isArray())) {
                if (type instanceof WildcardType) {
                    return new ReflectJavaWildcardType((WildcardType) type);
                }
                return new ReflectJavaClassifierType(type);
            }
            return new ReflectJavaArrayType(type);
        }
    }

    @NotNull
    public abstract Type getReflectType();

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaType) && Intrinsics.areEqual(getReflectType(), ((ReflectJavaType) obj).getReflectType());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public JavaAnnotation findAnnotation(FqName fqName) {
        Object obj;
        Object next;
        ClassId classId;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                classId = ((JavaAnnotation) next).getClassId();
            }
            return (JavaAnnotation) obj;
        } while (!Intrinsics.areEqual(classId != null ? classId.asSingleFqName() : null, fqName));
        obj = next;
        return (JavaAnnotation) obj;
    }

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + getReflectType();
    }

    public int hashCode() {
        return getReflectType().hashCode();
    }
}
