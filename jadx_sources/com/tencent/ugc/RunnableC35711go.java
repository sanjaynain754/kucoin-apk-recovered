package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.go */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35711go implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCThumbnailGenerator f77126a;

    /* JADX INFO: renamed from: b */
    private final List f77127b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79205a(UGCThumbnailGenerator uGCThumbnailGenerator, List list) {
        return new RunnableC35711go(uGCThumbnailGenerator, list);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCThumbnailGenerator.lambda$setVideoSourceList$1(this.f77126a, this.f77127b);
    }

    private RunnableC35711go(UGCThumbnailGenerator uGCThumbnailGenerator, List list) {
        this.f77126a = uGCThumbnailGenerator;
        this.f77127b = list;
    }
}
