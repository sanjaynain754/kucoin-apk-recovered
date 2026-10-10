package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;

/* JADX INFO: compiled from: ModuleClassResolver.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class SingleModuleClassResolver implements ModuleClassResolver {
    public JavaDescriptorResolver resolver;

    @NotNull
    public final JavaDescriptorResolver getResolver() {
        JavaDescriptorResolver javaDescriptorResolver = this.resolver;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("resolver");
        return null;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver
    @Nullable
    public ClassDescriptor resolveClass(@NotNull JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        return getResolver().resolveClass(javaClass);
    }

    public final void setResolver(@NotNull JavaDescriptorResolver javaDescriptorResolver) {
        Intrinsics.checkNotNullParameter(javaDescriptorResolver, "<set-?>");
        this.resolver = javaDescriptorResolver;
    }
}
