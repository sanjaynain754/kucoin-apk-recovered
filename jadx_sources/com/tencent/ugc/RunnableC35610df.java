package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.df */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35610df implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoJoiner.C354773 f76969a;

    /* JADX INFO: renamed from: b */
    private final int f76970b;

    /* JADX INFO: renamed from: c */
    private final String f76971c;

    /* JADX INFO: renamed from: a */
    public static Runnable m79106a(TXVideoJoiner.C354773 c354773, int i11, String str) {
        return new RunnableC35610df(c354773, i11, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoJoiner.C354773.m78978a(this.f76969a, this.f76970b, this.f76971c);
    }

    private RunnableC35610df(TXVideoJoiner.C354773 c354773, int i11, String str) {
        this.f76969a = c354773;
        this.f76970b = i11;
        this.f76971c = str;
    }
}
