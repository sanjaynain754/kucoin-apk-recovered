package com.sumsub.sns.internal.features.presentation.camera.video;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30767b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f62164a;

    static {
        int[] iArr = new int[SNSVideoSelfieViewModel$State.values().length];
        try {
            iArr[SNSVideoSelfieViewModel$State.Countdown.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SNSVideoSelfieViewModel$State.Recording.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SNSVideoSelfieViewModel$State.Done.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f62164a = iArr;
    }
}
