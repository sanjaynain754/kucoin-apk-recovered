package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35596e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final HardwareVideoDecoder f76950a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79093a(HardwareVideoDecoder hardwareVideoDecoder) {
        return new RunnableC35596e(hardwareVideoDecoder);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76950a.stopInternal();
    }

    private RunnableC35596e(HardwareVideoDecoder hardwareVideoDecoder) {
        this.f76950a = hardwareVideoDecoder;
    }
}
