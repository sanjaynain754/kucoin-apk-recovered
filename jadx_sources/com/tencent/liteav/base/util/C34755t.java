package com.tencent.liteav.base.util;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.t */
/* JADX INFO: loaded from: classes59.dex */
public final class C34755t {

    /* JADX INFO: renamed from: a */
    private static boolean f73565a;

    /* JADX INFO: renamed from: b */
    private static final C34736a<CpuUsageMeasurer> f73566b = new C34736a<>(C34756u.m76146b());

    /* JADX INFO: renamed from: a */
    public static int[] m76145a() {
        if (!f73565a) {
            f73566b.m76101a();
            return CpuUsageMeasurer.m76076a();
        }
        f73565a = false;
        f73566b.m76101a();
        CpuUsageMeasurer.m76076a();
        return new int[]{0, 0};
    }
}
