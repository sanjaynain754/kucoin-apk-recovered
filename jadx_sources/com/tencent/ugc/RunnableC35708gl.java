package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gl */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35708gl implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider.C354832 f77123a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79202a(UGCSingleFilePixelFrameProvider.C354832 c354832) {
        return new RunnableC35708gl(c354832);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCSingleFilePixelFrameProvider.C354832.m78985a(this.f77123a);
    }

    private RunnableC35708gl(UGCSingleFilePixelFrameProvider.C354832 c354832) {
        this.f77123a = c354832;
    }
}
