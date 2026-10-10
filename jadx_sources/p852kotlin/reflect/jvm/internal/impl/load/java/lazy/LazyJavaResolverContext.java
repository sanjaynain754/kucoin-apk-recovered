package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class LazyJavaResolverContext {

    @NotNull
    private final JavaResolverComponents components;

    @NotNull
    private final Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers;

    @NotNull
    private final TypeParameterResolver typeParameterResolver;

    @NotNull
    private final JavaTypeResolver typeResolver;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents components, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.components = components;
        this.typeParameterResolver = typeParameterResolver;
        this.delegateForDefaultTypeQualifiers = delegateForDefaultTypeQualifiers;
        this.typeResolver = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.components;
    }

    @Nullable
    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return this.delegateForDefaultTypeQualifiers.getValue();
    }

    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.components.getModule();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.typeResolver;
    }
}
