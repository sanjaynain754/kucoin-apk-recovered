package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bb */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35517bb implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76788a;

    /* JADX INFO: renamed from: b */
    private final int f76789b;

    /* JADX INFO: renamed from: c */
    private final String f76790c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79018a(TXVideoEditer tXVideoEditer, int i11, String str) {
        return new RunnableC35517bb(tXVideoEditer, i11, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$generateVideo$54(this.f76788a, this.f76789b, this.f76790c);
    }

    private RunnableC35517bb(TXVideoEditer tXVideoEditer, int i11, String str) {
        this.f76788a = tXVideoEditer;
        this.f76789b = i11;
        this.f76790c = str;
    }
}
