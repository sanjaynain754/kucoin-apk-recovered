package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX INFO: compiled from: FlagImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class FlagImpl {
    private final int bitWidth;
    private final int offset;
    private final int value;

    public FlagImpl(int i11, int i12, int i13) {
        this.offset = i11;
        this.bitWidth = i12;
        this.value = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.FlagField<?> field, int i11) {
        this(field.offset, field.bitWidth, i11);
        Intrinsics.checkNotNullParameter(field, "field");
    }

    public final int getBitWidth$kotlin_metadata() {
        return this.bitWidth;
    }

    public final int getOffset$kotlin_metadata() {
        return this.offset;
    }

    public final int getValue$kotlin_metadata() {
        return this.value;
    }

    public final boolean invoke(int i11) {
        return ((i11 >>> this.offset) & ((1 << this.bitWidth) - 1)) == this.value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlagImpl(@NotNull Flags.BooleanFlagField field) {
        this(field, 1);
        Intrinsics.checkNotNullParameter(field, "field");
    }
}
