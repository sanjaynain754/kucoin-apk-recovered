package com.tencent.ugc.beauty.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.beauty.decoder.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35521a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoFrameReader f76796a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79022a(VideoFrameReader videoFrameReader) {
        return new RunnableC35521a(videoFrameReader);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76796a.threadLoop();
    }

    private RunnableC35521a(VideoFrameReader videoFrameReader) {
        this.f76796a = videoFrameReader;
    }
}
