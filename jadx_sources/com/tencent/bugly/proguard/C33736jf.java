package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.jf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33736jf {

    /* JADX INFO: renamed from: e */
    public static final int f70399e = 120;

    /* JADX INFO: renamed from: b */
    public long f70401b;

    /* JADX INFO: renamed from: c */
    public final long[] f70402c = new long[120];

    /* JADX INFO: renamed from: d */
    public final long[] f70403d = new long[120];

    /* JADX INFO: renamed from: a */
    public int f70400a = 0;

    /* JADX INFO: renamed from: a */
    public void m73564a(long j11, long j12, long j13) {
        this.f70401b = j11;
        int i11 = this.f70400a;
        if (i11 >= 0 && i11 < 120) {
            this.f70402c[i11] = j12;
            this.f70403d[i11] = j13;
        }
        this.f70400a = (i11 + 1) % 120;
    }

    /* JADX INFO: renamed from: b */
    public long m73565b() {
        return this.f70401b;
    }

    public C33736jf() {
        for (int i11 = 0; i11 < 120; i11++) {
            this.f70402c[i11] = 0;
            this.f70403d[i11] = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public float m73563a() {
        long j11 = 0;
        long j12 = 0;
        for (int i11 = 0; i11 < 120; i11++) {
            long j13 = this.f70402c[i11];
            if (j13 != 0) {
                j11 += j13;
                j12 += this.f70403d[i11];
            }
        }
        if (j11 > 0) {
            return ((j11 - j12) / j11) * 60.0f;
        }
        return 0.0f;
    }
}
