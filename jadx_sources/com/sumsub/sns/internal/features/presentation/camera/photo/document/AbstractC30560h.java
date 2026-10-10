package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.p126ml.autocapture.SeamlessDocaptureMobileConfig$VideoQuality;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC30560h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f61720a;

    static {
        int[] iArr = new int[SeamlessDocaptureMobileConfig$VideoQuality.values().length];
        try {
            iArr[SeamlessDocaptureMobileConfig$VideoQuality.UHD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SeamlessDocaptureMobileConfig$VideoQuality.FHD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SeamlessDocaptureMobileConfig$VideoQuality.HD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SeamlessDocaptureMobileConfig$VideoQuality.SD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f61720a = iArr;
    }
}
