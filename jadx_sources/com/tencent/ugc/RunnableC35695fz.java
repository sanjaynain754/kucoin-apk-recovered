package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fz */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35695fz implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77103a;

    /* JADX INFO: renamed from: b */
    private final long f77104b;

    /* JADX INFO: renamed from: c */
    private final boolean f77105c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79189a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, long j11, boolean z11) {
        return new RunnableC35695fz(uGCSingleFilePixelFrameProvider, j11, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.lambda$seekTo$0(this.f77103a, this.f77104b, this.f77105c);
    }

    private RunnableC35695fz(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider, long j11, boolean z11) {
        this.f77103a = uGCSingleFilePixelFrameProvider;
        this.f77104b = j11;
        this.f77105c = z11;
    }
}
