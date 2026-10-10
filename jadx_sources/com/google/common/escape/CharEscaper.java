package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (escape(str.charAt(i11)) != null) {
                return escapeSlow(str, i11);
            }
        }
        return str;
    }

    public abstract char[] escape(char c11);

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

    public final String escapeSlow(String str, int i11) {
        int length = str.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int length2 = cArrCharBufferFromThreadLocal.length;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            char[] cArrEscape = escape(str.charAt(i11));
            if (cArrEscape != null) {
                int length3 = cArrEscape.length;
                int i14 = i11 - i12;
                int i15 = i13 + i14;
                int i16 = i15 + length3;
                if (length2 < i16) {
                    length2 = ((length - i11) * 2) + i16;
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i13, length2);
                }
                if (i14 > 0) {
                    str.getChars(i12, i11, cArrCharBufferFromThreadLocal, i13);
                    i13 = i15;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, i13, length3);
                    i13 += length3;
                }
                i12 = i11 + 1;
            }
            i11++;
        }
        int i17 = length - i12;
        if (i17 > 0) {
            int i18 = i17 + i13;
            if (length2 < i18) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i13, i18);
            }
            str.getChars(i12, length, cArrCharBufferFromThreadLocal, i13);
            i13 = i18;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, i13);
    }
}
