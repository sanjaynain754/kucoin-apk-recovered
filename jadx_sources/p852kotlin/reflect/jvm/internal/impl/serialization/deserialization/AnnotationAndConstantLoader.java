package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: AnnotationAndConstantLoader.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface AnnotationAndConstantLoader<A, C> extends AnnotationLoader<A> {
    @Nullable
    C loadAnnotationDefaultValue(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType);

    @Nullable
    C loadPropertyConstant(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType);
}
