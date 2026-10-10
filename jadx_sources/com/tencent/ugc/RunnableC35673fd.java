package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fd */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35673fd implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFilePixelFrameProvider f77070a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79167a(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        return new RunnableC35673fd(uGCMultiFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFilePixelFrameProvider.lambda$stop$1(this.f77070a);
    }

    private RunnableC35673fd(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        this.f77070a = uGCMultiFilePixelFrameProvider;
    }
}
