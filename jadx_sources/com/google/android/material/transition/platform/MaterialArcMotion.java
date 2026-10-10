package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes45.dex */
@RequiresApi(21)
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f11, float f12, float f13, float f14) {
        return f12 > f14 ? new PointF(f13, f12) : new PointF(f11, f14);
    }

    @Override // android.transition.PathMotion
    @NonNull
    public Path getPath(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(f11, f12);
        PointF controlPoint = getControlPoint(f11, f12, f13, f14);
        path.quadTo(controlPoint.x, controlPoint.y, f13, f14);
        return path;
    }
}
