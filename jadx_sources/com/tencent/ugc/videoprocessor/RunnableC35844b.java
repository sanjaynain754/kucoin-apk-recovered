package com.tencent.ugc.videoprocessor;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditConstants;

/* JADX INFO: renamed from: com.tencent.ugc.videoprocessor.b */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35844b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final WatermarkProcessor f77412a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f77413b;

    /* JADX INFO: renamed from: c */
    private final TXVideoEditConstants.TXRect f77414c;

    /* JADX INFO: renamed from: d */
    private final long f77415d;

    /* JADX INFO: renamed from: e */
    private final int f77416e;

    /* JADX INFO: renamed from: a */
    public static Runnable m79328a(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j11, int i11) {
        return new RunnableC35844b(watermarkProcessor, bitmap, tXRect, j11, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77412a.setTailWaterMarkInternal(this.f77413b, this.f77414c, this.f77415d, this.f77416e);
    }

    private RunnableC35844b(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect, long j11, int i11) {
        this.f77412a = watermarkProcessor;
        this.f77413b = bitmap;
        this.f77414c = tXRect;
        this.f77415d = j11;
        this.f77416e = i11;
    }
}
