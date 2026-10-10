package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
public class CutCornerTreatment extends CornerTreatment {
    float size;

    public CutCornerTreatment() {
        this.size = -1.0f;
    }

    @Override // com.google.android.material.shape.CornerTreatment
    public void getCornerPath(@NonNull ShapePath shapePath, float f11, float f12, float f13) {
        float f14 = f13 * f12;
        shapePath.reset(0.0f, f14, 180.0f, 180.0f - f11);
        double d11 = f14;
        shapePath.lineTo((float) (Math.sin(Math.toRadians(f11)) * d11), (float) (Math.sin(Math.toRadians(90.0f - f11)) * d11));
    }

    @Deprecated
    public CutCornerTreatment(float f11) {
        this.size = f11;
    }
}
