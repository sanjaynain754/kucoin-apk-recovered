package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fl */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35681fl implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77088a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79175a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35681fl(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77088a.DecodeOrAppendMuteFrame();
    }

    private RunnableC35681fl(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77088a = uGCSingleFileAudioFrameProvider;
    }
}
