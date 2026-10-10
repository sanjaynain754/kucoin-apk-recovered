package com.tencent.liteav.base.util;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.r */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34753r implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34748m.a f73562a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76142a(C34748m.a aVar) {
        return new RunnableC34753r(aVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34748m.a aVar = this.f73562a;
        C34748m.this.f73547a.execute(aVar.f73551b);
    }

    private RunnableC34753r(C34748m.a aVar) {
        this.f73562a = aVar;
    }
}
