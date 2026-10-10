package com.tencent.ugc;

import com.tencent.ugc.encoder.VideoEncodeParams;

/* JADX INFO: renamed from: com.tencent.ugc.gv */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35718gv implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77139a;

    /* JADX INFO: renamed from: b */
    private final VideoEncodeParams f77140b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79212a(UGCVideoProcessor uGCVideoProcessor, VideoEncodeParams videoEncodeParams) {
        return new RunnableC35718gv(uGCVideoProcessor, videoEncodeParams);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77139a.mVideoEncodeParams = this.f77140b;
    }

    private RunnableC35718gv(UGCVideoProcessor uGCVideoProcessor, VideoEncodeParams videoEncodeParams) {
        this.f77139a = uGCVideoProcessor;
        this.f77140b = videoEncodeParams;
    }
}
