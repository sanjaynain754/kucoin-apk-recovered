package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.ct */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35575ct implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76920a;

    /* JADX INFO: renamed from: b */
    private final boolean f76921b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79071a(TXVideoJoiner tXVideoJoiner, boolean z11) {
        return new RunnableC35575ct(tXVideoJoiner, z11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76920a.mIsNeedEdit = this.f76921b;
    }

    private RunnableC35575ct(TXVideoJoiner tXVideoJoiner, boolean z11) {
        this.f76920a = tXVideoJoiner;
        this.f76921b = z11;
    }
}
