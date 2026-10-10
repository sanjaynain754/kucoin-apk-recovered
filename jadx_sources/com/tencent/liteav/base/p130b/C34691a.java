package com.tencent.liteav.base.p130b;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.tencent.liteav.base.b.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34691a {

    /* JADX INFO: renamed from: a */
    public long f73384a = 0;

    /* JADX INFO: renamed from: b */
    private final long f73385b;

    public C34691a(long j11) {
        this.f73385b = j11;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76041a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = this.f73384a;
        if (j11 != 0 && jElapsedRealtime - j11 <= this.f73385b) {
            return false;
        }
        this.f73384a = SystemClock.elapsedRealtime();
        return true;
    }
}
