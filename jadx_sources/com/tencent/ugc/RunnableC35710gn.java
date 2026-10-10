package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gn */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35710gn implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCThumbnailGenerator f77125a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79204a(UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new RunnableC35710gn(uGCThumbnailGenerator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCThumbnailGenerator.lambda$uninitialize$0(this.f77125a);
    }

    private RunnableC35710gn(UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f77125a = uGCThumbnailGenerator;
    }
}
