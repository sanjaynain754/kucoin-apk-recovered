package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class RoundedCornerTreatment extends CornerTreatment {
    float radius;

    public RoundedCornerTreatment() {
        this.radius = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f11, float f12, float f13) {
        float f14 = f13 * f12;
        shapePath.reset(0.0f, f14, 180.0f, 180.0f - f11);
        float f15 = f14 * 2.0f;
        shapePath.addArc(0.0f, 0.0f, f15, f15, 180.0f, f11);
    }

    @Deprecated
    public RoundedCornerTreatment(float f11) {
        this.radius = f11;
    }
}
