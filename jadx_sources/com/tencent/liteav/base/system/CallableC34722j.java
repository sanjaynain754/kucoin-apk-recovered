package com.tencent.liteav.base.system;

import android.os.Build;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.tencent.liteav.base.system.j */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class CallableC34722j implements Callable {

    /* JADX INFO: renamed from: a */
    private static final CallableC34722j f73505a = new CallableC34722j();

    /* JADX INFO: renamed from: a */
    public static Callable m76067a() {
        return f73505a;
    }

    private CallableC34722j() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return Build.MANUFACTURER;
    }
}
