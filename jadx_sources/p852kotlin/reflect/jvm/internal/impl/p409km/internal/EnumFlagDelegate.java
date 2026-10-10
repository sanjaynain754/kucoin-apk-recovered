package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import java.lang.Enum;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KMutableProperty1;
import p852kotlin.reflect.KProperty;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* JADX INFO: compiled from: FlagDelegatesImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class EnumFlagDelegate<Node, E extends Enum<E>> {

    @NotNull
    private final EnumEntries<E> entries;

    @NotNull
    private final List<FlagImpl> flagValues;

    @NotNull
    private final KMutableProperty1<Node, Integer> flags;

    @NotNull
    private final Flags.FlagField<? extends Internal.EnumLite> protoSet;

    public EnumFlagDelegate(@NotNull KMutableProperty1<Node, Integer> flags, @NotNull Flags.FlagField<? extends Internal.EnumLite> protoSet, @NotNull EnumEntries<E> entries, @NotNull List<FlagImpl> flagValues) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(protoSet, "protoSet");
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(flagValues, "flagValues");
        this.flags = flags;
        this.protoSet = protoSet;
        this.entries = entries;
        this.flagValues = flagValues;
    }

    @NotNull
    public final E getValue(Node node, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.entries.get(this.protoSet.get(this.flags.get(node).intValue()).getNumber());
    }
}
