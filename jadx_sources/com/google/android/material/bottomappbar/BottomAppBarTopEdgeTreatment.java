package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;

/* JADX INFO: loaded from: classes45.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public void setCradleVerticalOffset(@FloatRange(from = 0.0d) float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f11;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f11, float f12, float f13, @NonNull ShapePath shapePath) {
        float f14;
        float f15;
        float f16 = this.fabDiameter;
        if (f16 == 0.0f) {
            shapePath.lineTo(f11, 0.0f);
            return;
        }
        float f17 = ((this.fabMargin * 2.0f) + f16) / 2.0f;
        float f18 = f13 * this.roundedCornerRadius;
        float f19 = f12 + this.horizontalOffset;
        float f21 = (this.cradleVerticalOffset * f13) + ((1.0f - f13) * f17);
        if (f21 / f17 >= 1.0f) {
            shapePath.lineTo(f11, 0.0f);
            return;
        }
        float f22 = this.fabCornerSize;
        float f23 = f22 * f13;
        boolean z11 = f22 == -1.0f || Math.abs((f22 * 2.0f) - f16) < 0.1f;
        if (z11) {
            f14 = f21;
            f15 = 0.0f;
        } else {
            f15 = ROUNDED_CORNER_FAB_OFFSET;
            f14 = 0.0f;
        }
        float f24 = f17 + f18;
        float f25 = f14 + f18;
        float fSqrt = (float) Math.sqrt((f24 * f24) - (f25 * f25));
        float f26 = f19 - fSqrt;
        float f27 = f19 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f25));
        float f28 = (90.0f - degrees) + f15;
        shapePath.lineTo(f26, 0.0f);
        float f29 = f26 - f18;
        float f31 = f26 + f18;
        float f32 = f18 * 2.0f;
        shapePath.addArc(f29, 0.0f, f31, f32, 270.0f, degrees);
        if (z11) {
            shapePath.addArc(f19 - f17, (-f17) - f14, f19 + f17, f17 - f14, 180.0f - f28, (f28 * 2.0f) - 180.0f);
        } else {
            float f33 = this.fabMargin;
            float f34 = f23 * 2.0f;
            float f35 = f33 + f34;
            float f36 = f19 - f17;
            shapePath.addArc(f36, -(f23 + f33), f35 + f36, f33 + f23, 180.0f - f28, ((f28 * 2.0f) - 180.0f) / 2.0f);
            float f37 = f19 + f17;
            float f38 = this.fabMargin;
            shapePath.lineTo(f37 - ((f38 / 2.0f) + f23), f38 + f23);
            float f39 = this.fabMargin;
            shapePath.addArc(f37 - (f34 + f39), -(f23 + f39), f37, f39 + f23, 90.0f, f28 - 90.0f);
        }
        shapePath.addArc(f27 - f18, 0.0f, f27 + f18, f32, 270.0f - degrees, degrees);
        shapePath.lineTo(f11, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setFabCornerSize(float f11) {
        this.fabCornerSize = f11;
    }

    public void setFabCradleMargin(float f11) {
        this.fabMargin = f11;
    }

    public void setFabCradleRoundedCornerRadius(float f11) {
        this.roundedCornerRadius = f11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f11) {
        this.fabDiameter = f11;
    }

    public void setHorizontalOffset(float f11) {
        this.horizontalOffset = f11;
    }

    public BottomAppBarTopEdgeTreatment(float f11, float f12, float f13) {
        this.fabMargin = f11;
        this.roundedCornerRadius = f12;
        setCradleVerticalOffset(f13);
        this.horizontalOffset = 0.0f;
    }
}
