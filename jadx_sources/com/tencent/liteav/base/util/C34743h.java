package com.tencent.liteav.base.util;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.h */
/* JADX INFO: loaded from: classes59.dex */
public final class C34743h {
    /* JADX INFO: renamed from: a */
    public static float m76114a(float f11, float f12) {
        if (f11 < f12) {
            return f12;
        }
        if (f11 > 1.0f) {
            return 1.0f;
        }
        return f11;
    }

    /* JADX INFO: renamed from: a */
    public static int m76115a(int i11, int i12, int i13) {
        if (i11 < i12) {
            return i12;
        }
        return i11 > i13 ? i13 : i11;
    }

    /* JADX INFO: renamed from: a */
    public static long m76116a(long j11, long j12, long j13) {
        if (j11 < j12) {
            return j12;
        }
        return j11 > j13 ? j13 : j11;
    }
}
