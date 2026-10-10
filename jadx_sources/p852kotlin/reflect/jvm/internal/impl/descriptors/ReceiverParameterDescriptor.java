package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import p852kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes61.dex */
public interface ReceiverParameterDescriptor extends ParameterDescriptor {
    @NotNull
    ReceiverValue getValue();

    @Override // p852kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    @Nullable
    ReceiverParameterDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
