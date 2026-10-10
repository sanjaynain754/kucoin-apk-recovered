package com.tencent.bugly.proguard;

import android.view.FrameMetrics;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33644f7 {

    /* JADX INFO: renamed from: e */
    public static final long f69867e = 1000000;

    /* JADX INFO: renamed from: f */
    public static final long f69868f = 300000000000L;

    /* JADX INFO: renamed from: a */
    public long f69869a;

    /* JADX INFO: renamed from: b */
    public long f69870b;

    /* JADX INFO: renamed from: c */
    public long f69871c;

    /* JADX INFO: renamed from: d */
    public boolean f69872d = true;

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: a */
    public void m73011a(FrameMetrics frameMetrics) {
        try {
            this.f69872d = true;
            this.f69869a = frameMetrics.getMetric(10);
            this.f69870b = frameMetrics.getMetric(11);
            this.f69871c = frameMetrics.getMetric(8);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public long m73012b() {
        return this.f69869a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m73013c() {
        long j11 = this.f69869a;
        if (j11 > 0) {
            long j12 = this.f69870b;
            if (j12 > 0) {
                long j13 = this.f69871c;
                if (j13 >= 0 && j13 <= f69868f) {
                    long j14 = j12 - j11;
                    if (j14 >= 0 && j14 <= f69868f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean m73014d() {
        return this.f69872d;
    }

    /* JADX INFO: renamed from: a */
    public void m73010a(long j11, long j12, boolean z11) {
        this.f69871c = j12;
        this.f69869a = j11;
        this.f69870b = j11;
        this.f69872d = z11;
    }

    /* JADX INFO: renamed from: a */
    public long m73009a() {
        return (this.f69871c + this.f69870b) - this.f69869a;
    }
}
