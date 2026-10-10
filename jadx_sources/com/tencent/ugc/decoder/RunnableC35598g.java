package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.g */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35598g implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HardwareVideoDecoder f76952a;

    /* JADX INFO: renamed from: b */
    private final VideoDecoderDef.ConsumerScene f76953b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79095a(HardwareVideoDecoder hardwareVideoDecoder, VideoDecoderDef.ConsumerScene consumerScene) {
        return new RunnableC35598g(hardwareVideoDecoder, consumerScene);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HardwareVideoDecoder.lambda$setScene$1(this.f76952a, this.f76953b);
    }

    private RunnableC35598g(HardwareVideoDecoder hardwareVideoDecoder, VideoDecoderDef.ConsumerScene consumerScene) {
        this.f76952a = hardwareVideoDecoder;
        this.f76953b = consumerScene;
    }
}
