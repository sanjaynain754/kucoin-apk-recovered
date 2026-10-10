package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fm */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35682fm implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77089a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79176a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35682fm(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFileAudioFrameProvider.lambda$uninitialize$1(this.f77089a);
    }

    private RunnableC35682fm(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77089a = uGCSingleFileAudioFrameProvider;
    }
}
