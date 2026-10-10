package com.tencent.liteav.trtc;

import com.tencent.trtc.TRTCCloudDef;

/* JADX INFO: renamed from: com.tencent.liteav.trtc.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34790b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TrtcCloudJni f73723a;

    /* JADX INFO: renamed from: b */
    private final TRTCCloudDef.TRTCScreenShareParams f73724b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76202a(TrtcCloudJni trtcCloudJni, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        return new RunnableC34790b(trtcCloudJni, tRTCScreenShareParams);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73723a.showFloatingWindow(this.f73724b.floatingView);
    }

    private RunnableC34790b(TrtcCloudJni trtcCloudJni, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f73723a = trtcCloudJni;
        this.f73724b = tRTCScreenShareParams;
    }
}
