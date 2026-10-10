package com.tencent.liteav.txcvodplayer.p134c;

import com.tencent.liteav.txcvodplayer.p133b.C34836c;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.c.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34843c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34841a f74023a;

    /* JADX INFO: renamed from: b */
    private final int f74024b;

    /* JADX INFO: renamed from: c */
    private final String f74025c;

    /* JADX INFO: renamed from: d */
    private final C34836c.b f74026d;

    /* JADX INFO: renamed from: a */
    public static Runnable m76422a(C34841a c34841a, int i11, String str, C34836c.b bVar) {
        return new RunnableC34843c(c34841a, i11, str, bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34841a.m76411a(this.f74023a, this.f74024b, this.f74025c, this.f74026d);
    }

    private RunnableC34843c(C34841a c34841a, int i11, String str, C34836c.b bVar) {
        this.f74023a = c34841a;
        this.f74024b = i11;
        this.f74025c = str;
        this.f74026d = bVar;
    }
}
