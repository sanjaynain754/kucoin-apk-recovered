package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.name.FqName;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: PackageFragmentDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface PackageFragmentDescriptor extends ClassOrPackageFragmentDescriptor {
    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ModuleDescriptor getContainingDeclaration();

    @NotNull
    FqName getFqName();

    @NotNull
    MemberScope getMemberScope();
}
