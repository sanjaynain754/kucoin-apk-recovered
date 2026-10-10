package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35686fq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77093a;

    /* JADX INFO: renamed from: b */
    private final long f77094b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79180a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider, long j11) {
        return new RunnableC35686fq(uGCSingleFileAudioFrameProvider, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider = this.f77093a;
        uGCSingleFileAudioFrameProvider.seekToInFileTime(uGCSingleFileAudioFrameProvider.timelineToFileTime(this.f77094b));
    }

    private RunnableC35686fq(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider, long j11) {
        this.f77093a = uGCSingleFileAudioFrameProvider;
        this.f77094b = j11;
    }
}
