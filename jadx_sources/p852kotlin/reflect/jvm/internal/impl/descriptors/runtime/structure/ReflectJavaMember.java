package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import p852kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import p852kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.name.SpecialNames;

/* JADX INFO: compiled from: ReflectJavaMember.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nReflectJavaMember.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaMember.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaMember\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
public abstract class ReflectJavaMember extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaMember {
    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @NotNull
    public abstract Member getMember();

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaMember) && Intrinsics.areEqual(getMember(), ((ReflectJavaMember) obj).getMember());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> annotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? CollectionsKt.emptyList() : annotations;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    @NotNull
    public ReflectJavaClass getContainingClass() {
        Class<?> declaringClass = getMember().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return new ReflectJavaClass(declaringClass);
    }

    @NotNull
    public final List<JavaValueParameter> getValueParameters(@NotNull Type[] parameterTypes, @NotNull Annotation[][] parameterAnnotations, boolean z11) {
        String str;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List<String> listLoadParameterNames = Java8ParameterNamesLoader.INSTANCE.loadParameterNames(getMember());
        int size = listLoadParameterNames != null ? listLoadParameterNames.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i11 = 0;
        while (i11 < length) {
            ReflectJavaType reflectJavaTypeCreate = ReflectJavaType.Factory.create(parameterTypes[i11]);
            if (listLoadParameterNames != null) {
                str = (String) CollectionsKt.getOrNull(listLoadParameterNames, i11 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i11 + '+' + size + " (name=" + getName() + " type=" + reflectJavaTypeCreate + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new ReflectJavaValueParameter(reflectJavaTypeCreate, parameterAnnotations[i11], str, z11 && i11 == ArraysKt.getLastIndex(parameterTypes)));
            i11++;
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return getClass().getName() + ": " + getMember();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public AnnotatedElement getElement() {
        Member member = getMember();
        Intrinsics.checkNotNull(member, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) member;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return getMember().getModifiers();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        Name nameIdentifier;
        String name = getMember().getName();
        if (name != null && (nameIdentifier = Name.identifier(name)) != null) {
            return nameIdentifier;
        }
        return SpecialNames.NO_NAME_PROVIDED;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.INSTANCE;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.INSTANCE;
        }
        if (Modifier.isProtected(modifiers)) {
            if (Modifier.isStatic(modifiers)) {
                return JavaVisibilities.ProtectedStaticVisibility.INSTANCE;
            }
            return JavaVisibilities.ProtectedAndPackage.INSTANCE;
        }
        return JavaVisibilities.PackageVisibility.INSTANCE;
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }
}
