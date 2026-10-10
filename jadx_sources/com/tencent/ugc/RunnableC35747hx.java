package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hx */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35747hx implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoDemuxerFFmpeg f77207a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79241a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new RunnableC35747hx(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77207a.getNextEncodeVideoFrameInternal();
    }

    private RunnableC35747hx(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f77207a = videoDemuxerFFmpeg;
    }
}
