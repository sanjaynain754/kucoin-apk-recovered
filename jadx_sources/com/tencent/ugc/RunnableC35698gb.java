package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.gb */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35698gb implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCSingleFilePixelFrameProvider f77111a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79192a(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        return new RunnableC35698gb(uGCSingleFilePixelFrameProvider);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77111a.decodeInternal();
    }

    private RunnableC35698gb(UGCSingleFilePixelFrameProvider uGCSingleFilePixelFrameProvider) {
        this.f77111a = uGCSingleFilePixelFrameProvider;
    }
}
