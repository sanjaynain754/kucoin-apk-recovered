package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ft */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35689ft implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77097a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79183a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35689ft(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77097a.DecodeOrAppendMuteFrame();
    }

    private RunnableC35689ft(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77097a = uGCSingleFileAudioFrameProvider;
    }
}
