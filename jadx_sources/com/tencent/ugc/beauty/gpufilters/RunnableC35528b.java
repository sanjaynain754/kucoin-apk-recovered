package com.tencent.ugc.beauty.gpufilters;

/* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35528b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUGreenScreenFilter f76805a;

    /* JADX INFO: renamed from: b */
    private final String f76806b;

    /* JADX INFO: renamed from: c */
    private final boolean f76807c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79028a(TXCGPUGreenScreenFilter tXCGPUGreenScreenFilter, String str, boolean z11) {
        return new RunnableC35528b(tXCGPUGreenScreenFilter, str, z11);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        TXCGPUGreenScreenFilter.lambda$setGreenScreenFile$0(this.f76805a, this.f76806b, this.f76807c);
    }

    private RunnableC35528b(TXCGPUGreenScreenFilter tXCGPUGreenScreenFilter, String str, boolean z11) {
        this.f76805a = tXCGPUGreenScreenFilter;
        this.f76806b = str;
        this.f76807c = z11;
    }
}
