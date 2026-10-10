package com.tencent.ugc.videoprocessor;

import com.tencent.liteav.base.util.Size;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.videoprocessor.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35845c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final WatermarkProcessor f77417a;

    /* JADX INFO: renamed from: b */
    private final List f77418b;

    /* JADX INFO: renamed from: c */
    private final Size f77419c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79329a(WatermarkProcessor watermarkProcessor, List list, Size size) {
        return new RunnableC35845c(watermarkProcessor, list, size);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77417a.setSubtitleListInternal(this.f77418b, this.f77419c);
    }

    private RunnableC35845c(WatermarkProcessor watermarkProcessor, List list, Size size) {
        this.f77417a = watermarkProcessor;
        this.f77418b = list;
        this.f77419c = size;
    }
}
