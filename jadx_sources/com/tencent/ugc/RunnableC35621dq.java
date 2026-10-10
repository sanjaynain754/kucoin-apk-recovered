package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35621dq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76984a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79117a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35621dq(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76984a.decodeBitmapFrame();
    }

    private RunnableC35621dq(UGCImageProvider uGCImageProvider) {
        this.f76984a = uGCImageProvider;
    }
}
