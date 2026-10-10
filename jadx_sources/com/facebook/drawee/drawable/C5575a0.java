package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.a0 */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5575a0 extends AbstractC5596p {

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5597q f8255l = new C5575a0();

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fWidth = rect.left + ((rect.width() - (i11 * f14)) * 0.5f);
        float f15 = rect.top;
        matrix.setScale(f14, f14);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f15 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }
}
