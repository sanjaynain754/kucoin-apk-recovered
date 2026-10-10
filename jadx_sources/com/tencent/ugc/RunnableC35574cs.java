package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.cs */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35574cs implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner f76917a;

    /* JADX INFO: renamed from: b */
    private final int f76918b;

    /* JADX INFO: renamed from: c */
    private final String f76919c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79070a(TXVideoJoiner tXVideoJoiner, int i11, String str) {
        return new RunnableC35574cs(tXVideoJoiner, i11, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76917a.joinVideoInternal(this.f76918b, this.f76919c, true);
    }

    private RunnableC35574cs(TXVideoJoiner tXVideoJoiner, int i11, String str) {
        this.f76917a = tXVideoJoiner;
        this.f76918b = i11;
        this.f76919c = str;
    }
}
