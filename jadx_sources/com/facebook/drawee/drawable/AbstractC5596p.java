package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: com.facebook.drawee.drawable.p */
/* JADX INFO: compiled from: ScalingUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5596p implements InterfaceC5597q {
    public abstract void getTransformImpl(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12, float f13, float f14);

    @Override // com.facebook.drawee.drawable.InterfaceC5597q
    public Matrix getTransform(Matrix matrix, Rect rect, int i11, int i12, float f11, float f12) {
        getTransformImpl(matrix, rect, i11, i12, f11, f12, rect.width() / i11, rect.height() / i12);
        return matrix;
    }
}
