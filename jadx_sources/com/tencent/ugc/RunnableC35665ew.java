package com.tencent.ugc;

import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.tencent.ugc.ew */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35665ew implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCMediaListSource f77058a;

    /* JADX INFO: renamed from: b */
    private final TXVideoJoiner.DurationControlMode f77059b;

    /* JADX INFO: renamed from: c */
    private final FutureTask f77060c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79159a(UGCMediaListSource uGCMediaListSource, TXVideoJoiner.DurationControlMode durationControlMode, FutureTask futureTask) {
        return new RunnableC35665ew(uGCMediaListSource, durationControlMode, futureTask);
    }

    @Override // java.lang.Runnable
    public final void run() {
        UGCMediaListSource.lambda$setDurationControlMode$3(this.f77058a, this.f77059b, this.f77060c);
    }

    private RunnableC35665ew(UGCMediaListSource uGCMediaListSource, TXVideoJoiner.DurationControlMode durationControlMode, FutureTask futureTask) {
        this.f77058a = uGCMediaListSource;
        this.f77059b = durationControlMode;
        this.f77060c = futureTask;
    }
}
