package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hd */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35727hd implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77162a;

    /* JADX INFO: renamed from: b */
    private final UGCVideoProcessor.VideoProcessListener f77163b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79221a(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoProcessListener videoProcessListener) {
        return new RunnableC35727hd(uGCVideoProcessor, videoProcessListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77162a.mVideoProcessListener = this.f77163b;
    }

    private RunnableC35727hd(UGCVideoProcessor uGCVideoProcessor, UGCVideoProcessor.VideoProcessListener videoProcessListener) {
        this.f77162a = uGCVideoProcessor;
        this.f77163b = videoProcessListener;
    }
}
