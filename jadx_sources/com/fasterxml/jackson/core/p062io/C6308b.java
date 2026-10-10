package com.fasterxml.jackson.core.p062io;

import java.util.Arrays;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.b */
/* JADX INFO: compiled from: CharTypes.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6308b {

    /* JADX INFO: renamed from: a */
    public static final char[] f10068a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f10069b;

    /* JADX INFO: renamed from: c */
    public static final int[] f10070c;

    /* JADX INFO: renamed from: d */
    public static final int[] f10071d;

    /* JADX INFO: renamed from: e */
    public static final int[] f10072e;

    /* JADX INFO: renamed from: f */
    public static final int[] f10073f;

    /* JADX INFO: renamed from: g */
    public static final int[] f10074g;

    /* JADX INFO: renamed from: h */
    public static final int[] f10075h;

    /* JADX INFO: renamed from: i */
    public static final int[] f10076i;

    /* JADX INFO: renamed from: j */
    public static final int[] f10077j;

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.io.b$a */
    /* JADX INFO: compiled from: CharTypes.java */
    public static class a {

        /* JADX INFO: renamed from: b */
        public static final a f10078b = new a();

        /* JADX INFO: renamed from: a */
        public int[][] f10079a = new int[128][];

        /* JADX INFO: renamed from: a */
        public int[] m10973a(int i11) {
            int[] iArrCopyOf = this.f10079a[i11];
            if (iArrCopyOf == null) {
                iArrCopyOf = Arrays.copyOf(C6308b.f10076i, 128);
                if (iArrCopyOf[i11] == 0) {
                    iArrCopyOf[i11] = -1;
                }
                this.f10079a[i11] = iArrCopyOf;
            }
            return iArrCopyOf;
        }
    }

    static {
        int i11;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f10068a = charArray;
        int length = charArray.length;
        f10069b = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            f10069b[i12] = (byte) f10068a[i12];
        }
        int[] iArr = new int[256];
        for (int i13 = 0; i13 < 32; i13++) {
            iArr[i13] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f10070c = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i14 = 128; i14 < 256; i14++) {
            if ((i14 & 224) == 192) {
                i11 = 2;
            } else if ((i14 & 240) == 224) {
                i11 = 3;
            } else {
                i11 = (i14 & 248) == 240 ? 4 : -1;
            }
            iArr2[i14] = i11;
        }
        f10071d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i15 = 33; i15 < 256; i15++) {
            if (Character.isJavaIdentifierPart((char) i15)) {
                iArr3[i15] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f10072e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        f10073f = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f10071d;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        f10074g = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        f10075h = iArr7;
        int[] iArr8 = new int[128];
        for (int i16 = 0; i16 < 32; i16++) {
            iArr8[i16] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f10076i = iArr8;
        int[] iArr9 = new int[256];
        f10077j = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i17 = 0; i17 < 10; i17++) {
            f10077j[i17 + 48] = i17;
        }
        for (int i18 = 0; i18 < 6; i18++) {
            int[] iArr10 = f10077j;
            int i19 = i18 + 10;
            iArr10[i18 + 97] = i19;
            iArr10[i18 + 65] = i19;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m10961a(StringBuilder sb2, String str) {
        int[] iArr = f10076i;
        int length = iArr.length;
        int length2 = str.length();
        for (int i11 = 0; i11 < length2; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb2.append(cCharAt);
            } else {
                sb2.append('\\');
                int i12 = iArr[cCharAt];
                if (i12 < 0) {
                    sb2.append('u');
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f10068a;
                    sb2.append(cArr[cCharAt >> 4]);
                    sb2.append(cArr[cCharAt & 15]);
                } else {
                    sb2.append((char) i12);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10962b(int i11) {
        return f10077j[i11 & 255];
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m10963c() {
        return (byte[]) f10069b.clone();
    }

    /* JADX INFO: renamed from: d */
    public static char[] m10964d() {
        return (char[]) f10068a.clone();
    }

    /* JADX INFO: renamed from: e */
    public static int[] m10965e() {
        return f10076i;
    }

    /* JADX INFO: renamed from: f */
    public static int[] m10966f(int i11) {
        return i11 == 34 ? f10076i : a.f10078b.m10973a(i11);
    }

    /* JADX INFO: renamed from: g */
    public static int[] m10967g() {
        return f10074g;
    }

    /* JADX INFO: renamed from: h */
    public static int[] m10968h() {
        return f10070c;
    }

    /* JADX INFO: renamed from: i */
    public static int[] m10969i() {
        return f10072e;
    }

    /* JADX INFO: renamed from: j */
    public static int[] m10970j() {
        return f10071d;
    }

    /* JADX INFO: renamed from: k */
    public static int[] m10971k() {
        return f10073f;
    }

    /* JADX INFO: renamed from: l */
    public static char m10972l(int i11) {
        return f10068a[i11];
    }
}
