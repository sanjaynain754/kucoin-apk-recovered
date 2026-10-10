package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.j */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35786j implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewRenderHelper f77294a;

    /* JADX INFO: renamed from: b */
    private final boolean f77295b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79273a(TextureViewRenderHelper textureViewRenderHelper, boolean z11) {
        return new RunnableC35786j(textureViewRenderHelper, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.lambda$release$2(this.f77294a, this.f77295b);
    }

    private RunnableC35786j(TextureViewRenderHelper textureViewRenderHelper, boolean z11) {
        this.f77294a = textureViewRenderHelper;
        this.f77295b = z11;
    }
}
