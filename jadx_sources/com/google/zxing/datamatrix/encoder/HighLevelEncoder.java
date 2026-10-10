package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
public final class HighLevelEncoder {
    static final int ASCII_ENCODATION = 0;
    static final int BASE256_ENCODATION = 5;
    static final int C40_ENCODATION = 1;
    static final char C40_UNLATCH = 254;
    static final int EDIFACT_ENCODATION = 4;
    static final char LATCH_TO_ANSIX12 = 238;
    static final char LATCH_TO_BASE256 = 231;
    static final char LATCH_TO_C40 = 230;
    static final char LATCH_TO_EDIFACT = 240;
    static final char LATCH_TO_TEXT = 239;
    private static final char MACRO_05 = 236;
    private static final String MACRO_05_HEADER = "[)>\u001e05\u001d";
    private static final char MACRO_06 = 237;
    private static final String MACRO_06_HEADER = "[)>\u001e06\u001d";
    private static final String MACRO_TRAILER = "\u001e\u0004";
    private static final char PAD = 129;
    static final int TEXT_ENCODATION = 2;
    static final char UPPER_SHIFT = 235;
    static final int X12_ENCODATION = 3;
    static final char X12_UNLATCH = 254;

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    private static int findMinimums(float[] fArr, int[] iArr, int i11, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i12 = 0; i12 < 6; i12++) {
            int iCeil = (int) Math.ceil(fArr[i12]);
            iArr[i12] = iCeil;
            if (i11 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i11 = iCeil;
            }
            if (i11 == iCeil) {
                bArr[i12] = (byte) (bArr[i12] + 1);
            }
        }
        return i11;
    }

    private static int getMinimumCount(byte[] bArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 += bArr[i12];
        }
        return i11;
    }

    private static boolean isSpecialB256(char c11) {
        return false;
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        int newEncoding = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.setSymbolShape(symbolShapeHint);
        encoderContext.setSizeConstraints(dimension, dimension2);
        if (str.startsWith(MACRO_05_HEADER) && str.endsWith(MACRO_TRAILER)) {
            encoderContext.writeCodeword(MACRO_05);
            encoderContext.setSkipAtEnd(2);
            encoderContext.pos += 7;
        } else if (str.startsWith(MACRO_06_HEADER) && str.endsWith(MACRO_TRAILER)) {
            encoderContext.writeCodeword(MACRO_06);
            encoderContext.setSkipAtEnd(2);
            encoderContext.pos += 7;
        }
        while (encoderContext.hasMoreCharacters()) {
            encoderArr[newEncoding].encode(encoderContext);
            if (encoderContext.getNewEncoding() >= 0) {
                newEncoding = encoderContext.getNewEncoding();
                encoderContext.resetEncoderSignal();
            }
        }
        int codewordCount = encoderContext.getCodewordCount();
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
        if (codewordCount < dataCapacity && newEncoding != 0 && newEncoding != 5 && newEncoding != 4) {
            encoderContext.writeCodeword((char) 254);
        }
        StringBuilder codewords = encoderContext.getCodewords();
        if (codewords.length() < dataCapacity) {
            codewords.append(PAD);
        }
        while (codewords.length() < dataCapacity) {
            codewords.append(randomize253State(PAD, codewords.length() + 1));
        }
        return encoderContext.getCodewords().toString();
    }

    public static boolean isDigit(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    public static boolean isExtendedASCII(char c11) {
        return c11 >= 128 && c11 <= 255;
    }

    private static boolean isNativeC40(char c11) {
        if (c11 == ' ') {
            return true;
        }
        if (c11 < '0' || c11 > '9') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    private static boolean isNativeEDIFACT(char c11) {
        return c11 >= ' ' && c11 <= '^';
    }

    private static boolean isNativeText(char c11) {
        if (c11 == ' ') {
            return true;
        }
        if (c11 < '0' || c11 > '9') {
            return c11 >= 'a' && c11 <= 'z';
        }
        return true;
    }

    private static boolean isX12TermSep(char c11) {
        return c11 == '\r' || c11 == '*' || c11 == '>';
    }

    public static int lookAheadTest(CharSequence charSequence, int i11, int i12) {
        float[] fArr;
        float f11;
        if (i11 >= charSequence.length()) {
            return i12;
        }
        float f12 = 2.0f;
        float f13 = 1.0f;
        int i13 = 5;
        if (i12 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i12] = 0.0f;
        }
        int i14 = 0;
        while (true) {
            int i15 = i11 + i14;
            if (i15 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int iFindMinimums = findMinimums(fArr, iArr, Integer.MAX_VALUE, bArr);
                int minimumCount = getMinimumCount(bArr);
                if (iArr[0] == iFindMinimums) {
                    return 0;
                }
                if (minimumCount == 1 && bArr[i13] > 0) {
                    return i13;
                }
                if (minimumCount == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (minimumCount != 1 || bArr[2] <= 0) {
                    return (minimumCount != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char cCharAt = charSequence.charAt(i15);
            i14++;
            if (isDigit(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f11 = f13;
            } else if (isExtendedASCII(cCharAt)) {
                f11 = f13;
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f12;
            } else {
                f11 = f13;
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f11;
            }
            if (isNativeC40(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (isNativeText(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (isNativeX12(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (isNativeEDIFACT(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (isSpecialB256(cCharAt)) {
                fArr[i13] = fArr[i13] + 4.0f;
            } else {
                fArr[i13] = fArr[i13] + f11;
            }
            if (i14 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                findMinimums(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int minimumCount2 = getMinimumCount(bArr2);
                int i16 = iArr2[0];
                int i17 = iArr2[i13];
                if (i16 < i17 && i16 < iArr2[1] && i16 < iArr2[2] && i16 < iArr2[3] && i16 < iArr2[4]) {
                    return 0;
                }
                if (i17 >= i16) {
                    byte b11 = bArr2[1];
                    byte b12 = bArr2[2];
                    byte b13 = bArr2[3];
                    byte b14 = bArr2[4];
                    if (b11 + b12 + b13 + b14 != 0) {
                        if (minimumCount2 == 1 && b14 > 0) {
                            return 4;
                        }
                        if (minimumCount2 == 1 && b12 > 0) {
                            return 2;
                        }
                        if (minimumCount2 == 1 && b13 > 0) {
                            return 3;
                        }
                        int i18 = iArr2[1];
                        if (i18 + 1 < i16 && i18 + 1 < i17 && i18 + 1 < iArr2[4] && i18 + 1 < iArr2[2]) {
                            int i19 = iArr2[3];
                            if (i18 < i19) {
                                return 1;
                            }
                            if (i18 == i19) {
                                for (int i21 = i11 + i14 + 1; i21 < charSequence.length(); i21++) {
                                    char cCharAt2 = charSequence.charAt(i21);
                                    if (isX12TermSep(cCharAt2)) {
                                        return 3;
                                    }
                                    if (!isNativeX12(cCharAt2)) {
                                        break;
                                    }
                                }
                                return 1;
                            }
                        }
                    }
                }
                return i13;
            }
            f13 = f11;
            i13 = i13;
            f12 = 2.0f;
        }
    }

    private static char randomize253State(char c11, int i11) {
        int i12 = c11 + ((i11 * 149) % ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR) + 1;
        if (i12 > 254) {
            i12 -= 254;
        }
        return (char) i12;
    }

    private HighLevelEncoder() {
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        if (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            while (isDigit(cCharAt) && i11 < length) {
                i12++;
                i11++;
                if (i11 < length) {
                    cCharAt = charSequence.charAt(i11);
                }
            }
        }
        return i12;
    }

    public static void illegalCharacter(char c11) {
        String hexString = Integer.toHexString(c11);
        throw new IllegalArgumentException("Illegal character: " + c11 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    private static boolean isNativeX12(char c11) {
        if (!isX12TermSep(c11) && c11 != ' ') {
            if (c11 < '0' || c11 > '9') {
                if (c11 < 'A' || c11 > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
