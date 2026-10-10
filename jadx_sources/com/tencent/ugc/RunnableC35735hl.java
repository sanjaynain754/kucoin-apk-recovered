package com.tencent.ugc;

import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: renamed from: com.tencent.ugc.hl */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35735hl implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77180a;

    /* JADX INFO: renamed from: b */
    private final DisplayTarget f77181b;

    /* JADX INFO: renamed from: c */
    private final GLConstants.GLScaleType f77182c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79229a(UGCVideoProcessor uGCVideoProcessor, DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        return new RunnableC35735hl(uGCVideoProcessor, displayTarget, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$setDisplayView$5(this.f77180a, this.f77181b, this.f77182c);
    }

    private RunnableC35735hl(UGCVideoProcessor uGCVideoProcessor, DisplayTarget displayTarget, GLConstants.GLScaleType gLScaleType) {
        this.f77180a = uGCVideoProcessor;
        this.f77181b = displayTarget;
        this.f77182c = gLScaleType;
    }
}
