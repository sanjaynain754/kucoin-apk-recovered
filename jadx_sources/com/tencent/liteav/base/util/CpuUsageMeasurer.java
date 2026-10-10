package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes59.dex */
public class CpuUsageMeasurer {
    public static native int[] nativeGetCpuUsage();

    /* JADX INFO: renamed from: a */
    public static int[] m76076a() {
        int[] iArrNativeGetCpuUsage = nativeGetCpuUsage();
        return new int[]{iArrNativeGetCpuUsage[0], iArrNativeGetCpuUsage[1]};
    }
}
