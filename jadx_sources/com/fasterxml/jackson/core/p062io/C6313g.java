package com.fasterxml.jackson.core.p062io;

import androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider;
import java.math.BigDecimal;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.g */
/* JADX INFO: compiled from: NumberInput.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6313g {

    /* JADX INFO: renamed from: a */
    public static final String f10100a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* JADX INFO: renamed from: b */
    public static final String f10101b = String.valueOf(Long.MAX_VALUE);

    /* JADX INFO: renamed from: j */
    public static int m11018j(String str) {
        char cCharAt = str.charAt(0);
        int length = str.length();
        int i11 = 1;
        boolean z11 = cCharAt == '-';
        if (z11) {
            if (length == 1 || length > 10) {
                return Integer.parseInt(str);
            }
            cCharAt = str.charAt(1);
            i11 = 2;
        } else if (length > 9) {
            return Integer.parseInt(str);
        }
        if (cCharAt > '9' || cCharAt < '0') {
            return Integer.parseInt(str);
        }
        int i12 = cCharAt - '0';
        if (i11 < length) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return Integer.parseInt(str);
            }
            i12 = (i12 * 10) + (cCharAt2 - '0');
            if (i13 < length) {
                int i14 = i11 + 2;
                char cCharAt3 = str.charAt(i13);
                if (cCharAt3 > '9' || cCharAt3 < '0') {
                    return Integer.parseInt(str);
                }
                i12 = (i12 * 10) + (cCharAt3 - '0');
                if (i14 < length) {
                    while (true) {
                        int i15 = i14 + 1;
                        char cCharAt4 = str.charAt(i14);
                        if (cCharAt4 > '9' || cCharAt4 < '0') {
                            break;
                        }
                        i12 = (i12 * 10) + (cCharAt4 - '0');
                        if (i15 < length) {
                            i14 = i15;
                        }
                    }
                    return Integer.parseInt(str);
                }
            }
        }
        return z11 ? -i12 : i12;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11009a(String str, boolean z11) {
        String str2 = z11 ? f10100a : f10101b;
        int length = str2.length();
        int length2 = str.length();
        if (length2 < length) {
            return true;
        }
        if (length2 > length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - str2.charAt(i11);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11010b(char[] cArr, int i11, int i12, boolean z11) {
        String str = z11 ? f10100a : f10101b;
        int length = str.length();
        if (i12 < length) {
            return true;
        }
        if (i12 > length) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            int iCharAt = cArr[i11 + i13] - str.charAt(i13);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static double m11011c(String str, double d11) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() != 0) {
                try {
                    return m11017i(strTrim);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return d11;
    }

    /* JADX INFO: renamed from: d */
    public static int m11012d(String str, int i11) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i12 = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i12 = 1;
            }
            while (i12 < length) {
                try {
                    char cCharAt2 = strTrim.charAt(i12);
                    if (cCharAt2 > '9' || cCharAt2 < '0') {
                        return (int) m11017i(strTrim);
                    }
                    i12++;
                } catch (NumberFormatException unused) {
                }
            }
            return Integer.parseInt(strTrim);
        }
        return i11;
    }

    /* JADX INFO: renamed from: e */
    public static long m11013e(String str, long j11) {
        String strTrim;
        int length;
        if (str != null && (length = (strTrim = str.trim()).length()) != 0) {
            int i11 = 0;
            char cCharAt = strTrim.charAt(0);
            if (cCharAt == '+') {
                strTrim = strTrim.substring(1);
                length = strTrim.length();
            } else if (cCharAt == '-') {
                i11 = 1;
            }
            while (i11 < length) {
                try {
                    char cCharAt2 = strTrim.charAt(i11);
                    if (cCharAt2 > '9' || cCharAt2 < '0') {
                        return (long) m11017i(strTrim);
                    }
                    i11++;
                } catch (NumberFormatException unused) {
                }
            }
            return Long.parseLong(strTrim);
        }
        return j11;
    }

    /* JADX INFO: renamed from: i */
    public static double m11017i(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* JADX INFO: renamed from: k */
    public static int m11019k(char[] cArr, int i11, int i12) {
        int i13 = cArr[(i11 + i12) - 1] - '0';
        switch (i12) {
            case 9:
                i13 += (cArr[i11] - '0') * 100000000;
                i11++;
            case 8:
                i13 += (cArr[i11] - '0') * DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD;
                i11++;
            case 7:
                i13 += (cArr[i11] - '0') * 1000000;
                i11++;
            case 6:
                i13 += (cArr[i11] - '0') * 100000;
                i11++;
            case 5:
                i13 += (cArr[i11] - '0') * 10000;
                i11++;
            case 4:
                i13 += (cArr[i11] - '0') * 1000;
                i11++;
            case 3:
                i13 += (cArr[i11] - '0') * 100;
                i11++;
            case 2:
                return i13 + ((cArr[i11] - '0') * 10);
            default:
                return i13;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m11021m(char[] cArr, int i11, int i12) {
        int i13 = i12 - 9;
        return (((long) m11019k(cArr, i11, i13)) * 1000000000) + ((long) m11019k(cArr, i11 + i13, 9));
    }

    /* JADX INFO: renamed from: f */
    public static BigDecimal m11014f(String str) throws NumberFormatException {
        return C6307a.m10955b(str);
    }

    /* JADX INFO: renamed from: g */
    public static BigDecimal m11015g(char[] cArr) throws NumberFormatException {
        return C6307a.m10956c(cArr);
    }

    /* JADX INFO: renamed from: h */
    public static BigDecimal m11016h(char[] cArr, int i11, int i12) throws NumberFormatException {
        return C6307a.m10957d(cArr, i11, i12);
    }

    /* JADX INFO: renamed from: l */
    public static long m11020l(String str) {
        if (str.length() <= 9) {
            return m11018j(str);
        }
        return Long.parseLong(str);
    }
}
