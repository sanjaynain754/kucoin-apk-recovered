package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fb */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35671fb implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFileAudioFrameProvider f77068a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79165a(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        return new RunnableC35671fb(uGCMultiFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77068a.readFrameToQueue();
    }

    private RunnableC35671fb(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        this.f77068a = uGCMultiFileAudioFrameProvider;
    }
}
