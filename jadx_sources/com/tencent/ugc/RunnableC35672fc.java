package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fc */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35672fc implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFilePixelFrameProvider f77069a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79166a(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        return new RunnableC35672fc(uGCMultiFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFilePixelFrameProvider.lambda$start$0(this.f77069a);
    }

    private RunnableC35672fc(UGCMultiFilePixelFrameProvider uGCMultiFilePixelFrameProvider) {
        this.f77069a = uGCMultiFilePixelFrameProvider;
    }
}
