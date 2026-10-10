package com.sumsub.sns.internal.core.presentation.camera;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC28741g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f58445a;

    static {
        int[] iArr = new int[CameraX$Mode.values().length];
        try {
            iArr[CameraX$Mode.PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraX$Mode.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CameraX$Mode.ANALYZER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CameraX$Mode.PHOTO_AND_ANALYZER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CameraX$Mode.SEAMLESS_DOC_CAPTURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f58445a = iArr;
    }
}
