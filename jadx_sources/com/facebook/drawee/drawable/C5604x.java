package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.x */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5604x extends AbstractC5596p {

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5597q f8368l = new C5604x();

    public String toString() {
        return "fit_start";
    }

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMin = Math.min(f13, f14);
        float f15 = rect.left;
        float f16 = rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f15 + 0.5f), (int) (f16 + 0.5f));
    }
}
