package com.tencent.ugc;

import java.util.List;

/* JADX INFO: renamed from: com.tencent.ugc.dv */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35626dv implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f76994a;

    /* JADX INFO: renamed from: b */
    private final List f76995b;

    /* JADX INFO: renamed from: c */
    private final int f76996c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79122a(UGCMediaListSource uGCMediaListSource, List list, int i11) {
        return new RunnableC35626dv(uGCMediaListSource, list, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setPictureList$6(this.f76994a, this.f76995b, this.f76996c);
    }

    private RunnableC35626dv(UGCMediaListSource uGCMediaListSource, List list, int i11) {
        this.f76994a = uGCMediaListSource;
        this.f76995b = list;
        this.f76996c = i11;
    }
}
