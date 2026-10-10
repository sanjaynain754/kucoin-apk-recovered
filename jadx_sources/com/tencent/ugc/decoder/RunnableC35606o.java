package com.tencent.ugc.decoder;

/* JADX INFO: renamed from: com.tencent.ugc.decoder.o */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35606o implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoDecodeController.C355901 f76964a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79102a(UGCVideoDecodeController.C355901 c355901) {
        return new RunnableC35606o(c355901);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCVideoDecodeController.C355901.m79085a(this.f76964a);
    }

    private RunnableC35606o(UGCVideoDecodeController.C355901 c355901) {
        this.f76964a = c355901;
    }
}
