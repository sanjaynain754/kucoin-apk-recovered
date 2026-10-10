package com.tencent.liteav.base.util;

import com.tencent.liteav.base.ContextUtils;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.k */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34746k implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34746k f73540a = new CallableC34746k();

    /* JADX INFO: renamed from: a */
    public static Callable m76129a() {
        return f73540a;
    }

    private CallableC34746k() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Boolean.valueOf(C34745j.m76120a(ContextUtils.getApplicationContext()));
    }
}
