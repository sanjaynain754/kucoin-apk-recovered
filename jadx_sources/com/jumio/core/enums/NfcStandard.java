package com.jumio.core.enums;

import java.util.Locale;
import jumio.core.AbstractC40509B2;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016j\u0002\b\u0004j\u0002\b\u0005¨\u0006\t"}, m90084d2 = {"Lcom/jumio/core/enums/NfcStandard;", "", "<init>", "(Ljava/lang/String;I)V", "ICAO9303", "UNDEFINED", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum NfcStandard {
    ICAO9303,
    UNDEFINED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/enums/NfcStandard$Companion;", "", "<init>", "()V", "fromString", "Lcom/jumio/core/enums/NfcStandard;", "value", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final NfcStandard fromString(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String upperCase = value.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return Intrinsics.areEqual(upperCase, "ICAO9303") ? NfcStandard.ICAO9303 : NfcStandard.UNDEFINED;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @NotNull
    public static EnumEntries<NfcStandard> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return AbstractC40509B2.f89926a[ordinal()] == 1 ? "ICAO9303" : "UNDEFINED";
    }
}
