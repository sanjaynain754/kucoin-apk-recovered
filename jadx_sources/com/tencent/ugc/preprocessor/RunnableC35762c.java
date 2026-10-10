package com.tencent.ugc.preprocessor;

/* JADX INFO: renamed from: com.tencent.ugc.preprocessor.c */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35762c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final BeautyProcessor f77246a;

    /* JADX INFO: renamed from: b */
    private final String f77247b;

    /* JADX INFO: renamed from: c */
    private final int f77248c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79252a(BeautyProcessor beautyProcessor, String str, int i11) {
        return new RunnableC35762c(beautyProcessor, str, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77246a.updateStatsInternal(this.f77247b, this.f77248c);
    }

    private RunnableC35762c(BeautyProcessor beautyProcessor, String str, int i11) {
        this.f77246a = beautyProcessor;
        this.f77247b = str;
        this.f77248c = i11;
    }
}
