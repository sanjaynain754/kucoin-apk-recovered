package com.tencent.ugc.videobase.chain;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.chain.f */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35813f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImageFilterChain f77355a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79299a(TXCGPUImageFilterChain tXCGPUImageFilterChain) {
        return new RunnableC35813f(tXCGPUImageFilterChain);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77355a.initFiltersAndInterceptors();
    }

    private RunnableC35813f(TXCGPUImageFilterChain tXCGPUImageFilterChain) {
        this.f77355a = tXCGPUImageFilterChain;
    }
}
