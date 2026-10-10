package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MathUtils {
    public static double differenceDegrees(double d11, double d12) {
        return 180.0d - Math.abs(Math.abs(d11 - d12) - 180.0d);
    }

    public static double[] matrixMultiply(double[] dArr, double[][] dArr2) {
        double d11 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d12 = dArr3[0] * d11;
        double d13 = dArr[1];
        double d14 = d12 + (dArr3[1] * d13);
        double d15 = dArr[2];
        double d16 = d14 + (dArr3[2] * d15);
        double[] dArr4 = dArr2[1];
        double d17 = (dArr4[0] * d11) + (dArr4[1] * d13) + (dArr4[2] * d15);
        double[] dArr5 = dArr2[2];
        return new double[]{d16, d17, (d11 * dArr5[0]) + (d13 * dArr5[1]) + (d15 * dArr5[2])};
    }

    public static double rotationDirection(double d11, double d12) {
        return sanitizeDegreesDouble(d12 - d11) <= 180.0d ? 1.0d : -1.0d;
    }

    public static double clampDouble(double d11, double d12, double d13) {
        if (d13 < d11) {
            return d11;
        }
        return d13 > d12 ? d12 : d13;
    }

    public static int clampInt(int i11, int i12, int i13) {
        if (i13 < i11) {
            return i11;
        }
        return i13 > i12 ? i12 : i13;
    }

    public static double lerp(double d11, double d12, double d13) {
        return ((1.0d - d13) * d11) + (d13 * d12);
    }

    public static int sanitizeDegreesInt(int i11) {
        int i12 = i11 % TXVodDownloadDataSource.QUALITY_360P;
        return i12 < 0 ? i12 + TXVodDownloadDataSource.QUALITY_360P : i12;
    }

    public static int signum(double d11) {
        if (d11 < 0.0d) {
            return -1;
        }
        return d11 == 0.0d ? 0 : 1;
    }

    private MathUtils() {
    }

    public static double sanitizeDegreesDouble(double d11) {
        double d12 = d11 % 360.0d;
        if (d12 < 0.0d) {
            return d12 + 360.0d;
        }
        return d12;
    }
}
