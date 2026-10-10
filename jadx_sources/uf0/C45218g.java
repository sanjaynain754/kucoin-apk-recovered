package uf0;

import java.util.Arrays;
import tf0.C44941b;

/* JADX INFO: renamed from: uf0.g */
/* JADX INFO: compiled from: BigendianEncoding.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45218g {

    /* JADX INFO: renamed from: a */
    public static final char[] f101740a = m99900b();

    /* JADX INFO: renamed from: b */
    public static final byte[] f101741b = m99899a();

    /* JADX INFO: renamed from: e */
    public static void m99903e(long j11, byte[] bArr, int i11) {
        C44941b.m99388a(bArr.length >= i11 + 8, "array too small");
        bArr[i11 + 7] = (byte) (j11 & 255);
        bArr[i11 + 6] = (byte) ((j11 >> 8) & 255);
        bArr[i11 + 5] = (byte) ((j11 >> 16) & 255);
        bArr[i11 + 4] = (byte) ((j11 >> 24) & 255);
        bArr[i11 + 3] = (byte) ((j11 >> 32) & 255);
        bArr[i11 + 2] = (byte) ((j11 >> 40) & 255);
        bArr[i11 + 1] = (byte) ((j11 >> 48) & 255);
        bArr[i11] = (byte) ((j11 >> 56) & 255);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m99899a() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < 16; i11++) {
            bArr["0123456789abcdef".charAt(i11)] = (byte) i11;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public static char[] m99900b() {
        char[] cArr = new char[512];
        for (int i11 = 0; i11 < 256; i11++) {
            cArr[i11] = "0123456789abcdef".charAt(i11 >>> 4);
            cArr[i11 | 256] = "0123456789abcdef".charAt(i11 & 15);
        }
        return cArr;
    }

    /* JADX INFO: renamed from: c */
    public static void m99901c(byte b11, char[] cArr, int i11) {
        int i12 = b11 & 255;
        char[] cArr2 = f101740a;
        cArr[i11] = cArr2[i12];
        cArr[i11 + 1] = cArr2[i12 | 256];
    }

    /* JADX INFO: renamed from: d */
    public static void m99902d(long j11, char[] cArr, int i11) {
        m99901c((byte) ((j11 >> 56) & 255), cArr, i11);
        m99901c((byte) ((j11 >> 48) & 255), cArr, i11 + 2);
        m99901c((byte) ((j11 >> 40) & 255), cArr, i11 + 4);
        m99901c((byte) ((j11 >> 32) & 255), cArr, i11 + 6);
        m99901c((byte) ((j11 >> 24) & 255), cArr, i11 + 8);
        m99901c((byte) ((j11 >> 16) & 255), cArr, i11 + 10);
        m99901c((byte) ((j11 >> 8) & 255), cArr, i11 + 12);
        m99901c((byte) (j11 & 255), cArr, i11 + 14);
    }
}
