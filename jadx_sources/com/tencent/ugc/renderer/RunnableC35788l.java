package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.l */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35788l implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewRenderHelper f77297a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79275a(TextureViewRenderHelper textureViewRenderHelper) {
        return new RunnableC35788l(textureViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper textureViewRenderHelper = this.f77297a;
        textureViewRenderHelper.updateTextureViewRenderMatrix(textureViewRenderHelper.mTextureView);
    }

    private RunnableC35788l(TextureViewRenderHelper textureViewRenderHelper) {
        this.f77297a = textureViewRenderHelper;
    }
}
