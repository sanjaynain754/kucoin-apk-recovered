package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.o */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34934o implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewSurfaceTextureListenerC34930k f74534a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76636a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        return new RunnableC34934o(textureViewSurfaceTextureListenerC34930k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC34930k.m76629c(this.f74534a);
    }

    private RunnableC34934o(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        this.f74534a = textureViewSurfaceTextureListenerC34930k;
    }
}
