package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dm */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35617dm implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76978a;

    /* JADX INFO: renamed from: b */
    private final long f76979b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79113a(UGCImageProvider uGCImageProvider, long j11) {
        return new RunnableC35617dm(uGCImageProvider, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCImageProvider.lambda$seekTo$4(this.f76978a, this.f76979b);
    }

    private RunnableC35617dm(UGCImageProvider uGCImageProvider, long j11) {
        this.f76978a = uGCImageProvider;
        this.f76979b = j11;
    }
}
