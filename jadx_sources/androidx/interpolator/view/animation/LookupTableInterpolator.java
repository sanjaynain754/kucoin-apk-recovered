package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int iMin = Math.min((int) ((fArr.length - 1) * f11), fArr.length - 2);
        float f12 = this.mStepSize;
        float f13 = (f11 - (iMin * f12)) / f12;
        float[] fArr2 = this.mValues;
        float f14 = fArr2[iMin];
        return f14 + (f13 * (fArr2[iMin + 1] - f14));
    }

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }
}
