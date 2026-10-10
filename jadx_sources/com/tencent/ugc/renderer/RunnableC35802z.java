package com.tencent.ugc.renderer;

import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.z */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35802z implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77331a;

    /* JADX INFO: renamed from: b */
    private final GLConstants.GLScaleType f77332b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79289a(VideoRenderer videoRenderer, GLConstants.GLScaleType gLScaleType) {
        return new RunnableC35802z(videoRenderer, gLScaleType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setScaleType$5(this.f77331a, this.f77332b);
    }

    private RunnableC35802z(VideoRenderer videoRenderer, GLConstants.GLScaleType gLScaleType) {
        this.f77331a = videoRenderer;
        this.f77332b = gLScaleType;
    }
}
