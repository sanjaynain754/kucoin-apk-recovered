package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fh */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35677fh implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCRotateScaleFilter f77080a;

    /* JADX INFO: renamed from: b */
    private final float f77081b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79171a(UGCRotateScaleFilter uGCRotateScaleFilter, float f11) {
        return new RunnableC35677fh(uGCRotateScaleFilter, f11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77080a.setRotateInternal(null, this.f77081b);
    }

    private RunnableC35677fh(UGCRotateScaleFilter uGCRotateScaleFilter, float f11) {
        this.f77080a = uGCRotateScaleFilter;
        this.f77081b = f11;
    }
}
