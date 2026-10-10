package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gz */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35722gz implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77147a;

    /* JADX INFO: renamed from: b */
    private final int f77148b;

    /* JADX INFO: renamed from: c */
    private final int f77149c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79216a(UGCVideoProcessor uGCVideoProcessor, int i11, int i12) {
        return new RunnableC35722gz(uGCVideoProcessor, i11, i12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77147a.mVideoProcessManager.setBeautyFilter(this.f77148b, this.f77149c);
    }

    private RunnableC35722gz(UGCVideoProcessor uGCVideoProcessor, int i11, int i12) {
        this.f77147a = uGCVideoProcessor;
        this.f77148b = i11;
        this.f77149c = i12;
    }
}
