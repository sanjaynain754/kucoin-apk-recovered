package com.tencent.liteav.base;

import android.os.StrictMode;
import java.io.Closeable;

/* JADX INFO: renamed from: com.tencent.liteav.base.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34690b implements Closeable {

    /* JADX INFO: renamed from: a */
    private final StrictMode.ThreadPolicy f73382a;

    /* JADX INFO: renamed from: b */
    private final StrictMode.VmPolicy f73383b;

    private C34690b(StrictMode.ThreadPolicy threadPolicy) {
        this.f73382a = threadPolicy;
        this.f73383b = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f73382a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f73383b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C34690b m76040a() {
        return new C34690b(StrictMode.allowThreadDiskWrites(), (byte) 0);
    }

    private C34690b(StrictMode.ThreadPolicy threadPolicy, byte b11) {
        this(threadPolicy);
    }
}
