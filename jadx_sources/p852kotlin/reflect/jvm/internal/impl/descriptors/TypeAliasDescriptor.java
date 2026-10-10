package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: TypeAliasDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface TypeAliasDescriptor extends ClassifierDescriptorWithTypeParameters {
    @Nullable
    ClassDescriptor getClassDescriptor();

    @NotNull
    SimpleType getExpandedType();

    @NotNull
    SimpleType getUnderlyingType();
}
