package com.fasterxml.jackson.core.p062io;

import com.kubi.otc.entity.OtcAd;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.h */
/* JADX INFO: compiled from: NumberOutput.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6314h {

    /* JADX INFO: renamed from: a */
    public static int f10102a = 1000000;

    /* JADX INFO: renamed from: b */
    public static int f10103b = 1000000000;

    /* JADX INFO: renamed from: c */
    public static long f10104c = 1000000000;

    /* JADX INFO: renamed from: d */
    public static long f10105d = -2147483648L;

    /* JADX INFO: renamed from: e */
    public static long f10106e = 2147483647L;

    /* JADX INFO: renamed from: f */
    public static final String f10107f = String.valueOf(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: g */
    public static final String f10108g = String.valueOf(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h */
    public static final int[] f10109h = new int[1000];

    /* JADX INFO: renamed from: i */
    public static final String[] f10110i;

    /* JADX INFO: renamed from: j */
    public static final String[] f10111j;

    static {
        int i11 = 0;
        for (int i12 = 0; i12 < 10; i12++) {
            for (int i13 = 0; i13 < 10; i13++) {
                int i14 = 0;
                while (i14 < 10) {
                    f10109h[i11] = ((i12 + 48) << 16) | ((i13 + 48) << 8) | (i14 + 48);
                    i14++;
                    i11++;
                }
            }
        }
        f10110i = new String[]{"0", "1", "2", "3", "4", "5", "6", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, "8", "9", "10"};
        f10111j = new String[]{OtcAd.KYC_NOT_PASS, "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    /* JADX INFO: renamed from: a */
    public static int m11022a(int i11, byte[] bArr, int i12) {
        int i13 = f10109h[i11];
        bArr[i12] = (byte) (i13 >> 16);
        int i14 = i12 + 2;
        bArr[i12 + 1] = (byte) (i13 >> 8);
        int i15 = i12 + 3;
        bArr[i14] = (byte) i13;
        return i15;
    }

    /* JADX INFO: renamed from: b */
    public static int m11023b(int i11, char[] cArr, int i12) {
        int i13 = f10109h[i11];
        cArr[i12] = (char) (i13 >> 16);
        int i14 = i12 + 2;
        cArr[i12 + 1] = (char) ((i13 >> 8) & 127);
        int i15 = i12 + 3;
        cArr[i14] = (char) (i13 & 127);
        return i15;
    }

    /* JADX INFO: renamed from: c */
    public static int m11024c(int i11, byte[] bArr, int i12) {
        int i13 = f10109h[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                bArr[i12] = (byte) (i13 >> 16);
                i12++;
            }
            bArr[i12] = (byte) (i13 >> 8);
            i12++;
        }
        int i14 = i12 + 1;
        bArr[i12] = (byte) i13;
        return i14;
    }

    /* JADX INFO: renamed from: d */
    public static int m11025d(int i11, char[] cArr, int i12) {
        int i13 = f10109h[i11];
        if (i11 > 9) {
            if (i11 > 99) {
                cArr[i12] = (char) (i13 >> 16);
                i12++;
            }
            cArr[i12] = (char) ((i13 >> 8) & 127);
            i12++;
        }
        int i14 = i12 + 1;
        cArr[i12] = (char) (i13 & 127);
        return i14;
    }

    /* JADX INFO: renamed from: e */
    public static int m11026e(int i11, byte[] bArr, int i12) {
        int i13 = i11 / 1000;
        int i14 = i11 - (i13 * 1000);
        int i15 = i13 / 1000;
        int i16 = i13 - (i15 * 1000);
        int[] iArr = f10109h;
        int i17 = iArr[i15];
        bArr[i12] = (byte) (i17 >> 16);
        bArr[i12 + 1] = (byte) (i17 >> 8);
        bArr[i12 + 2] = (byte) i17;
        int i18 = iArr[i16];
        bArr[i12 + 3] = (byte) (i18 >> 16);
        bArr[i12 + 4] = (byte) (i18 >> 8);
        bArr[i12 + 5] = (byte) i18;
        int i19 = iArr[i14];
        bArr[i12 + 6] = (byte) (i19 >> 16);
        int i21 = i12 + 8;
        bArr[i12 + 7] = (byte) (i19 >> 8);
        int i22 = i12 + 9;
        bArr[i21] = (byte) i19;
        return i22;
    }

    /* JADX INFO: renamed from: f */
    public static int m11027f(int i11, char[] cArr, int i12) {
        int i13 = i11 / 1000;
        int i14 = i11 - (i13 * 1000);
        int i15 = i13 / 1000;
        int[] iArr = f10109h;
        int i16 = iArr[i15];
        cArr[i12] = (char) (i16 >> 16);
        cArr[i12 + 1] = (char) ((i16 >> 8) & 127);
        cArr[i12 + 2] = (char) (i16 & 127);
        int i17 = iArr[i13 - (i15 * 1000)];
        cArr[i12 + 3] = (char) (i17 >> 16);
        cArr[i12 + 4] = (char) ((i17 >> 8) & 127);
        cArr[i12 + 5] = (char) (i17 & 127);
        int i18 = iArr[i14];
        cArr[i12 + 6] = (char) (i18 >> 16);
        int i19 = i12 + 8;
        cArr[i12 + 7] = (char) ((i18 >> 8) & 127);
        int i21 = i12 + 9;
        cArr[i19] = (char) (i18 & 127);
        return i21;
    }

    /* JADX INFO: renamed from: g */
    public static int m11028g(byte[] bArr, int i11) {
        int length = f10107f.length();
        int i12 = 0;
        while (i12 < length) {
            bArr[i11] = (byte) f10107f.charAt(i12);
            i12++;
            i11++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public static int m11029h(char[] cArr, int i11) {
        String str = f10107f;
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        return i11 + length;
    }

    /* JADX INFO: renamed from: i */
    public static int m11030i(byte[] bArr, int i11) {
        int length = f10108g.length();
        int i12 = 0;
        while (i12 < length) {
            bArr[i11] = (byte) f10108g.charAt(i12);
            i12++;
            i11++;
        }
        return i11;
    }

    /* JADX INFO: renamed from: j */
    public static int m11031j(char[] cArr, int i11) {
        String str = f10108g;
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        return i11 + length;
    }

    /* JADX INFO: renamed from: k */
    public static int m11032k(int i11, byte[] bArr, int i12) {
        if (i11 < f10102a) {
            if (i11 < 1000) {
                return m11024c(i11, bArr, i12);
            }
            int i13 = i11 / 1000;
            return m11034m(bArr, i12, i13, i11 - (i13 * 1000));
        }
        int i14 = i11 / 1000;
        int i15 = i11 - (i14 * 1000);
        int i16 = i14 / 1000;
        int i17 = i14 - (i16 * 1000);
        int iM11024c = m11024c(i16, bArr, i12);
        int[] iArr = f10109h;
        int i18 = iArr[i17];
        bArr[iM11024c] = (byte) (i18 >> 16);
        bArr[iM11024c + 1] = (byte) (i18 >> 8);
        bArr[iM11024c + 2] = (byte) i18;
        int i19 = iArr[i15];
        bArr[iM11024c + 3] = (byte) (i19 >> 16);
        int i21 = iM11024c + 5;
        bArr[iM11024c + 4] = (byte) (i19 >> 8);
        int i22 = iM11024c + 6;
        bArr[i21] = (byte) i19;
        return i22;
    }

    /* JADX INFO: renamed from: l */
    public static int m11033l(int i11, char[] cArr, int i12) {
        if (i11 < f10102a) {
            if (i11 < 1000) {
                return m11025d(i11, cArr, i12);
            }
            int i13 = i11 / 1000;
            return m11035n(cArr, i12, i13, i11 - (i13 * 1000));
        }
        int i14 = i11 / 1000;
        int i15 = i11 - (i14 * 1000);
        int i16 = i14 / 1000;
        int i17 = i14 - (i16 * 1000);
        int iM11025d = m11025d(i16, cArr, i12);
        int[] iArr = f10109h;
        int i18 = iArr[i17];
        cArr[iM11025d] = (char) (i18 >> 16);
        cArr[iM11025d + 1] = (char) ((i18 >> 8) & 127);
        cArr[iM11025d + 2] = (char) (i18 & 127);
        int i19 = iArr[i15];
        cArr[iM11025d + 3] = (char) (i19 >> 16);
        int i21 = iM11025d + 5;
        cArr[iM11025d + 4] = (char) ((i19 >> 8) & 127);
        int i22 = iM11025d + 6;
        cArr[i21] = (char) (i19 & 127);
        return i22;
    }

    /* JADX INFO: renamed from: m */
    public static int m11034m(byte[] bArr, int i11, int i12, int i13) {
        int[] iArr = f10109h;
        int i14 = iArr[i12];
        if (i12 > 9) {
            if (i12 > 99) {
                bArr[i11] = (byte) (i14 >> 16);
                i11++;
            }
            bArr[i11] = (byte) (i14 >> 8);
            i11++;
        }
        bArr[i11] = (byte) i14;
        int i15 = iArr[i13];
        bArr[i11 + 1] = (byte) (i15 >> 16);
        int i16 = i11 + 3;
        bArr[i11 + 2] = (byte) (i15 >> 8);
        int i17 = i11 + 4;
        bArr[i16] = (byte) i15;
        return i17;
    }

    /* JADX INFO: renamed from: n */
    public static int m11035n(char[] cArr, int i11, int i12, int i13) {
        int[] iArr = f10109h;
        int i14 = iArr[i12];
        if (i12 > 9) {
            if (i12 > 99) {
                cArr[i11] = (char) (i14 >> 16);
                i11++;
            }
            cArr[i11] = (char) ((i14 >> 8) & 127);
            i11++;
        }
        cArr[i11] = (char) (i14 & 127);
        int i15 = iArr[i13];
        cArr[i11 + 1] = (char) (i15 >> 16);
        int i16 = i11 + 3;
        cArr[i11 + 2] = (char) ((i15 >> 8) & 127);
        int i17 = i11 + 4;
        cArr[i16] = (char) (i15 & 127);
        return i17;
    }

    /* JADX INFO: renamed from: q */
    public static int m11038q(int i11, byte[] bArr, int i12) {
        int i13;
        if (i11 < 0) {
            if (i11 == Integer.MIN_VALUE) {
                return m11028g(bArr, i12);
            }
            bArr[i12] = BuiltinOptions.GreaterEqualOptions;
            i11 = -i11;
            i12++;
        }
        if (i11 < f10102a) {
            if (i11 >= 1000) {
                int i14 = i11 / 1000;
                return m11022a(i11 - (i14 * 1000), bArr, m11024c(i14, bArr, i12));
            }
            if (i11 >= 10) {
                return m11024c(i11, bArr, i12);
            }
            int i15 = i12 + 1;
            bArr[i12] = (byte) (i11 + 48);
            return i15;
        }
        int i16 = f10103b;
        if (i11 < i16) {
            int i17 = i11 / 1000;
            int i18 = i17 / 1000;
            return m11022a(i11 - (i17 * 1000), bArr, m11022a(i17 - (i18 * 1000), bArr, m11024c(i18, bArr, i12)));
        }
        int i19 = i11 - i16;
        if (i19 >= i16) {
            i19 -= i16;
            i13 = i12 + 1;
            bArr[i12] = BuiltinOptions.SparseToDenseOptions;
        } else {
            i13 = i12 + 1;
            bArr[i12] = BuiltinOptions.TransposeConvOptions;
        }
        return m11026e(i19, bArr, i13);
    }

    /* JADX INFO: renamed from: r */
    public static int m11039r(int i11, char[] cArr, int i12) {
        int i13;
        if (i11 < 0) {
            if (i11 == Integer.MIN_VALUE) {
                return m11029h(cArr, i12);
            }
            cArr[i12] = '-';
            i11 = -i11;
            i12++;
        }
        if (i11 < f10102a) {
            if (i11 >= 1000) {
                int i14 = i11 / 1000;
                return m11023b(i11 - (i14 * 1000), cArr, m11025d(i14, cArr, i12));
            }
            if (i11 >= 10) {
                return m11025d(i11, cArr, i12);
            }
            cArr[i12] = (char) (i11 + 48);
            return i12 + 1;
        }
        int i15 = f10103b;
        if (i11 < i15) {
            int i16 = i11 / 1000;
            int i17 = i16 / 1000;
            return m11023b(i11 - (i16 * 1000), cArr, m11023b(i16 - (i17 * 1000), cArr, m11025d(i17, cArr, i12)));
        }
        int i18 = i11 - i15;
        if (i18 >= i15) {
            i18 -= i15;
            i13 = i12 + 1;
            cArr[i12] = '2';
        } else {
            i13 = i12 + 1;
            cArr[i12] = '1';
        }
        return m11027f(i18, cArr, i13);
    }

    /* JADX INFO: renamed from: s */
    public static int m11040s(long j11, byte[] bArr, int i11) {
        int iM11026e;
        if (j11 < 0) {
            if (j11 > f10105d) {
                return m11038q((int) j11, bArr, i11);
            }
            if (j11 == Long.MIN_VALUE) {
                return m11030i(bArr, i11);
            }
            bArr[i11] = BuiltinOptions.GreaterEqualOptions;
            j11 = -j11;
            i11++;
        } else if (j11 <= f10106e) {
            return m11038q((int) j11, bArr, i11);
        }
        long j12 = f10104c;
        long j13 = j11 / j12;
        long j14 = j11 - (j13 * j12);
        if (j13 < j12) {
            iM11026e = m11032k((int) j13, bArr, i11);
        } else {
            long j15 = j13 / j12;
            int iM11024c = m11024c((int) j15, bArr, i11);
            iM11026e = m11026e((int) (j13 - (j12 * j15)), bArr, iM11024c);
        }
        return m11026e((int) j14, bArr, iM11026e);
    }

    /* JADX INFO: renamed from: t */
    public static int m11041t(long j11, char[] cArr, int i11) {
        int iM11027f;
        if (j11 < 0) {
            if (j11 > f10105d) {
                return m11039r((int) j11, cArr, i11);
            }
            if (j11 == Long.MIN_VALUE) {
                return m11031j(cArr, i11);
            }
            cArr[i11] = '-';
            j11 = -j11;
            i11++;
        } else if (j11 <= f10106e) {
            return m11039r((int) j11, cArr, i11);
        }
        long j12 = f10104c;
        long j13 = j11 / j12;
        long j14 = j11 - (j13 * j12);
        if (j13 < j12) {
            iM11027f = m11033l((int) j13, cArr, i11);
        } else {
            long j15 = j13 / j12;
            int iM11025d = m11025d((int) j15, cArr, i11);
            iM11027f = m11027f((int) (j13 - (j12 * j15)), cArr, iM11025d);
        }
        return m11027f((int) j14, cArr, iM11027f);
    }

    /* JADX INFO: renamed from: w */
    public static String m11044w(int i11) {
        String[] strArr = f10110i;
        if (i11 < strArr.length) {
            if (i11 >= 0) {
                return strArr[i11];
            }
            int i12 = (-i11) - 1;
            String[] strArr2 = f10111j;
            if (i12 < strArr2.length) {
                return strArr2[i12];
            }
        }
        return Integer.toString(i11);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m11036o(double d11) {
        if (!Double.isNaN(d11) && !Double.isInfinite(d11)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m11037p(float f11) {
        if (!Float.isNaN(f11) && !Float.isInfinite(f11)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static String m11042u(double d11) {
        return Double.toString(d11);
    }

    /* JADX INFO: renamed from: v */
    public static String m11043v(float f11) {
        return Float.toString(f11);
    }

    /* JADX INFO: renamed from: x */
    public static String m11045x(long j11) {
        if (j11 <= 2147483647L && j11 >= -2147483648L) {
            return m11044w((int) j11);
        }
        return Long.toString(j11);
    }
}
