package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gc */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35699gc implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77112a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79193a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35699gc(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77112a.onDecodeCompletedInternal();
    }

    private RunnableC35699gc(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77112a = uGCSingleFilePixelFrameProvider;
    }
}
