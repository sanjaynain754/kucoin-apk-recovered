package com.tencent.ugc.renderer;

import android.view.TextureView;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.i */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35785i implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewRenderHelper f77292a;

    /* JADX INFO: renamed from: b */
    private final TextureView f77293b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79272a(TextureViewRenderHelper textureViewRenderHelper, TextureView textureView) {
        return new RunnableC35785i(textureViewRenderHelper, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77292a.setup(this.f77293b);
    }

    private RunnableC35785i(TextureViewRenderHelper textureViewRenderHelper, TextureView textureView) {
        this.f77292a = textureViewRenderHelper;
        this.f77293b = textureView;
    }
}
