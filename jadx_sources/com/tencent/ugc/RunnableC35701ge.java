package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ge */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35701ge implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77114a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79195a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35701ge(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77114a.decodeInternal();
    }

    private RunnableC35701ge(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77114a = uGCSingleFilePixelFrameProvider;
    }
}
