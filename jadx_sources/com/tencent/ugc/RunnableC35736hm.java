package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hm */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35736hm implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor.C354841 f77183a;

    /* JADX INFO: renamed from: b */
    private final int f77184b;

    /* JADX INFO: renamed from: c */
    private final int f77185c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79230a(UGCVideoProcessor.C354841 c354841, int i11, int i12) {
        return new RunnableC35736hm(c354841, i11, i12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.this.mVideoProcessManager.setOutputSize(this.f77184b, this.f77185c);
    }

    private RunnableC35736hm(UGCVideoProcessor.C354841 c354841, int i11, int i12) {
        this.f77183a = c354841;
        this.f77184b = i11;
        this.f77185c = i12;
    }
}
