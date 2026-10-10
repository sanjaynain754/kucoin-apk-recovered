package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gs */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35715gs implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCThumbnailGenerator f77135a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79209a(UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new RunnableC35715gs(uGCThumbnailGenerator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCThumbnailGenerator.lambda$stop$4(this.f77135a);
    }

    private RunnableC35715gs(UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f77135a = uGCThumbnailGenerator;
    }
}
