package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Cam16 {
    private final double astar;
    private final double bstar;
    private final double chroma;
    private final double hue;

    /* JADX INFO: renamed from: j */
    private final double f11764j;
    private final double jstar;

    /* JADX INFO: renamed from: m */
    private final double f11765m;

    /* JADX INFO: renamed from: q */
    private final double f11766q;

    /* JADX INFO: renamed from: s */
    private final double f11767s;
    private final double[] tempArray = {0.0d, 0.0d, 0.0d};
    static final double[][] XYZ_TO_CAM16RGB = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    static final double[][] CAM16RGB_TO_XYZ = {new double[]{1.8620678d, -1.0112547d, 0.14918678d}, new double[]{0.38752654d, 0.62144744d, -0.00897398d}, new double[]{-0.0158415d, -0.03412294d, 1.0499644d}};

    public static Cam16 fromInt(int i11) {
        return fromIntInViewingConditions(i11, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromIntInViewingConditions(int i11, ViewingConditions viewingConditions) {
        double dLinearized = ColorUtils.linearized((16711680 & i11) >> 16);
        double dLinearized2 = ColorUtils.linearized((65280 & i11) >> 8);
        double dLinearized3 = ColorUtils.linearized(i11 & 255);
        return fromXyzInViewingConditions((0.41233895d * dLinearized) + (0.35762064d * dLinearized2) + (0.18051042d * dLinearized3), (0.2126d * dLinearized) + (0.7152d * dLinearized2) + (0.0722d * dLinearized3), (dLinearized * 0.01932141d) + (dLinearized2 * 0.11916382d) + (dLinearized3 * 0.95034478d), viewingConditions);
    }

    public static Cam16 fromJch(double d11, double d12, double d13) {
        return fromJchInViewingConditions(d11, d12, d13, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromUcs(double d11, double d12, double d13) {
        return fromUcsInViewingConditions(d11, d12, d13, ViewingConditions.DEFAULT);
    }

    public static Cam16 fromXyzInViewingConditions(double d11, double d12, double d13, ViewingConditions viewingConditions) {
        double[][] dArr = XYZ_TO_CAM16RGB;
        double[] dArr2 = dArr[0];
        double d14 = (dArr2[0] * d11) + (dArr2[1] * d12) + (dArr2[2] * d13);
        double[] dArr3 = dArr[1];
        double d15 = (dArr3[0] * d11) + (dArr3[1] * d12) + (dArr3[2] * d13);
        double[] dArr4 = dArr[2];
        double d16 = (dArr4[0] * d11) + (dArr4[1] * d12) + (dArr4[2] * d13);
        double d17 = viewingConditions.getRgbD()[0] * d14;
        double d18 = viewingConditions.getRgbD()[1] * d15;
        double d19 = viewingConditions.getRgbD()[2] * d16;
        double dPow = Math.pow((viewingConditions.getFl() * Math.abs(d17)) / 100.0d, 0.42d);
        double dPow2 = Math.pow((viewingConditions.getFl() * Math.abs(d18)) / 100.0d, 0.42d);
        double dPow3 = Math.pow((viewingConditions.getFl() * Math.abs(d19)) / 100.0d, 0.42d);
        double dSignum = ((Math.signum(d17) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((Math.signum(d18) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((Math.signum(d19) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d21 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d22 = ((dSignum + dSignum2) - (dSignum3 * 2.0d)) / 9.0d;
        double d23 = dSignum2 * 20.0d;
        double d24 = (((dSignum * 20.0d) + d23) + (21.0d * dSignum3)) / 20.0d;
        double d25 = (((dSignum * 40.0d) + d23) + dSignum3) / 20.0d;
        double degrees = Math.toDegrees(Math.atan2(d22, d21));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d26 = degrees;
        double radians = Math.toRadians(d26);
        double dPow4 = Math.pow((d25 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ()) * 100.0d;
        double d27 = dPow4 / 100.0d;
        double flRoot = viewingConditions.getFlRoot() * (4.0d / viewingConditions.getC()) * Math.sqrt(d27) * (viewingConditions.getAw() + 4.0d);
        double dPow5 = Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d) * Math.pow(((((((Math.cos(Math.toRadians(d26 < 20.14d ? d26 + 360.0d : d26) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * viewingConditions.getNc()) * viewingConditions.getNcb()) * Math.hypot(d21, d22)) / (d24 + 0.305d), 0.9d);
        double dSqrt = dPow5 * Math.sqrt(d27);
        double flRoot2 = dSqrt * viewingConditions.getFlRoot();
        double dSqrt2 = Math.sqrt((dPow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double d28 = (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot2) * 43.859649122807014d;
        return new Cam16(d26, dSqrt, dPow4, flRoot, flRoot2, dSqrt2, d28, dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    public double getAstar() {
        return this.astar;
    }

    public double getBstar() {
        return this.bstar;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getJ() {
        return this.f11764j;
    }

    public double getJstar() {
        return this.jstar;
    }

    public double getM() {
        return this.f11765m;
    }

    public double getQ() {
        return this.f11766q;
    }

    public double getS() {
        return this.f11767s;
    }

    public int toInt() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public int viewed(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = xyzInViewingConditions(viewingConditions, this.tempArray);
        return ColorUtils.argbFromXyz(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2]);
    }

    private Cam16(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.hue = d11;
        this.chroma = d12;
        this.f11764j = d13;
        this.f11766q = d14;
        this.f11765m = d15;
        this.f11767s = d16;
        this.jstar = d17;
        this.astar = d18;
        this.bstar = d19;
    }

    private static Cam16 fromJchInViewingConditions(double d11, double d12, double d13, ViewingConditions viewingConditions) {
        double d14 = d11 / 100.0d;
        double c11 = (4.0d / viewingConditions.getC()) * Math.sqrt(d14) * (viewingConditions.getAw() + 4.0d) * viewingConditions.getFlRoot();
        double flRoot = d12 * viewingConditions.getFlRoot();
        double dSqrt = Math.sqrt(((d12 / Math.sqrt(d14)) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0d)) * 50.0d;
        double radians = Math.toRadians(d13);
        double d15 = (1.7000000000000002d * d11) / ((0.007d * d11) + 1.0d);
        double dLog1p = Math.log1p(0.0228d * flRoot) * 43.859649122807014d;
        return new Cam16(d13, d12, d11, c11, flRoot, dSqrt, d15, dLog1p * Math.cos(radians), dLog1p * Math.sin(radians));
    }

    public static Cam16 fromUcsInViewingConditions(double d11, double d12, double d13, ViewingConditions viewingConditions) {
        double dExpm1 = (Math.expm1(Math.hypot(d12, d13) * 0.0228d) / 0.0228d) / viewingConditions.getFlRoot();
        double dAtan2 = Math.atan2(d13, d12) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        return fromJchInViewingConditions(d11 / (1.0d - ((d11 - 100.0d) * 0.007d)), dExpm1, dAtan2, viewingConditions);
    }

    public double distance(@NonNull Cam16 cam16) {
        double jstar = getJstar() - cam16.getJstar();
        double astar = getAstar() - cam16.getAstar();
        double bstar = getBstar() - cam16.getBstar();
        return Math.pow(Math.sqrt((jstar * jstar) + (astar * astar) + (bstar * bstar)), 0.63d) * 1.41d;
    }

    public double[] xyzInViewingConditions(ViewingConditions viewingConditions, double[] dArr) {
        double chroma;
        if (getChroma() != 0.0d && getJ() != 0.0d) {
            chroma = getChroma() / Math.sqrt(getJ() / 100.0d);
        } else {
            chroma = 0.0d;
        }
        double dPow = Math.pow(chroma / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double radians = Math.toRadians(getHue());
        double dCos = (Math.cos(2.0d + radians) + 3.8d) * 0.25d;
        double aw2 = viewingConditions.getAw() * Math.pow(getJ() / 100.0d, (1.0d / viewingConditions.getC()) / viewingConditions.getZ());
        double nc2 = dCos * 3846.153846153846d * viewingConditions.getNc() * viewingConditions.getNcb();
        double nbb = aw2 / viewingConditions.getNbb();
        double dSin = Math.sin(radians);
        double dCos2 = Math.cos(radians);
        double d11 = (((0.305d + nbb) * 23.0d) * dPow) / (((nc2 * 23.0d) + ((11.0d * dPow) * dCos2)) + ((108.0d * dPow) * dSin));
        double d12 = dCos2 * d11;
        double d13 = d11 * dSin;
        double d14 = nbb * 460.0d;
        double d15 = (((451.0d * d12) + d14) + (288.0d * d13)) / 1403.0d;
        double d16 = ((d14 - (891.0d * d12)) - (261.0d * d13)) / 1403.0d;
        double d17 = ((d14 - (d12 * 220.0d)) - (d13 * 6300.0d)) / 1403.0d;
        double dSignum = Math.signum(d15) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d15) * 27.13d) / (400.0d - Math.abs(d15))), 2.380952380952381d);
        double dSignum2 = Math.signum(d16) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d16) * 27.13d) / (400.0d - Math.abs(d16))), 2.380952380952381d);
        double dSignum3 = Math.signum(d17) * (100.0d / viewingConditions.getFl()) * Math.pow(Math.max(0.0d, (Math.abs(d17) * 27.13d) / (400.0d - Math.abs(d17))), 2.380952380952381d);
        double d18 = dSignum / viewingConditions.getRgbD()[0];
        double d19 = dSignum2 / viewingConditions.getRgbD()[1];
        double d21 = dSignum3 / viewingConditions.getRgbD()[2];
        double[][] dArr2 = CAM16RGB_TO_XYZ;
        double[] dArr3 = dArr2[0];
        double d22 = (dArr3[0] * d18) + (dArr3[1] * d19) + (dArr3[2] * d21);
        double[] dArr4 = dArr2[1];
        double d23 = (dArr4[0] * d18) + (dArr4[1] * d19) + (dArr4[2] * d21);
        double[] dArr5 = dArr2[2];
        double d24 = (d18 * dArr5[0]) + (d19 * dArr5[1]) + (d21 * dArr5[2]);
        if (dArr != null) {
            dArr[0] = d22;
            dArr[1] = d23;
            dArr[2] = d24;
            return dArr;
        }
        return new double[]{d22, d23, d24};
    }
}
