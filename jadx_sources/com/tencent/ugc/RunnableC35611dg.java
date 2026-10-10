package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dg */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35611dg implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76972a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79107a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35611dg(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCImageProvider.lambda$initialize$0(this.f76972a);
    }

    private RunnableC35611dg(UGCImageProvider uGCImageProvider) {
        this.f76972a = uGCImageProvider;
    }
}
