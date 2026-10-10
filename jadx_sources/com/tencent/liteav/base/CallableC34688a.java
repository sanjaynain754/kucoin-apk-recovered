package com.tencent.liteav.base;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.a */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34688a implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34688a f73375a = new CallableC34688a();

    /* JADX INFO: renamed from: a */
    public static Callable m76038a() {
        return f73375a;
    }

    private CallableC34688a() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return PathUtils.setPrivateDataDirectorySuffixInternal();
    }
}
