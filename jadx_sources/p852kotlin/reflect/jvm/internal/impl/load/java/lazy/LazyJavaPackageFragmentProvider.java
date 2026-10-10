package p852kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import p852kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import p852kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: compiled from: LazyJavaPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: c */
    @NotNull
    private final LazyJavaResolverContext f91364c;

    @NotNull
    private final CacheWithNotNullValues<FqName, LazyJavaPackageFragment> packageFragments;

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public /* bridge */ /* synthetic */ Collection getSubPackagesOf(FqName fqName, Function1 function1) {
        return getSubPackagesOf(fqName, (Function1<? super Name, Boolean>) function1);
    }

    public LazyJavaPackageFragmentProvider(@NotNull JavaResolverComponents components) {
        Intrinsics.checkNotNullParameter(components, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(components, TypeParameterResolver.EMPTY.INSTANCE, LazyKt.lazyOf(null));
        this.f91364c = lazyJavaResolverContext;
        this.packageFragments = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    private final LazyJavaPackageFragment getPackageFragment(FqName fqName) {
        final JavaPackage javaPackageFindPackage$default = JavaClassFinder$$Util.findPackage$default(this.f91364c.getComponents().getFinder(), fqName, false, 2, null);
        if (javaPackageFindPackage$default == null) {
            return null;
        }
        return this.packageFragments.computeIfAbsent(fqName, new Function0(this, javaPackageFindPackage$default) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider$$Lambda$0
            private final LazyJavaPackageFragmentProvider arg$0;
            private final JavaPackage arg$1;

            @Override // p852kotlin.jvm.functions.Function0
            public Object invoke() {
                return LazyJavaPackageFragmentProvider.getPackageFragment$lambda$0(this.arg$0, this.arg$1);
            }

            {
                this.arg$0 = this;
                this.arg$1 = javaPackageFindPackage$default;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyJavaPackageFragment getPackageFragment$lambda$0(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        return new LazyJavaPackageFragment(lazyJavaPackageFragmentProvider.f91364c, javaPackage);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, getPackageFragment(fqName));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List<LazyJavaPackageFragment> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return p852kotlin.collections.CollectionsKt.listOfNotNull(getPackageFragment(fqName));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public List<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        LazyJavaPackageFragment packageFragment = getPackageFragment(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = packageFragment != null ? packageFragment.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? p852kotlin.collections.CollectionsKt.emptyList() : subPackageFqNames$descriptors_jvm;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return JavaClassFinder$$Util.findPackage$default(this.f91364c.getComponents().getFinder(), fqName, false, 2, null) == null;
    }

    @NotNull
    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f91364c.getComponents().getModule();
    }
}
