package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.k */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34723k implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34723k f73506a = new CallableC34723k();

    /* JADX INFO: renamed from: a */
    public static Callable m76068a() {
        return f73506a;
    }

    private CallableC34723k() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.HARDWARE;
    }
}
