package com.sumsub.sns.internal.fingerprint.signalproviders;

/* JADX INFO: renamed from: com.sumsub.sns.internal.fingerprint.signalproviders.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC33259a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f67801a;

    static {
        int[] iArr = new int[StabilityLevel.values().length];
        try {
            iArr[StabilityLevel.STABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StabilityLevel.OPTIMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StabilityLevel.UNIQUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f67801a = iArr;
    }
}
