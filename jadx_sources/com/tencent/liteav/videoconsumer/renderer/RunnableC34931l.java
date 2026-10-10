package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.l */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34931l implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewSurfaceTextureListenerC34930k f74530a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76633a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        return new RunnableC34931l(textureViewSurfaceTextureListenerC34930k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74530a.m76622a();
    }

    private RunnableC34931l(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        this.f74530a = textureViewSurfaceTextureListenerC34930k;
    }
}
