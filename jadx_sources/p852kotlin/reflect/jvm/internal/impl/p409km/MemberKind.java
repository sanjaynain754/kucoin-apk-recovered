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
public enum MemberKind {
    DECLARATION(0),
    FAKE_OVERRIDE(1),
    DELEGATION(2),
    SYNTHESIZED(3);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final FlagImpl flag;

    @NotNull
    public static EnumEntries<MemberKind> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }

    MemberKind(int i11) {
        Flags.FlagField<ProtoBuf.MemberKind> MEMBER_KIND = Flags.MEMBER_KIND;
        Intrinsics.checkNotNullExpressionValue(MEMBER_KIND, "MEMBER_KIND");
        this.flag = new FlagImpl(MEMBER_KIND, i11);
    }
}
