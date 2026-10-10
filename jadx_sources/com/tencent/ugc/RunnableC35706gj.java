package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gj */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35706gj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider.C354821 f77120a;

    /* JADX INFO: renamed from: b */
    private final long f77121b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79200a(UGCSingleFilePixelFrameProvider.C354821 c354821, long j11) {
        return new RunnableC35706gj(c354821, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.this.seekToInFileTime(this.f77121b, false);
    }

    private RunnableC35706gj(UGCSingleFilePixelFrameProvider.C354821 c354821, long j11) {
        this.f77120a = c354821;
        this.f77121b = j11;
    }
}
