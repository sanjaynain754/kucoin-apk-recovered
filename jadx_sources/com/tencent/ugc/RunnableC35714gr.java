package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gr */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35714gr implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCThumbnailGenerator f77134a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79208a(UGCThumbnailGenerator uGCThumbnailGenerator) {
        return new RunnableC35714gr(uGCThumbnailGenerator);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77134a.getNextThumbnail();
    }

    private RunnableC35714gr(UGCThumbnailGenerator uGCThumbnailGenerator) {
        this.f77134a = uGCThumbnailGenerator;
    }
}
