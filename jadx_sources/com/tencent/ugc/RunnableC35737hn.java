package com.tencent.ugc;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: renamed from: com.tencent.ugc.hn */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35737hn implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor.C35486b f77186a;

    /* JADX INFO: renamed from: b */
    private final EncodedVideoFrame f77187b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79231a(UGCVideoProcessor.C35486b c35486b, EncodedVideoFrame encodedVideoFrame) {
        return new RunnableC35737hn(c35486b, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.C35486b.m78988a(this.f77186a, this.f77187b);
    }

    private RunnableC35737hn(UGCVideoProcessor.C35486b c35486b, EncodedVideoFrame encodedVideoFrame) {
        this.f77186a = c35486b;
        this.f77187b = encodedVideoFrame;
    }
}
