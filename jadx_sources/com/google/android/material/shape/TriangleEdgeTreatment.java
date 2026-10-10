package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {
    private final boolean inside;
    private final float size;

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f11, float f12, float f13, @NonNull ShapePath shapePath) {
        if (!this.inside) {
            float f14 = this.size;
            shapePath.lineTo(f12 - (f14 * f13), 0.0f, f12, (-f14) * f13);
            shapePath.lineTo(f12 + (this.size * f13), 0.0f, f11, 0.0f);
        } else {
            shapePath.lineTo(f12 - (this.size * f13), 0.0f);
            float f15 = this.size;
            shapePath.lineTo(f12, f15 * f13, (f15 * f13) + f12, 0.0f);
            shapePath.lineTo(f11, 0.0f);
        }
    }

    public TriangleEdgeTreatment(float f11, boolean z11) {
        this.size = f11;
        this.inside = z11;
    }
}
