package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* JADX INFO: loaded from: classes45.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f11, float f12, float f13, float f14) {
        return f12 > f14 ? new PointF(f13, f12) : new PointF(f11, f14);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(f11, f12);
        PointF controlPoint = getControlPoint(f11, f12, f13, f14);
        path.quadTo(controlPoint.x, controlPoint.y, f13, f14);
        return path;
    }
}
