package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.u */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5601u extends AbstractC5596p {

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5597q f8365l = new C5601u();

    public String toString() {
        return "fit_bottom_start";
    }

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMin = Math.min(f13, f14);
        float f15 = rect.left;
        float fHeight = rect.top + (rect.height() - (i12 * fMin));
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f15 + 0.5f), (int) (fHeight + 0.5f));
    }
}
