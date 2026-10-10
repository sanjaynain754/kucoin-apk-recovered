package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.q */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34936q implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewSurfaceTextureListenerC34930k f74536a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76638a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        return new RunnableC34936q(textureViewSurfaceTextureListenerC34930k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC34930k.m76624a(this.f74536a);
    }

    private RunnableC34936q(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        this.f74536a = textureViewSurfaceTextureListenerC34930k;
    }
}
