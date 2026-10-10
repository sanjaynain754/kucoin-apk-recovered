package p852kotlin.reflect.jvm.internal.impl.p409km;

import org.jetbrains.annotations.NotNull;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import p852kotlin.reflect.jvm.internal.impl.p409km.internal.FlagImpl;

/* JADX INFO: compiled from: Modifiers.kt */
/* JADX INFO: loaded from: classes61.dex */
public enum Visibility {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final FlagImpl flag;

    @NotNull
    public static EnumEntries<Visibility> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }

    Visibility(int i11) {
        Flags.FlagField<ProtoBuf.Visibility> VISIBILITY = Flags.VISIBILITY;
        Intrinsics.checkNotNullExpressionValue(VISIBILITY, "VISIBILITY");
        this.flag = new FlagImpl(VISIBILITY, i11);
    }
}
