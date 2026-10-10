package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.f */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35597f implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HardwareVideoDecoder f76951a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79094a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new RunnableC35597f(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76951a.abandonDecodingFramesInternal();
    }

    private RunnableC35597f(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f76951a = hardwareVideoDecoder;
    }
}
