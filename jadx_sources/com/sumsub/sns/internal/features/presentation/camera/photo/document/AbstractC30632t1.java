package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.core.presentation.camera.CameraX$Mode;
import com.sumsub.sns.internal.features.presentation.utils.SecondSideStep;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.t1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30632t1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61892a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f61893b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f61894c;

    static {
        int[] iArr = new int[SecondSideStep.values().length];
        try {
            iArr[SecondSideStep.RequestBackSide.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SecondSideStep.Prompt.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SecondSideStep.Proceed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f61892a = iArr;
        int[] iArr2 = new int[CameraX$Mode.values().length];
        try {
            iArr2[CameraX$Mode.PHOTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CameraX$Mode.SEAMLESS_DOC_CAPTURE_LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f61893b = iArr2;
        int[] iArr3 = new int[CheckDetectionResult$SizeCheckResult.values().length];
        try {
            iArr3[CheckDetectionResult$SizeCheckResult.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[CheckDetectionResult$SizeCheckResult.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[CheckDetectionResult$SizeCheckResult.BIG.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f61894c = iArr3;
    }
}
