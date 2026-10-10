package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class PercentEscaper extends UnicodeEscaper {
    private static final char[] PLUS_SIGN = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return escapeSlow(str, i11);
            }
        }
        return str;
    }

    public PercentEscaper(String str, boolean z11) {
        Preconditions.checkNotNull(str);
        if (!str.matches(".*[0-9A-Za-z].*")) {
            String str2 = str + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            if (z11 && str2.contains(C33627eb.f69716f)) {
                throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
            }
            this.plusForSpace = z11;
            this.safeOctets = createSafeOctets(str2);
            return;
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int iMax = -1;
        for (char c11 : charArray) {
            iMax = Math.max((int) c11, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c12 : charArray) {
            zArr[c12] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public int nextEscapeIndex(CharSequence charSequence, int i11, int i12) {
        Preconditions.checkNotNull(charSequence);
        while (i11 < i12) {
            char cCharAt = charSequence.charAt(i11);
            boolean[] zArr = this.safeOctets;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i11++;
        }
        return i11;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public char[] escape(int i11) {
        boolean[] zArr = this.safeOctets;
        if (i11 < zArr.length && zArr[i11]) {
            return null;
        }
        if (i11 == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (i11 <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[i11 >>> 4], cArr[i11 & 15]};
        }
        if (i11 <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr2[(i11 >>> 10) | 12], cArr2[(i11 >>> 6) & 15], '%', cArr2[((i11 >>> 4) & 3) | 8], cArr2[i11 & 15]};
        }
        if (i11 <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'E', cArr3[i11 >>> 12], '%', cArr3[((i11 >>> 10) & 3) | 8], cArr3[(i11 >>> 6) & 15], '%', cArr3[((i11 >>> 4) & 3) | 8], cArr3[i11 & 15]};
        }
        if (i11 <= 1114111) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'F', cArr4[(i11 >>> 18) & 7], '%', cArr4[((i11 >>> 16) & 3) | 8], cArr4[(i11 >>> 12) & 15], '%', cArr4[((i11 >>> 10) & 3) | 8], cArr4[(i11 >>> 6) & 15], '%', cArr4[((i11 >>> 4) & 3) | 8], cArr4[i11 & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i11);
    }
}
