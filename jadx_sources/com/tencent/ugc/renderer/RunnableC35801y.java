package com.tencent.ugc.renderer;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.y */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35801y implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77328a;

    /* JADX INFO: renamed from: b */
    private final List f77329b;

    /* JADX INFO: renamed from: c */
    private final List f77330c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79288a(VideoRenderer videoRenderer, List list, List list2) {
        return new RunnableC35801y(videoRenderer, list, list2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoRenderer.lambda$setPerspectiveCorrectionPoints$4(this.f77328a, this.f77329b, this.f77330c);
    }

    private RunnableC35801y(VideoRenderer videoRenderer, List list, List list2) {
        this.f77328a = videoRenderer;
        this.f77329b = list;
        this.f77330c = list2;
    }
}
