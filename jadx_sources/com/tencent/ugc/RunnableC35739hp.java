package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hp */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35739hp implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCWatermarkAlphaTextureFilter f77190a;

    /* JADX INFO: renamed from: b */
    private final boolean f77191b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79233a(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, boolean z11) {
        return new RunnableC35739hp(uGCWatermarkAlphaTextureFilter, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77190a.mIsShowBackImageMoment = this.f77191b;
    }

    private RunnableC35739hp(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, boolean z11) {
        this.f77190a = uGCWatermarkAlphaTextureFilter;
        this.f77191b = z11;
    }
}
