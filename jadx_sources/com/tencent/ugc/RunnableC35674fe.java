package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fe */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35674fe implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFilePixelFrameProvider f77071a;

    /* JADX INFO: renamed from: b */
    private final long f77072b;

    /* JADX INFO: renamed from: c */
    private final boolean f77073c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79168a(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider, long j11, boolean z11) {
        return new RunnableC35674fe(uGCMultiFilePixelFrameProvider, j11, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFilePixelFrameProvider.lambda$seekTo$2(this.f77071a, this.f77072b, this.f77073c);
    }

    private RunnableC35674fe(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider, long j11, boolean z11) {
        this.f77071a = uGCMultiFilePixelFrameProvider;
        this.f77072b = j11;
        this.f77073c = z11;
    }
}
