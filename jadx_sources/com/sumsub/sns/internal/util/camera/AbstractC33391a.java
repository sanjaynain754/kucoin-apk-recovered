package com.sumsub.sns.internal.util.camera;

/* JADX INFO: renamed from: com.sumsub.sns.internal.util.camera.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract /* synthetic */ class AbstractC33391a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f68094a;

    static {
        int[] iArr = new int[XposedVirtualCameraDirectory.values().length];
        try {
            iArr[XposedVirtualCameraDirectory.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[XposedVirtualCameraDirectory.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f68094a = iArr;
    }
}
