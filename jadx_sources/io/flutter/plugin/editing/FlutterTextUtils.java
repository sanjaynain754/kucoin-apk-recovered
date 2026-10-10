package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes60.dex */
class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    /* JADX WARN: Code duplicated, block: B:90:0x0149 A[PHI: r2 r4
      0x0149: PHI (r2v6 int) = (r2v3 int), (r2v8 int) binds: [B:80:0x0117, B:82:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0149: PHI (r4v5 int) = (r4v3 int), (r4v7 int) binds: [B:80:0x0117, B:82:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    public int getOffsetBefore(CharSequence charSequence, int i11) {
        int iCodePointBefore;
        int iCharCount;
        int iCharCount2;
        int iCharCount3 = 0;
        int i12 = 1;
        if (i11 <= 1 || (iCharCount2 = i11 - (iCharCount = Character.charCount((iCodePointBefore = Character.codePointBefore(charSequence, i11))))) == 0) {
            return 0;
        }
        if (iCodePointBefore == 10) {
            if (Character.codePointBefore(charSequence, iCharCount2) == 13) {
                iCharCount++;
            }
            return i11 - iCharCount;
        }
        if (isRegionalIndicatorSymbol(iCodePointBefore)) {
            int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount2);
            int iCharCount4 = iCharCount2 - Character.charCount(iCodePointBefore2);
            while (iCharCount4 > 0 && isRegionalIndicatorSymbol(iCodePointBefore2)) {
                iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount4);
                iCharCount4 -= Character.charCount(iCodePointBefore2);
                i12++;
            }
            if (i12 % 2 == 0) {
                iCharCount += 2;
            }
            return i11 - iCharCount;
        }
        if (iCodePointBefore == 8419) {
            int iCodePointBefore3 = Character.codePointBefore(charSequence, iCharCount2);
            int iCharCount5 = iCharCount2 - Character.charCount(iCodePointBefore3);
            if (iCharCount5 > 0 && isVariationSelector(iCodePointBefore3)) {
                int iCodePointBefore4 = Character.codePointBefore(charSequence, iCharCount5);
                if (isKeycapBase(iCodePointBefore4)) {
                    iCharCount += Character.charCount(iCodePointBefore3) + Character.charCount(iCodePointBefore4);
                }
            } else if (isKeycapBase(iCodePointBefore3)) {
                iCharCount += Character.charCount(iCodePointBefore3);
            }
            return i11 - iCharCount;
        }
        if (iCodePointBefore == 917631) {
            iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
            int iCharCount6 = Character.charCount(iCodePointBefore);
            while (true) {
                iCharCount2 -= iCharCount6;
                if (iCharCount2 <= 0 || !isTagSpecChar(iCodePointBefore)) {
                    break;
                }
                iCharCount += Character.charCount(iCodePointBefore);
                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                iCharCount6 = Character.charCount(iCodePointBefore);
            }
            if (!isEmoji(iCodePointBefore)) {
                return i11 - 2;
            }
            iCharCount += Character.charCount(iCodePointBefore);
        }
        if (isVariationSelector(iCodePointBefore)) {
            iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
            if (!isEmoji(iCodePointBefore)) {
                return i11 - iCharCount;
            }
            iCharCount += Character.charCount(iCodePointBefore);
            iCharCount2 -= iCharCount;
        }
        if (isEmoji(iCodePointBefore)) {
            boolean z11 = false;
            int i13 = 0;
            do {
                if (z11) {
                    iCharCount += Character.charCount(iCodePointBefore) + i13 + 1;
                    z11 = false;
                }
                if (!isEmojiModifier(iCodePointBefore)) {
                    if (iCharCount2 > 0) {
                        iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                        iCharCount2 -= Character.charCount(iCodePointBefore);
                        if (iCodePointBefore == 8205) {
                            iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                            iCharCount2 -= Character.charCount(iCodePointBefore);
                            if (iCharCount2 <= 0 || !isVariationSelector(iCodePointBefore)) {
                                i13 = 0;
                            } else {
                                iCodePointBefore = Character.codePointBefore(charSequence, iCharCount2);
                                int iCharCount7 = Character.charCount(iCodePointBefore);
                                iCharCount2 -= Character.charCount(iCodePointBefore);
                                i13 = iCharCount7;
                            }
                            z11 = true;
                        } else {
                            i13 = 0;
                        }
                    } else {
                        i13 = 0;
                    }
                    if (iCharCount2 == 0 || !z11) {
                        break;
                    }
                } else {
                    int iCodePointBefore5 = Character.codePointBefore(charSequence, iCharCount2);
                    int iCharCount8 = iCharCount2 - Character.charCount(iCodePointBefore5);
                    if (iCharCount8 > 0 && isVariationSelector(iCodePointBefore5)) {
                        iCodePointBefore5 = Character.codePointBefore(charSequence, iCharCount8);
                        if (!isEmoji(iCodePointBefore5)) {
                            return i11 - iCharCount;
                        }
                        iCharCount3 = Character.charCount(iCodePointBefore5);
                        Character.charCount(iCodePointBefore5);
                    }
                    if (!isEmojiModifierBase(iCodePointBefore5)) {
                        break;
                    }
                    iCharCount += iCharCount3 + Character.charCount(iCodePointBefore5);
                    break;
                }
            } while (isEmoji(iCodePointBefore));
        }
        return i11 - iCharCount;
    }

    public boolean isEmoji(int i11) {
        return this.flutterJNI.isCodePointEmoji(i11);
    }

    public boolean isEmojiModifier(int i11) {
        return this.flutterJNI.isCodePointEmojiModifier(i11);
    }

    public boolean isEmojiModifierBase(int i11) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i11);
    }

    public boolean isKeycapBase(int i11) {
        return (48 <= i11 && i11 <= 57) || i11 == 35 || i11 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i11) {
        return this.flutterJNI.isCodePointRegionalIndicator(i11);
    }

    public boolean isVariationSelector(int i11) {
        return this.flutterJNI.isCodePointVariantSelector(i11);
    }

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0137 A[PHI: r2 r4
      0x0137: PHI (r2v2 int) = (r2v1 int), (r2v4 int) binds: [B:58:0x00b9, B:81:0x0112] A[DONT_GENERATE, DONT_INLINE]
      0x0137: PHI (r4v2 int) = (r4v1 int), (r4v4 int) binds: [B:58:0x00b9, B:81:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    public int getOffsetAfter(CharSequence charSequence, int i11) {
        int iCharCount;
        int length = charSequence.length();
        int i12 = length - 1;
        if (i11 >= i12) {
            return length;
        }
        int iCodePointAt = Character.codePointAt(charSequence, i11);
        int iCharCount2 = Character.charCount(iCodePointAt);
        int iCharCount3 = i11 + iCharCount2;
        int i13 = 0;
        if (iCharCount3 == 0) {
            return 0;
        }
        if (iCodePointAt == 10) {
            if (Character.codePointAt(charSequence, iCharCount3) == 13) {
                iCharCount2++;
            }
            return i11 + iCharCount2;
        }
        if (isRegionalIndicatorSymbol(iCodePointAt)) {
            if (iCharCount3 < i12 && isRegionalIndicatorSymbol(Character.codePointAt(charSequence, iCharCount3))) {
                int iCharCount4 = i11;
                while (iCharCount4 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i11))) {
                    iCharCount4 -= Character.charCount(Character.codePointBefore(charSequence, i11));
                    i13++;
                }
                if (i13 % 2 == 0) {
                    iCharCount2 += 2;
                }
                return i11 + iCharCount2;
            }
            return iCharCount3;
        }
        if (isKeycapBase(iCodePointAt)) {
            iCharCount2 += Character.charCount(iCodePointAt);
        }
        if (iCodePointAt == 8419) {
            int iCodePointBefore = Character.codePointBefore(charSequence, iCharCount3);
            int iCharCount5 = iCharCount3 + Character.charCount(iCodePointBefore);
            if (iCharCount5 < length && isVariationSelector(iCodePointBefore)) {
                int iCodePointAt2 = Character.codePointAt(charSequence, iCharCount5);
                if (isKeycapBase(iCodePointAt2)) {
                    iCharCount2 += Character.charCount(iCodePointBefore) + Character.charCount(iCodePointAt2);
                }
            } else if (isKeycapBase(iCodePointBefore)) {
                iCharCount2 += Character.charCount(iCodePointBefore);
            }
            return i11 + iCharCount2;
        }
        if (isEmoji(iCodePointAt)) {
            boolean z11 = false;
            int i14 = 0;
            do {
                if (z11) {
                    iCharCount2 += Character.charCount(iCodePointAt) + i14 + 1;
                    z11 = false;
                }
                if (isEmojiModifier(iCodePointAt)) {
                    break;
                }
                if (iCharCount3 < length) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
                    iCharCount3 += Character.charCount(iCodePointAt);
                    if (iCodePointAt == 8419) {
                        int iCodePointBefore2 = Character.codePointBefore(charSequence, iCharCount3);
                        int iCharCount6 = iCharCount3 + Character.charCount(iCodePointBefore2);
                        if (iCharCount6 < length && isVariationSelector(iCodePointBefore2)) {
                            int iCodePointAt3 = Character.codePointAt(charSequence, iCharCount6);
                            if (isKeycapBase(iCodePointAt3)) {
                                iCharCount2 += Character.charCount(iCodePointBefore2) + Character.charCount(iCodePointAt3);
                            }
                        } else if (isKeycapBase(iCodePointBefore2)) {
                            iCharCount2 += Character.charCount(iCodePointBefore2);
                        }
                        return i11 + iCharCount2;
                    }
                    if (isEmojiModifier(iCodePointAt)) {
                        iCharCount = Character.charCount(iCodePointAt);
                    } else if (isVariationSelector(iCodePointAt)) {
                        iCharCount = Character.charCount(iCodePointAt);
                    } else {
                        if (iCodePointAt == 8205) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
                            iCharCount3 += Character.charCount(iCodePointAt);
                            if (iCharCount3 < length && isVariationSelector(iCodePointAt)) {
                                iCodePointAt = Character.codePointAt(charSequence, iCharCount3);
                                int iCharCount7 = Character.charCount(iCodePointAt);
                                iCharCount3 += Character.charCount(iCodePointAt);
                                i14 = iCharCount7;
                            } else {
                                i14 = 0;
                            }
                            z11 = true;
                        } else {
                            i14 = 0;
                        }
                        if (iCharCount3 < length || !z11) {
                            break;
                        }
                    }
                    iCharCount2 += iCharCount;
                    break;
                }
                i14 = 0;
                if (iCharCount3 < length) {
                    break;
                }
            } while (isEmoji(iCodePointAt));
        }
        return i11 + iCharCount2;
    }

    public boolean isTagSpecChar(int i11) {
        if (917536 <= i11 && i11 <= 917630) {
            return true;
        }
        return false;
    }
}
