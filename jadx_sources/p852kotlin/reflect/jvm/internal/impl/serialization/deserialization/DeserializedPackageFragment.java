package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.name.Name;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import p852kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: compiled from: DeserializedPackageFragment.kt */
/* JADX INFO: loaded from: classes61.dex */
public abstract class DeserializedPackageFragment extends PackageFragmentDescriptorImpl {

    @NotNull
    private final StorageManager storageManager;

    @NotNull
    public abstract ClassDataFinder getClassDataFinder();

    public abstract void initialize(@NotNull DeserializationComponents deserializationComponents);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragment(@NotNull FqName fqName, @NotNull StorageManager storageManager, @NotNull ModuleDescriptor module) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.storageManager = storageManager;
    }

    public boolean hasTopLevelClass(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScope = getMemberScope();
        return (memberScope instanceof DeserializedMemberScope) && ((DeserializedMemberScope) memberScope).getClassNames$deserialization().contains(name);
    }
}
