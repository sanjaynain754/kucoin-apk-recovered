package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35529c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUGreenScreenFilter.C355261 f76808a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79029a(TXCGPUGreenScreenFilter.C355261 c355261) {
        return new RunnableC35529c(c355261);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUGreenScreenFilter.C355261.m79026a(this.f76808a);
    }

    private RunnableC35529c(TXCGPUGreenScreenFilter.C355261 c355261) {
        this.f76808a = c355261;
    }
}
