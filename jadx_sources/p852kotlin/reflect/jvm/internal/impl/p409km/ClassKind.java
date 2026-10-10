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
public enum ClassKind {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final FlagImpl flag;

    @NotNull
    public static EnumEntries<ClassKind> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final FlagImpl getFlag$kotlin_metadata() {
        return this.flag;
    }

    ClassKind(int i11) {
        Flags.FlagField<ProtoBuf.Class.Kind> CLASS_KIND = Flags.CLASS_KIND;
        Intrinsics.checkNotNullExpressionValue(CLASS_KIND, "CLASS_KIND");
        this.flag = new FlagImpl(CLASS_KIND, i11);
    }
}
