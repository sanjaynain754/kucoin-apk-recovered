package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: PackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class PackageFragmentProviderKt {
    public static final void collectPackageFragmentsOptimizedIfPossible(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).collectPackageFragments(fqName, packageFragments);
        } else {
            packageFragments.addAll(packageFragmentProvider.getPackageFragments(fqName));
        }
    }

    public static final boolean isEmpty(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).isEmpty(fqName) : packageFragments(packageFragmentProvider, fqName).isEmpty();
    }

    @NotNull
    public static final List<PackageFragmentDescriptor> packageFragments(@NotNull PackageFragmentProvider packageFragmentProvider, @NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        collectPackageFragmentsOptimizedIfPossible(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}
