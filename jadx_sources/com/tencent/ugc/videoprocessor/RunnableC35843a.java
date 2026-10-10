package com.tencent.ugc.videoprocessor;

import android.graphics.Bitmap;
import com.tencent.ugc.TXVideoEditConstants;

/* JADX INFO: renamed from: com.tencent.ugc.videoprocessor.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35843a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final WatermarkProcessor f77409a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f77410b;

    /* JADX INFO: renamed from: c */
    private final TXVideoEditConstants.TXRect f77411c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79327a(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        return new RunnableC35843a(watermarkProcessor, bitmap, tXRect);
    }

    @Override // java.lang.Runnable
    public final void run() {
        WatermarkProcessor.lambda$setWaterMark$0(this.f77409a, this.f77410b, this.f77411c);
    }

    private RunnableC35843a(WatermarkProcessor watermarkProcessor, Bitmap bitmap, TXVideoEditConstants.TXRect tXRect) {
        this.f77409a = watermarkProcessor;
        this.f77410b = bitmap;
        this.f77411c = tXRect;
    }
}
