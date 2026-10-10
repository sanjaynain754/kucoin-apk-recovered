package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hs */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35742hs implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoDemuxerFFmpeg f77201a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79236a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new RunnableC35742hs(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoDemuxerFFmpeg.lambda$close$1(this.f77201a);
    }

    private RunnableC35742hs(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f77201a = videoDemuxerFFmpeg;
    }
}
