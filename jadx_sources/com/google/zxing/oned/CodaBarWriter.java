package com.google.zxing.oned;

/* JADX INFO: loaded from: classes56.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {
    private static final char[] ALT_START_END_CHARS = {'T', 'N', '*', 'E'};
    private static final char[] CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED = {'/', ':', '+', '.'};
    private static final char DEFAULT_GUARD;
    private static final char[] START_END_CHARS;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        START_END_CHARS = cArr;
        DEFAULT_GUARD = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i11;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c11 = DEFAULT_GUARD;
            sb2.append(c11);
            sb2.append(str);
            sb2.append(c11);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = START_END_CHARS;
            boolean zArrayContains = CodaBarReader.arrayContains(cArr, upperCase);
            boolean zArrayContains2 = CodaBarReader.arrayContains(cArr, upperCase2);
            char[] cArr2 = ALT_START_END_CHARS;
            boolean zArrayContains3 = CodaBarReader.arrayContains(cArr2, upperCase);
            boolean zArrayContains4 = CodaBarReader.arrayContains(cArr2, upperCase2);
            if (zArrayContains) {
                if (!zArrayContains2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (zArrayContains3) {
                if (!zArrayContains4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zArrayContains2 && !zArrayContains4) {
                StringBuilder sb3 = new StringBuilder();
                char c12 = DEFAULT_GUARD;
                sb3.append(c12);
                sb3.append(str);
                sb3.append(c12);
                str = sb3.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i12 = 20;
        for (int i13 = 1; i13 < str.length() - 1; i13++) {
            if (!Character.isDigit(str.charAt(i13)) && str.charAt(i13) != '-' && str.charAt(i13) != '$') {
                if (CodaBarReader.arrayContains(CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED, str.charAt(i13))) {
                    i12 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i13) + '\'');
                }
            } else {
                i12 += 9;
            }
        }
        boolean[] zArr = new boolean[i12 + (str.length() - 1)];
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i15));
            if (i15 == 0 || i15 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i16 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.ALPHABET;
                if (i16 < cArr3.length) {
                    if (upperCase3 == cArr3[i16]) {
                        i11 = CodaBarReader.CHARACTER_ENCODINGS[i16];
                        break;
                    }
                    i16++;
                } else {
                    i11 = 0;
                    break;
                }
            }
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < 7) {
                zArr[i14] = z11;
                i14++;
                if (((i11 >> (6 - i17)) & 1) != 0 && i18 != 1) {
                    i18++;
                } else {
                    z11 = !z11;
                    i17++;
                    i18 = 0;
                }
            }
            if (i15 < str.length() - 1) {
                zArr[i14] = false;
                i14++;
            }
        }
        return zArr;
    }
}
