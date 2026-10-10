package com.tencent.liteav.trtc;

/* JADX INFO: renamed from: com.tencent.liteav.trtc.a */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34789a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TrtcCloudJni f73722a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76201a(TrtcCloudJni trtcCloudJni) {
        return new RunnableC34789a(trtcCloudJni);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TrtcCloudJni.lambda$enterRoom$0(this.f73722a);
    }

    private RunnableC34789a(TrtcCloudJni trtcCloudJni) {
        this.f73722a = trtcCloudJni;
    }
}
