package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dh */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35612dh implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76973a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79108a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35612dh(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76973a.decodeBitmapFrame();
    }

    private RunnableC35612dh(UGCImageProvider uGCImageProvider) {
        this.f76973a = uGCImageProvider;
    }
}
