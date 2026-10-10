package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dk */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35615dk implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76976a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79111a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35615dk(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCImageProvider.lambda$start$2(this.f76976a);
    }

    private RunnableC35615dk(UGCImageProvider uGCImageProvider) {
        this.f76976a = uGCImageProvider;
    }
}
