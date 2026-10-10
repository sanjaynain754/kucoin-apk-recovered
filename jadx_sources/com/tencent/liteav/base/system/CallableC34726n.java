package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.n */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34726n implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34726n f73509a = new CallableC34726n();

    /* JADX INFO: renamed from: a */
    public static Callable m76071a() {
        return f73509a;
    }

    private CallableC34726n() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.BOARD;
    }
}
