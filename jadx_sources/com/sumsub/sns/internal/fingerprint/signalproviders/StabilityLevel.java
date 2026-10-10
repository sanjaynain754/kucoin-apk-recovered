package com.sumsub.sns.internal.fingerprint.signalproviders;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, m90084d2 = {"Lcom/sumsub/sns/internal/fingerprint/signalproviders/StabilityLevel;", "", "<init>", "(Ljava/lang/String;I)V", "STABLE", "OPTIMAL", "UNIQUE", "atLeastAsStableAs", "", "other", "atLeastAsStableAs$idensic_mobile_sdk_aar_defaultRelease", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public enum StabilityLevel {
    STABLE,
    OPTIMAL,
    UNIQUE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<StabilityLevel> getEntries() {
        return $ENTRIES;
    }

    public final boolean atLeastAsStableAs$idensic_mobile_sdk_aar_defaultRelease(@NotNull StabilityLevel other) {
        int[] iArr = AbstractC33259a.f67801a;
        int i11 = iArr[ordinal()];
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            int i12 = iArr[other.ordinal()];
            if (i12 == 1) {
                return false;
            }
            if (i12 == 2 || i12 == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i13 = iArr[other.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return false;
        }
        if (i13 == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
