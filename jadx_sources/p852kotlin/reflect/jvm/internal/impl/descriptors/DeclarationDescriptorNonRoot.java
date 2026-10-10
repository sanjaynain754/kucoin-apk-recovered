package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes61.dex */
public interface DeclarationDescriptorNonRoot extends DeclarationDescriptorWithSource {
    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    DeclarationDescriptor getContainingDeclaration();
}
