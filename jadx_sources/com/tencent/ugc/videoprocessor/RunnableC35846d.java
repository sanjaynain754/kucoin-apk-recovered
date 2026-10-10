package com.tencent.ugc.videoprocessor;

import com.tencent.liteav.base.util.Size;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.videoprocessor.d */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35846d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final WatermarkProcessor f77420a;

    /* JADX INFO: renamed from: b */
    private final List f77421b;

    /* JADX INFO: renamed from: c */
    private final Size f77422c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79330a(WatermarkProcessor watermarkProcessor, List list, Size size) {
        return new RunnableC35846d(watermarkProcessor, list, size);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77420a.setAnimatedPasterListInternal(this.f77421b, this.f77422c);
    }

    private RunnableC35846d(WatermarkProcessor watermarkProcessor, List list, Size size) {
        this.f77420a = watermarkProcessor;
        this.f77421b = list;
        this.f77422c = size;
    }
}
