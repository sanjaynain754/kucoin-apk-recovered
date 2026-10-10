package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fr */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35687fr implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77095a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79181a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35687fr(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77095a.DecodeOrAppendMuteFrame();
    }

    private RunnableC35687fr(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77095a = uGCSingleFileAudioFrameProvider;
    }
}
