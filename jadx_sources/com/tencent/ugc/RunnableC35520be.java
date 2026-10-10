package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.be */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35520be implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76794a;

    /* JADX INFO: renamed from: b */
    private final TXVideoJoiner.DurationControlMode f76795b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79021a(TXVideoEditer tXVideoEditer, TXVideoJoiner.DurationControlMode durationControlMode) {
        return new RunnableC35520be(tXVideoEditer, durationControlMode);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76794a.mMediaListSource.setDurationControlMode(this.f76795b);
    }

    private RunnableC35520be(TXVideoEditer tXVideoEditer, TXVideoJoiner.DurationControlMode durationControlMode) {
        this.f76794a = tXVideoEditer;
        this.f76795b = durationControlMode;
    }
}
