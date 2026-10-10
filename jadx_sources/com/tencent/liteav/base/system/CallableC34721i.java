package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.i */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34721i implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34721i f73504a = new CallableC34721i();

    /* JADX INFO: renamed from: a */
    public static Callable m76066a() {
        return f73504a;
    }

    private CallableC34721i() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.BRAND;
    }
}
