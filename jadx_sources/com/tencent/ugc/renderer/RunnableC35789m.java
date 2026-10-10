package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.m */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35789m implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewRenderHelper.TextureViewSurfaceTextureListenerC357731 f77298a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79276a(TextureViewRenderHelper.TextureViewSurfaceTextureListenerC357731 textureViewSurfaceTextureListenerC357731) {
        return new RunnableC35789m(textureViewSurfaceTextureListenerC357731);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.this.notifyFirstFrameRendered();
    }

    private RunnableC35789m(TextureViewRenderHelper.TextureViewSurfaceTextureListenerC357731 textureViewSurfaceTextureListenerC357731) {
        this.f77298a = textureViewSurfaceTextureListenerC357731;
    }
}
