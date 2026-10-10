package com.sumsub.sns.internal.features.presentation.prooface;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.r0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC32136r0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f65420a;

    static {
        int[] iArr = new int[SNSLiveness3dFaceFragment.FaceViewState.values().length];
        try {
            iArr[SNSLiveness3dFaceFragment.FaceViewState.Recognizing.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSLiveness3dFaceFragment.FaceViewState.FaceDetected.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSLiveness3dFaceFragment.FaceViewState.Processing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SNSLiveness3dFaceFragment.FaceViewState.ScanComplete.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f65420a = iArr;
    }
}
