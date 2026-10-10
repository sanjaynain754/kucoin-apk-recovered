package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
public final class MarkerEdgeTreatment extends EdgeTreatment {
    private final float radius;

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return true;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f11, float f12, float f13, @NonNull ShapePath shapePath) {
        float fSqrt = (float) ((((double) this.radius) * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.radius, 2.0d) - Math.pow(fSqrt, 2.0d));
        shapePath.reset(f12 - fSqrt, ((float) (-((((double) this.radius) * Math.sqrt(2.0d)) - ((double) this.radius)))) + fSqrt2);
        shapePath.lineTo(f12, (float) (-((((double) this.radius) * Math.sqrt(2.0d)) - ((double) this.radius))));
        shapePath.lineTo(f12 + fSqrt, ((float) (-((((double) this.radius) * Math.sqrt(2.0d)) - ((double) this.radius)))) + fSqrt2);
    }

    public MarkerEdgeTreatment(float f11) {
        this.radius = f11 - 0.001f;
    }
}
