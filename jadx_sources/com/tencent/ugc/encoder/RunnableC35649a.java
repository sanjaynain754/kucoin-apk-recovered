package com.tencent.ugc.encoder;

/* JADX INFO: renamed from: com.tencent.ugc.encoder.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35649a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoEncodeController f77034a;

    /* JADX INFO: renamed from: b */
    private final VideoEncodeParams f77035b;

    /* JADX INFO: renamed from: c */
    private final UGCVideoEncoderJNI.UGCVideoEncoderListener f77036c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79143a(UGCVideoEncodeController uGCVideoEncodeController, VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        return new RunnableC35649a(uGCVideoEncodeController, videoEncodeParams, uGCVideoEncoderListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoEncodeController.lambda$start$0(this.f77034a, this.f77035b, this.f77036c);
    }

    private RunnableC35649a(UGCVideoEncodeController uGCVideoEncodeController, VideoEncodeParams videoEncodeParams, UGCVideoEncoderJNI.UGCVideoEncoderListener uGCVideoEncoderListener) {
        this.f77034a = uGCVideoEncodeController;
        this.f77035b = videoEncodeParams;
        this.f77036c = uGCVideoEncoderListener;
    }
}
