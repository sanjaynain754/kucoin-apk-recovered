package com.tencent.liteav.base.system;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.f */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34718f implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34718f f73501a = new CallableC34718f();

    /* JADX INFO: renamed from: a */
    public static Callable m76063a() {
        return f73501a;
    }

    private CallableC34718f() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C34728p.m76073a(LiteavSystemInfo.sAppPackageName.m76143a());
    }
}
