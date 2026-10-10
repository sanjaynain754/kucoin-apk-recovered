package com.tencent.ugc.videobase.filter;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.videobase.filter.a */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35815a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCGPUImagePerspectiveCorrectionFilter f77357a;

    /* JADX INFO: renamed from: b */
    private final List f77358b;

    /* JADX INFO: renamed from: c */
    private final List f77359c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79301a(TXCGPUImagePerspectiveCorrectionFilter tXCGPUImagePerspectiveCorrectionFilter, List list, List list2) {
        return new RunnableC35815a(tXCGPUImagePerspectiveCorrectionFilter, list, list2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXCGPUImagePerspectiveCorrectionFilter.lambda$setTransformPoints$0(this.f77357a, this.f77358b, this.f77359c);
    }

    private RunnableC35815a(TXCGPUImagePerspectiveCorrectionFilter tXCGPUImagePerspectiveCorrectionFilter, List list, List list2) {
        this.f77357a = tXCGPUImagePerspectiveCorrectionFilter;
        this.f77358b = list;
        this.f77359c = list2;
    }
}
