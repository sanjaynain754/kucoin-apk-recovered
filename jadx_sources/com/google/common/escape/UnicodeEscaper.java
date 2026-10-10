package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        int iNextEscapeIndex = nextEscapeIndex(str, 0, length);
        return iNextEscapeIndex == length ? str : escapeSlow(str, iNextEscapeIndex);
    }

    public abstract char[] escape(int i11);

    private static char[] growBuffer(char[] cArr, int i11, int i12) {
        if (i12 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i12];
        if (i11 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i11);
        }
        return cArr2;
    }

    public int nextEscapeIndex(CharSequence charSequence, int i11, int i12) {
        while (i11 < i12) {
            int iCodePointAt = codePointAt(charSequence, i11, i12);
            if (iCodePointAt < 0 || escape(iCodePointAt) != null) {
                break;
            }
            i11 += Character.isSupplementaryCodePoint(iCodePointAt) ? 2 : 1;
        }
        return i11;
    }

    public static int codePointAt(CharSequence charSequence, int i11, int i12) {
        Preconditions.checkNotNull(charSequence);
        if (i11 < i12) {
            int i13 = i11 + 1;
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 55296 && cCharAt <= 57343) {
                if (cCharAt <= 56319) {
                    if (i13 == i12) {
                        return -cCharAt;
                    }
                    char cCharAt2 = charSequence.charAt(i13);
                    if (Character.isLowSurrogate(cCharAt2)) {
                        return Character.toCodePoint(cCharAt, cCharAt2);
                    }
                    throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i13 + " in '" + ((Object) charSequence) + "'");
                }
                throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + i11 + " in '" + ((Object) charSequence) + "'");
            }
            return cCharAt;
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    public final String escapeSlow(String str, int i11) {
        int i12;
        int length = str.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int i13 = 0;
        int length2 = 0;
        while (i11 < length) {
            int iCodePointAt = codePointAt(str, i11, length);
            if (iCodePointAt >= 0) {
                char[] cArrEscape = escape(iCodePointAt);
                if (Character.isSupplementaryCodePoint(iCodePointAt)) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                int i14 = i12 + i11;
                if (cArrEscape != null) {
                    int i15 = i11 - i13;
                    int i16 = length2 + i15;
                    int length3 = cArrEscape.length + i16;
                    if (cArrCharBufferFromThreadLocal.length < length3) {
                        cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, length3 + (length - i11) + 32);
                    }
                    if (i15 > 0) {
                        str.getChars(i13, i11, cArrCharBufferFromThreadLocal, length2);
                        length2 = i16;
                    }
                    if (cArrEscape.length > 0) {
                        System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, length2, cArrEscape.length);
                        length2 += cArrEscape.length;
                    }
                    i13 = i14;
                }
                i11 = nextEscapeIndex(str, i14, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i17 = length - i13;
        if (i17 > 0) {
            int i18 = i17 + length2;
            if (cArrCharBufferFromThreadLocal.length < i18) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, length2, i18);
            }
            str.getChars(i13, length, cArrCharBufferFromThreadLocal, length2);
            length2 = i18;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, length2);
    }
}
