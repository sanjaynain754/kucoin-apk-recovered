package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes61.dex */
public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    @NotNull
    SimpleType getDefaultType();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ClassifierDescriptor getOriginal();

    @NotNull
    TypeConstructor getTypeConstructor();
}
