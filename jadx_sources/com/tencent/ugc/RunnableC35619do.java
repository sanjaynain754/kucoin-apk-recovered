package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.do */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35619do implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76982a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79115a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35619do(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76982a.decodeBitmapFrame();
    }

    private RunnableC35619do(UGCImageProvider uGCImageProvider) {
        this.f76982a = uGCImageProvider;
    }
}
