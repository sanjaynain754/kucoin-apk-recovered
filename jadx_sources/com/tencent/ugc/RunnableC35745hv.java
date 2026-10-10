package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hv */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35745hv implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoDemuxerFFmpeg f77205a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79239a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new RunnableC35745hv(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77205a.getNextEncodeVideoFrameInternal();
    }

    private RunnableC35745hv(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f77205a = videoDemuxerFFmpeg;
    }
}
