package com.google.api.client.util.escape;

import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: loaded from: classes56.dex */
public class PercentEscaper extends UnicodeEscaper {
    public static final String SAFECHARS_URLENCODER = "-_.*";
    public static final String SAFEPATHCHARS_URLENCODER = "-_.!~*'()@:$&,;=+";
    public static final String SAFEQUERYSTRINGCHARS_URLENCODER = "-_.!~*'()@:$,;/?:";
    public static final String SAFEUSERINFOCHARS_URLENCODER = "-_.!~*'():$&,;=";
    public static final String SAFE_PLUS_RESERVED_CHARS_URLENCODER = "-_.!~*'()@:$&,;=+/?";
    private final boolean plusForSpace;
    private final boolean[] safeOctets;
    private static final char[] URI_ESCAPED_SPACE = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();

    public PercentEscaper(String str) {
        this(str, false);
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper, com.google.api.client.util.escape.Escaper
    public String escape(String str) {
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

    @Deprecated
    public PercentEscaper(String str, boolean z11) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric ASCII characters are always 'safe' and should not be escaped.");
        }
        if (z11 && str.contains(C33627eb.f69716f)) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        this.plusForSpace = z11;
        this.safeOctets = createSafeOctets(str);
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper
    public int nextEscapeIndex(CharSequence charSequence, int i11, int i12) {
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

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int iMax = 122;
        for (char c11 : charArray) {
            iMax = Math.max((int) c11, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (int i11 = 48; i11 <= 57; i11++) {
            zArr[i11] = true;
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            zArr[i12] = true;
        }
        for (int i13 = 97; i13 <= 122; i13++) {
            zArr[i13] = true;
        }
        for (char c12 : charArray) {
            zArr[c12] = true;
        }
        return zArr;
    }

    @Override // com.google.api.client.util.escape.UnicodeEscaper
    public char[] escape(int i11) {
        boolean[] zArr = this.safeOctets;
        if (i11 < zArr.length && zArr[i11]) {
            return null;
        }
        if (i11 == 32 && this.plusForSpace) {
            return URI_ESCAPED_SPACE;
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
