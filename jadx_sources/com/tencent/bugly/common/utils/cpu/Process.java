package com.tencent.bugly.common.utils.cpu;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class Process {

    /* JADX INFO: renamed from: a */
    public static final int f68516a = 255;

    /* JADX INFO: renamed from: b */
    public static final int f68517b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f68518c = 32;

    /* JADX INFO: renamed from: d */
    public static final int f68519d = 9;

    /* JADX INFO: renamed from: e */
    public static final int f68520e = 10;

    /* JADX INFO: renamed from: f */
    public static final int f68521f = 256;

    /* JADX INFO: renamed from: g */
    public static final int f68522g = 512;

    /* JADX INFO: renamed from: h */
    public static final int f68523h = 1024;

    /* JADX INFO: renamed from: i */
    public static final int f68524i = 2048;

    /* JADX INFO: renamed from: j */
    public static final int f68525j = 4096;

    /* JADX INFO: renamed from: k */
    public static final int f68526k = 8192;

    /* JADX INFO: renamed from: l */
    public static final int f68527l = 16384;

    public static native int[] getPids(String str, int[] iArr);

    public static native boolean parseProcLine(byte[] bArr, int i11, int i12, int[] iArr, String[] strArr, long[] jArr, float[] fArr);

    public static native boolean readProcFile(String str, int[] iArr, String[] strArr, long[] jArr, float[] fArr);

    public static native void readProcLines(String str, String[] strArr, long[] jArr);

    /* JADX INFO: renamed from: a */
    public static final int m72173a(int i11) {
        long[] jArr = {-1};
        readProcLines("/proc/" + i11 + "/status", new String[]{"Uid:"}, jArr);
        return (int) jArr[0];
    }

    static {
        System.loadLibrary("rmonitor_base");
    }
}
