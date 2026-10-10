package com.tencent.liteav.txcvodplayer.p134c;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.c.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34844d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34841a f74027a;

    /* JADX INFO: renamed from: b */
    private final String f74028b;

    /* JADX INFO: renamed from: c */
    private final long f74029c;

    /* JADX INFO: renamed from: a */
    public static Runnable m76423a(C34841a c34841a, String str, long j11) {
        return new RunnableC34844d(c34841a, str, j11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34841a.m76413a(this.f74027a, this.f74028b, this.f74029c);
    }

    private RunnableC34844d(C34841a c34841a, String str, long j11) {
        this.f74027a = c34841a;
        this.f74028b = str;
        this.f74029c = j11;
    }
}
