package p852kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Modality.kt */
/* JADX INFO: loaded from: classes61.dex */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: Modality.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final Modality convertFromFlags(boolean z11, boolean z12, boolean z13) {
            if (z11) {
                return Modality.SEALED;
            }
            if (z12) {
                return Modality.ABSTRACT;
            }
            return z13 ? Modality.OPEN : Modality.FINAL;
        }
    }
}
