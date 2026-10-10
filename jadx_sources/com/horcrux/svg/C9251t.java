package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.horcrux.svg.t */
/* JADX INFO: compiled from: ViewBox.java */
/* JADX INFO: loaded from: classes56.dex */
public class C9251t {
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX INFO: renamed from: a */
    public static Matrix m14287a(RectF rectF, RectF rectF2, String str, int i11) {
        double d11;
        double d12 = rectF.left;
        double d13 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d14 = rectF2.left;
        double d15 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double dMax = dWidth2 / dWidth;
        double d16 = dHeight2 / dHeight;
        double d17 = d14 - (d12 * dMax);
        double d18 = d15 - (d13 * d16);
        if (i11 == 2) {
            dMax = Math.min(dMax, d16);
            if (dMax > 1.0d) {
                d17 -= ((dWidth2 / dMax) - dWidth) / 2.0d;
                d11 = (dHeight2 / dMax) - dHeight;
            } else {
                d17 -= (dWidth2 - (dWidth * dMax)) / 2.0d;
                d11 = dHeight2 - (dHeight * dMax);
            }
            d18 -= d11 / 2.0d;
            d16 = dMax;
        } else {
            if (!str.equals("none") && i11 == 0) {
                dMax = Math.min(dMax, d16);
            } else if (str.equals("none") || i11 != 1) {
                if (str.contains("xMid")) {
                    d17 += (dWidth2 - (dWidth * dMax)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d17 += dWidth2 - (dWidth * dMax);
                }
                if (str.contains("YMid")) {
                    d18 += (dHeight2 - (dHeight * d16)) / 2.0d;
                }
                if (str.contains("YMax")) {
                    d18 += dHeight2 - (dHeight * d16);
                }
            } else {
                dMax = Math.max(dMax, d16);
            }
            d16 = dMax;
            if (str.contains("xMid")) {
                d17 += (dWidth2 - (dWidth * dMax)) / 2.0d;
            }
            if (str.contains("xMax")) {
                d17 += dWidth2 - (dWidth * dMax);
            }
            if (str.contains("YMid")) {
                d18 += (dHeight2 - (dHeight * d16)) / 2.0d;
            }
            if (str.contains("YMax")) {
                d18 += dHeight2 - (dHeight * d16);
            }
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d17, (float) d18);
        matrix.preScale((float) dMax, (float) d16);
        return matrix;
    }
}
