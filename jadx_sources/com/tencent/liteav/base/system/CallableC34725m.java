package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.m */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34725m implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34725m f73508a = new CallableC34725m();

    /* JADX INFO: renamed from: a */
    public static Callable m76070a() {
        return f73508a;
    }

    private CallableC34725m() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
