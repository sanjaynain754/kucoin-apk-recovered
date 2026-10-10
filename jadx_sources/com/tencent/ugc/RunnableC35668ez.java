package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ez */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35668ez implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFileAudioFrameProvider f77063a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79162a(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        return new RunnableC35668ez(uGCMultiFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFileAudioFrameProvider.lambda$stop$1(this.f77063a);
    }

    private RunnableC35668ez(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        this.f77063a = uGCMultiFileAudioFrameProvider;
    }
}
