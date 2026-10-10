package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35593b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HardwareVideoDecoder f76945a;

    /* JADX INFO: renamed from: b */
    private final Object f76946b;

    /* JADX INFO: renamed from: c */
    private final VideoDecoderListener f76947c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79090a(HardwareVideoDecoder hardwareVideoDecoder, Object obj, VideoDecoderListener videoDecoderListener) {
        return new RunnableC35593b(hardwareVideoDecoder, obj, videoDecoderListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76945a.startInternal(this.f76946b, this.f76947c);
    }

    private RunnableC35593b(HardwareVideoDecoder hardwareVideoDecoder, Object obj, VideoDecoderListener videoDecoderListener) {
        this.f76945a = hardwareVideoDecoder;
        this.f76946b = obj;
        this.f76947c = videoDecoderListener;
    }
}
