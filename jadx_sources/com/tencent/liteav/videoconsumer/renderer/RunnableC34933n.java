package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.n */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34933n implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewSurfaceTextureListenerC34930k f74532a;

    /* JADX INFO: renamed from: b */
    private final boolean f74533b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76635a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k, boolean z11) {
        return new RunnableC34933n(textureViewSurfaceTextureListenerC34930k, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC34930k.m76625a(this.f74532a, this.f74533b);
    }

    private RunnableC34933n(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k, boolean z11) {
        this.f74532a = textureViewSurfaceTextureListenerC34930k;
        this.f74533b = z11;
    }
}
