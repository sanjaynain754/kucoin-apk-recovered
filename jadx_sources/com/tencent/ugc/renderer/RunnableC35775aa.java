package com.tencent.ugc.renderer;

import com.tencent.liteav.base.util.EnumC34747l;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.aa */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35775aa implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77276a;

    /* JADX INFO: renamed from: b */
    private final EnumC34747l f77277b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79262a(VideoRenderer videoRenderer, EnumC34747l enumC34747l) {
        return new RunnableC35775aa(videoRenderer, enumC34747l);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setRenderRotation$6(this.f77276a, this.f77277b);
    }

    private RunnableC35775aa(VideoRenderer videoRenderer, EnumC34747l enumC34747l) {
        this.f77276a = videoRenderer;
        this.f77277b = enumC34747l;
    }
}
