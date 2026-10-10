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
public enum Modality {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final FlagImpl flag;

    @NotNull
    public static EnumEntries<Modality> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }

    Modality(int i11) {
        Flags.FlagField<ProtoBuf.Modality> MODALITY = Flags.MODALITY;
        Intrinsics.checkNotNullExpressionValue(MODALITY, "MODALITY");
        this.flag = new FlagImpl(MODALITY, i11);
    }
}
