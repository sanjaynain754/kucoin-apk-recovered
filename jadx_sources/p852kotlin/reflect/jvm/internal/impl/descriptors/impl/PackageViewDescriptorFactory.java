package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import p852kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface PackageViewDescriptorFactory {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ModuleCapability<PackageViewDescriptorFactory> CAPABILITY = new ModuleCapability<>("PackageViewDescriptorFactory");

        @NotNull
        public final ModuleCapability<PackageViewDescriptorFactory> getCAPABILITY() {
            return CAPABILITY;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: PackageViewDescriptorFactory.kt */
    public static final class Default implements PackageViewDescriptorFactory {

        @NotNull
        public static final Default INSTANCE = new Default();

        @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        @NotNull
        public PackageViewDescriptor compute(@NotNull ModuleDescriptorImpl module, @NotNull FqName fqName, @NotNull StorageManager storageManager) {
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(module, fqName, storageManager);
        }

        private Default() {
        }
    }

    @NotNull
    PackageViewDescriptor compute(@NotNull ModuleDescriptorImpl moduleDescriptorImpl, @NotNull FqName fqName, @NotNull StorageManager storageManager);
}
