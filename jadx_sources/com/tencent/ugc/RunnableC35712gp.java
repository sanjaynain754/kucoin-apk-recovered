package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gp */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35712gp implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCThumbnailGenerator f77128a;

    /* JADX INFO: renamed from: b */
    private final long f77129b;

    /* JADX INFO: renamed from: c */
    private final long f77130c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79206a(UGCThumbnailGenerator uGCThumbnailGenerator, long j11, long j12) {
        return new RunnableC35712gp(uGCThumbnailGenerator, j11, j12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77128a.mMediaListSource.setVideoSourceRange(this.f77129b, this.f77130c);
    }

    private RunnableC35712gp(UGCThumbnailGenerator uGCThumbnailGenerator, long j11, long j12) {
        this.f77128a = uGCThumbnailGenerator;
        this.f77129b = j11;
        this.f77130c = j12;
    }
}
