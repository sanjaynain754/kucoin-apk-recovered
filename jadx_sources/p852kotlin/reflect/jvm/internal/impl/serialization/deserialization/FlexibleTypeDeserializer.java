package p852kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes61.dex */
public interface FlexibleTypeDeserializer {

    /* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
    public static final class ThrowException implements FlexibleTypeDeserializer {

        @NotNull
        public static final ThrowException INSTANCE = new ThrowException();

        @Override // p852kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        @NotNull
        public KotlinType create(@NotNull ProtoBuf.Type proto, @NotNull String flexibleId, @NotNull SimpleType lowerBound, @NotNull SimpleType upperBound) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }

        private ThrowException() {
        }
    }

    @NotNull
    KotlinType create(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2);
}
