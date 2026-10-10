package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p852kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {
    protected DeserializationComponents components;

    @NotNull
    private final KotlinMetadataFinder finder;

    @NotNull
    private final MemoizedFunctionToNullable<FqName, PackageFragmentDescriptor> fragments;

    @NotNull
    private final ModuleDescriptor moduleDescriptor;

    @NotNull
    private final StorageManager storageManager;

    @Nullable
    public abstract DeserializedPackageFragment findPackage(@NotNull FqName fqName);

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageFragmentDescriptor fragments$lambda$1(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider, FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        DeserializedPackageFragment deserializedPackageFragmentFindPackage = abstractDeserializedPackageFragmentProvider.findPackage(fqName);
        if (deserializedPackageFragmentFindPackage == null) {
            return null;
        }
        deserializedPackageFragmentFindPackage.initialize(abstractDeserializedPackageFragmentProvider.getComponents());
        return deserializedPackageFragmentFindPackage;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, this.fragments.invoke(fqName));
    }

    @NotNull
    public final DeserializationComponents getComponents() {
        DeserializationComponents deserializationComponents = this.components;
        if (deserializationComponents != null) {
            return deserializationComponents;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        return null;
    }

    @NotNull
    public final KotlinMetadataFinder getFinder() {
        return this.finder;
    }

    @NotNull
    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @NotNull
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return p852kotlin.collections.CollectionsKt.listOfNotNull(this.fragments.invoke(fqName));
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return SetsKt.emptySet();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (this.fragments.isComputed(fqName) ? this.fragments.invoke(fqName) : findPackage(fqName)) == null;
    }

    public final void setComponents(@NotNull DeserializationComponents deserializationComponents) {
        Intrinsics.checkNotNullParameter(deserializationComponents, "<set-?>");
        this.components = deserializationComponents;
    }

    public AbstractDeserializedPackageFragmentProvider(@NotNull StorageManager storageManager, @NotNull KotlinMetadataFinder finder, @NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        this.storageManager = storageManager;
        this.finder = finder;
        this.moduleDescriptor = moduleDescriptor;
        this.fragments = storageManager.createMemoizedFunctionWithNullableValues(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider$$Lambda$0
            private final AbstractDeserializedPackageFragmentProvider arg$0;

            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return AbstractDeserializedPackageFragmentProvider.fragments$lambda$1(this.arg$0, (FqName) obj);
            }

            {
                this.arg$0 = this;
            }
        });
    }
}
