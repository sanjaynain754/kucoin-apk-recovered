package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: ProtoBufUtil.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ProtoBufUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(@NotNull GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @NotNull GeneratedMessageLite.GeneratedExtension<M, T> extension) {
        Intrinsics.checkNotNullParameter(extendableMessage, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (extendableMessage.hasExtension(extension)) {
            return (T) extendableMessage.getExtension(extension);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M>, T> T getExtensionOrNull(@NotNull GeneratedMessageLite.ExtendableMessage<M> extendableMessage, @NotNull GeneratedMessageLite.GeneratedExtension<M, List<T>> extension, int i11) {
        Intrinsics.checkNotNullParameter(extendableMessage, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (i11 < extendableMessage.getExtensionCount(extension)) {
            return (T) extendableMessage.getExtension(extension, i11);
        }
        return null;
    }
}
