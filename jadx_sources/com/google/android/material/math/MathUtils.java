package com.google.android.material.math;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes45.dex */
public final class MathUtils {
    public static final float DEFAULT_EPSILON = 1.0E-4f;

    public static boolean areAllElementsEqual(@NonNull float[] fArr) {
        if (fArr.length <= 1) {
            return true;
        }
        float f11 = fArr[0];
        for (int i11 = 1; i11 < fArr.length; i11++) {
            if (fArr[i11] != f11) {
                return false;
            }
        }
        return true;
    }

    public static float dist(float f11, float f12, float f13, float f14) {
        return (float) Math.hypot(f13 - f11, f14 - f12);
    }

    public static float floorMod(float f11, int i11) {
        float f12 = i11;
        int i12 = (int) (f11 / f12);
        if (Math.signum(f11) * f12 < 0.0f && i12 * i11 != f11) {
            i12--;
        }
        return f11 - (i12 * i11);
    }

    public static boolean geq(float f11, float f12, float f13) {
        return f11 + f13 >= f12;
    }

    public static int floorMod(int i11, int i12) {
        int i13 = i11 / i12;
        if ((i11 ^ i12) < 0 && i13 * i12 != i11) {
            i13--;
        }
        return i11 - (i13 * i12);
    }

    public static float lerp(float f11, float f12, float f13) {
        return ((1.0f - f13) * f11) + (f13 * f12);
    }

    private static float max(float f11, float f12, float f13, float f14) {
        if (f11 > f12 && f11 > f13 && f11 > f14) {
            return f11;
        }
        if (f12 <= f13 || f12 <= f14) {
            return f13 > f14 ? f13 : f14;
        }
        return f12;
    }

    private MathUtils() {
    }

    public static float distanceToFurthestCorner(float f11, float f12, float f13, float f14, float f15, float f16) {
        return max(dist(f11, f12, f13, f14), dist(f11, f12, f15, f14), dist(f11, f12, f15, f16), dist(f11, f12, f13, f16));
    }
}
