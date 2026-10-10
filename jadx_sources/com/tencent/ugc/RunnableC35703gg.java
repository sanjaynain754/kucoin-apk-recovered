package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gg */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35703gg implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider.C354821 f77117a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79197a(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        return new RunnableC35703gg(c354821);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.this.decodeInternal();
    }

    private RunnableC35703gg(UGCSingleFilePixelFrameProvider.C354821 c354821) {
        this.f77117a = c354821;
    }
}
