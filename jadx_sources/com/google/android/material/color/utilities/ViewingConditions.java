package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* JADX INFO: renamed from: aw */
    private final double f11779aw;

    /* JADX INFO: renamed from: c */
    private final double f11780c;

    /* JADX INFO: renamed from: fl */
    private final double f11781fl;
    private final double flRoot;

    /* JADX INFO: renamed from: n */
    private final double f11782n;
    private final double nbb;

    /* JADX INFO: renamed from: nc */
    private final double f11783nc;
    private final double ncb;
    private final double[] rgbD;

    /* JADX INFO: renamed from: z */
    private final double f11784z;

    public static ViewingConditions make(double[] dArr, double d11, double d12, double d13, boolean z11) {
        double dMax = Math.max(0.1d, d12);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d14 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d15 = dArr3[0] * d14;
        double d16 = dArr[1];
        double d17 = d15 + (dArr3[1] * d16);
        double d18 = dArr[2];
        double d19 = d17 + (dArr3[2] * d18);
        double[] dArr4 = dArr2[1];
        double d21 = (dArr4[0] * d14) + (dArr4[1] * d16) + (dArr4[2] * d18);
        double[] dArr5 = dArr2[2];
        double d22 = (d14 * dArr5[0]) + (d16 * dArr5[1]) + (d18 * dArr5[2]);
        double d23 = (d13 / 10.0d) + 0.8d;
        double dLerp = d23 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d23 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d23 - 0.8d) * 10.0d);
        double dClampDouble = MathUtils.clampDouble(0.0d, 1.0d, z11 ? 1.0d : (1.0d - (Math.exp(((-d11) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d23);
        double[] dArr6 = {(((100.0d / d19) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d21) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d22) * dClampDouble) + 1.0d) - dClampDouble};
        double d24 = 5.0d * d11;
        double d25 = 1.0d / (d24 + 1.0d);
        double d26 = d25 * d25 * d25 * d25;
        double d27 = 1.0d - d26;
        double dCbrt = (d26 * d11) + (d27 * 0.1d * d27 * Math.cbrt(d24));
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d19) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d21) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d22) / 100.0d, 0.42d)};
        double d28 = dArr7[0];
        double d29 = (d28 * 400.0d) / (d28 + 27.13d);
        double d31 = dArr7[1];
        double d32 = (d31 * 400.0d) / (d31 + 27.13d);
        double d33 = dArr7[2];
        double[] dArr8 = {d29, d32, (400.0d * d33) / (d33 + 27.13d)};
        return new ViewingConditions(dYFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, dLerp, d23, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f11779aw;
    }

    public double getC() {
        return this.f11780c;
    }

    public double getFl() {
        return this.f11781fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f11782n;
    }

    public double getNbb() {
        return this.nbb;
    }

    public double getNc() {
        return this.f11783nc;
    }

    public double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    public double getZ() {
        return this.f11784z;
    }

    private ViewingConditions(double d11, double d12, double d13, double d14, double d15, double d16, double[] dArr, double d17, double d18, double d19) {
        this.f11782n = d11;
        this.f11779aw = d12;
        this.nbb = d13;
        this.ncb = d14;
        this.f11780c = d15;
        this.f11783nc = d16;
        this.rgbD = dArr;
        this.f11781fl = d17;
        this.flRoot = d18;
        this.f11784z = d19;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d11) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d11, 2.0d, false);
    }
}
