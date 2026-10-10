package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ab */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35490ab implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76730a;

    /* JADX INFO: renamed from: a */
    public static Runnable m78991a(TXVideoEditer tXVideoEditer) {
        return new RunnableC35490ab(tXVideoEditer);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$deleteLastEffect$29(this.f76730a);
    }

    private RunnableC35490ab(TXVideoEditer tXVideoEditer) {
        this.f76730a = tXVideoEditer;
    }
}
