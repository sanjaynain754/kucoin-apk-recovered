package com.tencent.liteav.videoproducer.encoder;

import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.encoder.c */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34966c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C34965b f74773a;

    /* JADX INFO: renamed from: a */
    public static Runnable m76770a(C34965b c34965b) {
        return new RunnableC34966c(c34965b);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34965b c34965b = this.f74773a;
        if (c34965b.f74750e != null) {
            LiteavLog.m76093w(c34965b.f74746a, "onRequestRestart");
            c34965b.f74750e.mo76771a();
        }
    }

    private RunnableC34966c(C34965b c34965b) {
        this.f74773a = c34965b;
    }
}
