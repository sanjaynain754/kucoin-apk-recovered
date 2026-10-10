package com.fasterxml.jackson.core.p062io;

import com.fasterxml.jackson.core.util.C6324c;
import com.fasterxml.jackson.core.util.C6330i;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.e */
/* JADX INFO: compiled from: JsonStringEncoder.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6311e {

    /* JADX INFO: renamed from: a */
    public static final char[] f10092a = C6308b.m10964d();

    /* JADX INFO: renamed from: b */
    public static final byte[] f10093b = C6308b.m10963c();

    /* JADX INFO: renamed from: c */
    public static final C6311e f10094c = new C6311e();

    /* JADX INFO: renamed from: b */
    public final int m11002b(int i11, char[] cArr) {
        cArr[1] = (char) i11;
        return 2;
    }

    /* JADX INFO: renamed from: c */
    public final int m11003c(int i11, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = f10092a;
        cArr[4] = cArr2[i11 >> 4];
        cArr[5] = cArr2[i11 & 15];
        return 6;
    }

    /* JADX INFO: renamed from: h */
    public final char[] m11004h() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    /* JADX INFO: renamed from: e */
    public static void m10997e(int i11) {
        throw new IllegalArgumentException(C6317k.m11054g(i11));
    }

    /* JADX INFO: renamed from: f */
    public static int m10998f(int i11) {
        return Math.min(Math.max(24, i11 + 6 + (i11 >> 1)), 32000);
    }

    /* JADX INFO: renamed from: g */
    public static int m10999g(int i11) {
        return Math.min(Math.max(16, i11 + Math.min((i11 >> 3) + 6, 1000)), 32000);
    }

    /* JADX INFO: renamed from: j */
    public static C6311e m11000j() {
        return f10094c;
    }

    /* JADX INFO: renamed from: d */
    public static int m10996d(int i11, int i12) {
        if (i12 >= 56320 && i12 <= 57343) {
            return ((i11 - 55296) << 10) + 65536 + (i12 - Utf8.LOG_SURROGATE_HEADER);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i11) + ", second 0x" + Integer.toHexString(i12) + "; illegal combination");
    }

    /* JADX INFO: renamed from: a */
    public final int m11001a(int i11, int i12, C6324c c6324c, int i13) {
        c6324c.m11078p(i13);
        c6324c.m11069b(92);
        if (i12 < 0) {
            c6324c.m11069b(117);
            if (i11 > 255) {
                byte[] bArr = f10093b;
                c6324c.m11069b(bArr[i11 >> 12]);
                c6324c.m11069b(bArr[(i11 >> 8) & 15]);
                i11 &= 255;
            } else {
                c6324c.m11069b(48);
                c6324c.m11069b(48);
            }
            byte[] bArr2 = f10093b;
            c6324c.m11069b(bArr2[i11 >> 4]);
            c6324c.m11069b(bArr2[i11 & 15]);
        } else {
            c6324c.m11069b((byte) i12);
        }
        return c6324c.m11075m();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public byte[] m11005i(String str) {
        int i11;
        int i12;
        int length = str.length();
        int iM10998f = m10998f(length);
        byte[] bArrM11073j = new byte[iM10998f];
        C6324c c6324cM11067k = null;
        int i13 = 0;
        int i14 = 0;
        loop0: while (i13 < length) {
            int i15 = i13 + 1;
            char cCharAt = str.charAt(i13);
            while (cCharAt <= 127) {
                if (i14 >= iM10998f) {
                    if (c6324cM11067k == null) {
                        c6324cM11067k = C6324c.m11067k(bArrM11073j, i14);
                    }
                    byte[] bArrM11073j2 = c6324cM11067k.m11073j();
                    bArrM11073j = bArrM11073j2;
                    iM10998f = bArrM11073j2.length;
                    i14 = 0;
                }
                int i16 = i14 + 1;
                bArrM11073j[i14] = (byte) cCharAt;
                if (i15 >= length) {
                    i14 = i16;
                    break loop0;
                }
                char cCharAt2 = str.charAt(i15);
                i15++;
                cCharAt = cCharAt2;
                i14 = i16;
            }
            if (c6324cM11067k == null) {
                c6324cM11067k = C6324c.m11067k(bArrM11073j, i14);
            }
            if (i14 >= iM10998f) {
                bArrM11073j = c6324cM11067k.m11073j();
                iM10998f = bArrM11073j.length;
                i14 = 0;
            }
            if (cCharAt < 2048) {
                i11 = i14 + 1;
                bArrM11073j[i14] = (byte) ((cCharAt >> 6) | 192);
            } else {
                if (cCharAt >= 55296 && cCharAt <= 57343) {
                    if (cCharAt > 56319) {
                        m10997e(cCharAt);
                    }
                    if (i15 >= length) {
                        m10997e(cCharAt);
                    }
                    int i17 = i15 + 1;
                    int iM10996d = m10996d(cCharAt, str.charAt(i15));
                    if (iM10996d > 1114111) {
                        m10997e(iM10996d);
                    }
                    int i18 = i14 + 1;
                    bArrM11073j[i14] = (byte) ((iM10996d >> 18) | 240);
                    if (i18 >= iM10998f) {
                        bArrM11073j = c6324cM11067k.m11073j();
                        iM10998f = bArrM11073j.length;
                        i18 = 0;
                    }
                    int i19 = i18 + 1;
                    bArrM11073j[i18] = (byte) (((iM10996d >> 12) & 63) | 128);
                    if (i19 >= iM10998f) {
                        byte[] bArrM11073j3 = c6324cM11067k.m11073j();
                        bArrM11073j = bArrM11073j3;
                        iM10998f = bArrM11073j3.length;
                        i19 = 0;
                    }
                    int i21 = i19 + 1;
                    bArrM11073j[i19] = (byte) (((iM10996d >> 6) & 63) | 128);
                    i12 = iM10996d;
                    i13 = i17;
                    i11 = i21;
                } else {
                    int i22 = i14 + 1;
                    bArrM11073j[i14] = (byte) ((cCharAt >> '\f') | 224);
                    if (i22 >= iM10998f) {
                        bArrM11073j = c6324cM11067k.m11073j();
                        iM10998f = bArrM11073j.length;
                        i22 = 0;
                    }
                    bArrM11073j[i22] = (byte) (((cCharAt >> 6) & 63) | 128);
                    i11 = i22 + 1;
                }
                if (i11 >= iM10998f) {
                    byte[] bArrM11073j4 = c6324cM11067k.m11073j();
                    bArrM11073j = bArrM11073j4;
                    iM10998f = bArrM11073j4.length;
                    i11 = 0;
                }
                bArrM11073j[i11] = (byte) ((i12 & 63) | 128);
                i14 = i11 + 1;
            }
            i12 = cCharAt;
            i13 = i15;
            if (i11 >= iM10998f) {
                byte[] bArrM11073j5 = c6324cM11067k.m11073j();
                bArrM11073j = bArrM11073j5;
                iM10998f = bArrM11073j5.length;
                i11 = 0;
            }
            bArrM11073j[i11] = (byte) ((i12 & 63) | 128);
            i14 = i11 + 1;
        }
        if (c6324cM11067k == null) {
            return Arrays.copyOfRange(bArrM11073j, 0, i14);
        }
        return c6324cM11067k.m11072i(i14);
    }

    /* JADX INFO: renamed from: k */
    public char[] m11006k(String str) {
        int iM11002b;
        int length = str.length();
        char[] cArrM11110p = new char[m10999g(length)];
        int[] iArrM10965e = C6308b.m10965e();
        int length2 = iArrM10965e.length;
        C6330i c6330iM11087q = null;
        int i11 = 0;
        int i12 = 0;
        char[] cArrM11004h = null;
        loop0: while (i11 < length) {
            while (true) {
                char cCharAt = str.charAt(i11);
                if (cCharAt >= length2 || iArrM10965e[cCharAt] == 0) {
                    if (i12 >= cArrM11110p.length) {
                        if (c6330iM11087q == null) {
                            c6330iM11087q = C6330i.m11087q(cArrM11110p);
                        }
                        cArrM11110p = c6330iM11087q.m11110p();
                        i12 = 0;
                    }
                    int i13 = i12 + 1;
                    cArrM11110p[i12] = cCharAt;
                    i11++;
                    if (i11 >= length) {
                        i12 = i13;
                        break loop0;
                    }
                    i12 = i13;
                }
            }
            if (cArrM11004h == null) {
                cArrM11004h = m11004h();
            }
            int i14 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            int i15 = iArrM10965e[cCharAt2];
            if (i15 < 0) {
                iM11002b = m11003c(cCharAt2, cArrM11004h);
            } else {
                iM11002b = m11002b(i15, cArrM11004h);
            }
            int i16 = i12 + iM11002b;
            if (i16 > cArrM11110p.length) {
                int length3 = cArrM11110p.length - i12;
                if (length3 > 0) {
                    System.arraycopy(cArrM11004h, 0, cArrM11110p, i12, length3);
                }
                if (c6330iM11087q == null) {
                    c6330iM11087q = C6330i.m11087q(cArrM11110p);
                }
                cArrM11110p = c6330iM11087q.m11110p();
                int i17 = iM11002b - length3;
                System.arraycopy(cArrM11004h, length3, cArrM11110p, 0, i17);
                i12 = i17;
            } else {
                System.arraycopy(cArrM11004h, 0, cArrM11110p, i12, iM11002b);
                i12 = i16;
            }
            i11 = i14;
        }
        if (c6330iM11087q == null) {
            return Arrays.copyOfRange(cArrM11110p, 0, i12);
        }
        c6330iM11087q.m11092E(i12);
        return c6330iM11087q.m11101g();
    }

    /* JADX INFO: renamed from: l */
    public byte[] m11007l(String str) {
        int i11;
        int i12;
        int i13;
        int length = str.length();
        byte[] bArrM11073j = new byte[m10998f(length)];
        C6324c c6324cM11067k = null;
        int i14 = 0;
        int iM11001a = 0;
        loop0: while (i14 < length) {
            int[] iArrM10965e = C6308b.m10965e();
            while (true) {
                char cCharAt = str.charAt(i14);
                if (cCharAt > 127 || iArrM10965e[cCharAt] != 0) {
                    break;
                }
                if (iM11001a >= bArrM11073j.length) {
                    if (c6324cM11067k == null) {
                        c6324cM11067k = C6324c.m11067k(bArrM11073j, iM11001a);
                    }
                    bArrM11073j = c6324cM11067k.m11073j();
                    iM11001a = 0;
                }
                int i15 = iM11001a + 1;
                bArrM11073j[iM11001a] = (byte) cCharAt;
                i14++;
                if (i14 >= length) {
                    iM11001a = i15;
                    break loop0;
                }
                iM11001a = i15;
            }
            if (c6324cM11067k == null) {
                c6324cM11067k = C6324c.m11067k(bArrM11073j, iM11001a);
            }
            if (iM11001a >= bArrM11073j.length) {
                bArrM11073j = c6324cM11067k.m11073j();
                iM11001a = 0;
            }
            int i16 = i14 + 1;
            char cCharAt2 = str.charAt(i14);
            if (cCharAt2 <= 127) {
                iM11001a = m11001a(cCharAt2, iArrM10965e[cCharAt2], c6324cM11067k, iM11001a);
                bArrM11073j = c6324cM11067k.m11074l();
            } else {
                if (cCharAt2 <= 2047) {
                    i13 = iM11001a + 1;
                    bArrM11073j[iM11001a] = (byte) ((cCharAt2 >> 6) | 192);
                    i12 = (cCharAt2 & '?') | 128;
                } else {
                    if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        if (cCharAt2 > 56319) {
                            m10997e(cCharAt2);
                        }
                        if (i16 >= length) {
                            m10997e(cCharAt2);
                        }
                        int i17 = i14 + 2;
                        int iM10996d = m10996d(cCharAt2, str.charAt(i16));
                        if (iM10996d > 1114111) {
                            m10997e(iM10996d);
                        }
                        int i18 = iM11001a + 1;
                        bArrM11073j[iM11001a] = (byte) ((iM10996d >> 18) | 240);
                        if (i18 >= bArrM11073j.length) {
                            bArrM11073j = c6324cM11067k.m11073j();
                            i18 = 0;
                        }
                        int i19 = i18 + 1;
                        bArrM11073j[i18] = (byte) (((iM10996d >> 12) & 63) | 128);
                        if (i19 >= bArrM11073j.length) {
                            bArrM11073j = c6324cM11067k.m11073j();
                            i19 = 0;
                        }
                        int i21 = i19 + 1;
                        bArrM11073j[i19] = (byte) (((iM10996d >> 6) & 63) | 128);
                        i12 = (iM10996d & 63) | 128;
                        i11 = i21;
                        i16 = i17;
                    } else {
                        int i22 = iM11001a + 1;
                        bArrM11073j[iM11001a] = (byte) ((cCharAt2 >> '\f') | 224);
                        if (i22 >= bArrM11073j.length) {
                            bArrM11073j = c6324cM11067k.m11073j();
                            i22 = 0;
                        }
                        bArrM11073j[i22] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                        i11 = i22 + 1;
                        i12 = (cCharAt2 & '?') | 128;
                    }
                    i13 = i11;
                }
                if (i13 >= bArrM11073j.length) {
                    bArrM11073j = c6324cM11067k.m11073j();
                    i13 = 0;
                }
                bArrM11073j[i13] = (byte) i12;
                iM11001a = i13 + 1;
            }
            i14 = i16;
        }
        if (c6324cM11067k == null) {
            return Arrays.copyOfRange(bArrM11073j, 0, iM11001a);
        }
        return c6324cM11067k.m11072i(iM11001a);
    }
}
