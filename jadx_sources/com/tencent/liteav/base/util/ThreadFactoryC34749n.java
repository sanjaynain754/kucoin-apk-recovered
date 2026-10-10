package com.tencent.liteav.base.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.n */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class ThreadFactoryC34749n implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    private final String f73555a;

    /* JADX INFO: renamed from: a */
    public static ThreadFactory m76138a(String str) {
        return new ThreadFactoryC34749n(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f73555a);
    }

    private ThreadFactoryC34749n(String str) {
        this.f73555a = str;
    }
}
