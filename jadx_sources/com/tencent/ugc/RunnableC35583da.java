package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.da */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35583da implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76931a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79079a(TXVideoJoiner tXVideoJoiner) {
        return new RunnableC35583da(tXVideoJoiner);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76931a.stopPlayInternal();
    }

    private RunnableC35583da(TXVideoJoiner tXVideoJoiner) {
        this.f76931a = tXVideoJoiner;
    }
}
