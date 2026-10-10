package com.tencent.liteav.videobase.common;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.common.a */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34873a implements Runnable {

    /* JADX INFO: renamed from: a */
    private static final RunnableC34873a f74191a = new RunnableC34873a();

    /* JADX INFO: renamed from: a */
    public static Runnable m76492a() {
        return f74191a;
    }

    private RunnableC34873a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        HDRCapability.checkIsHDR10Supported();
    }
}
