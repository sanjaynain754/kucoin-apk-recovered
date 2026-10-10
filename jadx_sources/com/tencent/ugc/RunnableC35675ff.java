package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ff */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35675ff implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFilePixelFrameProvider f77074a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79169a(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        return new RunnableC35675ff(uGCMultiFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77074a.readFrameToQueue();
    }

    private RunnableC35675ff(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        this.f77074a = uGCMultiFilePixelFrameProvider;
    }
}
