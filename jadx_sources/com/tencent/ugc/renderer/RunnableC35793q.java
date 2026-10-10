package com.tencent.ugc.renderer;

import com.tencent.ugc.videobase.base.TakeSnapshotListener;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.q */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35793q implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77304a;

    /* JADX INFO: renamed from: b */
    private final RenderViewHelperInterface f77305b;

    /* JADX INFO: renamed from: c */
    private final ByteBuffer f77306c;

    /* JADX INFO: renamed from: d */
    private final int f77307d;

    /* JADX INFO: renamed from: e */
    private final int f77308e;

    /* JADX INFO: renamed from: f */
    private final TakeSnapshotListener f77309f;

    /* JADX INFO: renamed from: a */
    public static Runnable m79280a(VideoRenderer videoRenderer, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i11, int i12, TakeSnapshotListener takeSnapshotListener) {
        return new RunnableC35793q(videoRenderer, renderViewHelperInterface, byteBuffer, i11, i12, takeSnapshotListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$snapshotVideoFrameFromFrameBuffer$12(this.f77304a, this.f77305b, this.f77306c, this.f77307d, this.f77308e, this.f77309f);
    }

    private RunnableC35793q(VideoRenderer videoRenderer, RenderViewHelperInterface renderViewHelperInterface, ByteBuffer byteBuffer, int i11, int i12, TakeSnapshotListener takeSnapshotListener) {
        this.f77304a = videoRenderer;
        this.f77305b = renderViewHelperInterface;
        this.f77306c = byteBuffer;
        this.f77307d = i11;
        this.f77308e = i12;
        this.f77309f = takeSnapshotListener;
    }
}
