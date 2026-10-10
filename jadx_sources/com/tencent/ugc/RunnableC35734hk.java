package com.tencent.ugc;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: renamed from: com.tencent.ugc.hk */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35734hk implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77176a;

    /* JADX INFO: renamed from: b */
    private final int f77177b;

    /* JADX INFO: renamed from: c */
    private final int f77178c;

    /* JADX INFO: renamed from: d */
    private final GLConstants.GLScaleType f77179d;

    /* JADX INFO: renamed from: a */
    public static Runnable m79228a(UGCVideoProcessor uGCVideoProcessor, int i11, int i12, GLConstants.GLScaleType gLScaleType) {
        return new RunnableC35734hk(uGCVideoProcessor, i11, i12, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setOutputSize$4(this.f77176a, this.f77177b, this.f77178c, this.f77179d);
    }

    private RunnableC35734hk(UGCVideoProcessor uGCVideoProcessor, int i11, int i12, GLConstants.GLScaleType gLScaleType) {
        this.f77176a = uGCVideoProcessor;
        this.f77177b = i11;
        this.f77178c = i12;
        this.f77179d = gLScaleType;
    }
}
