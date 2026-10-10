package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;

    /* JADX INFO: renamed from: BS */
    public static final byte f12204BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';

    /* JADX INFO: renamed from: CR */
    public static final byte f12205CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = 127;
    public static final byte DLE = 16;

    /* JADX INFO: renamed from: EM */
    public static final byte f12206EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;

    /* JADX INFO: renamed from: FF */
    public static final byte f12207FF = 12;

    /* JADX INFO: renamed from: FS */
    public static final byte f12208FS = 28;

    /* JADX INFO: renamed from: GS */
    public static final byte f12209GS = 29;

    /* JADX INFO: renamed from: HT */
    public static final byte f12210HT = 9;

    /* JADX INFO: renamed from: LF */
    public static final byte f12211LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;

    /* JADX INFO: renamed from: NL */
    public static final byte f12212NL = 10;
    public static final byte NUL = 0;

    /* JADX INFO: renamed from: RS */
    public static final byte f12213RS = 30;

    /* JADX INFO: renamed from: SI */
    public static final byte f12214SI = 15;

    /* JADX INFO: renamed from: SO */
    public static final byte f12215SO = 14;
    public static final byte SOH = 1;

    /* JADX INFO: renamed from: SP */
    public static final byte f12216SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;

    /* JADX INFO: renamed from: US */
    public static final byte f12217US = 31;

    /* JADX INFO: renamed from: VT */
    public static final byte f12218VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    public static String toLowerCase(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (isUpperCase(str.charAt(i11))) {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (isUpperCase(c11)) {
                        charArray[i11] = (char) (c11 ^ CASE_MASK);
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    public static String toUpperCase(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            if (isLowerCase(str.charAt(i11))) {
                char[] charArray = str.toCharArray();
                while (i11 < length) {
                    char c11 = charArray[i11];
                    if (isLowerCase(c11)) {
                        charArray[i11] = (char) (c11 ^ CASE_MASK);
                    }
                    i11++;
                }
                return String.valueOf(charArray);
            }
            i11++;
        }
        return str;
    }

    private static int getAlphaIndex(char c11) {
        return (char) ((c11 | CASE_MASK) - 97);
    }

    public static boolean isLowerCase(char c11) {
        return c11 >= 'a' && c11 <= 'z';
    }

    public static boolean isUpperCase(char c11) {
        return c11 >= 'A' && c11 <= 'Z';
    }

    private Ascii() {
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        int alphaIndex;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = charSequence.charAt(i11);
            char cCharAt2 = charSequence2.charAt(i11);
            if (cCharAt != cCharAt2 && ((alphaIndex = getAlphaIndex(cCharAt)) >= 26 || alphaIndex != getAlphaIndex(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static String truncate(CharSequence charSequence, int i11, String str) {
        boolean z11;
        String string;
        Preconditions.checkNotNull(charSequence);
        int length = i11 - str.length();
        if (length >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "maxLength (%s) must be >= length of the truncation indicator (%s)", i11, str.length());
        int length2 = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length2 <= i11) {
            string = charSequence.toString();
            if (string.length() <= i11) {
                charSequence2 = string;
                return string;
            }
        }
        charSequence2 = string;
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(charSequence2, 0, length);
        sb2.append(str);
        return sb2.toString();
    }

    public static String toLowerCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toLowerCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = toLowerCase(charSequence.charAt(i11));
        }
        return String.valueOf(cArr);
    }

    public static String toUpperCase(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return toUpperCase((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = toUpperCase(charSequence.charAt(i11));
        }
        return String.valueOf(cArr);
    }

    public static char toLowerCase(char c11) {
        return isUpperCase(c11) ? (char) (c11 ^ CASE_MASK) : c11;
    }

    public static char toUpperCase(char c11) {
        return isLowerCase(c11) ? (char) (c11 ^ CASE_MASK) : c11;
    }
}
