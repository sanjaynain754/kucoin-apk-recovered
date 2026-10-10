package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: PackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface PackageFragmentProviderOptimized extends PackageFragmentProvider {
    void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> collection);

    boolean isEmpty(@NotNull FqName fqName);
}
