package com.tencent.liteav.txcplayer.common;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.liteav.txcplayer.common.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34809a extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor f73730a;

    private C34809a() {
        super(1, 3, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
    }

    /* JADX INFO: renamed from: a */
    public static synchronized ThreadPoolExecutor m76230a() {
        try {
            ThreadPoolExecutor threadPoolExecutor = f73730a;
            if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
                f73730a = new C34809a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f73730a;
    }
}
