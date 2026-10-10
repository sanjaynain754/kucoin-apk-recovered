package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.fi */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35678fi implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCRotateScaleFilter f77082a;

    /* JADX INFO: renamed from: b */
    private final float f77083b;

    /* JADX INFO: renamed from: c */
    private final float f77084c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79172a(UGCRotateScaleFilter uGCRotateScaleFilter, float f11, float f12) {
        return new RunnableC35678fi(uGCRotateScaleFilter, f11, f12);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCRotateScaleFilter uGCRotateScaleFilter = this.f77082a;
        uGCRotateScaleFilter.setScaleInternal(uGCRotateScaleFilter.setRotateInternal(null, this.f77083b), this.f77084c);
    }

    private RunnableC35678fi(UGCRotateScaleFilter uGCRotateScaleFilter, float f11, float f12) {
        this.f77082a = uGCRotateScaleFilter;
        this.f77083b = f11;
        this.f77084c = f12;
    }
}
