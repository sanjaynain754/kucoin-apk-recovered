package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i11, int i12, double d11) {
        Cam16 cam16FromInt = Cam16.fromInt(i11);
        Cam16 cam16FromInt2 = Cam16.fromInt(i12);
        double jstar = cam16FromInt.getJstar();
        double astar = cam16FromInt.getAstar();
        double bstar = cam16FromInt.getBstar();
        return Cam16.fromUcs(jstar + ((cam16FromInt2.getJstar() - jstar) * d11), astar + ((cam16FromInt2.getAstar() - astar) * d11), bstar + ((cam16FromInt2.getBstar() - bstar) * d11)).toInt();
    }

    public static int harmonize(int i11, int i12) {
        Hct hctFromInt = Hct.fromInt(i11);
        Hct hctFromInt2 = Hct.fromInt(i12);
        return Hct.from(MathUtils.sanitizeDegreesDouble(hctFromInt.getHue() + (Math.min(MathUtils.differenceDegrees(hctFromInt.getHue(), hctFromInt2.getHue()) * 0.5d, 15.0d) * MathUtils.rotationDirection(hctFromInt.getHue(), hctFromInt2.getHue()))), hctFromInt.getChroma(), hctFromInt.getTone()).toInt();
    }

    public static int hctHue(int i11, int i12, double d11) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i11, i12, d11)).getHue(), Cam16.fromInt(i11).getChroma(), ColorUtils.lstarFromArgb(i11)).toInt();
    }
}
