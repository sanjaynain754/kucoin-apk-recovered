package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: compiled from: resolvers.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* JADX INFO: renamed from: c */
    @NotNull
    private final LazyJavaResolverContext f91365c;

    @NotNull
    private final DeclarationDescriptor containingDeclaration;

    @NotNull
    private final MemoizedFunctionToNullable<JavaTypeParameter, LazyJavaTypeParameterDescriptor> resolve;

    @NotNull
    private final Map<JavaTypeParameter, Integer> typeParameters;
    private final int typeParametersIndexOffset;

    public LazyJavaTypeParameterResolver(@NotNull LazyJavaResolverContext c11, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaTypeParameterListOwner typeParameterOwner, int i11) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        this.f91365c = c11;
        this.containingDeclaration = containingDeclaration;
        this.typeParametersIndexOffset = i11;
        this.typeParameters = CollectionsKt.mapToIndex(typeParameterOwner.getTypeParameters());
        this.resolve = c11.getStorageManager().createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$$Lambda$0
            private final LazyJavaTypeParameterResolver arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return LazyJavaTypeParameterResolver.resolve$lambda$1(this.arg$0, (JavaTypeParameter) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    @Nullable
    public TypeParameterDescriptor resolveTypeParameter(@NotNull JavaTypeParameter javaTypeParameter) {
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptorInvoke = this.resolve.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptorInvoke != null ? lazyJavaTypeParameterDescriptorInvoke : this.f91365c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaTypeParameterDescriptor resolve$lambda$1(LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver, JavaTypeParameter typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Integer num = lazyJavaTypeParameterResolver.typeParameters.get(typeParameter);
        if (num != null) {
            return new LazyJavaTypeParameterDescriptor(ContextKt.copyWithNewDefaultTypeQualifiers(ContextKt.child(lazyJavaTypeParameterResolver.f91365c, lazyJavaTypeParameterResolver), lazyJavaTypeParameterResolver.containingDeclaration.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.typeParametersIndexOffset + num.intValue(), lazyJavaTypeParameterResolver.containingDeclaration);
        }
        return null;
    }
}
