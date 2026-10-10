package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ga */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35697ga implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77109a;

    /* JADX INFO: renamed from: b */
    private final boolean f77110b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79191a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, boolean z11) {
        return new RunnableC35697ga(uGCSingleFilePixelFrameProvider, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77109a.setReverseInternal(this.f77110b);
    }

    private RunnableC35697ga(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, boolean z11) {
        this.f77109a = uGCSingleFilePixelFrameProvider;
        this.f77110b = z11;
    }
}
