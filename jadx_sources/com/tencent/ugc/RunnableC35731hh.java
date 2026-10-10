package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hh */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35731hh implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77169a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79225a(UGCVideoProcessor uGCVideoProcessor) {
        return new RunnableC35731hh(uGCVideoProcessor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77169a.stopEncoder();
    }

    private RunnableC35731hh(UGCVideoProcessor uGCVideoProcessor) {
        this.f77169a = uGCVideoProcessor;
    }
}
