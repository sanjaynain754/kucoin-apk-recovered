package com.tencent.ugc.renderer;

import com.tencent.liteav.videobase.videobase.DisplayTarget;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.w */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35799w implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77323a;

    /* JADX INFO: renamed from: b */
    private final DisplayTarget f77324b;

    /* JADX INFO: renamed from: c */
    private final boolean f77325c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79286a(VideoRenderer videoRenderer, DisplayTarget displayTarget, boolean z11) {
        return new RunnableC35799w(videoRenderer, displayTarget, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77323a.setDisplayViewInternal(this.f77324b, this.f77325c);
    }

    private RunnableC35799w(VideoRenderer videoRenderer, DisplayTarget displayTarget, boolean z11) {
        this.f77323a = videoRenderer;
        this.f77324b = displayTarget;
        this.f77325c = z11;
    }
}
