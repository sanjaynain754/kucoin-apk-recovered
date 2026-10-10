package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dp */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35620dp implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76983a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79116a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35620dp(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76983a.decodeBitmapFrame();
    }

    private RunnableC35620dp(UGCImageProvider uGCImageProvider) {
        this.f76983a = uGCImageProvider;
    }
}
