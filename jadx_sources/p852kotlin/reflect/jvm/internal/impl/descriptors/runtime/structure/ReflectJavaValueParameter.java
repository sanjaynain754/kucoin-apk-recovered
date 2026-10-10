package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: ReflectJavaValueParameter.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nReflectJavaValueParameter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaValueParameter.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaValueParameter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class ReflectJavaValueParameter extends ReflectJavaElement implements JavaValueParameter {
    private final boolean isVararg;

    @NotNull
    private final Annotation[] reflectAnnotations;

    @Nullable
    private final String reflectName;

    @NotNull
    private final ReflectJavaType type;

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public ReflectJavaAnnotation findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return ReflectJavaAnnotationOwnerKt.findAnnotation(this.reflectAnnotations, fqName);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        return ReflectJavaAnnotationOwnerKt.getAnnotations(this.reflectAnnotations);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    @Nullable
    public Name getName() {
        String str = this.reflectName;
        if (str != null) {
            return Name.guessByFirstCharacter(str);
        }
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    @NotNull
    public ReflectJavaType getType() {
        return this.type;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter
    public boolean isVararg() {
        return this.isVararg;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ReflectJavaValueParameter.class.getName());
        sb2.append(": ");
        sb2.append(isVararg() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    public ReflectJavaValueParameter(@NotNull ReflectJavaType type, @NotNull Annotation[] reflectAnnotations, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reflectAnnotations, "reflectAnnotations");
        this.type = type;
        this.reflectAnnotations = reflectAnnotations;
        this.reflectName = str;
        this.isVararg = z11;
    }
}
