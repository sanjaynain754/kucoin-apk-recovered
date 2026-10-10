package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.hq */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35740hq implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCWatermarkAlphaTextureFilter f77192a;

    /* JADX INFO: renamed from: b */
    private final int f77193b;

    /* JADX INFO: renamed from: c */
    private final int f77194c;

    /* JADX INFO: renamed from: d */
    private final int f77195d;

    /* JADX INFO: renamed from: e */
    private final float f77196e;

    /* JADX INFO: renamed from: f */
    private final float f77197f;

    /* JADX INFO: renamed from: g */
    private final float f77198g;

    /* JADX INFO: renamed from: a */
    public static Runnable m79234a(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, int i11, int i12, int i13, float f11, float f12, float f13) {
        return new RunnableC35740hq(uGCWatermarkAlphaTextureFilter, i11, i12, i13, f11, f12, f13);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCWatermarkAlphaTextureFilter.lambda$setTextureWatermark$1(this.f77192a, this.f77193b, this.f77194c, this.f77195d, this.f77196e, this.f77197f, this.f77198g);
    }

    private RunnableC35740hq(UGCWatermarkAlphaTextureFilter uGCWatermarkAlphaTextureFilter, int i11, int i12, int i13, float f11, float f12, float f13) {
        this.f77192a = uGCWatermarkAlphaTextureFilter;
        this.f77193b = i11;
        this.f77194c = i12;
        this.f77195d = i13;
        this.f77196e = f11;
        this.f77197f = f12;
        this.f77198g = f13;
    }
}
