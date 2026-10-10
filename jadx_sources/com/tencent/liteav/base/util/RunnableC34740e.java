package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.e */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34740e implements Runnable {

    /* JADX INFO: renamed from: a */
    private final CustomHandler f73530a;

    /* JADX INFO: renamed from: b */
    private final MessageQueue.IdleHandler f73531b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76106a(CustomHandler customHandler, MessageQueue.IdleHandler idleHandler) {
        return new RunnableC34740e(customHandler, idleHandler);
    }

    @Override // java.lang.Runnable
    public final void run() {
        CustomHandler.lambda$quitLooper$3(this.f73530a, this.f73531b);
    }

    private RunnableC34740e(CustomHandler customHandler, MessageQueue.IdleHandler idleHandler) {
        this.f73530a = customHandler;
        this.f73531b = idleHandler;
    }
}
