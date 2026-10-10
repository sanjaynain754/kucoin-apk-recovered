package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.m */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34932m implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewSurfaceTextureListenerC34930k f74531a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76634a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        return new RunnableC34932m(textureViewSurfaceTextureListenerC34930k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74531a.m76622a();
    }

    private RunnableC34932m(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        this.f74531a = textureViewSurfaceTextureListenerC34930k;
    }
}
