package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dl */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35616dl implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76977a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79112a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35616dl(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCImageProvider.lambda$stop$3(this.f76977a);
    }

    private RunnableC35616dl(UGCImageProvider uGCImageProvider) {
        this.f76977a = uGCImageProvider;
    }
}
