package p852kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Deprecated;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: PackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface PackageFragmentProvider {
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName);

    @NotNull
    Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> function1);
}
