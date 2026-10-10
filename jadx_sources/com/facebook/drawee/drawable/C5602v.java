package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.v */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5602v extends AbstractC5596p {

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5597q f8366l = new C5602v();

    public String toString() {
        return "fit_center";
    }

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMin = Math.min(f13, f14);
        float fWidth = rect.left + ((rect.width() - (i11 * fMin)) * 0.5f);
        float fHeight = rect.top + ((rect.height() - (i12 * fMin)) * 0.5f);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }
}
