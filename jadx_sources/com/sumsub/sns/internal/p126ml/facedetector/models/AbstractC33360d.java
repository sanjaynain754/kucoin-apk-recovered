package com.sumsub.sns.internal.p126ml.facedetector.models;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.facedetector.models.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33360d {
    /* JADX INFO: renamed from: a */
    public static void m71666a(C33362f c33362f) {
        int i11 = c33362f.f68040b;
        if (i11 < -1) {
            throw new IllegalArgumentException(("MaxNumberOfFaces must be greater than 0 or -1, maxNumberOfFaces: " + i11).toString());
        }
        float f11 = c33362f.f68039a;
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("MinConfidence must be between 0 and 1");
        }
    }
}
