package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {
    private final float offset;
    private final EdgeTreatment other;

    @Override // com.google.android.material.shape.EdgeTreatment
    public boolean forceIntersection() {
        return this.other.forceIntersection();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f11, float f12, float f13, @NonNull ShapePath shapePath) {
        this.other.getEdgePath(f11, f12 - this.offset, f13, shapePath);
    }

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f11) {
        this.other = edgeTreatment;
        this.offset = f11;
    }
}
