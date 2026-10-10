package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fs */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35688fs implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77096a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79182a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35688fs(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77096a.DecodeOrAppendMuteFrame();
    }

    private RunnableC35688fs(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77096a = uGCSingleFileAudioFrameProvider;
    }
}
