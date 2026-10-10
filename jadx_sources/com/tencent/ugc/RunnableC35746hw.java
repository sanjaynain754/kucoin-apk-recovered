package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hw */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35746hw implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoDemuxerFFmpeg f77206a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79240a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new RunnableC35746hw(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77206a.getNextEncodeVideoFrameInternal();
    }

    private RunnableC35746hw(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f77206a = videoDemuxerFFmpeg;
    }
}
