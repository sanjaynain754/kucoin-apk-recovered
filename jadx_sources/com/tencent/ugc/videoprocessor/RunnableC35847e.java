package com.tencent.ugc.videoprocessor;

import com.tencent.liteav.base.util.Size;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.videoprocessor.e */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35847e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final WatermarkProcessor f77423a;

    /* JADX INFO: renamed from: b */
    private final List f77424b;

    /* JADX INFO: renamed from: c */
    private final Size f77425c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79331a(WatermarkProcessor watermarkProcessor, List list, Size size) {
        return new RunnableC35847e(watermarkProcessor, list, size);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77423a.setPasterListInternal(this.f77424b, this.f77425c);
    }

    private RunnableC35847e(WatermarkProcessor watermarkProcessor, List list, Size size) {
        this.f77423a = watermarkProcessor;
        this.f77424b = list;
        this.f77425c = size;
    }
}
