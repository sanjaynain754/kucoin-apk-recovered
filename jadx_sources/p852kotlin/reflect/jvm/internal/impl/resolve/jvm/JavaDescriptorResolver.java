package p852kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p852kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p852kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: JavaDescriptorResolver.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaDescriptorResolver {

    @NotNull
    private final JavaResolverCache javaResolverCache;

    @NotNull
    private final LazyJavaPackageFragmentProvider packageFragmentProvider;

    public JavaDescriptorResolver(@NotNull LazyJavaPackageFragmentProvider packageFragmentProvider, @NotNull JavaResolverCache javaResolverCache) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.packageFragmentProvider = packageFragmentProvider;
        this.javaResolverCache = javaResolverCache;
    }

    @NotNull
    public final LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    @Nullable
    public final ClassDescriptor resolveClass(@NotNull JavaClass javaClass) {
        LazyJavaPackageFragment lazyJavaPackageFragment;
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        FqName fqName = javaClass.getFqName();
        if (fqName != null && javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE) {
            return this.javaResolverCache.getClassResolvedFromSource(fqName);
        }
        JavaClass outerClass = javaClass.getOuterClass();
        if (outerClass == null) {
            if (fqName == null || (lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.firstOrNull((List) this.packageFragmentProvider.getPackageFragments(fqName.parent()))) == null) {
                return null;
            }
            return lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
        }
        ClassDescriptor classDescriptorResolveClass = resolveClass(outerClass);
        MemberScope unsubstitutedInnerClassesScope = classDescriptorResolveClass != null ? classDescriptorResolveClass.getUnsubstitutedInnerClassesScope() : null;
        ClassifierDescriptor classifierDescriptorMo105128getContributedClassifier = unsubstitutedInnerClassesScope != null ? unsubstitutedInnerClassesScope.mo105128getContributedClassifier(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
        if (classifierDescriptorMo105128getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo105128getContributedClassifier;
        }
        return null;
    }
}
