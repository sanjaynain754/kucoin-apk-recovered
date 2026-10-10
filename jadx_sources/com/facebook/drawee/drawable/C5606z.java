package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.z */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5606z extends AbstractC5596p {

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5597q f8370l = new C5606z();

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float f15 = rect.left;
        float f16 = rect.top;
        matrix.setScale(f13, f14);
        matrix.postTranslate((int) (f15 + 0.5f), (int) (f16 + 0.5f));
    }

    public String toString() {
        return "fit_xy";
    }
}
