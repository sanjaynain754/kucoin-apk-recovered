package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: ClassConstructorDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface ClassConstructorDescriptor extends ConstructorDescriptor {
    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    ClassConstructorDescriptor getOriginal();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    ClassConstructorDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
