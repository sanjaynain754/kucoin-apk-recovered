package com.tencent.thumbplayer.tcmedia.utils;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.d */
/* JADX INFO: loaded from: classes64.dex */
public class C35424d {

    /* JADX INFO: renamed from: a */
    private long f76579a;

    /* JADX INFO: renamed from: b */
    private long f76580b;

    /* JADX INFO: renamed from: a */
    public void m78856a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f76579a = jElapsedRealtime;
        this.f76580b = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: b */
    public void m78857b() {
        this.f76580b = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: c */
    public long m78858c() {
        return SystemClock.elapsedRealtime() - this.f76580b;
    }

    /* JADX INFO: renamed from: d */
    public long m78859d() {
        return SystemClock.elapsedRealtime() - this.f76579a;
    }

    /* JADX INFO: renamed from: e */
    public long m78860e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = jElapsedRealtime - this.f76580b;
        this.f76580b = jElapsedRealtime;
        return j11;
    }
}
