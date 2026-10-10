package com.sumsub.sns.internal.fingerprint;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"com/sumsub/sns/internal/fingerprint/Fingerprinter$Version", "", "Lcom/sumsub/sns/internal/fingerprint/Fingerprinter$Version;", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "I", "getIntValue$idensic_mobile_sdk_aar_defaultRelease", "()I", "Companion", "com/sumsub/sns/internal/fingerprint/a", "V_4", "V_5", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum Fingerprinter$Version {
    V_4(4),
    V_5(5);

    private final int intValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static final C33060a Companion = new Object() { // from class: com.sumsub.sns.internal.fingerprint.a
    };

    @NotNull
    public static EnumEntries<Fingerprinter$Version> getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getIntValue$idensic_mobile_sdk_aar_defaultRelease, reason: from getter */
    public final int getIntValue() {
        return this.intValue;
    }

    Fingerprinter$Version(int i11) {
        this.intValue = i11;
    }
}
