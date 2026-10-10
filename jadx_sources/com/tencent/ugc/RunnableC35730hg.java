package com.tencent.ugc;

import com.tencent.ugc.encoder.UGCVideoEncoderJNI;

/* JADX INFO: renamed from: com.tencent.ugc.hg */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35730hg implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77166a;

    /* JADX INFO: renamed from: b */
    private final boolean f77167b;

    /* JADX INFO: renamed from: c */
    private final UGCVideoEncoderJNI.EncoderType f77168c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79224a(UGCVideoProcessor uGCVideoProcessor, boolean z11, UGCVideoEncoderJNI.EncoderType encoderType) {
        return new RunnableC35730hg(uGCVideoProcessor, z11, encoderType);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoProcessor.lambda$start$1(this.f77166a, this.f77167b, this.f77168c);
    }

    private RunnableC35730hg(UGCVideoProcessor uGCVideoProcessor, boolean z11, UGCVideoEncoderJNI.EncoderType encoderType) {
        this.f77166a = uGCVideoProcessor;
        this.f77167b = z11;
        this.f77168c = encoderType;
    }
}
