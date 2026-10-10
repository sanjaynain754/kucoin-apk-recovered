package com.tencent.ugc.beauty.gpufilters;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.beauty.gpufilters.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35530d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPULookupFilterGroup f76809a;

    /* JADX INFO: renamed from: b */
    private final float f76810b;

    /* JADX INFO: renamed from: c */
    private final float f76811c;

    /* JADX INFO: renamed from: d */
    private final float f76812d;

    /* JADX INFO: renamed from: e */
    private final Bitmap f76813e;

    /* JADX INFO: renamed from: f */
    private final Bitmap f76814f;

    /* JADX INFO: renamed from: a */
    public static Runnable m79030a(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f11, float f12, float f13, Bitmap bitmap, Bitmap bitmap2) {
        return new RunnableC35530d(tXCGPULookupFilterGroup, f11, f12, f13, bitmap, bitmap2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPULookupFilterGroup.lambda$setBitmap$0(this.f76809a, this.f76810b, this.f76811c, this.f76812d, this.f76813e, this.f76814f);
    }

    private RunnableC35530d(TXCGPULookupFilterGroup tXCGPULookupFilterGroup, float f11, float f12, float f13, Bitmap bitmap, Bitmap bitmap2) {
        this.f76809a = tXCGPULookupFilterGroup;
        this.f76810b = f11;
        this.f76811c = f12;
        this.f76812d = f13;
        this.f76813e = bitmap;
        this.f76814f = bitmap2;
    }
}
