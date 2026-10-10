package com.google.android.material.internal;

import androidx.annotation.FloatRange;

/* JADX INFO: loaded from: classes45.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    public static void calculateFadeOutAndInAlphas(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11, float[] fArr) {
        if (f11 <= 0.5f) {
            fArr[0] = 1.0f - (f11 * 2.0f);
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = (f11 * 2.0f) - 1.0f;
        }
    }

    private FadeThroughUtils() {
    }
}
