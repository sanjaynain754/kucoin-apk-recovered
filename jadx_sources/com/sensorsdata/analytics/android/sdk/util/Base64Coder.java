package com.sensorsdata.analytics.android.sdk.util;

import com.sensorsdata.analytics.android.sdk.SALog;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes23.dex */
public class Base64Coder {
    public static final String CHARSET_UTF8 = "UTF-8";
    private static char[] map1 = new char[64];
    private static byte[] map2 = new byte[128];

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    static {
        char c11 = 'A';
        int i11 = 0;
        while (c11 <= 'Z') {
            map1[i11] = c11;
            c11 = (char) (c11 + 1);
            i11++;
        }
        char c12 = 'a';
        while (c12 <= 'z') {
            map1[i11] = c12;
            c12 = (char) (c12 + 1);
            i11++;
        }
        char c13 = '0';
        while (c13 <= '9') {
            map1[i11] = c13;
            c13 = (char) (c13 + 1);
            i11++;
        }
        char[] cArr = map1;
        cArr[i11] = '+';
        cArr[i11 + 1] = '/';
        int i12 = 0;
        while (true) {
            byte[] bArr = map2;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        for (int i13 = 0; i13 < 64; i13++) {
            map2[map1[i13]] = (byte) i13;
        }
    }

    public static byte[] decode(char[] cArr) {
        char c11;
        int length = cArr.length;
        if (length % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (length > 0 && cArr[length - 1] == '=') {
            length--;
        }
        int i11 = (length * 3) / 4;
        byte[] bArr = new byte[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            char c12 = cArr[i12];
            int i14 = i12 + 2;
            char c13 = cArr[i12 + 1];
            char c14 = 'A';
            if (i14 < length) {
                i12 += 3;
                c11 = cArr[i14];
            } else {
                i12 = i14;
                c11 = 'A';
            }
            if (i12 < length) {
                c14 = cArr[i12];
                i12++;
            }
            if (c12 > 127 || c13 > 127 || c11 > 127 || c14 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = map2;
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c13];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c14];
            if (b11 < 0 || b12 < 0 || b13 < 0 || b14 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i15 = (b11 << 2) | (b12 >>> 4);
            int i16 = ((b12 & 15) << 4) | (b13 >>> 2);
            int i17 = ((b13 & 3) << 6) | b14;
            int i18 = i13 + 1;
            bArr[i13] = (byte) i15;
            if (i18 < i11) {
                bArr[i18] = (byte) i16;
                i18 = i13 + 2;
            }
            if (i18 < i11) {
                i13 = i18 + 1;
                bArr[i18] = (byte) i17;
            } else {
                i13 = i18;
            }
        }
        return bArr;
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static char[] encode(byte[] bArr, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = ((i11 * 4) + 2) / 3;
        char[] cArr = new char[((i11 + 2) / 3) * 4];
        int i17 = 0;
        int i18 = 0;
        while (i17 < i11) {
            int i19 = i17 + 1;
            byte b11 = bArr[i17];
            int i21 = b11 & 255;
            if (i19 < i11) {
                i12 = i17 + 2;
                i13 = bArr[i19] & 255;
            } else {
                i12 = i19;
                i13 = 0;
            }
            if (i12 < i11) {
                i14 = i12 + 1;
                i15 = bArr[i12] & 255;
            } else {
                i14 = i12;
                i15 = 0;
            }
            int i22 = ((b11 & 3) << 4) | (i13 >>> 4);
            int i23 = ((i13 & 15) << 2) | (i15 >>> 6);
            int i24 = i15 & 63;
            char[] cArr2 = map1;
            cArr[i18] = cArr2[i21 >>> 2];
            int i25 = i18 + 2;
            cArr[i18 + 1] = cArr2[i22];
            char c11 = '=';
            cArr[i25] = i25 < i16 ? cArr2[i23] : '=';
            int i26 = i18 + 3;
            if (i26 < i16) {
                c11 = cArr2[i24];
            }
            cArr[i26] = c11;
            i18 += 4;
            i17 = i14;
        }
        return cArr;
    }

    public static String encodeString(String str) {
        try {
            return new String(encode(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }
}
