package com.sumsub.sns.internal.features.presentation.prooface.utils;

import android.graphics.Bitmap;
import android.graphics.Color;
import p852kotlin.Pair;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.utils.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC32265b {
    /* JADX INFO: renamed from: a */
    public static Pair m71072a(Bitmap bitmap) {
        try {
            int pixel = Bitmap.createScaledBitmap(bitmap, 1, 1, false).getPixel(0, 0);
            double dRed = ((double) Color.red(pixel)) / 255.0d;
            return new Pair(Integer.valueOf(pixel), Float.valueOf(200 * ((float) (((((double) Color.blue(pixel)) / 255.0d) * 0.0722d) + ((((double) Color.green(pixel)) / 255.0d) * 0.7152d) + (dRed * 0.2126d)))));
        } catch (Exception unused) {
            return new Pair(0, Float.valueOf(0.0f));
        }
    }
}
