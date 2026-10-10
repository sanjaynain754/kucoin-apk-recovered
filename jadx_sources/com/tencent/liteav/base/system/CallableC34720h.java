package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.h */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34720h implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34720h f73503a = new CallableC34720h();

    /* JADX INFO: renamed from: a */
    public static Callable m76065a() {
        return f73503a;
    }

    private CallableC34720h() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.MODEL;
    }
}
