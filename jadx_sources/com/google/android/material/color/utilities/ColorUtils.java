package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ColorUtils {
    static final double[][] SRGB_TO_XYZ = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    static final double[][] XYZ_TO_SRGB = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    static final double[] WHITE_POINT_D65 = {95.047d, 100.0d, 108.883d};

    public static int argbFromLinrgb(double[] dArr) {
        return argbFromRgb(delinearized(dArr[0]), delinearized(dArr[1]), delinearized(dArr[2]));
    }

    public static double linearized(int i11) {
        double d11 = ((double) i11) / 255.0d;
        return (d11 <= 0.040449936d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static int alphaFromArgb(int i11) {
        return (i11 >> 24) & 255;
    }

    public static int argbFromLab(double d11, double d12, double d13) {
        double[] dArr = WHITE_POINT_D65;
        double d14 = (d11 + 16.0d) / 116.0d;
        double d15 = d14 - (d13 / 200.0d);
        return argbFromXyz(labInvf((d12 / 500.0d) + d14) * dArr[0], labInvf(d14) * dArr[1], labInvf(d15) * dArr[2]);
    }

    public static int argbFromRgb(int i11, int i12, int i13) {
        return ((i11 & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((i12 & 255) << 8) | (i13 & 255);
    }

    public static int argbFromXyz(double d11, double d12, double d13) {
        double[][] dArr = XYZ_TO_SRGB;
        double[] dArr2 = dArr[0];
        double d14 = (dArr2[0] * d11) + (dArr2[1] * d12) + (dArr2[2] * d13);
        double[] dArr3 = dArr[1];
        double d15 = (dArr3[0] * d11) + (dArr3[1] * d12) + (dArr3[2] * d13);
        double[] dArr4 = dArr[2];
        return argbFromRgb(delinearized(d14), delinearized(d15), delinearized((dArr4[0] * d11) + (dArr4[1] * d12) + (dArr4[2] * d13)));
    }

    public static int blueFromArgb(int i11) {
        return i11 & 255;
    }

    public static int delinearized(double d11) {
        double d12 = d11 / 100.0d;
        return MathUtils.clampInt(0, 255, (int) Math.round((d12 <= 0.0031308d ? d12 * 12.92d : (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d));
    }

    public static int greenFromArgb(int i11) {
        return (i11 >> 8) & 255;
    }

    public static double labInvf(double d11) {
        double d12 = d11 * d11 * d11;
        return d12 > 0.008856451679035631d ? d12 : ((d11 * 116.0d) - 16.0d) / 903.2962962962963d;
    }

    public static double lstarFromY(double d11) {
        return (labF(d11 / 100.0d) * 116.0d) - 16.0d;
    }

    public static int redFromArgb(int i11) {
        return (i11 >> 16) & 255;
    }

    public static double[] whitePointD65() {
        return WHITE_POINT_D65;
    }

    public static double yFromLstar(double d11) {
        return labInvf((d11 + 16.0d) / 116.0d) * 100.0d;
    }

    private ColorUtils() {
    }

    public static int argbFromLstar(double d11) {
        int iDelinearized = delinearized(yFromLstar(d11));
        return argbFromRgb(iDelinearized, iDelinearized, iDelinearized);
    }

    public static boolean isOpaque(int i11) {
        if (alphaFromArgb(i11) >= 255) {
            return true;
        }
        return false;
    }

    public static double[] labFromArgb(int i11) {
        double dLinearized = linearized(redFromArgb(i11));
        double dLinearized2 = linearized(greenFromArgb(i11));
        double dLinearized3 = linearized(blueFromArgb(i11));
        double[][] dArr = SRGB_TO_XYZ;
        double[] dArr2 = dArr[0];
        double d11 = (dArr2[0] * dLinearized) + (dArr2[1] * dLinearized2) + (dArr2[2] * dLinearized3);
        double[] dArr3 = dArr[1];
        double d12 = (dArr3[0] * dLinearized) + (dArr3[1] * dLinearized2) + (dArr3[2] * dLinearized3);
        double[] dArr4 = dArr[2];
        double d13 = (dArr4[0] * dLinearized) + (dArr4[1] * dLinearized2) + (dArr4[2] * dLinearized3);
        double[] dArr5 = WHITE_POINT_D65;
        double d14 = d11 / dArr5[0];
        double d15 = d12 / dArr5[1];
        double d16 = d13 / dArr5[2];
        double dLabF = labF(d14);
        double dLabF2 = labF(d15);
        return new double[]{(116.0d * dLabF2) - 16.0d, (dLabF - dLabF2) * 500.0d, (dLabF2 - labF(d16)) * 200.0d};
    }

    public static double lstarFromArgb(int i11) {
        return (labF(xyzFromArgb(i11)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    public static double[] xyzFromArgb(int i11) {
        return MathUtils.matrixMultiply(new double[]{linearized(redFromArgb(i11)), linearized(greenFromArgb(i11)), linearized(blueFromArgb(i11))}, SRGB_TO_XYZ);
    }

    public static double labF(double d11) {
        if (d11 > 0.008856451679035631d) {
            return Math.pow(d11, 0.3333333333333333d);
        }
        return ((d11 * 903.2962962962963d) + 16.0d) / 116.0d;
    }
}
