package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes61.dex */
public interface ValueDescriptor extends CallableDescriptor {
    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    DeclarationDescriptor getContainingDeclaration();

    @NotNull
    KotlinType getType();
}
