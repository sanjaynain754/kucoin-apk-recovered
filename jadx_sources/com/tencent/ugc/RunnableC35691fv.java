package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fv */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35691fv implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77099a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79185a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35691fv(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77099a.decodeInternal();
    }

    private RunnableC35691fv(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77099a = uGCSingleFilePixelFrameProvider;
    }
}
