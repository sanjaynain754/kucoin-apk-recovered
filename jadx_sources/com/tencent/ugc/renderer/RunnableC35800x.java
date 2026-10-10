package com.tencent.ugc.renderer;

import com.tencent.ugc.videobase.base.TakeSnapshotListener;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.x */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35800x implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77326a;

    /* JADX INFO: renamed from: b */
    private final TakeSnapshotListener f77327b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79287a(VideoRenderer videoRenderer, TakeSnapshotListener takeSnapshotListener) {
        return new RunnableC35800x(videoRenderer, takeSnapshotListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$takeSnapshot$3(this.f77326a, this.f77327b);
    }

    private RunnableC35800x(VideoRenderer videoRenderer, TakeSnapshotListener takeSnapshotListener) {
        this.f77326a = videoRenderer;
        this.f77327b = takeSnapshotListener;
    }
}
