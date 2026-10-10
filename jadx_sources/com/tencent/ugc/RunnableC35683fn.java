package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fn */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35683fn implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFileAudioFrameProvider f77090a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79177a(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        return new RunnableC35683fn(uGCSingleFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77090a.startInternal();
    }

    private RunnableC35683fn(UGCSingleFileAudioFrameProvider uGCSingleFileAudioFrameProvider) {
        this.f77090a = uGCSingleFileAudioFrameProvider;
    }
}
