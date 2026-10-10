package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.dd */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35586dd implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner.C354751 f76936a;

    /* JADX INFO: renamed from: a */
    public static Runnable m79082a(TXVideoJoiner.C354751 c354751) {
        return new RunnableC35586dd(c354751);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.this.stopPlayInternal();
    }

    private RunnableC35586dd(TXVideoJoiner.C354751 c354751) {
        this.f76936a = c354751;
    }
}
