package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.wi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34006wi {

    /* JADX INFO: renamed from: a */
    public static final char[] f72468a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b */
    public static final byte[] f72469b = new byte[0];

    /* JADX INFO: renamed from: a */
    public static byte m75397a(char c11) {
        int i11;
        if (c11 >= '0' && c11 <= '9') {
            i11 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i11 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                return (byte) 0;
            }
            i11 = c11 - '7';
        }
        return (byte) i11;
    }

    /* JADX INFO: renamed from: a */
    public static String m75399a(byte b11) {
        char[] cArr = f72468a;
        return new String(new char[]{cArr[((byte) (b11 >>> 4)) & 15], cArr[b11 & 15]});
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m75403b(String str) {
        if (str == null || str.equals("")) {
            return f72469b;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            char cCharAt = str.charAt(i12);
            char cCharAt2 = str.charAt(i12 + 1);
            bArr[i11] = (byte) (m75397a(cCharAt2) + (m75397a(cCharAt) * 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static String m75400a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.flip();
        byte[] bArr = new byte[byteBufferDuplicate.limit()];
        byteBufferDuplicate.get(bArr);
        return m75401a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m75401a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f72468a;
            cArr[i12 + 1] = cArr2[b11 & 15];
            cArr[i12] = cArr2[((byte) (b11 >>> 4)) & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: a */
    public static byte m75398a(String str) {
        if (str == null || str.length() != 1) {
            return (byte) 0;
        }
        return m75397a(str.charAt(0));
    }

    /* JADX INFO: renamed from: a */
    public static void m75402a(String[] strArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i11 = 0; i11 < 1000000; i11++) {
            String strM75326a = C33986vi.m75326a("234", i11);
            if (!new String(m75403b(m75401a(strM75326a.getBytes()))).equals(strM75326a)) {
                System.out.println("error:".concat(strM75326a));
            }
        }
        System.out.println("use:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }
}
