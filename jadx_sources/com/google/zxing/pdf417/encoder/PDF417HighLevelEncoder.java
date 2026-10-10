package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes56.dex */
final class PDF417HighLevelEncoder {
    private static final int BYTE_COMPACTION = 1;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED;
    private static final int NUMERIC_COMPACTION = 2;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.DequantizeOptions, 13, 9, BuiltinOptions.GreaterOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.SplitOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.PadV2Options, BuiltinOptions.CastOptions, BuiltinOptions.NegOptions, 61, BuiltinOptions.DepthToSpaceOptions, 0, 32, 0, 0, 0};
    private static final byte[] TEXT_PUNCTUATION_RAW = {BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.LogicalAndOptions, 64, BuiltinOptions.HardSwishOptions, BuiltinOptions.IfOptions, BuiltinOptions.WhileOptions, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.RightShiftOptions, BuiltinOptions.ExpOptions, 13, 9, BuiltinOptions.GreaterOptions, BuiltinOptions.FakeQuantOptions, 10, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SelectOptions, BuiltinOptions.TopKV2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.NegOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, 63, BuiltinOptions.SignOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.MaximumMinimumOptions, 0};
    private static final byte[] PUNCTUATION = new byte[128];
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;

    static {
        int i11 = 0;
        byte[] bArr = new byte[128];
        MIXED = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i12 = 0;
        while (true) {
            byte[] bArr2 = TEXT_MIXED_RAW;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b11 = bArr2[i12];
            if (b11 > 0) {
                MIXED[b11] = (byte) i12;
            }
            i12++;
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        while (true) {
            byte[] bArr3 = TEXT_PUNCTUATION_RAW;
            if (i11 >= bArr3.length) {
                return;
            }
            byte b12 = bArr3[i11];
            if (b12 > 0) {
                PUNCTUATION[b12] = (byte) i11;
            }
            i11++;
        }
    }

    private static void encodeBinary(byte[] bArr, int i11, int i12, int i13, StringBuilder sb2) {
        int i14;
        if (i12 == 1 && i13 == 0) {
            sb2.append((char) 913);
        } else if (i12 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i12 >= 6) {
            char[] cArr = new char[5];
            i14 = i11;
            while ((i11 + i12) - i14 >= 6) {
                long j11 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    j11 = (j11 << 8) + ((long) (bArr[i14 + i15] & 255));
                }
                for (int i16 = 0; i16 < 5; i16++) {
                    cArr[i16] = (char) (j11 % 900);
                    j11 /= 900;
                }
                for (int i17 = 4; i17 >= 0; i17--) {
                    sb2.append(cArr[i17]);
                }
                i14 += 6;
            }
        } else {
            i14 = i11;
        }
        while (i14 < i11 + i12) {
            sb2.append((char) (bArr[i14] & 255));
            i14++;
        }
    }

    /* JADX INFO: renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1 */
    public static /* synthetic */ class C91561 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        static {
            int[] iArr = new int[Compaction.values().length];
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String encodeHighLevel(String str, Compaction compaction, Charset charset) throws WriterException {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb2 = new StringBuilder(str.length());
        if (charset == null) {
            charset = DEFAULT_ENCODING;
        } else if (!DEFAULT_ENCODING.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            encodingECI(characterSetECIByName.getValue(), sb2);
        }
        int length = str.length();
        int i11 = C91561.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[compaction.ordinal()];
        if (i11 == 1) {
            encodeText(str, 0, length, sb2, 0);
        } else if (i11 == 2) {
            byte[] bytes = str.getBytes(charset);
            encodeBinary(bytes, 0, bytes.length, 1, sb2);
        } else if (i11 != 3) {
            int i12 = 0;
            int iEncodeText = 0;
            int i13 = 0;
            while (i12 < length) {
                int iDetermineConsecutiveDigitCount = determineConsecutiveDigitCount(str, i12);
                if (iDetermineConsecutiveDigitCount >= 13) {
                    sb2.append((char) 902);
                    encodeNumeric(str, i12, iDetermineConsecutiveDigitCount, sb2);
                    i12 += iDetermineConsecutiveDigitCount;
                    iEncodeText = 0;
                    i13 = 2;
                } else {
                    int iDetermineConsecutiveTextCount = determineConsecutiveTextCount(str, i12);
                    if (iDetermineConsecutiveTextCount >= 5 || iDetermineConsecutiveDigitCount == length) {
                        if (i13 != 0) {
                            sb2.append((char) 900);
                            iEncodeText = 0;
                            i13 = 0;
                        }
                        iEncodeText = encodeText(str, i12, iDetermineConsecutiveTextCount, sb2, iEncodeText);
                        i12 += iDetermineConsecutiveTextCount;
                    } else {
                        int iDetermineConsecutiveBinaryCount = determineConsecutiveBinaryCount(str, i12, charset);
                        if (iDetermineConsecutiveBinaryCount == 0) {
                            iDetermineConsecutiveBinaryCount = 1;
                        }
                        int i14 = iDetermineConsecutiveBinaryCount + i12;
                        byte[] bytes2 = str.substring(i12, i14).getBytes(charset);
                        if (bytes2.length == 1 && i13 == 0) {
                            encodeBinary(bytes2, 0, 1, 0, sb2);
                        } else {
                            encodeBinary(bytes2, 0, bytes2.length, i13, sb2);
                            i13 = 1;
                            iEncodeText = 0;
                        }
                        i12 = i14;
                    }
                }
            }
        } else {
            sb2.append((char) 902);
            encodeNumeric(str, 0, length, sb2);
        }
        return sb2.toString();
    }

    private static void encodeNumeric(String str, int i11, int i12, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i12 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i13 = 0;
        while (i13 < i12) {
            sb3.setLength(0);
            int iMin = Math.min(44, i12 - i13);
            StringBuilder sb4 = new StringBuilder("1");
            int i14 = i11 + i13;
            sb4.append(str.substring(i14, i14 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i13 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f4 A[EDGE_INSN: B:73:0x00f4->B:55:0x00f4 BREAK  A[LOOP:0: B:3:0x000f->B:90:0x000f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x000f A[SYNTHETIC] */
    private static int encodeText(CharSequence charSequence, int i11, int i12, StringBuilder sb2, int i13) {
        StringBuilder sb3 = new StringBuilder(i12);
        int i14 = i13;
        int i15 = 0;
        while (true) {
            int i16 = i11 + i15;
            char cCharAt = charSequence.charAt(i16);
            if (i14 == 0) {
                if (isAlphaUpper(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt - 'A'));
                    }
                } else if (isAlphaLower(cCharAt)) {
                    sb3.append((char) 27);
                    i14 = 1;
                } else if (isMixed(cCharAt)) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) PUNCTUATION[cCharAt]);
                }
                i15++;
                if (i15 >= i12) {
                    break;
                    break;
                }
            } else {
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (isPunctuation(cCharAt)) {
                            sb3.append((char) PUNCTUATION[cCharAt]);
                        } else {
                            sb3.append((char) 29);
                            i14 = 0;
                        }
                    } else if (isMixed(cCharAt)) {
                        sb3.append((char) MIXED[cCharAt]);
                    } else if (isAlphaUpper(cCharAt)) {
                        sb3.append((char) 28);
                        i14 = 0;
                    } else if (isAlphaLower(cCharAt)) {
                        sb3.append((char) 27);
                        i14 = 1;
                    } else {
                        int i17 = i16 + 1;
                        if (i17 >= i12 || !isPunctuation(charSequence.charAt(i17))) {
                            sb3.append((char) 29);
                            sb3.append((char) PUNCTUATION[cCharAt]);
                        } else {
                            sb3.append((char) 25);
                            i14 = 3;
                        }
                    }
                } else if (isAlphaLower(cCharAt)) {
                    if (cCharAt == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (cCharAt - 'a'));
                    }
                } else if (isAlphaUpper(cCharAt)) {
                    sb3.append((char) 27);
                    sb3.append((char) (cCharAt - 'A'));
                } else if (isMixed(cCharAt)) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) PUNCTUATION[cCharAt]);
                }
                i15++;
                if (i15 >= i12) {
                    break;
                }
            }
        }
        int length = sb3.length();
        char cCharAt2 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            if (i18 % 2 != 0) {
                cCharAt2 = (char) ((cCharAt2 * 30) + sb3.charAt(i18));
                sb2.append(cCharAt2);
            } else {
                cCharAt2 = sb3.charAt(i18);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((cCharAt2 * 30) + 29));
        }
        return i14;
    }

    private static void encodingECI(int i11, StringBuilder sb2) throws WriterException {
        if (i11 >= 0 && i11 < 900) {
            sb2.append((char) 927);
            sb2.append((char) i11);
        } else if (i11 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i11 / 900) - 1));
            sb2.append((char) (i11 % 900));
        } else {
            if (i11 >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i11)));
            }
            sb2.append((char) 925);
            sb2.append((char) (810900 - i11));
        }
    }

    private static boolean isAlphaLower(char c11) {
        if (c11 != ' ') {
            return c11 >= 'a' && c11 <= 'z';
        }
        return true;
    }

    private static boolean isAlphaUpper(char c11) {
        if (c11 != ' ') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    private static boolean isDigit(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    private static boolean isMixed(char c11) {
        return MIXED[c11] != -1;
    }

    private static boolean isPunctuation(char c11) {
        return PUNCTUATION[c11] != -1;
    }

    private static boolean isText(char c11) {
        if (c11 == '\t' || c11 == '\n' || c11 == '\r') {
            return true;
        }
        return c11 >= ' ' && c11 <= '~';
    }

    private PDF417HighLevelEncoder() {
    }

    private static int determineConsecutiveBinaryCount(String str, int i11, Charset charset) throws WriterException {
        int i12;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        int length = str.length();
        int i13 = i11;
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            int i14 = 0;
            while (i14 < 13 && isDigit(cCharAt) && (i12 = i13 + (i14 = i14 + 1)) < length) {
                cCharAt = str.charAt(i12);
            }
            if (i14 >= 13) {
                return i13 - i11;
            }
            char cCharAt2 = str.charAt(i13);
            if (charsetEncoderNewEncoder.canEncode(cCharAt2)) {
                i13++;
            } else {
                throw new WriterException("Non-encodable character detected: " + cCharAt2 + " (Unicode: " + ((int) cCharAt2) + ')');
            }
        }
        return i13 - i11;
    }

    private static int determineConsecutiveDigitCount(CharSequence charSequence, int i11) {
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

    private static int determineConsecutiveTextCount(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        int i12 = i11;
        while (i12 < length) {
            char cCharAt = charSequence.charAt(i12);
            int i13 = 0;
            while (i13 < 13 && isDigit(cCharAt) && i12 < length) {
                i13++;
                i12++;
                if (i12 < length) {
                    cCharAt = charSequence.charAt(i12);
                }
            }
            if (i13 >= 13) {
                return (i12 - i11) - i13;
            }
            if (i13 <= 0) {
                if (!isText(charSequence.charAt(i12))) {
                    break;
                }
                i12++;
            }
        }
        return i12 - i11;
    }
}
