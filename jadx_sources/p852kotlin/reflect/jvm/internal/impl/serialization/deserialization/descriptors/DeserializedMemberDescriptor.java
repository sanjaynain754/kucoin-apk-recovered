package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p852kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: compiled from: DeserializedMemberDescriptor.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface DeserializedMemberDescriptor extends DeserializedDescriptor, DescriptorWithContainerSource {
    @Nullable
    DeserializedContainerSource getContainerSource();

    @NotNull
    NameResolver getNameResolver();

    @NotNull
    MessageLite getProto();

    @NotNull
    TypeTable getTypeTable();
}
