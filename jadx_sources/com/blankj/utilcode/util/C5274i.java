package com.blankj.utilcode.util;

/* JADX INFO: renamed from: com.blankj.utilcode.util.i */
/* JADX INFO: compiled from: ConvertUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5274i {

    /* JADX INFO: renamed from: a */
    public static final char[] f6548a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static final char[] f6549b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static String m6233a(byte[] bArr) {
        return m6234b(bArr, true);
    }

    /* JADX INFO: renamed from: b */
    public static String m6234b(byte[] bArr, boolean z11) {
        if (bArr == null) {
            return "";
        }
        char[] cArr = z11 ? f6548a : f6549b;
        int length = bArr.length;
        if (length <= 0) {
            return "";
        }
        char[] cArr2 = new char[length << 1];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            cArr2[i11] = cArr[(b11 >> 4) & 15];
            i11 += 2;
            cArr2[i12] = cArr[b11 & 15];
        }
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: c */
    public static int m6235c(float f11) {
        return C5299u0.m6484g(f11);
    }
}
