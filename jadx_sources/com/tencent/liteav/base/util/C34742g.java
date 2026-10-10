package com.tencent.liteav.base.util;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.g */
/* JADX INFO: loaded from: classes59.dex */
public final class C34742g {
    /* JADX INFO: renamed from: a */
    public static boolean m76112a(float f11, float f12) {
        return Math.abs(f11 - f12) < 1.0E-6f;
    }

    /* JADX INFO: renamed from: a */
    public static float[] m76113a(List<PointF> list) {
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
}
