package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fo */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35684fo implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77091a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79178a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35684fo(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77091a.stopInternal();
    }

    private RunnableC35684fo(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77091a = uGCSingleFileAudioFrameProvider;
    }
}
