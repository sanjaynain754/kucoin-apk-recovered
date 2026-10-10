package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hu */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35744hu implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoDemuxerFFmpeg f77204a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79238a(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        return new RunnableC35744hu(videoDemuxerFFmpeg);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77204a.getNextEncodeVideoFrameInternal();
    }

    private RunnableC35744hu(VideoDemuxerFFmpeg videoDemuxerFFmpeg) {
        this.f77204a = videoDemuxerFFmpeg;
    }
}
