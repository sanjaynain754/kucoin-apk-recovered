package com.tencent.ugc.videobase.utils;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FloatUtils {
    private static final float THRESHOLD = 1.0E-6f;

    public static boolean isEqual(float f11, float f12) {
        return Math.abs(f11 - f12) < 1.0E-6f;
    }

    public static List<PointF> convertFloatArrayToPointFList(float[] fArr) {
        if (fArr == null || (fArr.length & 1) == 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < fArr.length) {
            int i12 = i11 + 1;
            float f11 = fArr[i11];
            i11 += 2;
            arrayList.add(new PointF(f11, fArr[i12]));
        }
        return arrayList;
    }

    public static float[] convertPointFListToFloatArray(List<PointF> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        float[] fArr = new float[size * 2];
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = list.get(i11);
            int i12 = i11 * 2;
            fArr[i12] = pointF.x;
            fArr[i12 + 1] = pointF.y;
        }
        return fArr;
    }

    public static boolean isEqual(double d11, double d12) {
        return Math.abs(d11 - d12) < 9.999999974752427E-7d;
    }
}
