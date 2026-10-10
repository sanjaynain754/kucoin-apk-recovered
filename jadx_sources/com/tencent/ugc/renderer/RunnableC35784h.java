package com.tencent.ugc.renderer;

import android.view.TextureView;
import com.tencent.rtmp.p148ui.TXCloudVideoView;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.h */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35784h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TextureViewRenderHelper f77289a;

    /* JADX INFO: renamed from: b */
    private final TXCloudVideoView f77290b;

    /* JADX INFO: renamed from: c */
    private final TextureView f77291c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79271a(TextureViewRenderHelper textureViewRenderHelper, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        return new RunnableC35784h(textureViewRenderHelper, tXCloudVideoView, textureView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewRenderHelper.lambda$new$0(this.f77289a, this.f77290b, this.f77291c);
    }

    private RunnableC35784h(TextureViewRenderHelper textureViewRenderHelper, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        this.f77289a = textureViewRenderHelper;
        this.f77290b = tXCloudVideoView;
        this.f77291c = textureView;
    }
}
