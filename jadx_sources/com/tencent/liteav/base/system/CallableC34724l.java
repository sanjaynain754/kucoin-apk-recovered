package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.l */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34724l implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34724l f73507a = new CallableC34724l();

    /* JADX INFO: renamed from: a */
    public static Callable m76069a() {
        return f73507a;
    }

    private CallableC34724l() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.VERSION.RELEASE;
    }
}
