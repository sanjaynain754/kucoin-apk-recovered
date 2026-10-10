package com.tencent.ugc.encoder;

import com.tencent.ugc.videobase.common.EncodedVideoFrame;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.h */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35656h implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController.C356471 f77043a;

    /* JADX INFO: renamed from: b */
    private final EncodedVideoFrame f77044b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79150a(UGCVideoEncodeController.C356471 c356471, EncodedVideoFrame encodedVideoFrame) {
        return new RunnableC35656h(c356471, encodedVideoFrame);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoEncodeController.C356471.m79142a(this.f77043a, this.f77044b);
    }

    private RunnableC35656h(UGCVideoEncodeController.C356471 c356471, EncodedVideoFrame encodedVideoFrame) {
        this.f77043a = c356471;
        this.f77044b = encodedVideoFrame;
    }
}
