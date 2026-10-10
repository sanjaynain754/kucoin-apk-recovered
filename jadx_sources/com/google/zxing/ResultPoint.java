package com.google.zxing;

import com.google.zxing.common.detector.MathUtils;

/* JADX INFO: loaded from: classes56.dex */
public class ResultPoint {

    /* JADX INFO: renamed from: x */
    private final float f12784x;

    /* JADX INFO: renamed from: y */
    private final float f12785y;

    public static void orderBestPatterns(ResultPoint[] resultPointArr) {
        ResultPoint resultPoint;
        ResultPoint resultPoint2;
        ResultPoint resultPoint3;
        float fDistance = distance(resultPointArr[0], resultPointArr[1]);
        float fDistance2 = distance(resultPointArr[1], resultPointArr[2]);
        float fDistance3 = distance(resultPointArr[0], resultPointArr[2]);
        if (fDistance2 >= fDistance && fDistance2 >= fDistance3) {
            resultPoint = resultPointArr[0];
            resultPoint2 = resultPointArr[1];
            resultPoint3 = resultPointArr[2];
        } else if (fDistance3 < fDistance2 || fDistance3 < fDistance) {
            resultPoint = resultPointArr[2];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[1];
        } else {
            resultPoint = resultPointArr[1];
            resultPoint2 = resultPointArr[0];
            resultPoint3 = resultPointArr[2];
        }
        if (crossProductZ(resultPoint2, resultPoint, resultPoint3) < 0.0f) {
            ResultPoint resultPoint4 = resultPoint3;
            resultPoint3 = resultPoint2;
            resultPoint2 = resultPoint4;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint;
        resultPointArr[2] = resultPoint3;
    }

    private static float crossProductZ(ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3) {
        float f11 = resultPoint2.f12784x;
        float f12 = resultPoint2.f12785y;
        return ((resultPoint3.f12784x - f11) * (resultPoint.f12785y - f12)) - ((resultPoint3.f12785y - f12) * (resultPoint.f12784x - f11));
    }

    public static float distance(ResultPoint resultPoint, ResultPoint resultPoint2) {
        return MathUtils.distance(resultPoint.f12784x, resultPoint.f12785y, resultPoint2.f12784x, resultPoint2.f12785y);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ResultPoint) {
            ResultPoint resultPoint = (ResultPoint) obj;
            if (this.f12784x == resultPoint.f12784x && this.f12785y == resultPoint.f12785y) {
                return true;
            }
        }
        return false;
    }

    public final float getX() {
        return this.f12784x;
    }

    public final float getY() {
        return this.f12785y;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f12784x) * 31) + Float.floatToIntBits(this.f12785y);
    }

    public final String toString() {
        return "(" + this.f12784x + ',' + this.f12785y + ')';
    }

    public ResultPoint(float f11, float f12) {
        this.f12784x = f11;
        this.f12785y = f12;
    }
}
