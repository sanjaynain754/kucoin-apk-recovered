package com.tencent.liteav.base.util;

import android.os.MessageQueue;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class C34739d implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a */
    private final CustomHandler f73529a;

    /* JADX INFO: renamed from: a */
    public static MessageQueue.IdleHandler m76105a(CustomHandler customHandler) {
        return new C34739d(customHandler);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        return CustomHandler.lambda$quitLooper$2(this.f73529a);
    }

    private C34739d(CustomHandler customHandler) {
        this.f73529a = customHandler;
    }
}
