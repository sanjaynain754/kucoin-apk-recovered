package com.sumsub.sentry;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.sumsub.sentry.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class ThreadFactoryC27862C implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public int f56900a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i11 = this.f56900a;
        this.f56900a = i11 + 1;
        Thread thread = new Thread(runnable, "SentryHostnameCache-" + i11);
        thread.setDaemon(true);
        return thread;
    }
}
