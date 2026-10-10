package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fa */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35670fa implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFileAudioFrameProvider f77066a;

    /* JADX INFO: renamed from: b */
    private final long f77067b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79164a(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider, long j11) {
        return new RunnableC35670fa(uGCMultiFileAudioFrameProvider, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFileAudioFrameProvider.lambda$seekTo$2(this.f77066a, this.f77067b);
    }

    private RunnableC35670fa(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider, long j11) {
        this.f77066a = uGCMultiFileAudioFrameProvider;
        this.f77067b = j11;
    }
}
