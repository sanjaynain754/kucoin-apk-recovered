package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hr */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35741hr implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoDemuxerFFmpeg f77199a;

    /* JADX INFO: renamed from: b */
    private final String f77200b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79235a(VideoDemuxerFFmpeg videoDemuxerFFmpeg, String str) {
        return new RunnableC35741hr(videoDemuxerFFmpeg, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoDemuxerFFmpeg.lambda$open$0(this.f77199a, this.f77200b);
    }

    private RunnableC35741hr(VideoDemuxerFFmpeg videoDemuxerFFmpeg, String str) {
        this.f77199a = videoDemuxerFFmpeg;
        this.f77200b = str;
    }
}
