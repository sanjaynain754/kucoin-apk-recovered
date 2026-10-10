package com.sumsub.sns.internal.features.presentation.result;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32378r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65962a;

    static {
        int[] iArr = new int[SNSFinishResultType.values().length];
        try {
            iArr[SNSFinishResultType.SUBMITTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSFinishResultType.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSFinishResultType.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f65962a = iArr;
    }
}
