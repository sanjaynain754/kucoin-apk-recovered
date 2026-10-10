package com.fasterxml.jackson.core.p062io;

import java.math.BigDecimal;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.a */
/* JADX INFO: compiled from: BigDecimalParser.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6307a {

    /* JADX INFO: renamed from: a */
    public final char[] f10067a;

    /* JADX INFO: renamed from: c */
    public static BigDecimal m10956c(char[] cArr) {
        String str;
        int length = cArr.length;
        try {
            return length < 500 ? new BigDecimal(cArr) : new C6307a(cArr).m10959e(length / 10);
        } catch (NumberFormatException e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "Not a valid number representation";
            }
            if (cArr.length <= 1000) {
                str = new String(cArr);
            } else {
                str = new String(Arrays.copyOfRange(cArr, 0, 1000)) + "(truncated, full length is " + cArr.length + " chars)";
            }
            throw new NumberFormatException("Value \"" + str + "\" can not be represented as `java.math.BigDecimal`, reason: " + message);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m10958a(int i11, long j11) {
        long j12 = ((long) i11) - j11;
        if (j12 <= 2147483647L && j12 >= -2147483648L) {
            return (int) j12;
        }
        throw new NumberFormatException("Scale out of range: " + j12 + " while adjusting scale " + i11 + " to exponent " + j11);
    }

    /* JADX INFO: renamed from: d */
    public static BigDecimal m10957d(char[] cArr, int i11, int i12) {
        if (i11 > 0 || i12 != cArr.length) {
            cArr = Arrays.copyOfRange(cArr, i11, i12 + i11);
        }
        return m10956c(cArr);
    }

    /* JADX INFO: renamed from: e */
    public final BigDecimal m10959e(int i11) {
        int i12;
        BigDecimal bigDecimalM10960f;
        int length = this.f10067a.length;
        int i13 = -1;
        int i14 = -1;
        int iM10958a = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i15 = 0;
        boolean z13 = false;
        for (int i16 = 0; i16 < length; i16++) {
            char c11 = this.f10067a[i16];
            if (c11 != '+') {
                if (c11 == 'E' || c11 == 'e') {
                    if (i13 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    i13 = i16;
                } else if (c11 != '-') {
                    if (c11 == '.') {
                        if (i14 >= 0) {
                            throw new NumberFormatException("Multiple decimal points");
                        }
                        i14 = i16;
                    } else if (i14 >= 0 && i13 == -1) {
                        iM10958a++;
                    }
                } else if (i13 >= 0) {
                    if (z12) {
                        throw new NumberFormatException("Multiple signs in exponent");
                    }
                    z12 = true;
                } else {
                    if (z11) {
                        throw new NumberFormatException("Multiple signs in number");
                    }
                    i15 = i16 + 1;
                    z11 = true;
                    z13 = true;
                }
            } else if (i13 >= 0) {
                if (z12) {
                    throw new NumberFormatException("Multiple signs in exponent");
                }
                z12 = true;
            } else {
                if (z11) {
                    throw new NumberFormatException("Multiple signs in number");
                }
                i15 = i16 + 1;
                z11 = true;
            }
        }
        if (i13 >= 0) {
            i12 = Integer.parseInt(new String(this.f10067a, i13 + 1, (length - i13) - 1));
            iM10958a = m10958a(iM10958a, i12);
            length = i13;
        } else {
            i12 = 0;
        }
        if (i14 >= 0) {
            int i17 = (length - i14) - 1;
            bigDecimalM10960f = m10960f(i15, i14 - i15, i12, i11).add(m10960f(i14 + 1, i17, i12 - i17, i11));
        } else {
            bigDecimalM10960f = m10960f(i15, length - i15, i12, i11);
        }
        if (iM10958a != 0) {
            bigDecimalM10960f = bigDecimalM10960f.setScale(iM10958a);
        }
        return z13 ? bigDecimalM10960f.negate() : bigDecimalM10960f;
    }

    /* JADX INFO: renamed from: f */
    public final BigDecimal m10960f(int i11, int i12, int i13, int i14) {
        if (i12 <= i14) {
            return i12 == 0 ? BigDecimal.ZERO : new BigDecimal(this.f10067a, i11, i12).movePointRight(i13);
        }
        int i15 = i12 / 2;
        return m10960f(i11, i15, (i13 + i12) - i15, i14).add(m10960f(i11 + i15, i12 - i15, i13, i14));
    }

    public C6307a(char[] cArr) {
        this.f10067a = cArr;
    }

    /* JADX INFO: renamed from: b */
    public static BigDecimal m10955b(String str) {
        return m10956c(str.toCharArray());
    }
}
