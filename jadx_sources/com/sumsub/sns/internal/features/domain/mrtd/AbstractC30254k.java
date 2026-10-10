package com.sumsub.sns.internal.features.domain.mrtd;

import com.sumsub.sns.internal.nfc.NfcResult$Failed$Reason;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.mrtd.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30254k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60824a;

    static {
        int[] iArr = new int[NfcResult$Failed$Reason.values().length];
        try {
            iArr[NfcResult$Failed$Reason.AUTH_FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NfcResult$Failed$Reason.TAG_WAS_LOST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f60824a = iArr;
    }
}
