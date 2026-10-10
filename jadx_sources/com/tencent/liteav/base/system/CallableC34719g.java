package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.g */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34719g implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34719g f73502a = new CallableC34719g();

    /* JADX INFO: renamed from: a */
    public static Callable m76064a() {
        return f73502a;
    }

    private CallableC34719g() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.SUPPORTED_ABIS;
    }
}
