package p852kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: EmptyPackageFragmentDesciptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class EmptyPackageFragmentDescriptor extends PackageFragmentDescriptorImpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyPackageFragmentDescriptor(@NotNull ModuleDescriptor module, @NotNull FqName fqName) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public MemberScope.Empty getMemberScope() {
        return MemberScope.Empty.INSTANCE;
    }
}
