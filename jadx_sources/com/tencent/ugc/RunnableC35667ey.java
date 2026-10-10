package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ey */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35667ey implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMultiFileAudioFrameProvider f77062a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79161a(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        return new RunnableC35667ey(uGCMultiFileAudioFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMultiFileAudioFrameProvider.lambda$start$0(this.f77062a);
    }

    private RunnableC35667ey(UGCMultiFileAudioFrameProvider uGCMultiFileAudioFrameProvider) {
        this.f77062a = uGCMultiFileAudioFrameProvider;
    }
}
