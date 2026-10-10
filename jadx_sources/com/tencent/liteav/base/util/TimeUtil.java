package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes59.dex */
public class TimeUtil {
    private static native long nativeGetTimeTick();

    private static native long nativeGetTimestamp();

    private static native long nativeGetUtcTimeTick();

    /* JADX INFO: renamed from: a */
    public static long m76097a() {
        return nativeGetTimeTick();
    }

    /* JADX INFO: renamed from: b */
    public static long m76098b() {
        return nativeGetUtcTimeTick();
    }

    /* JADX INFO: renamed from: c */
    public static long m76099c() {
        return nativeGetTimestamp();
    }
}
