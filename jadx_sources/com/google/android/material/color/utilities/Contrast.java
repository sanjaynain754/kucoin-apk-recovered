package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Contrast {
    private static final double CONTRAST_RATIO_EPSILON = 0.04d;
    private static final double LUMINANCE_GAMUT_MAP_TOLERANCE = 0.4d;
    public static final double RATIO_30 = 3.0d;
    public static final double RATIO_45 = 4.5d;
    public static final double RATIO_70 = 7.0d;
    public static final double RATIO_MAX = 21.0d;
    public static final double RATIO_MIN = 1.0d;

    public static double darker(double d11, double d12) {
        if (d11 >= 0.0d && d11 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d11);
            double d13 = ((dYFromLstar + 5.0d) / d12) - 5.0d;
            if (d13 >= 0.0d && d13 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(dYFromLstar, d13);
                double dAbs = Math.abs(dRatioOfYs - d12);
                if (dRatioOfYs < d12 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d13) - LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    public static double lighter(double d11, double d12) {
        if (d11 >= 0.0d && d11 <= 100.0d) {
            double dYFromLstar = ColorUtils.yFromLstar(d11);
            double d13 = ((dYFromLstar + 5.0d) * d12) - 5.0d;
            if (d13 >= 0.0d && d13 <= 100.0d) {
                double dRatioOfYs = ratioOfYs(d13, dYFromLstar);
                double dAbs = Math.abs(dRatioOfYs - d12);
                if (dRatioOfYs < d12 && dAbs > CONTRAST_RATIO_EPSILON) {
                    return -1.0d;
                }
                double dLstarFromY = ColorUtils.lstarFromY(d13) + LUMINANCE_GAMUT_MAP_TOLERANCE;
                if (dLstarFromY >= 0.0d && dLstarFromY <= 100.0d) {
                    return dLstarFromY;
                }
            }
        }
        return -1.0d;
    }

    private Contrast() {
    }

    public static double darkerUnsafe(double d11, double d12) {
        return Math.max(0.0d, darker(d11, d12));
    }

    public static double lighterUnsafe(double d11, double d12) {
        double dLighter = lighter(d11, d12);
        if (dLighter < 0.0d) {
            return 100.0d;
        }
        return dLighter;
    }

    public static double ratioOfTones(double d11, double d12) {
        return ratioOfYs(ColorUtils.yFromLstar(d11), ColorUtils.yFromLstar(d12));
    }

    public static double ratioOfYs(double d11, double d12) {
        double dMax = Math.max(d11, d12);
        if (dMax != d12) {
            d11 = d12;
        }
        return (dMax + 5.0d) / (d11 + 5.0d);
    }
}
