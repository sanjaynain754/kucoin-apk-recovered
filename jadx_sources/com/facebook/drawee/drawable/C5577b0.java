package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.b0 */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5577b0 extends AbstractC5596p {

    /* JADX INFO: renamed from: l */
    public static final InterfaceC5597q f8260l = new C5577b0();

    @Override // com.facebook.drawee.drawable.AbstractC5596p
    public void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14) {
        float fMax;
        float fMax2;
        if (f14 > f13) {
            float f15 = i11 * f14;
            fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f11 * f15), 0.0f), rect.width() - f15);
            fMax2 = rect.top;
            f13 = f14;
        } else {
            fMax = rect.left;
            float f16 = i12 * f13;
            fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f12 * f16), 0.0f), rect.height() - f16) + rect.top;
        }
        matrix.setScale(f13, f13);
        matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
    }

    public String toString() {
        return "focus_crop";
    }
}
