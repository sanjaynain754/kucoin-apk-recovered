package p852kotlin.reflect.jvm.internal.impl.metadata.serialization;

import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: MutableTable.kt */
/* JADX INFO: loaded from: classes61.dex */
final class TableElementWrapper<Element extends GeneratedMessageLite.Builder<?, Element>> {

    @NotNull
    private final Element builder;

    @NotNull
    private final byte[] bytes;
    private final int hashCode;

    public TableElementWrapper(@NotNull Element builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        byte[] byteArray = builder.build().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        this.bytes = byteArray;
        this.hashCode = Arrays.hashCode(byteArray);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof TableElementWrapper) && Arrays.equals(this.bytes, ((TableElementWrapper) obj).bytes);
    }

    public int hashCode() {
        return this.hashCode;
    }
}
