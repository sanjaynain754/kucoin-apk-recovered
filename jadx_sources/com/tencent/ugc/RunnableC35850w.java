package com.tencent.ugc;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.tencent.ugc.w */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35850w implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f77432a;

    /* JADX INFO: renamed from: b */
    private final int f77433b;

    /* JADX INFO: renamed from: c */
    private final long f77434c;

    /* JADX INFO: renamed from: d */
    private final long f77435d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f77436e;

    /* JADX INFO: renamed from: a */
    public static Runnable m79332a(TXVideoEditer tXVideoEditer, int i11, long j11, long j12, AtomicBoolean atomicBoolean) {
        return new RunnableC35850w(tXVideoEditer, i11, j11, j12, atomicBoolean);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setTransitionEffect$25(this.f77432a, this.f77433b, this.f77434c, this.f77435d, this.f77436e);
    }

    private RunnableC35850w(TXVideoEditer tXVideoEditer, int i11, long j11, long j12, AtomicBoolean atomicBoolean) {
        this.f77432a = tXVideoEditer;
        this.f77433b = i11;
        this.f77434c = j11;
        this.f77435d = j12;
        this.f77436e = atomicBoolean;
    }
}
