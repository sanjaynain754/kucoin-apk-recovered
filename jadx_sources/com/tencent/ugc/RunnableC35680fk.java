package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fk */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35680fk implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77087a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79174a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35680fk(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFileAudioFrameProvider.lambda$initialize$0(this.f77087a);
    }

    private RunnableC35680fk(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77087a = uGCSingleFileAudioFrameProvider;
    }
}
