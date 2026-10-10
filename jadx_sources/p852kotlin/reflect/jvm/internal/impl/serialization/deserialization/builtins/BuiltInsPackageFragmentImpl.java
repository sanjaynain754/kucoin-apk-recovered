package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import p852kotlin.reflect.jvm.internal.impl.metadata.builtins.ReadPackageFragmentKt;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean isFallback;

    /* JADX INFO: compiled from: BuiltInsPackageFragmentImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final BuiltInsPackageFragmentImpl create(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor module, @NotNull InputStream inputStream, boolean z11) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> builtinsPackageFragment = ReadPackageFragmentKt.readBuiltinsPackageFragment(inputStream);
            ProtoBuf.PackageFragment packageFragmentComponent1 = builtinsPackageFragment.component1();
            BuiltInsBinaryVersion builtInsBinaryVersionComponent2 = builtinsPackageFragment.component2();
            if (packageFragmentComponent1 != null) {
                return new BuiltInsPackageFragmentImpl(fqName, storageManager, module, packageFragmentComponent1, builtInsBinaryVersionComponent2, z11, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + BuiltInsBinaryVersion.INSTANCE + ", actual " + builtInsBinaryVersionComponent2 + ". Please update Kotlin");
        }
    }

    public /* synthetic */ BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, z11);
    }

    private BuiltInsPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor moduleDescriptor, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion, boolean z11) {
        super(fqName, storageManager, moduleDescriptor, packageFragment, builtInsBinaryVersion, null);
        this.isFallback = z11;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, p852kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "builtins package fragment for " + getFqName() + " from " + DescriptorUtilsKt.getModule(this);
    }
}
