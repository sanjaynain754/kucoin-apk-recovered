package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectJavaClassObjectAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaClassObjectAnnotationArgument {

    @NotNull
    private final Class<?> klass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaClassObjectAnnotationArgument(@Nullable Name name, @NotNull Class<?> klass) {
        super(name, null);
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.klass = klass;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument
    @NotNull
    public JavaType getReferencedType() {
        return ReflectJavaType.Factory.create(this.klass);
    }
}
