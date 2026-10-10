package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dj */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35614dj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76975a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79110a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35614dj(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCImageProvider.lambda$uninitialize$1(this.f76975a);
    }

    private RunnableC35614dj(UGCImageProvider uGCImageProvider) {
        this.f76975a = uGCImageProvider;
    }
}
