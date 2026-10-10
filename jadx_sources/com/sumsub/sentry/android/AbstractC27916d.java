package com.sumsub.sentry.android;

/* JADX INFO: renamed from: com.sumsub.sentry.android.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC27916d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57022a;

    static {
        int[] iArr = new int[ConnectivityChecker$Status.values().length];
        try {
            iArr[ConnectivityChecker$Status.NOT_CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConnectivityChecker$Status.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f57022a = iArr;
    }
}
