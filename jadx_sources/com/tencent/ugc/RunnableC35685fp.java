package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fp */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35685fp implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77092a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79179a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35685fp(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77092a.DecodeOrAppendMuteFrame();
    }

    private RunnableC35685fp(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77092a = uGCSingleFileAudioFrameProvider;
    }
}
