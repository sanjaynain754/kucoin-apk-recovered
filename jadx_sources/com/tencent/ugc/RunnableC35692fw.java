package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fw */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35692fw implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77100a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79186a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35692fw(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77100a.decodeInternal();
    }

    private RunnableC35692fw(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77100a = uGCSingleFilePixelFrameProvider;
    }
}
