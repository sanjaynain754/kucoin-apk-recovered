package com.tencent.ugc.renderer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.k */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35787k implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewRenderHelper f77296a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79274a(TextureViewRenderHelper textureViewRenderHelper) {
        return new RunnableC35787k(textureViewRenderHelper);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.lambda$checkViewAvailability$3(this.f77296a);
    }

    private RunnableC35787k(TextureViewRenderHelper textureViewRenderHelper) {
        this.f77296a = textureViewRenderHelper;
    }
}
