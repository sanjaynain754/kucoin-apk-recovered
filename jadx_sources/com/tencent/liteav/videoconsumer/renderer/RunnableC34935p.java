package com.tencent.liteav.videoconsumer.renderer;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.p */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34935p implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewSurfaceTextureListenerC34930k f74535a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76637a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        return new RunnableC34935p(textureViewSurfaceTextureListenerC34930k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC34930k.m76627b(this.f74535a);
    }

    private RunnableC34935p(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        this.f74535a = textureViewSurfaceTextureListenerC34930k;
    }
}
