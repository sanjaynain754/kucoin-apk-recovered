package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC31901u {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f64837a;

    static {
        int[] iArr = new int[MrtdLayoutHandler$LayoutState.values().length];
        try {
            iArr[MrtdLayoutHandler$LayoutState.INTRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MrtdLayoutHandler$LayoutState.READING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MrtdLayoutHandler$LayoutState.RESULT_SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MrtdLayoutHandler$LayoutState.RESULT_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f64837a = iArr;
    }
}
