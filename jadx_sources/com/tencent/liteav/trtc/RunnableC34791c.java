package com.tencent.liteav.trtc;

/* JADX INFO: renamed from: com.tencent.liteav.trtc.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34791c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TrtcCloudJni f73725a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76203a(TrtcCloudJni trtcCloudJni) {
        return new RunnableC34791c(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f73725a.hideFloatingWindow();
    }

    private RunnableC34791c(TrtcCloudJni trtcCloudJni) {
        this.f73725a = trtcCloudJni;
    }
}
