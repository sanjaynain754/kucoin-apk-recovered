package p852kotlin.reflect.jvm.internal.impl.p409km.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KMutableProperty1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: FlagDelegatesImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nFlagDelegatesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlagDelegatesImpl.kt\nkotlin/metadata/internal/BooleanFlagDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
public final class BooleanFlagDelegate<Node> {

    @NotNull
    private final FlagImpl flag;

    @NotNull
    private final KMutableProperty1<Node, Integer> flags;
    private final int mask;

    public BooleanFlagDelegate(@NotNull KMutableProperty1<Node, Integer> flags, @NotNull FlagImpl flag) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(flag, "flag");
        this.flags = flags;
        this.flag = flag;
        if (flag.getBitWidth$kotlin_metadata() == 1 && flag.getValue$kotlin_metadata() == 1) {
            this.mask = 1 << flag.getOffset$kotlin_metadata();
            return;
        }
        throw new IllegalArgumentException(("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but " + flag + " was passed").toString());
    }

    public final boolean getValue(Node node, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.flag.invoke(this.flags.get(node).intValue());
    }

    public final void setValue(Node node, @NotNull KProperty<?> property, boolean z11) {
        Intrinsics.checkNotNullParameter(property, "property");
        int iIntValue = this.flags.get(node).intValue();
        this.flags.set(node, Integer.valueOf(z11 ? iIntValue | this.mask : iIntValue & (~this.mask)));
    }
}
