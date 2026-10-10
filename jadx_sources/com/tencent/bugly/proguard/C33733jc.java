package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.meta.DropFrameResultMeta;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.jc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33733jc {

    /* JADX INFO: renamed from: a */
    public static final long f70369a = 10;

    /* JADX INFO: renamed from: b */
    public static final long f70370b = 500;

    /* JADX INFO: renamed from: c */
    public static final long f70371c = 43200000;

    /* JADX INFO: renamed from: d */
    public static final int f70372d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f70373e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f70374f = 2;

    /* JADX INFO: renamed from: g */
    public static final int f70375g = 4;

    /* JADX INFO: renamed from: h */
    public static final int f70376h = 8;

    /* JADX INFO: renamed from: i */
    public static final int f70377i = 16;

    /* JADX INFO: renamed from: j */
    public static final int f70378j = 32;

    /* JADX INFO: renamed from: k */
    public static final int f70379k = 64;

    /* JADX INFO: renamed from: l */
    public static final int f70380l = 128;

    /* JADX INFO: renamed from: a */
    public static int m73551a(DropFrameResultMeta dropFrameResultMeta) {
        if (dropFrameResultMeta == null || m73552a(dropFrameResultMeta, 500L)) {
            return 1;
        }
        int i11 = m73555b(dropFrameResultMeta.refreshCount) <= 0 ? 64 : 0;
        return m73555b(dropFrameResultMeta.refreshDuration) <= 0 ? i11 | 128 : i11;
    }

    /* JADX INFO: renamed from: b */
    public static int m73554b(DropFrameResultMeta dropFrameResultMeta) {
        if (dropFrameResultMeta == null || m73552a(dropFrameResultMeta, 10L)) {
            return 1;
        }
        int iM73556c = m73556c(dropFrameResultMeta);
        if (dropFrameResultMeta.totalDuration > f70371c) {
            iM73556c |= 2;
        }
        return m73555b(dropFrameResultMeta.refreshDuration) > dropFrameResultMeta.totalDuration ? iM73556c | 128 : iM73556c;
    }

    /* JADX INFO: renamed from: c */
    public static int m73556c(DropFrameResultMeta dropFrameResultMeta) {
        int i11 = dropFrameResultMeta.suspendDuration < 0 ? 4 : 0;
        if (dropFrameResultMeta.hitchesDuration < 0) {
            i11 |= 8;
        }
        if (m73553a(dropFrameResultMeta.refreshCount)) {
            i11 |= 16;
        }
        return m73553a(dropFrameResultMeta.refreshDuration) ? i11 | 32 : i11;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73552a(@NotNull DropFrameResultMeta dropFrameResultMeta, long j11) {
        long j12 = dropFrameResultMeta.totalDuration;
        return j12 < j11 || j12 < dropFrameResultMeta.suspendDuration || j12 < dropFrameResultMeta.hitchesDuration;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73553a(long[] jArr) {
        for (long j11 : jArr) {
            if (j11 < 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static long m73555b(long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        return j11;
    }
}
