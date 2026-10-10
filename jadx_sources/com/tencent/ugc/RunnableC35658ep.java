package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ep */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35658ep implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77046a;

    /* JADX INFO: renamed from: b */
    private final int f77047b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79152a(UGCMediaListSource uGCMediaListSource, int i11) {
        return new RunnableC35658ep(uGCMediaListSource, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77046a.mTailWaterMarkDurationMs = ((long) this.f77047b) * 1000;
    }

    private RunnableC35658ep(UGCMediaListSource uGCMediaListSource, int i11) {
        this.f77046a = uGCMediaListSource;
        this.f77047b = i11;
    }
}
