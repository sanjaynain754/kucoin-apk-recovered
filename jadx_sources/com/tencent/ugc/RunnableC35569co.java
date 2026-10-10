package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.co */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35569co implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76909a;

    /* JADX INFO: renamed from: b */
    private final String f76910b;

    /* JADX INFO: renamed from: c */
    private final int f76911c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79066a(TXVideoJoiner tXVideoJoiner, String str, int i11) {
        return new RunnableC35569co(tXVideoJoiner, str, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.lambda$joinVideo$9(this.f76909a, this.f76910b, this.f76911c);
    }

    private RunnableC35569co(TXVideoJoiner tXVideoJoiner, String str, int i11) {
        this.f76909a = tXVideoJoiner;
        this.f76910b = str;
        this.f76911c = i11;
    }
}
