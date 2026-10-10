package com.tencent.liteav.videobase.utils;

import android.graphics.PointF;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34742g;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class PerspectiveTransformMatrixCalculator {
    public static native float[] nativeGetPerspectiveTransformMatrix(float[] fArr, float[] fArr2);

    public static float[] getPerspectiveTransformMatrix(List<PointF> list, List<PointF> list2) {
        return nativeGetPerspectiveTransformMatrix(C34742g.m76113a(list), C34742g.m76113a(list2));
    }
}
