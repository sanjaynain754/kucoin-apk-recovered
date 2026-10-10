package com.sumsub.sns.internal.core.presentation.nfc;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.nfc.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28905j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58770a;

    static {
        int[] iArr = new int[NfcReadController$ReadingStep.values().length];
        try {
            iArr[NfcReadController$ReadingStep.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NfcReadController$ReadingStep.LISTENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NfcReadController$ReadingStep.READING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NfcReadController$ReadingStep.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NfcReadController$ReadingStep.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f58770a = iArr;
    }
}
