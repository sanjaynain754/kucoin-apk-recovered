package p852kotlin.reflect.jvm.internal.impl.load.kotlin;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p852kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: JavaFlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {

    @NotNull
    public static final JavaFlexibleTypeDeserializer INSTANCE = new JavaFlexibleTypeDeserializer();

    @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    @NotNull
    public KotlinType create(@NotNull ProtoBuf.Type proto, @NotNull String flexibleId, @NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        if (Intrinsics.areEqual(flexibleId, "kotlin.jvm.PlatformType")) {
            return proto.hasExtension(JvmProtoBuf.isRaw) ? new RawTypeImpl(lowerBound, upperBound) : KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        }
        return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }

    private JavaFlexibleTypeDeserializer() {
    }
}
