package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p852kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p852kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: AnnotationAndConstantLoaderImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class AnnotationAndConstantLoaderImpl extends AbstractAnnotationLoader<AnnotationDescriptor> implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    @NotNull
    private final AnnotationDeserializer deserializer;

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> loadAnnotationDefaultValue(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor module, @NotNull NotFoundClasses notFoundClasses, @NotNull SerializerExtensionProtocol protocol) {
        super(protocol);
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.deserializer = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    public AnnotationDescriptor loadAnnotation(@NotNull ProtoBuf.Annotation proto, @NotNull NameResolver nameResolver) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        return this.deserializer.deserializeAnnotation(proto, nameResolver);
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    public ConstantValue<?> loadPropertyConstant(@NotNull ProtoContainer container, @NotNull ProtoBuf.Property proto, @NotNull KotlinType expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.getExtensionOrNull(proto, getProtocol().getCompileTimeValue());
        if (value == null) {
            return null;
        }
        return this.deserializer.resolveValue(expectedType, value, container.getNameResolver());
    }
}
