package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    private static void toIntArray(int i11, int[] iArr) {
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = 1;
            if (((1 << (8 - i12)) & i11) != 0) {
                i13 = 2;
            }
            iArr[i12] = i13;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.encode(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    private static String tryToConvertToExtendedMode(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != 0) {
                if (cCharAt != ' ') {
                    if (cCharAt != '@') {
                        if (cCharAt != '`') {
                            if (cCharAt != '-' && cCharAt != '.') {
                                if (cCharAt <= 26) {
                                    sb2.append(Typography.dollar);
                                    sb2.append((char) (cCharAt + '@'));
                                } else if (cCharAt < ' ') {
                                    sb2.append('%');
                                    sb2.append((char) (cCharAt + Typography.amp));
                                } else if (cCharAt > ',' && cCharAt != '/' && cCharAt != ':') {
                                    if (cCharAt <= '9') {
                                        sb2.append(cCharAt);
                                    } else if (cCharAt <= '?') {
                                        sb2.append('%');
                                        sb2.append((char) (cCharAt + 11));
                                    } else if (cCharAt <= 'Z') {
                                        sb2.append(cCharAt);
                                    } else if (cCharAt <= '_') {
                                        sb2.append('%');
                                        sb2.append((char) (cCharAt - 16));
                                    } else if (cCharAt <= 'z') {
                                        sb2.append('+');
                                        sb2.append((char) (cCharAt - ' '));
                                    } else if (cCharAt <= 127) {
                                        sb2.append('%');
                                        sb2.append((char) (cCharAt - '+'));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i11) + "'");
                                    }
                                } else {
                                    sb2.append('/');
                                    sb2.append((char) (cCharAt + ' '));
                                }
                            } else {
                                sb2.append(cCharAt);
                            }
                        } else {
                            sb2.append("%W");
                        }
                    } else {
                        sb2.append("%V");
                    }
                } else {
                    sb2.append(cCharAt);
                }
            } else {
                sb2.append("%U");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            for (int i11 = 0; i11 < length; i11++) {
                if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11)) < 0) {
                    str = tryToConvertToExtendedMode(str);
                    length = str.length();
                    if (length <= 80) {
                        break;
                    }
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            }
            int[] iArr = new int[9];
            int i12 = length + 25;
            for (int i13 = 0; i13 < length; i13++) {
                toIntArray(Code39Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i13))], iArr);
                for (int i14 = 0; i14 < 9; i14++) {
                    i12 += iArr[i14];
                }
            }
            boolean[] zArr = new boolean[i12];
            toIntArray(BuiltinOperator.RANDOM_UNIFORM, iArr);
            int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int iAppendPattern2 = iAppendPattern + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr2, false);
            for (int i15 = 0; i15 < length; i15++) {
                toIntArray(Code39Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i15))], iArr);
                int iAppendPattern3 = iAppendPattern2 + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
                iAppendPattern2 = iAppendPattern3 + OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern3, iArr2, false);
            }
            toIntArray(BuiltinOperator.RANDOM_UNIFORM, iArr);
            OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
