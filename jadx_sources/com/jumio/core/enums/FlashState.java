package com.jumio.core.enums;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/enums/FlashState;", "", "<init>", "(Ljava/lang/String;I)V", "UNAVAILABLE", "CHARGING", "READY", "FIRED", "PARTIAL", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum FlashState {
    UNAVAILABLE,
    CHARGING,
    READY,
    FIRED,
    PARTIAL;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/enums/FlashState$Companion;", "", "<init>", "()V", "fromCaptureRequest", "Lcom/jumio/core/enums/FlashState;", "value", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final FlashState fromCaptureRequest(int value) {
            if (value == 1) {
                return FlashState.CHARGING;
            }
            if (value == 2) {
                return FlashState.READY;
            }
            if (value != 3) {
                return value != 4 ? FlashState.UNAVAILABLE : FlashState.PARTIAL;
            }
            return FlashState.FIRED;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @NotNull
    public static EnumEntries<FlashState> getEntries() {
        return $ENTRIES;
    }
}
