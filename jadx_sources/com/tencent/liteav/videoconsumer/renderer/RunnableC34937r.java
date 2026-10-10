package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.r */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34937r implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewSurfaceTextureListenerC34930k f74537a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76639a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        return new RunnableC34937r(textureViewSurfaceTextureListenerC34930k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC34930k.m76632f(this.f74537a);
    }

    private RunnableC34937r(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        this.f74537a = textureViewSurfaceTextureListenerC34930k;
    }
}
