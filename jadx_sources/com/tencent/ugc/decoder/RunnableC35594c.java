package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35594c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HardwareVideoDecoder f76948a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79091a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new RunnableC35594c(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76948a.drainAndFeedFrame();
    }

    private RunnableC35594c(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f76948a = hardwareVideoDecoder;
    }
}
