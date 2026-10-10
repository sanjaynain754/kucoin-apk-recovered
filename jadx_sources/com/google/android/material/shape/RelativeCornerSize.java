package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class RelativeCornerSize implements CornerSize {
    private final float percent;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RelativeCornerSize) && this.percent == ((RelativeCornerSize) obj).percent;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static RelativeCornerSize createFromCornerSize(@NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        return cornerSize instanceof RelativeCornerSize ? (RelativeCornerSize) cornerSize : new RelativeCornerSize(cornerSize.getCornerSize(rectF) / getMaxCornerSize(rectF));
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.percent * getMaxCornerSize(rectF);
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    public float getRelativePercent() {
        return this.percent;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.percent)});
    }

    public String toString() {
        return ((int) (getRelativePercent() * 100.0f)) + "%";
    }

    public RelativeCornerSize(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        this.percent = f11;
    }

    private static float getMaxCornerSize(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }
}
