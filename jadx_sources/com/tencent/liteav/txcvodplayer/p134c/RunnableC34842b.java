package com.tencent.liteav.txcvodplayer.p134c;

import com.tencent.liteav.txcvodplayer.p133b.C34836c;

/* JADX INFO: renamed from: com.tencent.liteav.txcvodplayer.c.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34842b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34841a f74018a;

    /* JADX INFO: renamed from: b */
    private final int f74019b;

    /* JADX INFO: renamed from: c */
    private final String f74020c;

    /* JADX INFO: renamed from: d */
    private final String f74021d;

    /* JADX INFO: renamed from: e */
    private final C34836c.b f74022e;

    /* JADX INFO: renamed from: a */
    public static Runnable m76421a(C34841a c34841a, int i11, String str, String str2, C34836c.b bVar) {
        return new RunnableC34842b(c34841a, i11, str, str2, bVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34841a.m76412a(this.f74018a, this.f74019b, this.f74020c, this.f74021d, this.f74022e);
    }

    private RunnableC34842b(C34841a c34841a, int i11, String str, String str2, C34836c.b bVar) {
        this.f74018a = c34841a;
        this.f74019b = i11;
        this.f74020c = str;
        this.f74021d = str2;
        this.f74022e = bVar;
    }
}
