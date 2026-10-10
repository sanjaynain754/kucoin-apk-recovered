package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35595d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HardwareVideoDecoder f76949a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79092a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new RunnableC35595d(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76949a.drainAndFeedFrame();
    }

    private RunnableC35595d(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f76949a = hardwareVideoDecoder;
    }
}
