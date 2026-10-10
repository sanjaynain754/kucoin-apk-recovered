package com.sumsub.sns.internal.features.presentation.sumsubid;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32530i0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f66358a;

    static {
        int[] iArr = new int[SNSSumsubIdStep.values().length];
        try {
            iArr[SNSSumsubIdStep.ENTER_EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSSumsubIdStep.DATA_SELECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSSumsubIdStep.NO_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SNSSumsubIdStep.AGREEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SNSSumsubIdStep.WEB_VIEW_ACCOUNT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f66358a = iArr;
    }
}
