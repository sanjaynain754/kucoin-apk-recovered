package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ContextKt {
    @NotNull
    public static final LazyJavaResolverContext child(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull TypeParameterResolver typeParameterResolver) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), typeParameterResolver, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    private static final LazyJavaResolverContext child(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i11, Lazy<JavaTypeQualifiersByElementType> lazy) {
        return new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i11) : lazyJavaResolverContext.getTypeParameterResolver(), lazy);
    }

    @NotNull
    public static final LazyJavaResolverContext childForClassOrPackage(@NotNull final LazyJavaResolverContext lazyJavaResolverContext, @NotNull final ClassOrPackageFragmentDescriptor containingDeclaration, @Nullable JavaTypeParameterListOwner javaTypeParameterListOwner, int i11) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return child(lazyJavaResolverContext, containingDeclaration, javaTypeParameterListOwner, i11, LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0(lazyJavaResolverContext, containingDeclaration) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$0
            private final LazyJavaResolverContext arg$0;
            private final ClassOrPackageFragmentDescriptor arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return ContextKt.childForClassOrPackage$lambda$1(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = lazyJavaResolverContext;
                this.arg$1 = containingDeclaration;
            }
        }));
    }

    public static /* synthetic */ LazyJavaResolverContext childForClassOrPackage$default(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return childForClassOrPackage(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i11);
    }

    @NotNull
    public static final LazyJavaResolverContext childForMethod(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaTypeParameterListOwner typeParameterOwner, int i11) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        return child(lazyJavaResolverContext, containingDeclaration, typeParameterOwner, i11, lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    public static /* synthetic */ LazyJavaResolverContext childForMethod$default(LazyJavaResolverContext lazyJavaResolverContext, DeclarationDescriptor declarationDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return childForMethod(lazyJavaResolverContext, declarationDescriptor, javaTypeParameterListOwner, i11);
    }

    @Nullable
    public static final JavaTypeQualifiersByElementType computeNewDefaultTypeQualifiers(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull Annotations additionalAnnotations) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return lazyJavaResolverContext.getComponents().getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(lazyJavaResolverContext.getDefaultTypeQualifiers(), additionalAnnotations);
    }

    @NotNull
    public static final LazyJavaResolverContext copyWithNewDefaultTypeQualifiers(@NotNull final LazyJavaResolverContext lazyJavaResolverContext, @NotNull final Annotations additionalAnnotations) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? lazyJavaResolverContext : new LazyJavaResolverContext(lazyJavaResolverContext.getComponents(), lazyJavaResolverContext.getTypeParameterResolver(), LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0(lazyJavaResolverContext, additionalAnnotations) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$$Lambda$1
            private final LazyJavaResolverContext arg$0;
            private final Annotations arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return ContextKt.computeNewDefaultTypeQualifiers(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = lazyJavaResolverContext;
                this.arg$1 = additionalAnnotations;
            }
        }));
    }

    @NotNull
    public static final LazyJavaResolverContext replaceComponents(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull JavaResolverComponents components) {
        Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        return new LazyJavaResolverContext(components, lazyJavaResolverContext.getTypeParameterResolver(), lazyJavaResolverContext.getDelegateForDefaultTypeQualifiers$descriptors_jvm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaTypeQualifiersByElementType childForClassOrPackage$lambda$1(LazyJavaResolverContext lazyJavaResolverContext, ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor) {
        return computeNewDefaultTypeQualifiers(lazyJavaResolverContext, classOrPackageFragmentDescriptor.getAnnotations());
    }
}
