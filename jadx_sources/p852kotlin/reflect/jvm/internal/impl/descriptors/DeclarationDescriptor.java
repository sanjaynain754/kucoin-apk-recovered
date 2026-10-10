package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;

/* JADX INFO: loaded from: classes61.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11);

    @Nullable
    DeclarationDescriptor getContainingDeclaration();

    @NotNull
    DeclarationDescriptor getOriginal();
}
