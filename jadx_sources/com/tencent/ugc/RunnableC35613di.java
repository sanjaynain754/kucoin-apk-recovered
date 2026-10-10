package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.di */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35613di implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCImageProvider f76974a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79109a(UGCImageProvider uGCImageProvider) {
        return new RunnableC35613di(uGCImageProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76974a.decodeBitmapFrame();
    }

    private RunnableC35613di(UGCImageProvider uGCImageProvider) {
        this.f76974a = uGCImageProvider;
    }
}
