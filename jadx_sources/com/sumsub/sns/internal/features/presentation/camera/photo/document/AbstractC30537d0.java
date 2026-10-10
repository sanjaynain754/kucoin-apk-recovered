package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30537d0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61663a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f61664b;

    static {
        int[] iArr = new int[CameraX$Mode.values().length];
        try {
            iArr[CameraX$Mode.PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f61663a = iArr;
        int[] iArr2 = new int[CheckDetectionResult$SizeCheckResult.values().length];
        try {
            iArr2[CheckDetectionResult$SizeCheckResult.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CheckDetectionResult$SizeCheckResult.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CheckDetectionResult$SizeCheckResult.BIG.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f61664b = iArr2;
    }
}
